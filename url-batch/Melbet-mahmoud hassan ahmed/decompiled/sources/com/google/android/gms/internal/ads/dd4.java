package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class dd4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4171a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4172b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4173c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4174d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4175e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4176f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4177g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4178h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4179i;

    /* renamed from: j, reason: collision with root package name */
    public final long f4180j;

    /* renamed from: k, reason: collision with root package name */
    public final cd4 f4181k;

    /* renamed from: l, reason: collision with root package name */
    private final c91 f4182l;

    private dd4(int i7, int i8, int i9, int i10, int i11, int i12, int i13, long j7, cd4 cd4Var, c91 c91Var) {
        this.f4171a = i7;
        this.f4172b = i8;
        this.f4173c = i9;
        this.f4174d = i10;
        this.f4175e = i11;
        this.f4176f = i(i11);
        this.f4177g = i12;
        this.f4178h = i13;
        this.f4179i = h(i13);
        this.f4180j = j7;
        this.f4181k = cd4Var;
        this.f4182l = c91Var;
    }

    public dd4(byte[] bArr, int i7) {
        cq2 cq2Var = new cq2(bArr, bArr.length);
        cq2Var.h(i7 * 8);
        this.f4171a = cq2Var.c(16);
        this.f4172b = cq2Var.c(16);
        this.f4173c = cq2Var.c(24);
        this.f4174d = cq2Var.c(24);
        int c7 = cq2Var.c(20);
        this.f4175e = c7;
        this.f4176f = i(c7);
        this.f4177g = cq2Var.c(3) + 1;
        int c8 = cq2Var.c(5) + 1;
        this.f4178h = c8;
        this.f4179i = h(c8);
        this.f4180j = n13.b0(cq2Var.c(4), cq2Var.c(32));
        this.f4181k = null;
        this.f4182l = null;
    }

    private static int h(int i7) {
        if (i7 == 8) {
            return 1;
        }
        if (i7 == 12) {
            return 2;
        }
        if (i7 == 16) {
            return 4;
        }
        if (i7 != 20) {
            return i7 != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int i(int i7) {
        switch (i7) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    private static c91 j(List<String> list, List<af4> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            String str = list.get(i7);
            String[] E = n13.E(str, "=");
            if (E.length != 2) {
                String valueOf = String.valueOf(str);
                Log.w("FlacStreamMetadata", valueOf.length() != 0 ? "Failed to parse Vorbis comment: ".concat(valueOf) : new String("Failed to parse Vorbis comment: "));
            } else {
                arrayList.add(new df4(E[0], E[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c91(arrayList);
    }

    public final long a() {
        long j7 = this.f4180j;
        if (j7 == 0) {
            return -9223372036854775807L;
        }
        return (j7 * 1000000) / this.f4175e;
    }

    public final long b(long j7) {
        return n13.U((j7 * this.f4175e) / 1000000, 0L, this.f4180j - 1);
    }

    public final c0 c(byte[] bArr, c91 c91Var) {
        bArr[4] = Byte.MIN_VALUE;
        int i7 = this.f4174d;
        if (i7 <= 0) {
            i7 = -1;
        }
        c91 d7 = d(c91Var);
        bf4 bf4Var = new bf4();
        bf4Var.s("audio/flac");
        bf4Var.l(i7);
        bf4Var.e0(this.f4177g);
        bf4Var.t(this.f4175e);
        bf4Var.i(Collections.singletonList(bArr));
        bf4Var.m(d7);
        return bf4Var.y();
    }

    public final c91 d(c91 c91Var) {
        c91 c91Var2 = this.f4182l;
        return c91Var2 == null ? c91Var : c91Var2.h(c91Var);
    }

    public final dd4 e(List<af4> list) {
        return new dd4(this.f4171a, this.f4172b, this.f4173c, this.f4174d, this.f4175e, this.f4177g, this.f4178h, this.f4180j, this.f4181k, d(j(Collections.emptyList(), list)));
    }

    public final dd4 f(cd4 cd4Var) {
        return new dd4(this.f4171a, this.f4172b, this.f4173c, this.f4174d, this.f4175e, this.f4177g, this.f4178h, this.f4180j, cd4Var, this.f4182l);
    }

    public final dd4 g(List<String> list) {
        return new dd4(this.f4171a, this.f4172b, this.f4173c, this.f4174d, this.f4175e, this.f4177g, this.f4178h, this.f4180j, this.f4181k, d(j(list, Collections.emptyList())));
    }
}
