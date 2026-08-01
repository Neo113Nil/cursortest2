package l;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class T implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2901a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2902b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2903c;
    public final /* synthetic */ Object d;

    public T(TextView textView, Typeface typeface, int i) {
        this.f2903c = textView;
        this.d = typeface;
        this.f2902b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2901a) {
            case 0:
                ((TextView) this.f2903c).setTypeface((Typeface) this.d, this.f2902b);
                break;
            default:
                ((BottomSheetBehavior) this.d).E(this.f2903c, this.f2902b, false);
                break;
        }
    }

    public T(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.d = bottomSheetBehavior;
        this.f2903c = view;
        this.f2902b = i;
    }
}
