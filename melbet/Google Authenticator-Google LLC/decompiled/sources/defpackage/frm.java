package defpackage;

import com.google.android.odml.image.ImageProperties;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class frm extends frl {
    private volatile transient int c;
    private volatile transient boolean d;

    @Override // defpackage.frl
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frm) || hashCode() != obj.hashCode()) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof ImageProperties)) {
                return false;
            }
            ImageProperties imageProperties = (ImageProperties) obj;
            if (this.a != imageProperties.a() || this.b != imageProperties.b()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.frl
    public final int hashCode() {
        if (!this.d) {
            synchronized (this) {
                if (!this.d) {
                    this.c = ((this.a ^ 1000003) * 1000003) ^ this.b;
                    this.d = true;
                }
            }
        }
        return this.c;
    }
}
