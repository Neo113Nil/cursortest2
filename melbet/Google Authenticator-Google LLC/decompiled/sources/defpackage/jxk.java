package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxk extends jxr implements Closeable {
    public final jxs a;
    public ScheduledFuture b;
    private final jxr h;
    private ArrayList i;
    private jxl j;
    private Throwable k;
    private boolean l;

    public jxk(jxr jxrVar) {
        super(jxrVar, jxrVar.f);
        this.a = jxrVar.b();
        this.h = new jxr(this, this.f);
    }

    @Override // defpackage.jxr
    public final jxr a() {
        return this.h.a();
    }

    @Override // defpackage.jxr
    public final jxs b() {
        return this.a;
    }

    @Override // defpackage.jxr
    public final Throwable c() {
        if (i()) {
            return this.k;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        j(null);
    }

    @Override // defpackage.jxr
    public final void d(jxl jxlVar, Executor executor) {
        m(executor, "executor");
        e(new jxn(executor, jxlVar, this));
    }

    public final void e(jxn jxnVar) {
        synchronized (this) {
            if (i()) {
                jxnVar.a();
            } else {
                ArrayList arrayList = this.i;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList();
                    this.i = arrayList2;
                    arrayList2.add(jxnVar);
                    jxk jxkVar = this.e;
                    if (jxkVar != null) {
                        this.j = new kli(this, 1);
                        jxkVar.e(new jxn(jxm.a, this.j, this));
                    }
                } else {
                    arrayList.add(jxnVar);
                }
            }
        }
    }

    @Override // defpackage.jxr
    public final void f(jxr jxrVar) {
        this.h.f(jxrVar);
    }

    @Override // defpackage.jxr
    public final void g(jxl jxlVar) {
        h(jxlVar, this);
    }

    public final void h(jxl jxlVar, jxr jxrVar) {
        synchronized (this) {
            ArrayList arrayList = this.i;
            if (arrayList != null) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    jxn jxnVar = (jxn) this.i.get(size);
                    if (jxnVar.a == jxlVar && jxnVar.b == jxrVar) {
                        this.i.remove(size);
                        break;
                    }
                }
                if (this.i.isEmpty()) {
                    jxk jxkVar = this.e;
                    if (jxkVar != null) {
                        jxkVar.h(this.j, jxkVar);
                    }
                    this.j = null;
                    this.i = null;
                }
            }
        }
    }

    @Override // defpackage.jxr
    public final boolean i() {
        synchronized (this) {
            if (this.l) {
                return true;
            }
            if (!super.i()) {
                return false;
            }
            j(super.c());
            return true;
        }
    }

    public final void j(Throwable th) {
        int i;
        boolean z;
        ScheduledFuture scheduledFuture;
        synchronized (this) {
            if (this.l) {
                z = false;
                scheduledFuture = null;
            } else {
                z = true;
                this.l = true;
                scheduledFuture = this.b;
                if (scheduledFuture != null) {
                    this.b = null;
                } else {
                    scheduledFuture = null;
                }
                this.k = th;
            }
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        if (z) {
            synchronized (this) {
                ArrayList arrayList = this.i;
                if (arrayList == null) {
                    return;
                }
                jxl jxlVar = this.j;
                this.j = null;
                this.i = null;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    jxn jxnVar = (jxn) arrayList.get(i2);
                    if (jxnVar.b == this) {
                        jxnVar.a();
                    }
                }
                int size2 = arrayList.size();
                for (i = 0; i < size2; i++) {
                    jxn jxnVar2 = (jxn) arrayList.get(i);
                    if (jxnVar2.b != this) {
                        jxnVar2.a();
                    }
                }
                jxk jxkVar = this.e;
                if (jxkVar != null) {
                    jxkVar.h(jxlVar, jxkVar);
                }
            }
        }
    }

    public jxk(jxr jxrVar, jxs jxsVar) {
        super(jxrVar, jxrVar.f);
        this.a = jxsVar;
        this.h = new jxr(this, this.f);
    }
}
