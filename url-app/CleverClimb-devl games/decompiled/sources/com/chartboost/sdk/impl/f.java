package com.chartboost.sdk.impl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f implements Comparable<f> {

    /* renamed from: a, reason: collision with root package name */
    final int f3830a;

    /* renamed from: b, reason: collision with root package name */
    final String f3831b;

    /* renamed from: c, reason: collision with root package name */
    int f3832c;
    boolean f = false;

    /* renamed from: d, reason: collision with root package name */
    com.chartboost.sdk.Model.a f3833d = null;
    Integer e = null;
    int g = 3;
    Long h = null;
    Long i = null;
    Long j = null;
    Integer k = null;
    Integer l = null;
    Integer m = null;
    Integer n = null;
    Integer o = null;
    Integer p = null;
    Integer q = null;
    Integer r = null;

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(f fVar) {
        return this.f3830a - fVar.f3830a;
    }

    f(int i, String str, int i2) {
        this.f3830a = i;
        this.f3831b = str;
        this.f3832c = i2;
    }
}
