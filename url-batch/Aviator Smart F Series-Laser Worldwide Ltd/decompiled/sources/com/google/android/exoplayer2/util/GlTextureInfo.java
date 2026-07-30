package com.google.android.exoplayer2.util;

@Deprecated
/* loaded from: classes3.dex */
public final class GlTextureInfo {
    public static final GlTextureInfo UNSET = new GlTextureInfo(-1, -1, -1, -1, -1);
    private final int fboId;
    private final int height;
    private boolean isReleased;
    private final int rboId;
    private final int texId;
    private final int width;

    public GlTextureInfo(int i8, int i9, int i10, int i11, int i12) {
        this.texId = i8;
        this.fboId = i9;
        this.rboId = i10;
        this.width = i11;
        this.height = i12;
    }

    public int getFboId() {
        Assertions.checkState(!this.isReleased);
        return this.fboId;
    }

    public int getHeight() {
        Assertions.checkState(!this.isReleased);
        return this.height;
    }

    public int getRboId() {
        Assertions.checkState(!this.isReleased);
        return this.rboId;
    }

    public int getTexId() {
        Assertions.checkState(!this.isReleased);
        return this.texId;
    }

    public int getWidth() {
        Assertions.checkState(!this.isReleased);
        return this.width;
    }

    public void release() {
        this.isReleased = true;
        int i8 = this.texId;
        if (i8 != -1) {
            GlUtil.deleteTexture(i8);
        }
        int i9 = this.fboId;
        if (i9 != -1) {
            GlUtil.deleteFbo(i9);
        }
        int i10 = this.rboId;
        if (i10 != -1) {
            GlUtil.deleteRbo(i10);
        }
    }
}
