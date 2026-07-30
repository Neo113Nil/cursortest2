package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.AdError;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.h7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3294h7 implements InterfaceC3240g7 {

    /* renamed from: P, reason: collision with root package name */
    public static volatile C4101w7 f31176P = null;

    /* renamed from: Q, reason: collision with root package name */
    public static final Object f31177Q = new Object();

    /* renamed from: R, reason: collision with root package name */
    public static boolean f31178R = false;

    /* renamed from: S, reason: collision with root package name */
    public static long f31179S;

    /* renamed from: T, reason: collision with root package name */
    public static C3562m7 f31180T;

    /* renamed from: U, reason: collision with root package name */
    public static D7 f31181U;

    /* renamed from: V, reason: collision with root package name */
    public static E0 f31182V;

    /* renamed from: W, reason: collision with root package name */
    public static C4017ue f31183W;

    /* renamed from: X, reason: collision with root package name */
    public static C3761pr f31184X;

    /* renamed from: C, reason: collision with root package name */
    public double f31187C;

    /* renamed from: D, reason: collision with root package name */
    public double f31188D;

    /* renamed from: E, reason: collision with root package name */
    public double f31189E;

    /* renamed from: F, reason: collision with root package name */
    public float f31190F;

    /* renamed from: G, reason: collision with root package name */
    public float f31191G;

    /* renamed from: H, reason: collision with root package name */
    public float f31192H;

    /* renamed from: I, reason: collision with root package name */
    public float f31193I;

    /* renamed from: L, reason: collision with root package name */
    public final DisplayMetrics f31195L;

    /* renamed from: M, reason: collision with root package name */
    public final Rx f31196M;

    /* renamed from: N, reason: collision with root package name */
    public final com.bumptech.glide.manager.o f31197N;

    /* renamed from: O, reason: collision with root package name */
    public B7 f31198O;

    /* renamed from: n, reason: collision with root package name */
    public MotionEvent f31199n;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedList f31200u = new LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public long f31201v = 0;

    /* renamed from: w, reason: collision with root package name */
    public long f31202w = 0;

    /* renamed from: x, reason: collision with root package name */
    public long f31203x = 0;

    /* renamed from: y, reason: collision with root package name */
    public long f31204y = 0;

    /* renamed from: z, reason: collision with root package name */
    public long f31205z = 0;

    /* renamed from: A, reason: collision with root package name */
    public long f31185A = 0;

    /* renamed from: B, reason: collision with root package name */
    public long f31186B = 0;
    public boolean J = false;

    /* renamed from: K, reason: collision with root package name */
    public boolean f31194K = false;

    public C3294h7(Context context, com.bumptech.glide.manager.o oVar) {
        try {
            V6.a();
            this.f31195L = context.getResources().getDisplayMetrics();
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31412C3)).booleanValue()) {
                this.f31196M = new Rx(7);
            }
        } catch (Throwable unused) {
        }
        new HashMap();
        this.f31197N = oVar;
    }

    public static C4101w7 n(Context context, boolean z8) {
        if (f31176P == null) {
            synchronized (f31177Q) {
                try {
                    if (f31176P == null) {
                        C4101w7 a9 = C4101w7.a(context, z8, f31184X);
                        if (a9.f34941n) {
                            try {
                                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.i4)).booleanValue()) {
                                    a9.c("dDkHRfh96kWRNKlCuQv4bcbQkP8hTl8+IryaCt9cMd/svBIVo0Uo/vCqMYwPlijS", "lGOVu04SK1qS7YTVL1GWrSv+Cf1XKJpvbu7KHhGh7cY=", new Class[0]);
                                }
                            } catch (IllegalStateException unused) {
                            }
                            a9.c("8cGCIT8G/u06HQUQMiN2ifk8cEgbx/Wk97figDVCx+GQZgadMjHBVKMl6PUoXm9E", "8+d2WBKGjAoApH75NCR/Aqn77d5NBFIHb0YR3dAdyeE=", Context.class);
                            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31729m4)).booleanValue()) {
                                a9.c("iCmAdyXMN2wNdoDGZPKplFblNf0e3f9Gr4uP4gCRDt/ctzDAq8UfSYwC5u9g4DzW", "9N+K+19jT0YQFPQktH9XDgnqiWtwN+75+qmtGpYeo7Q=", new Class[0]);
                            }
                            a9.c("00Zqkn2vthPYFLR6iH1rsdxNkw6KyQ/MlAMxaONveqkDgXIjpGg039P2HSigYq2Q", "KTJvuGh/PMe9EapQHUkRl8FZKF5qWyAzLDZ/DWV/log=", Context.class);
                            a9.c("XXF2CX++qjQzFfJDmqd+84h356GlStFLqQSTRbbce/csPkd7M5mpQw1l7igXWffL", "FGCYjW2JaOcRH3mqSkgHIxbWzEwOVje6sx286yuA1xM=", Context.class);
                            a9.c("m7g/XX2t5caOhtOM/ogmEO9Vkwmhkxe5gTS2qje4vP8HJASoqVE/26NLNeDuMz/t", "+Weh9OuqHFyRkOD06GxXjljhJF/GsDXbBDxKrn8yplc=", Context.class);
                            a9.c("P28XMQKwxb7t4RJM54Abd563bFUm9uASQiuwtqttjr6XDpyPt/FmHs2sVrWjtmTo", "fagQaENWAKeTH7PQjt5vlJiCBcOZOOnM19vGSn9sDlA=", Context.class);
                            Class cls = Boolean.TYPE;
                            a9.c("IIcYtgV+jKyhXEWTRGryYoN4Hb3AaxkKFvJa61B8IsfExxFOrLfbygLFTq7UIHav", "0Td4x6cMqS7UG7AA2zcqm+bK2AW+gIwIgEtwqP1CguA=", Context.class, cls);
                            a9.c("GkIdfnRezKvEfAeB5157D8Ci3lpp/e7Oge9xr/GzO3KjC7JXvYHgpg7VRCtGuOw4", "kXUmyuEurXcq5mqFokC5oFFCqidwlGAMD9JpJXYa0Mk=", Context.class);
                            a9.c("2JfLKOCWe20PaEte0oViJ9E/+ELRHfLHNO4trOuu7IQ3kQ71vgp9bwF5/QP32+2T", "LVYC8EvnYnoIGxefzdW+bkgnD7TMgzMx712oMyZcYTg=", Context.class);
                            a9.c("6fpJXJ/0mHk1BKHieJD271QStaRup/Ve1zgTWQI+7BRFgC5McwJ3e2UlmdWs2x64", "/HyusJxcst6GC6sxvcSXH3tMw8sGRae2S909c2O+Y30=", MotionEvent.class, DisplayMetrics.class);
                            a9.c("t5yhqOem6jC98WR50f+SLS3Uk3sKCmIuutsKOnbEcikRe3zXPIZnZid7K20GrtZF", "M9gaAFNEKOV8YNe1CyHBBl548FwxQflqXjyA5kKaJak=", MotionEvent.class, DisplayMetrics.class);
                            a9.c("y0L1OSEMWW8/imV1M3pvQITWJfkGk5GAMqJuL5aNLdq8sTbK6BFpI8/D5pLc65zr", "dBSRUGPKY8JzIPoAEV0GB9RkRHGvAJPAM3BhqN1QQjE=", new Class[0]);
                            a9.c("9v14GmYq1mityfaROUYQVHNDWlAgc2TzwyjcWsJSVQ5o6aEyLVnDo4vbeNXmh2ew", "zGbmNDn+uB00oiAu0ISzPA2QynMDAioh3MLj5VQvTcg=", new Class[0]);
                            a9.c("XQdLYJkQLpAC0Ie4wfLqMhdIIwn1qr11ViPPFEC485DwlLnjXHhmJUbAoJDOqgC4", "EiIklDudUBV1tLFQO3J+6veHT/B2kTFeB6bPUIAs1V0=", new Class[0]);
                            a9.c("c2tDBlieP1HgAca8BbxZWeFItAa95IUNAJZ8eF9wTfwT8H+oJvTJgvb0TMn4OhPJ", "tm0zp+MQfD9mNSBt0r3mfYhq2ky3SeNyaSrFjHWQaT0=", new Class[0]);
                            a9.c("AeJvLHy+YL60Equ2/UpZQs9Ok34RPgGTn80fnG3Dx4JfdgAW65En0T0IJD/U8yYs", "sawjrbkZQHxExWkkVyDhv0h3fWiUMmvl7E2YVLpKa+A=", new Class[0]);
                            a9.c("Qz9CKMoDCHphOXPELo049qp61nrfn738aUeATKOiX7hq+kw0ujtW3xI/vlQKBh37", "bze+wYBAHEMh8JSXqo0+D4B3Aq+R4fX2jHr7eo7ufbY=", new Class[0]);
                            a9.c("Y4Si1UCd8xFA1yCw6ohazV+GUSwhVa9ffV9ZnN++nWMAkqLsgU7cmmd4wBpbGVgj", "1k+Az7ZOHMkdpE7lGA2cF/gUEsamDqjjLqQDV0dmR3A=", Context.class, cls, String.class);
                            a9.c("X/GUPFxOS4avlKtq36LXcZb7PXup/zZuW1HHrjvnbrOdArq87fiVHm1/XdqEH3+6", "yUIicuApz/OaGeh0f0RdAIADq1zJ0l0UU+b4jbryt0s=", StackTraceElement[].class);
                            a9.c("K/Oo81d3D7QQWAvkxOkmH49qSlOsGQFHscMya6S21HBqr+GdnpBDhLtEJWB1CCZB", "Ge8je/arysmNa4UdtKuRe+4JSpIyhDOrTZ5OtsYb5ag=", View.class, DisplayMetrics.class, cls, cls);
                            a9.c("NrTiKoqiGsnW0YmEvrYFxN8MEHR3HtreklnLu5ZS2/gdKln4kN9VtqKQ3DYD1lNw", "GRpsnBes2qRtyDPKutW4bBWph7anTp6FUrz2DgBHtv0=", Context.class, cls);
                            a9.c("9TfyKlP5TIIt3OrlcGubA3YBpCoy+oB4k/WnZndRDloYkwzEaKKPovjffC4zkV4k", "3uxZ+FD025vJO7qOv296UhrdOlNsopGnz6EvxCliHP4=", View.class, Activity.class, cls);
                            Class cls2 = Long.TYPE;
                            a9.c("CX4J+2yEJ2HtJzNjBSAFoPZxV3S124qFqsrwrEik3kHdsHRX3oIIB4d/zi0EQ0fu", "gfLiyhD2OvLSOj6bwf+kcmK11rwQ90aeBshxHD6xXgk=", cls2);
                            a9.c("PmZORt2h3FILlRchj3l8QFpH1b4WBi8LAKFq8qXvSXgGWHByOiAJxaqMK9WTkxzB", "Ox3joL3a7fFzYIlEQut3utwsOQDntBqHwHmTdzF1H8c=", new Class[0]);
                            a9.c("sg/K0s1GwOZuQX5eitJmxib+wj81rdd8azNpkdJxx1Al3KmlPY0wLfmj2TGTYSv2", "x4M1RpSRK9uX9iukrRpM6KxHxc9F29fR3cS53OKE4Bs=", Context.class);
                            a9.c("Di5PWAjPtHVrwnaWVY5fRaO+JCXGdUjCOQOYEnFfzjx5tiFy99P00V458wl3+tMS", "24rToqMdm9KIBSWWVKIVzZ6Fu9mGVX1qRD30P4LVPjg=", Context.class);
                            a9.c("0RGuaC1LZ8p4RZIWK5IFPvVh1XqX7pdLKGQgqTXZ1mkub6VwNtebK8xyUGpHkvMn", "mIcXOfgrOloP6pQFjXZ3aL2iJ7mq+own2SaqzDvu6Tk=", NetworkCapabilities.class, cls2, cls2);
                            a9.c("/BhgxpXYgahRBmZkS3xjCzPdid3mZtzdZmJFkhACyEa2oS6asfWgI5KysEGcSPE9", "ngST2QkCVNtF272EQbVjeXMfCtACYPfIcakPMgsny7g=", List.class);
                            a9.c("4UiqdD16WGcqj9vsERkA6tbA4c/2yE/sXnYMi3TR5nPXoyMXncc0iB8g5zhndeqU", "5yR6P4d4j2VnbvLNLQtiv9yBd7AWiKZJ6Mp0Kq9QPto=", cls2, cls2, cls2, cls2);
                        }
                        f31176P = a9;
                    }
                } finally {
                }
            }
        }
        return f31176P;
    }

    public static C4209y7 p(C4101w7 c4101w7, MotionEvent motionEvent, DisplayMetrics displayMetrics) {
        Method d2 = c4101w7.d("6fpJXJ/0mHk1BKHieJD271QStaRup/Ve1zgTWQI+7BRFgC5McwJ3e2UlmdWs2x64", "/HyusJxcst6GC6sxvcSXH3tMw8sGRae2S909c2O+Y30=");
        if (d2 == null || motionEvent == null) {
            throw new C3778q7();
        }
        try {
            return new C4209y7((String) d2.invoke(null, motionEvent, displayMetrics));
        } catch (IllegalAccessException | InvocationTargetException e6) {
            throw new C3778q7(e6);
        }
    }

    public static final void r(List list) {
        ExecutorService executorService;
        if (f31176P == null || (executorService = f31176P.f34930b) == null || list.isEmpty()) {
            return;
        }
        try {
            executorService.invokeAll(list, ((Long) q2.r.f40116e.f40119c.a(AbstractC3368ia.s3)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e6) {
            char[] cArr = AbstractC4263z7.f35480a;
            StringWriter stringWriter = new StringWriter();
            e6.printStackTrace(new PrintWriter(stringWriter));
            Log.d("h7", "class methods got exception: " + stringWriter.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3240g7
    public final synchronized void a(int i, int i4, int i9) {
        try {
            if (this.f31199n != null) {
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31755p3)).booleanValue()) {
                    m();
                } else {
                    this.f31199n.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.f31195L;
            if (displayMetrics != null) {
                float f6 = displayMetrics.density;
                this.f31199n = MotionEvent.obtain(0L, i9, 1, i * f6, i4 * f6, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.f31199n = null;
            }
            this.f31194K = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3240g7
    public final synchronized void b(MotionEvent motionEvent) {
        Long l9;
        try {
            if (this.J) {
                m();
                this.J = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f31187C = 0.0d;
                this.f31188D = motionEvent.getRawX();
                this.f31189E = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d2 = rawX - this.f31188D;
                double d3 = rawY - this.f31189E;
                this.f31187C += Math.sqrt((d3 * d3) + (d2 * d2));
                this.f31188D = rawX;
                this.f31189E = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        this.f31199n = obtain;
                        LinkedList linkedList = this.f31200u;
                        linkedList.add(obtain);
                        if (linkedList.size() > 6) {
                            ((MotionEvent) linkedList.remove()).recycle();
                        }
                        this.f31203x++;
                        this.f31205z = l(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.f31202w += motionEvent.getHistorySize() + 1;
                        C4209y7 k6 = k(motionEvent);
                        Long l10 = k6.f35315L;
                        if (l10 != null && k6.f35318O != null) {
                            this.f31185A = l10.longValue() + k6.f35318O.longValue() + this.f31185A;
                        }
                        if (this.f31195L != null && (l9 = k6.f35316M) != null && k6.f35319P != null) {
                            this.f31186B = l9.longValue() + k6.f35319P.longValue() + this.f31186B;
                        }
                    } else if (action2 == 3) {
                        this.f31204y++;
                    }
                } catch (C3778q7 unused) {
                }
            } else {
                this.f31190F = motionEvent.getX();
                this.f31191G = motionEvent.getY();
                this.f31192H = motionEvent.getRawX();
                this.f31193I = motionEvent.getRawY();
                this.f31201v++;
            }
            this.f31194K = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3240g7
    public final String c(Context context, String str, View view, Activity activity) {
        return o(context, str, 3, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3240g7
    public final String d(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3240g7
    public final void e(StackTraceElement[] stackTraceElementArr) {
        Rx rx;
        if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31412C3)).booleanValue() || (rx = this.f31196M) == null) {
            return;
        }
        rx.f27448u = new ArrayList(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3240g7
    public final String f(Context context) {
        char[] cArr = AbstractC4263z7.f35480a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return o(context, null, 1, null, null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3240g7
    public final void g(View view) {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31810v3)).booleanValue()) {
            if (this.f31198O == null) {
                C4101w7 c4101w7 = f31176P;
                this.f31198O = new B7(c4101w7.f34929a, c4101w7.f34942o);
            }
            this.f31198O.a(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3240g7
    public final String h(Context context, String str, View view) {
        return o(context, str, 3, view, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3240g7
    public final String i(Context context, View view, Activity activity) {
        return o(context, null, 2, view, activity);
    }

    public final C3830r6 j(Context context) {
        long j9;
        D7 d72 = f31181U;
        if (d72 != null && d72.f24343d) {
            d72.f24341b = System.currentTimeMillis();
        }
        E0 e02 = f31182V;
        e02.f24622b = e02.f24621a;
        e02.f24621a = SystemClock.uptimeMillis();
        C3830r6 C0 = D6.C0();
        com.bumptech.glide.manager.o oVar = this.f31197N;
        String str = (String) oVar.f23624v;
        if (!TextUtils.isEmpty(str)) {
            C0.h();
            ((D6) C0.f30000u).F0(str);
        }
        C4101w7 n9 = n(context, oVar.f23623u);
        if (n9.f34930b != null) {
            int e6 = n9.e();
            ArrayList arrayList = new ArrayList();
            if (n9.f34941n) {
                arrayList.add(new G7(n9, C0, e6, context, (C3615n6) oVar.f23625w, f31183W));
                arrayList.add(new I7(n9, C0, f31179S, e6));
                arrayList.add(new H7(n9, C0, e6, 3));
                arrayList.add(new E7(n9, C0, e6, context));
                arrayList.add(new H7(n9, C0, e6, 4));
                arrayList.add(new F7(n9, C0, e6, context));
                arrayList.add(new H7(n9, C0, e6, 7));
                arrayList.add(new H7(n9, C0, e6, 9));
                arrayList.add(new H7(n9, C0, e6, 10));
                arrayList.add(new H7(n9, C0, e6, 0));
                arrayList.add(new H7(n9, C0, e6, 2));
                arrayList.add(new H7(n9, C0, e6, 13));
                arrayList.add(new H7(n9, C0, e6, 6));
                arrayList.add(new H7(n9, C0, e6, 12));
                arrayList.add(new M7(n9, C0, e6));
                D7 d73 = f31181U;
                long j10 = -1;
                if (d73 != null) {
                    long j11 = d73.f24343d ? d73.f24341b - d73.f24340a : -1L;
                    long j12 = d73.f24342c;
                    d73.f24342c = -1L;
                    j10 = j11;
                    j9 = j12;
                } else {
                    j9 = -1;
                }
                arrayList.add(new K7(n9, C0, e6, f31180T, j10, j9));
                arrayList.add(new H7(n9, C0, e6, 11));
                H7 h72 = new H7(n9, "Di5PWAjPtHVrwnaWVY5fRaO+JCXGdUjCOQOYEnFfzjx5tiFy99P00V458wl3+tMS", "24rToqMdm9KIBSWWVKIVzZ6Fu9mGVX1qRD30P4LVPjg=", C0, e6, 76, 8);
                C0 = C0;
                arrayList.add(h72);
                arrayList.add(new H7(n9, C0, e6, 5));
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31729m4)).booleanValue()) {
                    H7 h73 = new H7(n9, "iCmAdyXMN2wNdoDGZPKplFblNf0e3f9Gr4uP4gCRDt/ctzDAq8UfSYwC5u9g4DzW", "9N+K+19jT0YQFPQktH9XDgnqiWtwN+75+qmtGpYeo7Q=", C0, e6, 82, 1);
                    C0 = C0;
                    arrayList.add(h73);
                }
            } else {
                C0.n(16384L);
            }
            r(arrayList);
        }
        return C0;
    }

    public final C4209y7 k(MotionEvent motionEvent) {
        Method d2 = f31176P.d("t5yhqOem6jC98WR50f+SLS3Uk3sKCmIuutsKOnbEcikRe3zXPIZnZid7K20GrtZF", "M9gaAFNEKOV8YNe1CyHBBl548FwxQflqXjyA5kKaJak=");
        if (d2 == null || motionEvent == null) {
            throw new C3778q7();
        }
        try {
            return new C4209y7((String) d2.invoke(null, motionEvent, this.f31195L));
        } catch (IllegalAccessException | InvocationTargetException e6) {
            throw new C3778q7(e6);
        }
    }

    public final long l(StackTraceElement[] stackTraceElementArr) {
        Method d2 = f31176P.d("X/GUPFxOS4avlKtq36LXcZb7PXup/zZuW1HHrjvnbrOdArq87fiVHm1/XdqEH3+6", "yUIicuApz/OaGeh0f0RdAIADq1zJ0l0UU+b4jbryt0s=");
        if (d2 == null || stackTraceElementArr == null) {
            throw new C3778q7();
        }
        try {
            return new C3508l7((String) d2.invoke(null, stackTraceElementArr)).J.longValue();
        } catch (IllegalAccessException | InvocationTargetException e6) {
            throw new C3778q7(e6);
        }
    }

    public final void m() {
        this.f31205z = 0L;
        this.f31201v = 0L;
        this.f31202w = 0L;
        this.f31203x = 0L;
        this.f31204y = 0L;
        this.f31185A = 0L;
        this.f31186B = 0L;
        LinkedList linkedList = this.f31200u;
        if (linkedList.isEmpty()) {
            MotionEvent motionEvent = this.f31199n;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            linkedList.clear();
        }
        this.f31199n = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0119 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String o(Context context, String str, int i, View view, Activity activity) {
        C3185f7 c3185f7;
        String str2;
        int i4;
        Exception exc;
        C3830r6 c3830r6;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z8;
        byte[] b9;
        int i14;
        int i15;
        int i16;
        int i17 = i;
        long currentTimeMillis = System.currentTimeMillis();
        boolean booleanValue = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31773r3)).booleanValue();
        if (booleanValue) {
            c3185f7 = f31176P != null ? f31176P.f34938k : null;
            str2 = "be";
        } else {
            c3185f7 = null;
            str2 = null;
        }
        try {
            if (i17 == 3) {
                try {
                    D7 d72 = f31181U;
                    if (d72 != null && d72.f24343d) {
                        d72.f24341b = System.currentTimeMillis();
                    }
                    E0 e02 = f31182V;
                    e02.f24628h = e02.f24627g;
                    e02.f24627g = SystemClock.uptimeMillis();
                    c3830r6 = D6.C0();
                    com.bumptech.glide.manager.o oVar = this.f31197N;
                    String str3 = (String) oVar.f23624v;
                    if (!TextUtils.isEmpty(str3)) {
                        c3830r6.h();
                        ((D6) c3830r6.f30000u).F0(str3);
                    }
                    i9 = 2;
                    q(n(context, oVar.f23623u), c3830r6, view, activity, true, context);
                    try {
                        this.J = true;
                        i14 = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
                    } catch (Exception e6) {
                        exc = e6;
                        i4 = 1;
                        if (booleanValue) {
                        }
                        i10 = 3;
                        i11 = i17;
                        z8 = i4;
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (c3830r6 != null) {
                        }
                        return Integer.toString(5);
                    }
                } catch (Exception e9) {
                    e = e9;
                    i9 = 2;
                    i4 = 1;
                    exc = e;
                    c3830r6 = null;
                    if (booleanValue) {
                    }
                    i10 = 3;
                    i11 = i17;
                    z8 = i4;
                    long currentTimeMillis22 = System.currentTimeMillis();
                    if (c3830r6 != null) {
                    }
                    return Integer.toString(5);
                }
            } else {
                i9 = 2;
                if (i17 == 2) {
                    D7 d73 = f31181U;
                    if (d73 != null && d73.f24343d) {
                        d73.f24341b = System.currentTimeMillis();
                    }
                    f31182V.b(context, view);
                    c3830r6 = D6.C0();
                    com.bumptech.glide.manager.o oVar2 = this.f31197N;
                    String str4 = (String) oVar2.f23624v;
                    c3830r6.h();
                    ((D6) c3830r6.f30000u).F0(str4);
                    q(n(context, oVar2.f23623u), c3830r6, view, activity, false, context);
                    i14 = 1008;
                } else {
                    c3830r6 = j(context);
                    i14 = 1000;
                }
            }
            if (!booleanValue || c3185f7 == null) {
                i15 = 1;
            } else {
                try {
                    i16 = 1;
                    try {
                        c3185f7.a(i14, -1, System.currentTimeMillis() - currentTimeMillis, str2, null);
                        i15 = i16;
                    } catch (Exception e10) {
                        e = e10;
                        exc = e;
                        i4 = i16;
                        if (booleanValue || c3185f7 == null) {
                            i10 = 3;
                        } else {
                            i10 = 3;
                            if (i17 == 3) {
                                i13 = 1003;
                            } else if (i17 == i9) {
                                i13 = 1009;
                            } else {
                                i12 = 1001;
                                i17 = i4;
                                c3185f7.a(i12, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                            }
                            i12 = i13;
                            c3185f7.a(i12, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                        }
                        i11 = i17;
                        z8 = i4;
                        long currentTimeMillis222 = System.currentTimeMillis();
                        if (c3830r6 != null) {
                        }
                        return Integer.toString(5);
                    }
                } catch (Exception e11) {
                    e = e11;
                    i16 = 1;
                }
            }
            i11 = i17;
            i10 = 3;
            z8 = i15;
        } catch (Exception e12) {
            e = e12;
        }
        long currentTimeMillis2222 = System.currentTimeMillis();
        if (c3830r6 != null) {
            try {
                if (((D6) c3830r6.j()).d(null) != 0) {
                    D6 d62 = (D6) c3830r6.j();
                    boolean z9 = V6.f28212a;
                    O6 b10 = V6.b(str, d62.b());
                    if (b10 == null) {
                        C3830r6 C0 = D6.C0();
                        C0.n(4096L);
                        b9 = V6.d(((D6) C0.j()).b(), str, z8);
                    } else {
                        b9 = ((P6) b10.j()).b();
                    }
                    String encodeToString = Base64.encodeToString(b9, 11);
                    if (!booleanValue || c3185f7 == null) {
                        return encodeToString;
                    }
                    C3185f7 c3185f72 = c3185f7;
                    String str5 = str2;
                    try {
                        c3185f72.a(i11 == i10 ? 1006 : i11 == i9 ? 1010 : 1004, -1, System.currentTimeMillis() - currentTimeMillis2222, str5, null);
                        return encodeToString;
                    } catch (Exception e13) {
                        e = e13;
                        c3185f7 = c3185f72;
                        str2 = str5;
                        Exception exc2 = e;
                        String num = Integer.toString(7);
                        if (!booleanValue || c3185f7 == null) {
                            return num;
                        }
                        c3185f7.a(i11 == i10 ? 1007 : i11 == i9 ? 1011 : 1005, -1, System.currentTimeMillis() - currentTimeMillis2222, str2, exc2);
                        return num;
                    }
                }
            } catch (Exception e14) {
                e = e14;
            }
        }
        return Integer.toString(5);
    }

    public final void q(C4101w7 c4101w7, C3830r6 c3830r6, View view, Activity activity, boolean z8, Context context) {
        List list;
        long j9;
        long j10;
        MotionEvent motionEvent;
        if (c4101w7.f34941n) {
            synchronized (this) {
                try {
                    try {
                        C4209y7 p6 = p(c4101w7, this.f31199n, this.f31195L);
                        Long l9 = p6.f35313I;
                        if (l9 != null) {
                            long longValue = l9.longValue();
                            c3830r6.h();
                            ((D6) c3830r6.f30000u).L0(longValue);
                        }
                        Long l10 = p6.J;
                        if (l10 != null) {
                            long longValue2 = l10.longValue();
                            c3830r6.h();
                            ((D6) c3830r6.f30000u).M0(longValue2);
                        }
                        Long l11 = p6.f35314K;
                        if (l11 != null) {
                            long longValue3 = l11.longValue();
                            c3830r6.h();
                            ((D6) c3830r6.f30000u).N0(longValue3);
                        }
                        if (this.f31194K) {
                            Long l12 = p6.f35315L;
                            if (l12 != null) {
                                long longValue4 = l12.longValue();
                                c3830r6.h();
                                ((D6) c3830r6.f30000u).G(longValue4);
                            }
                            Long l13 = p6.f35316M;
                            if (l13 != null) {
                                long longValue5 = l13.longValue();
                                c3830r6.h();
                                ((D6) c3830r6.f30000u).H(longValue5);
                            }
                        }
                    } catch (C3778q7 unused) {
                    }
                    C4262z6 A8 = A6.A();
                    if (this.f31201v > 0) {
                        DisplayMetrics displayMetrics = this.f31195L;
                        char[] cArr = AbstractC4263z7.f35480a;
                        if ((displayMetrics == null || displayMetrics.density == 0.0f) ? false : true) {
                            long b9 = AbstractC4263z7.b(this.f31187C, displayMetrics);
                            A8.h();
                            ((A6) A8.f30000u).M(b9);
                            long b10 = AbstractC4263z7.b(this.f31192H - this.f31190F, this.f31195L);
                            A8.h();
                            ((A6) A8.f30000u).N(b10);
                            long b11 = AbstractC4263z7.b(this.f31193I - this.f31191G, this.f31195L);
                            A8.h();
                            ((A6) A8.f30000u).O(b11);
                            long b12 = AbstractC4263z7.b(this.f31190F, this.f31195L);
                            A8.h();
                            ((A6) A8.f30000u).R(b12);
                            long b13 = AbstractC4263z7.b(this.f31191G, this.f31195L);
                            A8.h();
                            ((A6) A8.f30000u).S(b13);
                            if (this.f31194K && (motionEvent = this.f31199n) != null) {
                                long b14 = AbstractC4263z7.b(((this.f31190F - this.f31192H) + motionEvent.getRawX()) - this.f31199n.getX(), this.f31195L);
                                if (b14 != 0) {
                                    A8.h();
                                    ((A6) A8.f30000u).P(b14);
                                }
                                long b15 = AbstractC4263z7.b(((this.f31191G - this.f31193I) + this.f31199n.getRawY()) - this.f31199n.getY(), this.f31195L);
                                if (b15 != 0) {
                                    A8.h();
                                    ((A6) A8.f30000u).Q(b15);
                                }
                            }
                        }
                    }
                    try {
                        C4209y7 k6 = k(this.f31199n);
                        Long l14 = k6.f35313I;
                        if (l14 != null) {
                            long longValue6 = l14.longValue();
                            A8.h();
                            ((A6) A8.f30000u).B(longValue6);
                        }
                        Long l15 = k6.J;
                        if (l15 != null) {
                            long longValue7 = l15.longValue();
                            A8.h();
                            ((A6) A8.f30000u).C(longValue7);
                        }
                        long longValue8 = k6.f35314K.longValue();
                        A8.h();
                        ((A6) A8.f30000u).I(longValue8);
                        if (this.f31194K) {
                            Long l16 = k6.f35316M;
                            if (l16 != null) {
                                long longValue9 = l16.longValue();
                                A8.h();
                                ((A6) A8.f30000u).D(longValue9);
                            }
                            Long l17 = k6.f35315L;
                            if (l17 != null) {
                                long longValue10 = l17.longValue();
                                A8.h();
                                ((A6) A8.f30000u).G(longValue10);
                            }
                            Long l18 = k6.f35317N;
                            if (l18 != null) {
                                int i = l18.longValue() != 0 ? 2 : 1;
                                A8.h();
                                ((A6) A8.f30000u).T(i);
                            }
                            long j11 = this.f31202w;
                            if (j11 > 0) {
                                DisplayMetrics displayMetrics2 = this.f31195L;
                                char[] cArr2 = AbstractC4263z7.f35480a;
                                Long valueOf = displayMetrics2 != null && (displayMetrics2.density > 0.0f ? 1 : (displayMetrics2.density == 0.0f ? 0 : -1)) != 0 ? Long.valueOf(Math.round(this.f31186B / j11)) : null;
                                if (valueOf != null) {
                                    long longValue11 = valueOf.longValue();
                                    A8.h();
                                    ((A6) A8.f30000u).E(longValue11);
                                } else {
                                    A8.h();
                                    ((A6) A8.f30000u).F();
                                }
                                long round = Math.round(this.f31185A / this.f31202w);
                                A8.h();
                                ((A6) A8.f30000u).H(round);
                            }
                            Long l19 = k6.f35320Q;
                            if (l19 != null) {
                                long longValue12 = l19.longValue();
                                A8.h();
                                ((A6) A8.f30000u).K(longValue12);
                            }
                            Long l20 = k6.f35321R;
                            if (l20 != null) {
                                long longValue13 = l20.longValue();
                                A8.h();
                                ((A6) A8.f30000u).J(longValue13);
                            }
                            Long l21 = k6.f35322S;
                            if (l21 != null) {
                                int i4 = l21.longValue() != 0 ? 2 : 1;
                                A8.h();
                                ((A6) A8.f30000u).U(i4);
                            }
                        }
                    } catch (C3778q7 unused2) {
                    }
                    long j12 = this.f31205z;
                    if (j12 > 0) {
                        A8.h();
                        ((A6) A8.f30000u).L(j12);
                    }
                    A6 a62 = (A6) A8.j();
                    c3830r6.h();
                    ((D6) c3830r6.f30000u).T(a62);
                    long j13 = this.f31201v;
                    if (j13 > 0) {
                        c3830r6.h();
                        ((D6) c3830r6.f30000u).K(j13);
                    }
                    long j14 = this.f31202w;
                    if (j14 > 0) {
                        c3830r6.h();
                        ((D6) c3830r6.f30000u).J(j14);
                    }
                    long j15 = this.f31203x;
                    if (j15 > 0) {
                        c3830r6.h();
                        ((D6) c3830r6.f30000u).I(j15);
                    }
                    long j16 = this.f31204y;
                    if (j16 > 0) {
                        c3830r6.h();
                        ((D6) c3830r6.f30000u).L(j16);
                    }
                    try {
                        LinkedList linkedList = this.f31200u;
                        int size = linkedList.size() - 1;
                        if (size > 0) {
                            c3830r6.h();
                            ((D6) c3830r6.f30000u).V();
                            for (int i9 = 0; i9 < size; i9++) {
                                C4209y7 p9 = p(f31176P, (MotionEvent) linkedList.get(i9), this.f31195L);
                                C4262z6 A9 = A6.A();
                                long longValue14 = p9.f35313I.longValue();
                                A9.h();
                                ((A6) A9.f30000u).B(longValue14);
                                long longValue15 = p9.J.longValue();
                                A9.h();
                                ((A6) A9.f30000u).C(longValue15);
                                A6 a63 = (A6) A9.j();
                                c3830r6.h();
                                ((D6) c3830r6.f30000u).U(a63);
                            }
                        }
                    } catch (C3778q7 unused3) {
                        c3830r6.h();
                        ((D6) c3830r6.f30000u).V();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ArrayList arrayList = new ArrayList();
            if (c4101w7.f34930b != null) {
                int e6 = c4101w7.e();
                C3151ea c3151ea = AbstractC3368ia.f31404B3;
                q2.r rVar = q2.r.f40116e;
                if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                    arrayList.add(new G7(c4101w7, c3830r6, e6, context, (C3615n6) this.f31197N.f23625w, f31183W));
                    arrayList.add(new F7(c4101w7, c3830r6, e6, context));
                    arrayList.add(new E7(c4101w7, c3830r6, e6, context));
                    arrayList.add(new H7(c4101w7, c3830r6, e6, 4));
                    D7 d72 = f31181U;
                    if (d72 != null) {
                        long j17 = d72.f24343d ? d72.f24341b - d72.f24340a : -1L;
                        long j18 = d72.f24342c;
                        d72.f24342c = -1L;
                        j10 = j17;
                        j9 = j18;
                    } else {
                        j9 = -1;
                        j10 = -1;
                    }
                    arrayList.add(new K7(c4101w7, c3830r6, e6, f31180T, j10, j9));
                    arrayList.add(new H7(c4101w7, c3830r6, e6, 11));
                }
                arrayList.add(new T6(1, c4101w7, c3830r6));
                arrayList.add(new H7(c4101w7, c3830r6, e6, 3));
                arrayList.add(new I7(c4101w7, c3830r6, f31179S, e6));
                arrayList.add(new H7(c4101w7, c3830r6, e6, 0));
                arrayList.add(new H7(c4101w7, c3830r6, e6, 9));
                arrayList.add(new H7(c4101w7, c3830r6, e6, 10));
                arrayList.add(new H7(c4101w7, c3830r6, e6, 2));
                arrayList.add(new H7(c4101w7, c3830r6, e6, 7));
                arrayList.add(new H7(c4101w7, c3830r6, e6, 13));
                arrayList.add(new H7(c4101w7, c3830r6, e6, 6));
                arrayList.add(new H7(c4101w7, c3830r6, e6, 12));
                arrayList.add(new J7(c4101w7, c3830r6, e6, new Throwable().getStackTrace()));
                arrayList.add(new J7(c4101w7, c3830r6, e6, view));
                arrayList.add(new M7(c4101w7, c3830r6, e6));
                if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31791t3)).booleanValue()) {
                    arrayList.add(new E7(c4101w7, c3830r6, e6, view, activity));
                }
                arrayList.add(new H7(c4101w7, c3830r6, e6, 5));
                if (!z8) {
                    arrayList.add(new J7(c4101w7, c3830r6, e6, f31182V));
                    arrayList.add(new J7(c4101w7, c3830r6, e6, this.f31196M));
                } else if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31810v3)).booleanValue()) {
                    arrayList.add(new N7(c4101w7, c3830r6, e6, this.f31198O));
                }
            }
            list = arrayList;
        } else {
            c3830r6.n(16384L);
            list = Arrays.asList(new T6(1, c4101w7, c3830r6));
        }
        r(list);
    }
}
