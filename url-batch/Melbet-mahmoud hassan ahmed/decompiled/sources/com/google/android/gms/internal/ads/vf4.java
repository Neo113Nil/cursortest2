package com.google.android.gms.internal.ads;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class vf4 {

    /* renamed from: a, reason: collision with root package name */
    public static final tf4 f13338a = new tf4() { // from class: com.google.android.gms.internal.ads.sf4
    };

    /* JADX WARN: Removed duplicated region for block: B:6:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final c91 a(byte[] bArr, int i7, tf4 tf4Var, da1 da1Var) {
        String sb;
        uf4 uf4Var;
        int i8;
        int i9;
        boolean z6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        ArrayList arrayList = new ArrayList();
        dr2 dr2Var = new dr2(bArr, i7);
        boolean z7 = false;
        if (dr2Var.i() < 10) {
            sb = "Data too short to be an ID3 tag";
        } else {
            int u6 = dr2Var.u();
            if (u6 == 4801587) {
                int s7 = dr2Var.s();
                dr2Var.g(1);
                int s8 = dr2Var.s();
                int r7 = dr2Var.r();
                if (s7 == 2) {
                    if ((s8 & 64) != 0) {
                        sb = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme";
                    }
                    uf4Var = new uf4(s7, s7 >= 4 && (s8 & 128) != 0, r7);
                } else {
                    if (s7 == 3) {
                        if ((s8 & 64) != 0) {
                            int m7 = dr2Var.m();
                            dr2Var.g(m7);
                            r7 -= m7 + 4;
                        }
                    } else if (s7 == 4) {
                        if ((s8 & 64) != 0) {
                            int r8 = dr2Var.r();
                            dr2Var.g(r8 - 4);
                            r7 -= r8;
                        }
                        if ((s8 & 16) != 0) {
                            r7 -= 10;
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder(57);
                        sb2.append("Skipped ID3 tag with unsupported majorVersion=");
                        sb2.append(s7);
                        sb = sb2.toString();
                    }
                    uf4Var = new uf4(s7, s7 >= 4 && (s8 & 128) != 0, r7);
                }
                if (uf4Var != null) {
                    return null;
                }
                int k7 = dr2Var.k();
                i8 = uf4Var.f12776a;
                int i15 = i8 == 2 ? 6 : 10;
                i9 = uf4Var.f12778c;
                z6 = uf4Var.f12777b;
                if (z6) {
                    i14 = uf4Var.f12778c;
                    i9 = e(dr2Var, i14);
                }
                dr2Var.e(k7 + i9);
                i10 = uf4Var.f12776a;
                if (!j(dr2Var, i10, i15, false)) {
                    i12 = uf4Var.f12776a;
                    if (i12 != 4 || !j(dr2Var, 4, i15, true)) {
                        i13 = uf4Var.f12776a;
                        StringBuilder sb3 = new StringBuilder(56);
                        sb3.append("Failed to validate ID3 tag with majorVersion=");
                        sb3.append(i13);
                        Log.w("Id3Decoder", sb3.toString());
                        return null;
                    }
                    z7 = true;
                }
                while (dr2Var.i() >= i15) {
                    i11 = uf4Var.f12776a;
                    wf4 f7 = f(i11, dr2Var, z7, i15, tf4Var);
                    if (f7 != null) {
                        arrayList.add(f7);
                    }
                }
                return new c91(arrayList);
            }
            String valueOf = String.valueOf(String.format("%06X", Integer.valueOf(u6)));
            sb = valueOf.length() != 0 ? "Unexpected first three bytes of ID3 tag header: 0x".concat(valueOf) : new String("Unexpected first three bytes of ID3 tag header: 0x");
        }
        Log.w("Id3Decoder", sb);
        uf4Var = null;
        if (uf4Var != null) {
        }
    }

    private static int b(int i7) {
        return (i7 == 0 || i7 == 3) ? 1 : 2;
    }

    private static int c(byte[] bArr, int i7, int i8) {
        int d7 = d(bArr, i7);
        if (i8 == 0 || i8 == 3) {
            return d7;
        }
        while (true) {
            int length = bArr.length;
            if (d7 >= length - 1) {
                return length;
            }
            if ((d7 - i7) % 2 == 0 && bArr[d7 + 1] == 0) {
                return d7;
            }
            d7 = d(bArr, d7 + 1);
        }
    }

    private static int d(byte[] bArr, int i7) {
        while (true) {
            int length = bArr.length;
            if (i7 >= length) {
                return length;
            }
            if (bArr[i7] == 0) {
                return i7;
            }
            i7++;
        }
    }

    private static int e(dr2 dr2Var, int i7) {
        byte[] h7 = dr2Var.h();
        int k7 = dr2Var.k();
        int i8 = k7;
        while (true) {
            int i9 = i8 + 1;
            if (i9 >= k7 + i7) {
                return i7;
            }
            if ((h7[i8] & 255) == 255 && h7[i9] == 0) {
                System.arraycopy(h7, i8 + 2, h7, i9, (i7 - (i8 - k7)) - 2);
                i7--;
            }
            i8 = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:229:0x026c, code lost:
    
        if (r9 == 67) goto L140;
     */
    /* JADX WARN: Not initialized variable reg: 22, insn: 0x055e: MOVE (r2 I:??[OBJECT, ARRAY]) = (r22 I:??[OBJECT, ARRAY]), block:B:230:0x055c */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0506  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static wf4 f(int i7, dr2 dr2Var, boolean z6, int i8, tf4 tf4Var) {
        int v6;
        int i9;
        boolean z7;
        int i10;
        boolean z8;
        boolean z9;
        String str;
        int i11;
        int i12;
        String str2;
        int i13;
        String str3;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10;
        wf4 lf4Var;
        int d7;
        String a7;
        wf4 cVar;
        int s7 = dr2Var.s();
        int s8 = dr2Var.s();
        int s9 = dr2Var.s();
        int s10 = i7 >= 3 ? dr2Var.s() : 0;
        if (i7 == 4) {
            v6 = dr2Var.v();
            if (!z6) {
                v6 = ((v6 >> 24) << 21) | (v6 & 255) | (((v6 >> 8) & 255) << 7) | (((v6 >> 16) & 255) << 14);
            }
        } else {
            v6 = i7 == 3 ? dr2Var.v() : dr2Var.u();
        }
        int w6 = i7 >= 3 ? dr2Var.w() : 0;
        wf4 wf4Var = null;
        if (s7 != 0 || s8 != 0 || s9 != 0 || s10 != 0 || v6 != 0 || w6 != 0) {
            int k7 = dr2Var.k() + v6;
            if (k7 > dr2Var.l()) {
                Log.w("Id3Decoder", "Frame size exceeds remaining tag data");
            } else {
                if (tf4Var != null) {
                    dr2Var.f(k7);
                    return null;
                }
                if (i7 == 3) {
                    i9 = (w6 & 128) != 0 ? 1 : 0;
                    boolean z11 = (w6 & 64) != 0;
                    z7 = (w6 & 32) != 0;
                    z8 = z11;
                    z9 = false;
                    i10 = i9;
                } else if (i7 == 4) {
                    boolean z12 = (w6 & 64) != 0;
                    i10 = (w6 & 8) != 0 ? 1 : 0;
                    z8 = (w6 & 4) != 0;
                    z9 = (w6 & 2) != 0;
                    int i18 = w6 & 1;
                    z7 = z12;
                    i9 = i18;
                } else {
                    i9 = 0;
                    z7 = false;
                    i10 = 0;
                    z8 = false;
                    z9 = false;
                }
                if (i10 != 0 || z8) {
                    Log.w("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
                    dr2Var.f(k7);
                    return null;
                }
                if (z7) {
                    v6--;
                    dr2Var.g(1);
                }
                if (i9 != 0) {
                    v6 -= 4;
                    dr2Var.g(4);
                }
                if (z9) {
                    v6 = e(dr2Var, v6);
                }
                try {
                    try {
                        try {
                            if (s7 == 84 && s8 == 88 && s9 == 88 && (i7 == 2 || s10 == 88)) {
                                if (v6 > 0) {
                                    int s11 = dr2Var.s();
                                    String h7 = h(s11);
                                    int i19 = v6 - 1;
                                    byte[] bArr = new byte[i19];
                                    dr2Var.b(bArr, 0, i19);
                                    int c7 = c(bArr, 0, s11);
                                    String str4 = new String(bArr, 0, c7, h7);
                                    int b7 = c7 + b(s11);
                                    cVar = new e("TXXX", str4, g(bArr, b7, c(bArr, b7, s11), h7));
                                    wf4Var = cVar;
                                }
                                i13 = s7;
                                i16 = s8;
                                i15 = s9;
                                str3 = "Id3Decoder";
                                i14 = s10;
                                i12 = k7;
                            } else if (s7 == 84) {
                                String i20 = i(i7, 84, s8, s9, s10);
                                if (v6 > 0) {
                                    int s12 = dr2Var.s();
                                    String h8 = h(s12);
                                    int i21 = v6 - 1;
                                    byte[] bArr2 = new byte[i21];
                                    dr2Var.b(bArr2, 0, i21);
                                    cVar = new e(i20, null, new String(bArr2, 0, c(bArr2, 0, s12), h8));
                                    wf4Var = cVar;
                                }
                                i13 = s7;
                                i16 = s8;
                                i15 = s9;
                                str3 = "Id3Decoder";
                                i14 = s10;
                                i12 = k7;
                            } else {
                                if (s7 != 87) {
                                    i11 = s7;
                                } else if (s8 == 88 && s9 == 88 && (i7 == 2 || s10 == 88)) {
                                    if (v6 > 0) {
                                        int s13 = dr2Var.s();
                                        String h9 = h(s13);
                                        int i22 = v6 - 1;
                                        byte[] bArr3 = new byte[i22];
                                        dr2Var.b(bArr3, 0, i22);
                                        int c8 = c(bArr3, 0, s13);
                                        String str5 = new String(bArr3, 0, c8, h9);
                                        int b8 = c8 + b(s13);
                                        cVar = new g("WXXX", str5, g(bArr3, b8, d(bArr3, b8), "ISO-8859-1"));
                                        wf4Var = cVar;
                                    }
                                    i13 = s7;
                                    i16 = s8;
                                    i15 = s9;
                                    str3 = "Id3Decoder";
                                    i14 = s10;
                                    i12 = k7;
                                } else {
                                    i11 = 87;
                                }
                                if (i11 == 87) {
                                    String i23 = i(i7, 87, s8, s9, s10);
                                    byte[] bArr4 = new byte[v6];
                                    dr2Var.b(bArr4, 0, v6);
                                    cVar = new g(i23, null, new String(bArr4, 0, d(bArr4, 0), "ISO-8859-1"));
                                } else {
                                    if (i11 == 80) {
                                        if (s8 == 82 && s9 == 73 && s10 == 86) {
                                            byte[] bArr5 = new byte[v6];
                                            dr2Var.b(bArr5, 0, v6);
                                            int d8 = d(bArr5, 0);
                                            cVar = new c(new String(bArr5, 0, d8, "ISO-8859-1"), k(bArr5, d8 + 1, v6));
                                        } else {
                                            i11 = 80;
                                        }
                                    }
                                    try {
                                        try {
                                            if (i11 != 71) {
                                                i12 = k7;
                                            } else if (s8 == 69 && s9 == 79 && (s10 == 66 || i7 == 2)) {
                                                int s14 = dr2Var.s();
                                                String h10 = h(s14);
                                                int i24 = v6 - 1;
                                                byte[] bArr6 = new byte[i24];
                                                dr2Var.b(bArr6, 0, i24);
                                                int d9 = d(bArr6, 0);
                                                i12 = k7;
                                                String str6 = new String(bArr6, 0, d9, "ISO-8859-1");
                                                int i25 = d9 + 1;
                                                int c9 = c(bArr6, i25, s14);
                                                String g7 = g(bArr6, i25, c9, h10);
                                                int b9 = c9 + b(s14);
                                                int c10 = c(bArr6, b9, s14);
                                                wf4 rf4Var = new rf4(str6, g7, g(bArr6, b9, c10, h10), k(bArr6, c10 + b(s14), i24));
                                                i13 = s7;
                                                i16 = s8;
                                                i15 = s9;
                                                wf4Var = rf4Var;
                                                str3 = "Id3Decoder";
                                                i14 = s10;
                                            } else {
                                                i12 = k7;
                                                i11 = 71;
                                            }
                                            if (i7 == 2) {
                                                if (i11 == 80 && s8 == 73 && s9 == 67) {
                                                    int s15 = dr2Var.s();
                                                    String h11 = h(s15);
                                                    int i26 = v6 - 1;
                                                    byte[] bArr7 = new byte[i26];
                                                    dr2Var.b(bArr7, 0, i26);
                                                    if (i7 == 2) {
                                                        str3 = "Id3Decoder";
                                                        String valueOf = String.valueOf(w33.a(new String(bArr7, 0, 3, "ISO-8859-1")));
                                                        a7 = valueOf.length() != 0 ? "image/".concat(valueOf) : new String("image/");
                                                        if ("image/jpg".equals(a7)) {
                                                            a7 = "image/jpeg";
                                                        }
                                                        d7 = 2;
                                                    } else {
                                                        str3 = "Id3Decoder";
                                                        d7 = d(bArr7, 0);
                                                        a7 = w33.a(new String(bArr7, 0, d7, "ISO-8859-1"));
                                                        if (a7.indexOf(47) == -1) {
                                                            a7 = a7.length() != 0 ? "image/".concat(a7) : new String("image/");
                                                        }
                                                    }
                                                    int i27 = bArr7[d7 + 1] & 255;
                                                    int i28 = d7 + 2;
                                                    int c11 = c(bArr7, i28, s15);
                                                    i13 = s7;
                                                    lf4Var = new hf4(a7, new String(bArr7, i28, c11 - i28, h11), i27, k(bArr7, c11 + b(s15), i26));
                                                    wf4Var = lf4Var;
                                                    i16 = s8;
                                                    i15 = s9;
                                                    i14 = s10;
                                                }
                                                i13 = s7;
                                                str3 = "Id3Decoder";
                                                if (i11 != 67 && s8 == 79 && s9 == 77 && (s10 == 77 || i7 == 2)) {
                                                    if (v6 < 4) {
                                                        i16 = s8;
                                                        i15 = s9;
                                                        i14 = s10;
                                                        wf4Var = null;
                                                    } else {
                                                        int s16 = dr2Var.s();
                                                        String h12 = h(s16);
                                                        byte[] bArr8 = new byte[3];
                                                        dr2Var.b(bArr8, 0, 3);
                                                        String str7 = new String(bArr8, 0, 3);
                                                        int i29 = v6 - 4;
                                                        byte[] bArr9 = new byte[i29];
                                                        dr2Var.b(bArr9, 0, i29);
                                                        int c12 = c(bArr9, 0, s16);
                                                        String str8 = new String(bArr9, 0, c12, h12);
                                                        int b10 = c12 + b(s16);
                                                        lf4Var = new pf4(str7, str8, g(bArr9, b10, c(bArr9, b10, s16), h12));
                                                        wf4Var = lf4Var;
                                                        i16 = s8;
                                                        i15 = s9;
                                                        i14 = s10;
                                                    }
                                                } else if (i11 != 67 && s8 == 72 && s9 == 65 && s10 == 80) {
                                                    int k8 = dr2Var.k();
                                                    int d10 = d(dr2Var.h(), k8);
                                                    String str9 = new String(dr2Var.h(), k8, d10 - k8, "ISO-8859-1");
                                                    dr2Var.f(d10 + 1);
                                                    int m7 = dr2Var.m();
                                                    int m8 = dr2Var.m();
                                                    long A = dr2Var.A();
                                                    if (A == 4294967295L) {
                                                        A = -1;
                                                    }
                                                    long j7 = A;
                                                    long A2 = dr2Var.A();
                                                    if (A2 == 4294967295L) {
                                                        A2 = -1;
                                                    }
                                                    long j8 = A2;
                                                    ArrayList arrayList = new ArrayList();
                                                    int i30 = k8 + v6;
                                                    while (dr2Var.k() < i30) {
                                                        wf4 f7 = f(i7, dr2Var, z6, i8, null);
                                                        if (f7 != null) {
                                                            arrayList.add(f7);
                                                        }
                                                    }
                                                    lf4Var = new lf4(str9, m7, m8, j7, j8, (wf4[]) arrayList.toArray(new wf4[0]));
                                                    wf4Var = lf4Var;
                                                    i16 = s8;
                                                    i15 = s9;
                                                    i14 = s10;
                                                } else if (i11 != 67 && s8 == 84 && s9 == 79 && s10 == 67) {
                                                    int k9 = dr2Var.k();
                                                    int d11 = d(dr2Var.h(), k9);
                                                    String str10 = new String(dr2Var.h(), k9, d11 - k9, "ISO-8859-1");
                                                    dr2Var.f(d11 + 1);
                                                    int s17 = dr2Var.s();
                                                    if ((s17 & 2) != 0) {
                                                        i17 = 1;
                                                        z10 = true;
                                                    } else {
                                                        i17 = 1;
                                                        z10 = false;
                                                    }
                                                    int i31 = s17 & i17;
                                                    int s18 = dr2Var.s();
                                                    String[] strArr = new String[s18];
                                                    int i32 = 0;
                                                    while (i32 < s18) {
                                                        int k10 = dr2Var.k();
                                                        int i33 = s18;
                                                        int d12 = d(dr2Var.h(), k10);
                                                        strArr[i32] = new String(dr2Var.h(), k10, d12 - k10, "ISO-8859-1");
                                                        dr2Var.f(d12 + 1);
                                                        i32++;
                                                        s18 = i33;
                                                        s10 = s10;
                                                        s9 = s9;
                                                        s8 = s8;
                                                    }
                                                    int i34 = s8;
                                                    int i35 = s9;
                                                    int i36 = s10;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    int i37 = k9 + v6;
                                                    while (dr2Var.k() < i37) {
                                                        wf4 f8 = f(i7, dr2Var, z6, i8, null);
                                                        if (f8 != null) {
                                                            arrayList2.add(f8);
                                                        }
                                                    }
                                                    wf4Var = new nf4(str10, z10, 1 == i31, strArr, (wf4[]) arrayList2.toArray(new wf4[0]));
                                                    i14 = i36;
                                                    i15 = i35;
                                                    i16 = i34;
                                                } else {
                                                    int i38 = s10;
                                                    if (i11 != 77) {
                                                        i16 = s8;
                                                        if (i16 == 76) {
                                                            i15 = s9;
                                                            i14 = i38;
                                                            if (i15 == 76 && i14 == 84) {
                                                                int w7 = dr2Var.w();
                                                                int u6 = dr2Var.u();
                                                                int u7 = dr2Var.u();
                                                                int s19 = dr2Var.s();
                                                                int s20 = dr2Var.s();
                                                                cq2 cq2Var = new cq2();
                                                                cq2Var.g(dr2Var.h(), dr2Var.l());
                                                                cq2Var.h(dr2Var.k() * 8);
                                                                int i39 = ((v6 - 10) * 8) / (s19 + s20);
                                                                int[] iArr = new int[i39];
                                                                int[] iArr2 = new int[i39];
                                                                for (int i40 = 0; i40 < i39; i40++) {
                                                                    int c13 = cq2Var.c(s19);
                                                                    int c14 = cq2Var.c(s20);
                                                                    iArr[i40] = c13;
                                                                    iArr2[i40] = c14;
                                                                }
                                                                wf4Var = new ag4(w7, u6, u7, iArr, iArr2);
                                                            }
                                                        } else {
                                                            i14 = i38;
                                                            i15 = s9;
                                                        }
                                                    } else {
                                                        i14 = i38;
                                                        i15 = s9;
                                                        i16 = s8;
                                                    }
                                                    String i41 = i(i7, i11, i16, i15, i14);
                                                    byte[] bArr10 = new byte[v6];
                                                    dr2Var.b(bArr10, 0, v6);
                                                    wf4Var = new jf4(i41, bArr10);
                                                }
                                            } else {
                                                if (i11 == 65) {
                                                    if (s8 == 80) {
                                                        if (s9 == 73) {
                                                        }
                                                    }
                                                }
                                                i13 = s7;
                                                str3 = "Id3Decoder";
                                                if (i11 != 67) {
                                                }
                                                if (i11 != 67) {
                                                }
                                                if (i11 != 67) {
                                                }
                                                int i382 = s10;
                                                if (i11 != 77) {
                                                }
                                                String i412 = i(i7, i11, i16, i15, i14);
                                                byte[] bArr102 = new byte[v6];
                                                dr2Var.b(bArr102, 0, v6);
                                                wf4Var = new jf4(i412, bArr102);
                                            }
                                        } catch (UnsupportedEncodingException unused) {
                                            k7 = i12;
                                            str = str2;
                                            Log.w(str, "Unsupported character encoding");
                                            dr2Var.f(k7);
                                            return null;
                                        }
                                    } catch (UnsupportedEncodingException unused2) {
                                        str = "Id3Decoder";
                                        k7 = i12;
                                        Log.w(str, "Unsupported character encoding");
                                        dr2Var.f(k7);
                                        return null;
                                    }
                                }
                                wf4Var = cVar;
                                i13 = s7;
                                i16 = s8;
                                i15 = s9;
                                str3 = "Id3Decoder";
                                i14 = s10;
                                i12 = k7;
                            }
                            if (wf4Var == null) {
                                try {
                                    String i42 = i(i7, i13, i16, i15, i14);
                                    StringBuilder sb = new StringBuilder(String.valueOf(i42).length() + 50);
                                    sb.append("Failed to decode frame: id=");
                                    sb.append(i42);
                                    sb.append(", frameSize=");
                                    sb.append(v6);
                                    str = str3;
                                    try {
                                        Log.w(str, sb.toString());
                                    } catch (UnsupportedEncodingException unused3) {
                                        k7 = i12;
                                        Log.w(str, "Unsupported character encoding");
                                        dr2Var.f(k7);
                                        return null;
                                    }
                                } catch (UnsupportedEncodingException unused4) {
                                    str = str3;
                                }
                            }
                            dr2Var.f(i12);
                            return wf4Var;
                        } catch (Throwable th) {
                            th = th;
                            dr2Var.f(k7);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        k7 = i12;
                        dr2Var.f(k7);
                        throw th;
                    }
                } catch (UnsupportedEncodingException unused5) {
                    str = "Id3Decoder";
                }
            }
        }
        dr2Var.f(dr2Var.l());
        return null;
    }

    private static String g(byte[] bArr, int i7, int i8, String str) {
        return (i8 <= i7 || i8 > bArr.length) ? "" : new String(bArr, i7, i8 - i7, str);
    }

    private static String h(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    private static String i(int i7, int i8, int i9, int i10, int i11) {
        return i7 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0085, code lost:
    
        if ((r10 & 128) != 0) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean j(dr2 dr2Var, int i7, int i8, boolean z6) {
        int u6;
        long u7;
        int i9;
        int i10;
        int k7 = dr2Var.k();
        while (true) {
            try {
                if (dr2Var.i() < i8) {
                    return true;
                }
                if (i7 >= 3) {
                    u6 = dr2Var.m();
                    u7 = dr2Var.A();
                    i9 = dr2Var.w();
                } else {
                    u6 = dr2Var.u();
                    u7 = dr2Var.u();
                    i9 = 0;
                }
                if (u6 == 0 && u7 == 0 && i9 == 0) {
                    return true;
                }
                if (i7 == 4 && !z6) {
                    if ((8421504 & u7) != 0) {
                        return false;
                    }
                    u7 = ((u7 >> 24) << 21) | ((255 & (u7 >> 16)) << 14) | (u7 & 255) | (((u7 >> 8) & 255) << 7);
                }
                if (i7 == 4) {
                    r4 = i9 & 1;
                    i10 = (i9 & 64) == 0 ? 0 : 1;
                } else {
                    if (i7 == 3) {
                        i10 = (i9 & 32) != 0 ? 1 : 0;
                    } else {
                        i10 = 0;
                    }
                    r4 = 0;
                }
                if (r4 != 0) {
                    i10 += 4;
                }
                if (u7 < i10) {
                    return false;
                }
                if (dr2Var.i() < u7) {
                    return false;
                }
                dr2Var.g((int) u7);
            } finally {
                dr2Var.f(k7);
            }
        }
    }

    private static byte[] k(byte[] bArr, int i7, int i8) {
        return i8 <= i7 ? n13.f8870f : Arrays.copyOfRange(bArr, i7, i8);
    }
}
