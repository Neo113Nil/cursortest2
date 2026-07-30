package F1;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.C3112dq;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import s1.j;
import u1.x;

/* loaded from: classes.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f993a;

    /* renamed from: b, reason: collision with root package name */
    public final a f994b;

    /* renamed from: c, reason: collision with root package name */
    public final C3112dq f995c;

    public h(ArrayList arrayList, a aVar, C3112dq c3112dq) {
        this.f993a = arrayList;
        this.f994b = aVar;
        this.f995c = c3112dq;
    }

    @Override // s1.j
    public final x a(Object obj, int i, int i4, s1.h hVar) {
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
        } catch (IOException e6) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e6);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.f994b.a(ByteBuffer.wrap(bArr), i, i4, hVar);
    }

    @Override // s1.j
    public final boolean b(Object obj, s1.h hVar) {
        return !((Boolean) hVar.c(g.f992b)).booleanValue() && S0.f.k(this.f993a, (InputStream) obj, this.f995c) == ImageHeaderParser$ImageType.GIF;
    }
}
