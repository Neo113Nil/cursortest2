package com.crrepa.e1;

import android.graphics.Bitmap;
import com.crrepa.ble.conn.bean.CRPPhotoWatchFaceInfo;
import com.crrepa.ble.util.BleLog;
import com.crrepa.f.l;
import com.crrepa.g1.h;
import com.crrepa.l0.e;
import com.jieli.bmp_convert.BmpConvert;
import com.jieli.bmp_convert.ConvertParam;
import com.jieli.bmp_convert.ConvertResult;
import com.jieli.bmp_convert.OnConvertListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class a extends com.crrepa.l0.b {
    private static final String A = "AI CODE:";
    private static final String B = ".bin";
    private static final String C = "dest_bg";
    private static final String D = "dest_hand";
    private static final String E = "707_photo_watch_face.bin";

    /* renamed from: z, reason: collision with root package name */
    private static final String f12421z = "UBG CODE";

    /* renamed from: n, reason: collision with root package name */
    private final BmpConvert f12422n;

    /* renamed from: o, reason: collision with root package name */
    private final OnConvertListener f12423o;

    /* renamed from: p, reason: collision with root package name */
    private final List<String> f12424p;

    /* renamed from: q, reason: collision with root package name */
    private final List<File> f12425q;

    /* renamed from: r, reason: collision with root package name */
    private final List<File> f12426r;

    /* renamed from: s, reason: collision with root package name */
    private File f12427s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f12428t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f12429u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f12430v;

    /* renamed from: w, reason: collision with root package name */
    private final List<Integer> f12431w;

    /* renamed from: x, reason: collision with root package name */
    private CRPPhotoWatchFaceInfo f12432x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f12433y;

    private static class b implements OnConvertListener {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<a> f12434a;

        public b(a aVar) {
            this.f12434a = new WeakReference<>(aVar);
        }

        private void a(boolean z7, String str) {
            a aVar = this.f12434a.get();
            if (aVar == null) {
                BleLog.e("onConvertComplete: initator is null");
            } else if (!z7) {
                aVar.f(1);
            } else {
                aVar.f12424p.add(str);
                aVar.o();
            }
        }

        @Override // com.jieli.bmp_convert.OnConvertListener
        public void onStart(String str) {
            BleLog.d("onStart: " + str);
        }

        @Override // com.jieli.bmp_convert.OnConvertListener
        public void onStop(ConvertResult convertResult, String str) {
            BleLog.d("onStop: " + convertResult + ", output = " + str);
            a(convertResult.isConvertSuccess(), str);
        }

        @Override // com.jieli.bmp_convert.OnConvertListener
        public void onStop(boolean z7, String str) {
            BleLog.d("onStop: " + z7 + "output = " + str);
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private static final a f12435a = new a();

        private c() {
        }
    }

    private a() {
        this.f12422n = new BmpConvert();
        this.f12423o = new b(this);
        this.f12424p = new ArrayList();
        this.f12425q = new ArrayList();
        this.f12426r = new ArrayList();
        this.f12431w = new ArrayList();
    }

    private File a(String str, String str2) {
        return new File(e(), str2 + "_" + str + B);
    }

    private int k(int i8) {
        int min = Math.min(i8, this.f12431w.size() - 1);
        int i9 = 0;
        for (int i10 = 0; i10 < min; i10++) {
            i9 += this.f12431w.get(i10).intValue();
        }
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        File file;
        String str;
        int i8;
        if (this.f12425q.isEmpty()) {
            if (this.f12426r.isEmpty()) {
                file = null;
                str = "";
            } else {
                file = this.f12426r.remove(0);
                str = D;
            }
            i8 = 8;
        } else {
            file = this.f12425q.remove(0);
            str = C;
            i8 = 7;
        }
        if (file == null) {
            q();
            return;
        }
        File a8 = a(file.getName(), str);
        if (a8.exists()) {
            a8.delete();
        }
        this.f12422n.bitmapConvert(i8, file.getPath(), a8.getPath(), new ConvertParam().setFormat(1), this.f12423o);
    }

    public static a p() {
        return c.f12435a;
    }

    private void q() {
        int i8;
        BleLog.e("mergeFiles: pathList = " + this.f12424p.size());
        if (this.f12424p.isEmpty()) {
            f(1);
            return;
        }
        File file = new File(e(), E);
        this.f12427s = file;
        if (file.exists()) {
            this.f12427s.delete();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.f12427s);
            for (String str : this.f12424p) {
                if (str.contains(C)) {
                    fileOutputStream.write(new byte[]{5, 2, 0, 0});
                } else {
                    fileOutputStream.write(new byte[]{1, 2, 0, 0});
                }
                File file2 = new File(str);
                int length = (int) file2.length();
                fileOutputStream.write(com.crrepa.g1.c.b(length));
                FileInputStream fileInputStream = new FileInputStream(file2);
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    } else {
                        fileOutputStream.write(bArr, 0, read);
                    }
                }
                if (length % 4 != 0) {
                    int i9 = length % 4;
                    byte[] bArr2 = new byte[4 - i9];
                    Arrays.fill(bArr2, (byte) -1);
                    i8 = 12 - i9;
                    fileOutputStream.write(bArr2);
                } else {
                    i8 = 8;
                }
                this.f12431w.add(Integer.valueOf(length + i8));
            }
            super.l();
        } catch (Exception e8) {
            e8.printStackTrace();
            f(1);
        }
    }

    @Override // com.crrepa.l0.b
    protected byte[] b(int i8) {
        return this.f12433y ? l.a(i8, false) : super.b(i8);
    }

    public void a(CRPPhotoWatchFaceInfo cRPPhotoWatchFaceInfo, boolean z7) {
        BleLog.d("start: info = " + cRPPhotoWatchFaceInfo);
        if (cRPPhotoWatchFaceInfo == null || cRPPhotoWatchFaceInfo.getPhotoList() == null || cRPPhotoWatchFaceInfo.getPhotoList().isEmpty() || cRPPhotoWatchFaceInfo.getThumBitmap() == null) {
            BleLog.e("photoList is null or empty");
            return;
        }
        this.f12432x = cRPPhotoWatchFaceInfo;
        this.f12433y = z7;
        this.f12424p.clear();
        this.f12431w.clear();
        this.f12425q.clear();
        this.f12426r.clear();
        Bitmap thumBitmap = cRPPhotoWatchFaceInfo.getThumBitmap();
        File file = new File(e(), "thumb.png");
        com.crrepa.g1.a.a(thumBitmap, file);
        this.f12425q.add(file);
        this.f12425q.addAll(cRPPhotoWatchFaceInfo.getPhotoList());
        List<CRPPhotoWatchFaceInfo.Pointer> pointerList = cRPPhotoWatchFaceInfo.getPointerList();
        boolean z8 = (pointerList == null || pointerList.isEmpty()) ? false : true;
        this.f12428t = z8;
        if (z8) {
            for (CRPPhotoWatchFaceInfo.Pointer pointer : pointerList) {
                if (pointer.getType() == CRPPhotoWatchFaceInfo.PointerType.SECOND) {
                    this.f12429u = true;
                }
                if (pointer.getType() == CRPPhotoWatchFaceInfo.PointerType.SCALE) {
                    this.f12430v = true;
                }
                this.f12426r.add(pointer.getFile());
            }
        }
        o();
    }

    @Override // com.crrepa.l0.b
    public byte[] b(boolean z7, Bitmap[] bitmapArr) {
        Charset charset;
        String str;
        int i8;
        int length = (int) (this.f12427s.length() + 258);
        byte[] bArr = new byte[length];
        if (this.f12433y) {
            charset = StandardCharsets.UTF_8;
            str = A;
        } else {
            charset = StandardCharsets.UTF_8;
            str = f12421z;
        }
        byte[] bytes = str.getBytes(charset);
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        byte[] b8 = com.crrepa.g1.c.b(this.f12427s.length() + 244);
        System.arraycopy(b8, 0, bArr, bytes.length, b8.length);
        List<File> photoList = this.f12432x.getPhotoList();
        byte[] bArr2 = new byte[244];
        bArr2[0] = (byte) photoList.size();
        bArr2[1] = this.f12428t;
        bArr2[2] = this.f12429u;
        int i9 = 3;
        bArr2[3] = this.f12430v;
        byte[] a8 = com.crrepa.g1.c.a(this.f12432x.getX());
        System.arraycopy(a8, 0, bArr2, 4, a8.length);
        byte[] a9 = com.crrepa.g1.c.a(this.f12432x.getY());
        System.arraycopy(a9, 0, bArr2, 6, a9.length);
        int i10 = 8;
        for (int i11 = 0; i11 < photoList.size(); i11++) {
            String name = photoList.get(i11).getName();
            String substring = name.substring(0, name.lastIndexOf("."));
            BleLog.d("photoName = " + substring);
            byte[] b9 = com.crrepa.g1.c.b((long) Integer.parseInt(substring));
            System.arraycopy(b9, 0, bArr2, i10, b9.length);
            i10 += b9.length;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < photoList.size(); i13++) {
            i12 += this.f12431w.get(i13).intValue();
            byte[] b10 = com.crrepa.g1.c.b(i12);
            System.arraycopy(b10, 0, bArr2, i10, b10.length);
            i10 += b10.length;
        }
        if (this.f12428t) {
            byte[] b11 = com.crrepa.g1.c.b(this.f12432x.getId());
            System.arraycopy(b11, 0, bArr2, i10, b11.length);
            int length2 = i10 + b11.length;
            List<CRPPhotoWatchFaceInfo.Pointer> pointerList = this.f12432x.getPointerList();
            int size = this.f12431w.size() - pointerList.size();
            byte[] b12 = com.crrepa.g1.c.b(k(size));
            System.arraycopy(b12, 0, bArr2, length2, b12.length);
            int length3 = length2 + b12.length;
            byte[] b13 = com.crrepa.g1.c.b(k(size + 1));
            System.arraycopy(b13, 0, bArr2, length3, b13.length);
            int length4 = length3 + b13.length;
            if (this.f12429u) {
                i8 = k(size + 2);
            } else {
                i9 = 2;
                i8 = 0;
            }
            byte[] b14 = com.crrepa.g1.c.b(i8);
            System.arraycopy(b14, 0, bArr2, length4, b14.length);
            int length5 = length4 + b14.length;
            byte[] b15 = com.crrepa.g1.c.b(this.f12430v ? k(size + i9) : 0);
            System.arraycopy(b15, 0, bArr2, length5, b15.length);
            int length6 = length5 + b15.length;
            for (CRPPhotoWatchFaceInfo.Pointer pointer : pointerList) {
                if (pointer.getType() != CRPPhotoWatchFaceInfo.PointerType.SCALE) {
                    byte[] a10 = com.crrepa.g1.c.a(pointer.getX());
                    System.arraycopy(a10, 0, bArr2, length6, a10.length);
                    int length7 = length6 + a10.length;
                    byte[] a11 = com.crrepa.g1.c.a(pointer.getY());
                    System.arraycopy(a11, 0, bArr2, length7, a11.length);
                    int length8 = length7 + a11.length;
                    byte[] a12 = com.crrepa.g1.c.a(pointer.getWidth());
                    System.arraycopy(a12, 0, bArr2, length8, a12.length);
                    int length9 = length8 + a12.length;
                    byte[] a13 = com.crrepa.g1.c.a(pointer.getHeight());
                    System.arraycopy(a13, 0, bArr2, length9, a13.length);
                    length6 = length9 + a13.length;
                }
            }
        }
        BleLog.d("desBytes = " + com.crrepa.g1.c.c(bArr2));
        System.arraycopy(bArr2, 0, bArr, bytes.length + b8.length, 244);
        h.a(this.f12427s, bArr, 256);
        int i14 = length + (-2);
        byte[] a14 = e.a(bArr, 12, i14, e.f13178a);
        bArr[i14] = a14[1];
        bArr[length - 1] = a14[0];
        return bArr;
    }

    @Override // com.crrepa.l0.b
    public byte[] a(boolean z7) {
        return this.f12433y ? l.a(z7, false) : super.a(z7);
    }
}
