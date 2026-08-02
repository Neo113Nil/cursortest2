package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class R7 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6542a;

    /* renamed from: b, reason: collision with root package name */
    public DeferredDeeplinkListener f6543b;

    /* renamed from: c, reason: collision with root package name */
    public DeferredDeeplinkParametersListener f6544c;

    /* renamed from: d, reason: collision with root package name */
    public P7 f6545d;

    public R7(boolean z) {
        this.f6542a = z;
    }

    public final void a(int i3) {
        P7 p7 = this.f6545d;
        String str = p7 == null ? null : p7.f6455c;
        DeferredDeeplinkListener deferredDeeplinkListener = this.f6543b;
        if (deferredDeeplinkListener != null) {
            if (i3 == 0) {
                throw null;
            }
            int i4 = i3 - 1;
            deferredDeeplinkListener.onError(i4 != 0 ? i4 != 1 ? i4 != 2 ? DeferredDeeplinkListener.Error.UNKNOWN : DeferredDeeplinkListener.Error.NO_REFERRER : DeferredDeeplinkListener.Error.PARSE_ERROR : DeferredDeeplinkListener.Error.NOT_A_FIRST_LAUNCH, (String) WrapUtils.getOrDefault(str, ""));
            this.f6543b = null;
        }
        DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f6544c;
        if (deferredDeeplinkParametersListener != null) {
            if (i3 == 0) {
                throw null;
            }
            int i5 = i3 - 1;
            deferredDeeplinkParametersListener.onError(i5 != 0 ? i5 != 1 ? i5 != 2 ? DeferredDeeplinkParametersListener.Error.UNKNOWN : DeferredDeeplinkParametersListener.Error.NO_REFERRER : DeferredDeeplinkParametersListener.Error.PARSE_ERROR : DeferredDeeplinkParametersListener.Error.NOT_A_FIRST_LAUNCH, (String) WrapUtils.getOrDefault(str, ""));
            this.f6544c = null;
        }
    }

    public final void a() {
        P7 p7 = this.f6545d;
        if (p7 != null) {
            String str = p7.f6454b;
            if (str != null) {
                DeferredDeeplinkListener deferredDeeplinkListener = this.f6543b;
                if (deferredDeeplinkListener != null) {
                    deferredDeeplinkListener.onDeeplinkLoaded(str);
                    this.f6543b = null;
                }
                if (!AbstractC0709no.a(this.f6545d.f6453a)) {
                    Map<String, String> map = this.f6545d.f6453a;
                    DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f6544c;
                    if (deferredDeeplinkParametersListener != null) {
                        deferredDeeplinkParametersListener.onParametersLoaded(map);
                        this.f6544c = null;
                        return;
                    }
                    return;
                }
                String str2 = this.f6545d.f6455c;
                DeferredDeeplinkParametersListener deferredDeeplinkParametersListener2 = this.f6544c;
                if (deferredDeeplinkParametersListener2 != null) {
                    deferredDeeplinkParametersListener2.onError(DeferredDeeplinkParametersListener.Error.PARSE_ERROR, (String) WrapUtils.getOrDefault(str2, ""));
                    this.f6544c = null;
                    return;
                }
                return;
            }
            if (p7.f6455c != null) {
                a(2);
            } else {
                a(3);
            }
        }
    }
}
