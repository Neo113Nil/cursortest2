package defpackage;

import com.google.android.odml.image.ImageProperties;

/* compiled from: PG */
/* loaded from: classes2.dex */
class frl extends ImageProperties {
    public final int a;
    public final int b;

    public frl(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.google.android.odml.image.ImageProperties
    public final int a() {
        return this.a;
    }

    @Override // com.google.android.odml.image.ImageProperties
    public final int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImageProperties) {
            ImageProperties imageProperties = (ImageProperties) obj;
            if (this.a == imageProperties.a() && this.b == imageProperties.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.b ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ImageProperties{imageFormat=" + this.a + ", storageType=" + this.b + "}";
    }
}
