package dev.chrisbanes.haze;

import androidx.compose.ui.node.LayoutNodeDrawScope;

/* loaded from: classes9.dex */
public interface BlurEffect {
    default void cleanup() {
    }

    void drawEffect(LayoutNodeDrawScope layoutNodeDrawScope);
}
