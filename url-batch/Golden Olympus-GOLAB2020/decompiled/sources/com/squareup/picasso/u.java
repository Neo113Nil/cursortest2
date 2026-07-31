package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.squareup.picasso.q;
import com.squareup.picasso.t;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class u {

    /* renamed from: m, reason: collision with root package name */
    private static final AtomicInteger f21842m = new AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    private final q f21843a;

    /* renamed from: b, reason: collision with root package name */
    private final t.b f21844b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f21845c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f21846d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f21847e = true;

    /* renamed from: f, reason: collision with root package name */
    private int f21848f;

    /* renamed from: g, reason: collision with root package name */
    private int f21849g;

    /* renamed from: h, reason: collision with root package name */
    private int f21850h;

    /* renamed from: i, reason: collision with root package name */
    private int f21851i;

    /* renamed from: j, reason: collision with root package name */
    private Drawable f21852j;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f21853k;

    /* renamed from: l, reason: collision with root package name */
    private Object f21854l;

    u(q qVar, Uri uri, int i4) {
        if (qVar.f21771n) {
            throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
        }
        this.f21843a = qVar;
        this.f21844b = new t.b(uri, i4, qVar.f21768k);
    }

    private t b(long j4) {
        int andIncrement = f21842m.getAndIncrement();
        t a4 = this.f21844b.a();
        a4.f21805a = andIncrement;
        a4.f21806b = j4;
        boolean z4 = this.f21843a.f21770m;
        if (z4) {
            y.t("Main", "created", a4.g(), a4.toString());
        }
        t m4 = this.f21843a.m(a4);
        if (m4 != a4) {
            m4.f21805a = andIncrement;
            m4.f21806b = j4;
            if (z4) {
                y.t("Main", "changed", m4.d(), "into " + m4);
            }
        }
        return m4;
    }

    private Drawable c() {
        int i4 = this.f21848f;
        return i4 != 0 ? this.f21843a.f21761d.getDrawable(i4) : this.f21852j;
    }

    u a() {
        this.f21854l = null;
        return this;
    }

    public void d(ImageView imageView) {
        e(imageView, null);
    }

    public void e(ImageView imageView, d1.b bVar) {
        Bitmap j4;
        long nanoTime = System.nanoTime();
        y.c();
        if (imageView == null) {
            throw new IllegalArgumentException("Target must not be null.");
        }
        if (!this.f21844b.b()) {
            this.f21843a.b(imageView);
            if (this.f21847e) {
                r.d(imageView, c());
                return;
            }
            return;
        }
        if (this.f21846d) {
            if (this.f21844b.c()) {
                throw new IllegalStateException("Fit cannot be used with resize.");
            }
            int width = imageView.getWidth();
            int height = imageView.getHeight();
            if (width == 0 || height == 0) {
                if (this.f21847e) {
                    r.d(imageView, c());
                }
                this.f21843a.d(imageView, new f(this, imageView, bVar));
                return;
            }
            this.f21844b.d(width, height);
        }
        t b4 = b(nanoTime);
        String f4 = y.f(b4);
        if (!m.a(this.f21850h) || (j4 = this.f21843a.j(f4)) == null) {
            if (this.f21847e) {
                r.d(imageView, c());
            }
            this.f21843a.f(new i(this.f21843a, imageView, b4, this.f21850h, this.f21851i, this.f21849g, this.f21853k, f4, this.f21854l, bVar, this.f21845c));
            return;
        }
        this.f21843a.b(imageView);
        q qVar = this.f21843a;
        Context context = qVar.f21761d;
        q.e eVar = q.e.MEMORY;
        r.c(imageView, context, j4, eVar, this.f21845c, qVar.f21769l);
        if (this.f21843a.f21770m) {
            y.t("Main", "completed", b4.g(), "from " + eVar);
        }
        if (bVar != null) {
            bVar.onSuccess();
        }
    }

    public u f(int i4) {
        if (!this.f21847e) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        }
        if (i4 == 0) {
            throw new IllegalArgumentException("Placeholder image resource invalid.");
        }
        if (this.f21852j != null) {
            throw new IllegalStateException("Placeholder image already set.");
        }
        this.f21848f = i4;
        return this;
    }

    public u g(int i4, int i5) {
        this.f21844b.d(i4, i5);
        return this;
    }

    u h() {
        this.f21846d = false;
        return this;
    }
}
