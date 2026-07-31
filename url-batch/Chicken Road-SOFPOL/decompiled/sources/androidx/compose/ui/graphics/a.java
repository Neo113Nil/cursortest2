package androidx.compose.ui.graphics;

import f1.i0;
import f1.l0;
import f1.p;
import f1.y;
import p6.c;
import y0.m;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class a {
    public static final m a(m mVar, c cVar) {
        return mVar.d(new BlockGraphicsLayerElement(cVar));
    }

    public static final m b(m mVar, float f6, float f8, float f9, float f10, long j7, i0 i0Var, boolean z3, long j8, long j9) {
        return mVar.d(new GraphicsLayerElement(f6, f8, f9, f10, j7, i0Var, z3, j8, j9));
    }

    public static m c(m mVar, float f6, float f8, float f9, i0 i0Var, int i) {
        float f10 = (i & 1) != 0 ? 1.0f : f6;
        float f11 = (i & 2) != 0 ? 1.0f : f8;
        float f12 = (i & 4) != 0 ? 1.0f : f9;
        long j7 = l0.f2683b;
        i0 i0Var2 = (i & 2048) != 0 ? p.f2693a : i0Var;
        boolean z3 = (i & 4096) == 0;
        long j8 = y.f2709a;
        return b(mVar, f10, f11, f12, 0.0f, j7, i0Var2, z3, j8, j8);
    }
}
