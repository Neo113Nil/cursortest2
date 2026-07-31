package com.google.android.gms.internal.ads;

import android.util.Log;

/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9983a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9984b;

    /* renamed from: c, reason: collision with root package name */
    public final sd4 f9985c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9986d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f9987e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (r6.equals("cenc") != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p1(boolean z6, String str, int i7, byte[] bArr, int i8, int i9, byte[] bArr2) {
        char c7 = 0;
        int i10 = 1;
        wu1.d((i7 == 0) ^ (bArr2 == null));
        this.f9983a = z6;
        this.f9984b = str;
        this.f9986d = i7;
        this.f9987e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (str.equals("cbc1")) {
                        c7 = 2;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 3046671:
                    if (str.equals("cbcs")) {
                        c7 = 3;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 3049879:
                    break;
                case 3049895:
                    if (str.equals("cens")) {
                        c7 = 1;
                        break;
                    }
                    c7 = 65535;
                    break;
                default:
                    c7 = 65535;
                    break;
            }
            if (c7 != 0 && c7 != 1) {
                if (c7 == 2 || c7 == 3) {
                    i10 = 2;
                } else {
                    StringBuilder sb = new StringBuilder(str.length() + 68);
                    sb.append("Unsupported protection scheme type '");
                    sb.append(str);
                    sb.append("'. Assuming AES-CTR crypto mode.");
                    Log.w("TrackEncryptionBox", sb.toString());
                }
            }
        }
        this.f9985c = new sd4(i10, bArr, i8, i9);
    }
}
