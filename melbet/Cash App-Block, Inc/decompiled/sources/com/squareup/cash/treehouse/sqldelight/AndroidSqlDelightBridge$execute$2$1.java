package com.squareup.cash.treehouse.sqldelight;

import android.database.Cursor;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.protos.cash.api.Error;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class AndroidSqlDelightBridge$execute$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ List $args;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String $sql;
    public final /* synthetic */ AndroidSqlDelightBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidSqlDelightBridge$execute$2$1(AndroidSqlDelightBridge androidSqlDelightBridge, String str, List list, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = androidSqlDelightBridge;
        this.$sql = str;
        this.$args = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new AndroidSqlDelightBridge$execute$2$1(this.this$0, this.$sql, this.$args, continuation, 0);
            default:
                return new AndroidSqlDelightBridge$execute$2$1(this.this$0, this.$sql, this.$args, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((AndroidSqlDelightBridge$execute$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        List list = this.$args;
        String str = this.$sql;
        AndroidSqlDelightBridge androidSqlDelightBridge = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Error.Code.Companion.access$bindArgs(androidSqlDelightBridge.database.compileStatement(str), list);
                return new Long(r3.executeUpdateDelete());
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ToolbarTuckTargets toolbarTuckTargets = new ToolbarTuckTargets();
                str.getClass();
                list.getClass();
                toolbarTuckTargets.startCornerCenterX$delegate = str;
                toolbarTuckTargets.endCornerCenterX$delegate = list;
                Cursor query = androidSqlDelightBridge.database.query(toolbarTuckTargets);
                try {
                    ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    while (query.moveToNext()) {
                        createListBuilder.add(ToolbarTuckTargets.getRow(query));
                    }
                    ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
                    query.close();
                    return build;
                } finally {
                }
        }
    }
}
