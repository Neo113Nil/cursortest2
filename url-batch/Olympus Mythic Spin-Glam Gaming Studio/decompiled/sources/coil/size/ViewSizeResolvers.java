package coil.size;

import android.view.View;

/* compiled from: ViewSizeResolver.kt */
/* loaded from: classes5.dex */
public abstract class ViewSizeResolvers {
    public static /* synthetic */ ViewSizeResolver create$default(View view, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return create(view, z);
    }

    public static final ViewSizeResolver create(View view, boolean z) {
        return new RealViewSizeResolver(view, z);
    }
}
