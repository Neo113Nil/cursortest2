package Q;

import androidx.work.impl.WorkDatabase;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import k5.C0481k;
import m1.AbstractC0521b;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public Object f1959a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1960b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1961c;

    public n(WorkDatabase database) {
        kotlin.jvm.internal.i.e(database, "database");
        this.f1959a = database;
        this.f1960b = new AtomicBoolean(false);
        this.f1961c = AbstractC0521b.x(new m(0, this));
    }

    public static boolean m(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public V.i a() {
        ((WorkDatabase) this.f1959a).a();
        return ((AtomicBoolean) this.f1960b).compareAndSet(false, true) ? (V.i) ((C0481k) this.f1961c).getValue() : k();
    }

    public abstract void b();

    public abstract Object c(int i7, int i8);

    public abstract Map d();

    public abstract int e();

    public abstract int f(Object obj);

    public abstract int g(Object obj);

    public abstract void h(Object obj, Object obj2);

    public abstract void i(int i7);

    public abstract Object j(int i7, Object obj);

    public V.i k() {
        String l7 = l();
        WorkDatabase workDatabase = (WorkDatabase) this.f1959a;
        workDatabase.getClass();
        workDatabase.a();
        workDatabase.b();
        return workDatabase.h().E().e(l7);
    }

    public abstract String l();

    public void n(V.i statement) {
        kotlin.jvm.internal.i.e(statement, "statement");
        if (statement == ((V.i) ((C0481k) this.f1961c).getValue())) {
            ((AtomicBoolean) this.f1960b).set(false);
        }
    }

    public Object[] o(Object[] objArr, int i7) {
        int e4 = e();
        if (objArr.length < e4) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), e4);
        }
        for (int i8 = 0; i8 < e4; i8++) {
            objArr[i8] = c(i8, i7);
        }
        if (objArr.length > e4) {
            objArr[e4] = null;
        }
        return objArr;
    }
}
