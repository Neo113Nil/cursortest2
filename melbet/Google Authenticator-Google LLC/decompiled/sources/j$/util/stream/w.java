package j$.util.stream;

import j$.util.stream.Collector;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class w extends j$.nio.file.attribute.a {
    public final /* synthetic */ BinaryOperator a;
    public final /* synthetic */ BiConsumer b;
    public final /* synthetic */ Supplier c;
    public final /* synthetic */ Collector d;

    public w(k0 k0Var, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        this.a = binaryOperator;
        this.b = biConsumer;
        this.c = supplier;
        this.d = collector;
    }

    @Override // j$.util.stream.m0
    public final int f() {
        if (this.d.characteristics().contains(Collector.Characteristics.UNORDERED)) {
            return j0.o;
        }
        return 0;
    }
}
