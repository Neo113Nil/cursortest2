package defpackage;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class faq extends fbl {
    public static final /* synthetic */ int a = 0;
    private final List b;

    public faq(OutputStream outputStream, List list) {
        super(outputStream);
        this.b = list;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            try {
                ((fbv) it.next()).close();
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // defpackage.fbl, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        this.out.write(bArr);
        for (fbv fbvVar : this.b) {
            int length = bArr.length;
            fbvVar.a();
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        this.out.write(i);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((fbv) it.next()).a();
        }
    }

    @Override // defpackage.fbl, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((fbv) it.next()).a();
        }
    }
}
