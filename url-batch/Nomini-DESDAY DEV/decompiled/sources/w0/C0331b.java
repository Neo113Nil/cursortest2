package w0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* renamed from: w0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0331b extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Chip f4088a;

    public C0331b(Chip chip) {
        this.f4088a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C0334e c0334e = this.f4088a.f1616e;
        if (c0334e != null) {
            c0334e.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
