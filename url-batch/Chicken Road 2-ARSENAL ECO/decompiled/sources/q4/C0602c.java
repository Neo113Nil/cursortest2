package q4;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import r4.C0618a;

/* renamed from: q4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0602c implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f5795f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f5796g = new AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f5797h = new AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReference f5798i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0603d f5799j;

    public C0602c(C0603d c0603d, ArrayList arrayList, C0618a c0618a) {
        this.f5799j = c0603d;
        AtomicReference atomicReference = new AtomicReference();
        this.f5798i = atomicReference;
        this.f5795f = arrayList;
        atomicReference.set(c0618a);
    }

    public final void a() {
        if (this.f5797h.get()) {
            return;
        }
        AtomicBoolean atomicBoolean = this.f5796g;
        if (atomicBoolean.compareAndSet(false, true)) {
            try {
                C0618a c0618a = (C0618a) this.f5798i.get();
                Objects.requireNonNull(c0618a);
                c0618a.d();
            } catch (IOException e4) {
                atomicBoolean.set(false);
                throw e4;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5797h.compareAndSet(false, true)) {
            ((AtomicBoolean) this.f5799j.f5804j).set(false);
            this.f5798i.set(null);
        }
    }
}
