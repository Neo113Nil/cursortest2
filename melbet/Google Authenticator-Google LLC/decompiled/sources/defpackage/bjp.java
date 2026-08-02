package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bjp implements bbn {
    private final List a;
    private final bbn b;
    private final bek c;

    public bjp(List list, bbn bbnVar, bek bekVar) {
        this.a = list;
        this.b = bbnVar;
        this.c = bekVar;
    }

    @Override // defpackage.bbn
    public final /* bridge */ /* synthetic */ bdv a(Object obj, int i, int i2, bbl bblVar) {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.b.a(ByteBuffer.wrap(bArr), i, i2, bblVar);
    }

    @Override // defpackage.bbn
    public final /* bridge */ /* synthetic */ boolean b(Object obj, bbl bblVar) {
        return !((Boolean) bblVar.b(bjo.b)).booleanValue() && afn.q(this.a, (InputStream) obj, this.c) == ImageHeaderParser$ImageType.GIF;
    }
}
