package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.Vm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2690Vm {
    public final AdErrorType A00;
    public final String A01;

    public C2690Vm(int i, String str) {
        this(AdErrorType.adErrorTypeFromCode(i), str);
    }

    public C2690Vm(AdErrorType adErrorType, String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static C2690Vm A00(AdErrorType adErrorType) {
        return new C2690Vm(adErrorType, (String) null);
    }

    public static C2690Vm A01(AdErrorType adErrorType, String str) {
        return new C2690Vm(adErrorType, str);
    }

    public static C2690Vm A02(C2691Vn c2691Vn) {
        return new C2690Vm(c2691Vn.A00(), c2691Vn.A01());
    }

    public final AdErrorType A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
