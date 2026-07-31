package com.onesignal.session.internal.outcomes.impl;

import android.content.ContentValues;
import com.onesignal.core.internal.database.IDatabaseProvider;
import com.onesignal.session.internal.influence.InfluenceType;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONArray;

/* compiled from: OutcomeEventsRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroid/content/ContentValues;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository$saveOutcomeEvent$2", f = "OutcomeEventsRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class OutcomeEventsRepository$saveOutcomeEvent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ContentValues>, Object> {
    final /* synthetic */ OutcomeEventParams $eventParams;
    int label;
    final /* synthetic */ OutcomeEventsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OutcomeEventsRepository$saveOutcomeEvent$2(OutcomeEventParams outcomeEventParams, OutcomeEventsRepository outcomeEventsRepository, Continuation<? super OutcomeEventsRepository$saveOutcomeEvent$2> continuation) {
        super(2, continuation);
        this.$eventParams = outcomeEventParams;
        this.this$0 = outcomeEventsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OutcomeEventsRepository$saveOutcomeEvent$2(this.$eventParams, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ContentValues> continuation) {
        return ((OutcomeEventsRepository$saveOutcomeEvent$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, com.onesignal.session.internal.influence.InfluenceType] */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, com.onesignal.session.internal.influence.InfluenceType] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r3v9, types: [T, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, com.onesignal.session.internal.influence.InfluenceType] */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r4v6, types: [T, com.onesignal.session.internal.influence.InfluenceType] */
    /* JADX WARN: Type inference failed for: r5v3, types: [T, com.onesignal.session.internal.influence.InfluenceType] */
    /* JADX WARN: Type inference failed for: r5v5, types: [T, com.onesignal.session.internal.influence.InfluenceType] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IDatabaseProvider iDatabaseProvider;
        OutcomeSourceBody indirectBody;
        OutcomeSourceBody directBody;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new JSONArray();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = new JSONArray();
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        objectRef3.element = InfluenceType.UNATTRIBUTED;
        Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
        objectRef4.element = InfluenceType.UNATTRIBUTED;
        OutcomeSource outcomeSource = this.$eventParams.getOutcomeSource();
        if (outcomeSource != null && (directBody = outcomeSource.getDirectBody()) != null) {
            ?? notificationIds = directBody.getNotificationIds();
            if (notificationIds != 0 && notificationIds.length() > 0) {
                objectRef3.element = InfluenceType.DIRECT;
                objectRef.element = notificationIds;
            }
            ?? inAppMessagesIds = directBody.getInAppMessagesIds();
            if (inAppMessagesIds != 0 && inAppMessagesIds.length() > 0) {
                objectRef4.element = InfluenceType.DIRECT;
                objectRef2.element = inAppMessagesIds;
            }
        }
        OutcomeSource outcomeSource2 = this.$eventParams.getOutcomeSource();
        if (outcomeSource2 != null && (indirectBody = outcomeSource2.getIndirectBody()) != null) {
            ?? notificationIds2 = indirectBody.getNotificationIds();
            if (notificationIds2 != 0 && notificationIds2.length() > 0) {
                objectRef3.element = InfluenceType.INDIRECT;
                objectRef.element = notificationIds2;
            }
            ?? inAppMessagesIds2 = indirectBody.getInAppMessagesIds();
            if (inAppMessagesIds2 != 0 && inAppMessagesIds2.length() > 0) {
                objectRef4.element = InfluenceType.INDIRECT;
                objectRef2.element = inAppMessagesIds2;
            }
        }
        ContentValues contentValues = new ContentValues();
        OutcomeEventParams outcomeEventParams = this.$eventParams;
        contentValues.put("notification_ids", ((JSONArray) objectRef.element).toString());
        contentValues.put(OutcomeEventsTable.COLUMN_NAME_IAM_IDS, ((JSONArray) objectRef2.element).toString());
        String influenceType = ((InfluenceType) objectRef3.element).toString();
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = influenceType.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        contentValues.put(OutcomeEventsTable.COLUMN_NAME_NOTIFICATION_INFLUENCE_TYPE, lowerCase);
        String influenceType2 = ((InfluenceType) objectRef4.element).toString();
        Locale ROOT2 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT2, "ROOT");
        String lowerCase2 = influenceType2.toLowerCase(ROOT2);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        contentValues.put(OutcomeEventsTable.COLUMN_NAME_IAM_INFLUENCE_TYPE, lowerCase2);
        contentValues.put("name", outcomeEventParams.getOutcomeId());
        contentValues.put("weight", Boxing.boxFloat(outcomeEventParams.getWeight()));
        contentValues.put("timestamp", Boxing.boxLong(outcomeEventParams.getTimestamp()));
        contentValues.put("session_time", Boxing.boxLong(outcomeEventParams.getSessionTime()));
        iDatabaseProvider = this.this$0._databaseProvider;
        iDatabaseProvider.getOs().insert("outcome", null, contentValues);
        return contentValues;
    }
}
