package com.baidu.mshield.x6.f;

import android.text.TextUtils;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public class d {
    public static int a(int i8, String str) {
        int a8;
        try {
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 0) {
                return -1;
            }
            if (jSONArray.length() == 1) {
                return jSONArray.optInt(0);
            }
            if (i8 == 1) {
                a8 = a(jSONArray);
            } else if (i8 == 2) {
                a8 = d(jSONArray);
            } else if (i8 == 3) {
                a8 = e(jSONArray);
            } else if (i8 == 4) {
                a8 = b(jSONArray);
            } else {
                if (i8 != 5) {
                    return -1;
                }
                a8 = c(jSONArray);
            }
            return a8;
        } catch (Throwable th) {
            f.b(th);
            return -1;
        }
    }

    public static int b(JSONArray jSONArray) {
        int i8 = 0;
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    if (jSONArray.length() == 1) {
                        return jSONArray.optInt(0);
                    }
                    i8 = jSONArray.optInt(0);
                    for (int i9 = 1; i9 < jSONArray.length(); i9++) {
                        i8 <<= jSONArray.optInt(i9);
                    }
                }
            } catch (Throwable th) {
                f.b(th);
            }
        }
        return i8;
    }

    public static int c(JSONArray jSONArray) {
        int i8 = 0;
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    if (jSONArray.length() == 1) {
                        return jSONArray.optInt(0);
                    }
                    i8 = jSONArray.optInt(0);
                    for (int i9 = 1; i9 < jSONArray.length(); i9++) {
                        i8 >>= jSONArray.optInt(i9);
                    }
                }
            } catch (Throwable th) {
                f.b(th);
            }
        }
        return i8;
    }

    public static int d(JSONArray jSONArray) {
        int i8 = 0;
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    if (jSONArray.length() == 1) {
                        return jSONArray.optInt(0);
                    }
                    i8 = jSONArray.optInt(0);
                    for (int i9 = 1; i9 < jSONArray.length(); i9++) {
                        i8 |= jSONArray.optInt(i9);
                    }
                }
            } catch (Throwable th) {
                f.b(th);
            }
        }
        return i8;
    }

    public static int e(JSONArray jSONArray) {
        int i8 = 0;
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    if (jSONArray.length() == 1) {
                        return jSONArray.optInt(0);
                    }
                    i8 = jSONArray.optInt(0);
                    for (int i9 = 1; i9 < jSONArray.length(); i9++) {
                        i8 ^= jSONArray.optInt(i9);
                    }
                }
            } catch (Throwable th) {
                f.b(th);
            }
        }
        return i8;
    }

    public static int a(JSONArray jSONArray) {
        int i8 = 0;
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    if (jSONArray.length() == 1) {
                        return jSONArray.optInt(0);
                    }
                    i8 = jSONArray.optInt(0);
                    for (int i9 = 1; i9 < jSONArray.length(); i9++) {
                        i8 &= jSONArray.optInt(i9);
                    }
                }
            } catch (Throwable th) {
                f.b(th);
            }
        }
        return i8;
    }
}
