package com.sifli.ezipmy;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import com.crrepa.v1.a;
import com.crrepa.v1.d;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class sifliEzipUtil {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16472a = "2.4.1";

    /* renamed from: b, reason: collision with root package name */
    private static final String f16473b = "ezip-util";

    /* renamed from: c, reason: collision with root package name */
    private static final int f16474c = 1000000;

    static {
        System.loadLibrary("ezipmy");
    }

    private static List<Bitmap> a(String str, int i8, int i9, int i10, int i11, int i12) {
        ArrayList arrayList = new ArrayList();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(str);
        double d8 = 1000000 / i8;
        for (double d9 = i9 * 1000000; d9 < i10 * 1000000; d9 += d8) {
            Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime((long) d9, 3);
            if (frameAtTime != null) {
                arrayList.add(Bitmap.createScaledBitmap(frameAtTime, i11 > 0 ? i11 : frameAtTime.getWidth(), i12 > 0 ? i12 : frameAtTime.getHeight(), true));
            }
        }
        return arrayList;
    }

    private static native byte[] png2EzipNDK(byte[] bArr, long j8, String str, int i8, int i9);

    private static native byte[] png2EzipSequenceWithTypeNDK(byte[] bArr, int[] iArr, String str, int i8, int i9, int i10);

    private static native byte[] png2EzipWithTypeNDK(byte[] bArr, long j8, String str, int i8, int i9, int i10);

    private static void a(String str, String str2) {
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str2));
            try {
                if (decodeFile.compress(Bitmap.CompressFormat.PNG, 100, bufferedOutputStream)) {
                    bufferedOutputStream.flush();
                }
                bufferedOutputStream.close();
            } finally {
            }
        } catch (IOException e8) {
            e8.printStackTrace();
        }
    }

    private static void a(String str, String str2, int i8, int i9, int i10, int i11, int i12) {
        List<Bitmap> a8 = a(str, i8, i9, i10, i11, i12);
        d dVar = new d();
        dVar.c(a8.get(0));
        dVar.a(str2);
        for (int i13 = 1; i13 < a8.size(); i13++) {
            dVar.a(a8.get(i13));
        }
        dVar.b();
    }

    public static synchronized byte[] a(ArrayList<byte[]> arrayList, String str, int i8, int i9, int i10) {
        synchronized (sifliEzipUtil.class) {
            if (arrayList == null) {
                return null;
            }
            if (!a.a(arrayList)) {
                Log.e(f16473b, "pngToEzipSequence only support PNG");
                return null;
            }
            int size = arrayList.size();
            Log.d(f16473b, "2.4.1 color " + i8 + ", bin " + i9 + ", board " + i10 + ",pic number " + size);
            int[] iArr = new int[size];
            Iterator<byte[]> it = arrayList.iterator();
            int i11 = 0;
            int i12 = 0;
            while (it.hasNext()) {
                byte[] next = it.next();
                iArr[i12] = next.length;
                i11 += next.length;
                i12++;
            }
            byte[] bArr = new byte[i11];
            Iterator<byte[]> it2 = arrayList.iterator();
            int i13 = 0;
            while (it2.hasNext()) {
                byte[] next2 = it2.next();
                System.arraycopy(next2, 0, bArr, i13, next2.length);
                i13 += next2.length;
            }
            return png2EzipSequenceWithTypeNDK(bArr, iArr, str, i8, i9, i10);
        }
    }

    private static byte[] a(byte[] bArr, String str, int i8, int i9) {
        return png2EzipNDK(bArr, bArr.length, str, i8, i9);
    }

    public static synchronized byte[] a(byte[] bArr, String str, int i8, int i9, int i10) {
        synchronized (sifliEzipUtil.class) {
            Log.d(f16473b, "2.4.1, color " + i8 + ", bin " + i9 + ", board " + i10);
            boolean b8 = a.b(bArr);
            boolean a8 = a.a(bArr);
            if (b8 || a8) {
                return png2EzipWithTypeNDK(bArr, bArr.length, str, i8, i9, i10);
            }
            Log.e(f16473b, "pngToEzip only support PNG or GIF");
            return null;
        }
    }
}
