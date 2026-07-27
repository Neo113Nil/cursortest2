package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class R7 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7361a;

    /* renamed from: b, reason: collision with root package name */
    public DeferredDeeplinkListener f7362b;

    /* renamed from: c, reason: collision with root package name */
    public DeferredDeeplinkParametersListener f7363c;

    /* renamed from: d, reason: collision with root package name */
    public P7 f7364d;

    public R7(boolean z) {
        this.f7361a = z;
    }

    public final void a(int i2) {
        P7 p7 = this.f7364d;
        String str = p7 == null ? null : p7.f7269c;
        DeferredDeeplinkListener deferredDeeplinkListener = this.f7362b;
        if (deferredDeeplinkListener != null) {
            if (i2 == 0) {
                throw null;
            }
            int i3 = i2 - 1;
            deferredDeeplinkListener.onError(i3 != 0 ? i3 != 1 ? i3 != 2 ? DeferredDeeplinkListener.Error.UNKNOWN : DeferredDeeplinkListener.Error.NO_REFERRER : DeferredDeeplinkListener.Error.PARSE_ERROR : DeferredDeeplinkListener.Error.NOT_A_FIRST_LAUNCH, (String) WrapUtils.getOrDefault(str, ""));
            this.f7362b = null;
        }
        DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f7363c;
        if (deferredDeeplinkParametersListener != null) {
            if (i2 == 0) {
                throw null;
            }
            int i6 = i2 - 1;
            deferredDeeplinkParametersListener.onError(i6 != 0 ? i6 != 1 ? i6 != 2 ? DeferredDeeplinkParametersListener.Error.UNKNOWN : DeferredDeeplinkParametersListener.Error.NO_REFERRER : DeferredDeeplinkParametersListener.Error.PARSE_ERROR : DeferredDeeplinkParametersListener.Error.NOT_A_FIRST_LAUNCH, (String) WrapUtils.getOrDefault(str, ""));
            this.f7363c = null;
        }
    }

    public final void a() {
        P7 p7 = this.f7364d;
        if (p7 != null) {
            String str = p7.f7268b;
            if (str != null) {
                DeferredDeeplinkListener deferredDeeplinkListener = this.f7362b;
                if (deferredDeeplinkListener != null) {
                    deferredDeeplinkListener.onDeeplinkLoaded(str);
                    this.f7362b = null;
                }
                if (!AbstractC0860no.a(this.f7364d.f7267a)) {
                    Map<String, String> map = this.f7364d.f7267a;
                    DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f7363c;
                    if (deferredDeeplinkParametersListener != null) {
                        deferredDeeplinkParametersListener.onParametersLoaded(map);
                        this.f7363c = null;
                        return;
                    }
                    return;
                }
                String str2 = this.f7364d.f7269c;
                DeferredDeeplinkParametersListener deferredDeeplinkParametersListener2 = this.f7363c;
                if (deferredDeeplinkParametersListener2 != null) {
                    deferredDeeplinkParametersListener2.onError(DeferredDeeplinkParametersListener.Error.PARSE_ERROR, (String) WrapUtils.getOrDefault(str2, ""));
                    this.f7363c = null;
                    return;
                }
                return;
            }
            if (p7.f7269c != null) {
                a(2);
            } else {
                a(3);
            }
        }
    }
}
