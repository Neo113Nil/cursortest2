package defpackage;

import java.util.List;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class sy0 {
    public final List a;
    public final List[] b;
    public int c;
    public int d;
    public boolean e;
    public final /* synthetic */ ty0 f;

    public sy0(ty0 ty0Var, List list) {
        this.f = ty0Var;
        this.a = list;
        this.b = new List[list.size()];
        if (list.isEmpty()) {
            r80.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
