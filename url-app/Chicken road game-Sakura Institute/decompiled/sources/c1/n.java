package c1;

import android.view.RenderNode;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f1616a = new n();

    public final int a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public final int b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public final void c(RenderNode renderNode, int i7) {
        renderNode.setAmbientShadowColor(i7);
    }

    public final void d(RenderNode renderNode, int i7) {
        renderNode.setSpotShadowColor(i7);
    }
}
