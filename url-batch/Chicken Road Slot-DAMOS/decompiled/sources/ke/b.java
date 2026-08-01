package ke;

import java.util.Arrays;
import kotlin.Unit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: d, reason: collision with root package name */
    public d[] f5506d;

    /* renamed from: e, reason: collision with root package name */
    public int f5507e;

    /* renamed from: i, reason: collision with root package name */
    public int f5508i;

    /* renamed from: r, reason: collision with root package name */
    public v f5509r;

    public final d d() {
        d dVar;
        v vVar;
        synchronized (this) {
            try {
                d[] dVarArr = this.f5506d;
                if (dVarArr == null) {
                    dVarArr = f();
                    this.f5506d = dVarArr;
                } else if (this.f5507e >= dVarArr.length) {
                    Object[] copyOf = Arrays.copyOf(dVarArr, dVarArr.length * 2);
                    this.f5506d = (d[]) copyOf;
                    dVarArr = (d[]) copyOf;
                }
                int i3 = this.f5508i;
                do {
                    dVar = dVarArr[i3];
                    if (dVar == null) {
                        dVar = e();
                        dVarArr[i3] = dVar;
                    }
                    i3++;
                    if (i3 >= dVarArr.length) {
                        i3 = 0;
                    }
                } while (!dVar.a(this));
                this.f5508i = i3;
                this.f5507e++;
                vVar = this.f5509r;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vVar != null) {
            vVar.w(1);
        }
        return dVar;
    }

    public abstract d e();

    public abstract d[] f();

    public final void g(d dVar) {
        v vVar;
        int i3;
        ld.a[] b10;
        synchronized (this) {
            try {
                int i10 = this.f5507e - 1;
                this.f5507e = i10;
                vVar = this.f5509r;
                if (i10 == 0) {
                    this.f5508i = 0;
                }
                dVar.getClass();
                b10 = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (ld.a aVar : b10) {
            if (aVar != null) {
                hd.l lVar = hd.n.f4511e;
                aVar.resumeWith(Unit.f5554a);
            }
        }
        if (vVar != null) {
            vVar.w(-1);
        }
    }

    public final v h() {
        v vVar;
        synchronized (this) {
            vVar = this.f5509r;
            if (vVar == null) {
                int i3 = this.f5507e;
                vVar = new v(1, Integer.MAX_VALUE, ie.a.f4713e);
                vVar.q(Integer.valueOf(i3));
                this.f5509r = vVar;
            }
        }
        return vVar;
    }
}
