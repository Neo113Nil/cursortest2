package l;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class U implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2937a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2938b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2939c;
    public final /* synthetic */ Object d;

    public U(TextView textView, Typeface typeface, int i) {
        this.f2939c = textView;
        this.d = typeface;
        this.f2938b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2937a) {
            case 0:
                ((TextView) this.f2939c).setTypeface((Typeface) this.d, this.f2938b);
                break;
            default:
                ((BottomSheetBehavior) this.d).E(this.f2939c, this.f2938b, false);
                break;
        }
    }

    public U(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.d = bottomSheetBehavior;
        this.f2939c = view;
        this.f2938b = i;
    }
}
