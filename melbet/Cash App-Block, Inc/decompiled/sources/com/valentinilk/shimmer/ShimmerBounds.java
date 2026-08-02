package com.valentinilk.shimmer;

/* loaded from: classes8.dex */
public interface ShimmerBounds {

    public final class Custom implements ShimmerBounds {
        public static final Custom INSTANCE = new Custom();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Custom);
        }

        public final int hashCode() {
            return -1044536456;
        }

        public final String toString() {
            return "Custom";
        }
    }

    public final class View implements ShimmerBounds {
        public static final View INSTANCE = new View();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof View);
        }

        public final int hashCode() {
            return -1216173972;
        }

        public final String toString() {
            return "View";
        }
    }

    public final class Window implements ShimmerBounds {
        public static final Window INSTANCE = new Window();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Window);
        }

        public final int hashCode() {
            return -483200009;
        }

        public final String toString() {
            return "Window";
        }
    }
}
