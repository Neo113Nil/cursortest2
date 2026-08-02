package w3;

import d2.C0389g;
import java.util.regex.Matcher;

/* renamed from: w3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1508e extends d3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0389g f15949a;

    public C1508e(C0389g c0389g) {
        this.f15949a = c0389g;
    }

    @Override // d3.d
    public final int b() {
        return ((Matcher) this.f15949a.f8264b).groupCount() + 1;
    }

    @Override // d3.d, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        String group = ((Matcher) this.f15949a.f8264b).group(i4);
        return group == null ? "" : group;
    }

    @Override // d3.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // d3.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
