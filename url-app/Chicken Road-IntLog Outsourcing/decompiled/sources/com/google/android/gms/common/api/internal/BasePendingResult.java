package com.google.android.gms.common.api.internal;

import Y4.d;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import m1.l;
import n1.AbstractC1326m;
import n1.HandlerC1317d;
import o1.u;
import u1.AbstractC1477a;

/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends l> extends AbstractC1477a {

    /* renamed from: k, reason: collision with root package name */
    public static final d f4981k = new d(2);

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f4983d;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4987h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4988i;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4982c = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final CountDownLatch f4984e = new CountDownLatch(1);

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f4985f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f4986g = new AtomicReference();

    /* renamed from: j, reason: collision with root package name */
    public boolean f4989j = false;

    public BasePendingResult(GoogleApiClient googleApiClient) {
        new HandlerC1317d(googleApiClient != null ? googleApiClient.e() : Looper.getMainLooper(), 2);
        this.f4983d = new WeakReference(googleApiClient);
    }

    public final void E() {
        synchronized (this.f4982c) {
            try {
                if (this.f4987h) {
                    return;
                }
                this.f4987h = true;
                I(Status.f4976g);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void F(Status status) {
        synchronized (this.f4982c) {
            try {
                if (!G()) {
                    H(status);
                    this.f4988i = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean G() {
        return this.f4984e.getCount() == 0;
    }

    public final void H(Status status) {
        synchronized (this.f4982c) {
            try {
                if (this.f4988i || this.f4987h) {
                    return;
                }
                G();
                u.i("Results have already been set", !G());
                I(status);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void I(Status status) {
        status.getClass();
        this.f4984e.countDown();
        ArrayList arrayList = this.f4985f;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            ((AbstractC1326m) arrayList.get(0)).getClass();
            throw null;
        }
    }

    public final void J() {
        boolean z = true;
        if (!this.f4989j && !((Boolean) f4981k.get()).booleanValue()) {
            z = false;
        }
        this.f4989j = z;
    }
}
