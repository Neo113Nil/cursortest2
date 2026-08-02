package Q;

import android.view.ViewGroup;
import androidx.fragment.app.F;

/* loaded from: classes.dex */
public final class e extends i {

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f2121b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(F fragment, ViewGroup viewGroup, int i4) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        switch (i4) {
            case 1:
                kotlin.jvm.internal.i.e(fragment, "fragment");
                super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
                this.f2121b = viewGroup;
                break;
            default:
                this.f2121b = viewGroup;
                break;
        }
    }
}
