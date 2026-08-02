package defpackage;

import com.google.android.odml.image.ImageProperties;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class frk extends ImageProperties.Builder {
    private int a;
    private int b;
    private byte c;

    final ImageProperties build() {
        if (this.c == 3) {
            return new frm(this.a, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" imageFormat");
        }
        if ((this.c & 2) == 0) {
            sb.append(" storageType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    final ImageProperties.Builder setImageFormat(int i) {
        this.a = i;
        this.c = (byte) (this.c | 1);
        return this;
    }

    final ImageProperties.Builder setStorageType(int i) {
        this.b = i;
        this.c = (byte) (this.c | 2);
        return this;
    }
}
