package defpackage;

import android.os.Parcelable;
import android.util.SparseArray;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class b7 extends pc0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ pn1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b7(pn1 pn1Var, int i) {
        super(0);
        this.d = i;
        this.e = pn1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        gu0 snapshotObserver;
        int i = this.d;
        pn1 pn1Var = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                pn1Var.getLayoutNode().A();
                break;
            case 1:
                if (pn1Var.i && pn1Var.isAttachedToWindow() && pn1Var.getView().getParent() == pn1Var) {
                    snapshotObserver = pn1Var.getSnapshotObserver();
                    snapshotObserver.a.b(pn1Var, y3.j, pn1Var.getUpdate());
                }
                break;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                pn1Var.E.saveHierarchyState(sparseArray);
                break;
            case 3:
                pn1Var.getReleaseBlock().invoke(pn1Var.E);
                pn1.h(pn1Var);
                break;
            case 4:
                pn1Var.getResetBlock().invoke(pn1Var.E);
                break;
            default:
                pn1Var.getUpdateBlock().invoke(pn1Var.E);
                break;
        }
        return Unit.a;
    }
}
