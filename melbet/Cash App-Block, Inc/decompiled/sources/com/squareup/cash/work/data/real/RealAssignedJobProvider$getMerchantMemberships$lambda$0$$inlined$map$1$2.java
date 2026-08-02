package com.squareup.cash.work.data.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import com.squareup.cash.work.presenters.providers.RealAssignedLocationProvider$getLocationIds$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.work.tinygraph.models.EntityReference;
import com.squareup.cash.work.tinygraph.models.Membership;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealAssignedJobProvider$getMerchantMemberships$lambda$0$$inlined$map$1$2 implements FlowCollector {
    public final /* synthetic */ MerchantIdentifier $merchantIdentifier$inlined;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;

    /* renamed from: com.squareup.cash.work.data.real.RealAssignedJobProvider$getMerchantMemberships$lambda$0$$inlined$map$1$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= PKIFailureInfo.systemUnavail;
            return RealAssignedJobProvider$getMerchantMemberships$lambda$0$$inlined$map$1$2.this.emit(null, this);
        }
    }

    public /* synthetic */ RealAssignedJobProvider$getMerchantMemberships$lambda$0$$inlined$map$1$2(FlowCollector flowCollector, MerchantIdentifier merchantIdentifier, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
        this.$merchantIdentifier$inlined = merchantIdentifier;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a1  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        RealAssignedLocationProvider$getLocationIds$lambda$0$$inlined$map$1$2$1 realAssignedLocationProvider$getLocationIds$lambda$0$$inlined$map$1$2$1;
        int i2;
        int i3 = this.$r8$classId;
        MerchantIdentifier merchantIdentifier = this.$merchantIdentifier$inlined;
        FlowCollector flowCollector = this.$this_unsafeFlow;
        switch (i3) {
            case 0:
                if (continuation instanceof AnonymousClass1) {
                    anonymousClass1 = (AnonymousClass1) continuation;
                    int i4 = anonymousClass1.label;
                    if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                        anonymousClass1.label = i4 - PKIFailureInfo.systemUnavail;
                        Object obj2 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            ArrayList arrayList = new ArrayList();
                            for (Object obj3 : (List) obj) {
                                EntityReference entityReference = ((Membership) obj3).merchantId;
                                if (Intrinsics.areEqual(entityReference != null ? entityReference.id : null, merchantIdentifier != null ? merchantIdentifier.entityId : null)) {
                                    arrayList.add(obj3);
                                }
                            }
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(arrayList, anonymousClass1) == coroutineSingletons) {
                                break;
                            }
                        } else if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj2);
                        }
                        break;
                    }
                }
                anonymousClass1 = new AnonymousClass1(continuation);
                Object obj22 = anonymousClass1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                }
            default:
                if (continuation instanceof RealAssignedLocationProvider$getLocationIds$lambda$0$$inlined$map$1$2$1) {
                    realAssignedLocationProvider$getLocationIds$lambda$0$$inlined$map$1$2$1 = (RealAssignedLocationProvider$getLocationIds$lambda$0$$inlined$map$1$2$1) continuation;
                    int i5 = realAssignedLocationProvider$getLocationIds$lambda$0$$inlined$map$1$2$1.label;
                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                        realAssignedLocationProvider$getLocationIds$lambda$0$$inlined$map$1$2$1.label = i5 - PKIFailureInfo.systemUnavail;
                        Object obj4 = realAssignedLocationProvider$getLocationIds$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = realAssignedLocationProvider$getLocationIds$lambda$0$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj4);
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj5 : (List) obj) {
                                EntityReference entityReference2 = ((Membership) obj5).merchantId;
                                if (Intrinsics.areEqual(entityReference2 != null ? entityReference2.id : null, merchantIdentifier != null ? merchantIdentifier.entityId : null)) {
                                    arrayList2.add(obj5);
                                }
                            }
                            realAssignedLocationProvider$getLocationIds$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(arrayList2, realAssignedLocationProvider$getLocationIds$lambda$0$$inlined$map$1$2$1) == coroutineSingletons3) {
                                break;
                            }
                        } else if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj4);
                        }
                        break;
                    }
                }
                realAssignedLocationProvider$getLocationIds$lambda$0$$inlined$map$1$2$1 = new RealAssignedLocationProvider$getLocationIds$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj42 = realAssignedLocationProvider$getLocationIds$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = realAssignedLocationProvider$getLocationIds$lambda$0$$inlined$map$1$2$1.label;
                if (i2 != 0) {
                }
        }
        return Unit.INSTANCE;
    }
}
