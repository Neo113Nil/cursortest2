package com.startapp.sdk.internal;

import java.util.ArrayList;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class oe {

    /* renamed from: a, reason: collision with root package name */
    public final u2 f366a;
    public final ArrayList b;
    public final int c;
    public final int[] d;
    public final Integer e;
    public final Integer f;
    public final int g;
    public final int h;

    public oe(u2 u2Var, ArrayList arrayList, int i, int[] iArr, Integer num, Integer num2, int i2, int i3) {
        this.f366a = u2Var;
        this.b = arrayList;
        this.c = i;
        this.d = iArr;
        this.e = num;
        this.f = num2;
        this.g = i2;
        this.h = i3;
    }

    public final boolean a(int i) {
        return (i & this.h) != 0;
    }
}
