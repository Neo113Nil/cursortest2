package com.facebook.ads.redexgen.X;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.internal.util.common.Preconditions;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import kotlin.io.encoding.Base64;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Xa, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0941Xa implements InterfaceC03278e {
    public static byte[] A03;
    public static final String A04;
    public final Y9 A00;
    public final InterfaceC03378p<C0562Ic> A01;
    public final InterfaceC03378p<C0562Ic> A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 70);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{102, 100, 43, 34, 100, 48, Base64.padSymbol, 52, 33, 126, 100, Ascii.CAN, Base64.padSymbol, Ascii.FS, 47, 60, 55, 45, 10, 45, 54, 43, 56, 62, 60, Ascii.VT, 60, 58, 54, 43, Base64.padSymbol, Ascii.GS, 56, 45, 56, 59, 56, 42, 60, 105, 72, 65, 72, 89, 72, 73, Ascii.CR, 72, 91, 72, 67, 89, Ascii.ETB, Ascii.CR, Ascii.SI, 66, 101, 109, 104, 97, 96, 36, 112, 107, 36, 103, 104, 97, 101, 118, 36, 97, 114, 97, 106, 112, 119, 36, 119, 112, 107, 118, 101, 99, 97, 97, 70, 78, 75, 66, 67, 7, 83, 72, 7, 67, 66, 84, 66, 85, 78, 70, 75, 78, 93, 66, 7, 70, 73, 7, 66, 81, 66, 73, 83, 7, 65, 85, 72, 74, 7, 67, 70, 83, 70, 69, 70, 84, 66, 7, 107, 76, 68, 65, 72, 73, Ascii.CR, 89, 66, Ascii.CR, 64, 66, 91, 72, Ascii.CR, 72, 91, 72, 67, 89, 94, Ascii.CR, 75, 95, 66, 64, Ascii.CR, 68, 67, 0, 75, 65, 68, 74, 69, 89, Ascii.CR, 94, 89, 66, 95, 76, 74, 72, Ascii.CR, 79, 76, 78, 70, Ascii.CR, 89, 66, Ascii.CR, 72, 91, 72, 67, 89, 94, Ascii.CR, 73, 76, 89, 76, 79, 76, 94, 72, 118, 81, 89, 92, 85, 84, 16, 68, 95, 16, 64, 81, 66, 67, 85, 16, 81, 94, 16, 85, 70, 85, 94, 68, 16, 86, 66, 95, 93, 16, 89, 94, Ascii.GS, 86, 92, 89, 87, 88, 68, 16, 67, 68, 95, 66, 81, 87, 85, 123, 92, 84, 81, 88, 89, Ascii.GS, 73, 82, Ascii.GS, 79, 88, 92, 89, Ascii.GS, 73, 85, 88, Ascii.GS, 83, 72, 80, 95, 88, 79, Ascii.GS, 82, 91, Ascii.GS, 88, 75, 88, 83, 73, 78, Ascii.GS, 91, 79, 82, 80, Ascii.GS, 89, 92, 73, 92, 95, 92, 78, 88, Ascii.FF, 43, 35, 38, 47, 46, 106, 62, 37, 106, 57, 47, 56, 35, 43, 38, 35, 48, 47, 106, 43, 46, 106, 47, 60, 47, 36, 62, 105, 78, 70, 76, 73, 71, 72, 84, Ascii.CR, 97, 68, 101, 86, 69, 78, 84, 115, 84, 79, 82, 65, 71, 69, 114, 69, 67, 79, 82, 68, 100, 65, 84, 65, 66, 65, 83, 69, 56, Ascii.SI, 9, 5, Ascii.CAN, Ascii.SO, 74, Ascii.SO, Ascii.VT, Ascii.RS, Ascii.VT, 8, Ascii.VT, Ascii.EM, Ascii.SI, 74, Ascii.FF, Ascii.VT, 3, 6, Ascii.US, Ascii.CAN, Ascii.SI, 74, 5, 9, 9, Ascii.US, Ascii.CAN, Ascii.CAN, Ascii.SI, Ascii.SO, 74, Ascii.GS, 2, Ascii.SI, 4, 74, Ascii.CAN, Ascii.SI, Ascii.VT, Ascii.SO, 3, 4, Ascii.CR, 74, Ascii.SI, Ascii.FS, Ascii.SI, 4, Ascii.RS, Ascii.EM, 68, Base64.padSymbol, 40, 40, 57, 49, 44, 40, Ascii.FS, Ascii.EM, Ascii.FF, Ascii.EM, 47, 34, 95, 72, 78, 66, 95, 73, 114, 73, 76, 89, 76, 79, 76, 94, 72, 65, 87, 65, 65, 91, 93, 92, 109, 91, 86, 46, 56, 46, 46, 52, 50, 51, 2, 41, 52, 48, 56, 100, 121, 125, 117, 49, 42, 46, 32, 43, 88, 85, 92, 73, Ascii.FF, Ascii.ETB, Ascii.DC2, Ascii.ETB, Ascii.SYN, Ascii.SO, Ascii.ETB};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f0 A[Catch: 8y -> 0x0136, TryCatch #4 {8y -> 0x0136, blocks: (B:33:0x00e4, B:35:0x00f0, B:36:0x00ff, B:19:0x0088, B:24:0x008e, B:26:0x009a, B:27:0x00da, B:62:0x0108, B:63:0x010c, B:65:0x0112, B:67:0x0122, B:68:0x0126, B:70:0x012c), top: B:32:0x00e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int A0B(int i, Set<String> set, Set<String> set2) {
        String A00 = A00(TTAdConstant.IMAGE_URL_CODE, 7, 26);
        int i2 = 0;
        int[] iArr = new int[30];
        byte[] bArr = new byte[30000];
        LinkedList linkedList = new LinkedList();
        try {
            linkedList.add(this.A02.A5a(bArr, iArr));
            List<JSONObject> A01 = A01(new LinkedList(), bArr, iArr);
            while (((InterfaceC03368o) linkedList.getLast()).AA0()) {
                Arrays.fill(iArr, 0);
                linkedList.add(this.A02.A5a(bArr, iArr));
                A01 = A01(A01, bArr, iArr);
            }
            Iterator<JSONObject> it = A01.iterator();
            while (it.hasNext()) {
                JSONObject next = it.next();
                try {
                    String string = next.getString(A00(TypedValues.CycleType.TYPE_WAVE_PERIOD, 2, 0));
                    try {
                        if (set.contains(string)) {
                            int i3 = next.getInt(A00) + 1;
                            if (i3 < i) {
                                try {
                                    next.put(A00, i3);
                                    this.A01.AFq(A09(next));
                                } catch (C03468y e) {
                                    e = e;
                                    if (this.A00.A04().A8o()) {
                                    }
                                    A05(C03207x.A2K, e);
                                    return i2;
                                } catch (JSONException e2) {
                                    e = e2;
                                    try {
                                        if (this.A00.A04().A8o()) {
                                        }
                                        A05(C03207x.A2O, e);
                                    } catch (C03468y e3) {
                                        e = e3;
                                        if (this.A00.A04().A8o()) {
                                            Log.e(A04, A00(130, 68, 107), e);
                                        }
                                        A05(C03207x.A2K, e);
                                        return i2;
                                    }
                                }
                            } else {
                                i2++;
                            }
                            it.remove();
                        } else {
                            try {
                                if (set2.contains(string)) {
                                    if (this.A00.A04().A8o()) {
                                        String str = A00(39, 16, 107) + string + A00(0, 11, 2) + next.optString(A00(471, 4, 106), A00(475, 7, 63));
                                    }
                                    it.remove();
                                }
                            } catch (JSONException e4) {
                                e = e4;
                                if (this.A00.A04().A8o()) {
                                    Log.e(A04, A00(Opcodes.IFNULL, 47, 118), e);
                                }
                                A05(C03207x.A2O, e);
                            }
                        }
                    } catch (C03468y e5) {
                        e = e5;
                    } catch (JSONException e6) {
                        e = e6;
                    }
                } catch (JSONException e7) {
                    e = e7;
                }
            }
            Iterator<JSONObject> it2 = A01.iterator();
            while (it2.hasNext()) {
                this.A02.AFq(A09(it2.next()));
            }
            Iterator it3 = linkedList.iterator();
            while (it3.hasNext()) {
                ((InterfaceC03368o) it3.next()).A4y();
            }
        } catch (C03468y e8) {
            e = e8;
        }
        return i2;
    }

    static {
        A03();
        A04 = C0941Xa.class.getSimpleName();
    }

    public C0941Xa(Y9 y9) throws IOException {
        this.A00 = y9;
        this.A01 = new XX(C03348m.A00(A00(11, 28, 31), y9), new C0943Xc(this));
        this.A02 = new XX(C03348m.A00(A00(322, 37, 102), y9), new C0942Xb(this));
    }

    private List<JSONObject> A01(List<JSONObject> list, byte[] bArr, int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            if (i2 == 0) {
                break;
            }
            try {
                list.add(A02(bArr, i, i2));
            } catch (JSONException jsone) {
                if (this.A00.A04().A8o()) {
                    Log.e(A04, A00(85, 45, 97), jsone);
                }
                int start = C03207x.A2O;
                A05(start, jsone);
            }
            i += i2;
        }
        return list;
    }

    public static JSONObject A02(byte[] bArr, int i, int i2) throws JSONException {
        return new JSONObject(new String(Arrays.copyOfRange(bArr, i, i + i2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(int i, String str) {
        C03217y c03217y = new C03217y(str);
        c03217y.A03(1);
        this.A00.A07().A9N(A00(TypedValues.CycleType.TYPE_WAVE_PHASE, 15, 107), i, c03217y);
    }

    private void A05(int i, Throwable th) {
        this.A00.A07().A9M(A00(TypedValues.CycleType.TYPE_WAVE_PHASE, 15, 107), i, new C03217y(th));
    }

    public static byte[] A07(C7S c7s, String str, C0562Ic c0562Ic) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(TypedValues.CycleType.TYPE_WAVE_PERIOD, 2, 0), str);
            jSONObject.put(A00(466, 5, 3), c0562Ic.A08());
            jSONObject.put(A00(471, 4, 106), c0562Ic.A06().toString());
            jSONObject.put(A00(462, 4, 86), LM.A02(c0562Ic.A04()));
            jSONObject.put(A00(450, 12, 27), LM.A02(c0562Ic.A03()));
            jSONObject.put(A00(440, 10, 116), c0562Ic.A07());
            String A00 = A00(419, 4, 62);
            JSONObject eventJson = new JSONObject(c0562Ic.A09());
            jSONObject.put(A00, eventJson);
            jSONObject.put(A00(TTAdConstant.IMAGE_URL_CODE, 7, 26), 0);
        } catch (JSONException e) {
            if (c7s.A04().A8o()) {
                Log.e(A04, A00(294, 28, 12), e);
            }
        }
        return jSONObject.toString().getBytes();
    }

    public static byte[] A09(JSONObject jSONObject) {
        return jSONObject.toString().getBytes();
    }

    public final int A0A() {
        try {
            return this.A01.A7f();
        } catch (C03468y e) {
            if (this.A00.A04().A8o()) {
                Log.e(A04, A00(245, 49, 123), e);
                return 0;
            }
            return 0;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:14:0x0054 */
    /* JADX WARN: Incorrect condition in loop: B:19:0x006e */
    /* JADX WARN: Incorrect condition in loop: B:8:0x002c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<JSONObject> A0C(int i) {
        int totalFetched = 0;
        if (i == -1) {
            totalFetched = 1;
            i = 30;
        }
        int[] eventSizes = new int[i];
        byte[] bArr = new byte[i * 1000];
        List<JSONObject> linkedList = new LinkedList<>();
        LinkedList linkedList2 = new LinkedList();
        try {
            InterfaceC03368o A5a = this.A01.A5a(bArr, eventSizes);
            linkedList2.add(A5a);
            int A5b = A5a.A5b();
            linkedList = A01(linkedList, bArr, eventSizes);
            while (noLimit && (A5b < i || totalFetched != 0)) {
                if (totalFetched == 0) {
                    eventSizes = new int[i - A5b];
                } else {
                    Arrays.fill(eventSizes, 0);
                }
                A5a = this.A01.A5a(bArr, eventSizes);
                linkedList2.add(A5a);
                linkedList = A01(linkedList, bArr, eventSizes);
            }
            Iterator<JSONObject> it = linkedList.iterator();
            while (noLimit) {
                this.A02.AFq(A09(it.next()));
            }
            Iterator it2 = linkedList2.iterator();
            while (noLimit) {
                ((InterfaceC03368o) it2.next()).A4y();
            }
        } catch (C03468y e) {
            boolean noLimit = this.A00.A04().A8o();
            if (noLimit) {
                Log.e(A04, A00(359, 53, 44), e);
            }
            A05(C03207x.A2L, e);
        }
        return linkedList;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03278e
    public final void A4G() {
        try {
            this.A01.clear();
            this.A02.clear();
        } catch (C03468y e) {
            if (this.A00.A04().A8o()) {
                Log.e(A04, A00(55, 30, 66), e);
            }
            A05(C03207x.A2I, e);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8b != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC03278e
    public final void AGT(final C0562Ic c0562Ic, final AbstractC03248b<String> abstractC03248b) {
        Executor executor = ExecutorC0633La.A07;
        final InterfaceC03378p<C0562Ic> interfaceC03378p = this.A01;
        final Y9 y9 = this.A00;
        LX.A00(executor, new AsyncTask<Void, Void, String>(c0562Ic, abstractC03248b, interfaceC03378p, y9) { // from class: com.facebook.ads.redexgen.X.8f
            public static byte[] A05;
            public static String[] A06 = {"eZRg0", "9V6E8W", "xj5QhV", "OA95VIvTvwhgOpg1JzD5APn5ld4Fxl09", "KVXKxw3vFVm2nsonOqXLQ2M9", "1wiEXg5TWKy6aTJl", "hr3sX5JQ1zlqribj", "Vt9t5ut5ZgjhHbMTByjzA5y3IT5Rov5"};
            public C03468y A00;
            public final C7S A01;
            public final AbstractC03248b<String> A02;
            public final InterfaceC03378p<C0562Ic> A03;
            public final C0562Ic A04;

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 55);
                }
                return new String(copyOfRange);
            }

            public static void A02() {
                A05 = new byte[]{Ascii.SUB, 40, Ascii.US, Ascii.US, 2, Ascii.US, 77, 0, 8, Ascii.RS, Ascii.RS, Ascii.FF, 10, 8, 77, Ascii.SO, Ascii.FF, 3, 3, 2, Ascii.EM, 77, Ascii.SI, 8, 77, 3, Ascii.CAN, 1, 1, Ascii.CR, 46, 38, 38, 40, 47, 38, 97, 36, 55, 36, 47, 53, 123, 97, 9, Ascii.RS, Ascii.CAN, Ascii.DC4, 9, Ascii.US, 36, Ascii.US, Ascii.SUB, Ascii.SI, Ascii.SUB, Ascii.EM, Ascii.SUB, 8, Ascii.RS};
            }

            static {
                A02();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8b != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8p != com.facebook.ads.internal.eventstorage.record.RecordDatabase<com.facebook.ads.internal.logging.AdEvent> */
            {
                this.A04 = c0562Ic;
                this.A03 = interfaceC03378p;
                this.A02 = abstractC03248b;
                this.A01 = y9;
            }

            private final String A01(Void... voidArr) {
                byte[] A07;
                if (K0.A02(this)) {
                    return null;
                }
                String str = null;
                try {
                    try {
                        str = UUID.randomUUID().toString();
                        this.A01.A07().A8b(this.A04.A06().toString());
                    } catch (C03468y e) {
                        this.A00 = e;
                        InterfaceC03197w A072 = this.A01.A07();
                        String eventId = A00(44, 15, 76);
                        A072.A9M(eventId, C03207x.A2M, new C03217y(e));
                    }
                    if (TextUtils.isEmpty(this.A04.A08())) {
                        return null;
                    }
                    if (this.A01.A04().A8o()) {
                        String str2 = A00(29, 15, 118) + this.A04.A06().toString() + A00(0, 1, 13) + this.A04.A09().toString();
                    }
                    InterfaceC03378p<C0562Ic> interfaceC03378p2 = this.A03;
                    A07 = C0941Xa.A07(this.A01, str, this.A04);
                    interfaceC03378p2.AFq(A07);
                    return str;
                } catch (Throwable th) {
                    K0.A00(th, this);
                    return null;
                }
            }

            private final void A03(String str) {
                if (K0.A02(this)) {
                    return;
                }
                try {
                    C03468y c03468y = this.A00;
                    if (c03468y == null) {
                        this.A02.A02(str);
                    } else {
                        this.A02.A01(0, (String) Preconditions.checkNotNull(c03468y.getMessage(), A00(1, 28, 90)));
                    }
                } catch (Throwable th) {
                    K0.A00(th, this);
                    String[] strArr = A06;
                    if (strArr[5].length() != strArr[6].length()) {
                        throw new RuntimeException();
                    }
                    A06[1] = "UcJj";
                }
            }

            @Override // android.os.AsyncTask
            public final /* bridge */ /* synthetic */ String doInBackground(Void[] voidArr) {
                if (K0.A02(this)) {
                    return null;
                }
                try {
                    return A01(voidArr);
                } catch (Throwable th) {
                    K0.A00(th, this);
                    if (A06[7].length() != 31) {
                        throw new RuntimeException();
                    }
                    A06[1] = ExifInterface.GPS_MEASUREMENT_INTERRUPTED;
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            public final /* bridge */ /* synthetic */ void onPostExecute(String str) {
                if (K0.A02(this)) {
                    return;
                }
                try {
                    A03(str);
                } catch (Throwable th) {
                    K0.A00(th, this);
                }
            }
        }, new Void[0]);
    }
}
