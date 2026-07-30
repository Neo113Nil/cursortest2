package l4;

import java.util.Arrays;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f5947a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.room.c f5948b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5949c;

    public a(androidx.room.c cVar, String str) {
        this.f5948b = cVar;
        this.f5949c = str;
        this.f5947a = Arrays.hashCode(new Object[]{cVar, m4.i.f6373a, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!m4.o.f(this.f5948b, aVar.f5948b)) {
            return false;
        }
        m4.i iVar = m4.i.f6373a;
        return m4.o.f(iVar, iVar) && m4.o.f(this.f5949c, aVar.f5949c);
    }

    public final int hashCode() {
        return this.f5947a;
    }
}
