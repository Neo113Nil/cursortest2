package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ii1 implements b41 {
    public final long a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final fn0 c;

    public ii1(bn1 bn1Var, long j) {
        this.a = j;
        this.c = new fn0(bn1Var.a, this, 6);
    }

    @Override // defpackage.b41
    public final xm0 a() {
        return this.c;
    }
}
