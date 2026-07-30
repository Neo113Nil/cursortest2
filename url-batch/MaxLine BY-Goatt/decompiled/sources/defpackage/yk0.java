package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yk0 {
    public final boolean a;
    public final boolean b;
    public final qz1 c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final Long g;
    public final Map h;

    public yk0(boolean z, boolean z2, qz1 qz1Var, Long l, Long l2, Long l3, Long l4, Map map) {
        this.a = z;
        this.b = z2;
        this.c = qz1Var;
        this.d = l;
        this.e = l2;
        this.f = l3;
        this.g = l4;
        this.h = mi1.i(map);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.a) {
            arrayList.add("isRegularFile");
        }
        if (this.b) {
            arrayList.add("isDirectory");
        }
        Long l = this.d;
        if (l != null) {
            arrayList.add("byteCount=" + l);
        }
        Long l2 = this.e;
        if (l2 != null) {
            arrayList.add("createdAt=" + l2);
        }
        Long l3 = this.f;
        if (l3 != null) {
            arrayList.add("lastModifiedAt=" + l3);
        }
        Long l4 = this.g;
        if (l4 != null) {
            arrayList.add("lastAccessedAt=" + l4);
        }
        Map map = this.h;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return zv.A(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }

    public /* synthetic */ yk0(boolean z, boolean z2, qz1 qz1Var, Long l, Long l2, Long l3, Long l4) {
        this(z, z2, qz1Var, l, l2, l3, l4, mi1.c());
    }
}
