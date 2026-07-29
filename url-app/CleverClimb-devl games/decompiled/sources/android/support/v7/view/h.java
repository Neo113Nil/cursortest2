package android.support.v7.view;

import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ViewPropertyAnimatorCompatSet.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    ViewPropertyAnimatorListener f1721b;

    /* renamed from: d, reason: collision with root package name */
    private Interpolator f1723d;
    private boolean e;

    /* renamed from: c, reason: collision with root package name */
    private long f1722c = -1;
    private final ViewPropertyAnimatorListenerAdapter f = new ViewPropertyAnimatorListenerAdapter() { // from class: android.support.v7.view.h.1

        /* renamed from: b, reason: collision with root package name */
        private boolean f1725b = false;

        /* renamed from: c, reason: collision with root package name */
        private int f1726c = 0;

        @Override // android.support.v4.view.ViewPropertyAnimatorListenerAdapter, android.support.v4.view.ViewPropertyAnimatorListener
        public void onAnimationStart(View view) {
            if (this.f1725b) {
                return;
            }
            this.f1725b = true;
            if (h.this.f1721b != null) {
                h.this.f1721b.onAnimationStart(null);
            }
        }

        void a() {
            this.f1726c = 0;
            this.f1725b = false;
            h.this.b();
        }

        @Override // android.support.v4.view.ViewPropertyAnimatorListenerAdapter, android.support.v4.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(View view) {
            int i = this.f1726c + 1;
            this.f1726c = i;
            if (i == h.this.f1720a.size()) {
                if (h.this.f1721b != null) {
                    h.this.f1721b.onAnimationEnd(null);
                }
                a();
            }
        }
    };

    /* renamed from: a, reason: collision with root package name */
    final ArrayList<ViewPropertyAnimatorCompat> f1720a = new ArrayList<>();

    public h a(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat) {
        if (!this.e) {
            this.f1720a.add(viewPropertyAnimatorCompat);
        }
        return this;
    }

    public h a(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat, ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2) {
        this.f1720a.add(viewPropertyAnimatorCompat);
        viewPropertyAnimatorCompat2.setStartDelay(viewPropertyAnimatorCompat.getDuration());
        this.f1720a.add(viewPropertyAnimatorCompat2);
        return this;
    }

    public void a() {
        if (this.e) {
            return;
        }
        Iterator<ViewPropertyAnimatorCompat> it = this.f1720a.iterator();
        while (it.hasNext()) {
            ViewPropertyAnimatorCompat next = it.next();
            if (this.f1722c >= 0) {
                next.setDuration(this.f1722c);
            }
            if (this.f1723d != null) {
                next.setInterpolator(this.f1723d);
            }
            if (this.f1721b != null) {
                next.setListener(this.f);
            }
            next.start();
        }
        this.e = true;
    }

    void b() {
        this.e = false;
    }

    public void c() {
        if (this.e) {
            Iterator<ViewPropertyAnimatorCompat> it = this.f1720a.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            this.e = false;
        }
    }

    public h a(long j) {
        if (!this.e) {
            this.f1722c = j;
        }
        return this;
    }

    public h a(Interpolator interpolator) {
        if (!this.e) {
            this.f1723d = interpolator;
        }
        return this;
    }

    public h a(ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        if (!this.e) {
            this.f1721b = viewPropertyAnimatorListener;
        }
        return this;
    }
}
