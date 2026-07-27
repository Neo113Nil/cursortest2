package kotlin.text;

import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import z2.AbstractC1418b;
import z2.C1437u;

/* loaded from: classes.dex */
public final class i extends AbstractC1418b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f7536d;

    public i(j jVar) {
        this.f7536d = jVar;
    }

    @Override // z2.AbstractC1418b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof MatchGroup) {
            return super.contains((MatchGroup) obj);
        }
        return false;
    }

    @Override // z2.AbstractC1418b
    public final int e() {
        return this.f7536d.f7537a.groupCount() + 1;
    }

    public final MatchGroup h(int i2) {
        j jVar = this.f7536d;
        Matcher matcher = jVar.f7537a;
        IntRange h4 = kotlin.ranges.b.h(matcher.start(i2), matcher.end(i2));
        if (h4.f7505d < 0) {
            return null;
        }
        String group = jVar.f7537a.group(i2);
        Intrinsics.checkNotNullExpressionValue(group, "group(...)");
        return new MatchGroup(group, h4);
    }

    @Override // z2.AbstractC1418b, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        IntRange intRange = new IntRange(0, e() - 1, 1);
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return new T2.t(T2.r.i(new C1437u(1, intRange), new h(this)));
    }
}
