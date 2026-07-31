package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.system.SystemPropertiesHelper;
import java.io.File;
import kotlin.text.StringsKt;

/* renamed from: io.appmetrica.analytics.impl.c4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0088c4 {
    public static volatile C0088c4 w;

    /* renamed from: a, reason: collision with root package name */
    public final C0496s6 f1189a;
    public final E7 b;
    public final S3 c;
    public final G1 d;
    public final C0390o e;
    public final Xk f;
    public final F5 g;
    public final C0340m h;
    public final C0389nn i;
    public C0603wd j;
    public final C0465r0 k;
    public volatile Z3 l;
    public final Tc m;
    public volatile We n;
    public C0103cj o;
    public final C0665z0 p;
    public final L1 q;
    public final C0120da r;
    public volatile C0058b0 s;
    public volatile N9 t;
    public volatile H7 u;
    public volatile C0114d4 v;

    public C0088c4(C0496s6 c0496s6, C0390o c0390o, S3 s3) {
        this(c0496s6, c0390o, s3, new C0340m(c0390o));
    }

    public static C0088c4 l() {
        if (w == null) {
            synchronized (C0088c4.class) {
                if (w == null) {
                    w = new C0088c4(new C0496s6(), new C0390o(), new S3());
                }
            }
        }
        return w;
    }

    public final C0390o a() {
        return this.e;
    }

    public final We b(Context context) {
        We we;
        We we2 = this.n;
        if (we2 != null) {
            return we2;
        }
        synchronized (this) {
            we = this.n;
            if (we == null) {
                we = new We(c(context).a(context));
                this.n = we;
            }
        }
        return we;
    }

    public final C0465r0 c() {
        return this.k;
    }

    public final C0665z0 d() {
        return this.p;
    }

    public final G1 e() {
        return this.d;
    }

    public final L1 f() {
        return this.q;
    }

    public final S3 g() {
        return this.c;
    }

    public final F5 h() {
        return this.g;
    }

    public final C0496s6 i() {
        return this.f1189a;
    }

    public final E7 j() {
        return this.b;
    }

    public final C0120da k() {
        return this.r;
    }

    public final Z3 m() {
        Z3 z3;
        Z3 z32 = this.l;
        if (z32 != null) {
            return z32;
        }
        synchronized (this) {
            z3 = this.l;
            if (z3 == null) {
                z3 = new Z3();
                this.l = z3;
            }
        }
        return z3;
    }

    public final C0496s6 n() {
        return this.f1189a;
    }

    public final Xk o() {
        return this.f;
    }

    public C0088c4(C0496s6 c0496s6, C0390o c0390o, S3 s3, C0340m c0340m) {
        this(c0496s6, new E7(), s3, c0340m, new G1(), c0390o, new Xk(c0390o, c0340m), new F5(c0390o), new C0389nn(), new C0465r0());
    }

    public final synchronized C0603wd a(Context context) {
        if (this.j == null) {
            this.j = new C0603wd(context, new no());
        }
        return this.j;
    }

    public final C0114d4 c(Context context) {
        C0114d4 c0114d4;
        File file;
        C0114d4 c0114d42 = this.v;
        if (c0114d42 != null) {
            return c0114d42;
        }
        synchronized (this) {
            c0114d4 = this.v;
            if (c0114d4 == null) {
                String readSystemProperty = SystemPropertiesHelper.readSystemProperty("ro.yndx.metrica.db.dir");
                String readSystemProperty2 = SystemPropertiesHelper.readSystemProperty("debug.yndx.iaa.db.dir");
                if (StringsKt.isBlank(readSystemProperty)) {
                    readSystemProperty = readSystemProperty2;
                }
                if (!StringsKt.isBlank(readSystemProperty)) {
                    file = new File(readSystemProperty, context.getPackageName());
                    try {
                        file.mkdirs();
                    } catch (Exception unused) {
                    }
                    c0114d4 = new C0114d4(file);
                    this.v = c0114d4;
                }
                file = null;
                c0114d4 = new C0114d4(file);
                this.v = c0114d4;
            }
        }
        return c0114d4;
    }

    public C0088c4(C0496s6 c0496s6, E7 e7, S3 s3, C0340m c0340m, G1 g1, C0390o c0390o, Xk xk, F5 f5, C0389nn c0389nn, C0465r0 c0465r0) {
        this.m = new Tc();
        this.p = new C0665z0();
        this.q = new L1();
        this.r = new C0120da();
        new D7();
        this.u = new H7();
        this.f1189a = c0496s6;
        this.b = e7;
        this.c = s3;
        this.h = c0340m;
        this.d = g1;
        this.e = c0390o;
        this.f = xk;
        this.g = f5;
        this.i = c0389nn;
        this.k = c0465r0;
    }

    public final C0058b0 b() {
        C0058b0 c0058b0;
        C0058b0 c0058b02 = this.s;
        if (c0058b02 != null) {
            return c0058b02;
        }
        synchronized (this) {
            c0058b0 = this.s;
            if (c0058b0 == null) {
                c0058b0 = new C0058b0(this.p, this.f, this.c);
                this.s = c0058b0;
            }
        }
        return c0058b0;
    }
}
