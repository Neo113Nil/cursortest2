package a3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c extends wd.p implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public static final c f198e;

    /* renamed from: i, reason: collision with root package name */
    public static final c f199i;

    /* renamed from: r, reason: collision with root package name */
    public static final c f200r;

    /* renamed from: s, reason: collision with root package name */
    public static final c f201s;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f202d;

    static {
        int i3 = 1;
        f198e = new c(i3, 0);
        f199i = new c(i3, 1);
        f200r = new c(i3, 2);
        f201s = new c(i3, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i3, int i10) {
        super(i3);
        this.f202d = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f202d) {
            case 0:
                n nVar = (n) obj;
                nVar.getHandler().post(new a(1, nVar.F));
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
        return Unit.f5554a;
    }
}
