package androidx.media2.common;

import a0.b;

/* loaded from: classes.dex */
public class VideoSize implements b {

    /* renamed from: a, reason: collision with root package name */
    int f1137a;

    /* renamed from: b, reason: collision with root package name */
    int f1138b;

    VideoSize() {
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSize)) {
            return false;
        }
        VideoSize videoSize = (VideoSize) obj;
        return this.f1137a == videoSize.f1137a && this.f1138b == videoSize.f1138b;
    }

    public int hashCode() {
        int i7 = this.f1138b;
        int i8 = this.f1137a;
        return i7 ^ ((i8 >>> 16) | (i8 << 16));
    }

    public String toString() {
        return this.f1137a + "x" + this.f1138b;
    }
}
