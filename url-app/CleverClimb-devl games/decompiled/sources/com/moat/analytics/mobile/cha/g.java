package com.moat.analytics.mobile.cha;

import android.os.Build;
import android.support.v7.widget.helper.ItemTouchHelper;
import com.moat.analytics.mobile.cha.t;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class g {

    /* renamed from: ʼ, reason: contains not printable characters */
    private static int f892 = 565428102;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static int f893 = -1138247343;

    /* renamed from: ˊॱ, reason: contains not printable characters */
    private static int f894 = 117;

    /* renamed from: ᐝ, reason: contains not printable characters */
    private static byte[] f896 = {-73, 79, -77, Byte.MAX_VALUE, -123, -125, -126, 73, 125, -81, 81, -77, 81, Byte.MAX_VALUE, -83, -121, 73, -78, Byte.MAX_VALUE, 85, -82, Byte.MIN_VALUE, 77, -79, 77, -80, -126, 123, -124, 77, -125, -87, -123, 117, -123, 120, -122, 82, -83, Byte.MIN_VALUE, -69, -66, 65, -78, 65, -66, 119, -120, -72, 70, 117, -116, 77, -66, -65, 112, -108, 105, -66, 69, 71, -118, 110, -118, 66, -78, 65, 71, -65, 68, 104, -120, 107, -109, -78, 118, -119, 113, -108, -91, -81, -5, 80, -25, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: ʻ, reason: contains not printable characters */
    private static int f891 = 0;

    /* renamed from: ॱˋ, reason: contains not printable characters */
    private static int f895 = 1;

    /* renamed from: ˏ, reason: contains not printable characters */
    private boolean f900 = false;

    /* renamed from: ˎ, reason: contains not printable characters */
    private boolean f899 = false;

    /* renamed from: ˊ, reason: contains not printable characters */
    private boolean f897 = false;

    /* renamed from: ॱ, reason: contains not printable characters */
    private int f901 = ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION;

    /* renamed from: ˋ, reason: contains not printable characters */
    private int f898 = 10;

    g(String str) {
        m1037(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        if ((!r3) != true) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x013b, code lost:
    
        if ((r10 >= 100 ? 'M' : 19) != 19) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00cc  */
    /* renamed from: ॱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m1037(String str) {
        JSONObject jSONObject;
        int i;
        if (str == null) {
            return;
        }
        try {
            jSONObject = new JSONObject(str);
            String string = jSONObject.getString(m1034(-115, 1138247458, (byte) 89, -565428102).intern());
            boolean equals = string.equals(m1034(-77, 1138247394, (byte) -126, -565428101).intern());
            boolean equals2 = string.equals(m1034(-77, 1138247399, (byte) -70, -565428062).intern());
            if ((!string.equals(m1034(-115, 1138247454, (byte) 90, -565428023).intern()) ? 'B' : (char) 2) == 'B') {
                if (!(equals)) {
                    int i2 = f895 + 57;
                    f891 = i2 % 128;
                    int i3 = i2 % 2;
                }
            }
            if ((!m1036(jSONObject) ? '+' : '8') == '+') {
                int i4 = f891 + 95;
                f895 = i4 % 128;
                if ((i4 % 2 == 0 ? 'P' : (char) 6) != 6) {
                    if ((!m1035(jSONObject) ? '<' : 'E') != 'E') {
                        this.f900 = true;
                        this.f899 = equals;
                        this.f897 = equals2;
                        if (!this.f897) {
                            int i5 = f895 + 81;
                            f891 = i5 % 128;
                            if (i5 % 2 != 0) {
                            }
                            this.f899 = true;
                        }
                    }
                } else {
                    if (m1035(jSONObject)) {
                    }
                    this.f900 = true;
                    this.f899 = equals;
                    this.f897 = equals2;
                    if (!this.f897) {
                    }
                }
            }
        } catch (Exception e) {
            this.f900 = false;
            this.f899 = false;
            this.f901 = ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION;
            o.m1110(e);
            return;
        }
        if ((jSONObject.has(m1034(-115, 1138247448, (byte) -86, -565428022).intern()) ? (char) 27 : 'K') != 'K') {
            int i6 = f891 + 77;
            f895 = i6 % 128;
            if (!(i6 % 2 == 0)) {
                i = jSONObject.getInt(m1034(-115, 1138247448, (byte) -86, -565428022).intern());
                if (i >= 100) {
                    if (i <= 1000) {
                        this.f901 = i;
                    }
                }
            } else {
                i = jSONObject.getInt(m1034(-115, 1138247448, (byte) -86, -565428022).intern());
            }
            this.f900 = false;
            this.f899 = false;
            this.f901 = ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION;
            o.m1110(e);
            return;
        }
        if (!(!jSONObject.has(m1034(-115, 1138247444, (byte) -11, -565428021).intern()))) {
            int i7 = f891 + 53;
            f895 = i7 % 128;
            this.f898 = i7 % 2 != 0 ? jSONObject.getInt(m1034(-115, 1138247444, (byte) -11, -565428021).intern()) : jSONObject.getInt(m1034(-115, 1138247444, (byte) -11, -565428021).intern());
        }
        if ((m1038(jSONObject) ? (char) 28 : '`') != 28) {
            return;
        }
        int i8 = f891 + 23;
        f895 = i8 % 128;
        int i9 = i8 % 2;
        ((f) MoatAnalytics.getInstance()).f887 = true;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private static boolean m1036(JSONObject jSONObject) {
        try {
            if ((16 > Build.VERSION.SDK_INT ? ':' : '$') == '$') {
                if (!(!jSONObject.has(m1034(-115, 1138247454, (byte) -93, -565428020).intern()))) {
                    int i = f891 + 71;
                    f895 = i % 128;
                    JSONArray jSONArray = (i % 2 == 0 ? '`' : '8') != '`' ? jSONObject.getJSONArray(m1034(-115, 1138247454, (byte) -93, -565428020).intern()) : jSONObject.getJSONArray(m1034(-115, 1138247454, (byte) -93, -565428020).intern());
                    int length = jSONArray.length();
                    JSONArray jSONArray2 = jSONArray;
                    int i2 = 0;
                    while (true) {
                        if ((i2 < length ? ')' : (char) 24) == 24) {
                            break;
                        }
                        if (!(jSONArray2.getInt(i2) != Build.VERSION.SDK_INT)) {
                            int i3 = f891 + 65;
                            f895 = i3 % 128;
                            int i4 = i3 % 2;
                            return true;
                        }
                        i2++;
                    }
                }
                return false;
            }
            int i5 = f895 + 43;
            f891 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private static boolean m1035(JSONObject jSONObject) {
        String m1134;
        JSONArray jSONArray;
        try {
            if ((jSONObject.has(m1034(-115, 1138247440, (byte) -24, -565428019).intern()) ? (char) 14 : (char) 18) != 18) {
                int i = f891 + 113;
                f895 = i % 128;
                if (i % 2 == 0) {
                    m1134 = r.m1124().m1134();
                    jSONArray = jSONObject.getJSONArray(m1034(-115, 1138247440, (byte) -24, -565428019).intern());
                } else {
                    m1134 = r.m1124().m1134();
                    jSONArray = jSONObject.getJSONArray(m1034(-115, 1138247440, (byte) -24, -565428019).intern());
                }
                int length = jSONArray.length();
                JSONArray jSONArray2 = jSONArray;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    if ((jSONArray2.getString(i2).contentEquals(m1134) ? (char) 23 : 'X') == 23) {
                        int i3 = f895 + 71;
                        f891 = i3 % 128;
                        if ((i3 % 2 != 0 ? (char) 4 : 'O') != 'O') {
                        }
                        return true;
                    }
                    i2++;
                }
            }
        } catch (Exception e) {
            o.m1110(e);
        }
        return false;
    }

    /* renamed from: ॱ, reason: contains not printable characters */
    private static boolean m1038(JSONObject jSONObject) {
        try {
            if ((jSONObject.has(m1034(-115, 1138247440, (byte) 1, -565428018).intern()) ? '8' : (char) 19) == '8') {
                int i = f891 + 99;
                f895 = i % 128;
                int i2 = i % 2;
                String m1134 = r.m1124().m1134();
                JSONArray jSONArray = jSONObject.getJSONArray(m1034(-115, 1138247440, (byte) 1, -565428018).intern());
                int length = jSONArray.length();
                int i3 = 0;
                while (true) {
                    if (!(i3 >= length)) {
                        int i4 = f891 + 49;
                        f895 = i4 % 128;
                        if ((i4 % 2 == 0 ? (char) 0 : 'X') == 0) {
                            if ((jSONArray.getString(i3).contentEquals(m1134) ? '>' : 'I') == '>') {
                                break;
                            }
                            i3++;
                        } else {
                            if ((jSONArray.getString(i3).contentEquals(m1134) ? (char) 11 : 'K') != 'K') {
                                break;
                            }
                            i3++;
                        }
                    } else {
                        break;
                    }
                }
                return true;
            }
        } catch (Exception e) {
            o.m1110(e);
        }
        return false;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    final boolean m1039() {
        return this.f899;
    }

    /* renamed from: ॱ, reason: contains not printable characters */
    final boolean m1043() {
        return this.f897;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    final int m1042() {
        return this.f901;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    final int m1041() {
        return this.f898;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    final int m1040() {
        return this.f900 ? t.a.f1022 : t.a.f1023;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private static String m1034(int i, int i2, byte b2, int i3) {
        StringBuilder sb = new StringBuilder();
        int i4 = i + f894;
        boolean z = !(i4 != -1);
        short[] sArr = null;
        if (z) {
            if (f896 == null) {
                i4 = (short) (sArr[f892 + i3] + f894);
            } else {
                int i5 = f895 + 87;
                f891 = i5 % 128;
                i4 = (byte) ((!(i5 % 2 == 0) ? f896[f892 + i3] : f896[f892 + i3]) + f894);
            }
        }
        if ((i4 > 0 ? '=' : (char) 24) != 24) {
            int i6 = ((i3 + i4) - 2) + f892 + ((z ? 'Q' : 'V') == 'Q' ? 1 : 0);
            char c2 = (char) (i2 + f893);
            sb.append(c2);
            char c3 = c2;
            int i7 = 1;
            while (true) {
                if ((i7 < i4 ? 'U' : ',') == ',') {
                    break;
                }
                int i8 = f891 + 1;
                f895 = i8 % 128;
                int i9 = i8 % 2;
                if ((f896 != null ? 'B' : 'E') == 'B') {
                    c3 = (char) (c3 + (f896[i6] ^ b2));
                    i6--;
                } else {
                    c3 = (char) (c3 + (sArr[i6] ^ b2));
                    i6--;
                }
                sb.append(c3);
                i7++;
            }
        }
        return sb.toString();
    }
}
