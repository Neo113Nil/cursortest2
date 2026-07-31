package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class fu {

    /* renamed from: t, reason: collision with root package name */
    public static final fu f5219t = new fu(new ds());

    /* renamed from: u, reason: collision with root package name */
    public static final my3<fu> f5220u = new my3() { // from class: com.google.android.gms.internal.ads.bq
    };

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f5221a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f5222b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f5223c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f5224d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f5225e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f5226f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f5227g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f5228h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f5229i;

    /* renamed from: j, reason: collision with root package name */
    @Deprecated
    public final Integer f5230j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f5231k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f5232l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f5233m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f5234n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f5235o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f5236p;

    /* renamed from: q, reason: collision with root package name */
    public final CharSequence f5237q;

    /* renamed from: r, reason: collision with root package name */
    public final CharSequence f5238r;

    /* renamed from: s, reason: collision with root package name */
    public final CharSequence f5239s;

    private fu(ds dsVar) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        byte[] bArr;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        Integer num9;
        Integer num10;
        CharSequence charSequence6;
        CharSequence charSequence7;
        CharSequence charSequence8;
        charSequence = dsVar.f4292a;
        this.f5221a = charSequence;
        charSequence2 = dsVar.f4293b;
        this.f5222b = charSequence2;
        charSequence3 = dsVar.f4294c;
        this.f5223c = charSequence3;
        charSequence4 = dsVar.f4295d;
        this.f5224d = charSequence4;
        charSequence5 = dsVar.f4296e;
        this.f5225e = charSequence5;
        bArr = dsVar.f4297f;
        this.f5226f = bArr;
        num = dsVar.f4298g;
        this.f5227g = num;
        num2 = dsVar.f4299h;
        this.f5228h = num2;
        num3 = dsVar.f4300i;
        this.f5229i = num3;
        num4 = dsVar.f4301j;
        this.f5230j = num4;
        num5 = dsVar.f4301j;
        this.f5231k = num5;
        num6 = dsVar.f4302k;
        this.f5232l = num6;
        num7 = dsVar.f4303l;
        this.f5233m = num7;
        num8 = dsVar.f4304m;
        this.f5234n = num8;
        num9 = dsVar.f4305n;
        this.f5235o = num9;
        num10 = dsVar.f4306o;
        this.f5236p = num10;
        charSequence6 = dsVar.f4307p;
        this.f5237q = charSequence6;
        charSequence7 = dsVar.f4308q;
        this.f5238r = charSequence7;
        charSequence8 = dsVar.f4309r;
        this.f5239s = charSequence8;
    }

    public final ds a() {
        return new ds(this, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fu.class == obj.getClass()) {
            fu fuVar = (fu) obj;
            if (n13.p(this.f5221a, fuVar.f5221a) && n13.p(this.f5222b, fuVar.f5222b) && n13.p(this.f5223c, fuVar.f5223c) && n13.p(this.f5224d, fuVar.f5224d) && n13.p(null, null) && n13.p(null, null) && n13.p(this.f5225e, fuVar.f5225e) && n13.p(null, null) && n13.p(null, null) && n13.p(null, null) && Arrays.equals(this.f5226f, fuVar.f5226f) && n13.p(this.f5227g, fuVar.f5227g) && n13.p(null, null) && n13.p(this.f5228h, fuVar.f5228h) && n13.p(this.f5229i, fuVar.f5229i) && n13.p(null, null) && n13.p(null, null) && n13.p(this.f5231k, fuVar.f5231k) && n13.p(this.f5232l, fuVar.f5232l) && n13.p(this.f5233m, fuVar.f5233m) && n13.p(this.f5234n, fuVar.f5234n) && n13.p(this.f5235o, fuVar.f5235o) && n13.p(this.f5236p, fuVar.f5236p) && n13.p(this.f5237q, fuVar.f5237q) && n13.p(this.f5238r, fuVar.f5238r) && n13.p(this.f5239s, fuVar.f5239s) && n13.p(null, null) && n13.p(null, null) && n13.p(null, null) && n13.p(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5221a, this.f5222b, this.f5223c, this.f5224d, null, null, this.f5225e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f5226f)), this.f5227g, null, this.f5228h, this.f5229i, null, null, this.f5231k, this.f5232l, this.f5233m, this.f5234n, this.f5235o, this.f5236p, this.f5237q, this.f5238r, this.f5239s, null, null, null, null});
    }
}
