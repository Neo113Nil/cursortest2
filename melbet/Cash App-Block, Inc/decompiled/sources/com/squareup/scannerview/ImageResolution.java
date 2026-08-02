package com.squareup.scannerview;

/* loaded from: classes8.dex */
public abstract class ImageResolution {

    public final class MatchScreen extends ImageResolution {
        public static final MatchScreen INSTANCE = new MatchScreen();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MatchScreen);
        }

        public final int hashCode() {
            return 752280278;
        }

        public final String toString() {
            return "MatchScreen";
        }
    }
}
