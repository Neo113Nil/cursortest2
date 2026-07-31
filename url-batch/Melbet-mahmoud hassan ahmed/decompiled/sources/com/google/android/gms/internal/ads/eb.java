package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class eb extends db {
    protected static final Object C = new Object();
    private static final String D = "eb";
    static boolean E = false;
    private static long F;
    private static jb G;
    protected final String A;
    nc B;

    /* renamed from: z, reason: collision with root package name */
    protected final boolean f4549z;

    protected eb(Context context, String str, boolean z6) {
        super(context);
        this.A = str;
        this.f4549z = z6;
    }

    protected static gc o(Context context, boolean z6) {
        if (db.f4130y == null) {
            synchronized (C) {
                if (db.f4130y == null) {
                    gc g7 = gc.g(context, "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", z6);
                    if (g7.r()) {
                        try {
                            if (((Boolean) sw.c().b(m10.V1)).booleanValue()) {
                                g7.t("PDJGtr7hH5z8kziZtOwKBHfUklGaxsnuMOcaf4/XJNQXH5uqgOnO+ZxxlrN1G5R2", "8jFByxLLStK1ZA6Q/SQPKITUmXlRJfaQf0bJ+6rt27M=", new Class[0]);
                            }
                        } catch (IllegalStateException unused) {
                        }
                        g7.t("pzhIFr8jSwvyB8FXK2qfBOfw0jXHNl6+dmbReaTm1jquB51r9sbZLlTA4zaBxZEm", "RbRyr5uGUYOSrOuNnmzV0kl42YeLvs7OFWbwh2MFm18=", Context.class);
                        g7.t("t7YLiNn9wSLVfNzBPSP796qGY15c9YWt19X86sjfqa1MN8DTMOAxKskDGE2b7plQ", "lEEnhl5euaIfSg9vXz1JH43pBH/xGM9fvSrfPaUZwEI=", Context.class);
                        g7.t("Zsy6wzxKzkvuI5Zg91hlK7lftgUdlMXbkLzI72tnQVNXNUFbyYhuDjwGRJi5QzOf", "/h10yfi8gz82TQ6rp82eUm/z42AeNO79/O3Nlfr8yws=", Context.class);
                        g7.t("glZYRiAaVgXhfq7gmv5KdTlxK1u1W7CDU+wEOCdR48SsabliUSLxOyNuMGeUOQq8", "BXtZidg/K24z5N/YUAEC4oPRR4OaYUycAQjBgFG9Ir4=", Context.class);
                        g7.t("/739lR4kemkoeiIxGTB69dfyotmKoGTnr6wtM0ugYOMXQexqwGvsBs8l5HrCnFT4", "LBvMjmMBC2btK8Ghl34ZYYMmZM0GDlWreJMsAap/ceE=", Context.class);
                        Class<?> cls = Boolean.TYPE;
                        g7.t("xNZCZdqL8o1jZKUOIQXHHGKMYJmFGBT5z1mMXWF7VHR3erPGPRFl7DocpCFVg9bF", "1GRZIGWaJCWi5hYVyOzM0ARje4NaXoHaW7HEe5QbRxs=", Context.class, cls);
                        g7.t("uUtXgghNropSfe2KUSoP0Efn1EgB4X6maOF+tPLLzG1rSS0RqDSE3s9EWbbdwRaZ", "iu0TCa9uEtKUas610luihENZAQIiF7MRaL5XfmToU24=", Context.class);
                        g7.t("SnrtMYC9+qStj9ZoSAj1DR6mGb7YlLFiZbsMn2F8wpevpQUtlzrwws7lBSZ1KQhS", "3Z4807bJ0KoyYYoQ9dcfmEBolGH5CdxZiQurF1neOqs=", Context.class);
                        g7.t("8ik9NLkf2/tOyUWOONqxKfb9fxC2GinfkSDGvq3LdfAIyGrwvLIO/sr/FhjBRdwL", "E5fWzXFb8RAG+0QVT91wIl5kQfApis+Ago2PTXmCPgE=", MotionEvent.class, DisplayMetrics.class);
                        g7.t("fI0N3kbZw/umjLZrsorw2Wh0+0tg4xypZfrKau+VpPGw8hjO0IIZVyJi5hB0Wcbt", "YnDH+tthutt98if0TMBwjusoYiZkXUV9qrwRfqxnS3g=", MotionEvent.class, DisplayMetrics.class);
                        g7.t("llxemQySqp4ImE2+K1SCPJZsWjXNCqydynC9yBT/03FiPJ85o8JSvF0iMBwiw5vV", "Do3k5DuMuAsRGeDxKZVVE8+FSftLk9ZlBUPdFxDzrUE=", new Class[0]);
                        g7.t("M8X9pjLXmkUmNpxAUiXCS0VzRrfgsx47JCdWPtF77o1zbxjaTxGH9o3y3XsfapA3", "IGAB4+J/PDJStxsBeRODYeAaV8Ap48L0bK2MK3UJNBs=", new Class[0]);
                        g7.t("uVfRV2qL6y+/frn7UQ8HZUcJpLFj+yNt3k4Ns9czyDlwcIbIheGCFGCtGsGaaHh4", "RmtCo/dRwPWzjhuo/V+opsA0IDlV0P6pRfQFRNu3WDY=", new Class[0]);
                        g7.t("9GRJeHWq4dh2BvJK4ycB7gT7rSPz0ZkF1/0dgXOpChUtvNoPNNrpav7wZxlsKwP4", "wAGvvwsR6C1vDVsIyeUg+KWcunmHMDzvTAjP5mYaviw=", new Class[0]);
                        g7.t("hUIXYyX7voAFfmX9K6Tyj7UNRMoApsO3NHhichzgf1HY6Km4YpCnpT8GA4sfwulx", "RhEw32BK9OU3wzUC3Jj98VTZvnt6yWz3Jzx/x8tD2qo=", new Class[0]);
                        g7.t("n2Au6L29UBBc2fEdbhtyAmTKpQRV7jQpdKVw+7Bcq8RzfUQmGwjEOtWTLTfPZXlx", "dCN8M8R2yrrpg52x17w1rrrZtT0eIXPeEX6Ibp28VuQ=", new Class[0]);
                        g7.t("iH08ecr5p8p5eQT3/BFJ6jAaJm3eLNoIe2oA7hLZl5P0jAtinrUdPK16lrJGpxBz", "Gvy6wet11FtrNaAWhnvYSI1hOQnkPBTAgqoI9PXuwaM=", Context.class, cls, String.class);
                        g7.t("xd283h5qAcacM5zVZnbCaCYEYmyBvCzSWmcoDFc838gJ/DBCdoedE0EgOC5ZJs5s", "KFN28huBDzw/UNPPRO5YgG4GEIzzfegN1j75wmksmGk=", StackTraceElement[].class);
                        g7.t("hQ5xuCRMiz6eJqaT4+9Wf/Kj854Yma0NmQLTM8SLOoEkyUHQjbgUSxF3PTxTz3Bq", "CIY4BMAyy7Fe28Pq7/h8od2SEEojcWEgmd3J7ORxssU=", View.class, DisplayMetrics.class, cls);
                        g7.t("yRC8yDQzUDrmroLbdHZh1cdlZfd8ub/FsIslAHpddfKGkTWa/jUYdNJ0tT+5diCM", "HM4qeDzacgZSWStWAwQJTi2Amm6uvEB2WlZumyUY0B8=", Context.class, cls);
                        g7.t("VJibBREzYucPjNukhWG65jB60OIZQrcDVR3W2JV3G5ynshQ4Nd74pHrZYUgRiYK0", "TiANcug5zndviERrHpzUihvZthrd+vHCK5ngnbrocVE=", View.class, Activity.class, cls);
                        g7.t("e3op4R4hYomHt8fD4e46pNuu/60OumzY4fWht1zvNw/PVRGde3uP5Y0px+X+3p+E", "jLlOehpoNgAQzvuHrTyBcudcfwOhFguv/E47mcpJrto=", Long.TYPE);
                        try {
                            if (((Boolean) sw.c().b(m10.f8155a2)).booleanValue()) {
                                g7.t("nKg4HNqb3w+l+hWBt0181NzZuRHIlhptjDdMcQ5dE3JWGvySjoPYfybKeplgFTfD", "XexrqxQZ83Dsows1I9oUUMC34QJd/x5AyWUFr5Va7Yc=", Context.class);
                            }
                        } catch (IllegalStateException unused2) {
                        }
                        g7.t("CaNDUMCWCaGbEGmM1Yj39BxpZ8FPbNtvFQfeZOrEB+NgN6NGnTaiZA/U29rLN/tj", "INyd2w/uRsAGkjbqPl7ialNH5emmi1OBLIEI6gUyIzM=", Context.class);
                        try {
                            if (Build.VERSION.SDK_INT >= 26) {
                                if (((Boolean) sw.c().b(m10.f8171c2)).booleanValue()) {
                                    g7.t("pJoEelkZiKPOxk90a9HaLYHjU9iyGURNQtyjZ4Eem1yb/gFTG2yLqZLPefEosnhY", "oU8dxPYnryKlPd91mK89Z7Qor1PaeT+LMYSHnhThZ+4=", NetworkCapabilities.class);
                                }
                            }
                        } catch (IllegalStateException unused3) {
                        }
                    }
                    db.f4130y = g7;
                }
            }
        }
        return db.f4130y;
    }

    static ic p(gc gcVar, MotionEvent motionEvent, DisplayMetrics displayMetrics) {
        Method j7 = gcVar.j("8ik9NLkf2/tOyUWOONqxKfb9fxC2GinfkSDGvq3LdfAIyGrwvLIO/sr/FhjBRdwL", "E5fWzXFb8RAG+0QVT91wIl5kQfApis+Ago2PTXmCPgE=");
        if (j7 == null || motionEvent == null) {
            throw new xb();
        }
        try {
            return new ic((String) j7.invoke(null, motionEvent, displayMetrics));
        } catch (IllegalAccessException | InvocationTargetException e7) {
            throw new xb(e7);
        }
    }

    protected static synchronized void s(Context context, boolean z6) {
        synchronized (eb.class) {
            if (E) {
                return;
            }
            F = System.currentTimeMillis() / 1000;
            db.f4130y = o(context, z6);
            if (((Boolean) sw.c().b(m10.f8171c2)).booleanValue()) {
                G = jb.c(context);
            }
            E = true;
        }
    }

    protected static final void t(List<Callable<Void>> list) {
        ExecutorService k7;
        if (db.f4130y == null || (k7 = db.f4130y.k()) == null || list.isEmpty()) {
            return;
        }
        try {
            k7.invokeAll(list, ((Long) sw.c().b(m10.N1)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e7) {
            Log.d(D, String.format("class methods got exception: %s", jc.e(e7)));
        }
    }

    private final synchronized void u(gc gcVar, j8 j8Var) {
        Long l7;
        MotionEvent motionEvent;
        try {
            ic p7 = p(gcVar, this.f4131f, this.f4149x);
            Long l8 = p7.f6592b;
            if (l8 != null) {
                j8Var.A(l8.longValue());
            }
            Long l9 = p7.f6593c;
            if (l9 != null) {
                j8Var.B(l9.longValue());
            }
            Long l10 = p7.f6594d;
            if (l10 != null) {
                j8Var.y(l10.longValue());
            }
            if (this.f4148w) {
                Long l11 = p7.f6595e;
                if (l11 != null) {
                    j8Var.x(l11.longValue());
                }
                Long l12 = p7.f6596f;
                if (l12 != null) {
                    j8Var.u(l12.longValue());
                }
            }
        } catch (xb unused) {
        }
        w8 F2 = x8.F();
        if (this.f4133h > 0 && jc.h(this.f4149x)) {
            F2.u(jc.a(this.f4140o, 1, this.f4149x));
            F2.H(jc.a(this.f4145t - this.f4143r, 1, this.f4149x));
            F2.I(jc.a(this.f4146u - this.f4144s, 1, this.f4149x));
            F2.A(jc.a(this.f4143r, 1, this.f4149x));
            F2.C(jc.a(this.f4144s, 1, this.f4149x));
            if (this.f4148w && (motionEvent = this.f4131f) != null) {
                long a7 = jc.a(((this.f4143r - this.f4145t) + motionEvent.getRawX()) - this.f4131f.getX(), 1, this.f4149x);
                if (a7 != 0) {
                    F2.F(a7);
                }
                long a8 = jc.a(((this.f4144s - this.f4146u) + this.f4131f.getRawY()) - this.f4131f.getY(), 1, this.f4149x);
                if (a8 != 0) {
                    F2.G(a8);
                }
            }
        }
        try {
            ic l13 = l(this.f4131f);
            Long l14 = l13.f6592b;
            if (l14 != null) {
                F2.B(l14.longValue());
            }
            Long l15 = l13.f6593c;
            if (l15 != null) {
                F2.D(l15.longValue());
            }
            F2.z(l13.f6594d.longValue());
            if (this.f4148w) {
                Long l16 = l13.f6596f;
                if (l16 != null) {
                    F2.x(l16.longValue());
                }
                Long l17 = l13.f6595e;
                if (l17 != null) {
                    F2.y(l17.longValue());
                }
                Long l18 = l13.f6597g;
                if (l18 != null) {
                    F2.K(l18.longValue() != 0 ? 2 : 1);
                }
                if (this.f4134i > 0) {
                    if (jc.h(this.f4149x)) {
                        double d7 = this.f4139n;
                        double d8 = this.f4134i;
                        Double.isNaN(d7);
                        Double.isNaN(d8);
                        l7 = Long.valueOf(Math.round(d7 / d8));
                    } else {
                        l7 = null;
                    }
                    if (l7 != null) {
                        F2.s(l7.longValue());
                    } else {
                        F2.r();
                    }
                    double d9 = this.f4138m;
                    double d10 = this.f4134i;
                    Double.isNaN(d9);
                    Double.isNaN(d10);
                    F2.t(Math.round(d9 / d10));
                }
                Long l19 = l13.f6600j;
                if (l19 != null) {
                    F2.v(l19.longValue());
                }
                Long l20 = l13.f6601k;
                if (l20 != null) {
                    F2.E(l20.longValue());
                }
                Long l21 = l13.f6602l;
                if (l21 != null) {
                    F2.J(l21.longValue() != 0 ? 2 : 1);
                }
            }
        } catch (xb unused2) {
        }
        long j7 = this.f4137l;
        if (j7 > 0) {
            F2.w(j7);
        }
        j8Var.D(F2.o());
        long j8 = this.f4133h;
        if (j8 > 0) {
            j8Var.v(j8);
        }
        long j9 = this.f4134i;
        if (j9 > 0) {
            j8Var.w(j9);
        }
        long j10 = this.f4135j;
        if (j10 > 0) {
            j8Var.z(j10);
        }
        long j11 = this.f4136k;
        if (j11 > 0) {
            j8Var.t(j11);
        }
        try {
            int size = this.f4132g.size() - 1;
            if (size > 0) {
                j8Var.T();
                for (int i7 = 0; i7 < size; i7++) {
                    ic p8 = p(db.f4130y, this.f4132g.get(i7), this.f4149x);
                    w8 F3 = x8.F();
                    F3.B(p8.f6592b.longValue());
                    F3.D(p8.f6593c.longValue());
                    j8Var.R(F3.o());
                }
            }
        } catch (xb unused3) {
            j8Var.T();
        }
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final void b(View view) {
        if (((Boolean) sw.c().b(m10.Q1)).booleanValue()) {
            if (this.B == null) {
                gc gcVar = db.f4130y;
                this.B = new nc(gcVar.f5536a, gcVar.f());
            }
            this.B.d(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.db
    protected final long h(StackTraceElement[] stackTraceElementArr) {
        Method j7 = db.f4130y.j("xd283h5qAcacM5zVZnbCaCYEYmyBvCzSWmcoDFc838gJ/DBCdoedE0EgOC5ZJs5s", "KFN28huBDzw/UNPPRO5YgG4GEIzzfegN1j75wmksmGk=");
        if (j7 == null || stackTraceElementArr == null) {
            throw new xb();
        }
        try {
            return new yb((String) j7.invoke(null, stackTraceElementArr)).f14599b.longValue();
        } catch (IllegalAccessException | InvocationTargetException e7) {
            throw new xb(e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.db
    protected final j8 i(Context context, View view, Activity activity) {
        j8 f02 = a9.f0();
        if (!TextUtils.isEmpty(this.A)) {
            f02.X(this.A);
        }
        r(o(context, this.f4549z), f02, view, activity, true);
        return f02;
    }

    @Override // com.google.android.gms.internal.ads.db
    protected final j8 j(Context context, c8 c8Var) {
        j8 f02 = a9.f0();
        if (!TextUtils.isEmpty(this.A)) {
            f02.X(this.A);
        }
        gc o7 = o(context, this.f4549z);
        if (o7.k() != null) {
            t(q(o7, context, f02, null));
        }
        return f02;
    }

    @Override // com.google.android.gms.internal.ads.db
    protected final j8 k(Context context, View view, Activity activity) {
        j8 f02 = a9.f0();
        f02.X(this.A);
        r(o(context, this.f4549z), f02, view, activity, false);
        return f02;
    }

    @Override // com.google.android.gms.internal.ads.db
    protected final ic l(MotionEvent motionEvent) {
        Method j7 = db.f4130y.j("fI0N3kbZw/umjLZrsorw2Wh0+0tg4xypZfrKau+VpPGw8hjO0IIZVyJi5hB0Wcbt", "YnDH+tthutt98if0TMBwjusoYiZkXUV9qrwRfqxnS3g=");
        if (j7 == null || motionEvent == null) {
            throw new xb();
        }
        try {
            return new ic((String) j7.invoke(null, motionEvent, this.f4149x));
        } catch (IllegalAccessException | InvocationTargetException e7) {
            throw new xb(e7);
        }
    }

    protected List<Callable<Void>> q(gc gcVar, Context context, j8 j8Var, c8 c8Var) {
        int a7 = gcVar.a();
        ArrayList arrayList = new ArrayList();
        if (!gcVar.r()) {
            j8Var.r0(16384L);
            return arrayList;
        }
        arrayList.add(new sc(gcVar, "iH08ecr5p8p5eQT3/BFJ6jAaJm3eLNoIe2oA7hLZl5P0jAtinrUdPK16lrJGpxBz", "Gvy6wet11FtrNaAWhnvYSI1hOQnkPBTAgqoI9PXuwaM=", j8Var, a7, 27, context, null));
        arrayList.add(new vc(gcVar, "llxemQySqp4ImE2+K1SCPJZsWjXNCqydynC9yBT/03FiPJ85o8JSvF0iMBwiw5vV", "Do3k5DuMuAsRGeDxKZVVE8+FSftLk9ZlBUPdFxDzrUE=", j8Var, F, a7, 25));
        arrayList.add(new cd(gcVar, "uVfRV2qL6y+/frn7UQ8HZUcJpLFj+yNt3k4Ns9czyDlwcIbIheGCFGCtGsGaaHh4", "RmtCo/dRwPWzjhuo/V+opsA0IDlV0P6pRfQFRNu3WDY=", j8Var, a7, 1));
        arrayList.add(new fd(gcVar, "Zsy6wzxKzkvuI5Zg91hlK7lftgUdlMXbkLzI72tnQVNXNUFbyYhuDjwGRJi5QzOf", "/h10yfi8gz82TQ6rp82eUm/z42AeNO79/O3Nlfr8yws=", j8Var, a7, 31));
        arrayList.add(new kd(gcVar, "M8X9pjLXmkUmNpxAUiXCS0VzRrfgsx47JCdWPtF77o1zbxjaTxGH9o3y3XsfapA3", "IGAB4+J/PDJStxsBeRODYeAaV8Ap48L0bK2MK3UJNBs=", j8Var, a7, 33));
        arrayList.add(new rc(gcVar, "t7YLiNn9wSLVfNzBPSP796qGY15c9YWt19X86sjfqa1MN8DTMOAxKskDGE2b7plQ", "lEEnhl5euaIfSg9vXz1JH43pBH/xGM9fvSrfPaUZwEI=", j8Var, a7, 29, context));
        arrayList.add(new tc(gcVar, "glZYRiAaVgXhfq7gmv5KdTlxK1u1W7CDU+wEOCdR48SsabliUSLxOyNuMGeUOQq8", "BXtZidg/K24z5N/YUAEC4oPRR4OaYUycAQjBgFG9Ir4=", j8Var, a7, 5));
        arrayList.add(new bd(gcVar, "/739lR4kemkoeiIxGTB69dfyotmKoGTnr6wtM0ugYOMXQexqwGvsBs8l5HrCnFT4", "LBvMjmMBC2btK8Ghl34ZYYMmZM0GDlWreJMsAap/ceE=", j8Var, a7, 12));
        arrayList.add(new dd(gcVar, "xNZCZdqL8o1jZKUOIQXHHGKMYJmFGBT5z1mMXWF7VHR3erPGPRFl7DocpCFVg9bF", "1GRZIGWaJCWi5hYVyOzM0ARje4NaXoHaW7HEe5QbRxs=", j8Var, a7, 3));
        arrayList.add(new uc(gcVar, "9GRJeHWq4dh2BvJK4ycB7gT7rSPz0ZkF1/0dgXOpChUtvNoPNNrpav7wZxlsKwP4", "wAGvvwsR6C1vDVsIyeUg+KWcunmHMDzvTAjP5mYaviw=", j8Var, a7, 44));
        arrayList.add(new yc(gcVar, "hUIXYyX7voAFfmX9K6Tyj7UNRMoApsO3NHhichzgf1HY6Km4YpCnpT8GA4sfwulx", "RhEw32BK9OU3wzUC3Jj98VTZvnt6yWz3Jzx/x8tD2qo=", j8Var, a7, 22));
        arrayList.add(new ld(gcVar, "uUtXgghNropSfe2KUSoP0Efn1EgB4X6maOF+tPLLzG1rSS0RqDSE3s9EWbbdwRaZ", "iu0TCa9uEtKUas610luihENZAQIiF7MRaL5XfmToU24=", j8Var, a7, 48));
        arrayList.add(new qc(gcVar, "SnrtMYC9+qStj9ZoSAj1DR6mGb7YlLFiZbsMn2F8wpevpQUtlzrwws7lBSZ1KQhS", "3Z4807bJ0KoyYYoQ9dcfmEBolGH5CdxZiQurF1neOqs=", j8Var, a7, 49));
        arrayList.add(new id(gcVar, "n2Au6L29UBBc2fEdbhtyAmTKpQRV7jQpdKVw+7Bcq8RzfUQmGwjEOtWTLTfPZXlx", "dCN8M8R2yrrpg52x17w1rrrZtT0eIXPeEX6Ibp28VuQ=", j8Var, a7, 51));
        arrayList.add(new gd(gcVar, "yRC8yDQzUDrmroLbdHZh1cdlZfd8ub/FsIslAHpddfKGkTWa/jUYdNJ0tT+5diCM", "HM4qeDzacgZSWStWAwQJTi2Amm6uvEB2WlZumyUY0B8=", j8Var, a7, 61));
        if (Build.VERSION.SDK_INT >= 24) {
            if (((Boolean) sw.c().b(m10.f8171c2)).booleanValue()) {
                arrayList.add(new ad(gcVar, "pJoEelkZiKPOxk90a9HaLYHjU9iyGURNQtyjZ4Eem1yb/gFTG2yLqZLPefEosnhY", "oU8dxPYnryKlPd91mK89Z7Qor1PaeT+LMYSHnhThZ+4=", j8Var, a7, 11, G));
            }
        }
        if (((Boolean) sw.c().b(m10.f8155a2)).booleanValue()) {
            arrayList.add(new ed(gcVar, "nKg4HNqb3w+l+hWBt0181NzZuRHIlhptjDdMcQ5dE3JWGvySjoPYfybKeplgFTfD", "XexrqxQZ83Dsows1I9oUUMC34QJd/x5AyWUFr5Va7Yc=", j8Var, a7, 73));
        }
        arrayList.add(new zc(gcVar, "CaNDUMCWCaGbEGmM1Yj39BxpZ8FPbNtvFQfeZOrEB+NgN6NGnTaiZA/U29rLN/tj", "INyd2w/uRsAGkjbqPl7ialNH5emmi1OBLIEI6gUyIzM=", j8Var, a7, 76));
        return arrayList;
    }

    protected final void r(gc gcVar, j8 j8Var, View view, Activity activity, boolean z6) {
        List list;
        if (gcVar.r()) {
            u(gcVar, j8Var);
            ArrayList arrayList = new ArrayList();
            if (gcVar.k() != null) {
                int a7 = gcVar.a();
                arrayList.add(new xc(gcVar, j8Var));
                arrayList.add(new cd(gcVar, "uVfRV2qL6y+/frn7UQ8HZUcJpLFj+yNt3k4Ns9czyDlwcIbIheGCFGCtGsGaaHh4", "RmtCo/dRwPWzjhuo/V+opsA0IDlV0P6pRfQFRNu3WDY=", j8Var, a7, 1));
                arrayList.add(new vc(gcVar, "llxemQySqp4ImE2+K1SCPJZsWjXNCqydynC9yBT/03FiPJ85o8JSvF0iMBwiw5vV", "Do3k5DuMuAsRGeDxKZVVE8+FSftLk9ZlBUPdFxDzrUE=", j8Var, F, a7, 25));
                arrayList.add(new uc(gcVar, "9GRJeHWq4dh2BvJK4ycB7gT7rSPz0ZkF1/0dgXOpChUtvNoPNNrpav7wZxlsKwP4", "wAGvvwsR6C1vDVsIyeUg+KWcunmHMDzvTAjP5mYaviw=", j8Var, a7, 44));
                arrayList.add(new bd(gcVar, "/739lR4kemkoeiIxGTB69dfyotmKoGTnr6wtM0ugYOMXQexqwGvsBs8l5HrCnFT4", "LBvMjmMBC2btK8Ghl34ZYYMmZM0GDlWreJMsAap/ceE=", j8Var, a7, 12));
                arrayList.add(new dd(gcVar, "xNZCZdqL8o1jZKUOIQXHHGKMYJmFGBT5z1mMXWF7VHR3erPGPRFl7DocpCFVg9bF", "1GRZIGWaJCWi5hYVyOzM0ARje4NaXoHaW7HEe5QbRxs=", j8Var, a7, 3));
                arrayList.add(new yc(gcVar, "hUIXYyX7voAFfmX9K6Tyj7UNRMoApsO3NHhichzgf1HY6Km4YpCnpT8GA4sfwulx", "RhEw32BK9OU3wzUC3Jj98VTZvnt6yWz3Jzx/x8tD2qo=", j8Var, a7, 22));
                arrayList.add(new tc(gcVar, "glZYRiAaVgXhfq7gmv5KdTlxK1u1W7CDU+wEOCdR48SsabliUSLxOyNuMGeUOQq8", "BXtZidg/K24z5N/YUAEC4oPRR4OaYUycAQjBgFG9Ir4=", j8Var, a7, 5));
                arrayList.add(new ld(gcVar, "uUtXgghNropSfe2KUSoP0Efn1EgB4X6maOF+tPLLzG1rSS0RqDSE3s9EWbbdwRaZ", "iu0TCa9uEtKUas610luihENZAQIiF7MRaL5XfmToU24=", j8Var, a7, 48));
                arrayList.add(new qc(gcVar, "SnrtMYC9+qStj9ZoSAj1DR6mGb7YlLFiZbsMn2F8wpevpQUtlzrwws7lBSZ1KQhS", "3Z4807bJ0KoyYYoQ9dcfmEBolGH5CdxZiQurF1neOqs=", j8Var, a7, 49));
                arrayList.add(new id(gcVar, "n2Au6L29UBBc2fEdbhtyAmTKpQRV7jQpdKVw+7Bcq8RzfUQmGwjEOtWTLTfPZXlx", "dCN8M8R2yrrpg52x17w1rrrZtT0eIXPeEX6Ibp28VuQ=", j8Var, a7, 51));
                arrayList.add(new hd(gcVar, "xd283h5qAcacM5zVZnbCaCYEYmyBvCzSWmcoDFc838gJ/DBCdoedE0EgOC5ZJs5s", "KFN28huBDzw/UNPPRO5YgG4GEIzzfegN1j75wmksmGk=", j8Var, a7, 45, new Throwable().getStackTrace()));
                arrayList.add(new md(gcVar, "hQ5xuCRMiz6eJqaT4+9Wf/Kj854Yma0NmQLTM8SLOoEkyUHQjbgUSxF3PTxTz3Bq", "CIY4BMAyy7Fe28Pq7/h8od2SEEojcWEgmd3J7ORxssU=", j8Var, a7, 57, view));
                arrayList.add(new gd(gcVar, "yRC8yDQzUDrmroLbdHZh1cdlZfd8ub/FsIslAHpddfKGkTWa/jUYdNJ0tT+5diCM", "HM4qeDzacgZSWStWAwQJTi2Amm6uvEB2WlZumyUY0B8=", j8Var, a7, 61));
                if (((Boolean) sw.c().b(m10.O1)).booleanValue()) {
                    arrayList.add(new pc(gcVar, "VJibBREzYucPjNukhWG65jB60OIZQrcDVR3W2JV3G5ynshQ4Nd74pHrZYUgRiYK0", "TiANcug5zndviERrHpzUihvZthrd+vHCK5ngnbrocVE=", j8Var, a7, 62, view, activity));
                }
                if (z6 && ((Boolean) sw.c().b(m10.Q1)).booleanValue()) {
                    arrayList.add(new jd(gcVar, "e3op4R4hYomHt8fD4e46pNuu/60OumzY4fWht1zvNw/PVRGde3uP5Y0px+X+3p+E", "jLlOehpoNgAQzvuHrTyBcudcfwOhFguv/E47mcpJrto=", j8Var, a7, 53, this.B));
                    list = arrayList;
                }
            }
            list = arrayList;
        } else {
            j8Var.r0(16384L);
            list = Arrays.asList(new xc(gcVar, j8Var));
        }
        t(list);
    }
}
