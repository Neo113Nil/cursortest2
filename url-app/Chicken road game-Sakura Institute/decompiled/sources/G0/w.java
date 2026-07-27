package G0;

import A.AbstractC0017m;
import A0.C0036g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w implements i {

    /* renamed from: a, reason: collision with root package name */
    public final C0036g f3089a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3090b;

    public w(String str, int i2) {
        this.f3089a = new C0036g(str, null, 6);
        this.f3090b = i2;
    }

    @Override // G0.i
    public final void a(j jVar) {
        int i2 = jVar.f3064d;
        boolean z4 = i2 != -1;
        C0036g c0036g = this.f3089a;
        if (z4) {
            jVar.d(c0036g.f328a, i2, jVar.f3065e);
            String str = c0036g.f328a;
            if (str.length() > 0) {
                jVar.e(i2, str.length() + i2);
            }
        } else {
            int i4 = jVar.f3062b;
            jVar.d(c0036g.f328a, i4, jVar.f3063c);
            String str2 = c0036g.f328a;
            if (str2.length() > 0) {
                jVar.e(i4, str2.length() + i4);
            }
        }
        int i5 = jVar.f3062b;
        int i6 = jVar.f3063c;
        int i7 = i5 == i6 ? i6 : -1;
        int i8 = this.f3090b;
        int e4 = kotlin.ranges.b.e(i8 > 0 ? (i7 + i8) - 1 : (i7 + i8) - c0036g.f328a.length(), 0, jVar.f3061a.b());
        jVar.f(e4, e4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.a(this.f3089a.f328a, wVar.f3089a.f328a) && this.f3090b == wVar.f3090b;
    }

    public final int hashCode() {
        return (this.f3089a.f328a.hashCode() * 31) + this.f3090b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.f3089a.f328a);
        sb.append("', newCursorPosition=");
        return AbstractC0017m.l(sb, this.f3090b, ')');
    }
}
