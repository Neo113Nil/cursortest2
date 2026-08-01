package n1;

import android.view.RenderNode;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class k {
    public static int a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public static int b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public static void c(RenderNode renderNode, int i3) {
        renderNode.setAmbientShadowColor(i3);
    }

    public static void d(RenderNode renderNode, int i3) {
        renderNode.setSpotShadowColor(i3);
    }
}
