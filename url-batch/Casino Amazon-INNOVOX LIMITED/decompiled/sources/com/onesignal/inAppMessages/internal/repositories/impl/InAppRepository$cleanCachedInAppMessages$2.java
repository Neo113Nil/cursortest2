package com.onesignal.inAppMessages.internal.repositories.impl;

import com.onesignal.common.JSONUtils;
import com.onesignal.core.internal.database.ICursor;
import com.onesignal.core.internal.database.IDatabase;
import com.onesignal.core.internal.database.IDatabaseProvider;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController;
import java.util.LinkedHashSet;
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
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: InAppRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.inAppMessages.internal.repositories.impl.InAppRepository$cleanCachedInAppMessages$2", f = "InAppRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class InAppRepository$cleanCachedInAppMessages$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ InAppRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InAppRepository$cleanCachedInAppMessages$2(InAppRepository inAppRepository, Continuation<? super InAppRepository$cleanCachedInAppMessages$2> continuation) {
        super(2, continuation);
        this.this$0 = inAppRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InAppRepository$cleanCachedInAppMessages$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InAppRepository$cleanCachedInAppMessages$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IDatabaseProvider iDatabaseProvider;
        IInAppPreferencesController iInAppPreferencesController;
        IInAppPreferencesController iInAppPreferencesController2;
        IDatabaseProvider iDatabaseProvider2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String[] strArr = {"message_id", OneSignalDbContract.InAppMessageTable.COLUMN_CLICK_IDS};
        String[] strArr2 = {String.valueOf((System.currentTimeMillis() / 1000) - InAppRepository.IAM_CACHE_DATA_LIFETIME)};
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        try {
            iDatabaseProvider2 = this.this$0._databaseProvider;
            IDatabase.DefaultImpls.query$default(iDatabaseProvider2.getOs(), OneSignalDbContract.InAppMessageTable.TABLE_NAME, strArr, "last_display < ?", strArr2, null, null, null, null, new Function1<ICursor, Unit>() { // from class: com.onesignal.inAppMessages.internal.repositories.impl.InAppRepository$cleanCachedInAppMessages$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ICursor iCursor) {
                    invoke2(iCursor);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ICursor it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    if (it.getCount() == 0) {
                        Logging.debug$default("Attempted to clean 6 month old IAM data, but none exists!", null, 2, null);
                        return;
                    }
                    if (it.moveToFirst()) {
                        do {
                            String string = it.getString("message_id");
                            String string2 = it.getString(OneSignalDbContract.InAppMessageTable.COLUMN_CLICK_IDS);
                            linkedHashSet.add(string);
                            linkedHashSet2.addAll(JSONUtils.INSTANCE.newStringSetFromJSONArray(new JSONArray(string2)));
                        } while (it.moveToNext());
                    }
                }
            }, 240, null);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        iDatabaseProvider = this.this$0._databaseProvider;
        iDatabaseProvider.getOs().delete(OneSignalDbContract.InAppMessageTable.TABLE_NAME, "last_display < ?", strArr2);
        iInAppPreferencesController = this.this$0._prefs;
        iInAppPreferencesController.cleanInAppMessageIds(linkedHashSet);
        iInAppPreferencesController2 = this.this$0._prefs;
        iInAppPreferencesController2.cleanInAppMessageClickedClickIds(linkedHashSet2);
        return Unit.INSTANCE;
    }
}
