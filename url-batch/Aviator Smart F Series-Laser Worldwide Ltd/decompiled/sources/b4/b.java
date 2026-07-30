package b4;

import android.graphics.Bitmap;
import com.crrepa.ble.util.BleLog;
import com.crrepa.g1.n;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final int f287a = 255;

    private b() {
    }

    public static a a(Bitmap bitmap) {
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        BleLog.d("compressionOfBMP: " + width + "  " + height);
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < height; i8++) {
            for (int i9 = 0; i9 < width; i9++) {
                arrayList.add(Integer.valueOf(n.a(bitmap.getPixel(i9, i8))));
            }
        }
        a aVar = new a(arrayList);
        aVar.b(width);
        aVar.a(height);
        return aVar;
    }

    public static a b(Bitmap bitmap) {
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        BleLog.d("compressionOfBMP: " + width + "  " + height);
        ArrayList arrayList = new ArrayList();
        boolean z7 = width % 2 != 0;
        for (int i8 = height - 1; i8 >= 0; i8--) {
            for (int i9 = 0; i9 < width; i9++) {
                arrayList.add(Integer.valueOf(n.a(bitmap.getPixel(i9, i8))));
            }
            if (z7) {
                arrayList.add(0);
            }
        }
        a aVar = new a(arrayList);
        aVar.b(width);
        aVar.a(height);
        return aVar;
    }

    public static c a(Bitmap bitmap, boolean z7) {
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i8 = -1;
        int i9 = 0;
        for (int i10 = 0; i10 < height; i10++) {
            for (int i11 = 0; i11 < width; i11++) {
                int a8 = n.a(bitmap.getPixel(i11, i10));
                arrayList.add(Integer.valueOf(a8));
                if (i11 == 0 && i10 == 0) {
                    i9++;
                } else if (z7) {
                    if (a8 != i8 || i9 == 255) {
                        arrayList2.add(Integer.valueOf(i8));
                        arrayList3.add(Integer.valueOf(i9));
                        i9 = 0;
                    }
                    i9++;
                    if (i10 == width - 1 && i11 == height - 1) {
                        arrayList2.add(Integer.valueOf(a8));
                        arrayList3.add(Integer.valueOf(i9));
                    }
                }
                i8 = a8;
            }
        }
        c cVar = new c(arrayList2, arrayList3, arrayList);
        cVar.b(width);
        cVar.a(height);
        return cVar;
    }
}
