package q4;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import l4.C0496b;

/* renamed from: q4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0604e implements Iterator {

    /* renamed from: f, reason: collision with root package name */
    public final C0603d f5807f;

    /* renamed from: g, reason: collision with root package name */
    public final C0496b f5808g;

    /* renamed from: i, reason: collision with root package name */
    public C0602c f5810i;

    /* renamed from: h, reason: collision with root package name */
    public final Logger f5809h = Logger.getLogger(C0604e.class.getName());

    /* renamed from: j, reason: collision with root package name */
    public boolean f5811j = false;

    public C0604e(C0603d c0603d, C0496b c0496b) {
        this.f5807f = c0603d;
        this.f5808g = c0496b;
    }

    public final synchronized boolean a() {
        C0603d c0603d;
        C0496b c0496b;
        try {
            try {
                C0602c c0602c = this.f5810i;
                if (c0602c != null) {
                    if (!this.f5811j) {
                        return true;
                    }
                    c0602c.a();
                    this.f5810i.close();
                    this.f5810i = null;
                }
                this.f5811j = false;
                c0603d = this.f5807f;
                c0496b = this.f5808g;
            } catch (IOException e4) {
                this.f5809h.log(Level.SEVERE, "Error reading from storage", (Throwable) e4);
            }
            if (((AtomicBoolean) c0603d.f5804j).get()) {
                throw new IllegalStateException("You must close any previous ReadableResult before requesting a new one");
            }
            C0602c a7 = c0603d.a(c0496b, 1);
            if (a7 != null) {
                this.f5810i = a7;
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.util.Iterator
    public final synchronized boolean hasNext() {
        if (((AtomicBoolean) this.f5807f.f5803i).get()) {
            return false;
        }
        return a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        synchronized (this) {
            if (((AtomicBoolean) this.f5807f.f5803i).get()) {
                return null;
            }
            if (!a()) {
                return null;
            }
            this.f5811j = true;
            C0602c c0602c = this.f5810i;
            Objects.requireNonNull(c0602c);
            return c0602c.f5795f;
        }
    }

    @Override // java.util.Iterator
    public final synchronized void remove() {
        C0602c c0602c = this.f5810i;
        if (c0602c != null) {
            try {
                c0602c.a();
            } catch (IOException e4) {
                this.f5809h.log(Level.SEVERE, "Error deleting stored item", (Throwable) e4);
            }
        }
    }
}
