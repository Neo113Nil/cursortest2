package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.g2;

/* loaded from: classes5.dex */
final class n0 {
    public final CoroutineContext context;
    private final g2[] elements;

    /* renamed from: i, reason: collision with root package name */
    private int f17053i;
    private final Object[] values;

    public n0(CoroutineContext coroutineContext, int i8) {
        this.context = coroutineContext;
        this.values = new Object[i8];
        this.elements = new g2[i8];
    }

    public final void append(g2 g2Var, Object obj) {
        Object[] objArr = this.values;
        int i8 = this.f17053i;
        objArr[i8] = obj;
        g2[] g2VarArr = this.elements;
        this.f17053i = i8 + 1;
        kotlin.jvm.internal.s.checkNotNull(g2Var, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        g2VarArr[i8] = g2Var;
    }

    public final void restore(CoroutineContext coroutineContext) {
        int length = this.elements.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i8 = length - 1;
            g2 g2Var = this.elements[length];
            kotlin.jvm.internal.s.checkNotNull(g2Var);
            g2Var.b(coroutineContext, this.values[length]);
            if (i8 < 0) {
                return;
            } else {
                length = i8;
            }
        }
    }
}
