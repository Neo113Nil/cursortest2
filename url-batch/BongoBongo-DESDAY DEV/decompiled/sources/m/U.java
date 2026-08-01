package m;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class U implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2998a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2999b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f3000c;
    public final /* synthetic */ Object d;

    public U(TextView textView, Typeface typeface, int i) {
        this.f3000c = textView;
        this.d = typeface;
        this.f2999b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2998a) {
            case 0:
                ((TextView) this.f3000c).setTypeface((Typeface) this.d, this.f2999b);
                break;
            default:
                ((BottomSheetBehavior) this.d).E(this.f3000c, this.f2999b, false);
                break;
        }
    }

    public U(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.d = bottomSheetBehavior;
        this.f3000c = view;
        this.f2999b = i;
    }
}
