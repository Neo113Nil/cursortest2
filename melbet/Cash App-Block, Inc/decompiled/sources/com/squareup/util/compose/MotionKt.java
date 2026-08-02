package com.squareup.util.compose;

import android.content.Context;
import android.provider.Settings;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import com.datadog.android.rum.model.ViewEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import com.squareup.cash.clientsync.pipeline.SyncRequestOperation;
import com.squareup.cash.clientsync.pipeline.SyncResponseOperation;
import com.squareup.cash.clientsync.pipeline.SyncScope;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public abstract class MotionKt {
    public static final boolean access$isFullSync(SyncRequestOperation.Result result) {
        boolean isFullSync;
        if (result.getSyncRequestOperation().scope instanceof SyncScope.Global) {
            if (result instanceof SyncRequestOperation.Result.Success) {
                isFullSync = isFullSync(((SyncRequestOperation.Result.Success) result).syncResponseOperationResults);
            } else if (result instanceof SyncRequestOperation.Result.Skipped) {
                isFullSync = false;
            } else if (result instanceof SyncRequestOperation.Result.Failure) {
                isFullSync = isFullSync(((SyncRequestOperation.Result.Failure) result).syncResponseOperationResults);
            } else {
                Drop$$ExternalSyntheticBUOutline0.m1m();
            }
            if (isFullSync) {
                return true;
            }
        }
        return false;
    }

    public static ViewEvent.PreviousRect fromJsonObject(JsonObject jsonObject) {
        try {
            Number asNumber = jsonObject.get("x").getAsNumber();
            Number asNumber2 = jsonObject.get("y").getAsNumber();
            Number asNumber3 = jsonObject.get("width").getAsNumber();
            Number asNumber4 = jsonObject.get("height").getAsNumber();
            asNumber.getClass();
            asNumber2.getClass();
            asNumber3.getClass();
            asNumber4.getClass();
            return new ViewEvent.PreviousRect(asNumber, asNumber2, asNumber3, asNumber4);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type PreviousRect", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type PreviousRect", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type PreviousRect", e3);
            return null;
        }
    }

    public static final boolean isFullSync(List list) {
        SyncResponseOperation syncResponseOperation;
        List list2;
        SyncResponseOperation.Result result = (SyncResponseOperation.Result) CollectionsKt.firstOrNull(list);
        if (result == null || (syncResponseOperation = result.syncResponseOperation) == null) {
            return false;
        }
        SyncResponseOperation.Origin origin = syncResponseOperation.origin;
        SyncResponseOperation.Origin.FromSyncRequest fromSyncRequest = origin instanceof SyncResponseOperation.Origin.FromSyncRequest ? (SyncResponseOperation.Origin.FromSyncRequest) origin : null;
        return (fromSyncRequest == null || (list2 = fromSyncRequest.requestRanges) == null || !list2.isEmpty()) ? false : true;
    }

    public static final MutableState produceAnimationsEnabled(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
        Object rememberedValue = gapComposer.rememberedValue();
        int i = 0;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Boolean.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) > RecyclerView.DECELERATION_RATE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Boolean bool = (Boolean) rememberedValue;
        bool.getClass();
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new MotionKt$produceAnimationsEnabled$1$1(2, (Continuation) null, i);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        return Updater.produceState(gapComposer, bool, (Function2) rememberedValue2);
    }
}
