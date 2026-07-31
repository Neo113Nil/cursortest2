package k2;

import a0.q;
import q6.i;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f4168e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4169a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4170b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4171c;

    /* renamed from: d, reason: collision with root package name */
    public final m2.b f4172d;

    static {
        new b();
    }

    public b() {
        m2.b bVar = m2.b.f5217f;
        this.f4169a = true;
        this.f4170b = 1;
        this.f4171c = 1;
        this.f4172d = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f4169a == bVar.f4169a && this.f4170b == bVar.f4170b && this.f4171c == bVar.f4171c && i.a(this.f4172d, bVar.f4172d);
    }

    public final int hashCode() {
        return this.f4172d.f5218d.hashCode() + q.b(this.f4171c, q.b(this.f4170b, q.d(q.b(0, Boolean.hashCode(false) * 31, 31), 31, this.f4169a), 31), 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=false, capitalization=");
        String str = "None";
        sb.append((Object) "None");
        sb.append(", autoCorrect=");
        sb.append(this.f4169a);
        sb.append(", keyboardType=");
        int i = this.f4170b;
        sb.append((Object) (i == 0 ? "Unspecified" : i == 1 ? "Text" : i == 2 ? "Ascii" : i == 3 ? "Number" : i == 4 ? "Phone" : i == 5 ? "Uri" : i == 6 ? "Email" : i == 7 ? "Password" : i == 8 ? "NumberPassword" : i == 9 ? "Decimal" : "Invalid"));
        sb.append(", imeAction=");
        int i8 = this.f4171c;
        if (i8 == -1) {
            str = "Unspecified";
        } else if (i8 != 0) {
            str = i8 == 1 ? "Default" : i8 == 2 ? "Go" : i8 == 3 ? "Search" : i8 == 4 ? "Send" : i8 == 5 ? "Previous" : i8 == 6 ? "Next" : i8 == 7 ? "Done" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", platformImeOptions=null, hintLocales=");
        sb.append(this.f4172d);
        sb.append(')');
        return sb.toString();
    }
}
