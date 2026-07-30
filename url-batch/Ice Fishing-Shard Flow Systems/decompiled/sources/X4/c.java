package X4;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class c implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2868d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f2869e = new AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f2870i = new AtomicBoolean(false);

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReference f2871l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f2872m;

    public c(d dVar, ArrayList arrayList, Y4.a aVar) {
        this.f2872m = dVar;
        AtomicReference atomicReference = new AtomicReference();
        this.f2871l = atomicReference;
        this.f2868d = arrayList;
        atomicReference.set(aVar);
    }

    public final void a() {
        if (this.f2870i.get()) {
            return;
        }
        AtomicBoolean atomicBoolean = this.f2869e;
        if (atomicBoolean.compareAndSet(false, true)) {
            try {
                Y4.a aVar = (Y4.a) this.f2871l.get();
                Objects.requireNonNull(aVar);
                aVar.d();
            } catch (IOException e7) {
                atomicBoolean.set(false);
                throw e7;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2870i.compareAndSet(false, true)) {
            ((AtomicBoolean) this.f2872m.f2877m).set(false);
            this.f2871l.set(null);
        }
    }
}
