package X;

import M.U;
import a.AbstractC0169a;
import androidx.work.impl.WorkDatabase;
import c0.C0307i;
import f4.C0434k;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public Object f3502a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3503b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3504c;

    public m(WorkDatabase database) {
        kotlin.jvm.internal.i.e(database, "database");
        this.f3502a = database;
        this.f3503b = new AtomicBoolean(false);
        this.f3504c = AbstractC0169a.A(new U(4, this));
    }

    public static boolean m(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public C0307i a() {
        ((WorkDatabase) this.f3502a).a();
        return ((AtomicBoolean) this.f3503b).compareAndSet(false, true) ? (C0307i) ((C0434k) this.f3504c).getValue() : k();
    }

    public abstract void b();

    public abstract Object c(int i2, int i3);

    public abstract Map d();

    public abstract int e();

    public abstract int f(Object obj);

    public abstract int g(Object obj);

    public abstract void h(Object obj, Object obj2);

    public abstract void i(int i2);

    public abstract Object j(int i2, Object obj);

    public C0307i k() {
        String l2 = l();
        WorkDatabase workDatabase = (WorkDatabase) this.f3502a;
        workDatabase.getClass();
        workDatabase.a();
        workDatabase.b();
        return workDatabase.h().z().c(l2);
    }

    public abstract String l();

    public void n(C0307i statement) {
        kotlin.jvm.internal.i.e(statement, "statement");
        if (statement == ((C0307i) ((C0434k) this.f3504c).getValue())) {
            ((AtomicBoolean) this.f3503b).set(false);
        }
    }

    public Object[] o(int i2, Object[] objArr) {
        int e3 = e();
        if (objArr.length < e3) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), e3);
        }
        for (int i3 = 0; i3 < e3; i3++) {
            objArr[i3] = c(i3, i2);
        }
        if (objArr.length > e3) {
            objArr[e3] = null;
        }
        return objArr;
    }
}
