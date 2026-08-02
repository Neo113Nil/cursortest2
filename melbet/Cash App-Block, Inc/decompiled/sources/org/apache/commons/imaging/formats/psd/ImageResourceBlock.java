package org.apache.commons.imaging.formats.psd;

import java.nio.charset.StandardCharsets;
import org.apache.commons.imaging.internal.Debug;

/* loaded from: classes9.dex */
class ImageResourceBlock {
    final byte[] data;
    final int id;
    final byte[] nameData;

    public ImageResourceBlock(int i, byte[] bArr, byte[] bArr2) {
        this.id = i;
        this.nameData = bArr;
        this.data = bArr2;
    }

    public String getName() {
        Debug.debug("getName: " + this.nameData.length);
        return new String(this.nameData, StandardCharsets.ISO_8859_1);
    }
}
