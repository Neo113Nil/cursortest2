package F5;

import java.util.regex.Matcher;
import l5.AbstractC0500d;

/* loaded from: classes.dex */
public final class f extends AbstractC0500d {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ B0.c f802f;

    public f(B0.c cVar) {
        this.f802f = cVar;
    }

    @Override // l5.AbstractC0497a
    public final int a() {
        return ((Matcher) this.f802f.f72h).groupCount() + 1;
    }

    @Override // l5.AbstractC0497a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        String group = ((Matcher) this.f802f.f72h).group(i7);
        return group == null ? "" : group;
    }

    @Override // l5.AbstractC0500d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // l5.AbstractC0500d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
