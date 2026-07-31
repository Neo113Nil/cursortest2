package io.appmetrica.analytics.reactnative;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableMap;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import java.util.Map;

/* loaded from: classes3.dex */
public class ReactNativeDeferredDeeplinkParametersListener implements DeferredDeeplinkParametersListener {
    private final Callback failureListener;
    private final Callback successListener;

    ReactNativeDeferredDeeplinkParametersListener(Callback callback, Callback callback2) {
        this.failureListener = callback;
        this.successListener = callback2;
    }

    @Override // io.appmetrica.analytics.DeferredDeeplinkParametersListener
    public void onParametersLoaded(Map<String, String> map) {
        WritableMap createMap = Arguments.createMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            createMap.putString(entry.getKey(), entry.getValue());
        }
        this.successListener.invoke(createMap, null);
    }

    @Override // io.appmetrica.analytics.DeferredDeeplinkParametersListener
    public void onError(DeferredDeeplinkParametersListener.Error error, String str) {
        this.failureListener.invoke(getErrorStr(error), str);
    }

    /* renamed from: io.appmetrica.analytics.reactnative.ReactNativeDeferredDeeplinkParametersListener$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$appmetrica$analytics$DeferredDeeplinkParametersListener$Error;

        static {
            int[] iArr = new int[DeferredDeeplinkParametersListener.Error.values().length];
            $SwitchMap$io$appmetrica$analytics$DeferredDeeplinkParametersListener$Error = iArr;
            try {
                iArr[DeferredDeeplinkParametersListener.Error.NO_REFERRER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$DeferredDeeplinkParametersListener$Error[DeferredDeeplinkParametersListener.Error.NOT_A_FIRST_LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$DeferredDeeplinkParametersListener$Error[DeferredDeeplinkParametersListener.Error.PARSE_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static String getErrorStr(DeferredDeeplinkParametersListener.Error error) {
        int i = AnonymousClass1.$SwitchMap$io$appmetrica$analytics$DeferredDeeplinkParametersListener$Error[error.ordinal()];
        if (i == 1) {
            return "NO_REFERRER";
        }
        if (i == 2) {
            return "NOT_A_FIRST_LAUNCH";
        }
        if (i == 3) {
            return "PARSE_ERROR";
        }
        return "UNKNOWN";
    }
}
