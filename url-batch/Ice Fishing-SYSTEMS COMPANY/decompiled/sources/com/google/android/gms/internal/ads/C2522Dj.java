package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Dj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2522Dj {

    /* renamed from: A, reason: collision with root package name */
    public static final String f24512A;

    /* renamed from: B, reason: collision with root package name */
    public static final String f24513B;

    /* renamed from: C, reason: collision with root package name */
    public static final String f24514C;

    /* renamed from: D, reason: collision with root package name */
    public static final String f24515D;

    /* renamed from: E, reason: collision with root package name */
    public static final String f24516E;

    /* renamed from: F, reason: collision with root package name */
    public static final String f24517F;

    /* renamed from: G, reason: collision with root package name */
    public static final String f24518G;

    /* renamed from: H, reason: collision with root package name */
    public static final String f24519H;

    /* renamed from: I, reason: collision with root package name */
    public static final String f24520I;

    /* renamed from: q, reason: collision with root package name */
    public static final String f24521q;

    /* renamed from: r, reason: collision with root package name */
    public static final String f24522r;

    /* renamed from: s, reason: collision with root package name */
    public static final String f24523s;

    /* renamed from: t, reason: collision with root package name */
    public static final String f24524t;

    /* renamed from: u, reason: collision with root package name */
    public static final String f24525u;

    /* renamed from: v, reason: collision with root package name */
    public static final String f24526v;

    /* renamed from: w, reason: collision with root package name */
    public static final String f24527w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f24528x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f24529y;

    /* renamed from: z, reason: collision with root package name */
    public static final String f24530z;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f24531a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f24532b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f24533c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f24534d;

    /* renamed from: e, reason: collision with root package name */
    public final float f24535e;

    /* renamed from: f, reason: collision with root package name */
    public final int f24536f;

    /* renamed from: g, reason: collision with root package name */
    public final int f24537g;

    /* renamed from: h, reason: collision with root package name */
    public final float f24538h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final float f24539j;

    /* renamed from: k, reason: collision with root package name */
    public final float f24540k;

    /* renamed from: l, reason: collision with root package name */
    public final int f24541l;

    /* renamed from: m, reason: collision with root package name */
    public final float f24542m;

    /* renamed from: n, reason: collision with root package name */
    public final int f24543n;

    /* renamed from: o, reason: collision with root package name */
    public final float f24544o;

    /* renamed from: p, reason: collision with root package name */
    public final int f24545p;

    static {
        Layout.Alignment alignment = null;
        float f6 = -3.4028235E38f;
        int i = Integer.MIN_VALUE;
        new C2522Dj("", alignment, alignment, null, f6, i, i, f6, i, i, f6, f6, f6, i, 0.0f, 0);
        String str = AbstractC3548lu.f32613a;
        f24521q = Integer.toString(0, 36);
        f24522r = Integer.toString(17, 36);
        f24523s = Integer.toString(1, 36);
        f24524t = Integer.toString(2, 36);
        Integer.toString(3, 36);
        f24525u = Integer.toString(18, 36);
        f24526v = Integer.toString(4, 36);
        f24527w = Integer.toString(5, 36);
        f24528x = Integer.toString(6, 36);
        f24529y = Integer.toString(7, 36);
        f24530z = Integer.toString(8, 36);
        f24512A = Integer.toString(9, 36);
        f24513B = Integer.toString(10, 36);
        f24514C = Integer.toString(11, 36);
        f24515D = Integer.toString(12, 36);
        f24516E = Integer.toString(13, 36);
        f24517F = Integer.toString(14, 36);
        f24518G = Integer.toString(15, 36);
        f24519H = Integer.toString(16, 36);
        f24520I = Integer.toString(19, 36);
    }

    public /* synthetic */ C2522Dj(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f6, int i, int i4, float f9, int i9, int i10, float f10, float f11, float f12, int i11, float f13, int i12) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            PA.n(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f24531a = SpannedString.valueOf(charSequence);
        } else {
            this.f24531a = charSequence != null ? charSequence.toString() : null;
        }
        this.f24532b = alignment;
        this.f24533c = alignment2;
        this.f24534d = bitmap;
        this.f24535e = f6;
        this.f24536f = i;
        this.f24537g = i4;
        this.f24538h = f9;
        this.i = i9;
        this.f24539j = f11;
        this.f24540k = f12;
        this.f24541l = i10;
        this.f24542m = f10;
        this.f24543n = i11;
        this.f24544o = f13;
        this.f24545p = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2522Dj.class != obj.getClass()) {
            return false;
        }
        C2522Dj c2522Dj = (C2522Dj) obj;
        if (!TextUtils.equals(this.f24531a, c2522Dj.f24531a) || this.f24532b != c2522Dj.f24532b || this.f24533c != c2522Dj.f24533c) {
            return false;
        }
        Bitmap bitmap = c2522Dj.f24534d;
        Bitmap bitmap2 = this.f24534d;
        if (bitmap2 == null) {
            if (bitmap != null) {
                return false;
            }
        } else if (bitmap == null || !bitmap2.sameAs(bitmap)) {
            return false;
        }
        return this.f24535e == c2522Dj.f24535e && this.f24536f == c2522Dj.f24536f && this.f24537g == c2522Dj.f24537g && this.f24538h == c2522Dj.f24538h && this.i == c2522Dj.i && this.f24539j == c2522Dj.f24539j && this.f24540k == c2522Dj.f24540k && this.f24541l == c2522Dj.f24541l && this.f24542m == c2522Dj.f24542m && this.f24543n == c2522Dj.f24543n && this.f24544o == c2522Dj.f24544o && this.f24545p == c2522Dj.f24545p;
    }

    public final int hashCode() {
        Float valueOf = Float.valueOf(this.f24535e);
        Integer valueOf2 = Integer.valueOf(this.f24536f);
        Integer valueOf3 = Integer.valueOf(this.f24537g);
        Float valueOf4 = Float.valueOf(this.f24538h);
        Integer valueOf5 = Integer.valueOf(this.i);
        Float valueOf6 = Float.valueOf(this.f24539j);
        Float valueOf7 = Float.valueOf(this.f24540k);
        Boolean bool = Boolean.FALSE;
        Integer valueOf8 = Integer.valueOf(this.f24541l);
        Float valueOf9 = Float.valueOf(this.f24542m);
        Integer valueOf10 = Integer.valueOf(this.f24543n);
        Float valueOf11 = Float.valueOf(this.f24544o);
        Integer valueOf12 = Integer.valueOf(this.f24545p);
        return Objects.hash(this.f24531a, this.f24532b, this.f24533c, this.f24534d, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, bool, -16777216, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12);
    }
}
