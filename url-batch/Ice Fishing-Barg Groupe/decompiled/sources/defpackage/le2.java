package defpackage;

import android.view.textclassifier.TextClassification;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class le2 {
    public final CharSequence PxuCJdSBwIXG;
    public final TextClassification TSizfFm2Yiuu;
    public final long lS5Rgt96tfkO;

    public le2(CharSequence charSequence, long j, TextClassification textClassification) {
        this.PxuCJdSBwIXG = charSequence;
        this.lS5Rgt96tfkO = j;
        this.TSizfFm2Yiuu = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le2)) {
            return false;
        }
        le2 le2Var = (le2) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, le2Var.PxuCJdSBwIXG) && vi2.lS5Rgt96tfkO(this.lS5Rgt96tfkO, le2Var.lS5Rgt96tfkO) && cs0.wdg6QnbFHrFF(this.TSizfFm2Yiuu, le2Var.TSizfFm2Yiuu);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.PxuCJdSBwIXG.hashCode() * 31;
        ui2 ui2Var = vi2.Companion;
        int TSizfFm2Yiuu = o0.TSizfFm2Yiuu(hashCode2, 31, this.lS5Rgt96tfkO);
        hashCode = this.TSizfFm2Yiuu.hashCode();
        return hashCode + TSizfFm2Yiuu;
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.PxuCJdSBwIXG) + ", selection=" + ((Object) vi2.rtx2ld2ELZv4(this.lS5Rgt96tfkO)) + ", textClassification=" + this.TSizfFm2Yiuu + ')';
    }
}
