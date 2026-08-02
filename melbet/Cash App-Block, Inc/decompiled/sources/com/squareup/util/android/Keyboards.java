package com.squareup.util.android;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.datadog.android.rum.model.ViewEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientsync.errors.SyncEntityShadowException;
import com.squareup.util.compose.TransitionsKt;
import com.squareup.wire.GrpcStatus;
import kotlin.reflect.KClass;
import timber.log.Timber;

/* loaded from: classes4.dex */
public abstract class Keyboards {
    public static SyncEntityShadowException create(String str, Throwable th, KClass kClass, KClass kClass2) {
        kClass.getClass();
        kClass2.getClass();
        return new SyncEntityShadowException(str, th, new SyncEntityShadowException.Metadata(kClass, kClass2));
    }

    public static ViewEvent.Display fromJsonObject(JsonObject jsonObject) {
        JsonObject asJsonObject;
        JsonObject asJsonObject2;
        try {
            JsonElement jsonElement = jsonObject.get("viewport");
            ViewEvent.Viewport fromJsonObject = (jsonElement == null || (asJsonObject2 = jsonElement.getAsJsonObject()) == null) ? null : GrpcStatus.Companion.fromJsonObject(asJsonObject2);
            JsonElement jsonElement2 = jsonObject.get("scroll");
            return new ViewEvent.Display(fromJsonObject, (jsonElement2 == null || (asJsonObject = jsonElement2.getAsJsonObject()) == null) ? null : TransitionsKt.fromJsonObject(asJsonObject));
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Display", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Display", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Display", e3);
            return null;
        }
    }

    public static final void hideKeyboard(View view) {
        view.getClass();
        Context context = view.getContext();
        context.getClass();
        IBinder windowToken = view.getWindowToken();
        if (windowToken == null) {
            Timber.Forest.w("Android may not hide the keyboard because windowToken == null.", new Object[0]);
        }
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
        }
    }

    public static final void showKeyboard(View view) {
        view.getClass();
        if (view.isAttachedToWindow() && view.hasWindowFocus()) {
            Context context = view.getContext();
            context.getClass();
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(view, 1);
            }
        }
    }
}
