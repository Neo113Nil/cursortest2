package com.valentinilk.shimmer;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/valentinilk/shimmer/ShimmerElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lcom/valentinilk/shimmer/ShimmerNode;", "shimmer_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* data */ class ShimmerElement extends ModifierNodeElement {
    public ShimmerArea area;
    public ShimmerEffect effect;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        ShimmerArea shimmerArea = this.area;
        ShimmerEffect shimmerEffect = this.effect;
        shimmerArea.getClass();
        shimmerEffect.getClass();
        ShimmerNode shimmerNode = new ShimmerNode();
        shimmerNode.area = shimmerArea;
        shimmerNode.effect = shimmerEffect;
        return shimmerNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShimmerElement)) {
            return false;
        }
        ShimmerElement shimmerElement = (ShimmerElement) obj;
        return Intrinsics.areEqual(this.area, shimmerElement.area) && Intrinsics.areEqual(this.effect, shimmerElement.effect);
    }

    public final int hashCode() {
        return this.effect.hashCode() + (this.area.hashCode() * 31);
    }

    public final String toString() {
        return "ShimmerElement(area=" + this.area + ", effect=" + this.effect + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        ShimmerNode shimmerNode = (ShimmerNode) node;
        shimmerNode.getClass();
        ShimmerArea shimmerArea = this.area;
        shimmerArea.getClass();
        shimmerNode.area = shimmerArea;
        ShimmerEffect shimmerEffect = this.effect;
        shimmerEffect.getClass();
        shimmerNode.effect = shimmerEffect;
    }
}
