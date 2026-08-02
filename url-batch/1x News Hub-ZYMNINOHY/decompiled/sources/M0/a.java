package M0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f900a;

    /* renamed from: b, reason: collision with root package name */
    public final V0.e f901b;

    /* renamed from: c, reason: collision with root package name */
    public final L0.b f902c;

    /* renamed from: d, reason: collision with root package name */
    public final String f903d;

    public a(V0.e eVar, L0.b bVar, String str) {
        this.f901b = eVar;
        this.f902c = bVar;
        this.f903d = str;
        this.f900a = Arrays.hashCode(new Object[]{eVar, bVar, str});
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
        return N0.r.e(this.f901b, aVar.f901b) && N0.r.e(this.f902c, aVar.f902c) && N0.r.e(this.f903d, aVar.f903d);
    }

    public final int hashCode() {
        return this.f900a;
    }
}
