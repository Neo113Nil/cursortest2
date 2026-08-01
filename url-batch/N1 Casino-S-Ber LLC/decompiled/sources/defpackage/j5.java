package defpackage;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class j5 implements Runnable {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ int g;
    public final /* synthetic */ View h;
    public final /* synthetic */ Object i;

    public j5(TextView textView, Typeface typeface, int i) {
        this.h = textView;
        this.i = typeface;
        this.g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        int i2 = this.g;
        View view = this.h;
        Object obj = this.i;
        switch (i) {
            case 0:
                ((TextView) view).setTypeface((Typeface) obj, i2);
                break;
            default:
                ((BottomSheetBehavior) obj).O(view, i2, false);
                break;
        }
    }

    public j5(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.i = bottomSheetBehavior;
        this.h = view;
        this.g = i;
    }
}
