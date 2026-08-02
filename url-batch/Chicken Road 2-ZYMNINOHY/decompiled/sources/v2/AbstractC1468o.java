package v2;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: v2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1468o {

    /* renamed from: a, reason: collision with root package name */
    public transient Set f15662a;

    /* renamed from: b, reason: collision with root package name */
    public transient Collection f15663b;

    /* renamed from: c, reason: collision with root package name */
    public transient Map f15664c;

    public Map a() {
        Map map = this.f15664c;
        if (map != null) {
            return map;
        }
        Map c4 = c();
        this.f15664c = c4;
        return c4;
    }

    public boolean b(Object obj) {
        Iterator it = a().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map c();

    public abstract Set d();

    public Set e() {
        Set set = this.f15662a;
        if (set != null) {
            return set;
        }
        Set d4 = d();
        this.f15662a = d4;
        return d4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1468o) {
            return a().equals(((AbstractC1468o) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
