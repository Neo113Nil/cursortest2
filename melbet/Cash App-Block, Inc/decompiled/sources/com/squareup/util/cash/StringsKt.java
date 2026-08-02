package com.squareup.util.cash;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.rum.model.ViewEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientsync.models.ResetTrigger;
import com.squareup.ecr.BuildConfig;
import com.squareup.protos.cash.localization.LocalizedString;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes4.dex */
public abstract class StringsKt {
    public static ViewEvent.Os fromJsonObject(JsonObject jsonObject) {
        try {
            String asString = jsonObject.get("name").getAsString();
            String asString2 = jsonObject.get("version").getAsString();
            JsonElement jsonElement = jsonObject.get("build");
            String asString3 = jsonElement != null ? jsonElement.getAsString() : null;
            String asString4 = jsonObject.get("version_major").getAsString();
            asString.getClass();
            asString2.getClass();
            asString4.getClass();
            return new ViewEvent.Os(asString, asString2, asString3, asString4);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Os", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Os", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Os", e3);
            return null;
        }
    }

    public static final String getAttributeValue(ResetTrigger resetTrigger) {
        resetTrigger.getClass();
        int ordinal = resetTrigger.ordinal();
        if (ordinal == 0) {
            return "clear_app_data_received";
        }
        if (ordinal == 1) {
            return BuildConfig.BUILD_TYPE;
        }
        if (ordinal == 2) {
            return "illegal_state_recovery";
        }
        if (ordinal == 3) {
            return "immediate_force_resync";
        }
        if (ordinal == 4) {
            return "session_ended";
        }
        if (ordinal == 5) {
            return "ui_test";
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final LocalizedString localized(String str) {
        str.getClass();
        return new LocalizedString(str, null, ByteString.EMPTY);
    }

    public static final String translated(LocalizedString localizedString) {
        localizedString.getClass();
        String str = localizedString.translated_value;
        if (str != null) {
            return str;
        }
        a$$ExternalSyntheticBUOutline0.m$1("translated_value from server should never be null");
        return null;
    }
}
