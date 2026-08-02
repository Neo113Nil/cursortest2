package com.squareup.util.coil;

import android.net.Uri;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import coil3.request.ImageRequest;
import com.datadog.android.rum.model.ViewEvent;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.common.cashsearch.EntityType;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public abstract class UtilsKt {
    public static final EntityType access$toSearchEntityType(SyncEntityType syncEntityType) {
        if (Intrinsics.areEqual(syncEntityType, AndroidSyncValueSpecs.Customer.entityType)) {
            return EntityType.CUSTOMER;
        }
        if (Intrinsics.areEqual(syncEntityType, AndroidSyncValueSpecs.Merchant.entityType)) {
            return EntityType.MERCHANT;
        }
        Path$$ExternalSyntheticBUOutline0.m$1(syncEntityType, "Unsupported entity type: ");
        return null;
    }

    public static final Uri dataUriOrNull(ImageRequest imageRequest) {
        imageRequest.getClass();
        Object obj = imageRequest.data;
        if (obj instanceof String) {
            return Uri.parse((String) obj);
        }
        if (obj instanceof coil3.Uri) {
            return Uri.parse(((coil3.Uri) obj).data);
        }
        if (obj instanceof Uri) {
            return (Uri) obj;
        }
        return null;
    }

    public static ViewEvent.PageState fromJsonObject(JsonObject jsonObject) {
        jsonObject.getClass();
        try {
            String asString = jsonObject.get("state").getAsString();
            asString.getClass();
            for (int i : CameraSelector$$ExternalSyntheticOutline0.values(5)) {
                if (ViewEvent$State$EnumUnboxingLocalUtility.getJsonValue$2(i).equals(asString)) {
                    return new ViewEvent.PageState(i, jsonObject.get("start").getAsLong());
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type PageState", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type PageState", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type PageState", e3);
            return null;
        }
    }
}
