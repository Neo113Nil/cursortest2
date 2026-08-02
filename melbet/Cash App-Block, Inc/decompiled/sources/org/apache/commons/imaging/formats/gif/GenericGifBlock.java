package org.apache.commons.imaging.formats.gif;

import java.io.ByteArrayOutputStream;
import java.util.List;

/* loaded from: classes9.dex */
class GenericGifBlock extends GifBlock {
    final List<byte[]> subblocks;

    public GenericGifBlock(int i, List<byte[]> list) {
        super(i);
        this.subblocks = list;
    }

    public byte[] appendSubBlocks(boolean z) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i < this.subblocks.size(); i++) {
            byte[] bArr = this.subblocks.get(i);
            if (z && i > 0) {
                byteArrayOutputStream.write(bArr.length);
            }
            byteArrayOutputStream.write(bArr);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] appendSubBlocks() {
        return appendSubBlocks(false);
    }
}
