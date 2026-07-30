package h4;

import com.crrepa.ble.conn.bean.CRPTempInfo;
import com.crrepa.ble.conn.type.CRPTempTimeType;
import com.crrepa.ble.conn.type.CRPTimingTempState;
import com.crrepa.ble.util.BleLog;
import com.crrepa.f.t1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class j0 {

    /* renamed from: c, reason: collision with root package name */
    private static final float f16707c = 30.0f;

    /* renamed from: d, reason: collision with root package name */
    private static final float f16708d = 45.0f;

    /* renamed from: e, reason: collision with root package name */
    public static final byte f16709e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final byte f16710f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final byte f16711g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static final byte f16712h = 4;

    /* renamed from: i, reason: collision with root package name */
    private static final int f16713i = 1;

    /* renamed from: a, reason: collision with root package name */
    private final float[] f16714a = new float[48];

    /* renamed from: b, reason: collision with root package name */
    private List<Float> f16715b = new ArrayList();

    public CRPTempInfo a(List<Float> list) {
        CRPTempInfo cRPTempInfo = new CRPTempInfo(CRPTempTimeType.TODAY, com.crrepa.g1.e.a(0), a(list, 1));
        cRPTempInfo.setMeasureInterval(1);
        return cRPTempInfo;
    }

    public CRPTempInfo b(List<Float> list) {
        long a8 = com.crrepa.g1.e.a(-1);
        int a9 = com.crrepa.g1.e.a();
        if (list.size() <= a9) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list);
        for (int i8 = 0; i8 < a9; i8++) {
            arrayList.set(i8, Float.valueOf(0.0f));
        }
        CRPTempInfo cRPTempInfo = new CRPTempInfo(CRPTempTimeType.YESTERDAY, a8, arrayList);
        cRPTempInfo.setMeasureInterval(1);
        return cRPTempInfo;
    }

    public float c(byte[] bArr) {
        float f8 = (((bArr[1] << 8) & 65280) | (bArr[0] & 255)) / 10.0f;
        if (30.0f > f8 || f8 > f16708d) {
            return 0.0f;
        }
        return f8;
    }

    public float[] d(byte[] bArr) {
        byte b8 = bArr[0];
        boolean b9 = b(b8);
        BleLog.d("parseTempTimingMeasureResult index: " + ((int) b8));
        BleLog.d("parseTempTimingMeasureResult end: " + b9);
        int i8 = !b9 ? 24 : 0;
        int length = bArr.length;
        int i9 = length - 1;
        byte[] bArr2 = new byte[i9];
        System.arraycopy(bArr, 1, bArr2, 0, i9);
        for (int i10 = 0; i10 < length - 2; i10 += 2) {
            byte[] bArr3 = new byte[2];
            System.arraycopy(bArr2, i10, bArr3, 0, 2);
            this.f16714a[(i10 / 2) + i8] = c(bArr3);
        }
        if (b9) {
            return this.f16714a;
        }
        a(b8);
        return null;
    }

    public CRPTimingTempState e(byte[] bArr) {
        byte b8 = bArr[0];
        return b8 == 1 ? CRPTimingTempState.ENABLE : com.crrepa.g1.c.a(b8) == 255 ? CRPTimingTempState.NONE : CRPTimingTempState.DISABLE;
    }

    public CRPTempTimeType a(int i8) {
        return i8 <= 1 ? CRPTempTimeType.TODAY : CRPTempTimeType.YESTERDAY;
    }

    public List<Float> b(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr)) {
            return null;
        }
        byte b8 = bArr[0];
        if (b8 == 0) {
            this.f16715b.clear();
        }
        this.f16715b.addAll(a(bArr));
        if (19 == b8) {
            return this.f16715b;
        }
        com.crrepa.m.f.e().a(t1.a((int) ((byte) (b8 + 1))));
        return null;
    }

    private boolean b(int i8) {
        int i9 = i8 % 2;
        return 12 <= com.crrepa.g1.f.a() ? i9 == 1 : i9 == 0;
    }

    public List<Float> a(List<Float> list, int i8) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int a8 = com.crrepa.g1.e.a() / i8;
        if (list.size() <= a8) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        while (a8 < list.size()) {
            arrayList.set(a8, Float.valueOf(0.0f));
            a8++;
        }
        return arrayList;
    }

    private List<Float> a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 1; i8 < bArr.length - 1; i8 += 2) {
            byte[] bArr2 = new byte[2];
            System.arraycopy(bArr, i8, bArr2, 0, 2);
            arrayList.add(Float.valueOf(c(bArr2)));
        }
        return arrayList;
    }

    private void a(byte b8) {
        com.crrepa.m.f.e().a(t1.a((byte) (b8 + 1)));
    }
}
