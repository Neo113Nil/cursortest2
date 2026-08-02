package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gfq implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gfq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [gex, java.lang.Object] */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.b == 0) {
            ((hrz) this.a).a = (gfp) obj;
        } else {
            gfo.a(this.a, (gft) obj);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return this.b != 0 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }
}
