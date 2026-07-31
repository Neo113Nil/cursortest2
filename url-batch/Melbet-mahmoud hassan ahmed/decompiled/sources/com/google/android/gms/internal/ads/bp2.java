package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class bp2 {

    /* renamed from: e, reason: collision with root package name */
    private static bp2 f3489e;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f3490a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<WeakReference<h94>> f3491b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final Object f3492c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private int f3493d = 0;

    private bp2(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new xl2(this, null), intentFilter);
    }

    public static synchronized bp2 b(Context context) {
        bp2 bp2Var;
        synchronized (bp2.class) {
            if (f3489e == null) {
                f3489e = new bp2(context);
            }
            bp2Var = f3489e;
        }
        return bp2Var;
    }

    static /* synthetic */ void c(bp2 bp2Var, int i7) {
        synchronized (bp2Var.f3492c) {
            if (bp2Var.f3493d == i7) {
                return;
            }
            bp2Var.f3493d = i7;
            Iterator<WeakReference<h94>> it = bp2Var.f3491b.iterator();
            while (it.hasNext()) {
                WeakReference<h94> next = it.next();
                h94 h94Var = next.get();
                if (h94Var != null) {
                    h94Var.f6142a.j(i7);
                } else {
                    bp2Var.f3491b.remove(next);
                }
            }
        }
    }

    public final int a() {
        int i7;
        synchronized (this.f3492c) {
            i7 = this.f3493d;
        }
        return i7;
    }

    public final void d(final h94 h94Var) {
        Iterator<WeakReference<h94>> it = this.f3491b.iterator();
        while (it.hasNext()) {
            WeakReference<h94> next = it.next();
            if (next.get() == null) {
                this.f3491b.remove(next);
            }
        }
        this.f3491b.add(new WeakReference<>(h94Var));
        final byte[] bArr = null;
        this.f3490a.post(new Runnable(h94Var, bArr) { // from class: com.google.android.gms.internal.ads.ui2

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ h94 f12824g;

            @Override // java.lang.Runnable
            public final void run() {
                bp2 bp2Var = bp2.this;
                h94 h94Var2 = this.f12824g;
                h94Var2.f6142a.j(bp2Var.a());
            }
        });
    }
}
