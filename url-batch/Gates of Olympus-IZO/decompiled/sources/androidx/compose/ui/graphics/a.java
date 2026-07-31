package androidx.compose.ui.graphics;

import U.l;
import Y1.c;
import b0.AbstractC0252C;
import b0.AbstractC0259J;
import b0.C0266Q;
import b0.InterfaceC0263N;

/* loaded from: classes.dex */
public abstract class a {
    public static final l a(l lVar, c cVar) {
        return lVar.e(new BlockGraphicsLayerElement(cVar));
    }

    public static l b(l lVar, float f3, float f4, InterfaceC0263N interfaceC0263N, boolean z3, int i3) {
        float f5 = (i3 & 4) != 0 ? 1.0f : f3;
        float f6 = (i3 & 32) != 0 ? 0.0f : f4;
        long j3 = C0266Q.f4258b;
        InterfaceC0263N interfaceC0263N2 = (i3 & 2048) != 0 ? AbstractC0259J.f4215a : interfaceC0263N;
        boolean z4 = (i3 & 4096) != 0 ? false : z3;
        long j4 = AbstractC0252C.f4209a;
        return lVar.e(new GraphicsLayerElement(1.0f, 1.0f, f5, 0.0f, 0.0f, f6, 0.0f, 0.0f, 0.0f, 8.0f, j3, interfaceC0263N2, z4, j4, j4, 0));
    }
}
