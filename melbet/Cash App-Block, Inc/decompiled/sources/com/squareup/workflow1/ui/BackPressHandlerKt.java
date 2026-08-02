package com.squareup.workflow1.ui;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.room.util.DBUtil;
import com.datadog.android.telemetry.model.TelemetryDebugEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import com.squareup.cash.R;
import kotlin.jvm.functions.Function0;

/* loaded from: classes8.dex */
public abstract class BackPressHandlerKt {
    public static TelemetryDebugEvent.View fromJsonObject(JsonObject jsonObject) {
        try {
            String asString = jsonObject.get("id").getAsString();
            asString.getClass();
            return new TelemetryDebugEvent.View(asString);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type View", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type View", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type View", e3);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void setBackPressedHandler(View view, Function0 function0) {
        Lifecycle lifecycle;
        Lifecycle lifecycle2;
        view.getClass();
        HandleBackPressWhenAttached handleBackPressWhenAttached = (HandleBackPressWhenAttached) view.getTag(R.id.view_back_handler);
        if (handleBackPressWhenAttached != null) {
            handleBackPressWhenAttached.onBackPressedCallback.remove();
            View view2 = handleBackPressWhenAttached.view;
            view2.removeOnAttachStateChangeListener(handleBackPressWhenAttached);
            LifecycleOwner lifecycleOwner = DBUtil.get(view2);
            if (lifecycleOwner != null && (lifecycle2 = lifecycleOwner.getLifecycle()) != null) {
                lifecycle2.removeObserver(handleBackPressWhenAttached);
            }
        }
        OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = null;
        if (function0 != null) {
            HandleBackPressWhenAttached handleBackPressWhenAttached2 = new HandleBackPressWhenAttached(view, function0);
            Context context = view.getContext();
            context.getClass();
            while (true) {
                if (!(context instanceof OnBackPressedDispatcherOwner)) {
                    ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
                    if (contextWrapper == null || (context = contextWrapper.getBaseContext()) == null) {
                        break;
                    }
                } else {
                    onBackPressedDispatcherOwner = (OnBackPressedDispatcherOwner) context;
                    break;
                }
            }
            if (onBackPressedDispatcherOwner != null) {
                onBackPressedDispatcherOwner.getOnBackPressedDispatcher().addCallback(handleBackPressWhenAttached2.onBackPressedCallback, onBackPressedDispatcherOwner);
                view.addOnAttachStateChangeListener(handleBackPressWhenAttached2);
                if (view.isAttachedToWindow()) {
                    handleBackPressWhenAttached2.onViewAttachedToWindow(view);
                }
                LifecycleOwner lifecycleOwner2 = DBUtil.get(view);
                if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
                    lifecycle.addObserver(handleBackPressWhenAttached2);
                }
            }
            onBackPressedDispatcherOwner = handleBackPressWhenAttached2;
        }
        view.setTag(R.id.view_back_handler, onBackPressedDispatcherOwner);
    }
}
