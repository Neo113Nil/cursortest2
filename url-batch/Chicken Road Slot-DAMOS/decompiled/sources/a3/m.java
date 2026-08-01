package a3;

import android.os.Parcelable;
import android.util.SparseArray;
import c2.q1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m extends wd.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e0 f232e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(e0 e0Var, int i3) {
        super(0);
        this.f231d = i3;
        this.f232e = e0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        q1 snapshotObserver;
        switch (this.f231d) {
            case 0:
                this.f232e.getLayoutNode().z();
                break;
            case 1:
                e0 e0Var = this.f232e;
                if (e0Var.f237s && e0Var.isAttachedToWindow() && e0Var.getView().getParent() == e0Var) {
                    snapshotObserver = e0Var.getSnapshotObserver();
                    snapshotObserver.f1645a.c(e0Var, c.f198e, e0Var.getUpdate());
                }
                break;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                this.f232e.O.saveHierarchyState(sparseArray);
                break;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                e0 e0Var2 = this.f232e;
                e0Var2.getReleaseBlock().invoke(e0Var2.O);
                e0.n(e0Var2);
                break;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                e0 e0Var3 = this.f232e;
                e0Var3.getResetBlock().invoke(e0Var3.O);
                break;
            default:
                e0 e0Var4 = this.f232e;
                e0Var4.getUpdateBlock().invoke(e0Var4.O);
                break;
        }
        return Unit.f5554a;
    }
}
