package M7;

import java.util.regex.Matcher;
import r7.AbstractC4973d;

/* loaded from: classes2.dex */
public final class f extends AbstractC4973d {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y2.e f1933n;

    public f(Y2.e eVar) {
        this.f1933n = eVar;
    }

    @Override // r7.AbstractC4970a
    public final int a() {
        return ((Matcher) this.f1933n.f3963u).groupCount() + 1;
    }

    @Override // r7.AbstractC4970a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        String group = ((Matcher) this.f1933n.f3963u).group(i);
        return group == null ? "" : group;
    }

    @Override // r7.AbstractC4973d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // r7.AbstractC4973d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
