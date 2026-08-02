package io.opentelemetry.api.internal;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class InternalAttributeKeyImpl {
    public final int hashCode;
    public final String key;

    public InternalAttributeKeyImpl(String str) {
        this.key = str;
        this.hashCode = str.hashCode() ^ ((CameraSelector$$ExternalSyntheticOutline0.ordinal(1) ^ 1000003) * 1000003);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof InternalAttributeKeyImpl)) {
                return false;
            }
            InternalAttributeKeyImpl internalAttributeKeyImpl = (InternalAttributeKeyImpl) obj;
            if (!CameraSelector$$ExternalSyntheticOutline0.equals(1, 1) || !this.key.equals(internalAttributeKeyImpl.key)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.hashCode;
    }

    public final String toString() {
        return this.key;
    }
}
