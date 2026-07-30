package z6;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z6.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1073m extends AbstractC1061a {

    /* renamed from: a, reason: collision with root package name */
    public final w6.a f8799a;

    public AbstractC1073m(w6.a aVar) {
        this.f8799a = aVar;
    }

    @Override // w6.a
    public void b(B6.t encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int g7 = g(obj);
        x6.e descriptor = c();
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        B6.t a7 = encoder.a(descriptor);
        Iterator f7 = f(obj);
        for (int i2 = 0; i2 < g7; i2++) {
            a7.l(c(), i2, this.f8799a, f7.next());
        }
        a7.p(descriptor);
    }

    @Override // z6.AbstractC1061a
    public void i(y6.a decoder, int i2, Object obj) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        l(obj, i2, decoder.g(c(), i2, this.f8799a, null));
    }

    public abstract void l(Object obj, int i2, Object obj2);
}
