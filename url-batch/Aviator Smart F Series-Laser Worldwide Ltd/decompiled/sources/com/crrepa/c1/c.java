package com.crrepa.c1;

import android.graphics.Bitmap;
import com.crrepa.ble.conn.bean.CRPWatchFaceLayoutInfo;
import com.crrepa.f.l;
import com.crrepa.g1.h;
import java.io.File;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class c extends com.crrepa.b1.c {

    /* renamed from: v, reason: collision with root package name */
    private final CRPWatchFaceLayoutInfo.CompressionType f12335v;

    /* renamed from: w, reason: collision with root package name */
    private final boolean f12336w;

    public c(CRPWatchFaceLayoutInfo.CompressionType compressionType, boolean z7) {
        this.f12335v = compressionType;
        this.f12336w = z7;
    }

    @Override // com.crrepa.l0.b
    public byte[] a(boolean z7) {
        return l.a(z7, this.f12336w);
    }

    @Override // com.crrepa.l0.b
    protected byte[] b(int i8) {
        return l.a(i8, this.f12336w);
    }

    @Override // com.crrepa.b1.c
    protected int p() {
        return this.f12335v == CRPWatchFaceLayoutInfo.CompressionType.JIELI_707 ? 7 : 3;
    }

    @Override // com.crrepa.b1.c, com.crrepa.l0.b
    public byte[] b(boolean z7, Bitmap[] bitmapArr) {
        byte[] a8;
        Iterator<String> it = this.f10861q.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            File file = new File(it.next());
            if (file.exists()) {
                i8 = (int) (i8 + file.length());
            }
        }
        int i9 = 8;
        byte[] bArr = new byte[i8 + 8];
        bArr[0] = 5;
        if (this.f12335v == CRPWatchFaceLayoutInfo.CompressionType.JIELI_707) {
            bArr[1] = 2;
            bArr[2] = 0;
            bArr[3] = 0;
        } else {
            bArr[1] = -1;
            bArr[2] = -1;
            bArr[3] = -1;
        }
        for (int i10 = 0; i10 < this.f10861q.size(); i10++) {
            String str = this.f10861q.get(i10);
            File file2 = new File(str);
            if (i10 == 0) {
                byte[] b8 = com.crrepa.g1.c.b(file2.length());
                System.arraycopy(b8, 0, bArr, 4, b8.length);
            }
            if (file2.exists() && (a8 = h.a(str)) != null) {
                System.arraycopy(a8, 0, bArr, i9, a8.length);
                i9 += a8.length;
            }
        }
        return bArr;
    }
}
