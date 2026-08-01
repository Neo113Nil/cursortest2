package q2;

import kotlin.jvm.internal.Intrinsics;
import n0.l;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f7958e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7959a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7960b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7961c;

    /* renamed from: d, reason: collision with root package name */
    public final s2.b f7962d;

    static {
        new b();
    }

    public b() {
        s2.b bVar = s2.b.f8409i;
        this.f7959a = true;
        this.f7960b = 1;
        this.f7961c = 1;
        this.f7962d = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f7959a == bVar.f7959a && this.f7960b == bVar.f7960b && this.f7961c == bVar.f7961c && Intrinsics.a(this.f7962d, bVar.f7962d);
    }

    public final int hashCode() {
        return this.f7962d.f8410d.hashCode() + v4.a.x(this.f7961c, v4.a.x(this.f7960b, l.d(v4.a.x(0, Boolean.hashCode(false) * 31, 31), 31, this.f7959a), 31), 961);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImeOptions(singleLine=false, capitalization=");
        String str = "None";
        sb2.append((Object) "None");
        sb2.append(", autoCorrect=");
        sb2.append(this.f7959a);
        sb2.append(", keyboardType=");
        int i3 = this.f7960b;
        sb2.append((Object) (i3 == 0 ? "Unspecified" : i3 == 1 ? "Text" : i3 == 2 ? "Ascii" : i3 == 3 ? "Number" : i3 == 4 ? "Phone" : i3 == 5 ? "Uri" : i3 == 6 ? "Email" : i3 == 7 ? "Password" : i3 == 8 ? "NumberPassword" : i3 == 9 ? "Decimal" : "Invalid"));
        sb2.append(", imeAction=");
        int i10 = this.f7961c;
        if (i10 == -1) {
            str = "Unspecified";
        } else if (i10 != 0) {
            str = i10 == 1 ? "Default" : i10 == 2 ? "Go" : i10 == 3 ? "Search" : i10 == 4 ? "Send" : i10 == 5 ? "Previous" : i10 == 6 ? "Next" : i10 == 7 ? "Done" : "Invalid";
        }
        sb2.append((Object) str);
        sb2.append(", platformImeOptions=null, hintLocales=");
        sb2.append(this.f7962d);
        sb2.append(')');
        return sb2.toString();
    }
}
