package androidx.compose.ui.draw;

import S.b;
import S.c;
import S.o;
import Z.C0316m;
import e0.AbstractC0557b;
import kotlin.jvm.functions.Function1;
import p0.C0949J;

/* loaded from: classes.dex */
public abstract class a {
    public static final o a(o oVar, Function1 function1) {
        return oVar.h(new DrawBehindElement(function1));
    }

    public static final o b(o oVar, Function1 function1) {
        return oVar.h(new DrawWithCacheElement(function1));
    }

    public static final o c(o oVar, Function1 function1) {
        return oVar.h(new DrawWithContentElement(function1));
    }

    public static o d(o oVar, AbstractC0557b abstractC0557b, c cVar, C0949J c0949j, float f4, C0316m c0316m, int i2) {
        if ((i2 & 4) != 0) {
            cVar = b.f3956k;
        }
        c cVar2 = cVar;
        if ((i2 & 16) != 0) {
            f4 = 1.0f;
        }
        return oVar.h(new PainterElement(abstractC0557b, true, cVar2, c0949j, f4, c0316m));
    }
}
