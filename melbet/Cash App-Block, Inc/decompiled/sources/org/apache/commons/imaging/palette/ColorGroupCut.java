package org.apache.commons.imaging.palette;

/* loaded from: classes9.dex */
class ColorGroupCut {
    public final ColorGroup less;
    public final int limit;
    public final ColorComponent mode;
    public final ColorGroup more;

    public ColorGroupCut(ColorGroup colorGroup, ColorGroup colorGroup2, ColorComponent colorComponent, int i) {
        this.less = colorGroup;
        this.more = colorGroup2;
        this.mode = colorComponent;
        this.limit = i;
    }

    public ColorGroup getColorGroup(int i) {
        return this.mode.argbComponent(i) <= this.limit ? this.less : this.more;
    }
}
