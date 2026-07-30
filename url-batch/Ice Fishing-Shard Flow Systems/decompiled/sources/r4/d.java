package r4;

import android.graphics.drawable.Drawable;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import t.AbstractC0901c;
import t.C0899a;
import t.C0900b;
import x5.InterfaceC1017g;

/* loaded from: classes.dex */
public final class d implements s4.o, InterfaceC1017g {
    public String a(List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(list);
        objectOutputStream.flush();
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
        return encodeToString;
    }

    public void b(P0.c cVar, float f7) {
        C0900b c0900b = (C0900b) ((Drawable) cVar.f2189e);
        C0899a c0899a = (C0899a) cVar.f2190i;
        boolean useCompatPadding = c0899a.getUseCompatPadding();
        boolean preventCornerOverlap = c0899a.getPreventCornerOverlap();
        if (f7 != c0900b.f7877e || c0900b.f7878f != useCompatPadding || c0900b.f7879g != preventCornerOverlap) {
            c0900b.f7877e = f7;
            c0900b.f7878f = useCompatPadding;
            c0900b.f7879g = preventCornerOverlap;
            c0900b.b(null);
            c0900b.invalidateSelf();
        }
        if (!c0899a.getUseCompatPadding()) {
            cVar.y(0, 0, 0, 0);
            return;
        }
        C0900b c0900b2 = (C0900b) ((Drawable) cVar.f2189e);
        float f8 = c0900b2.f7877e;
        float f9 = c0900b2.f7873a;
        int ceil = (int) Math.ceil(AbstractC0901c.a(f8, f9, c0899a.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(AbstractC0901c.b(f8, f9, c0899a.getPreventCornerOverlap()));
        cVar.y(ceil, ceil2, ceil, ceil2);
    }

    @Override // s4.o
    public void onMethodCall(s4.n nVar, s4.p pVar) {
        ((l) pVar).success(null);
    }
}
