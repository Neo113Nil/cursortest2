package com.squareup.cash.taptopay.backend.api;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class TagCommunicationData {
    public final byte[] data;
    public final String errorMsg;

    public TagCommunicationData(byte[] bArr, String str) {
        this.data = bArr;
        this.errorMsg = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!TagCommunicationData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return Arrays.equals(this.data, ((TagCommunicationData) obj).data);
    }

    public final int hashCode() {
        byte[] bArr = this.data;
        if (bArr != null) {
            return Arrays.hashCode(bArr);
        }
        return 0;
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("TagCommunicationData(data=", Arrays.toString(this.data), ", errorMsg=", this.errorMsg, ")");
    }
}
