package F5;

import java.util.Iterator;
import java.util.regex.Matcher;
import l5.AbstractC0497a;

/* loaded from: classes.dex */
public final class h extends AbstractC0497a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ B0.c f805f;

    public h(B0.c cVar) {
        this.f805f = cVar;
    }

    @Override // l5.AbstractC0497a
    public final int a() {
        return ((Matcher) this.f805f.f72h).groupCount() + 1;
    }

    public final e b(int i7) {
        Matcher matcher = (Matcher) this.f805f.f72h;
        C5.c B3 = i6.g.B(matcher.start(i7), matcher.end(i7));
        if (B3.f228f < 0) {
            return null;
        }
        String group = matcher.group(i7);
        kotlin.jvm.internal.i.d(group, "group(...)");
        return new e(group, B3);
    }

    @Override // l5.AbstractC0497a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof e) {
            return super.contains((e) obj);
        }
        return false;
    }

    @Override // l5.AbstractC0497a, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new E5.j(new E5.e(new E5.h(1, new C5.c(0, a() - 1, 1)), new g(this, 0)));
    }
}
