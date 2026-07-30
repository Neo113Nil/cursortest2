package com.instagram.common.viewpoint.core;

import android.database.Cursor;
import android.util.Log;
import android.util.Pair;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Th, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0784Th {
    public static byte[] A00;
    public static String[] A01 = {"DnTt6XIWuAOQU1Yv6ovRwSY", "69qI84ufJ2UhBtkQx2IBHzZ", "lNRa3H", "2y2Uq0vrRuc5d5uHsu4hqSSezWuXbHLJ", "zUBzfUPcj8uIEo8tGSc", "tyrfQSxRYtG07uuggB4oX54vdLL3Tqsi", "aO8Ix6JCuD3GiDZZv02FTTQkozyjIQFp", "pMzofq8cn4xP4Da44trMpLQAQtlXLUTp"};

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 25);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        String[] strArr = A01;
        if (strArr[1].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        A01[4] = "";
        A00 = new byte[]{3, Ascii.DC4, Ascii.DC2, Ascii.RS, 3, Ascii.NAK, 46, Ascii.NAK, 16, 5, 16, 19, 16, 2, Ascii.DC4};
    }

    static {
        A03();
    }

    public static InterfaceC0785Tj A00(C1133cu c1133cu) {
        try {
            return new C0842Vp(c1133cu);
        } catch (IOException e) {
            c1133cu.A08().AAy(A02(0, 15, 104), AbstractC0772Sv.A2K, new C0773Sw(e));
            return new W8();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.6J] */
    public static C6J A01(C1133cu c1133cu) {
        return new WO(c1133cu) { // from class: com.facebook.ads.redexgen.X.6J
            public static byte[] A03;
            public static String[] A04 = {"u3ex4KQMIW041lf", "3AptpGjhH", "gmUldlaQs1iDW8SjyulR1SveXx4W0WHx", "1qDQcvNZxrP96rda7KCur1LyuVNWU8kp", "CAWPS90lsy", "t8qLCZBFlDEhGKoHyGYF6SljofbMSV", "olmaGtOYwcY5nta5it0d5AQEWYClhN", "QuuHkAQHaV7iF"};
            public boolean A00 = true;
            public final C1133cu A01;
            public final SZ A02;

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 64);
                }
                return new String(copyOfRange);
            }

            public static void A04() {
                A03 = new byte[]{-37, -7, 6, -65, Ascii.FF, -72, -4, -3, 4, -3, Ascii.FF, -3, -72, -7, Ascii.FF, Ascii.FF, -3, 5, 8, Ascii.FF, Ascii.VT, -72, -3, 16, -5, -3, -3, -4, -3, -4, -72, -3, Ascii.SO, -3, 6, Ascii.FF, Ascii.VT, -58, -87, -84, -66, -79, -84, -1, Ascii.DC2, Ascii.DC2, 3, Ascii.VT, Ascii.SO, Ascii.DC2, 8, 5, Ascii.CAN, 5, -75, -80, -33, -47, -33, -33, -43, -37, -38, -53, -43, -48, -51, -65, -51, -51, -61, -55, -56, -71, -50, -61, -57, -65, Ascii.DC2, 7, Ascii.VT, 3, 3, -2, -6, -12, -3, -18, -8, -13, -18, -13, -22, -33};
            }

            static {
                A04();
            }

            {
                this.A01 = c1133cu;
                this.A02 = new SZ(c1133cu);
            }

            private JSONArray A01(Cursor cursor) throws JSONException {
                JSONArray jSONArray = new JSONArray();
                cursor.moveToPosition(-1);
                while (cursor.moveToNext()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(A00(54, 2, 12), cursor.getString(C1132ct.A04.A00));
                    jSONObject.put(A00(82, 8, 79), cursor.getString(C1132ct.A09.A00));
                    jSONObject.put(A00(90, 4, 58), cursor.getString(C1132ct.A0A.A00));
                    jSONObject.put(A00(78, 4, 94), XG.A03(cursor.getDouble(C1132ct.A08.A00)));
                    jSONObject.put(A00(66, 12, 26), XG.A03(cursor.getDouble(C1132ct.A07.A00)));
                    jSONObject.put(A00(56, 10, 44), cursor.getString(C1132ct.A06.A00));
                    String string = cursor.getString(C1132ct.A03.A00);
                    jSONObject.put(A00(50, 4, 100), string != null ? new JSONObject(string) : new JSONObject());
                    jSONObject.put(A00(43, 7, 94), cursor.getString(C1132ct.A02.A00));
                    jSONObject.put(A00(38, 5, 8), this.A01.A04().A8F());
                    jSONArray.put(jSONObject);
                }
                return jSONArray;
            }

            private JSONArray A02(Cursor cursor) throws JSONException {
                JSONArray jSONArray = new JSONArray();
                cursor.moveToPosition(-1);
                while (cursor.moveToNext()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(A00(54, 2, 12), cursor.getString(2));
                    jSONObject.put(A00(82, 8, 79), cursor.getString(0));
                    jSONObject.put(A00(90, 4, 58), cursor.getString(4));
                    jSONObject.put(A00(78, 4, 94), XG.A03(cursor.getDouble(5)));
                    jSONObject.put(A00(66, 12, 26), XG.A03(cursor.getDouble(6)));
                    jSONObject.put(A00(56, 10, 44), cursor.getString(7));
                    String string = cursor.getString(8);
                    jSONObject.put(A00(50, 4, 100), string != null ? new JSONObject(string) : new JSONObject());
                    jSONObject.put(A00(43, 7, 94), cursor.getString(9));
                    jSONObject.put(A00(38, 5, 8), this.A01.A04().A8F());
                    jSONArray.put(jSONObject);
                }
                return jSONArray;
            }

            public static JSONObject A03(Cursor cursor) throws JSONException {
                JSONObject jSONObject = new JSONObject();
                while (cursor.moveToNext()) {
                    jSONObject.put(cursor.getString(C1131cs.A03.A00), cursor.getString(C1131cs.A02.A00));
                }
                return jSONObject;
            }

            @Override // com.instagram.common.viewpoint.core.Ti
            public final int A4s(int i) {
                int i2 = 0;
                if (i > -1) {
                    try {
                        i2 = this.A02.A08(i);
                    } catch (Exception e) {
                        if (this.A01.A05().AAF()) {
                            Log.e(WO.A00, A00(0, 38, 88), e);
                        }
                    }
                }
                this.A02.A0I();
                if (this.A00) {
                    this.A02.A0J();
                }
                return i2;
            }

            @Override // com.instagram.common.viewpoint.core.InterfaceC0785Tj
            public final void A4t() {
                this.A02.A0H();
            }

            @Override // com.instagram.common.viewpoint.core.Ti
            public final boolean A5i(String str) {
                return this.A02.A0K(str);
            }

            @Override // com.instagram.common.viewpoint.core.Ti
            public final JSONArray A6k() {
                Cursor cursor = null;
                try {
                    cursor = this.A02.A0A();
                    JSONArray jSONArray = null;
                    if (cursor.getCount() > 0) {
                        jSONArray = A01(cursor);
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return jSONArray;
                } catch (JSONException unused) {
                    if (cursor != null) {
                        cursor.close();
                        return null;
                    }
                    return null;
                } catch (Throwable th) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }

            @Override // com.instagram.common.viewpoint.core.Ti
            public final JSONObject A6l() {
                Cursor cursor = null;
                try {
                    cursor = this.A02.A0B();
                    JSONObject jSONObject = null;
                    if (cursor.getCount() > 0) {
                        jSONObject = A03(cursor);
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return jSONObject;
                } catch (JSONException unused) {
                    if (cursor != null) {
                        cursor.close();
                        return null;
                    }
                    return null;
                } catch (Throwable th) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }

            @Override // com.instagram.common.viewpoint.core.Ti
            public final int A7u() {
                Cursor cursor = null;
                try {
                    cursor = this.A02.A09();
                    return cursor.moveToFirst() ? cursor.getInt(0) : 0;
                } finally {
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            }

            @Override // com.instagram.common.viewpoint.core.Ti
            public final String A7x(String str) {
                String str2 = null;
                Cursor A0D = this.A02.A0D(str);
                if (A0D != null) {
                    boolean moveToNext = A0D.moveToNext();
                    String[] strArr = A04;
                    String str3 = strArr[4];
                    String eventType = strArr[0];
                    if (str3.length() == eventType.length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A04;
                    strArr2[4] = "rCLG4kGmKo";
                    strArr2[0] = "2rihfjjJxsL3teC";
                    if (moveToNext && A0D.getCount() > 0) {
                        String eventType2 = C1132ct.A0A.A01;
                        str2 = A0D.getString(A0D.getColumnIndex(eventType2));
                    }
                    A0D.close();
                }
                return str2;
            }

            @Override // com.instagram.common.viewpoint.core.Ti
            public final Pair<JSONObject, JSONArray> A9A(int i) {
                Cursor cursor = null;
                try {
                    try {
                        cursor = this.A02.A0C(i);
                        JSONArray events = null;
                        JSONObject tokens = null;
                        if (cursor.getCount() > 0) {
                            tokens = A03(cursor);
                            events = A02(cursor);
                        }
                        Pair<JSONObject, JSONArray> pair = new Pair<>(tokens, events);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return pair;
                    } catch (JSONException unused) {
                        Pair<JSONObject, JSONArray> pair2 = new Pair<>(null, null);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return pair2;
                    }
                } catch (Throwable th) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }

            @Override // com.instagram.common.viewpoint.core.Ti
            public final boolean A9x(String str) {
                return this.A02.A0L(str);
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Tg != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
            @Override // com.instagram.common.viewpoint.core.InterfaceC0785Tj
            public final void AKL(UP up, AbstractC0783Tg<String> abstractC0783Tg) {
                this.A02.A0G(up.A08(), up.A05().A00, up.A06().toString(), up.A04(), up.A03(), up.A07(), up.A09(), abstractC0783Tg);
            }
        };
    }
}
