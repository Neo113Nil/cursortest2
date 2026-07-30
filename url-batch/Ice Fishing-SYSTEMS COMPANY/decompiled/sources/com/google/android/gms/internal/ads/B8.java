package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class B8 {

    /* renamed from: a, reason: collision with root package name */
    public final int f23997a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23998b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23999c;

    /* renamed from: d, reason: collision with root package name */
    public final TP[] f24000d;

    /* renamed from: e, reason: collision with root package name */
    public int f24001e;

    static {
        String str = AbstractC3548lu.f32613a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public B8(String str, TP... tpArr) {
        int length = tpArr.length;
        int i = 1;
        PA.n(length > 0);
        this.f23998b = str;
        this.f24000d = tpArr;
        this.f23997a = length;
        String str2 = tpArr[0].f27776o;
        this.f23999c = TextUtils.isEmpty(str2) ? K4.f(tpArr[0].f27775n) : K4.f(str2);
        TP tp = tpArr[0];
        String str3 = tp.f27766d;
        str3 = (str3 == null || str3.equals(com.anythink.basead.exoplayer.b.ar)) ? "" : str3;
        int i4 = tp.f27768f | 16384;
        while (true) {
            TP[] tpArr2 = this.f24000d;
            if (i >= tpArr2.length) {
                return;
            }
            TP tp2 = tpArr2[i];
            String str4 = tp2.f27766d;
            if (!str3.equals((str4 == null || str4.equals(com.anythink.basead.exoplayer.b.ar)) ? "" : str4)) {
                a("languages", tpArr2[0].f27766d, str4, i);
                return;
            } else {
                if (i4 != (tp2.f27768f | 16384)) {
                    a("role flags", Integer.toBinaryString(tpArr2[0].f27768f), Integer.toBinaryString(this.f24000d[i].f27768f), i);
                    return;
                }
                i++;
            }
        }
    }

    public static void a(String str, String str2, String str3, int i) {
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(str.length() + 40 + length + 17 + length2 + 9 + String.valueOf(i).length() + 1);
        AbstractC5051n.j(sb, "Different ", str, " combined in one TrackGroup: '", str2);
        sb.append("' (track 0) and '");
        sb.append(str3);
        sb.append("' (track ");
        sb.append(i);
        sb.append(")");
        AbstractC3217fl.X("TrackGroup", "", new IllegalStateException(sb.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && B8.class == obj.getClass()) {
            B8 b82 = (B8) obj;
            if (this.f23998b.equals(b82.f23998b) && Arrays.equals(this.f24000d, b82.f24000d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f24001e;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f24000d) + ((this.f23998b.hashCode() + 527) * 31);
        this.f24001e = hashCode;
        return hashCode;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f24000d);
        String str = this.f23998b;
        return D.y.o(new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(arrays).length()), str, ": ", arrays);
    }
}
