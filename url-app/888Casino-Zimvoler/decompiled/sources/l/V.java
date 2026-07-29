package l;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class V implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2914a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2915b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2916c;
    public final /* synthetic */ Object d;

    public V(TextView textView, Typeface typeface, int i) {
        this.f2916c = textView;
        this.d = typeface;
        this.f2915b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2914a) {
            case 0:
                ((TextView) this.f2916c).setTypeface((Typeface) this.d, this.f2915b);
                break;
            default:
                ((BottomSheetBehavior) this.d).E(this.f2916c, this.f2915b, false);
                break;
        }
    }

    public V(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.d = bottomSheetBehavior;
        this.f2916c = view;
        this.f2915b = i;
    }
}
