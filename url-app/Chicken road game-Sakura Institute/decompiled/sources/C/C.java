package C;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f1043a = Intrinsics.a(Build.DEVICE, "layoutlib");

    public static final r a(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof r) {
                return (r) childAt;
            }
        }
        r rVar = new r(viewGroup.getContext());
        viewGroup.addView(rVar);
        return rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.ViewParent] */
    public static final ViewGroup b(View view) {
        while (!(view instanceof ViewGroup)) {
            ?? parent = view.getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + view + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            view = parent;
        }
        return (ViewGroup) view;
    }
}
