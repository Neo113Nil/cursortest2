package q2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d extends p implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public static final d f7963e;

    /* renamed from: i, reason: collision with root package name */
    public static final d f7964i;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7965d;

    static {
        int i3 = 1;
        f7963e = new d(i3, 0);
        f7964i = new d(i3, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i3, int i10) {
        super(i3);
        this.f7965d = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.f7965d) {
            case 0:
                return Unit.f5554a;
            default:
                throw null;
        }
    }
}
