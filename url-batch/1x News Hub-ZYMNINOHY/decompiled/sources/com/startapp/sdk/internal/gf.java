package com.startapp.sdk.internal;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class gf {

    /* renamed from: a, reason: collision with root package name */
    public final z2 f3868a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3869b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3870c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f3871d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f3872e;
    public final Integer f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3873g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3874h;

    public gf(z2 z2Var, ArrayList arrayList, int i3, int[] iArr, Integer num, Integer num2, int i4, int i5) {
        this.f3868a = z2Var;
        this.f3869b = arrayList;
        this.f3870c = i3;
        this.f3871d = iArr;
        this.f3872e = num;
        this.f = num2;
        this.f3873g = i4;
        this.f3874h = i5;
    }

    public final boolean a(int i3) {
        return (i3 & this.f3874h) != 0;
    }
}
