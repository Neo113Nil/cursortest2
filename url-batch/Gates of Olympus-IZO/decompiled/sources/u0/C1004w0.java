package u0;

import android.view.RenderNode;

/* renamed from: u0.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1004w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1004w0 f8494a = new C1004w0();

    public final int a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public final int b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public final void c(RenderNode renderNode, int i3) {
        renderNode.setAmbientShadowColor(i3);
    }

    public final void d(RenderNode renderNode, int i3) {
        renderNode.setSpotShadowColor(i3);
    }
}
