package r2;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    public final f f10273a;

    /* renamed from: b, reason: collision with root package name */
    public final l2.l f10274b;

    /* renamed from: c, reason: collision with root package name */
    public final l2.l f10275c;

    public d(f fVar, l2.l lVar, l2.l lVar2) {
        this.f10273a = fVar;
        this.f10274b = lVar;
        this.f10275c = lVar2;
    }

    @Override // r2.f
    public final Iterator iterator() {
        return new b(this);
    }
}
