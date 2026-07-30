package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class eb2 {
    public static final boolean a = Intrinsics.b(Build.DEVICE, "layoutlib");

    public static final wa2 a(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof wa2) {
                return (wa2) childAt;
            }
        }
        wa2 wa2Var = new wa2(viewGroup.getContext());
        viewGroup.addView(wa2Var);
        return wa2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.ViewParent] */
    public static final ViewGroup b(View view) {
        while (!(view instanceof ViewGroup)) {
            ?? parent = view.getParent();
            if (!(parent instanceof View)) {
                b71.p(view, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?", "Couldn't find a valid parent for ");
                return null;
            }
            view = parent;
        }
        return (ViewGroup) view;
    }
}
