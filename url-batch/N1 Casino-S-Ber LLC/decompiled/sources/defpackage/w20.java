package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.derinko.gbini.n1casino.R;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class w20 extends s7 {
    public static final int[] B = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};
    public boolean A;
    public final AccessibilityManager z;

    public w20(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.z = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }
}
