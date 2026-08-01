package l;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class r0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2551f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2552g;
    public final /* synthetic */ View h;
    public final /* synthetic */ Object i;

    public r0(TextView textView, Typeface typeface, int i) {
        this.h = textView;
        this.i = typeface;
        this.f2552g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2551f) {
            case 0:
                ((TextView) this.h).setTypeface((Typeface) this.i, this.f2552g);
                break;
            default:
                ((BottomSheetBehavior) this.i).H(this.h, this.f2552g, false);
                break;
        }
    }

    public r0(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.i = bottomSheetBehavior;
        this.h = view;
        this.f2552g = i;
    }
}
