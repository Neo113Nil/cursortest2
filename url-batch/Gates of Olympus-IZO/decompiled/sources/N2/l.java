package N2;

import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2940a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2941b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f2942c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f2943d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f2944e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f2945f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f2946g;

    public l(boolean z3, boolean z4, Long l3, Long l4, Long l5, Long l6) {
        M1.v vVar = M1.v.f2804d;
        this.f2940a = z3;
        this.f2941b = z4;
        this.f2942c = l3;
        this.f2943d = l4;
        this.f2944e = l5;
        this.f2945f = l6;
        this.f2946g = M1.B.Q(vVar);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f2940a) {
            arrayList.add("isRegularFile");
        }
        if (this.f2941b) {
            arrayList.add("isDirectory");
        }
        Long l3 = this.f2942c;
        if (l3 != null) {
            arrayList.add("byteCount=" + l3);
        }
        Long l4 = this.f2943d;
        if (l4 != null) {
            arrayList.add("createdAt=" + l4);
        }
        Long l5 = this.f2944e;
        if (l5 != null) {
            arrayList.add("lastModifiedAt=" + l5);
        }
        Long l6 = this.f2945f;
        if (l6 != null) {
            arrayList.add("lastAccessedAt=" + l6);
        }
        Map map = this.f2946g;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return M1.l.r0(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }
}
