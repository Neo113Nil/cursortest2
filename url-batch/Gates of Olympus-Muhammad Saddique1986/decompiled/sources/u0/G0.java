package u0;

import android.view.RenderNode;

/* loaded from: classes.dex */
public final class G0 {

    /* renamed from: a, reason: collision with root package name */
    public static final G0 f9190a = new G0();

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
