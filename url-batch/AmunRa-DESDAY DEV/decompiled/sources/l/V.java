package l;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class V implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3014a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3015b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f3016c;
    public final /* synthetic */ Object d;

    public V(TextView textView, Typeface typeface, int i) {
        this.f3016c = textView;
        this.d = typeface;
        this.f3015b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3014a) {
            case 0:
                ((TextView) this.f3016c).setTypeface((Typeface) this.d, this.f3015b);
                break;
            default:
                ((BottomSheetBehavior) this.d).E(this.f3016c, this.f3015b, false);
                break;
        }
    }

    public V(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.d = bottomSheetBehavior;
        this.f3016c = view;
        this.f3015b = i;
    }
}
