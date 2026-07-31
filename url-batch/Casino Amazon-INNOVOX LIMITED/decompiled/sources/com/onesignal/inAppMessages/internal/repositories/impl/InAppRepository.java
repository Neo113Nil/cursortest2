package com.onesignal.inAppMessages.internal.repositories.impl;

import android.content.ContentValues;
import com.onesignal.core.internal.database.IDatabaseProvider;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.inAppMessages.internal.InAppMessage;
import com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController;
import com.onesignal.inAppMessages.internal.repositories.IInAppRepository;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* compiled from: InAppRepository.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\nH\u0096@¢\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0096@¢\u0006\u0002\u0010\u000bJ\u0016\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/onesignal/inAppMessages/internal/repositories/impl/InAppRepository;", "Lcom/onesignal/inAppMessages/internal/repositories/IInAppRepository;", "_databaseProvider", "Lcom/onesignal/core/internal/database/IDatabaseProvider;", "_time", "Lcom/onesignal/core/internal/time/ITime;", "_prefs", "Lcom/onesignal/inAppMessages/internal/preferences/IInAppPreferencesController;", "(Lcom/onesignal/core/internal/database/IDatabaseProvider;Lcom/onesignal/core/internal/time/ITime;Lcom/onesignal/inAppMessages/internal/preferences/IInAppPreferencesController;)V", "cleanCachedInAppMessages", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listInAppMessages", "", "Lcom/onesignal/inAppMessages/internal/InAppMessage;", "saveInAppMessage", "inAppMessage", "(Lcom/onesignal/inAppMessages/internal/InAppMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InAppRepository implements IInAppRepository {
    public static final long IAM_CACHE_DATA_LIFETIME = 15552000;
    private final IDatabaseProvider _databaseProvider;
    private final IInAppPreferencesController _prefs;
    private final ITime _time;

    public InAppRepository(IDatabaseProvider _databaseProvider, ITime _time, IInAppPreferencesController _prefs) {
        Intrinsics.checkNotNullParameter(_databaseProvider, "_databaseProvider");
        Intrinsics.checkNotNullParameter(_time, "_time");
        Intrinsics.checkNotNullParameter(_prefs, "_prefs");
        this._databaseProvider = _databaseProvider;
        this._time = _time;
        this._prefs = _prefs;
    }

    @Override // com.onesignal.inAppMessages.internal.repositories.IInAppRepository
    public Object saveInAppMessage(InAppMessage inAppMessage, Continuation<? super Unit> continuation) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_id", inAppMessage.getMessageId());
        contentValues.put(OneSignalDbContract.InAppMessageTable.COLUMN_NAME_DISPLAY_QUANTITY, Boxing.boxInt(inAppMessage.getRedisplayStats().getDisplayQuantity()));
        contentValues.put(OneSignalDbContract.InAppMessageTable.COLUMN_NAME_LAST_DISPLAY, Boxing.boxLong(inAppMessage.getRedisplayStats().getLastDisplayTime()));
        contentValues.put(OneSignalDbContract.InAppMessageTable.COLUMN_CLICK_IDS, inAppMessage.getClickedClickIds().toString());
        contentValues.put(OneSignalDbContract.InAppMessageTable.COLUMN_DISPLAYED_IN_SESSION, Boxing.boxBoolean(inAppMessage.getDisplayedInSession()));
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new InAppRepository$saveInAppMessage$2(this, contentValues, inAppMessage, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.onesignal.inAppMessages.internal.repositories.IInAppRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listInAppMessages(Continuation<? super List<InAppMessage>> continuation) {
        InAppRepository$listInAppMessages$1 inAppRepository$listInAppMessages$1;
        int i;
        if (continuation instanceof InAppRepository$listInAppMessages$1) {
            inAppRepository$listInAppMessages$1 = (InAppRepository$listInAppMessages$1) continuation;
            if ((inAppRepository$listInAppMessages$1.label & Integer.MIN_VALUE) != 0) {
                inAppRepository$listInAppMessages$1.label -= Integer.MIN_VALUE;
                Object obj = inAppRepository$listInAppMessages$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inAppRepository$listInAppMessages$1.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list = (List) inAppRepository$listInAppMessages$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    return list;
                }
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                CoroutineDispatcher io2 = Dispatchers.getIO();
                InAppRepository$listInAppMessages$2 inAppRepository$listInAppMessages$2 = new InAppRepository$listInAppMessages$2(this, arrayList, null);
                inAppRepository$listInAppMessages$1.L$0 = arrayList;
                inAppRepository$listInAppMessages$1.label = 1;
                return BuildersKt.withContext(io2, inAppRepository$listInAppMessages$2, inAppRepository$listInAppMessages$1) == coroutine_suspended ? coroutine_suspended : arrayList;
            }
        }
        inAppRepository$listInAppMessages$1 = new InAppRepository$listInAppMessages$1(this, continuation);
        Object obj2 = inAppRepository$listInAppMessages$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inAppRepository$listInAppMessages$1.label;
        if (i == 0) {
        }
    }

    @Override // com.onesignal.inAppMessages.internal.repositories.IInAppRepository
    public Object cleanCachedInAppMessages(Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new InAppRepository$cleanCachedInAppMessages$2(this, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}
