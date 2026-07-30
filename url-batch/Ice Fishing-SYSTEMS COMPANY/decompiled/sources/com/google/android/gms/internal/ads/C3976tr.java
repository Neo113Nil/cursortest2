package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.tr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3976tr {

    /* renamed from: f, reason: collision with root package name */
    public static C3976tr f34482f;

    /* renamed from: a, reason: collision with root package name */
    public final Executor f34483a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f34484b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f34485c;

    /* renamed from: d, reason: collision with root package name */
    public int f34486d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f34487e;

    public C3976tr(Context context) {
        Executor j9 = AbstractC3217fl.j();
        this.f34483a = j9;
        this.f34484b = new CopyOnWriteArrayList();
        this.f34485c = new Object();
        this.f34486d = 0;
        j9.execute(new RunnableC3329hp(4, this, context));
    }

    public static synchronized C3976tr a(Context context) {
        C3976tr c3976tr;
        synchronized (C3976tr.class) {
            try {
                if (f34482f == null) {
                    f34482f = new C3976tr(context);
                }
                c3976tr = f34482f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3976tr;
    }

    public final int b() {
        int i;
        synchronized (this.f34485c) {
            i = this.f34486d;
        }
        return i;
    }

    public final void c(int i) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f34484b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C2665Lq c2665Lq = (C2665Lq) it.next();
            if (c2665Lq.f26226a.get() == null) {
                copyOnWriteArrayList.remove(c2665Lq);
            }
        }
        synchronized (this.f34485c) {
            try {
                if (this.f34487e && this.f34486d == i) {
                    return;
                }
                this.f34487e = true;
                this.f34486d = i;
                Iterator it2 = this.f34484b.iterator();
                while (it2.hasNext()) {
                    C2665Lq c2665Lq2 = (C2665Lq) it2.next();
                    c2665Lq2.getClass();
                    c2665Lq2.f26227b.execute(new RunnableC3376ij(17, c2665Lq2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
