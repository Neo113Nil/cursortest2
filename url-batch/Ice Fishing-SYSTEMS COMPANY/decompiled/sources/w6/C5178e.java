package w6;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import r6.C4969b;

/* renamed from: w6.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5178e implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public final C5177d f41699n;

    /* renamed from: u, reason: collision with root package name */
    public final C4969b f41700u;

    /* renamed from: w, reason: collision with root package name */
    public C5176c f41702w;

    /* renamed from: v, reason: collision with root package name */
    public final Logger f41701v = Logger.getLogger(C5178e.class.getName());

    /* renamed from: x, reason: collision with root package name */
    public boolean f41703x = false;

    public C5178e(C5177d c5177d, C4969b c4969b) {
        this.f41699n = c5177d;
        this.f41700u = c4969b;
    }

    public final synchronized boolean a() {
        C5177d c5177d;
        C4969b c4969b;
        try {
            try {
                C5176c c5176c = this.f41702w;
                if (c5176c != null) {
                    if (!this.f41703x) {
                        return true;
                    }
                    c5176c.b();
                    this.f41702w.close();
                    this.f41702w = null;
                }
                this.f41703x = false;
                c5177d = this.f41699n;
                c4969b = this.f41700u;
            } catch (IOException e6) {
                this.f41701v.log(Level.SEVERE, "Error reading from storage", (Throwable) e6);
            }
            if (((AtomicBoolean) c5177d.f41696x).get()) {
                throw new IllegalStateException("You must close any previous ReadableResult before requesting a new one");
            }
            C5176c a9 = c5177d.a(c4969b, 1);
            if (a9 != null) {
                this.f41702w = a9;
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.util.Iterator
    public final synchronized boolean hasNext() {
        if (((AtomicBoolean) this.f41699n.f41695w).get()) {
            return false;
        }
        return a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        synchronized (this) {
            if (((AtomicBoolean) this.f41699n.f41695w).get()) {
                return null;
            }
            if (!a()) {
                return null;
            }
            this.f41703x = true;
            C5176c c5176c = this.f41702w;
            Objects.requireNonNull(c5176c);
            return c5176c.f41687n;
        }
    }

    @Override // java.util.Iterator
    public final synchronized void remove() {
        C5176c c5176c = this.f41702w;
        if (c5176c != null) {
            try {
                c5176c.b();
            } catch (IOException e6) {
                this.f41701v.log(Level.SEVERE, "Error deleting stored item", (Throwable) e6);
            }
        }
    }
}
