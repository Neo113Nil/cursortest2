package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class w30 extends e40 {

    /* renamed from: n, reason: collision with root package name */
    private static final int f13676n;

    /* renamed from: o, reason: collision with root package name */
    private static final int f13677o;

    /* renamed from: p, reason: collision with root package name */
    static final int f13678p;

    /* renamed from: q, reason: collision with root package name */
    static final int f13679q;

    /* renamed from: f, reason: collision with root package name */
    private final String f13680f;

    /* renamed from: g, reason: collision with root package name */
    private final List<z30> f13681g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final List<n40> f13682h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private final int f13683i;

    /* renamed from: j, reason: collision with root package name */
    private final int f13684j;

    /* renamed from: k, reason: collision with root package name */
    private final int f13685k;

    /* renamed from: l, reason: collision with root package name */
    private final int f13686l;

    /* renamed from: m, reason: collision with root package name */
    private final int f13687m;

    static {
        int rgb = Color.rgb(12, 174, 206);
        f13676n = rgb;
        int rgb2 = Color.rgb(204, 204, 204);
        f13677o = rgb2;
        f13678p = rgb2;
        f13679q = rgb;
    }

    public w30(String str, List<z30> list, Integer num, Integer num2, Integer num3, int i7, int i8, boolean z6) {
        this.f13680f = str;
        for (int i9 = 0; i9 < list.size(); i9++) {
            z30 z30Var = list.get(i9);
            this.f13681g.add(z30Var);
            this.f13682h.add(z30Var);
        }
        this.f13683i = num != null ? num.intValue() : f13678p;
        this.f13684j = num2 != null ? num2.intValue() : f13679q;
        this.f13685k = num3 != null ? num3.intValue() : 12;
        this.f13686l = i7;
        this.f13687m = i8;
    }

    public final int a() {
        return this.f13686l;
    }

    public final int b() {
        return this.f13684j;
    }

    public final int c() {
        return this.f13687m;
    }

    @Override // com.google.android.gms.internal.ads.g40
    public final String e() {
        return this.f13680f;
    }

    @Override // com.google.android.gms.internal.ads.g40
    public final List<n40> f() {
        return this.f13682h;
    }

    public final int g() {
        return this.f13683i;
    }

    public final int t6() {
        return this.f13685k;
    }

    public final List<z30> u6() {
        return this.f13681g;
    }
}
