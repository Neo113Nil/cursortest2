package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.q;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
abstract class a {

    /* renamed from: a, reason: collision with root package name */
    final q f21655a;

    /* renamed from: b, reason: collision with root package name */
    final t f21656b;

    /* renamed from: c, reason: collision with root package name */
    final WeakReference f21657c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f21658d;

    /* renamed from: e, reason: collision with root package name */
    final int f21659e;

    /* renamed from: f, reason: collision with root package name */
    final int f21660f;

    /* renamed from: g, reason: collision with root package name */
    final int f21661g;

    /* renamed from: h, reason: collision with root package name */
    final Drawable f21662h;

    /* renamed from: i, reason: collision with root package name */
    final String f21663i;

    /* renamed from: j, reason: collision with root package name */
    final Object f21664j;

    /* renamed from: k, reason: collision with root package name */
    boolean f21665k;

    /* renamed from: l, reason: collision with root package name */
    boolean f21666l;

    /* renamed from: com.squareup.picasso.a$a, reason: collision with other inner class name */
    static class C0175a extends WeakReference {

        /* renamed from: a, reason: collision with root package name */
        final a f21667a;

        C0175a(a aVar, Object obj, ReferenceQueue referenceQueue) {
            super(obj, referenceQueue);
            this.f21667a = aVar;
        }
    }

    a(q qVar, Object obj, t tVar, int i4, int i5, int i6, Drawable drawable, String str, Object obj2, boolean z4) {
        this.f21655a = qVar;
        this.f21656b = tVar;
        this.f21657c = obj == null ? null : new C0175a(this, obj, qVar.f21767j);
        this.f21659e = i4;
        this.f21660f = i5;
        this.f21658d = z4;
        this.f21661g = i6;
        this.f21662h = drawable;
        this.f21663i = str;
        this.f21664j = obj2 == null ? this : obj2;
    }

    void a() {
        this.f21666l = true;
    }

    abstract void b(Bitmap bitmap, q.e eVar);

    abstract void c(Exception exc);

    String d() {
        return this.f21663i;
    }

    int e() {
        return this.f21659e;
    }

    int f() {
        return this.f21660f;
    }

    q g() {
        return this.f21655a;
    }

    q.f h() {
        return this.f21656b.f21824t;
    }

    t i() {
        return this.f21656b;
    }

    Object j() {
        return this.f21664j;
    }

    Object k() {
        WeakReference weakReference = this.f21657c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    boolean l() {
        return this.f21666l;
    }

    boolean m() {
        return this.f21665k;
    }
}
