package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.vector.PathNode;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PathBuilder.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/vector/PathNode;", "node", "addNode", "(Landroidx/compose/ui/graphics/vector/PathNode;)Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "getNodes", "()Ljava/util/List;", "close", "()Landroidx/compose/ui/graphics/vector/PathBuilder;", "", VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "moveTo", "(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;", "lineTo", "dx", "dy", "lineToRelative", "", "nodes", "Ljava/util/List;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PathBuilder {
    private final List nodes = new ArrayList();

    public final List getNodes() {
        return this.nodes;
    }

    public final PathBuilder close() {
        return addNode(PathNode.Close.INSTANCE);
    }

    public final PathBuilder moveTo(float x, float y) {
        return addNode(new PathNode.MoveTo(x, y));
    }

    public final PathBuilder lineTo(float x, float y) {
        return addNode(new PathNode.LineTo(x, y));
    }

    public final PathBuilder lineToRelative(float dx, float dy) {
        return addNode(new PathNode.RelativeLineTo(dx, dy));
    }

    private final PathBuilder addNode(PathNode node) {
        this.nodes.add(node);
        return this;
    }
}
