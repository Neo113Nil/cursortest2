package p2;

import com.appsflyer.R;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final s f7651a;

    /* renamed from: b, reason: collision with root package name */
    public final r f7652b;

    public x(s sVar, r rVar) {
        this.f7651a = sVar;
        this.f7652b = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.a(this.f7651a, xVar.f7651a) && this.f7652b.equals(xVar.f7652b);
    }

    public final int hashCode() {
        return this.f7652b.f7641a.hashCode() + v4.a.x(0, v4.a.x(0, ((R.font.chewy * 31) + this.f7651a.f7648d) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder i3 = n0.l.i(R.font.chewy, "ResourceFont(resId=", ", weight=");
        i3.append(this.f7651a);
        i3.append(", style=");
        i3.append((Object) "Normal");
        i3.append(", loadingStrategy=Blocking)");
        return i3.toString();
    }
}
