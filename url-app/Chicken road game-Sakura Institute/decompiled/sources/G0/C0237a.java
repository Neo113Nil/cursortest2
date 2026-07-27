package G0;

import A.AbstractC0017m;
import A0.C0036g;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: G0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0237a implements i {

    /* renamed from: a, reason: collision with root package name */
    public final C0036g f3030a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3031b;

    public C0237a(C0036g c0036g, int i2) {
        this.f3030a = c0036g;
        this.f3031b = i2;
    }

    @Override // G0.i
    public final void a(j jVar) {
        int i2 = jVar.f3064d;
        boolean z4 = i2 != -1;
        C0036g c0036g = this.f3030a;
        if (z4) {
            jVar.d(c0036g.f328a, i2, jVar.f3065e);
        } else {
            jVar.d(c0036g.f328a, jVar.f3062b, jVar.f3063c);
        }
        int i4 = jVar.f3062b;
        int i5 = jVar.f3063c;
        int i6 = i4 == i5 ? i5 : -1;
        int i7 = this.f3031b;
        int e4 = kotlin.ranges.b.e(i7 > 0 ? (i6 + i7) - 1 : (i6 + i7) - c0036g.f328a.length(), 0, jVar.f3061a.b());
        jVar.f(e4, e4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0237a)) {
            return false;
        }
        C0237a c0237a = (C0237a) obj;
        return Intrinsics.a(this.f3030a.f328a, c0237a.f3030a.f328a) && this.f3031b == c0237a.f3031b;
    }

    public final int hashCode() {
        return (this.f3030a.f328a.hashCode() * 31) + this.f3031b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.f3030a.f328a);
        sb.append("', newCursorPosition=");
        return AbstractC0017m.l(sb, this.f3031b, ')');
    }

    public C0237a(String str, int i2) {
        this(new C0036g(str, null, 6), i2);
    }
}
