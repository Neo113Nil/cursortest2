package n;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class U implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3526a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3527b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f3528c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3529d;

    public U(TextView textView, Typeface typeface, int i) {
        this.f3528c = textView;
        this.f3529d = typeface;
        this.f3527b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3526a) {
            case 0:
                ((TextView) this.f3528c).setTypeface((Typeface) this.f3529d, this.f3527b);
                break;
            default:
                ((BottomSheetBehavior) this.f3529d).K(this.f3528c, this.f3527b, false);
                break;
        }
    }

    public U(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f3529d = bottomSheetBehavior;
        this.f3528c = view;
        this.f3527b = i;
    }
}
