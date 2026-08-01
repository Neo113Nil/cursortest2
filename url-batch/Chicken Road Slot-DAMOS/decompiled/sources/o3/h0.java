package o3;

import android.view.ViewParent;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 extends wd.n implements Function1 {

    /* renamed from: v, reason: collision with root package name */
    public static final h0 f7396v = new h0();

    public h0() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ViewParent) obj).getParent();
    }
}
