package l9;

import java.util.ArrayList;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@pe.e
/* loaded from: classes.dex */
public final class i {
    public static final h Companion = new h();

    /* renamed from: a, reason: collision with root package name */
    public final int f5945a;

    public i(int i3, int i10) {
        String str;
        if (1 == (i3 & 1)) {
            this.f5945a = i10;
            return;
        }
        re.e d10 = g.f5944a.d();
        d10.getClass();
        ArrayList arrayList = new ArrayList();
        int i11 = (~i3) & 1;
        int i12 = 0;
        while (i12 < 32) {
            if ((i11 & 1) != 0) {
                arrayList.add(d10.d(i12));
            }
            i12++;
            i11 = 0;
        }
        String a9 = d10.a();
        a9.getClass();
        if (arrayList.size() == 1) {
            str = "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + a9 + "', but it was missing";
        } else {
            str = "Fields " + arrayList + " are required for type with serial name '" + a9 + "', but they were missing";
        }
        throw new pe.b(str, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f5945a == ((i) obj).f5945a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5945a);
    }

    public final String toString() {
        return n0.l.f(this.f5945a, "GameOver(score=", ")");
    }

    public i(int i3) {
        this.f5945a = i3;
    }
}
