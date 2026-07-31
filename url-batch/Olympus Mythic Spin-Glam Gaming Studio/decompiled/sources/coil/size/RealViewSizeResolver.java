package coil.size;

import android.view.View;
import coil.size.ViewSizeResolver;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RealViewSizeResolver.kt */
/* loaded from: classes15.dex */
public final class RealViewSizeResolver implements ViewSizeResolver {
    private final boolean subtractPadding;
    private final View view;

    public RealViewSizeResolver(View view, boolean z) {
        this.view = view;
        this.subtractPadding = z;
    }

    @Override // coil.size.SizeResolver
    public Object size(Continuation continuation) {
        return ViewSizeResolver.DefaultImpls.size(this, continuation);
    }

    @Override // coil.size.ViewSizeResolver
    public View getView() {
        return this.view;
    }

    @Override // coil.size.ViewSizeResolver
    public boolean getSubtractPadding() {
        return this.subtractPadding;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RealViewSizeResolver) {
            RealViewSizeResolver realViewSizeResolver = (RealViewSizeResolver) obj;
            if (Intrinsics.areEqual(getView(), realViewSizeResolver.getView()) && getSubtractPadding() == realViewSizeResolver.getSubtractPadding()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (getView().hashCode() * 31) + Boolean.hashCode(getSubtractPadding());
    }
}
