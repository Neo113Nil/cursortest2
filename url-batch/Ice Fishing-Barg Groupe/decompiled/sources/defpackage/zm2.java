package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class zm2 {
    public final pb0 PxuCJdSBwIXG;
    public final int TSizfFm2Yiuu;
    public final int Y1f8riQaR6yg;
    public final Object e9gEMXR7LXtO;
    public final xc0 lS5Rgt96tfkO;

    public zm2(pb0 pb0Var, xc0 xc0Var, int i, int i2, Object obj) {
        this.PxuCJdSBwIXG = pb0Var;
        this.lS5Rgt96tfkO = xc0Var;
        this.TSizfFm2Yiuu = i;
        this.Y1f8riQaR6yg = i2;
        this.e9gEMXR7LXtO = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zm2)) {
            return false;
        }
        zm2 zm2Var = (zm2) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, zm2Var.PxuCJdSBwIXG) && cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, zm2Var.lS5Rgt96tfkO) && this.TSizfFm2Yiuu == zm2Var.TSizfFm2Yiuu && this.Y1f8riQaR6yg == zm2Var.Y1f8riQaR6yg && cs0.wdg6QnbFHrFF(this.e9gEMXR7LXtO, zm2Var.e9gEMXR7LXtO);
    }

    public final int hashCode() {
        pb0 pb0Var = this.PxuCJdSBwIXG;
        int lS5Rgt96tfkO = o0.lS5Rgt96tfkO(this.Y1f8riQaR6yg, o0.lS5Rgt96tfkO(this.TSizfFm2Yiuu, (((pb0Var == null ? 0 : pb0Var.hashCode()) * 31) + this.lS5Rgt96tfkO.rtx2ld2ELZv4) * 31, 31), 31);
        Object obj = this.e9gEMXR7LXtO;
        return lS5Rgt96tfkO + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.PxuCJdSBwIXG);
        sb.append(", fontWeight=");
        sb.append(this.lS5Rgt96tfkO);
        sb.append(", fontStyle=");
        String str = "Invalid";
        int i = this.TSizfFm2Yiuu;
        sb.append((Object) (i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i2 = this.Y1f8riQaR6yg;
        if (i2 == 0) {
            str = "None";
        } else if (i2 == 1) {
            str = "Weight";
        } else if (i2 == 2) {
            str = "Style";
        } else if (i2 == 65535) {
            str = "All";
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.e9gEMXR7LXtO);
        sb.append(')');
        return sb.toString();
    }
}
