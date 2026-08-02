package q;

import java.util.LinkedHashMap;
import y0.j;

/* renamed from: q.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1351b {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f14811a;

    public C1351b(int i4) {
        switch (i4) {
            case 1:
                this.f14811a = new LinkedHashMap();
                break;
            default:
                this.f14811a = new LinkedHashMap(0, 0.75f, true);
                break;
        }
    }

    public void a(j jVar) {
        long[] jArr = jVar.f16164e;
        if (jArr.length > 0) {
            Long valueOf = Long.valueOf(jArr[0]);
            LinkedHashMap linkedHashMap = this.f14811a;
            if (linkedHashMap.containsKey(valueOf)) {
                return;
            }
            linkedHashMap.put(Long.valueOf(jVar.f16164e[0]), jVar);
        }
    }
}
