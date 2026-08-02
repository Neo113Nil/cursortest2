package com.squareup.util.android;

import android.util.Patterns;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.datadog.android.rum.model.ViewEvent;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientsync.errors.SyncEntityErrorMetadata;
import com.squareup.cash.clientsync.models.SyncEntity;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class Emails {
    public static ViewEvent.DdSession fromJsonObject(JsonObject jsonObject) {
        ViewEvent.Plan plan;
        String asString;
        String asString2;
        try {
            JsonElement jsonElement = jsonObject.get("plan");
            int i = 0;
            if (jsonElement != null && (asString2 = jsonElement.getAsString()) != null) {
                ViewEvent.Plan[] values = ViewEvent.Plan.values();
                int length = values.length;
                for (int i2 = 0; i2 < length; i2++) {
                    plan = values[i2];
                    if (!Intrinsics.areEqual(plan.jsonValue.toString(), asString2)) {
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            plan = null;
            JsonElement jsonElement2 = jsonObject.get("session_precondition");
            if (jsonElement2 != null && (asString = jsonElement2.getAsString()) != null) {
                int[] values2 = CameraSelector$$ExternalSyntheticOutline0.values(7);
                int length2 = values2.length;
                while (i < length2) {
                    int i3 = values2[i];
                    if (ViewEvent$State$EnumUnboxingLocalUtility.getJsonValue$1(i3).equals(asString)) {
                        i = i3;
                    } else {
                        i++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return new ViewEvent.DdSession(plan, i);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type DdSession", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type DdSession", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type DdSession", e3);
            return null;
        }
    }

    public static final SyncEntityErrorMetadata getErrorMetadata(SyncEntity syncEntity) {
        syncEntity.getClass();
        return new SyncEntityErrorMetadata(syncEntity.entityId, syncEntity.entityType, syncEntity.valueType, syncEntity.entityVersion);
    }

    public static final String normalize(String str) {
        if (str == null) {
            return null;
        }
        Pattern pattern = Patterns.EMAIL_ADDRESS;
        String obj = kotlin.text.StringsKt.trim(str).toString();
        Locale locale = Locale.getDefault();
        locale.getClass();
        String lowerCase = obj.toLowerCase(locale);
        lowerCase.getClass();
        Matcher matcher = pattern.matcher(lowerCase);
        if (matcher.matches()) {
            return matcher.group();
        }
        return null;
    }
}
