package defpackage;

import android.graphics.Matrix;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gdy {
    public final Object a;
    public Object b;
    public Object c;

    public gdy(aeq aeqVar, aek aekVar) {
        Object afiVar;
        aekVar.getClass();
        this.a = aeqVar;
        this.c = aekVar;
        boolean z = aeqVar instanceof aep;
        boolean z2 = aeqVar instanceof aec;
        aev aevVar = aev.a;
        if (z && z2) {
            afiVar = new aed((aec) aeqVar, (aep) aeqVar);
        } else if (z2) {
            afiVar = new aed((aec) aeqVar, null);
        } else if (z) {
            afiVar = (aep) aeqVar;
        } else {
            Class<?> cls = aeqVar.getClass();
            if (aev.a.a(cls) == 2) {
                Object obj = aev.b.get(cls);
                obj.getClass();
                List list = (List) obj;
                if (list.size() == 1) {
                    afiVar = new afs(aev.b((Constructor) list.get(0), aeqVar), 2);
                } else {
                    int size = list.size();
                    aeg[] aegVarArr = new aeg[size];
                    for (int i = 0; i < size; i++) {
                        aegVarArr[i] = aev.b((Constructor) list.get(i), aeqVar);
                    }
                    afiVar = new afs(aegVarArr, 1);
                }
            } else {
                afiVar = new afi(aeqVar);
            }
        }
        this.b = afiVar;
    }

    private final void n() {
        synchronized (this.a) {
            hoq.H(((htz) this.b).c().isDone());
            Object obj = this.b;
            byte[] bArr = null;
            kee keeVar = new kee(this, bArr);
            huf hufVar = huf.a;
            try {
                htx htxVar = ((htz) obj).c;
                if (!htxVar.d(hty.a, hty.f)) {
                    AtomicReference atomicReference = htxVar.a;
                    int ordinal = ((hty) atomicReference.get()).ordinal();
                    if (ordinal == 1) {
                        throw new IllegalStateException("Cannot call finishToValueAndCloser() after deriving another step");
                    }
                    if (ordinal == 2 || ordinal == 3 || ordinal == 4) {
                        throw new IllegalStateException("Cannot call finishToValueAndCloser() after calling finishToFuture()");
                    }
                    if (ordinal == 5) {
                        throw new IllegalStateException("Cannot call finishToValueAndCloser() twice");
                    }
                    throw new AssertionError(atomicReference);
                }
                htxVar.c.c(new evb(htxVar, keeVar, 17, bArr), hufVar);
                htz.e(obj);
                this.b = null;
            } catch (Throwable th) {
                htz.e(obj);
                throw th;
            }
        }
    }

    public final gdm a() {
        gdm gdmVar;
        synchronized (this.a) {
            if (this.b != null) {
                n();
            }
            try {
                gdmVar = (gdm) hnu.aR(((htx) ((bry) this.c).a).c);
            } catch (ExecutionException e) {
                throw new geo(e.getCause());
            }
        }
        return gdmVar;
    }

    public final hvi b() {
        synchronized (this.a) {
            Object obj = this.b;
            if (obj != null) {
                return ((htz) obj).c();
            }
            return hnu.aJ(null);
        }
    }

    public final void c() {
        synchronized (this.a) {
            Object obj = this.b;
            if (obj != null) {
                try {
                    htx htxVar = ((htz) obj).c;
                    htz.a.a().logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture$State", "cancel", "cancelling {0}", htxVar);
                    if (htxVar.c.cancel(false)) {
                        htxVar.c();
                    }
                    htz.e(obj);
                    n();
                } catch (Throwable th) {
                    htz.e(obj);
                    throw th;
                }
            }
            ((htx) ((bry) this.c).a).c();
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [aep, java.lang.Object] */
    public final void d(aer aerVar, aej aejVar) {
        aek a = aejVar.a();
        this.c = yj.i((aek) this.c, a);
        aok.a.a("androidx.lifecycle");
        cyi cyiVar = cyi.a;
        try {
            this.b.a(aerVar, aejVar);
            iwo.d(cyiVar);
            this.c = a;
        } finally {
        }
    }

    public final void e(float f) {
        float[] fArr = (float[]) this.c;
        double atan2 = Math.atan2(fArr[1], fArr[0]) + 1.5707963267948966d;
        double d = (float) atan2;
        double d2 = f;
        ((float[]) this.b)[0] = (float) (r0[0] + (Math.cos(d) * d2));
        ((float[]) this.b)[1] = (float) (r11[1] + (d2 * Math.sin(d)));
    }

    public final void f(float f) {
        float[] fArr = (float[]) this.c;
        float atan2 = (float) Math.atan2(fArr[1], fArr[0]);
        double d = atan2;
        double d2 = f;
        ((float[]) this.b)[0] = (float) (r2[0] + (Math.cos(d) * d2));
        ((float[]) this.b)[1] = (float) (r13[1] + (d2 * Math.sin(d)));
    }

    public final void g() {
        Arrays.fill((float[]) this.b, 0.0f);
        Arrays.fill((float[]) this.c, 0.0f);
        ((float[]) this.c)[0] = 1.0f;
        ((Matrix) this.a).reset();
    }

    public final void h(float f) {
        Matrix matrix = (Matrix) this.a;
        matrix.reset();
        matrix.setRotate(f);
        matrix.mapPoints((float[]) this.b);
        matrix.mapPoints((float[]) this.c);
    }

    public final void i(float f) {
        float[] fArr = (float[]) this.b;
        float f2 = fArr[0];
        fArr[1] = fArr[1] * f;
        float[] fArr2 = (float[]) this.c;
        float f3 = fArr2[0];
        fArr2[1] = fArr2[1] * f;
    }

    public final void j(float f) {
        float[] fArr = (float[]) this.b;
        fArr[0] = fArr[0] + f;
        fArr[1] = fArr[1] + 0.0f;
    }

    public final int k() {
        return ((qv) this.a).e;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map$Entry] */
    public final Map.Entry l() {
        ?? r1 = this.c;
        if (r1 != 0) {
            return r1;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public final boolean m(Object obj) {
        obj.getClass();
        return ((qv) this.a).b(obj);
    }

    public gdy() {
        this.b = new float[2];
        this.c = new float[]{1.0f, 0.0f};
        this.a = new Matrix();
    }

    public gdy(byte[] bArr) {
        this.a = new qv(6);
    }

    public gdy(bnl bnlVar) {
        this.a = bnlVar;
    }

    public gdy(gdy gdyVar) {
        this((float[]) gdyVar.b, (float[]) gdyVar.c);
    }

    public gdy(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[2];
        this.b = fArr3;
        this.c = new float[2];
        System.arraycopy(fArr, 0, fArr3, 0, 2);
        System.arraycopy(fArr2, 0, this.c, 0, 2);
        this.a = new Matrix();
    }

    public gdy(htz htzVar) {
        this.a = new Object();
        fao.c();
        this.b = htzVar;
    }
}
