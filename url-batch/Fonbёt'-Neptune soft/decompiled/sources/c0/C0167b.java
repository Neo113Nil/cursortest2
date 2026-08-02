package c0;

import P0.l;
import Q0.g;
import Q0.h;
import androidx.window.extensions.layout.WindowLayoutInfo;

/* renamed from: c0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0167b extends g implements l {
    public C0167b(C0171f c0171f) {
        super(1, c0171f, C0171f.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
    }

    @Override // P0.l
    public final Object i(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        h.e(windowLayoutInfo, "p0");
        ((C0171f) this.f966f).accept(windowLayoutInfo);
        return F0.h.f469a;
    }
}
