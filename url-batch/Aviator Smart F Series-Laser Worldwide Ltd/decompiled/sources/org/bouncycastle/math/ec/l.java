package org.bouncycastle.math.ec;

/* loaded from: classes5.dex */
public class l implements q {
    protected i offset = null;
    protected g lookupTable = null;
    protected int width = -1;

    public g getLookupTable() {
        return this.lookupTable;
    }

    public i getOffset() {
        return this.offset;
    }

    public int getWidth() {
        return this.width;
    }

    public void setLookupTable(g gVar) {
        this.lookupTable = gVar;
    }

    public void setOffset(i iVar) {
        this.offset = iVar;
    }

    public void setWidth(int i8) {
        this.width = i8;
    }
}
