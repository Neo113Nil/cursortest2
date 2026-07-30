package X4;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class e implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final d f2880d;

    /* renamed from: e, reason: collision with root package name */
    public final S4.b f2881e;

    /* renamed from: l, reason: collision with root package name */
    public c f2883l;

    /* renamed from: i, reason: collision with root package name */
    public final Logger f2882i = Logger.getLogger(e.class.getName());

    /* renamed from: m, reason: collision with root package name */
    public boolean f2884m = false;

    public e(d dVar, S4.b bVar) {
        this.f2880d = dVar;
        this.f2881e = bVar;
    }

    public final synchronized boolean a() {
        d dVar;
        S4.b bVar;
        try {
            try {
                c cVar = this.f2883l;
                if (cVar != null) {
                    if (!this.f2884m) {
                        return true;
                    }
                    cVar.a();
                    this.f2883l.close();
                    this.f2883l = null;
                }
                this.f2884m = false;
                dVar = this.f2880d;
                bVar = this.f2881e;
            } catch (IOException e7) {
                this.f2882i.log(Level.SEVERE, "Error reading from storage", (Throwable) e7);
            }
            if (((AtomicBoolean) dVar.f2877m).get()) {
                throw new IllegalStateException("You must close any previous ReadableResult before requesting a new one");
            }
            c a7 = dVar.a(bVar, 1);
            if (a7 != null) {
                this.f2883l = a7;
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.util.Iterator
    public final synchronized boolean hasNext() {
        if (((AtomicBoolean) this.f2880d.f2876l).get()) {
            return false;
        }
        return a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        synchronized (this) {
            if (((AtomicBoolean) this.f2880d.f2876l).get()) {
                return null;
            }
            if (!a()) {
                return null;
            }
            this.f2884m = true;
            c cVar = this.f2883l;
            Objects.requireNonNull(cVar);
            return cVar.f2868d;
        }
    }

    @Override // java.util.Iterator
    public final synchronized void remove() {
        c cVar = this.f2883l;
        if (cVar != null) {
            try {
                cVar.a();
            } catch (IOException e7) {
                this.f2882i.log(Level.SEVERE, "Error deleting stored item", (Throwable) e7);
            }
        }
    }
}
