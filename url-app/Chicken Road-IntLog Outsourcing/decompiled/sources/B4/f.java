package B4;

import g4.AbstractC0459d;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public final class f extends AbstractC0459d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f305a;

    public f(i iVar) {
        this.f305a = iVar;
    }

    @Override // g4.AbstractC0456a
    public final int c() {
        return ((Matcher) this.f305a.f311b).groupCount() + 1;
    }

    @Override // g4.AbstractC0456a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        String group = ((Matcher) this.f305a.f311b).group(i2);
        return group == null ? "" : group;
    }

    @Override // g4.AbstractC0459d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // g4.AbstractC0459d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
