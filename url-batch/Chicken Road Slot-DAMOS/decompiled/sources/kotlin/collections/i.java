package kotlin.collections;

import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.ranges.IntRange;
import kotlin.text.MatchGroup;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i extends a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5568d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5569e;

    public /* synthetic */ i(int i3, Object obj) {
        this.f5568d = i3;
        this.f5569e = obj;
    }

    @Override // kotlin.collections.a
    public final int b() {
        switch (this.f5568d) {
            case 0:
                return ((j) this.f5569e).c();
            case 1:
                return ((Matcher) ((a1.n) this.f5569e).f41i).groupCount() + 1;
            default:
                return ((u0.b) this.f5569e).f9578s;
        }
    }

    public MatchGroup c(int i3) {
        Matcher matcher = (Matcher) ((a1.n) this.f5569e).f41i;
        IntRange f3 = be.f.f(matcher.start(i3), matcher.end(i3));
        if (f3.f5599d < 0) {
            return null;
        }
        String group = matcher.group(i3);
        group.getClass();
        return new MatchGroup(group, f3);
    }

    @Override // kotlin.collections.a, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f5568d) {
            case 0:
                return ((j) this.f5569e).containsValue(obj);
            case 1:
                if (obj == null ? true : obj instanceof MatchGroup) {
                    return super.contains((MatchGroup) obj);
                }
                return false;
            default:
                return ((u0.b) this.f5569e).containsValue(obj);
        }
    }

    @Override // kotlin.collections.a, java.util.Collection
    public boolean isEmpty() {
        switch (this.f5568d) {
            case 1:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f5568d) {
            case 0:
                return new h(((u0.g) ((j) this.f5569e).a()).iterator(), 1);
            case 1:
                return new de.p(new de.o(new de.j(2, new IntRange(0, size() - 1, 1)), new a1.d(7, this), 1));
            default:
                u0.i iVar = ((u0.b) this.f5569e).f9577r;
                u0.j[] jVarArr = new u0.j[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    jVarArr[i3] = new u0.k(2);
                }
                return new u0.h(iVar, jVarArr);
        }
    }
}
