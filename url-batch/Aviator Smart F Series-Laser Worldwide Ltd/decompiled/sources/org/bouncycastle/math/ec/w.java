package org.bouncycastle.math.ec;

/* loaded from: classes5.dex */
public class w implements q {
    volatile int promotionCountdown = 4;
    protected int confWidth = -1;
    protected i[] preComp = null;
    protected i[] preCompNeg = null;
    protected i twice = null;
    protected int width = -1;

    int decrementPromotionCountdown() {
        int i8 = this.promotionCountdown;
        if (i8 <= 0) {
            return i8;
        }
        int i9 = i8 - 1;
        this.promotionCountdown = i9;
        return i9;
    }

    public int getConfWidth() {
        return this.confWidth;
    }

    public i[] getPreComp() {
        return this.preComp;
    }

    public i[] getPreCompNeg() {
        return this.preCompNeg;
    }

    int getPromotionCountdown() {
        return this.promotionCountdown;
    }

    public i getTwice() {
        return this.twice;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isPromoted() {
        return this.promotionCountdown <= 0;
    }

    public void setConfWidth(int i8) {
        this.confWidth = i8;
    }

    public void setPreComp(i[] iVarArr) {
        this.preComp = iVarArr;
    }

    public void setPreCompNeg(i[] iVarArr) {
        this.preCompNeg = iVarArr;
    }

    void setPromotionCountdown(int i8) {
        this.promotionCountdown = i8;
    }

    public void setTwice(i iVar) {
        this.twice = iVar;
    }

    public void setWidth(int i8) {
        this.width = i8;
    }
}
