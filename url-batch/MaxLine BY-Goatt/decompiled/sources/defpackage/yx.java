package defpackage;

import android.R;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class yx {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(re reVar, my myVar) {
        View childAt = ((ViewGroup) reVar.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        qz qzVar = childAt instanceof qz ? (qz) childAt : null;
        if (qzVar != null) {
            qzVar.setParentCompositionContext(null);
            qzVar.setContent(myVar);
            return;
        }
        qz qzVar2 = new qz(reVar);
        qzVar2.setParentCompositionContext(null);
        qzVar2.setContent(myVar);
        View decorView = reVar.getWindow().getDecorView();
        if (ij2.g(decorView) == null) {
            decorView.setTag(com.majelw.libystne.R.id.view_tree_lifecycle_owner, reVar);
        }
        if (zj2.h(decorView) == null) {
            decorView.setTag(com.majelw.libystne.R.id.view_tree_view_model_store_owner, reVar);
        }
        if (uj2.b(decorView) == null) {
            decorView.setTag(com.majelw.libystne.R.id.view_tree_saved_state_registry_owner, reVar);
        }
        reVar.setContentView(qzVar2, a);
    }
}
