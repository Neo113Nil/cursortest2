package w0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* renamed from: w0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0357b extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Chip f4528a;

    public C0357b(Chip chip) {
        this.f4528a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C0360e c0360e = this.f4528a.f1836e;
        if (c0360e != null) {
            c0360e.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
