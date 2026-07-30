package com.google.android.exoplayer2.text.ttml;

@Deprecated
/* loaded from: classes3.dex */
final class TtmlRegion {
    public final float height;
    public final String id;
    public final float line;
    public final int lineAnchor;
    public final int lineType;
    public final float position;
    public final float textSize;
    public final int textSizeType;
    public final int verticalType;
    public final float width;

    public TtmlRegion(String str) {
        this(str, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE);
    }

    public TtmlRegion(String str, float f8, float f9, int i8, int i9, float f10, float f11, int i10, float f12, int i11) {
        this.id = str;
        this.position = f8;
        this.line = f9;
        this.lineType = i8;
        this.lineAnchor = i9;
        this.width = f10;
        this.height = f11;
        this.textSizeType = i10;
        this.textSize = f12;
        this.verticalType = i11;
    }
}
