package io.appmetrica.analytics.reactnative;

import com.facebook.react.bridge.Callback;
import io.appmetrica.analytics.DeferredDeeplinkListener;

/* loaded from: classes3.dex */
public class ReactNativeDeferredDeeplinkListener implements DeferredDeeplinkListener {
    private final Callback failureListener;
    private final Callback successListener;

    ReactNativeDeferredDeeplinkListener(Callback callback, Callback callback2) {
        this.failureListener = callback;
        this.successListener = callback2;
    }

    @Override // io.appmetrica.analytics.DeferredDeeplinkListener
    public void onDeeplinkLoaded(String str) {
        this.successListener.invoke(str);
    }

    @Override // io.appmetrica.analytics.DeferredDeeplinkListener
    public void onError(DeferredDeeplinkListener.Error error, String str) {
        this.failureListener.invoke(getErrorStr(error), str);
    }

    /* renamed from: io.appmetrica.analytics.reactnative.ReactNativeDeferredDeeplinkListener$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$appmetrica$analytics$DeferredDeeplinkListener$Error;

        static {
            int[] iArr = new int[DeferredDeeplinkListener.Error.values().length];
            $SwitchMap$io$appmetrica$analytics$DeferredDeeplinkListener$Error = iArr;
            try {
                iArr[DeferredDeeplinkListener.Error.NO_REFERRER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$DeferredDeeplinkListener$Error[DeferredDeeplinkListener.Error.NOT_A_FIRST_LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$DeferredDeeplinkListener$Error[DeferredDeeplinkListener.Error.PARSE_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static String getErrorStr(DeferredDeeplinkListener.Error error) {
        int i = AnonymousClass1.$SwitchMap$io$appmetrica$analytics$DeferredDeeplinkListener$Error[error.ordinal()];
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
