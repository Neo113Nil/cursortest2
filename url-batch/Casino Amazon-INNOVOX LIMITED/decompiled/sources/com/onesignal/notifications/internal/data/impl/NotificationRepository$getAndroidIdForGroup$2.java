package com.onesignal.notifications.internal.data.impl;

import com.onesignal.core.internal.database.ICursor;
import com.onesignal.core.internal.database.IDatabase;
import com.onesignal.core.internal.database.IDatabaseProvider;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NotificationRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$getAndroidIdForGroup$2", f = "NotificationRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class NotificationRepository$getAndroidIdForGroup$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<Integer> $recentId;
    final /* synthetic */ String[] $whereArgs;
    final /* synthetic */ Ref.ObjectRef<String> $whereStr;
    int label;
    final /* synthetic */ NotificationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationRepository$getAndroidIdForGroup$2(NotificationRepository notificationRepository, Ref.ObjectRef<String> objectRef, String[] strArr, Ref.ObjectRef<Integer> objectRef2, Continuation<? super NotificationRepository$getAndroidIdForGroup$2> continuation) {
        super(2, continuation);
        this.this$0 = notificationRepository;
        this.$whereStr = objectRef;
        this.$whereArgs = strArr;
        this.$recentId = objectRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NotificationRepository$getAndroidIdForGroup$2(this.this$0, this.$whereStr, this.$whereArgs, this.$recentId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NotificationRepository$getAndroidIdForGroup$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IDatabaseProvider iDatabaseProvider;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            iDatabaseProvider = this.this$0._databaseProvider;
            IDatabase os = iDatabaseProvider.getOs();
            String[] strArr = {OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID};
            String str = this.$whereStr.element;
            String[] strArr2 = this.$whereArgs;
            final Ref.ObjectRef<Integer> objectRef = this.$recentId;
            IDatabase.DefaultImpls.query$default(os, OneSignalDbContract.NotificationTable.TABLE_NAME, strArr, str, strArr2, null, null, "created_time DESC", "1", new Function1<ICursor, Unit>() { // from class: com.onesignal.notifications.internal.data.impl.NotificationRepository$getAndroidIdForGroup$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ICursor iCursor) {
                    invoke2(iCursor);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ICursor it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    boolean moveToFirst = it.moveToFirst();
                    objectRef.element = !moveToFirst ? 0 : Integer.valueOf(it.getInt(OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID));
                }
            }, 48, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
