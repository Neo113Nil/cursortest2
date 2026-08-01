package w0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* renamed from: w0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0359b extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Chip f4532a;

    public C0359b(Chip chip) {
        this.f4532a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C0362e c0362e = this.f4532a.f1814e;
        if (c0362e != null) {
            c0362e.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
