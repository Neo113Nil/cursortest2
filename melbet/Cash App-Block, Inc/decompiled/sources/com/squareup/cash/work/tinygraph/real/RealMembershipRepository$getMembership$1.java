package com.squareup.cash.work.tinygraph.real;

import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.work.tinygraph.models.EntityReference;
import com.squareup.cash.work.tinygraph.models.EntityType;
import com.squareup.cash.work.tinygraph.models.Membership;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealMembershipRepository$getMembership$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ String $fromId;
    public final /* synthetic */ EntityType $fromType;
    public final /* synthetic */ String $toId;
    public final /* synthetic */ EntityType $toType;
    public final /* synthetic */ RealMembershipRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealMembershipRepository$getMembership$1(RealMembershipRepository realMembershipRepository, EntityType entityType, String str, EntityType entityType2, String str2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = realMembershipRepository;
        this.$fromType = entityType;
        this.$fromId = str;
        this.$toType = entityType2;
        this.$toId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RealMembershipRepository$getMembership$1(this.this$0, this.$fromType, this.$fromId, this.$toType, this.$toId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((RealMembershipRepository$getMembership$1) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        JCAContext jCAContext = this.this$0.dao;
        jCAContext.getClass();
        EntityType entityType = this.$fromType;
        entityType.getClass();
        String str = this.$fromId;
        str.getClass();
        EntityType entityType2 = this.$toType;
        entityType2.getClass();
        String str2 = this.$toId;
        str2.getClass();
        Iterator it = jCAContext.getAll().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            Membership membership = (Membership) obj2;
            EntityReference entityReference = membership.fromReference;
            if (entityReference.entityType == entityType && Intrinsics.areEqual(entityReference.id, str)) {
                EntityReference entityReference2 = membership.toReference;
                if (entityReference2.entityType == entityType2 && Intrinsics.areEqual(entityReference2.id, str2)) {
                    break;
                }
            }
        }
        return (Membership) obj2;
    }
}
