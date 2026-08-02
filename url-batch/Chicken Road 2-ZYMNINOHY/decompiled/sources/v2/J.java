package v2;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class J extends AbstractC1469p implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final transient f0 f15572d;

    public J(f0 f0Var, int i4) {
        this.f15572d = f0Var;
    }

    @Override // v2.AbstractC1468o
    public final boolean b(Object obj) {
        return obj != null && super.b(obj);
    }

    @Override // v2.AbstractC1468o
    public final Map c() {
        throw new AssertionError("should never be called");
    }

    @Override // v2.AbstractC1468o
    public final Set d() {
        throw new AssertionError("unreachable");
    }

    @Override // v2.AbstractC1468o
    public final Set e() {
        return this.f15572d.keySet();
    }

    @Override // v2.AbstractC1468o
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public f0 a() {
        return this.f15572d;
    }

    public final I g(Object obj) {
        I i4 = (I) this.f15572d.get(obj);
        if (i4 != null) {
            return i4;
        }
        G g4 = I.f15571b;
        return a0.f15605e;
    }
}
