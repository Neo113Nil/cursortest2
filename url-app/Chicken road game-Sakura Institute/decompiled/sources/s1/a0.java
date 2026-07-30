package s1;

import android.view.accessibility.AccessibilityEvent;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a0 extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8127g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c0 f8128h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(c0 c0Var, int i7) {
        super(1);
        this.f8127g = i7;
        this.f8128h = c0Var;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f8127g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                c0 c0Var = this.f8128h;
                return Boolean.valueOf(c0Var.f8160d.getParent().requestSendAccessibilityEvent(c0Var.f8160d, (AccessibilityEvent) obj));
            default:
                e2 e2Var = (e2) obj;
                if (e2Var.f8205g.contains(e2Var)) {
                    c0 c0Var2 = this.f8128h;
                    c0Var2.f8160d.getSnapshotObserver().a(e2Var, c0Var2.M, new a0.b1(e2Var, 9, c0Var2));
                }
                return d6.z.f2639a;
        }
    }
}
