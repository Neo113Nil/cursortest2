package androidx.compose.ui.graphics;

import S.o;
import Z.B;
import Z.K;
import Z.P;
import Z.U;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class a {
    public static final o a(o oVar, Function1 function1) {
        return oVar.h(new BlockGraphicsLayerElement(function1));
    }

    public static o b(o oVar, float f4, float f5, P p4, boolean z4, int i2) {
        float f6 = (i2 & 4) != 0 ? 1.0f : f4;
        float f7 = (i2 & 32) != 0 ? 0.0f : f5;
        long j4 = U.f4510b;
        P p5 = (i2 & 2048) != 0 ? K.f4461a : p4;
        boolean z5 = (i2 & 4096) != 0 ? false : z4;
        long j5 = B.f4449a;
        return oVar.h(new GraphicsLayerElement(1.0f, 1.0f, f6, 0.0f, 0.0f, f7, 0.0f, 0.0f, 0.0f, 8.0f, j4, p5, z5, j5, j5, 0));
    }
}
