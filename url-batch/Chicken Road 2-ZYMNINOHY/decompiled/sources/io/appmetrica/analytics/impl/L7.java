package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class L7 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10578a;

    /* renamed from: b, reason: collision with root package name */
    public DeferredDeeplinkListener f10579b;

    /* renamed from: c, reason: collision with root package name */
    public DeferredDeeplinkParametersListener f10580c;

    /* renamed from: d, reason: collision with root package name */
    public J7 f10581d;

    public L7(boolean z) {
        this.f10578a = z;
    }

    public final void a(int i4) {
        J7 j7 = this.f10581d;
        String str = j7 == null ? null : j7.f10474c;
        DeferredDeeplinkListener deferredDeeplinkListener = this.f10579b;
        if (deferredDeeplinkListener != null) {
            if (i4 == 0) {
                throw null;
            }
            int i5 = i4 - 1;
            deferredDeeplinkListener.onError(i5 != 0 ? i5 != 1 ? i5 != 2 ? DeferredDeeplinkListener.Error.UNKNOWN : DeferredDeeplinkListener.Error.NO_REFERRER : DeferredDeeplinkListener.Error.PARSE_ERROR : DeferredDeeplinkListener.Error.NOT_A_FIRST_LAUNCH, (String) WrapUtils.getOrDefault(str, ""));
            this.f10579b = null;
        }
        DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f10580c;
        if (deferredDeeplinkParametersListener != null) {
            if (i4 == 0) {
                throw null;
            }
            int i6 = i4 - 1;
            deferredDeeplinkParametersListener.onError(i6 != 0 ? i6 != 1 ? i6 != 2 ? DeferredDeeplinkParametersListener.Error.UNKNOWN : DeferredDeeplinkParametersListener.Error.NO_REFERRER : DeferredDeeplinkParametersListener.Error.PARSE_ERROR : DeferredDeeplinkParametersListener.Error.NOT_A_FIRST_LAUNCH, (String) WrapUtils.getOrDefault(str, ""));
            this.f10580c = null;
        }
    }

    public final void a() {
        J7 j7 = this.f10581d;
        if (j7 != null) {
            String str = j7.f10473b;
            if (str != null) {
                DeferredDeeplinkListener deferredDeeplinkListener = this.f10579b;
                if (deferredDeeplinkListener != null) {
                    deferredDeeplinkListener.onDeeplinkLoaded(str);
                    this.f10579b = null;
                }
                if (!AbstractC0779lo.a(this.f10581d.f10472a)) {
                    Map<String, String> map = this.f10581d.f10472a;
                    DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f10580c;
                    if (deferredDeeplinkParametersListener != null) {
                        deferredDeeplinkParametersListener.onParametersLoaded(map);
                        this.f10580c = null;
                        return;
                    }
                    return;
                }
                String str2 = this.f10581d.f10474c;
                DeferredDeeplinkParametersListener deferredDeeplinkParametersListener2 = this.f10580c;
                if (deferredDeeplinkParametersListener2 != null) {
                    deferredDeeplinkParametersListener2.onError(DeferredDeeplinkParametersListener.Error.PARSE_ERROR, (String) WrapUtils.getOrDefault(str2, ""));
                    this.f10580c = null;
                    return;
                }
                return;
            }
            if (j7.f10474c != null) {
                a(2);
            } else {
                a(3);
            }
        }
    }
}
