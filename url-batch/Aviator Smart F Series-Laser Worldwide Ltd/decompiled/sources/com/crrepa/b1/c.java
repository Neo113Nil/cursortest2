package com.crrepa.b1;

import android.graphics.Bitmap;
import com.crrepa.ble.conn.bean.CRPWatchFaceLayoutInfo;
import com.crrepa.ble.util.BleLog;
import com.crrepa.g1.h;
import com.jieli.bmp_convert.BmpConvert;
import com.jieli.bmp_convert.ConvertParam;
import com.jieli.bmp_convert.ConvertResult;
import com.jieli.bmp_convert.OnConvertListener;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class c extends com.crrepa.l0.b {

    /* renamed from: r, reason: collision with root package name */
    private static final String f10854r = ".jpg";

    /* renamed from: s, reason: collision with root package name */
    private static final String f10855s = ".bin";

    /* renamed from: t, reason: collision with root package name */
    private static final String f10856t = "raw";

    /* renamed from: u, reason: collision with root package name */
    private static final String f10857u = "dest";

    /* renamed from: n, reason: collision with root package name */
    private final BmpConvert f10858n = new BmpConvert();

    /* renamed from: o, reason: collision with root package name */
    private final OnConvertListener f10859o = new a(this);

    /* renamed from: p, reason: collision with root package name */
    private int f10860p = 0;

    /* renamed from: q, reason: collision with root package name */
    protected List<String> f10861q = new ArrayList();

    private static class a implements OnConvertListener {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<c> f10862a;

        public a(c cVar) {
            this.f10862a = new WeakReference<>(cVar);
        }

        private void a(boolean z7, String str) {
            c cVar = this.f10862a.get();
            if (cVar == null) {
                return;
            }
            if (!z7) {
                cVar.f(1);
            } else {
                cVar.f10861q.add(str);
                cVar.o();
            }
        }

        @Override // com.jieli.bmp_convert.OnConvertListener
        public void onStart(String str) {
            BleLog.d("onStart: " + str);
        }

        @Override // com.jieli.bmp_convert.OnConvertListener
        public void onStop(ConvertResult convertResult, String str) {
            BleLog.d("onStop: " + convertResult + "output = " + str);
            a(convertResult.isConvertSuccess(), str);
        }

        @Override // com.jieli.bmp_convert.OnConvertListener
        public void onStop(boolean z7, String str) {
            BleLog.d("onStop: " + z7 + "output = " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        Bitmap[] bitmapArr = this.f13162i;
        if (bitmapArr == null || bitmapArr.length <= this.f10860p) {
            super.l();
            return;
        }
        File e8 = e();
        File file = new File(e8, "raw_" + this.f10860p + f10854r);
        if (file.exists()) {
            file.delete();
        }
        com.crrepa.g1.a.a(this.f13162i[this.f10860p], file);
        File file2 = new File(e8, "dest_" + this.f10860p + f10855s);
        if (file2.exists()) {
            file2.delete();
        }
        int p8 = p();
        BleLog.d("compressionType = " + p8);
        this.f10858n.bitmapConvert(p8, file.getPath(), file2.getPath(), new ConvertParam().setFormat(1), this.f10859o);
        this.f10860p = this.f10860p + 1;
    }

    @Override // com.crrepa.l0.b
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
        bArr[0] = (byte) CRPWatchFaceLayoutInfo.CompressionType.JIELI.value();
        bArr[1] = -1;
        bArr[2] = -1;
        bArr[3] = -1;
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

    @Override // com.crrepa.l0.b
    public void j() {
        super.j();
        this.f10861q.clear();
    }

    @Override // com.crrepa.l0.b
    public void l() {
        this.f10860p = 0;
        this.f10861q.clear();
        o();
    }

    protected int p() {
        return 3;
    }
}
