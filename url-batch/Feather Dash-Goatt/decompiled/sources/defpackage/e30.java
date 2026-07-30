package defpackage;

import android.os.Parcel;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class e30 {
    public boolean a;
    public final Object b;
    public Object c;

    public e30(vj vjVar, nj njVar) {
        this.b = new Object();
        this.c = new ArrayList();
    }

    public boolean a(long j) {
        Object obj;
        List list = (List) ((yw) this.c).e;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (xa0.n(((sx0) obj).a, j)) {
                break;
            }
            i++;
        }
        sx0 sx0Var = (sx0) obj;
        if (sx0Var != null) {
            return sx0Var.h;
        }
        return false;
    }

    public void b(b8 b8Var, ng1 ng1Var) {
        nq0 nq0Var = (nq0) ((nq0) this.c).e;
        nq0Var.getClass();
        zs1 zs1Var = (zs1) ((et1) b8Var).q();
        rg1 rg1Var = (rg1) nq0Var.e;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(zs1Var.c);
        int i = ls1.a;
        if (rg1Var == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            rg1Var.writeToParcel(obtain, 0);
        }
        try {
            zs1Var.b.transact(1, obtain, null, 1);
            obtain.recycle();
            ng1Var.a(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public void c(uu1 uu1Var) {
        synchronized (this.b) {
            try {
                if (((ArrayDeque) this.c) == null) {
                    this.c = new ArrayDeque();
                }
                ((ArrayDeque) this.c).add(uu1Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(Task task) {
        uu1 uu1Var;
        synchronized (this.b) {
            if (((ArrayDeque) this.c) != null && !this.a) {
                this.a = true;
                while (true) {
                    synchronized (this.b) {
                        try {
                            uu1Var = (uu1) ((ArrayDeque) this.c).poll();
                            if (uu1Var == null) {
                                this.a = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    uu1Var.b(task);
                }
            }
        }
    }

    public e30(nq0 nq0Var, vx[] vxVarArr, boolean z) {
        this.c = nq0Var;
        this.b = vxVarArr;
        boolean z2 = false;
        if (vxVarArr != null && z) {
            z2 = true;
        }
        this.a = z2;
    }

    public e30(aj0 aj0Var, yw ywVar) {
        this.b = aj0Var;
        this.c = ywVar;
    }

    public e30() {
        this.b = new Object();
    }
}
