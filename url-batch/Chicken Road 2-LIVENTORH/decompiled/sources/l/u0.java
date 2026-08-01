package l;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class u0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2468f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2469g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ View f2470h;
    public final /* synthetic */ Object i;

    public u0(TextView textView, Typeface typeface, int i) {
        this.f2470h = textView;
        this.i = typeface;
        this.f2469g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2468f) {
            case 0:
                ((TextView) this.f2470h).setTypeface((Typeface) this.i, this.f2469g);
                break;
            default:
                ((BottomSheetBehavior) this.i).E(this.f2470h, this.f2469g, false);
                break;
        }
    }

    public u0(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.i = bottomSheetBehavior;
        this.f2470h = view;
        this.f2469g = i;
    }
}
