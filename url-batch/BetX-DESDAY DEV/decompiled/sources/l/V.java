package l;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class V implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3310a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3311b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f3312c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3313d;

    public V(TextView textView, Typeface typeface, int i) {
        this.f3312c = textView;
        this.f3313d = typeface;
        this.f3311b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3310a) {
            case 0:
                ((TextView) this.f3312c).setTypeface((Typeface) this.f3313d, this.f3311b);
                break;
            default:
                ((BottomSheetBehavior) this.f3313d).E(this.f3312c, this.f3311b, false);
                break;
        }
    }

    public V(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f3313d = bottomSheetBehavior;
        this.f3312c = view;
        this.f3311b = i;
    }
}
