package c2;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m1 implements Comparator {

    /* renamed from: e, reason: collision with root package name */
    public static final m1 f1617e = new m1(0);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1618d;

    public /* synthetic */ m1(int i3) {
        this.f1618d = i3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1618d) {
            case 0:
                g0 g0Var = (g0) obj;
                g0 g0Var2 = (g0) obj2;
                int b10 = Intrinsics.b(g0Var2.D, g0Var.D);
                return b10 != 0 ? b10 : Intrinsics.b(g0Var.hashCode(), g0Var2.hashCode());
            default:
                g0 g0Var3 = (g0) obj;
                g0 g0Var4 = (g0) obj2;
                int b11 = Intrinsics.b(g0Var3.D, g0Var4.D);
                return b11 != 0 ? b11 : Intrinsics.b(g0Var3.hashCode(), g0Var4.hashCode());
        }
    }
}
