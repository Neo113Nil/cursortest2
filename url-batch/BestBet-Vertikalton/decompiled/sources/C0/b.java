package C0;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f87b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f88c;
    public final /* synthetic */ Object d;

    public b(TextView textView, Typeface typeface, int i) {
        this.f88c = textView;
        this.d = typeface;
        this.f87b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f86a) {
            case 0:
                ((BottomSheetBehavior) this.d).E(this.f88c, this.f87b, false);
                break;
            default:
                ((TextView) this.f88c).setTypeface((Typeface) this.d, this.f87b);
                break;
        }
    }

    public b(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.d = bottomSheetBehavior;
        this.f88c = view;
        this.f87b = i;
    }
}
