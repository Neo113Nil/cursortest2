package B1;

import android.content.Context;
import android.graphics.Bitmap;
import v1.InterfaceC5117a;

/* renamed from: B1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0263e implements s1.l {
    @Override // s1.l
    public final u1.x b(Context context, u1.x xVar, int i, int i4) {
        if (!N1.p.i(i, i4)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i4 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        InterfaceC5117a interfaceC5117a = com.bumptech.glide.c.a(context).f23530n;
        Bitmap bitmap = (Bitmap) xVar.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i4 == Integer.MIN_VALUE) {
            i4 = bitmap.getHeight();
        }
        Bitmap c4 = c(interfaceC5117a, bitmap, i, i4);
        return bitmap.equals(c4) ? xVar : C0262d.b(c4, interfaceC5117a);
    }

    public abstract Bitmap c(InterfaceC5117a interfaceC5117a, Bitmap bitmap, int i, int i4);
}
