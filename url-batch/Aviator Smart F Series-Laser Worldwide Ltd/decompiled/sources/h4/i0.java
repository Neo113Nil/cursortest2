package h4;

import com.crrepa.ble.conn.bean.CRPGalleryInfo;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    private static int f16703a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static int f16704b = 100;

    /* renamed from: c, reason: collision with root package name */
    private static int f16705c = -1;

    /* renamed from: d, reason: collision with root package name */
    private static CRPGalleryInfo f16706d;

    private i0() {
    }

    public static int a() {
        return f16705c;
    }

    public static CRPGalleryInfo b(byte[] bArr) {
        if (!com.crrepa.g1.c.h(bArr)) {
            if (bArr.length % 4 == 2) {
                ArrayList arrayList = new ArrayList();
                byte[] bArr2 = new byte[4];
                for (int i8 = 2; i8 < bArr.length; i8 += 4) {
                    System.arraycopy(bArr, i8, bArr2, 0, 4);
                    arrayList.add(String.valueOf(com.crrepa.g1.c.f(bArr2)));
                }
                f16706d.setPhotoList(arrayList);
                return f16706d;
            }
        }
        return f16706d;
    }

    public static CRPGalleryInfo a(byte[] bArr) {
        if (bArr.length < 8) {
            return null;
        }
        CRPGalleryInfo cRPGalleryInfo = new CRPGalleryInfo();
        f16706d = cRPGalleryInfo;
        cRPGalleryInfo.setAvailableSize(f16703a);
        f16706d.setMaxPhotoCount(f16704b);
        f16706d.setWidth(com.crrepa.g1.c.b(bArr[3], bArr[2]));
        f16706d.setHeight(com.crrepa.g1.c.b(bArr[5], bArr[4]));
        int b8 = com.crrepa.g1.c.b(bArr[7], bArr[6]);
        f16706d.setPhotoCount(b8);
        if (b8 == 0) {
            return f16706d;
        }
        return null;
    }

    public static void a(int i8) {
        f16705c = i8;
    }

    public static void a(int i8, int i9) {
        f16703a = i8;
        if (i9 > 0) {
            f16704b = i9;
        }
    }
}
