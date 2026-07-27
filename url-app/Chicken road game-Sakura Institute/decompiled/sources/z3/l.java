package z3;

import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import z2.C1403G;
import z2.C1412P;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12010a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12011b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f12012c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f12013d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f12014e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f12015f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f12016g;

    public l(boolean z4, boolean z5, Long l4, Long l5, Long l6, Long l7) {
        Map extras = C1412P.c();
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f12010a = z4;
        this.f12011b = z5;
        this.f12012c = l4;
        this.f12013d = l5;
        this.f12014e = l6;
        this.f12015f = l7;
        this.f12016g = C1412P.i(extras);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f12010a) {
            arrayList.add("isRegularFile");
        }
        if (this.f12011b) {
            arrayList.add("isDirectory");
        }
        Long l4 = this.f12012c;
        if (l4 != null) {
            arrayList.add("byteCount=" + l4);
        }
        Long l5 = this.f12013d;
        if (l5 != null) {
            arrayList.add("createdAt=" + l5);
        }
        Long l6 = this.f12014e;
        if (l6 != null) {
            arrayList.add("lastModifiedAt=" + l6);
        }
        Long l7 = this.f12015f;
        if (l7 != null) {
            arrayList.add("lastAccessedAt=" + l7);
        }
        Map map = this.f12016g;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return C1403G.w(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }
}
