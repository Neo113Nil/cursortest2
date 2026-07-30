package f8;

import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3618a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3619b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f3620c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f3621d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f3622e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f3623f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f3624g = e6.c0.m0(e6.v.f2827f);

    public l(boolean z8, boolean z9, Long l8, Long l9, Long l10, Long l11) {
        this.f3618a = z8;
        this.f3619b = z9;
        this.f3620c = l8;
        this.f3621d = l9;
        this.f3622e = l10;
        this.f3623f = l11;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f3618a) {
            arrayList.add("isRegularFile");
        }
        if (this.f3619b) {
            arrayList.add("isDirectory");
        }
        Long l8 = this.f3620c;
        if (l8 != null) {
            arrayList.add("byteCount=" + l8);
        }
        Long l9 = this.f3621d;
        if (l9 != null) {
            arrayList.add("createdAt=" + l9);
        }
        Long l10 = this.f3622e;
        if (l10 != null) {
            arrayList.add("lastModifiedAt=" + l10);
        }
        Long l11 = this.f3623f;
        if (l11 != null) {
            arrayList.add("lastAccessedAt=" + l11);
        }
        Map map = this.f3624g;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return e6.l.m0(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }
}
