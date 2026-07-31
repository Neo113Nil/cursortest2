package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.yandex.mobile.ads.impl.InterfaceC1861cm;
import com.yandex.mobile.ads.impl.ii2;
import com.yandex.mobile.ads.impl.qq1;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class op1<T> implements Comparable<op1<T>> {

    /* renamed from: b, reason: collision with root package name */
    private final ii2.a f30131b;

    /* renamed from: c, reason: collision with root package name */
    private final int f30132c;

    /* renamed from: d, reason: collision with root package name */
    private final String f30133d;

    /* renamed from: e, reason: collision with root package name */
    private final int f30134e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f30135f;

    /* renamed from: g, reason: collision with root package name */
    private qq1.a f30136g;

    /* renamed from: h, reason: collision with root package name */
    private Integer f30137h;

    /* renamed from: i, reason: collision with root package name */
    private cq1 f30138i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f30139j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f30140k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f30141l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f30142m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f30143n;

    /* renamed from: o, reason: collision with root package name */
    private gr1 f30144o;

    /* renamed from: p, reason: collision with root package name */
    private InterfaceC1861cm.a f30145p;

    /* renamed from: q, reason: collision with root package name */
    private Object f30146q;

    /* renamed from: r, reason: collision with root package name */
    private b f30147r;

    final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f30148b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f30149c;

        a(String str, long j4) {
            this.f30148b = str;
            this.f30149c = j4;
        }

        @Override // java.lang.Runnable
        public final void run() {
            op1.this.f30131b.a(this.f30148b, this.f30149c);
            op1 op1Var = op1.this;
            op1Var.f30131b.a(op1Var.toString());
        }
    }

    interface b {
    }

    public op1(int i4, String str, qq1.a aVar) {
        this.f30131b = ii2.a.f27215c ? new ii2.a() : null;
        this.f30135f = new Object();
        this.f30139j = true;
        this.f30140k = false;
        this.f30141l = false;
        this.f30142m = false;
        this.f30143n = false;
        this.f30145p = null;
        this.f30132c = i4;
        this.f30133d = str;
        this.f30136g = aVar;
        a(new b00());
        this.f30134e = b(str);
    }

    protected abstract qq1<T> a(lc1 lc1Var);

    protected abstract void a(T t4);

    protected hi2 b(hi2 hi2Var) {
        return hi2Var;
    }

    final void c(String str) {
        cq1 cq1Var = this.f30138i;
        if (cq1Var != null) {
            cq1Var.b(this);
        }
        if (ii2.a.f27215c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new a(str, id));
            } else {
                this.f30131b.a(str, id);
                this.f30131b.a(toString());
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        op1 op1Var = (op1) obj;
        int g4 = g();
        int g5 = op1Var.g();
        return g4 == g5 ? this.f30137h.intValue() - op1Var.f30137h.intValue() : C2155p8.a(g5) - C2155p8.a(g4);
    }

    public final String d() {
        String l4 = l();
        int i4 = this.f30132c;
        if (i4 == 0 || i4 == -1) {
            return l4;
        }
        return Integer.toString(i4) + '-' + l4;
    }

    public Map<String, String> e() {
        return Collections.EMPTY_MAP;
    }

    public final int f() {
        return this.f30132c;
    }

    public int g() {
        return 2;
    }

    public final gr1 h() {
        return this.f30144o;
    }

    public final Object i() {
        return this.f30146q;
    }

    public final int j() {
        return this.f30144o.a();
    }

    public final int k() {
        return this.f30134e;
    }

    public String l() {
        return this.f30133d;
    }

    public final boolean m() {
        boolean z4;
        synchronized (this.f30135f) {
            z4 = this.f30141l;
        }
        return z4;
    }

    public final boolean n() {
        boolean z4;
        synchronized (this.f30135f) {
            z4 = this.f30140k;
        }
        return z4;
    }

    public final void o() {
        synchronized (this.f30135f) {
            this.f30141l = true;
        }
    }

    final void p() {
        b bVar;
        synchronized (this.f30135f) {
            bVar = this.f30147r;
        }
        if (bVar != null) {
            ((wi2) bVar).b(this);
        }
    }

    public final void q() {
        this.f30139j = false;
    }

    public final void r() {
        this.f30143n = true;
    }

    public final void s() {
        this.f30142m = true;
    }

    public final boolean t() {
        return this.f30139j;
    }

    public final String toString() {
        String str = "0x" + Integer.toHexString(this.f30134e);
        StringBuilder sb = new StringBuilder();
        sb.append(n() ? "[X] " : "[ ] ");
        sb.append(l());
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        sb.append(qp1.a(g()));
        sb.append(" ");
        sb.append(this.f30137h);
        return sb.toString();
    }

    public final boolean u() {
        return this.f30143n;
    }

    public final boolean v() {
        return this.f30142m;
    }

    public void a() {
        synchronized (this.f30135f) {
            this.f30140k = true;
            this.f30136g = null;
        }
    }

    public byte[] b() {
        return null;
    }

    private static int b(String str) {
        Uri parse;
        String host;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    public final void a(hi2 hi2Var) {
        qq1.a aVar;
        synchronized (this.f30135f) {
            aVar = this.f30136g;
        }
        if (aVar != null) {
            aVar.a(hi2Var);
        }
    }

    public final void b(int i4) {
        this.f30137h = Integer.valueOf(i4);
    }

    public final void b(Object obj) {
        this.f30146q = obj;
    }

    public final InterfaceC1861cm.a c() {
        return this.f30145p;
    }

    final void a(qq1<?> qq1Var) {
        b bVar;
        synchronized (this.f30135f) {
            bVar = this.f30147r;
        }
        if (bVar != null) {
            ((wi2) bVar).a(this, qq1Var);
        }
    }

    final void a(int i4) {
        cq1 cq1Var = this.f30138i;
        if (cq1Var != null) {
            cq1Var.a(this, i4);
        }
    }

    public final void a(InterfaceC1861cm.a aVar) {
        this.f30145p = aVar;
    }

    final void a(b bVar) {
        synchronized (this.f30135f) {
            this.f30147r = bVar;
        }
    }

    public final void a(cq1 cq1Var) {
        this.f30138i = cq1Var;
    }

    public final void a(b00 b00Var) {
        this.f30144o = b00Var;
    }

    public final void a(String str) {
        if (ii2.a.f27215c) {
            this.f30131b.a(str, Thread.currentThread().getId());
        }
    }
}
