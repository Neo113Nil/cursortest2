package j$.util;

import j$.util.function.Consumer$CC;
import j$.util.stream.d0;
import j$.util.stream.f0;
import j$.util.stream.j0;
import j$.util.stream.m0;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Consumer, m0, f0, Supplier {
    public final /* synthetic */ int a;
    public final Consumer b;

    public /* synthetic */ k(Consumer consumer, int i) {
        this.a = i;
        this.b = consumer;
    }

    @Override // j$.util.stream.m0
    public Object a(d0 d0Var, Spliterator spliterator) {
        d0Var.a(d0Var.g(this), spliterator);
        return null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.accept(new l((Map.Entry) obj));
                break;
            case 1:
                this.b.accept(obj);
                break;
            default:
                this.b.accept(obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.f0
    public void c(long j) {
        int i = this.a;
    }

    @Override // j$.util.stream.f0
    public boolean d() {
        switch (this.a) {
        }
        return false;
    }

    @Override // j$.util.stream.m0
    public Object e(d0 d0Var, Spliterator spliterator) {
        new j$.util.stream.g(d0Var, spliterator, d0Var.g(this)).invoke();
        return null;
    }

    @Override // j$.util.stream.f0
    public void end() {
        int i = this.a;
    }

    @Override // j$.util.stream.m0
    public int f() {
        return j0.o;
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return null;
    }

    private final void b(long j) {
    }

    private final void g(long j) {
    }

    private final void h() {
    }

    private final void i() {
    }
}
