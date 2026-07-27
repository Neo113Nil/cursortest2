package P0;

import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class r extends M2.p implements Function2 {

    /* renamed from: e, reason: collision with root package name */
    public static final r f3756e = new r(2, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final r f3757i = new r(2, 1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3758d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i2, int i4) {
        super(i2);
        this.f3758d = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f3758d) {
            case 0:
                C0216p c0216p = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
                    c0216p.N();
                }
                break;
            default:
                C0216p c0216p2 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p2.z()) {
                    c0216p2.N();
                }
                break;
        }
        return Unit.f7487a;
    }
}
