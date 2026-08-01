package l;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class V implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2936a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2937b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2938c;
    public final /* synthetic */ Object d;

    public V(TextView textView, Typeface typeface, int i) {
        this.f2938c = textView;
        this.d = typeface;
        this.f2937b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2936a) {
            case 0:
                ((TextView) this.f2938c).setTypeface((Typeface) this.d, this.f2937b);
                break;
            default:
                ((BottomSheetBehavior) this.d).E(this.f2938c, this.f2937b, false);
                break;
        }
    }

    public V(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.d = bottomSheetBehavior;
        this.f2938c = view;
        this.f2937b = i;
    }
}
