package org.apache.commons.imaging.formats.gif;

import java.util.List;

/* loaded from: classes9.dex */
class GifImageContents {
    final List<GifBlock> blocks;
    final GifHeaderInfo gifHeaderInfo;
    final byte[] globalColorTable;

    public GifImageContents(GifHeaderInfo gifHeaderInfo, byte[] bArr, List<GifBlock> list) {
        this.gifHeaderInfo = gifHeaderInfo;
        this.globalColorTable = bArr;
        this.blocks = list;
    }
}
