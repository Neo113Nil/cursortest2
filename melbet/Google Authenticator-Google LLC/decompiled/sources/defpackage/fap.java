package defpackage;

import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fap extends fbk {
    public static final /* synthetic */ int a = 0;
    private final List b;

    public fap(InputStream inputStream, List list) {
        super(inputStream);
        this.b = list;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            try {
                ((fbu) it.next()).close();
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = this.in.read();
        if (read != -1) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((fbu) it.next()).a();
            }
        }
        return read;
    }

    @Override // defpackage.fbk, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        int read = this.in.read(bArr);
        if (read != -1) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((fbu) it.next()).a();
            }
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((fbu) it.next()).a();
            }
        }
        return read;
    }
}
