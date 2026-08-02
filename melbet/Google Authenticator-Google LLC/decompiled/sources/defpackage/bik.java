package defpackage;

import android.graphics.ImageDecoder;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bik implements bbn {
    private final bhd a = new bhd();
    private final List b;
    private final boolean c;
    private final boolean d;
    private final bek e;

    public bik(List list, boolean z, bek bekVar, boolean z2) {
        this.b = list;
        this.c = z;
        this.e = bekVar;
        this.d = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0033, code lost:
    
        r0.c(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    @Override // defpackage.bbn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ bdv a(Object obj, int i, int i2, bbl bblVar) {
        ByteBuffer a;
        ImageDecoder.Source createSource;
        byte[] bArr;
        boolean z;
        InputStream inputStream = (InputStream) obj;
        if (this.d) {
            bek bekVar = this.e;
            boolean z2 = this.c;
            int i3 = blv.a;
            ArrayList<byte[]> arrayList = new ArrayList();
            int i4 = 0;
            while (true) {
                bArr = null;
                try {
                    byte[] bArr2 = (byte[]) bekVar.a(16384, byte[].class);
                    int i5 = 0;
                    while (i5 < 16384) {
                        try {
                            int read = inputStream.read(bArr2, i5, 16384 - i5);
                            if (read == -1) {
                                break;
                            }
                            i5 += read;
                        } catch (Throwable th) {
                            th = th;
                            z = false;
                            bArr = bArr2;
                            if (!z) {
                            }
                            throw th;
                        }
                    }
                    if (i5 == 0) {
                        break;
                    }
                    arrayList.add(bArr2);
                    i4 += i5;
                    if (i5 < 16384) {
                        break;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                }
            }
            ByteBuffer allocate = z2 ? ByteBuffer.allocate(i4) : ByteBuffer.allocateDirect(i4);
            for (byte[] bArr3 : arrayList) {
                int min = Math.min(i4, 16384);
                allocate.put(bArr3, 0, min);
                i4 -= min;
                bekVar.c(bArr3);
            }
            arrayList.clear();
            try {
                a = blv.b(allocate);
            } catch (Throwable th3) {
                th = th3;
                z = true;
                if (!z) {
                    if (bArr != null) {
                        bekVar.c(bArr);
                    }
                    int size = arrayList.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        bekVar.c((byte[]) arrayList.get(i6));
                    }
                }
                throw th;
            }
        } else {
            a = blv.a(inputStream, this.c);
        }
        bhd bhdVar = this.a;
        createSource = ImageDecoder.createSource(a);
        return bhdVar.c(createSource, i, i2, bblVar);
    }

    @Override // defpackage.bbn
    public final /* bridge */ /* synthetic */ boolean b(Object obj, bbl bblVar) {
        InputStream inputStream = (InputStream) obj;
        if (this.d) {
            return afn.q(this.b, inputStream, this.e) != ImageHeaderParser$ImageType.UNKNOWN;
        }
        return true;
    }
}
