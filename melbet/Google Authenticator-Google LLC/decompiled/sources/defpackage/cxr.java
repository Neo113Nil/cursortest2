package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cxr extends FileOutputStream implements fbf, fax {
    private final ParcelFileDescriptor a;

    public cxr(ParcelFileDescriptor parcelFileDescriptor) {
        super(parcelFileDescriptor.getFileDescriptor());
        this.a = parcelFileDescriptor;
    }

    @Override // defpackage.fax
    public final FileChannel a() {
        return getChannel();
    }

    @Override // defpackage.fbf
    public final void b() {
        getFD().sync();
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } finally {
            this.a.close();
        }
    }
}
