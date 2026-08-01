package a3;

import c2.g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q extends wd.p implements Function2 {

    /* renamed from: e, reason: collision with root package name */
    public static final q f250e;

    /* renamed from: i, reason: collision with root package name */
    public static final q f251i;

    /* renamed from: r, reason: collision with root package name */
    public static final q f252r;

    /* renamed from: s, reason: collision with root package name */
    public static final q f253s;

    /* renamed from: t, reason: collision with root package name */
    public static final q f254t;

    /* renamed from: u, reason: collision with root package name */
    public static final q f255u;

    /* renamed from: v, reason: collision with root package name */
    public static final q f256v;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f257d;

    static {
        int i3 = 2;
        f250e = new q(i3, 0);
        f251i = new q(i3, 1);
        f252r = new q(i3, 2);
        f253s = new q(i3, 3);
        f254t = new q(i3, 4);
        f255u = new q(i3, 5);
        f256v = new q(i3, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i3, int i10) {
        super(i3);
        this.f257d = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i3;
        switch (this.f257d) {
            case 0:
                o.e((g0) obj).setUpdateBlock((Function1) obj2);
                break;
            case 1:
                o.e((g0) obj).setReleaseBlock((Function1) obj2);
                break;
            case 2:
                o.e((g0) obj).setModifier((d1.l) obj2);
                break;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                o.e((g0) obj).setDensity((x2.c) obj2);
                break;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                o.e((g0) obj).setLifecycleOwner((androidx.lifecycle.u) obj2);
                break;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                o.e((g0) obj).setSavedStateRegistryOwner((f5.e) obj2);
                break;
            default:
                e0 e2 = o.e((g0) obj);
                int ordinal = ((x2.l) obj2).ordinal();
                if (ordinal != 0) {
                    i3 = 1;
                    if (ordinal != 1) {
                        a2.r.p();
                        break;
                    }
                } else {
                    i3 = 0;
                }
                e2.setLayoutDirection(i3);
                break;
        }
        return Unit.f5554a;
    }
}
