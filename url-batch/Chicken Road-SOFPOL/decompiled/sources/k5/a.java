package k5;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4179d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4180e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ View f4181f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4182g;

    public a(TextView textView, Typeface typeface, int i) {
        this.f4181f = textView;
        this.f4182g = typeface;
        this.f4180e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4179d) {
            case 0:
                ((BottomSheetBehavior) this.f4182g).E(this.f4181f, this.f4180e, false);
                break;
            default:
                ((TextView) this.f4181f).setTypeface((Typeface) this.f4182g, this.f4180e);
                break;
        }
    }

    public a(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f4182g = bottomSheetBehavior;
        this.f4181f = view;
        this.f4180e = i;
    }
}
