package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public abstract class db implements cb {

    /* renamed from: y, reason: collision with root package name */
    protected static volatile gc f4130y;

    /* renamed from: f, reason: collision with root package name */
    protected MotionEvent f4131f;

    /* renamed from: o, reason: collision with root package name */
    protected double f4140o;

    /* renamed from: p, reason: collision with root package name */
    private double f4141p;

    /* renamed from: q, reason: collision with root package name */
    private double f4142q;

    /* renamed from: r, reason: collision with root package name */
    protected float f4143r;

    /* renamed from: s, reason: collision with root package name */
    protected float f4144s;

    /* renamed from: t, reason: collision with root package name */
    protected float f4145t;

    /* renamed from: u, reason: collision with root package name */
    protected float f4146u;

    /* renamed from: x, reason: collision with root package name */
    protected DisplayMetrics f4149x;

    /* renamed from: g, reason: collision with root package name */
    protected final LinkedList<MotionEvent> f4132g = new LinkedList<>();

    /* renamed from: h, reason: collision with root package name */
    protected long f4133h = 0;

    /* renamed from: i, reason: collision with root package name */
    protected long f4134i = 0;

    /* renamed from: j, reason: collision with root package name */
    protected long f4135j = 0;

    /* renamed from: k, reason: collision with root package name */
    protected long f4136k = 0;

    /* renamed from: l, reason: collision with root package name */
    protected long f4137l = 0;

    /* renamed from: m, reason: collision with root package name */
    protected long f4138m = 0;

    /* renamed from: n, reason: collision with root package name */
    protected long f4139n = 0;

    /* renamed from: v, reason: collision with root package name */
    private boolean f4147v = false;

    /* renamed from: w, reason: collision with root package name */
    protected boolean f4148w = false;

    protected db(Context context) {
        try {
            if (((Boolean) sw.c().b(m10.X1)).booleanValue()) {
                u9.d();
            } else {
                hc.a(f4130y);
            }
            this.f4149x = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    private final void m() {
        this.f4137l = 0L;
        this.f4133h = 0L;
        this.f4134i = 0L;
        this.f4135j = 0L;
        this.f4136k = 0L;
        this.f4138m = 0L;
        this.f4139n = 0L;
        if (this.f4132g.size() > 0) {
            Iterator<MotionEvent> it = this.f4132g.iterator();
            while (it.hasNext()) {
                it.next().recycle();
            }
            this.f4132g.clear();
        } else {
            MotionEvent motionEvent = this.f4131f;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.f4131f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String n(Context context, String str, int i7, View view, Activity activity, byte[] bArr) {
        bb bbVar;
        String str2;
        int i8;
        Exception exc;
        int i9;
        int i10;
        String a7;
        int i11;
        int i12 = i7;
        long currentTimeMillis = System.currentTimeMillis();
        boolean booleanValue = ((Boolean) sw.c().b(m10.M1)).booleanValue();
        j8 j8Var = null;
        if (booleanValue) {
            bbVar = f4130y != null ? f4130y.d() : null;
            str2 = true != ((Boolean) sw.c().b(m10.X1)).booleanValue() ? "te" : "be";
        } else {
            bbVar = null;
            str2 = null;
        }
        try {
            if (i12 == 3) {
                j8Var = i(context, view, activity);
                try {
                    this.f4147v = true;
                    i11 = 1002;
                } catch (Exception e7) {
                    exc = e7;
                    i8 = 3;
                    if (booleanValue) {
                        if (i12 != i8) {
                        }
                        bbVar.c(i10, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (j8Var != null) {
                        }
                        a7 = Integer.toString(5);
                        return a7;
                    }
                    i9 = 2;
                    long currentTimeMillis22 = System.currentTimeMillis();
                    if (j8Var != null) {
                    }
                    a7 = Integer.toString(5);
                    return a7;
                }
            } else if (i12 == 2) {
                j8Var = k(context, view, activity);
                i11 = 1008;
            } else {
                j8Var = j(context, null);
                i11 = 1000;
            }
            if (!booleanValue || bbVar == null) {
                i8 = 3;
            } else {
                i8 = 3;
                try {
                    bbVar.c(i11, -1, System.currentTimeMillis() - currentTimeMillis, str2, null);
                } catch (Exception e8) {
                    e = e8;
                    exc = e;
                    if (booleanValue && bbVar != null) {
                        if (i12 != i8) {
                            i9 = 2;
                            i10 = 1003;
                        } else {
                            i9 = 2;
                            if (i12 == 2) {
                                i10 = 1009;
                            } else {
                                i12 = 1;
                                i10 = 1001;
                            }
                        }
                        bbVar.c(i10, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                        long currentTimeMillis222 = System.currentTimeMillis();
                        if (j8Var != null) {
                        }
                        a7 = Integer.toString(5);
                        return a7;
                    }
                    i9 = 2;
                    long currentTimeMillis2222 = System.currentTimeMillis();
                    if (j8Var != null) {
                    }
                    a7 = Integer.toString(5);
                    return a7;
                }
            }
        } catch (Exception e9) {
            e = e9;
            i8 = 3;
        }
        i9 = 2;
        long currentTimeMillis22222 = System.currentTimeMillis();
        if (j8Var != null) {
            try {
            } catch (Exception e10) {
                a7 = Integer.toString(7);
                if (booleanValue && bbVar != null) {
                    bbVar.c(i12 == i8 ? 1007 : i12 == i9 ? 1011 : 1005, -1, System.currentTimeMillis() - currentTimeMillis22222, str2, e10);
                }
            }
            if (j8Var.o().h() != 0) {
                a7 = u9.a(j8Var.o(), str);
                if (booleanValue && bbVar != null) {
                    bbVar.c(i12 == i8 ? 1006 : i12 == i9 ? 1010 : 1004, -1, System.currentTimeMillis() - currentTimeMillis22222, str2, null);
                }
                return a7;
            }
        }
        a7 = Integer.toString(5);
        return a7;
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final synchronized void a(MotionEvent motionEvent) {
        Long l7;
        if (this.f4147v) {
            m();
            this.f4147v = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f4140o = 0.0d;
            this.f4141p = motionEvent.getRawX();
            this.f4142q = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d7 = this.f4141p;
            Double.isNaN(rawX);
            double d8 = rawX - d7;
            double d9 = this.f4142q;
            Double.isNaN(rawY);
            double d10 = rawY - d9;
            this.f4140o += Math.sqrt((d8 * d8) + (d10 * d10));
            this.f4141p = rawX;
            this.f4142q = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    this.f4131f = obtain;
                    this.f4132g.add(obtain);
                    if (this.f4132g.size() > 6) {
                        this.f4132g.remove().recycle();
                    }
                    this.f4135j++;
                    this.f4137l = h(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.f4134i += motionEvent.getHistorySize() + 1;
                    ic l8 = l(motionEvent);
                    Long l9 = l8.f6595e;
                    if (l9 != null && l8.f6598h != null) {
                        this.f4138m += l9.longValue() + l8.f6598h.longValue();
                    }
                    if (this.f4149x != null && (l7 = l8.f6596f) != null && l8.f6599i != null) {
                        this.f4139n += l7.longValue() + l8.f6599i.longValue();
                    }
                } else if (action2 == 3) {
                    this.f4136k++;
                }
            } catch (xb unused) {
            }
        } else {
            this.f4143r = motionEvent.getX();
            this.f4144s = motionEvent.getY();
            this.f4145t = motionEvent.getRawX();
            this.f4146u = motionEvent.getRawY();
            this.f4133h++;
        }
        this.f4148w = true;
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final String c(Context context, View view, Activity activity) {
        return n(context, null, 2, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final String d(Context context) {
        if (jc.f()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return n(context, null, 1, null, null, null);
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final synchronized void e(int i7, int i8, int i9) {
        if (this.f4131f != null) {
            if (((Boolean) sw.c().b(m10.K1)).booleanValue()) {
                m();
            } else {
                this.f4131f.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.f4149x;
        if (displayMetrics != null) {
            float f7 = displayMetrics.density;
            this.f4131f = MotionEvent.obtain(0L, i9, 1, i7 * f7, i8 * f7, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.f4131f = null;
        }
        this.f4148w = false;
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final String f(Context context, String str, View view) {
        return n(context, str, 3, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final String g(Context context, String str, View view, Activity activity) {
        return n(context, str, 3, view, activity, null);
    }

    protected abstract long h(StackTraceElement[] stackTraceElementArr);

    protected abstract j8 i(Context context, View view, Activity activity);

    protected abstract j8 j(Context context, c8 c8Var);

    protected abstract j8 k(Context context, View view, Activity activity);

    protected abstract ic l(MotionEvent motionEvent);
}
