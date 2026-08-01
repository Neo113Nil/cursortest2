package l;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class T implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2856a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2857b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2858c;
    public final /* synthetic */ Object d;

    public T(TextView textView, Typeface typeface, int i) {
        this.f2858c = textView;
        this.d = typeface;
        this.f2857b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2856a) {
            case 0:
                ((TextView) this.f2858c).setTypeface((Typeface) this.d, this.f2857b);
                break;
            default:
                ((BottomSheetBehavior) this.d).E(this.f2858c, this.f2857b, false);
                break;
        }
    }

    public T(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.d = bottomSheetBehavior;
        this.f2858c = view;
        this.f2857b = i;
    }
}
