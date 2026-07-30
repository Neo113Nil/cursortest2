package defpackage;

import android.content.res.Resources;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class l7 extends gu0 implements xt0 {
    @Override // defpackage.xt0
    public final Object a(Object obj, Object obj2, Object obj3) {
        if (obj != null) {
            b71.o();
            return null;
        }
        t7 t7Var = (t7) this.receiver;
        Resources resources = t7Var.getContext().getResources();
        return Boolean.valueOf(e8.a.a(t7Var, null, new az(new da0(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), ((ql2) obj2).a, (Function1) obj3)));
    }
}
