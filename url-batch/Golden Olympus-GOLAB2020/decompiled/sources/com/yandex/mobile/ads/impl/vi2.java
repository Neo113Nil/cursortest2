package com.yandex.mobile.ads.impl;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class vi2 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String[] f33646a;

        public a(String[] strArr) {
            this.f33646a = strArr;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f33647a;

        public b(boolean z4) {
            this.f33647a = z4;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f33648a;

        /* renamed from: b, reason: collision with root package name */
        public final int f33649b;

        /* renamed from: c, reason: collision with root package name */
        public final int f33650c;

        /* renamed from: d, reason: collision with root package name */
        public final int f33651d;

        /* renamed from: e, reason: collision with root package name */
        public final int f33652e;

        /* renamed from: f, reason: collision with root package name */
        public final int f33653f;

        /* renamed from: g, reason: collision with root package name */
        public final byte[] f33654g;

        public c(int i4, int i5, int i6, int i7, int i8, int i9, byte[] bArr) {
            this.f33648a = i4;
            this.f33649b = i5;
            this.f33650c = i6;
            this.f33651d = i7;
            this.f33652e = i8;
            this.f33653f = i9;
            this.f33654g = bArr;
        }
    }

    public static a a(sf1 sf1Var, boolean z4, boolean z5) {
        if (z4) {
            a(3, sf1Var, false);
        }
        sf1Var.a((int) sf1Var.n(), un.f33183c);
        long n4 = sf1Var.n();
        String[] strArr = new String[(int) n4];
        for (int i4 = 0; i4 < n4; i4++) {
            strArr[i4] = sf1Var.a((int) sf1Var.n(), un.f33183c);
        }
        if (z5 && (sf1Var.t() & 1) == 0) {
            throw wf1.a("framing bit expected to be set", (Exception) null);
        }
        return new a(strArr);
    }

    public static c a(sf1 sf1Var) {
        a(1, sf1Var, false);
        int k4 = sf1Var.k();
        if (k4 >= 0) {
            int t4 = sf1Var.t();
            int k5 = sf1Var.k();
            if (k5 >= 0) {
                int k6 = sf1Var.k();
                int i4 = k6 <= 0 ? -1 : k6;
                int k7 = sf1Var.k();
                int i5 = k7 <= 0 ? -1 : k7;
                sf1Var.k();
                int t5 = sf1Var.t();
                int pow = (int) Math.pow(2.0d, t5 & 15);
                int pow2 = (int) Math.pow(2.0d, (t5 & 240) >> 4);
                sf1Var.t();
                return new c(t4, k5, i4, i5, pow, pow2, Arrays.copyOf(sf1Var.c(), sf1Var.e()));
            }
            throw new IllegalStateException(C1877de.a("Top bit not zero: ", k5));
        }
        throw new IllegalStateException(C1877de.a("Top bit not zero: ", k4));
    }

    public static boolean a(int i4, sf1 sf1Var, boolean z4) {
        if (sf1Var.a() < 7) {
            if (z4) {
                return false;
            }
            throw wf1.a("too short header: " + sf1Var.a(), (Exception) null);
        }
        if (sf1Var.t() != i4) {
            if (z4) {
                return false;
            }
            throw wf1.a("expected header type " + Integer.toHexString(i4), (Exception) null);
        }
        if (sf1Var.t() == 118 && sf1Var.t() == 111 && sf1Var.t() == 114 && sf1Var.t() == 98 && sf1Var.t() == 105 && sf1Var.t() == 115) {
            return true;
        }
        if (z4) {
            return false;
        }
        throw wf1.a("expected characters 'vorbis'", (Exception) null);
    }

    public static wz0 a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < list.size(); i4++) {
            String str = list.get(i4);
            int i5 = u82.f32873a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                ms0.d("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    sf1 sf1Var = new sf1(Base64.decode(split[1], 0));
                    int h4 = sf1Var.h();
                    String a4 = sf1Var.a(sf1Var.h(), un.f33181a);
                    String a5 = sf1Var.a(sf1Var.h(), un.f33183c);
                    int h5 = sf1Var.h();
                    int h6 = sf1Var.h();
                    int h7 = sf1Var.h();
                    int h8 = sf1Var.h();
                    int h9 = sf1Var.h();
                    byte[] bArr = new byte[h9];
                    sf1Var.a(bArr, 0, h9);
                    arrayList.add(new bh1(h4, a4, a5, h5, h6, h7, h8, bArr));
                } catch (RuntimeException e4) {
                    ms0.b("VorbisUtil", "Failed to parse vorbis picture", e4);
                }
            } else {
                arrayList.add(new ti2(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new wz0(arrayList);
    }
}
