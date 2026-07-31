package i1;

import i1.b;
import i1.l;
import i1.x;
import o2.m0;

/* loaded from: classes.dex */
public final class j implements l.b {

    /* renamed from: a, reason: collision with root package name */
    private int f16934a = 0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f16935b;

    @Override // i1.l.b
    public l a(l.a aVar) {
        int i7;
        int i8 = m0.f19752a;
        if (i8 < 23 || ((i7 = this.f16934a) != 1 && (i7 != 0 || i8 < 31))) {
            return new x.b().a(aVar);
        }
        int k7 = o2.v.k(aVar.f16943c.f20956q);
        o2.r.f("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + m0.k0(k7));
        return new b.C0068b(k7, this.f16935b).a(aVar);
    }
}
