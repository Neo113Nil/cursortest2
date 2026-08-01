package T0;

import android.content.Context;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.fortunequest.neontrack.R;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* loaded from: classes.dex */
public final class j extends i {

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f1066B = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};

    /* renamed from: A, reason: collision with root package name */
    public final AccessibilityManager f1067A;

    public j(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.f1067A = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }
}
