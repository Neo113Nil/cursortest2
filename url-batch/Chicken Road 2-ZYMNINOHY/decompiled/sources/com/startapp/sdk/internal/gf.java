package com.startapp.sdk.internal;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class gf {

    /* renamed from: a, reason: collision with root package name */
    public final z2 f6989a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f6990b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6991c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f6992d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f6993e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f6994f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6995g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6996h;

    public gf(z2 z2Var, ArrayList arrayList, int i4, int[] iArr, Integer num, Integer num2, int i5, int i6) {
        this.f6989a = z2Var;
        this.f6990b = arrayList;
        this.f6991c = i4;
        this.f6992d = iArr;
        this.f6993e = num;
        this.f6994f = num2;
        this.f6995g = i5;
        this.f6996h = i6;
    }

    public final boolean a(int i4) {
        return (i4 & this.f6996h) != 0;
    }
}
