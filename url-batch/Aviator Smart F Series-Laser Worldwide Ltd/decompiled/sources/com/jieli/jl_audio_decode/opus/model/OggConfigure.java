package com.jieli.jl_audio_decode.opus.model;

/* loaded from: classes4.dex */
public class OggConfigure {
    private int pageFrameCount = 30;
    private int frameLen = 40;

    public int getFrameLen() {
        return this.frameLen;
    }

    public int getPageFrameCount() {
        return this.pageFrameCount;
    }

    public OggConfigure setFrameLen(int i8) {
        if (i8 > 0) {
            this.frameLen = i8;
        }
        return this;
    }

    public OggConfigure setPageFrameCount(int i8) {
        if (i8 > 0) {
            this.pageFrameCount = i8;
        }
        return this;
    }

    public String toString() {
        return "OggConfigure{pageFrameCount=" + this.pageFrameCount + ", frameLen=" + this.frameLen + '}';
    }
}
