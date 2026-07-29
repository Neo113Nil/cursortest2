package com.aiming.mdt.a;

import android.app.Application;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.aiming.mdt.a.ʽʿˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0164 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static int[] f548 = {-509747463, 1506344509, -1173319781, -1084445930, 1893057397, -767679421, -1332845362, 129137169, 154129329, -1539240721, -1802360203, 1819355651, -1362827648, 534779226, 1469561142, -2047905181, -136867569, 2074438757};

    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    private static int f549 = 1;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static volatile C0164 f550;

    /* renamed from: ʾ, reason: contains not printable characters */
    private static int f551;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private List<C0165> f552;

    /* renamed from: ʼ, reason: contains not printable characters */
    private SensorManager f553;

    /* renamed from: ʽ, reason: contains not printable characters */
    private BitSet f554 = new BitSet(6);

    /* renamed from: com.aiming.mdt.a.ʽʿˉ$ʻ, reason: contains not printable characters */
    class C0165 implements SensorEventListener {

        /* renamed from: ʻʼʽ, reason: contains not printable characters */
        private static long f555 = 385980564886529341L;

        /* renamed from: ʼʾ, reason: contains not printable characters */
        private static int f556 = 0;

        /* renamed from: ʾ, reason: contains not printable characters */
        private static int f557 = 1;

        /* renamed from: ʻ, reason: contains not printable characters */
        private String f558;

        /* renamed from: ʻʼ, reason: contains not printable characters */
        private double f559;

        /* renamed from: ʻʽ, reason: contains not printable characters */
        private float[][] f560;

        /* renamed from: ʻʾ, reason: contains not printable characters */
        private long f561;

        /* renamed from: ʼ, reason: contains not printable characters */
        private int f562;

        /* renamed from: ʽ, reason: contains not printable characters */
        private String f564;

        private C0165(Sensor sensor) {
            try {
                this.f562 = sensor.getType();
                this.f558 = sensor.getName();
                this.f564 = sensor.getVendor();
                this.f560 = new float[2][];
            } catch (Throwable unused) {
                m636("绫宅\ud88e妒\udee2必\udccd崝툄匐큲元활咠헇䪝쯿䣔짔举콛").intern();
                C0044.m109();
            }
        }

        /* synthetic */ C0165(C0164 c0164, Sensor sensor, byte b2) {
            this(sensor);
        }

        /* renamed from: ʻʼ, reason: contains not printable characters */
        static /* synthetic */ String m635(C0165 c0165) {
            int i = f557 + 17;
            f556 = i % 128;
            int i2 = i % 2;
            String str = c0165.f558;
            int i3 = f557 + 117;
            f556 = i3 % 128;
            if (i3 % 2 != 0) {
            }
            return str;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        private static String m636(String str) {
            char[] charArray = str.toCharArray();
            char c2 = charArray[0];
            char[] cArr = new char[charArray.length - 1];
            int i = f557 + 17;
            f556 = i % 128;
            int i2 = i % 2;
            for (int i3 = 1; i3 < charArray.length; i3++) {
                int i4 = f556 + 5;
                f557 = i4 % 128;
                int i5 = i4 % 2;
                cArr[i3 - 1] = (char) ((charArray[i3] ^ (i3 * c2)) ^ f555);
            }
            return new String(cArr);
        }

        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i) {
            int i2 = f557 + 27;
            f556 = i2 % 128;
            if (i2 % 2 != 0) {
            }
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent != null) {
                try {
                    if (sensorEvent.values != null) {
                        Sensor sensor = sensorEvent.sensor;
                        if ((sensor != null ? '&' : '\f') == '\f' || sensor.getName() == null || sensor.getVendor() == null) {
                            return;
                        }
                        int type = sensorEvent.sensor.getType();
                        String name = sensorEvent.sensor.getName();
                        String vendor = sensorEvent.sensor.getVendor();
                        long j = sensorEvent.timestamp;
                        float[] fArr = sensorEvent.values;
                        if (this.f562 == type) {
                            if (this.f558.equals(name)) {
                                if ((this.f564.equals(vendor) ? '0' : '\b') != '\b') {
                                    float[] fArr2 = this.f560[0];
                                    if (fArr2 == null) {
                                        this.f560[0] = Arrays.copyOf(fArr, fArr.length);
                                        return;
                                    }
                                    float[] fArr3 = this.f560[1];
                                    if (fArr3 == null) {
                                        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
                                        this.f560[1] = copyOf;
                                        this.f559 = C0164.m628(fArr2, copyOf);
                                        return;
                                    }
                                    if (50000000 <= j - this.f561) {
                                        int i = f556 + 9;
                                        f557 = i % 128;
                                        int i2 = i % 2;
                                        this.f561 = j;
                                        if (Arrays.equals(fArr3, fArr)) {
                                            return;
                                        }
                                        double m628 = C0164.m628(fArr2, fArr);
                                        if (m628 > this.f559) {
                                            this.f560[1] = Arrays.copyOf(fArr, fArr.length);
                                            this.f559 = m628;
                                            int i3 = f556 + 87;
                                            f557 = i3 % 128;
                                            int i4 = i3 % 2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable unused) {
                    m636("츯\ueb41뤆俞ᷲ⎹\uf055蘹吤\u1af4⢊寧转崬掏㆓잣鑱娖栮㻢첉鵅ꍇ焽ߋ햕鮯\ua87c縊ಟ틩\ue0af녀䝬ᔢ\udb9b").intern();
                    C0044.m109();
                }
            }
        }

        /* renamed from: ʻʽ, reason: contains not printable characters */
        public final Map<String, Object> m637() {
            HashMap hashMap = new HashMap();
            try {
                hashMap.put(m636("\uf6dd펓죓").intern(), Integer.valueOf(this.f562));
                hashMap.put(m636("\udab3�逕").intern(), this.f558);
                hashMap.put(m636("躽꯳㠑").intern(), this.f564);
                float[] fArr = this.f560[0];
                Object obj = null;
                if (fArr != null) {
                    int i = f557 + 11;
                    f556 = i % 128;
                    if (i % 2 != 0) {
                        hashMap.put(m636("ợ㮭\u18ad秇").intern(), C0164.m633(fArr));
                        super.hashCode();
                    } else {
                        hashMap.put(m636("ợ㮭\u18ad秇").intern(), C0164.m633(fArr));
                    }
                }
                float[] fArr2 = this.f560[1];
                if (fArr2 != null) {
                    int i2 = f556 + 101;
                    f557 = i2 % 128;
                    if (i2 % 2 == 0) {
                        hashMap.put(m636("먗齙充ଽ").intern(), C0164.m633(fArr2));
                        super.hashCode();
                    } else {
                        hashMap.put(m636("먗齙充ଽ").intern(), C0164.m633(fArr2));
                    }
                    int i3 = f556 + 27;
                    f557 = i3 % 128;
                    if (i3 % 2 == 0) {
                    }
                }
            } catch (Throwable unused) {
                m636("ᲁ㧯ᱚ烐坊ꯗ蹉\ue2f7셔◚㡖᳑獔埂ꨓ軕\ued48쇘⑫㣏Ὕ珉嘋\uaacf襗\uedd6쁈ⓔ㬛").intern();
                C0044.m109();
            }
            int i4 = f556 + 89;
            f557 = i4 % 128;
            if (i4 % 2 == 0) {
            }
            return hashMap;
        }
    }

    /* renamed from: com.aiming.mdt.a.ʽʿˉ$ʻʼ, reason: contains not printable characters */
    class RunnableC0166 implements Runnable {

        /* renamed from: ʽ, reason: contains not printable characters */
        private static int f565 = 1;

        RunnableC0166() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if ((f565 + 95) % 2 != 0) {
            }
            C0164.this.m634();
            if ((f565 + 113) % 2 != 0) {
            }
        }
    }

    /* renamed from: com.aiming.mdt.a.ʽʿˉ$ʻʽ, reason: contains not printable characters */
    class RunnableC0167 implements Runnable {

        /* renamed from: ʻ, reason: contains not printable characters */
        private static int f567 = 1;

        /* renamed from: ʻʼ, reason: contains not printable characters */
        private static int f568 = 95;

        /* renamed from: ʼ, reason: contains not printable characters */
        private static int f569;

        RunnableC0167() {
        }

        /* renamed from: ʻʼ, reason: contains not printable characters */
        private static String m638(boolean z, int i, int i2, String str, int i3) {
            int i4 = f567 + 11;
            f569 = i4 % 128;
            int i5 = i4 % 2;
            char[] charArray = str.toCharArray();
            char[] cArr = new char[i2];
            int i6 = 0;
            while (true) {
                if (!(i6 < i2)) {
                    break;
                }
                int i7 = f569 + 85;
                f567 = i7 % 128;
                int i8 = i7 % 2;
                cArr[i6] = (char) (charArray[i6] + i);
                cArr[i6] = (char) (cArr[i6] - f568);
                i6++;
            }
            if ((i3 > 0 ? '3' : ';') == '3') {
                char[] cArr2 = new char[i2];
                System.arraycopy(cArr, 0, cArr2, 0, i2);
                int i9 = i2 - i3;
                System.arraycopy(cArr2, 0, cArr, i9, i3);
                System.arraycopy(cArr2, i3, cArr, 0, i9);
                int i10 = f567 + 63;
                f569 = i10 % 128;
                int i11 = i10 % 2;
            }
            return new String(cArr);
        }

        @Override // java.lang.Runnable
        public final void run() {
            byte b2 = 0;
            try {
                if ((C0164.m629(C0164.this) != null ? '=' : '(') != '=') {
                    return;
                }
                int i = f569 + 17;
                f567 = i % 128;
                int i2 = i % 2;
                Iterator<Sensor> it = C0164.m629(C0164.this).getSensorList(-1).iterator();
                while (true) {
                    if ((it.hasNext() ? '(' : '`') == '`') {
                        return;
                    }
                    Sensor next = it.next();
                    if (C0164.m627(C0164.this).get(next.getType())) {
                        C0165 c0165 = new C0165(C0164.this, next, b2);
                        C0164.m632(C0164.this).add(c0165);
                        m638(false, 196, 17, "\u0004\u000e\u000f\u0000\t\u0000\rￕ￭\u0000\u0002\u0004\u000e\u000f\u0000\r\uffe7", 8).intern();
                        C0165.m635(c0165);
                        C0044.m108();
                        C0164.m629(C0164.this).registerListener(c0165, next, 0);
                    }
                    int i3 = f567 + 5;
                    f569 = i3 % 128;
                    int i4 = i3 % 2;
                }
            } catch (Throwable unused) {
                m638(false, 195, 51, "\u000f\u000b\u000e￩�\n�\u0003\u0001\u000eﾼ￮\u0001\u0003\u0005\u000f\u0010\u0001\u000e\uffef\u0001\n\u000f\u000b\u000e￨\u0005\u000f\u0010\u0001\n\u0001\u000e￮\u0011\n\n�\ufffe\b\u0001ﾼ\u0001\u000e\u000e\u000b\u000eￖ\uffef\u0001\n", 48).intern();
                C0044.m109();
            }
        }
    }

    private C0164() {
        try {
            Application m738 = C0195.m731().m738();
            this.f552 = new ArrayList();
            this.f554.set(1);
            this.f554.set(2);
            this.f554.set(4);
            this.f553 = (SensorManager) m738.getSystemService(m631(new int[]{-491380008, -1960282957, -10078240, -544914303}, 6).intern());
            C0195.m731().m736(new RunnableC0167());
            C0195.m731().m740(new RunnableC0166());
        } catch (Throwable unused) {
            m631(new int[]{1494165606, 324526620, -1859113878, -1357013470, -409259782, -72061142, -735623675, 888235872, -98945326, -1435786534}, 20).intern();
            C0044.m109();
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static /* synthetic */ BitSet m627(C0164 c0164) {
        int i = f549 + 95;
        f551 = i % 128;
        if (i % 2 != 0) {
        }
        BitSet bitSet = c0164.f554;
        int i2 = f549 + 93;
        f551 = i2 % 128;
        if (i2 % 2 != 0) {
        }
        return bitSet;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    static /* synthetic */ double m628(float[] fArr, float[] fArr2) {
        int i = f549 + 15;
        f551 = i % 128;
        int i2 = i % 2;
        double d2 = 0.0d;
        int i3 = 0;
        while (true) {
            if (i3 >= Math.min(fArr.length, fArr2.length)) {
                break;
            }
            int i4 = f549 + 23;
            f551 = i4 % 128;
            int i5 = i4 % 2;
            d2 += StrictMath.pow(fArr[i3] - fArr2[i3], 2.0d);
            i3++;
        }
        double sqrt = Math.sqrt(d2);
        int i6 = f551 + 3;
        f549 = i6 % 128;
        if ((i6 % 2 == 0 ? '#' : (char) 24) != '#') {
        }
        return sqrt;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    static /* synthetic */ SensorManager m629(C0164 c0164) {
        int i = f551 + 7;
        f549 = i % 128;
        int i2 = i % 2;
        SensorManager sensorManager = c0164.f553;
        int i3 = f549 + 33;
        f551 = i3 % 128;
        if (i3 % 2 != 0) {
        }
        return sensorManager;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static C0164 m630() {
        if (f550 == null) {
            synchronized (C0164.class) {
                if (f550 == null) {
                    f550 = new C0164();
                }
            }
        }
        return f550;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static String m631(int[] iArr, int i) {
        int i2 = f549 + 29;
        f551 = i2 % 128;
        int i3 = i2 % 2;
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length << 1];
        int[] iArr2 = (int[]) f548.clone();
        int i4 = f551 + 121;
        f549 = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 0;
        while (true) {
            if (!(i6 < iArr.length)) {
                return new String(cArr2, 0, i);
            }
            int i7 = f549 + 119;
            f551 = i7 % 128;
            int i8 = i7 % 2;
            cArr[0] = (char) (iArr[i6] >> 16);
            cArr[1] = (char) iArr[i6];
            int i9 = i6 + 1;
            cArr[2] = (char) (iArr[i9] >> 16);
            cArr[3] = (char) iArr[i9];
            C0192.m723(cArr, iArr2, false);
            int i10 = i6 << 1;
            cArr2[i10] = cArr[0];
            cArr2[i10 + 1] = cArr[1];
            cArr2[i10 + 2] = cArr[2];
            cArr2[i10 + 3] = cArr[3];
            i6 += 2;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static /* synthetic */ List m632(C0164 c0164) {
        int i = f549 + 15;
        f551 = i % 128;
        int i2 = i % 2;
        List<C0165> list = c0164.f552;
        int i3 = f551 + 95;
        f549 = i3 % 128;
        if (i3 % 2 == 0) {
        }
        return list;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static /* synthetic */ List m633(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        int length = fArr.length;
        int i = f551 + 47;
        f549 = i % 128;
        if (i % 2 == 0) {
        }
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                return arrayList;
            }
            int i3 = f551 + 21;
            f549 = i3 % 128;
            int i4 = i3 % 2;
            arrayList.add(Float.valueOf(Float.valueOf(fArr[i2]).floatValue()));
            i2++;
            int i5 = f551 + 35;
            f549 = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final String m634() {
        ArrayList arrayList = new ArrayList();
        try {
            if (!(this.f552.isEmpty())) {
                Iterator<C0165> it = this.f552.iterator();
                while (true) {
                    if ((it.hasNext() ? '3' : 'T') != '3') {
                        break;
                    }
                    int i = f551 + 19;
                    f549 = i % 128;
                    int i2 = i % 2;
                    C0165 next = it.next();
                    m631(new int[]{36189141, -839394883, 314863967, 1832852784, -1342161116, -1723230099, 2078876551, 2101018647, 1745709542, -883700783}, 19).intern();
                    C0165.m635(next);
                    C0044.m108();
                    this.f553.unregisterListener(next);
                    arrayList.add(next.m637());
                    int i3 = f551 + 35;
                    f549 = i3 % 128;
                    int i4 = i3 % 2;
                }
            }
        } catch (Throwable unused) {
            m631(new int[]{1494165606, 324526620, -1859113878, -1357013470, -409259782, -72061142, -2073298507, 1087633181, 1886608464, 1045003032, 1167443171, -371796711, -141151005, 489470623, -867755311, 422120112}, 31).intern();
            C0044.m109();
        }
        return new JSONArray((Collection) arrayList).toString();
    }
}
