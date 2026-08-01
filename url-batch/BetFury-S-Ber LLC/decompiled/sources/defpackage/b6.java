package defpackage;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class b6 implements Runnable {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ int g;
    public final /* synthetic */ View h;
    public final /* synthetic */ Object i;

    public b6(TextView textView, Typeface typeface, int i) {
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

    public b6(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.i = bottomSheetBehavior;
        this.h = view;
        this.g = i;
    }
}
