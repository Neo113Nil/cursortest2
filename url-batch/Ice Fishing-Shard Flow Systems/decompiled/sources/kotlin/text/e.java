package kotlin.text;

import java.util.regex.Matcher;
import kotlin.collections.AbstractC0627f;

/* loaded from: classes.dex */
public final class e extends AbstractC0627f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D0.j f6196e;

    public e(D0.j jVar) {
        this.f6196e = jVar;
    }

    @Override // kotlin.collections.AbstractC0622a
    public final int a() {
        return ((Matcher) this.f6196e.f330e).groupCount() + 1;
    }

    @Override // kotlin.collections.AbstractC0622a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        String group = ((Matcher) this.f6196e.f330e).group(i2);
        return group == null ? "" : group;
    }

    @Override // kotlin.collections.AbstractC0627f, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractC0627f, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
