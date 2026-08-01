package z0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class b extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Chip f4360a;

    public b(Chip chip) {
        this.f4360a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        e eVar = this.f4360a.f1842e;
        if (eVar != null) {
            eVar.getOutline(outline);
        } else {
            outline.setAlpha(RecyclerView.A0);
        }
    }
}
