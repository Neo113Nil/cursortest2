package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class hx0 {
    public final boolean a;
    public final int b;

    public hx0() {
        this.a = false;
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx0)) {
            return false;
        }
        hx0 hx0Var = (hx0) obj;
        return this.a == hx0Var.a && this.b == hx0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=" + ((Object) hv.a(this.b)) + ')';
    }

    public hx0(int i, boolean z) {
        this.a = z;
        this.b = i;
    }
}
