package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o2.C4828a;
import q2.C4907p;

/* loaded from: classes2.dex */
public final class Ys implements Rs {

    /* renamed from: a, reason: collision with root package name */
    public final Context f28900a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f28901b;

    /* renamed from: c, reason: collision with root package name */
    public final SD f28902c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f28903d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f28904e;

    /* renamed from: f, reason: collision with root package name */
    public final C2837Wb f28905f;

    public Ys(C2837Wb c2837Wb, Context context, ScheduledExecutorService scheduledExecutorService, SD sd, int i, boolean z8, boolean z9) {
        this.f28905f = c2837Wb;
        this.f28900a = context;
        this.f28901b = scheduledExecutorService;
        this.f28902c = sd;
        this.f28903d = z8;
        this.f28904e = z9;
    }

    @Override // com.google.android.gms.internal.ads.Rs
    public final J3.a a() {
        C2837Wb c2837Wb = this.f28905f;
        C3320hg c3320hg = new C3320hg();
        u2.d dVar = C4907p.f40108g.f40109a;
        Context context = this.f28900a;
        int c4 = L2.f.f1726b.c(context, 12451000);
        if (c4 == 0 || c4 == 2) {
            AbstractC3212fg.f30738a.execute(new MD(c2837Wb, context, c3320hg));
        }
        JD s3 = JD.s(c3320hg);
        final int i = 1;
        XA xa = new XA(this) { // from class: com.google.android.gms.internal.ads.Xs

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Ys f28714b;

            {
                this.f28714b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
            
                if (((java.lang.Boolean) q2.r.f40116e.f40119c.a(com.google.android.gms.internal.ads.AbstractC3368ia.f31618a4)).booleanValue() == false) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
            
                if (((java.lang.Boolean) q2.r.f40116e.f40119c.a(com.google.android.gms.internal.ads.AbstractC3368ia.f31608Z3)).booleanValue() == false) goto L24;
             */
            @Override // com.google.android.gms.internal.ads.XA
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object apply(Object obj) {
                C3288h1 a9;
                switch (i) {
                    case 0:
                        Ys ys = this.f28714b;
                        ys.getClass();
                        u2.d dVar2 = C4907p.f40108g.f40109a;
                        ContentResolver contentResolver = ys.f28900a.getContentResolver();
                        return new Rr(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new C3288h1(5), 2);
                    default:
                        Ys ys2 = this.f28714b;
                        C4828a c4828a = (C4828a) obj;
                        ys2.getClass();
                        C3288h1 c3288h1 = new C3288h1(5);
                        if (!ys2.f28903d) {
                            break;
                        } else {
                            break;
                        }
                        try {
                            Context context2 = ys2.f28900a;
                            Tx f6 = Tx.f(context2);
                            Objects.requireNonNull(c4828a);
                            String str = c4828a.f39687a;
                            Objects.requireNonNull(str);
                            String packageName = context2.getPackageName();
                            long longValue = ((Long) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31664f4)).longValue();
                            boolean z8 = ys2.f28904e;
                            f6.getClass();
                            synchronized (Tx.class) {
                                a9 = f6.a(str, longValue, packageName, z8);
                            }
                            c3288h1 = a9;
                        } catch (IOException | IllegalArgumentException e6) {
                            p2.j.f39798C.f39808h.d("AdIdInfoSignalSource.getPaidV1", e6);
                            c3288h1 = new C3288h1(5);
                        }
                        return new Rr(c4828a, null, c3288h1, 2);
                }
            }
        };
        SD sd = this.f28902c;
        final int i4 = 0;
        return C3686oN.u((JD) C3686oN.w(C3686oN.A(s3, xa, sd), ((Long) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31418D1)).longValue(), TimeUnit.MILLISECONDS, this.f28901b), Throwable.class, new XA(this) { // from class: com.google.android.gms.internal.ads.Xs

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Ys f28714b;

            {
                this.f28714b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
            
                if (((java.lang.Boolean) q2.r.f40116e.f40119c.a(com.google.android.gms.internal.ads.AbstractC3368ia.f31618a4)).booleanValue() == false) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
            
                if (((java.lang.Boolean) q2.r.f40116e.f40119c.a(com.google.android.gms.internal.ads.AbstractC3368ia.f31608Z3)).booleanValue() == false) goto L24;
             */
            @Override // com.google.android.gms.internal.ads.XA
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object apply(Object obj) {
                C3288h1 a9;
                switch (i4) {
                    case 0:
                        Ys ys = this.f28714b;
                        ys.getClass();
                        u2.d dVar2 = C4907p.f40108g.f40109a;
                        ContentResolver contentResolver = ys.f28900a.getContentResolver();
                        return new Rr(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new C3288h1(5), 2);
                    default:
                        Ys ys2 = this.f28714b;
                        C4828a c4828a = (C4828a) obj;
                        ys2.getClass();
                        C3288h1 c3288h1 = new C3288h1(5);
                        if (!ys2.f28903d) {
                            break;
                        } else {
                            break;
                        }
                        try {
                            Context context2 = ys2.f28900a;
                            Tx f6 = Tx.f(context2);
                            Objects.requireNonNull(c4828a);
                            String str = c4828a.f39687a;
                            Objects.requireNonNull(str);
                            String packageName = context2.getPackageName();
                            long longValue = ((Long) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31664f4)).longValue();
                            boolean z8 = ys2.f28904e;
                            f6.getClass();
                            synchronized (Tx.class) {
                                a9 = f6.a(str, longValue, packageName, z8);
                            }
                            c3288h1 = a9;
                        } catch (IOException | IllegalArgumentException e6) {
                            p2.j.f39798C.f39808h.d("AdIdInfoSignalSource.getPaidV1", e6);
                            c3288h1 = new C3288h1(5);
                        }
                        return new Rr(c4828a, null, c3288h1, 2);
                }
            }
        }, sd);
    }

    @Override // com.google.android.gms.internal.ads.Rs
    public final int d() {
        return 40;
    }
}
