package androidx.core.view;

import android.view.ViewParent;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
/* synthetic */ class ViewKt$ancestors$1 extends FunctionReferenceImpl implements f6.l {
    public static final ViewKt$ancestors$1 INSTANCE = new ViewKt$ancestors$1();

    ViewKt$ancestors$1() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // f6.l
    public final ViewParent invoke(ViewParent viewParent) {
        return viewParent.getParent();
    }
}
