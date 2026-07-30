package com.baidu.mapapi.map;

/* loaded from: classes2.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    public final double f6493a;

    /* renamed from: b, reason: collision with root package name */
    public final double f6494b;

    /* renamed from: c, reason: collision with root package name */
    public final double f6495c;

    /* renamed from: d, reason: collision with root package name */
    public final double f6496d;

    /* renamed from: e, reason: collision with root package name */
    public final double f6497e;

    /* renamed from: f, reason: collision with root package name */
    public final double f6498f;

    public c(double d8, double d9, double d10, double d11) {
        this.f6493a = d8;
        this.f6494b = d10;
        this.f6495c = d9;
        this.f6496d = d11;
        this.f6497e = (d8 + d9) / 2.0d;
        this.f6498f = (d10 + d11) / 2.0d;
    }

    public boolean a(double d8, double d9) {
        return this.f6493a <= d8 && d8 <= this.f6495c && this.f6494b <= d9 && d9 <= this.f6496d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("minX: " + this.f6493a);
        sb.append(" minY: " + this.f6494b);
        sb.append(" maxX: " + this.f6495c);
        sb.append(" maxY: " + this.f6496d);
        sb.append(" midX: " + this.f6497e);
        sb.append(" midY: " + this.f6498f);
        return sb.toString();
    }
}
