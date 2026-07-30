package l4;

import java.util.Arrays;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final a f5985a;

    /* renamed from: b, reason: collision with root package name */
    public final j4.d f5986b;

    public /* synthetic */ k(a aVar, j4.d dVar) {
        this.f5985a = aVar;
        this.f5986b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof k)) {
            k kVar = (k) obj;
            if (m4.o.f(this.f5985a, kVar.f5985a) && m4.o.f(this.f5986b, kVar.f5986b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5985a, this.f5986b});
    }

    public final String toString() {
        androidx.room.c cVar = new androidx.room.c(this);
        cVar.l(this.f5985a, "key");
        cVar.l(this.f5986b, "feature");
        return cVar.toString();
    }
}
