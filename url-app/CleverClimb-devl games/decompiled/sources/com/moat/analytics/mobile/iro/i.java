package com.moat.analytics.mobile.iro;

import android.os.Build;
import android.support.v7.widget.helper.ItemTouchHelper;
import com.moat.analytics.mobile.iro.t;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class i {

    /* renamed from: ʽ, reason: contains not printable characters */
    private static char f1157 = 5;

    /* renamed from: ʻ, reason: contains not printable characters */
    private static char[] f1156 = {'s', 'a', '2', 'b', 'c', '3', '4', '1', '8', '9', 'f', '0', '6', 'd', 'e', '5', 'o', 'n', 'i', 'p', 'l', 't', 'u', 'v', 'w'};

    /* renamed from: ᐝ, reason: contains not printable characters */
    private static int f1159 = 0;

    /* renamed from: ˊॱ, reason: contains not printable characters */
    private static int f1158 = 1;

    /* renamed from: ˊ, reason: contains not printable characters */
    private boolean f1160 = false;

    /* renamed from: ˏ, reason: contains not printable characters */
    private boolean f1163 = false;

    /* renamed from: ॱ, reason: contains not printable characters */
    private boolean f1164 = false;

    /* renamed from: ˎ, reason: contains not printable characters */
    private int f1162 = ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION;

    /* renamed from: ˋ, reason: contains not printable characters */
    private int f1161 = 10;

    i(String str) {
        m1252(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
    
        if ((r6 ? '\"' : 20) != 20) goto L23;
     */
    /* renamed from: ˊ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m1252(String str) {
        if (str == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(m1254(2, "\u0001\u0002", (byte) 59).intern());
            boolean equals = string.equals(m1254(40, "\u0003\u0004\u0000\t\u0007\b\r\b\u0005\u0006\u000b\f\f\u0011\u0007\r\u000e\u0000\b\u0012\t\f\u0004\r\u0004\u0000\u0001\u000e\u0007\u000b\u0005\u0007\n\u0011\b\t\u0007\f\u0004\u0003", (byte) 66).intern());
            boolean equals2 = string.equals(m1254(40, "\u0005\r\b\f\r\u0006\u0002\u0003\u000e\r\u0007\u0005\u0011\f\u0005\b\u0000\u0010\r\u0004\u0004\u000b\u0005\r\n\u0010\u0006\u000e\u000f\u0014\b\u0006\f\u0004\u0011\f\u0005\u0007\t\u0005", (byte) 43).intern());
            if (!(string.equals(m1254(2, "\u0011\u0012", (byte) 121).intern()))) {
                int i = f1159 + 91;
                f1158 = i % 128;
                int i2 = i % 2;
                if (!equals) {
                }
            }
            if (!m1253(jSONObject)) {
                if ((!m1256(jSONObject) ? '0' : 'J') != 'J') {
                    this.f1160 = true;
                    this.f1163 = equals;
                    this.f1164 = equals2;
                    if (!(!this.f1164)) {
                        int i3 = f1158 + 51;
                        f1159 = i3 % 128;
                        int i4 = i3 % 2;
                        this.f1163 = true;
                    }
                }
            }
            if (jSONObject.has(m1254(2, "\u0013\u0012", (byte) 25).intern())) {
                int i5 = jSONObject.getInt(m1254(2, "\u0013\u0012", (byte) 25).intern());
                if ((i5 >= 100 ? '8' : 'B') == '8') {
                    int i6 = f1159 + 117;
                    f1158 = i6 % 128;
                    int i7 = i6 % 2;
                    if ((i5 <= 1000 ? 'K' : '4') == 'K') {
                        int i8 = f1158 + 59;
                        f1159 = i8 % 128;
                        int i9 = i8 % 2;
                        this.f1162 = i5;
                    }
                }
            }
            if (!(!jSONObject.has(m1254(2, "\n\u0004", (byte) 24).intern()))) {
                int i10 = f1159 + 55;
                f1158 = i10 % 128;
                int i11 = i10 % 2;
                this.f1161 = jSONObject.getInt(m1254(2, "\n\u0004", (byte) 24).intern());
            }
            if ((m1255(jSONObject) ? 'G' : (char) 1) != 'G') {
                return;
            }
            int i12 = f1159 + 69;
            f1158 = i12 % 128;
            if (!(i12 % 2 == 0)) {
                ((j) MoatAnalytics.getInstance()).f1170 = true;
            } else {
                ((j) MoatAnalytics.getInstance()).f1170 = true;
            }
        } catch (Exception e) {
            this.f1160 = false;
            this.f1163 = false;
            this.f1162 = ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION;
            o.m1290(e);
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private static boolean m1253(JSONObject jSONObject) {
        try {
            if (!(16 > Build.VERSION.SDK_INT)) {
                if ((jSONObject.has(m1254(2, "\u0012\u0001", (byte) 62).intern()) ? 'M' : 'V') != 'V') {
                    JSONArray jSONArray = jSONObject.getJSONArray(m1254(2, "\u0012\u0001", (byte) 62).intern());
                    int length = jSONArray.length();
                    int i = 0;
                    while (true) {
                        if ((i < length ? '<' : 'G') != '<') {
                            break;
                        }
                        if ((jSONArray.getInt(i) == Build.VERSION.SDK_INT ? (char) 14 : (char) 26) == 14) {
                            return true;
                        }
                        i++;
                    }
                }
                return false;
            }
            int i2 = f1159 + 69;
            f1158 = i2 % 128;
            if ((i2 % 2 == 0 ? '?' : '\'') != '?') {
            }
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private static boolean m1256(JSONObject jSONObject) {
        try {
            if (jSONObject.has(m1254(2, "\u0004\u0010", (byte) 47).intern())) {
                String m1304 = p.m1297().m1304();
                JSONArray jSONArray = jSONObject.getJSONArray(m1254(2, "\u0004\u0010", (byte) 47).intern());
                int length = jSONArray.length();
                int i = 0;
                while (true) {
                    if ((i < length ? '\"' : '8') != '\"') {
                        break;
                    }
                    int i2 = f1158 + 115;
                    f1159 = i2 % 128;
                    int i3 = i2 % 2;
                    if (jSONArray.getString(i).contentEquals(m1304)) {
                        int i4 = f1158 + 47;
                        f1159 = i4 % 128;
                        int i5 = i4 % 2;
                        return true;
                    }
                    i++;
                }
            }
        } catch (Exception e) {
            o.m1290(e);
        }
        return false;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private static boolean m1255(JSONObject jSONObject) {
        try {
            if ((jSONObject.has(m1254(2, "\u0000\u0015", (byte) 3).intern()) ? (char) 23 : '7') == 23) {
                int i = f1159 + 73;
                f1158 = i % 128;
                int i2 = i % 2;
                String m1304 = p.m1297().m1304();
                JSONArray jSONArray = jSONObject.getJSONArray(m1254(2, "\u0000\u0015", (byte) 3).intern());
                int length = jSONArray.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    if (jSONArray.getString(i3).contentEquals(m1304)) {
                        return true;
                    }
                    i3++;
                }
            }
        } catch (Exception e) {
            o.m1290(e);
        }
        return false;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    final boolean m1257() {
        return this.f1163;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    final boolean m1259() {
        return this.f1164;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    final int m1258() {
        return this.f1162;
    }

    /* renamed from: ॱ, reason: contains not printable characters */
    final int m1261() {
        return this.f1161;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    final int m1260() {
        return this.f1160 ? t.c.f1247 : t.c.f1246;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private static String m1254(int i, String str, byte b2) {
        int i2 = i;
        char[] charArray = str.toCharArray();
        char[] cArr = f1156;
        char c2 = f1157;
        char[] cArr2 = new char[i2];
        if (!(i2 % 2 == 0)) {
            int i3 = f1158 + 99;
            f1159 = i3 % 128;
            int i4 = i3 % 2;
            i2--;
            cArr2[i2] = (char) (charArray[i2] - b2);
        }
        if (!(i2 <= 1)) {
            int i5 = f1158 + 125;
            f1159 = i5 % 128;
            if (i5 % 2 != 0) {
            }
            int i6 = 0;
            while (true) {
                if ((i6 < i2 ? 'c' : 'U') == 'U') {
                    break;
                }
                char c3 = charArray[i6];
                int i7 = i6 + 1;
                char c4 = charArray[i7];
                if ((c3 == c4 ? (char) 24 : '#') != '#') {
                    cArr2[i6] = (char) (c3 - b2);
                    cArr2[i7] = (char) (c4 - b2);
                } else {
                    int a2 = com.b.a.a.a(c3, c2);
                    int b3 = com.b.a.a.b(c3, c2);
                    int a3 = com.b.a.a.a(c4, c2);
                    int b4 = com.b.a.a.b(c4, c2);
                    if (!(b3 != b4)) {
                        int c5 = com.b.a.a.c(a2, c2);
                        int c6 = com.b.a.a.c(a3, c2);
                        int a4 = com.b.a.a.a(c5, b3, c2);
                        int a5 = com.b.a.a.a(c6, b4, c2);
                        cArr2[i6] = cArr[a4];
                        cArr2[i7] = cArr[a5];
                    } else {
                        if ((a2 == a3 ? '.' : '1') != '1') {
                            int c7 = com.b.a.a.c(b3, c2);
                            int c8 = com.b.a.a.c(b4, c2);
                            int a6 = com.b.a.a.a(a2, c7, c2);
                            int a7 = com.b.a.a.a(a3, c8, c2);
                            cArr2[i6] = cArr[a6];
                            cArr2[i7] = cArr[a7];
                        } else {
                            int a8 = com.b.a.a.a(a2, b4, c2);
                            int a9 = com.b.a.a.a(a3, b3, c2);
                            cArr2[i6] = cArr[a8];
                            cArr2[i7] = cArr[a9];
                        }
                    }
                }
                i6 += 2;
            }
        }
        return new String(cArr2);
    }
}
