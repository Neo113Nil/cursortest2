package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class ha4 {

    /* renamed from: g, reason: collision with root package name */
    private static final Comparator<ga4> f6158g = new Comparator() { // from class: com.google.android.gms.internal.ads.da4
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((ga4) obj).f5523a - ((ga4) obj2).f5523a;
        }
    };

    /* renamed from: h, reason: collision with root package name */
    private static final Comparator<ga4> f6159h = new Comparator() { // from class: com.google.android.gms.internal.ads.ea4
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((ga4) obj).f5525c, ((ga4) obj2).f5525c);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private int f6163d;

    /* renamed from: e, reason: collision with root package name */
    private int f6164e;

    /* renamed from: f, reason: collision with root package name */
    private int f6165f;

    /* renamed from: b, reason: collision with root package name */
    private final ga4[] f6161b = new ga4[5];

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<ga4> f6160a = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private int f6162c = -1;

    public ha4(int i7) {
    }

    public final float a(float f7) {
        if (this.f6162c != 0) {
            Collections.sort(this.f6160a, f6159h);
            this.f6162c = 0;
        }
        float f8 = this.f6164e * 0.5f;
        int i7 = 0;
        for (int i8 = 0; i8 < this.f6160a.size(); i8++) {
            ga4 ga4Var = this.f6160a.get(i8);
            i7 += ga4Var.f5524b;
            if (i7 >= f8) {
                return ga4Var.f5525c;
            }
        }
        if (this.f6160a.isEmpty()) {
            return Float.NaN;
        }
        return this.f6160a.get(r5.size() - 1).f5525c;
    }

    public final void b(int i7, float f7) {
        ga4 ga4Var;
        int i8;
        ga4 ga4Var2;
        int i9;
        if (this.f6162c != 1) {
            Collections.sort(this.f6160a, f6158g);
            this.f6162c = 1;
        }
        int i10 = this.f6165f;
        if (i10 > 0) {
            ga4[] ga4VarArr = this.f6161b;
            int i11 = i10 - 1;
            this.f6165f = i11;
            ga4Var = ga4VarArr[i11];
        } else {
            ga4Var = new ga4(null);
        }
        int i12 = this.f6163d;
        this.f6163d = i12 + 1;
        ga4Var.f5523a = i12;
        ga4Var.f5524b = i7;
        ga4Var.f5525c = f7;
        this.f6160a.add(ga4Var);
        int i13 = this.f6164e + i7;
        while (true) {
            this.f6164e = i13;
            while (true) {
                int i14 = this.f6164e;
                if (i14 <= 2000) {
                    return;
                }
                i8 = i14 - 2000;
                ga4Var2 = this.f6160a.get(0);
                i9 = ga4Var2.f5524b;
                if (i9 <= i8) {
                    this.f6164e -= i9;
                    this.f6160a.remove(0);
                    int i15 = this.f6165f;
                    if (i15 < 5) {
                        ga4[] ga4VarArr2 = this.f6161b;
                        this.f6165f = i15 + 1;
                        ga4VarArr2[i15] = ga4Var2;
                    }
                }
            }
            ga4Var2.f5524b = i9 - i8;
            i13 = this.f6164e - i8;
        }
    }

    public final void c() {
        this.f6160a.clear();
        this.f6162c = -1;
        this.f6163d = 0;
        this.f6164e = 0;
    }
}
