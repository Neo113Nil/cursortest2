package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zg extends zn {
    private static Field a = null;
    private static boolean e = false;
    private static Constructor f = null;
    private static boolean g = false;
    private WindowInsets h;
    private vb i;

    public zg() {
        this.h = j();
    }

    private static WindowInsets j() {
        if (!e) {
            try {
                a = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            e = true;
        }
        Field field = a;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!g) {
            try {
                f = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            g = true;
        }
        Constructor constructor = f;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // defpackage.zn
    public zz a() {
        i();
        zz q = zz.q(this.h, null);
        q.s(this.b);
        q.b.w(this.i);
        q.x();
        q.u(this.c);
        q.v(this.d);
        return q;
    }

    @Override // defpackage.zn
    public void b(vb vbVar) {
        this.i = vbVar;
    }

    @Override // defpackage.zn
    public void c(vb vbVar) {
        WindowInsets windowInsets = this.h;
        if (windowInsets != null) {
            this.h = windowInsets.replaceSystemWindowInsets(vbVar.b, vbVar.c, vbVar.d, vbVar.e);
        }
    }

    public zg(zz zzVar) {
        super(zzVar);
        this.h = zzVar.e();
    }
}
