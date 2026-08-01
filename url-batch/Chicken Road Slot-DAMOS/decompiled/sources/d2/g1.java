package d2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g1 extends wd.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f3412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c6.l f3413e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f3414i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(boolean z10, c6.l lVar, String str) {
        super(0);
        this.f3412d = z10;
        this.f3413e = lVar;
        this.f3414i = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.f3412d) {
            c6.l lVar = this.f3413e;
            String str = this.f3414i;
            h5.b bVar = (h5.b) lVar.f1829e;
            synchronized (bVar.f4470c) {
            }
        }
        return Unit.f5554a;
    }
}
