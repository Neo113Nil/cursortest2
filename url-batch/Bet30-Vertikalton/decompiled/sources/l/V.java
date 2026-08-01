package l;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class V implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2935a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2936b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2937c;
    public final /* synthetic */ Object d;

    public V(TextView textView, Typeface typeface, int i) {
        this.f2937c = textView;
        this.d = typeface;
        this.f2936b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2935a) {
            case 0:
                ((TextView) this.f2937c).setTypeface((Typeface) this.d, this.f2936b);
                break;
            default:
                ((BottomSheetBehavior) this.d).E(this.f2937c, this.f2936b, false);
                break;
        }
    }

    public V(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.d = bottomSheetBehavior;
        this.f2937c = view;
        this.f2936b = i;
    }
}
