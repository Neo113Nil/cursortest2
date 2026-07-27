package G0;

import A.AbstractC0017m;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0784j;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: g, reason: collision with root package name */
    public static final m f3067g = new m(false, 0, true, 1, 1, H0.b.f3225i);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3068a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3069b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3070c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3071d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3072e;

    /* renamed from: f, reason: collision with root package name */
    public final H0.b f3073f;

    public m(boolean z4, int i2, boolean z5, int i4, int i5, H0.b bVar) {
        this.f3068a = z4;
        this.f3069b = i2;
        this.f3070c = z5;
        this.f3071d = i4;
        this.f3072e = i5;
        this.f3073f = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f3068a == mVar.f3068a && n.a(this.f3069b, mVar.f3069b) && this.f3070c == mVar.f3070c && o.a(this.f3071d, mVar.f3071d) && l.a(this.f3072e, mVar.f3072e) && Intrinsics.a(null, null) && Intrinsics.a(this.f3073f, mVar.f3073f);
    }

    public final int hashCode() {
        return this.f3073f.f3226d.hashCode() + AbstractC0784j.c(this.f3072e, AbstractC0784j.c(this.f3071d, AbstractC0017m.d(AbstractC0784j.c(this.f3069b, Boolean.hashCode(this.f3068a) * 31, 31), 31, this.f3070c), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.f3068a + ", capitalization=" + ((Object) n.b(this.f3069b)) + ", autoCorrect=" + this.f3070c + ", keyboardType=" + ((Object) o.b(this.f3071d)) + ", imeAction=" + ((Object) l.b(this.f3072e)) + ", platformImeOptions=null, hintLocales=" + this.f3073f + ')';
    }
}
