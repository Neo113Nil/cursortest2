package r2;

import s2.AbstractC3413d;

/* renamed from: r2.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3388A extends AbstractC3413d {

    /* renamed from: a, reason: collision with root package name */
    public long f43496a = -1;

    /* renamed from: b, reason: collision with root package name */
    public kotlin.coroutines.d f43497b;

    @Override // s2.AbstractC3413d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(y yVar) {
        if (this.f43496a >= 0) {
            return false;
        }
        this.f43496a = yVar.Y();
        return true;
    }

    @Override // s2.AbstractC3413d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public kotlin.coroutines.d[] b(y yVar) {
        long j4 = this.f43496a;
        this.f43496a = -1L;
        this.f43497b = null;
        return yVar.X(j4);
    }
}
