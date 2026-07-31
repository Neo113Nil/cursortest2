package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.f8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2619f8 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f38957a;

    /* renamed from: b, reason: collision with root package name */
    public DeferredDeeplinkListener f38958b;

    /* renamed from: c, reason: collision with root package name */
    public DeferredDeeplinkParametersListener f38959c;

    /* renamed from: d, reason: collision with root package name */
    public C2566d8 f38960d;

    public C2619f8(boolean z4) {
        this.f38957a = z4;
    }

    public final void a(int i4) {
        C2566d8 c2566d8 = this.f38960d;
        String str = c2566d8 == null ? null : c2566d8.f38845c;
        DeferredDeeplinkListener deferredDeeplinkListener = this.f38958b;
        if (deferredDeeplinkListener != null) {
            if (i4 == 0) {
                throw null;
            }
            int i5 = i4 - 1;
            deferredDeeplinkListener.onError(i5 != 0 ? i5 != 1 ? i5 != 2 ? DeferredDeeplinkListener.Error.UNKNOWN : DeferredDeeplinkListener.Error.NO_REFERRER : DeferredDeeplinkListener.Error.PARSE_ERROR : DeferredDeeplinkListener.Error.NOT_A_FIRST_LAUNCH, (String) WrapUtils.getOrDefault(str, ""));
            this.f38958b = null;
        }
        DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f38959c;
        if (deferredDeeplinkParametersListener != null) {
            if (i4 == 0) {
                throw null;
            }
            int i6 = i4 - 1;
            deferredDeeplinkParametersListener.onError(i6 != 0 ? i6 != 1 ? i6 != 2 ? DeferredDeeplinkParametersListener.Error.UNKNOWN : DeferredDeeplinkParametersListener.Error.NO_REFERRER : DeferredDeeplinkParametersListener.Error.PARSE_ERROR : DeferredDeeplinkParametersListener.Error.NOT_A_FIRST_LAUNCH, (String) WrapUtils.getOrDefault(str, ""));
            this.f38959c = null;
        }
    }

    public final void a() {
        C2566d8 c2566d8 = this.f38960d;
        if (c2566d8 != null) {
            String str = c2566d8.f38844b;
            if (str != null) {
                DeferredDeeplinkListener deferredDeeplinkListener = this.f38958b;
                if (deferredDeeplinkListener != null) {
                    deferredDeeplinkListener.onDeeplinkLoaded(str);
                    this.f38958b = null;
                }
                if (!AbstractC2713io.a(this.f38960d.f38843a)) {
                    Map<String, String> map = this.f38960d.f38843a;
                    DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f38959c;
                    if (deferredDeeplinkParametersListener != null) {
                        deferredDeeplinkParametersListener.onParametersLoaded(map);
                        this.f38959c = null;
                        return;
                    }
                    return;
                }
                String str2 = this.f38960d.f38845c;
                DeferredDeeplinkParametersListener deferredDeeplinkParametersListener2 = this.f38959c;
                if (deferredDeeplinkParametersListener2 != null) {
                    deferredDeeplinkParametersListener2.onError(DeferredDeeplinkParametersListener.Error.PARSE_ERROR, (String) WrapUtils.getOrDefault(str2, ""));
                    this.f38959c = null;
                    return;
                }
                return;
            }
            if (c2566d8.f38845c != null) {
                a(2);
            } else {
                a(3);
            }
        }
    }
}
