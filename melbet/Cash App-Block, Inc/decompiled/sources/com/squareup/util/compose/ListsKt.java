package com.squareup.util.compose;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import com.datadog.android.rum.model.ViewEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.common.cashsearch.EntityType;
import com.squareup.util.android.ShareModule$Companion;
import com.squareup.util.android.StrictModes;
import com.squareup.util.android.StringsKt;
import com.squareup.util.android.layout.LayoutHelpersKt;
import com.squareup.util.cash.ImagesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public abstract class ListsKt {
    public static final EntityType access$toSearchEntityType(SyncEntityType syncEntityType) {
        if (Intrinsics.areEqual(syncEntityType, AndroidSyncValueSpecs.Payment.entityType)) {
            return EntityType.PAYMENT;
        }
        if (Intrinsics.areEqual(syncEntityType, AndroidSyncValueSpecs.Transaction.entityType)) {
            return EntityType.TRANSACTION;
        }
        if (Intrinsics.areEqual(syncEntityType, AndroidSyncValueSpecs.Transfer.entityType)) {
            return EntityType.TRANSFER;
        }
        if (Intrinsics.areEqual(syncEntityType, AndroidSyncValueSpecs.LoanActivity.entityType)) {
            return EntityType.LOAN_ACTIVITY;
        }
        if (Intrinsics.areEqual(syncEntityType, AndroidSyncValueSpecs.SponsoredAccount.entityType)) {
            return EntityType.SPONSORED_ACCOUNT;
        }
        Path$$ExternalSyntheticBUOutline0.m$1(syncEntityType, "Unsupported entity type: ");
        return null;
    }

    public static ViewEvent.Performance fromJsonObject(JsonObject jsonObject) {
        JsonObject asJsonObject;
        JsonObject asJsonObject2;
        JsonObject asJsonObject3;
        JsonObject asJsonObject4;
        JsonObject asJsonObject5;
        JsonObject asJsonObject6;
        try {
            JsonElement jsonElement = jsonObject.get("cls");
            ViewEvent.PerformanceCls fromJsonObject = (jsonElement == null || (asJsonObject6 = jsonElement.getAsJsonObject()) == null) ? null : ModifierKt.fromJsonObject(asJsonObject6);
            JsonElement jsonElement2 = jsonObject.get("fcp");
            ViewEvent.Fcp fromJsonObject2 = (jsonElement2 == null || (asJsonObject5 = jsonElement2.getAsJsonObject()) == null) ? null : StrictModes.fromJsonObject(asJsonObject5);
            JsonElement jsonElement3 = jsonObject.get("fid");
            ViewEvent.Fid fromJsonObject3 = (jsonElement3 == null || (asJsonObject4 = jsonElement3.getAsJsonObject()) == null) ? null : StringsKt.fromJsonObject(asJsonObject4);
            JsonElement jsonElement4 = jsonObject.get("inp");
            ViewEvent.Inp fromJsonObject4 = (jsonElement4 == null || (asJsonObject3 = jsonElement4.getAsJsonObject()) == null) ? null : LayoutHelpersKt.fromJsonObject(asJsonObject3);
            JsonElement jsonElement5 = jsonObject.get("lcp");
            ViewEvent.Lcp fromJsonObject5 = (jsonElement5 == null || (asJsonObject2 = jsonElement5.getAsJsonObject()) == null) ? null : ImagesKt.fromJsonObject(asJsonObject2);
            JsonElement jsonElement6 = jsonObject.get("fbc");
            return new ViewEvent.Performance(fromJsonObject, fromJsonObject2, fromJsonObject3, fromJsonObject4, fromJsonObject5, (jsonElement6 == null || (asJsonObject = jsonElement6.getAsJsonObject()) == null) ? null : ShareModule$Companion.fromJsonObject(asJsonObject));
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Performance", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Performance", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Performance", e3);
            return null;
        }
    }

    public static final State rememberLazyListItemVisibility(LazyListState lazyListState, Function1 function1, Composer composer) {
        lazyListState.getClass();
        function1.getClass();
        boolean changed = ((GapComposer) composer).changed(lazyListState);
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = Updater.derivedStateOf(new ListsKt$$ExternalSyntheticLambda0(0, (Object) lazyListState, (Object) function1));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (State) rememberedValue;
    }
}
