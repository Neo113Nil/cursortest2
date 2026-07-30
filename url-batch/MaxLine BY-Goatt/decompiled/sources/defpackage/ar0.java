package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class ar0 implements yk1, dk1, yg, kn, kk1, mt1, ek0, sh, wt1, yp2 {
    public static final su0 o = new su0(1);
    public static final dq2 p = new dq2(14);
    public static final gg3 q = new gg3(22);
    public final /* synthetic */ int m;
    public Object n;

    public ar0(int i) {
        fl1 fl1Var;
        this.m = i;
        switch (i) {
            case 3:
                uo3 uo3Var = uo3.c;
                ot2 ot2Var = new ot2(23, new io3[]{by1.K, q});
                Charset charset = sn3.a;
                this.n = ot2Var;
                break;
            case 4:
                if (Build.VERSION.SDK_INT < 26) {
                    this.n = new h2(this);
                    break;
                } else {
                    this.n = new i2(this);
                    break;
                }
            case 9:
                this.n = new AtomicInteger(0);
                break;
            case 15:
                TimeUnit.MINUTES.getClass();
                this.n = new w62(pt2.h);
                break;
            case 22:
                this.n = new on2(zm3.b);
                break;
            default:
                q52 q52Var = q52.c;
                try {
                    fl1Var = (fl1) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    fl1Var = o;
                }
                fl1[] fl1VarArr = {su0.b, fl1Var};
                th1 th1Var = new th1();
                th1Var.a = fl1VarArr;
                Charset charset2 = f41.a;
                this.n = th1Var;
                break;
        }
    }

    public void A(int i, Object obj, se2 se2Var) {
        kv kvVar = (kv) this.n;
        kvVar.B(i, 3);
        se2Var.i((q0) obj, kvVar.a);
        kvVar.B(i, 4);
    }

    @Override // defpackage.yp2
    public void a(ak1 ak1Var, Bitmap bitmap, Map map) {
        ((r5) this.n).j(ak1Var, bitmap, map, k31.k(bitmap));
    }

    @Override // defpackage.yk1
    public void b(fk1 fk1Var, boolean z) {
        if (fk1Var instanceof cq2) {
            ((cq2) fk1Var).z.k().c(false);
        }
        yk1 yk1Var = ((e3) this.n).q;
        if (yk1Var != null) {
            yk1Var.b(fk1Var, z);
        }
    }

    @Override // defpackage.sh
    public Object c(ff2 ff2Var, Float f, Float f2, Function1 function1, hm2 hm2Var) {
        Object c = yh2.c(ff2Var, f.floatValue(), tk3.i(0.0f, f2.floatValue()), (q70) this.n, function1, hm2Var);
        return c == b50.m ? c : (jd) c;
    }

    @Override // defpackage.dk1
    public boolean e(fk1 fk1Var, MenuItem menuItem) {
        h3 h3Var = ((ActionMenuView) this.n).L;
        return h3Var != null && ((cy2) h3Var).m.S.a(menuItem);
    }

    @Override // defpackage.kk1
    public void f(fk1 fk1Var, MenuItem menuItem) {
        ((at) this.n).r.removeCallbacksAndMessages(fk1Var);
    }

    @Override // defpackage.kn
    public void g(c10 c10Var) {
        boolean z = c10Var.n == 0;
        ln lnVar = (ln) this.n;
        if (z) {
            lnVar.l(null, lnVar.s());
            return;
        }
        jn jnVar = lnVar.B;
        if (jnVar != null) {
            jnVar.c(c10Var);
        }
    }

    @Override // defpackage.w52
    public Object get() {
        return new mh((Context) ((j31) this.n).m, (Object) new dq2(15), (Object) new dq2(9), 8);
    }

    @Override // defpackage.yp2
    public bk1 h(ak1 ak1Var) {
        return null;
    }

    @Override // defpackage.kk1
    public void i(fk1 fk1Var, lk1 lk1Var) {
        at atVar = (at) this.n;
        Handler handler = atVar.r;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = atVar.t;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (fk1Var == ((zs) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new ys(this, i2 < arrayList.size() ? (zs) arrayList.get(i2) : null, lk1Var, fk1Var, 0), fk1Var, SystemClock.uptimeMillis() + 200);
    }

    @Override // defpackage.dk1
    public void k(fk1 fk1Var) {
        cy2 cy2Var = ((ActionMenuView) this.n).G;
        if (cy2Var != null) {
            cy2Var.k(fk1Var);
        }
    }

    @Override // defpackage.mt1
    public Object n() {
        switch (this.m) {
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                Constructor constructor = (Constructor) this.n;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e) {
                    throw new AssertionError(e);
                } catch (InstantiationException e2) {
                    throw new RuntimeException("Failed to invoke " + constructor + " with no args", e2);
                } catch (InvocationTargetException e3) {
                    throw new RuntimeException("Failed to invoke " + constructor + " with no args", e3.getTargetException());
                }
            default:
                Type type = (Type) this.n;
                if (!(type instanceof ParameterizedType)) {
                    throw new u61("Invalid EnumSet type: " + type.toString());
                }
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new u61("Invalid EnumSet type: " + type.toString());
        }
    }

    @Override // defpackage.yk1
    public boolean o(fk1 fk1Var) {
        e3 e3Var = (e3) this.n;
        if (fk1Var == e3Var.o) {
            return false;
        }
        ((cq2) fk1Var).A.getClass();
        yk1 yk1Var = e3Var.q;
        if (yk1Var != null) {
            return yk1Var.o(fk1Var);
        }
        return false;
    }

    public void p(i91 i91Var) {
        if (!i91Var.I()) {
            h21.b("DepthSortedSet.add called on an unattached node");
        }
        ((on2) this.n).add(i91Var);
    }

    public g2 r(int i) {
        return null;
    }

    public void s() {
        ((d00) this.n).getClass();
    }

    public g2 t(int i) {
        return null;
    }

    public String toString() {
        switch (this.m) {
            case 22:
                return ((on2) this.n).toString();
            default:
                return super.toString();
        }
    }

    public so2 u() {
        ag0 a = ag0.a();
        if (a.c() == 1) {
            return new d11(true);
        }
        lz1 j = ij2.j(Boolean.FALSE);
        a.h(new h80(j, this));
        return j;
    }

    public void v(float f, float f2, float f3, float f4) {
        mh mhVar = (mh) this.n;
        ls o2 = mhVar.o();
        float intBitsToFloat = Float.intBitsToFloat((int) (mhVar.v() >> 32)) - (f3 + f);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (mhVar.v() & 4294967295L)) - (f4 + f2);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) < 0.0f) {
            k21.a("Width and height must be greater than or equal to zero");
        }
        mhVar.J(floatToRawIntBits);
        o2.h(f, f2);
    }

    public boolean w(int i, int i2, Bundle bundle) {
        return false;
    }

    public boolean x(i91 i91Var) {
        if (!i91Var.I()) {
            h21.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((on2) this.n).remove(i91Var);
    }

    public void y(float f, float f2, long j) {
        ls o2 = ((mh) this.n).o();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        o2.h(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        o2.c(f, f2);
        o2.h(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void z(float f, float f2) {
        ((mh) this.n).o().h(f, f2);
    }

    @Override // defpackage.yg
    public void d(int i) {
    }

    @Override // defpackage.yp2
    public void j(int i) {
    }

    @Override // defpackage.yg
    public void l(int i) {
    }

    public void m(int i, float f) {
    }

    public /* synthetic */ ar0(int i, boolean z) {
        this.m = i;
    }

    public ar0(kv kvVar) {
        this.m = 13;
        f41.a(kvVar, "output");
        this.n = kvVar;
        kvVar.a = this;
    }

    public ar0(boolean z) {
        this.m = 8;
        this.n = new AtomicBoolean(z);
    }

    public ar0(t53 t53Var, q53 q53Var, i50 i50Var) {
        this.m = 2;
        t53Var.getClass();
        i50Var.getClass();
        this.n = new js0(t53Var, q53Var, i50Var);
    }

    public /* synthetic */ ar0(int i, Object obj) {
        this.m = i;
        this.n = obj;
    }

    public ar0(TextView textView) {
        this.m = 27;
        this.n = new rg0(textView);
    }

    public ar0(EditText editText) {
        this.m = 26;
        this.n = new t21(editText, 15);
    }

    public void q(int i, g2 g2Var, String str, Bundle bundle) {
    }
}
