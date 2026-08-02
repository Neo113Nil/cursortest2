package com.instagram.common.viewpoint.core;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.2i, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C00982i extends IOException {
    public int A00;
    public boolean A01;

    @Deprecated
    public C00982i() {
    }

    @Deprecated
    public C00982i(String str) {
        super(str);
    }

    public C00982i(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.A01 = z;
        this.A00 = i;
    }

    public static C00982i A00(String str) {
        return new C00982i(str, null, false, 1);
    }

    public static C00982i A01(String str, Throwable th) {
        return new C00982i(str, th, true, 1);
    }

    public static C00982i A02(String str, Throwable th) {
        return new C00982i(str, th, true, 0);
    }
}
