package com.anythink.expressad.out;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.io.Serializable;

/* loaded from: classes.dex */
public class k implements com.anythink.expressad.foundation.g.d.c, com.anythink.expressad.g.b, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final long f20193a = 1;
    public static final int dg = 1;
    public static final int dh = 2;
    public static final int di = 3;
    public String dj;

    /* renamed from: j, reason: collision with root package name */
    private double f20201j;

    /* renamed from: l, reason: collision with root package name */
    private Object f20203l;

    /* renamed from: n, reason: collision with root package name */
    private String f20205n;

    /* renamed from: o, reason: collision with root package name */
    private Drawable f20206o;

    /* renamed from: p, reason: collision with root package name */
    private Drawable f20207p;

    /* renamed from: q, reason: collision with root package name */
    private r f20208q;

    /* renamed from: b, reason: collision with root package name */
    private String f20194b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f20195c = "";

    /* renamed from: d, reason: collision with root package name */
    private String f20196d = "";

    /* renamed from: e, reason: collision with root package name */
    private String f20197e = "";

    /* renamed from: f, reason: collision with root package name */
    private String f20198f = "";

    /* renamed from: g, reason: collision with root package name */
    private String f20199g = "";

    /* renamed from: h, reason: collision with root package name */
    private String f20200h = "";
    private long i = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f20202k = 33333;

    /* renamed from: m, reason: collision with root package name */
    private int f20204m = 1;

    /* renamed from: r, reason: collision with root package name */
    private int f20209r = 0;

    /* renamed from: s, reason: collision with root package name */
    private int f20210s = 0;

    /* renamed from: t, reason: collision with root package name */
    private int f20211t = 0;

    private Drawable b() {
        return this.f20207p;
    }

    private void c(r rVar) {
        this.f20208q = rVar;
    }

    private String d() {
        return this.dj;
    }

    private int e() {
        return this.f20209r;
    }

    private int f() {
        return this.f20210s;
    }

    private String g() {
        return this.f20205n;
    }

    public final void A(String str) {
        this.f20199g = str;
    }

    public final void B(String str) {
        this.f20200h = str;
    }

    public final void C(String str) {
        this.f20198f = str;
    }

    @Override // com.anythink.expressad.foundation.g.d.c
    public final void a(String str, String str2) {
    }

    public final double bf() {
        return this.f20201j;
    }

    public final int bg() {
        return this.f20202k;
    }

    public final String bh() {
        return this.f20194b;
    }

    public final String bi() {
        return this.f20195c;
    }

    public final String bj() {
        return this.f20196d;
    }

    public final String bk() {
        return this.f20197e;
    }

    public final String bl() {
        return this.f20199g;
    }

    public final String bm() {
        return this.f20200h;
    }

    public final int bn() {
        return this.f20204m;
    }

    public final long bo() {
        return this.i;
    }

    public final String bp() {
        return this.f20198f;
    }

    public final int bq() {
        return this.f20211t;
    }

    public void o(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.dj = str;
    }

    public final void r(int i) {
        if (i > 0) {
            this.f20202k = i;
        }
    }

    public final void s(int i) {
        this.f20204m = i;
    }

    public final void t(int i) {
        this.f20211t = i;
    }

    public final void w(String str) {
        this.f20194b = str;
    }

    public final void x(String str) {
        this.f20195c = str;
    }

    public final void y(String str) {
        this.f20196d = str;
    }

    public final void z(String str) {
        this.f20197e = str;
    }

    private Drawable a() {
        return this.f20206o;
    }

    private void b(r rVar) {
        this.f20208q = rVar;
        if (TextUtils.isEmpty(this.f20200h)) {
            return;
        }
        com.anythink.basead.b.c.i.m().a(this.f20200h, this);
    }

    private Object c() {
        return this.f20203l;
    }

    private void a(r rVar) {
        this.f20208q = rVar;
        if (TextUtils.isEmpty(this.f20199g)) {
            return;
        }
        com.anythink.basead.b.c.i.m().a(this.f20199g, this);
    }

    private void b(int i) {
        this.f20210s = i;
    }

    private void b(Drawable drawable) {
        this.f20207p = drawable;
    }

    public final void a(double d2) {
        this.f20201j = d2;
    }

    private void a(Object obj) {
        this.f20203l = obj;
    }

    public final void a(long j9) {
        this.i = j9;
    }

    private void a(int i) {
        this.f20209r = i;
    }

    private void a(String str) {
        this.f20205n = str;
    }

    private static Drawable a(Bitmap bitmap) {
        return new BitmapDrawable(bitmap);
    }

    private void a(Drawable drawable) {
        this.f20206o = drawable;
    }

    @Override // com.anythink.expressad.foundation.g.d.c
    public final void a(Bitmap bitmap, String str) {
        String str2;
        if (!TextUtils.isEmpty(this.f20200h) && this.f20200h.equals(str) && bitmap != null) {
            this.f20207p = a(bitmap);
            if (this.f20208q != null) {
                a(bitmap);
            }
        }
        if (TextUtils.isEmpty(this.f20199g) || (str2 = this.f20199g) == null || !str2.equals(str) || bitmap == null) {
            return;
        }
        this.f20206o = a(bitmap);
        if (this.f20208q != null) {
            a(bitmap);
        }
    }
}
