package com.anythink.core.common.h;

/* loaded from: classes.dex */
public class ca {

    /* renamed from: a, reason: collision with root package name */
    public String f14036a;

    /* renamed from: b, reason: collision with root package name */
    public String f14037b;

    /* renamed from: c, reason: collision with root package name */
    public int f14038c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14039d;

    /* renamed from: e, reason: collision with root package name */
    private final double f14040e;

    public ca(int i, String str, String str2, double d2, String str3) {
        this.f14038c = i;
        this.f14036a = str;
        this.f14037b = str3;
        this.f14040e = d2;
        this.f14039d = str2;
    }

    private String c() {
        return this.f14036a;
    }

    private String d() {
        return this.f14037b;
    }

    private int e() {
        return this.f14038c;
    }

    public final double a() {
        return this.f14040e;
    }

    public final String b() {
        return this.f14039d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{channelId='");
        sb.append(this.f14036a);
        sb.append("', bidType='");
        sb.append(this.f14039d);
        sb.append("', price=");
        sb.append(this.f14040e);
        sb.append(", adnPlacementId='");
        sb.append(this.f14037b);
        sb.append("', filterType=");
        return D.y.m(sb, this.f14038c, '}');
    }
}
