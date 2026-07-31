package androidx.compose.ui.graphics;

import U.q;
import b0.E;
import b0.M;
import b0.Q;
import b0.U;
import e2.InterfaceC0424c;

/* loaded from: classes.dex */
public abstract class a {
    public static final q a(q qVar, InterfaceC0424c interfaceC0424c) {
        return qVar.i(new BlockGraphicsLayerElement(interfaceC0424c));
    }

    public static q b(q qVar, float f3, float f4, Q q3, boolean z3, int i3) {
        float f5 = (i3 & 4) != 0 ? 1.0f : f3;
        float f6 = (i3 & 32) != 0 ? 0.0f : f4;
        long j3 = U.f5400b;
        Q q4 = (i3 & 2048) != 0 ? M.f5355a : q3;
        boolean z4 = (i3 & 4096) != 0 ? false : z3;
        long j4 = E.f5348a;
        return qVar.i(new GraphicsLayerElement(1.0f, 1.0f, f5, 0.0f, 0.0f, f6, 0.0f, 0.0f, 0.0f, 8.0f, j3, q4, z4, j4, j4, 0));
    }
}
