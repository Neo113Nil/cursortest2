package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ef2 implements sx1 {
    public final int m;
    public final List n;
    public Float o = null;
    public Float p = null;
    public ye2 q = null;
    public ye2 r = null;

    public ef2(int i, ArrayList arrayList) {
        this.m = i;
        this.n = arrayList;
    }

    @Override // defpackage.sx1
    public final boolean E() {
        return this.n.contains(this);
    }
}
