package s0;

import android.view.RenderNode;

/* loaded from: classes.dex */
public final class H0 {

    /* renamed from: a, reason: collision with root package name */
    public static final H0 f10054a = new H0();

    public final int a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public final int b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public final void c(RenderNode renderNode, int i2) {
        renderNode.setAmbientShadowColor(i2);
    }

    public final void d(RenderNode renderNode, int i2) {
        renderNode.setSpotShadowColor(i2);
    }
}
