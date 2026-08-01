package h0;

import androidx.lifecycle.K;
import com.fortunequest.neontrack.data.FortuneQuestDatabase_Impl;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import l0.C0283j;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public Object f2996a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2997b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public Object f2998c = new X0.f(new K(1, this));

    public r(FortuneQuestDatabase_Impl fortuneQuestDatabase_Impl) {
        this.f2996a = fortuneQuestDatabase_Impl;
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

    public C0283j a() {
        ((FortuneQuestDatabase_Impl) this.f2996a).a();
        return ((AtomicBoolean) this.f2997b).compareAndSet(false, true) ? (C0283j) ((X0.f) this.f2998c).a() : k();
    }

    public abstract void b();

    public abstract Object c(int i, int i2);

    public abstract Map d();

    public abstract int e();

    public abstract int f(Object obj);

    public abstract int g(Object obj);

    public abstract void h(Object obj, Object obj2);

    public abstract void i(int i);

    public abstract Object j(int i, Object obj);

    public C0283j k() {
        String l2 = l();
        FortuneQuestDatabase_Impl fortuneQuestDatabase_Impl = (FortuneQuestDatabase_Impl) this.f2996a;
        fortuneQuestDatabase_Impl.a();
        if (fortuneQuestDatabase_Impl.f().m().r() || fortuneQuestDatabase_Impl.i.get() == null) {
            return fortuneQuestDatabase_Impl.f().m().j(l2);
        }
        throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
    }

    public abstract String l();

    public void n(C0283j c0283j) {
        k1.e.e(c0283j, "statement");
        if (c0283j == ((C0283j) ((X0.f) this.f2998c).a())) {
            ((AtomicBoolean) this.f2997b).set(false);
        }
    }

    public Object[] o(Object[] objArr, int i) {
        int e2 = e();
        if (objArr.length < e2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), e2);
        }
        for (int i2 = 0; i2 < e2; i2++) {
            objArr[i2] = c(i2, i);
        }
        if (objArr.length > e2) {
            objArr[e2] = null;
        }
        return objArr;
    }
}
