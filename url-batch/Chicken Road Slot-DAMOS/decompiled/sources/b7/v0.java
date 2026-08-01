package b7;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1386a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f1387b;

    public /* synthetic */ v0(w0 w0Var, int i3) {
        this.f1386a = i3;
        this.f1387b = w0Var;
    }

    @Override // b7.h0
    public final void a(z6.b bVar) {
        w0 w0Var;
        switch (this.f1386a) {
            case 0:
                w0Var = this.f1387b;
                w0Var.f1394l.lock();
                try {
                    w0Var.f1392i = bVar;
                    w0Var.f();
                    return;
                } finally {
                }
            default:
                w0Var = this.f1387b;
                w0Var.f1394l.lock();
                try {
                    w0Var.j = bVar;
                    w0Var.f();
                    return;
                } finally {
                }
        }
    }

    @Override // b7.h0
    public final void b(Bundle bundle) {
        w0 w0Var;
        switch (this.f1386a) {
            case 0:
                w0Var = this.f1387b;
                w0Var.f1394l.lock();
                try {
                    Bundle bundle2 = w0Var.f1391h;
                    if (bundle2 == null) {
                        w0Var.f1391h = bundle;
                    } else if (bundle != null) {
                        bundle2.putAll(bundle);
                    }
                    w0Var.f1392i = z6.b.f10865t;
                    w0Var.f();
                    return;
                } finally {
                }
            default:
                w0Var = this.f1387b;
                w0Var.f1394l.lock();
                try {
                    w0Var.j = z6.b.f10865t;
                    w0Var.f();
                    return;
                } finally {
                }
        }
    }

    @Override // b7.h0
    public final void c(int i3) {
        Lock lock;
        z6.b bVar;
        switch (this.f1386a) {
            case 0:
                w0 w0Var = this.f1387b;
                Lock lock2 = w0Var.f1394l;
                lock = w0Var.f1394l;
                lock2.lock();
                try {
                    if (!w0Var.f1393k && (bVar = w0Var.j) != null && bVar.c()) {
                        w0Var.f1393k = true;
                        w0Var.f1390f.onConnectionSuspended(i3);
                        return;
                    }
                    w0Var.f1393k = false;
                    w0Var.f1388d.c(i3);
                    w0Var.j = null;
                    w0Var.f1392i = null;
                    return;
                } finally {
                    lock.unlock();
                }
            default:
                w0 w0Var2 = this.f1387b;
                Lock lock3 = w0Var2.f1394l;
                lock = w0Var2.f1394l;
                lock3.lock();
                try {
                    if (w0Var2.f1393k) {
                        w0Var2.f1393k = false;
                        w0Var2.f1388d.c(i3);
                        w0Var2.j = null;
                        w0Var2.f1392i = null;
                    } else {
                        w0Var2.f1393k = true;
                        w0Var2.f1389e.onConnectionSuspended(i3);
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
        }
    }
}
