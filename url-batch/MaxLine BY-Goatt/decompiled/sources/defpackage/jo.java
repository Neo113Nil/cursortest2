package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jo implements qk0 {
    public final /* synthetic */ int a;
    public final uw1 b;
    public final Object c;

    public /* synthetic */ jo(Object obj, uw1 uw1Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = uw1Var;
    }

    @Override // defpackage.qk0
    public final Object a(o30 o30Var) {
        int i = this.a;
        Object obj = this.c;
        uw1 uw1Var = this.b;
        switch (i) {
            case 0:
                return new ge0(new BitmapDrawable(uw1Var.a.getResources(), (Bitmap) obj), false, m60.n);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                try {
                    fq fqVar = new fq();
                    fqVar.write(byteBuffer);
                    byteBuffer.position(0);
                    return new tn2(new qn2(fqVar, new u01(uw1Var.a, 1), null), null, m60.n);
                } catch (Throwable th) {
                    byteBuffer.position(0);
                    throw th;
                }
            default:
                Drawable drawable = (Drawable) obj;
                Bitmap.Config[] configArr = l.a;
                boolean z = drawable instanceof VectorDrawable;
                if (z) {
                    drawable = new BitmapDrawable(uw1Var.a.getResources(), yj1.s(drawable, uw1Var.b, uw1Var.d, uw1Var.e, uw1Var.f));
                }
                return new ge0(drawable, z, m60.n);
        }
    }
}
