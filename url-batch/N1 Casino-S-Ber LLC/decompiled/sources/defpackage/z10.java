package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class z10 implements Iterable, kp {
    public final /* synthetic */ ef f;

    public z10(ef efVar) {
        this.f = efVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new df(this.f);
    }
}
