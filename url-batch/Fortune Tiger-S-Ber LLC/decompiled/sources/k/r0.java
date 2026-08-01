package k;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class r0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2636f = 0;
    public final /* synthetic */ int g;
    public final /* synthetic */ View h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2637i;

    public r0(TextView textView, Typeface typeface, int i4) {
        this.h = textView;
        this.f2637i = typeface;
        this.g = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2636f) {
            case 0:
                ((TextView) this.h).setTypeface((Typeface) this.f2637i, this.g);
                break;
            default:
                ((BottomSheetBehavior) this.f2637i).H(this.h, this.g, false);
                break;
        }
    }

    public r0(BottomSheetBehavior bottomSheetBehavior, View view, int i4) {
        this.f2637i = bottomSheetBehavior;
        this.h = view;
        this.g = i4;
    }
}
