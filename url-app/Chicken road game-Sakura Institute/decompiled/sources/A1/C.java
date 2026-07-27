package A1;

import D.N1;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import z1.AbstractC1365I;

/* loaded from: classes.dex */
public final class C implements L2.c {

    /* renamed from: e, reason: collision with root package name */
    public static final C f434e = new C(0);

    /* renamed from: i, reason: collision with root package name */
    public static final C f435i = new C(1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f436d;

    public /* synthetic */ C(int i2) {
        this.f436d = i2;
    }

    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        switch (this.f436d) {
            case 0:
                q.g0 TextButton = (q.g0) obj;
                C0216p c0216p = (C0216p) obj2;
                int intValue = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                if ((intValue & 17) == 16 && c0216p.z()) {
                    c0216p.N();
                } else {
                    N1.b("Close", null, AbstractC1365I.f11805f, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 6, 0, 131066);
                }
                break;
            default:
                q.g0 TextButton2 = (q.g0) obj;
                C0216p c0216p2 = (C0216p) obj2;
                int intValue2 = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(TextButton2, "$this$TextButton");
                if ((intValue2 & 17) == 16 && c0216p2.z()) {
                    c0216p2.N();
                } else {
                    N1.b("Cancel", null, AbstractC1365I.f11806g, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p2, 6, 0, 131066);
                }
                break;
        }
        return Unit.f7487a;
    }
}
