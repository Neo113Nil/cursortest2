package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.p52;

/* loaded from: classes3.dex */
public final class l52 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f28426a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28427b;

    /* renamed from: c, reason: collision with root package name */
    public final p52.a f28428c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28429d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f28430e;

    public l52(boolean z4, String str, int i4, byte[] bArr, int i5, int i6, byte[] bArr2) {
        C2253tf.a((bArr2 == null) ^ (i4 == 0));
        this.f28426a = z4;
        this.f28427b = str;
        this.f28429d = i4;
        this.f28430e = bArr2;
        this.f28428c = new p52.a(a(str), i5, i6, bArr);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        char c4 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c4 = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c4 = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c4 = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c4 = 3;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
            case 1:
                return 2;
            default:
                ms0.d("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
