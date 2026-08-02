package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kjj {
    public int b;
    public final kmm f;
    public boolean g;
    public int h;
    public long j;
    public ikk k;
    private final kji l;
    public int a = -1;
    public jxe c = jxc.a;
    public final kjh d = new kjh(this);
    public final ByteBuffer e = ByteBuffer.allocate(5);
    public int i = -1;

    public kjj(kji kjiVar, kmm kmmVar) {
        this.l = kjiVar;
        this.f = kmmVar;
    }

    public final void a(boolean z, boolean z2) {
        ikk ikkVar = this.k;
        this.k = null;
        this.l.v(ikkVar, z, z2);
        this.h = 0;
    }

    public final void b(kjg kjgVar, boolean z) {
        List list = kjgVar.a;
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((ikk) it.next()).x();
        }
        int i2 = this.a;
        if (i2 >= 0 && i > i2) {
            throw new kbt(kbq.h.e(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(i), Integer.valueOf(this.a))), null);
        }
        ByteBuffer byteBuffer = this.e;
        byteBuffer.clear();
        byteBuffer.put(z ? (byte) 1 : (byte) 0).putInt(i);
        ikk k = ixb.k(5);
        k.z(byteBuffer.array(), 0, byteBuffer.position());
        if (i == 0) {
            this.k = k;
            return;
        }
        kji kjiVar = this.l;
        kjiVar.v(k, false, false);
        this.h = 1;
        for (int i3 = 0; i3 < list.size() - 1; i3++) {
            kjiVar.v((ikk) list.get(i3), false, false);
        }
        this.k = (ikk) list.get(list.size() - 1);
        this.j = i;
    }

    public final void c(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            ikk ikkVar = this.k;
            if (ikkVar != null && ikkVar.y() == 0) {
                a(false, false);
            }
            if (this.k == null) {
                hoq.I(this.b > 0, "knownLengthPendingAllocation reached 0");
                ikk k = ixb.k(this.b);
                this.k = k;
                int i3 = this.b;
                this.b = i3 - Math.min(i3, k.y());
            }
            int min = Math.min(i2, this.k.y());
            this.k.z(bArr, i, min);
            i += min;
            i2 -= min;
        }
    }
}
