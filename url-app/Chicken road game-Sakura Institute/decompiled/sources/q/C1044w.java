package q;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: q.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1044w extends AbstractC1024c {

    /* renamed from: h, reason: collision with root package name */
    public final S.e f9347h;

    public C1044w(S.e eVar) {
        this.f9347h = eVar;
    }

    @Override // q.AbstractC1024c
    public final int b(int i2, M0.k kVar) {
        return this.f9347h.a(0, i2, kVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1044w) && Intrinsics.a(this.f9347h, ((C1044w) obj).f9347h);
    }

    public final int hashCode() {
        return Float.hashCode(this.f9347h.f3968a);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.f9347h + ')';
    }
}
