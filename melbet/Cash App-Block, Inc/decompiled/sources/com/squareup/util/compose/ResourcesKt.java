package com.squareup.util.compose;

import android.content.Context;
import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.datadog.android.rum.model.ErrorEvent$Status$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientsync.telemetry.RealClientSyncSpan;
import com.squareup.cash.clientsync.telemetry.SpanResult;
import java.util.Arrays;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public abstract class ResourcesKt {
    public static ViewEvent.Profiling fromJsonObject(JsonObject jsonObject) {
        int i;
        String asString;
        String asString2;
        try {
            JsonElement jsonElement = jsonObject.get("status");
            int i2 = 0;
            if (jsonElement != null && (asString2 = jsonElement.getAsString()) != null) {
                int[] values = CameraSelector$$ExternalSyntheticOutline0.values(4);
                int length = values.length;
                for (int i3 = 0; i3 < length; i3++) {
                    i = values[i3];
                    if (!ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$29(i).equals(asString2)) {
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            i = 0;
            JsonElement jsonElement2 = jsonObject.get("error_reason");
            if (jsonElement2 != null && (asString = jsonElement2.getAsString()) != null) {
                int[] values2 = CameraSelector$$ExternalSyntheticOutline0.values(4);
                int length2 = values2.length;
                while (i2 < length2) {
                    int i4 = values2[i2];
                    if (ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$27(i4).equals(asString)) {
                        i2 = i4;
                    } else {
                        i2++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return new ViewEvent.Profiling(i, i2);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Profiling", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Profiling", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Profiling", e3);
            return null;
        }
    }

    public static final String icuStringResource(int i, Object[] objArr, GapComposer gapComposer) {
        gapComposer.consume(AndroidCompositionLocals_androidKt.LocalConfiguration);
        Resources resources = ((Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext)).getResources();
        resources.getClass();
        String format2 = MessageFormat.format(resources.getString(i), Arrays.copyOf(objArr, objArr.length));
        format2.getClass();
        return format2;
    }

    public static final void setResult(RealClientSyncSpan realClientSyncSpan, SpanResult spanResult) {
        realClientSyncSpan.attributes.put("result", spanResult.value);
    }
}
