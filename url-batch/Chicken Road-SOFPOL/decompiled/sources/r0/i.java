package r0;

import a0.g1;
import a0.t;
import d6.s;
import java.util.Iterator;
import java.util.regex.Matcher;
import r2.o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i extends d6.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6486d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6487e;

    public /* synthetic */ i(int i, Object obj) {
        this.f6486d = i;
        this.f6487e = obj;
    }

    @Override // d6.a
    public final int a() {
        switch (this.f6486d) {
            case 0:
                b bVar = (b) this.f6487e;
                bVar.getClass();
                return bVar.f6475e;
            default:
                return ((Matcher) ((g1) this.f6487e).f84b).groupCount() + 1;
        }
    }

    public y6.b b(int i) {
        Matcher matcher = (Matcher) ((g1) this.f6487e).f84b;
        v6.d u02 = o.u0(matcher.start(i), matcher.end(i));
        if (u02.f7492d < 0) {
            return null;
        }
        String group = matcher.group(i);
        q6.i.d(group, "group(...)");
        return new y6.b(group, u02);
    }

    @Override // d6.a, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f6486d) {
            case 0:
                return ((b) this.f6487e).containsValue(obj);
            default:
                if (obj == null ? true : obj instanceof y6.b) {
                    return super.contains((y6.b) obj);
                }
                return false;
        }
    }

    @Override // d6.a, java.util.Collection
    public boolean isEmpty() {
        switch (this.f6486d) {
            case 1:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f6486d) {
            case 0:
                j jVar = ((b) this.f6487e).f6474d;
                k[] kVarArr = new k[8];
                for (int i = 0; i < 8; i++) {
                    kVarArr[i] = new l(2);
                }
                return new h(jVar, kVarArr);
            default:
                return new x6.j(new x6.i(new s(0, new v6.d(0, size() - 1, 1)), new t(28, this), 1));
        }
    }
}
