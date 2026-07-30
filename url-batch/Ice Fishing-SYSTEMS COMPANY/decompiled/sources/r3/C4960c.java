package r3;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* renamed from: r3.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4960c extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Chip f40284a;

    public C4960c(Chip chip) {
        this.f40284a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C4963f c4963f = this.f40284a.f36092x;
        if (c4963f != null) {
            c4963f.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
