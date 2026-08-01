package w;

import androidx.window.extensions.layout.WindowLayoutInfo;
import d0.l;
import e0.g;
import e0.h;

/* renamed from: w.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0096b extends g implements l {
    public C0096b(C0100f c0100f) {
        super(1, c0100f, C0100f.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
    }

    @Override // d0.l
    public final Object h(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        h.e(windowLayoutInfo, "p0");
        ((C0100f) this.f546c).accept(windowLayoutInfo);
        return U.g.f433a;
    }
}
