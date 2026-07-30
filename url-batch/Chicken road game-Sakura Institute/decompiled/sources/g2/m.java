package g2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: g, reason: collision with root package name */
    public static final m f4041g = new m(false, 0, true, 1, 1, h2.b.f4643h);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4042a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4043b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4044c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4045d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4046e;

    /* renamed from: f, reason: collision with root package name */
    public final h2.b f4047f;

    public m(boolean z8, int i7, boolean z9, int i8, int i9, h2.b bVar) {
        this.f4042a = z8;
        this.f4043b = i7;
        this.f4044c = z9;
        this.f4045d = i8;
        this.f4046e = i9;
        this.f4047f = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f4042a == mVar.f4042a && this.f4043b == mVar.f4043b && this.f4044c == mVar.f4044c && this.f4045d == mVar.f4045d && this.f4046e == mVar.f4046e && r6.k.a(this.f4047f, mVar.f4047f);
    }

    public final int hashCode() {
        return this.f4047f.f4644f.hashCode() + l.h.c(this.f4046e, l.h.c(this.f4045d, a0.m.e(l.h.c(this.f4043b, Boolean.hashCode(this.f4042a) * 31, 31), 31, this.f4044c), 31), 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=");
        sb.append(this.f4042a);
        sb.append(", capitalization=");
        int i7 = this.f4043b;
        sb.append((Object) (i7 == -1 ? "Unspecified" : i7 == 0 ? "None" : i7 == 1 ? "Characters" : i7 == 2 ? "Words" : i7 == 3 ? "Sentences" : "Invalid"));
        sb.append(", autoCorrect=");
        sb.append(this.f4044c);
        sb.append(", keyboardType=");
        sb.append((Object) a8.m.M(this.f4045d));
        sb.append(", imeAction=");
        sb.append((Object) l.a(this.f4046e));
        sb.append(", platformImeOptions=null, hintLocales=");
        sb.append(this.f4047f);
        sb.append(')');
        return sb.toString();
    }
}
