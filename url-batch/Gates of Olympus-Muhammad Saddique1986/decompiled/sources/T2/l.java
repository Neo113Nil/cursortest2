package T2;

import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4420a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4421b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f4422c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f4423d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f4424e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f4425f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f4426g;

    public l(boolean z3, boolean z4, Long l3, Long l4, Long l5, Long l6) {
        S1.v vVar = S1.v.f4321d;
        this.f4420a = z3;
        this.f4421b = z4;
        this.f4422c = l3;
        this.f4423d = l4;
        this.f4424e = l5;
        this.f4425f = l6;
        this.f4426g = S1.B.M(vVar);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f4420a) {
            arrayList.add("isRegularFile");
        }
        if (this.f4421b) {
            arrayList.add("isDirectory");
        }
        Long l3 = this.f4422c;
        if (l3 != null) {
            arrayList.add("byteCount=" + l3);
        }
        Long l4 = this.f4423d;
        if (l4 != null) {
            arrayList.add("createdAt=" + l4);
        }
        Long l5 = this.f4424e;
        if (l5 != null) {
            arrayList.add("lastModifiedAt=" + l5);
        }
        Long l6 = this.f4425f;
        if (l6 != null) {
            arrayList.add("lastAccessedAt=" + l6);
        }
        Map map = this.f4426g;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return S1.l.P0(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }
}
