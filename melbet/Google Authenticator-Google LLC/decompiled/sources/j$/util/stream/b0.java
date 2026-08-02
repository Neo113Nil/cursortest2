package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Function;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class b0 extends e0 {
    public boolean b;
    public final /* synthetic */ Function c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(f0 f0Var, Function function) {
        super(f0Var);
        this.c = function;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Stream stream = (Stream) this.c.apply(obj);
        if (stream != null) {
            try {
                boolean z = this.b;
                f0 f0Var = this.a;
                if (z) {
                    Spliterator spliterator = ((Stream) stream.sequential()).spliterator();
                    while (!f0Var.d() && spliterator.tryAdvance(f0Var)) {
                    }
                } else {
                    ((Stream) stream.sequential()).forEach(f0Var);
                }
            } catch (Throwable th) {
                try {
                    stream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (stream != null) {
            stream.close();
        }
    }

    @Override // j$.util.stream.e0, j$.util.stream.f0
    public final void c(long j) {
        this.a.c(-1L);
    }

    @Override // j$.util.stream.e0, j$.util.stream.f0
    public final boolean d() {
        this.b = true;
        return this.a.d();
    }
}
