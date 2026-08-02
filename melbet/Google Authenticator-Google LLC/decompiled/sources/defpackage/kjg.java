package defpackage;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kjg extends OutputStream {
    public final List a = new ArrayList();
    private ikk b;

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (this.b == null) {
            ikk k = ixb.k(Math.max(4096, i2));
            this.b = k;
            this.a.add(k);
        }
        while (i2 > 0) {
            int min = Math.min(i2, this.b.y());
            ikk ikkVar = this.b;
            if (min == 0) {
                int x = ikkVar.x();
                ikk k2 = ixb.k(Math.max(i2, x + x));
                this.b = k2;
                this.a.add(k2);
            } else {
                ikkVar.z(bArr, i, min);
                i += min;
                i2 -= min;
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        byte b = (byte) i;
        ikk ikkVar = this.b;
        if (ikkVar != null && ikkVar.y() > 0) {
            ((ByteBuffer) this.b.a).put(b);
        } else {
            write(new byte[]{b}, 0, 1);
        }
    }
}
