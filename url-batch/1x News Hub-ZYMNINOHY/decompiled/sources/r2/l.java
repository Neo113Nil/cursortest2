package r2;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class l implements f {

    /* renamed from: a, reason: collision with root package name */
    public final f f10283a;

    /* renamed from: b, reason: collision with root package name */
    public final l2.l f10284b;

    public l(f fVar, l2.l lVar) {
        this.f10283a = fVar;
        this.f10284b = lVar;
    }

    @Override // r2.f
    public final Iterator iterator() {
        return new k(this);
    }
}
