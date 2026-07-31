package i0;

import a0.q;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof b);
    }

    public final int hashCode() {
        return Float.hashCode(0.1f) + q.a(0.08f, q.a(0.1f, Float.hashCode(0.16f) * 31, 31), 31);
    }

    public final String toString() {
        return "RippleAlpha(draggedAlpha=0.16, focusedAlpha=0.1, hoveredAlpha=0.08, pressedAlpha=0.1)";
    }
}
