package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.yandex.mobile.ads.impl.qh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2187qh {

    /* renamed from: a, reason: collision with root package name */
    public final int f30776a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final float f30777b = 0.0f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2187qh.class == obj.getClass()) {
            C2187qh c2187qh = (C2187qh) obj;
            if (this.f30776a == c2187qh.f30776a && Float.compare(c2187qh.f30777b, this.f30777b) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f30777b) + ((this.f30776a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }
}
