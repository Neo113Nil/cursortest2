package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class h implements f0 {
    public boolean a;
    public boolean b;
    public final /* synthetic */ i c;
    public final /* synthetic */ Predicate d;

    public h(i iVar, Predicate predicate) {
        this.c = iVar;
        this.d = predicate;
        this.b = !iVar.b;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.a) {
            return;
        }
        boolean test = this.d.test(obj);
        i iVar = this.c;
        if (test == iVar.a) {
            this.a = true;
            this.b = iVar.b;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.f0
    public final boolean d() {
        return this.a;
    }

    @Override // j$.util.stream.f0
    public final void c(long j) {
    }

    @Override // j$.util.stream.f0
    public final void end() {
    }
}
