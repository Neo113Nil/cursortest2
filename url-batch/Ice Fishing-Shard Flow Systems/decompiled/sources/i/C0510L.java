package i;

import I.T;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* renamed from: i.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0510L extends d4.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5379i;
    public final /* synthetic */ C0513O j;

    public /* synthetic */ C0510L(C0513O c0513o, int i2) {
        this.f5379i = i2;
        this.j = c0513o;
    }

    @Override // I.Z
    public final void a() {
        View view;
        int i2 = this.f5379i;
        C0513O c0513o = this.j;
        switch (i2) {
            case 0:
                if (c0513o.f5402o && (view = c0513o.f5395g) != null) {
                    view.setTranslationY(0.0f);
                    c0513o.f5392d.setTranslationY(0.0f);
                }
                c0513o.f5392d.setVisibility(8);
                c0513o.f5392d.setTransitioning(false);
                c0513o.f5407t = null;
                P0.e eVar = c0513o.f5398k;
                if (eVar != null) {
                    eVar.f(c0513o.j);
                    c0513o.j = null;
                    c0513o.f5398k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = c0513o.f5391c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = T.f1153a;
                    actionBarOverlayLayout.requestApplyInsets();
                    break;
                }
                break;
            default:
                c0513o.f5407t = null;
                c0513o.f5392d.requestLayout();
                break;
        }
    }
}
