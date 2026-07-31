package o;

import I.C0102j0;

/* renamed from: o.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0740p implements N {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H2.h f6602a;

    public C0740p(H2.h hVar) {
        this.f6602a = hVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [Y1.c, Z1.j] */
    @Override // o.N
    public final float a(float f3) {
        if (Float.isNaN(f3)) {
            return 0.0f;
        }
        H2.h hVar = this.f6602a;
        float floatValue = ((Number) ((Z1.j) hVar.f1959a).j(Float.valueOf(f3))).floatValue();
        ((C0102j0) hVar.f1963e).setValue(Boolean.valueOf(floatValue > 0.0f));
        ((C0102j0) hVar.f1964f).setValue(Boolean.valueOf(floatValue < 0.0f));
        return floatValue;
    }
}
