package w6;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import x6.C5215a;

/* renamed from: w6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5176c implements Closeable {

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f41687n;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f41688u = new AtomicBoolean(false);

    /* renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f41689v = new AtomicBoolean(false);

    /* renamed from: w, reason: collision with root package name */
    public final AtomicReference f41690w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C5177d f41691x;

    public C5176c(C5177d c5177d, ArrayList arrayList, C5215a c5215a) {
        this.f41691x = c5177d;
        AtomicReference atomicReference = new AtomicReference();
        this.f41690w = atomicReference;
        this.f41687n = arrayList;
        atomicReference.set(c5215a);
    }

    public final void b() {
        if (this.f41689v.get()) {
            return;
        }
        AtomicBoolean atomicBoolean = this.f41688u;
        if (atomicBoolean.compareAndSet(false, true)) {
            try {
                C5215a c5215a = (C5215a) this.f41690w.get();
                Objects.requireNonNull(c5215a);
                c5215a.j();
            } catch (IOException e6) {
                atomicBoolean.set(false);
                throw e6;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f41689v.compareAndSet(false, true)) {
            ((AtomicBoolean) this.f41691x.f41696x).set(false);
            this.f41690w.set(null);
        }
    }
}
