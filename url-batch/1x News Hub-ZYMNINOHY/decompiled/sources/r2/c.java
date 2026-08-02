package r2;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final f f10270a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10271b;

    /* renamed from: c, reason: collision with root package name */
    public final l2.l f10272c;

    public c(f fVar, boolean z, l2.l lVar) {
        this.f10270a = fVar;
        this.f10271b = z;
        this.f10272c = lVar;
    }

    @Override // r2.f
    public final Iterator iterator() {
        return new b(this);
    }
}
