package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class nn0 {

    /* renamed from: a, reason: collision with root package name */
    private final v3.d f9180a;

    /* renamed from: b, reason: collision with root package name */
    private final xn0 f9181b;

    /* renamed from: e, reason: collision with root package name */
    private final String f9184e;

    /* renamed from: f, reason: collision with root package name */
    private final String f9185f;

    /* renamed from: d, reason: collision with root package name */
    private final Object f9183d = new Object();

    /* renamed from: g, reason: collision with root package name */
    private long f9186g = -1;

    /* renamed from: h, reason: collision with root package name */
    private long f9187h = -1;

    /* renamed from: i, reason: collision with root package name */
    private long f9188i = 0;

    /* renamed from: j, reason: collision with root package name */
    private long f9189j = -1;

    /* renamed from: k, reason: collision with root package name */
    private long f9190k = -1;

    /* renamed from: c, reason: collision with root package name */
    private final LinkedList<mn0> f9182c = new LinkedList<>();

    nn0(v3.d dVar, xn0 xn0Var, String str, String str2) {
        this.f9180a = dVar;
        this.f9181b = xn0Var;
        this.f9184e = str;
        this.f9185f = str2;
    }

    public final Bundle a() {
        Bundle bundle;
        synchronized (this.f9183d) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.f9184e);
            bundle.putString("slotid", this.f9185f);
            bundle.putBoolean("ismediation", false);
            bundle.putLong("treq", this.f9189j);
            bundle.putLong("tresponse", this.f9190k);
            bundle.putLong("timp", this.f9186g);
            bundle.putLong("tload", this.f9187h);
            bundle.putLong("pcc", this.f9188i);
            bundle.putLong("tfetch", -1L);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator<mn0> it = this.f9182c.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().b());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    public final String c() {
        return this.f9184e;
    }

    public final void d() {
        synchronized (this.f9183d) {
            if (this.f9190k != -1) {
                mn0 mn0Var = new mn0(this);
                mn0Var.d();
                this.f9182c.add(mn0Var);
                this.f9188i++;
                this.f9181b.d();
                this.f9181b.b(this);
            }
        }
    }

    public final void e() {
        synchronized (this.f9183d) {
            if (this.f9190k != -1 && !this.f9182c.isEmpty()) {
                mn0 last = this.f9182c.getLast();
                if (last.a() == -1) {
                    last.c();
                    this.f9181b.b(this);
                }
            }
        }
    }

    public final void f() {
        synchronized (this.f9183d) {
            if (this.f9190k != -1 && this.f9186g == -1) {
                this.f9186g = this.f9180a.a();
                this.f9181b.b(this);
            }
            this.f9181b.e();
        }
    }

    public final void g() {
        synchronized (this.f9183d) {
            this.f9181b.f();
        }
    }

    public final void h(boolean z6) {
        synchronized (this.f9183d) {
            if (this.f9190k != -1) {
                this.f9187h = this.f9180a.a();
            }
        }
    }

    public final void i() {
        synchronized (this.f9183d) {
            this.f9181b.g();
        }
    }

    public final void j(kv kvVar) {
        synchronized (this.f9183d) {
            long a7 = this.f9180a.a();
            this.f9189j = a7;
            this.f9181b.h(kvVar, a7);
        }
    }

    public final void k(long j7) {
        synchronized (this.f9183d) {
            this.f9190k = j7;
            if (j7 != -1) {
                this.f9181b.b(this);
            }
        }
    }
}
