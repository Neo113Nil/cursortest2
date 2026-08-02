package com.squareup.util.coroutines;

import androidx.core.text.TextUtilsCompat;
import app.cash.api.ApiResult;
import app.cash.broadway.screen.DialogScreen;
import app.cash.broadway.screen.Screen;
import com.datadog.android.rum.model.ViewEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.common.messaging.api.ErrorMessaging;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.common.messaging.screens.FailureMessageScreen;
import com.squareup.cash.resource.text.AndroidStringManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.time.Duration;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;

/* loaded from: classes6.dex */
public abstract class TickerKt {
    public static ViewEvent.Usr fromJsonObject(JsonObject jsonObject) {
        try {
            JsonElement jsonElement = jsonObject.get("id");
            String asString = jsonElement != null ? jsonElement.getAsString() : null;
            JsonElement jsonElement2 = jsonObject.get("name");
            String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
            JsonElement jsonElement3 = jsonObject.get("email");
            String asString3 = jsonElement3 != null ? jsonElement3.getAsString() : null;
            JsonElement jsonElement4 = jsonObject.get("anonymous_id");
            String asString4 = jsonElement4 != null ? jsonElement4.getAsString() : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                if (!ArraysKt___ArraysKt.contains(ViewEvent.Usr.RESERVED_PROPERTIES, entry.getKey())) {
                    String key = entry.getKey();
                    key.getClass();
                    linkedHashMap.put(key, entry.getValue());
                }
            }
            return new ViewEvent.Usr(asString, asString2, asString3, asString4, linkedHashMap);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Usr", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Usr", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Usr", e3);
            return null;
        }
    }

    /* renamed from: tickerFlow-QTBD994$default, reason: not valid java name */
    public static Flow m3996tickerFlowQTBD994$default(long j) {
        Duration.Companion.getClass();
        return FlowKt.buffer$default(new SafeFlow(new TickerKt$tickerFlow$1(0L, j, (Continuation) null)), 0, 3);
    }

    public static DialogScreen toMessageScreen$default(ApiResult.Failure failure, Screen screen, AndroidStringManager androidStringManager) {
        screen.getClass();
        androidStringManager.getClass();
        ErrorMessaging errorMessaging = TextUtilsCompat.errorMessaging(androidStringManager, failure, null);
        boolean z = screen instanceof BlockersScreens;
        String str = errorMessaging.title;
        if (z) {
            return new FailureMessageBlockerScreen(((BlockersScreens) screen).getBlockersData(), errorMessaging.message, str);
        }
        return new FailureMessageScreen(str, errorMessaging.message, null, screen, null, 4);
    }
}
