package com.squareup.util.cash;

import com.datadog.android.rum.model.ViewEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientsync.models.ResetTrigger;
import com.squareup.protos.cash.ui.Image;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public abstract class ImagesKt {
    public static final String access$toCdfReason(ResetTrigger resetTrigger) {
        int ordinal = resetTrigger.ordinal();
        if (ordinal == 0) {
            return "CLEAR_APP_DATA";
        }
        if (ordinal == 1) {
            return "DEBUG";
        }
        if (ordinal == 2) {
            return "RECOVERY";
        }
        if (ordinal == 3) {
            return "IMMEDIATE_RESYNC";
        }
        if (ordinal == 4) {
            return "LOGOUT";
        }
        if (ordinal == 5) {
            return "UI_TEST";
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static ViewEvent.Lcp fromJsonObject(JsonObject jsonObject) {
        try {
            long asLong = jsonObject.get("timestamp").getAsLong();
            JsonElement jsonElement = jsonObject.get("target_selector");
            String asString = jsonElement != null ? jsonElement.getAsString() : null;
            JsonElement jsonElement2 = jsonObject.get("resource_url");
            return new ViewEvent.Lcp(asLong, asString, jsonElement2 != null ? jsonElement2.getAsString() : null);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Lcp", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Lcp", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Lcp", e3);
            return null;
        }
    }

    public static final Image toImage(String str) {
        str.getClass();
        return new Image(str, str, 4);
    }
}
