package kotlin.text;

import j6.C0588e;
import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.collections.AbstractC0622a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public final class g extends AbstractC0622a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D0.j f6198d;

    public g(D0.j jVar) {
        this.f6198d = jVar;
    }

    @Override // kotlin.collections.AbstractC0622a
    public final int a() {
        return ((Matcher) this.f6198d.f330e).groupCount() + 1;
    }

    public final MatchGroup b(int i2) {
        Matcher matcher = (Matcher) this.f6198d.f330e;
        IntRange c7 = C0588e.c(matcher.start(i2), matcher.end(i2));
        if (c7.f6173d < 0) {
            return null;
        }
        String group = matcher.group(i2);
        Intrinsics.checkNotNullExpressionValue(group, "group(...)");
        return new MatchGroup(group, c7);
    }

    @Override // kotlin.collections.AbstractC0622a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof MatchGroup) {
            return super.contains((MatchGroup) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractC0622a, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        IntRange intRange = new IntRange(0, a() - 1, 1);
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        c6.n nVar = new c6.n(2, intRange);
        Function1 transform = new Function1() { // from class: kotlin.text.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.this.b(((Integer) obj).intValue());
            }
        };
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new l6.m(new l6.n(nVar, transform));
    }
}
