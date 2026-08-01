package l;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class U implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2864a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2865b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2866c;
    public final /* synthetic */ Object d;

    public U(TextView textView, Typeface typeface, int i) {
        this.f2866c = textView;
        this.d = typeface;
        this.f2865b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2864a) {
            case 0:
                ((TextView) this.f2866c).setTypeface((Typeface) this.d, this.f2865b);
                break;
            default:
                ((BottomSheetBehavior) this.d).E(this.f2866c, this.f2865b, false);
                break;
        }
    }

    public U(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.d = bottomSheetBehavior;
        this.f2866c = view;
        this.f2865b = i;
    }
}
