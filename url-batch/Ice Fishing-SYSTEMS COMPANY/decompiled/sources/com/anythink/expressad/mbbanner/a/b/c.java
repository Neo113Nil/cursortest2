package com.anythink.expressad.mbbanner.a.b;

import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.expressad.foundation.h.n;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f20014a = "2000067";

    /* renamed from: b, reason: collision with root package name */
    public static final String f20015b = "2000068";

    /* renamed from: c, reason: collision with root package name */
    public static final String f20016c = "2000069";

    /* renamed from: d, reason: collision with root package name */
    private String f20017d;

    /* renamed from: e, reason: collision with root package name */
    private String f20018e;

    /* renamed from: f, reason: collision with root package name */
    private String f20019f;

    /* renamed from: g, reason: collision with root package name */
    private String f20020g;

    /* renamed from: h, reason: collision with root package name */
    private String f20021h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private String f20022j;

    /* renamed from: k, reason: collision with root package name */
    private String f20023k;

    /* renamed from: l, reason: collision with root package name */
    private int f20024l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f20025m;

    private c() {
    }

    private c a(boolean z8) {
        this.f20025m = z8;
        return this;
    }

    private String b() {
        return this.f20017d;
    }

    private String c() {
        return this.f20018e;
    }

    private String d() {
        return this.f20019f;
    }

    private String e() {
        return this.f20020g;
    }

    private String f() {
        return this.f20021h;
    }

    private String g() {
        return this.i;
    }

    private String h() {
        return this.f20022j;
    }

    private String i() {
        return this.f20023k;
    }

    private int j() {
        return this.f20024l;
    }

    private String k() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.f20018e)) {
            sb.append("unit_id=");
            sb.append(this.f20018e);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f20020g)) {
            sb.append("cid=");
            sb.append(this.f20020g);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f20021h)) {
            sb.append("rid=");
            sb.append(this.f20021h);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.i)) {
            sb.append("rid_n=");
            sb.append(this.i);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f20022j)) {
            sb.append("creative_id=");
            sb.append(this.f20022j);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f20023k)) {
            sb.append("reason=");
            sb.append(this.f20023k);
            sb.append("&");
        }
        if (this.f20024l != 0) {
            sb.append("result=");
            sb.append(this.f20024l);
            sb.append("&");
        }
        if (this.f20025m) {
            sb.append("hb=1&");
        }
        sb.append("network_type=");
        t.b().g();
        sb.append(n.b());
        sb.append("&");
        if (!TextUtils.isEmpty(this.f20017d)) {
            sb.append("key=");
            sb.append(this.f20017d);
        }
        return sb.toString();
    }

    private static c a() {
        return new c();
    }

    private c b(String str) {
        this.f20018e = str;
        return this;
    }

    private c c(String str) {
        this.f20019f = str;
        return this;
    }

    private c d(String str) {
        this.f20020g = str;
        return this;
    }

    private c e(String str) {
        this.f20021h = str;
        return this;
    }

    private c f(String str) {
        this.i = str;
        return this;
    }

    private c g(String str) {
        this.f20022j = str;
        return this;
    }

    private c h(String str) {
        this.f20023k = str;
        return this;
    }

    private c a(String str) {
        this.f20017d = str;
        return this;
    }

    private c a(int i) {
        this.f20024l = i;
        return this;
    }
}
