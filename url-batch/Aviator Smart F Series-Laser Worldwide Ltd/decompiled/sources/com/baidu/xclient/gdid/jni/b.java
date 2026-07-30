package com.baidu.xclient.gdid.jni;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.baidu.xclient.gdid.e;
import com.baidu.xclient.gdid.k.d;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static volatile b f10756a;

    /* renamed from: b, reason: collision with root package name */
    public c f10757b;

    /* renamed from: c, reason: collision with root package name */
    public Context f10758c;

    public b(Context context) {
        this.f10758c = context;
        this.f10757b = c.a(context);
    }

    public static b a(Context context) {
        if (f10756a == null) {
            synchronized (b.class) {
                try {
                    if (f10756a == null) {
                        f10756a = new b(context);
                    }
                } finally {
                }
            }
        }
        return f10756a;
    }

    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            if (a.a(this.f10758c, jSONObject2, "2", 0, 1, jSONObject2.optInt("4", 0))) {
                String[] split = this.f10757b.e(Environment.getDataDirectory().getAbsolutePath()).split("\\|");
                if (TextUtils.isEmpty(split[0])) {
                    jSONObject.put(String.valueOf(12), 0);
                } else {
                    jSONObject.put(String.valueOf(12), Long.valueOf(split[0]));
                }
                if (!TextUtils.isEmpty(split[1])) {
                    jSONObject.put(String.valueOf(13), Long.valueOf(split[1]));
                    return;
                }
            } else {
                jSONObject.put(String.valueOf(12), 0);
            }
            jSONObject.put(String.valueOf(13), 0);
        } catch (Throwable th) {
            d.a(th);
        }
    }

    public final void c(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            if (a.a(this.f10758c, jSONObject2, "s", 1, 1, jSONObject2.optInt("4", 0))) {
                String c8 = com.baidu.xclient.gdid.d.a().c("sl");
                if (TextUtils.isEmpty(c8)) {
                    jSONObject.put(String.valueOf(57), 0);
                } else if (TextUtils.isEmpty(c8)) {
                    jSONObject.put(String.valueOf(57), 0);
                } else {
                    jSONObject.put(String.valueOf(57), com.baidu.mshield.b.f.c.a(c8));
                }
            }
        } catch (Throwable th) {
            d.a(th);
        }
    }

    public String a() {
        try {
            JSONObject jSONObject = new JSONObject(e.e().k());
            JSONObject jSONObject2 = new JSONObject();
            a(jSONObject2);
            a(jSONObject2, jSONObject);
            b(jSONObject2, jSONObject);
            a(this.f10758c, jSONObject2, jSONObject);
            c(jSONObject2, jSONObject);
            a(this.f10758c, jSONObject2, true);
            a(this.f10758c, jSONObject2, false);
            a(jSONObject2, true);
            a(jSONObject2, false);
            byte[] a8 = this.f10757b.a(jSONObject2.toString().getBytes());
            return a8 == null ? "" : Base64.encodeToString(a8, 10);
        } catch (Throwable th) {
            d.a(th);
            return "";
        }
    }

    public final JSONObject a(Context context, JSONObject jSONObject, int i8, int i9) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            Iterator<String> keys = jSONObject.keys();
            int i10 = 1;
            while (keys.hasNext()) {
                String next = keys.next();
                if (i10 < i8) {
                    i10++;
                } else {
                    if (i10 >= i8 + i9) {
                        break;
                    }
                    i10++;
                    String optString = jSONObject.optString(next);
                    if (!TextUtils.isEmpty(optString)) {
                        PackageInfo a8 = com.baidu.mshield.b.e.c.a(context, optString, 0);
                        JSONObject jSONObject3 = new JSONObject();
                        if (a8 == null) {
                            jSONObject3.put("0", -1);
                            jSONObject3.put("1", "");
                            jSONObject3.put("2", 0);
                            jSONObject3.put(ExifInterface.GPS_MEASUREMENT_3D, 0);
                        } else {
                            jSONObject3.put("0", 0);
                            jSONObject3.put("1", a8.versionName);
                            jSONObject3.put("2", a8.firstInstallTime);
                            jSONObject3.put(ExifInterface.GPS_MEASUREMENT_3D, a8.lastUpdateTime);
                        }
                        jSONObject2.put(next, jSONObject3);
                    }
                }
            }
        } catch (Throwable th) {
            d.a(th);
        }
        return jSONObject2;
    }

    public final JSONObject a(JSONObject jSONObject, int i8, int i9) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            Iterator<String> keys = jSONObject.keys();
            int i10 = 1;
            while (keys.hasNext()) {
                String next = keys.next();
                if (i10 < i8) {
                    i10++;
                } else {
                    if (i10 >= i8 + i9) {
                        break;
                    }
                    i10++;
                    String optString = jSONObject.optString(next);
                    if (!TextUtils.isEmpty(optString)) {
                        jSONObject2.put(next, new JSONObject(this.f10757b.a(optString)));
                    }
                }
            }
        } catch (Throwable th) {
            d.a(th);
        }
        return jSONObject2;
    }

    public final void a(Context context, JSONObject jSONObject, JSONObject jSONObject2) {
        PackageInfo a8;
        try {
            if (a.a(this.f10758c, jSONObject2, "1", 0, 1, jSONObject2.optInt("4", 0)) && (a8 = com.baidu.mshield.b.e.c.a(context, com.baidu.xclient.gdid.d.a().a(context), 0)) != null) {
                jSONObject.put(String.valueOf(20), a8.firstInstallTime);
                a(jSONObject, 52, this.f10757b.d());
                jSONObject.put(String.valueOf(54), this.f10757b.c());
                a(jSONObject, 58, this.f10757b.b());
                String[] a9 = a.a(this.f10757b.b("/proc/cpuinfo"));
                a(jSONObject, 60, a9[0]);
                a(jSONObject, 61, a9[1]);
                jSONObject.put(String.valueOf(62), d.c());
            }
            jSONObject.put(String.valueOf(20), 0);
            a(jSONObject, 52, this.f10757b.d());
            jSONObject.put(String.valueOf(54), this.f10757b.c());
            a(jSONObject, 58, this.f10757b.b());
            String[] a92 = a.a(this.f10757b.b("/proc/cpuinfo"));
            a(jSONObject, 60, a92[0]);
            a(jSONObject, 61, a92[1]);
            jSONObject.put(String.valueOf(62), d.c());
        } catch (Throwable th) {
            d.a(th);
        }
    }

    public final void a(Context context, JSONObject jSONObject, boolean z7) {
        int optInt;
        String str;
        int z8;
        int i8;
        try {
            JSONObject jSONObject2 = new JSONObject(e.e().k());
            int i9 = 20;
            if (z7) {
                String optString = jSONObject2.optString("9");
                optInt = jSONObject2.optInt("x", 20);
                str = optString;
                z8 = e.e().A();
                i8 = 22;
            } else {
                String r8 = e.e().r();
                optInt = jSONObject2.optInt("y", 20);
                str = r8;
                z8 = e.e().z();
                i8 = 21;
            }
            if (optInt <= 20 && optInt != 0) {
                i9 = optInt;
            }
            if (a.a(this.f10758c, jSONObject2, "", 0, 1, jSONObject2.optInt("4", 0))) {
                if (!TextUtils.isEmpty(str)) {
                    str = this.f10757b.d(str);
                }
                if (TextUtils.isEmpty(str)) {
                    jSONObject.put(String.valueOf(i8), new JSONObject());
                    return;
                }
                JSONObject jSONObject3 = new JSONObject(str);
                int length = jSONObject3.length();
                Pair<Integer, Integer> a8 = a.a(z8, length, i9);
                int intValue = ((Integer) a8.first).intValue();
                int intValue2 = ((Integer) a8.second).intValue();
                jSONObject.put(String.valueOf(i8), a(context, jSONObject3, intValue, intValue2));
                int i10 = intValue + intValue2;
                if (i10 <= length) {
                    length = i10;
                }
                if (z7) {
                    e.e().h(length);
                } else {
                    e.e().g(length);
                }
            }
        } catch (Throwable th) {
            d.a(th);
        }
    }

    public final void a(JSONObject jSONObject) {
        try {
            a(jSONObject, 3, this.f10757b.f());
            a(jSONObject, 4, com.baidu.xclient.gdid.d.a().c("mod"));
            a(jSONObject, 5, this.f10757b.k());
            a(jSONObject, 6, this.f10757b.j());
            a(jSONObject, 7, this.f10757b.i());
            a(jSONObject, 8, this.f10757b.h());
            a(jSONObject, 9, this.f10757b.g());
            a(jSONObject, 50, this.f10757b.c("ro.build.fingerprint"));
            a(jSONObject, 53, com.baidu.xclient.gdid.d.a().c("arv"));
        } catch (Throwable th) {
            d.a(th);
        }
    }

    public final void a(JSONObject jSONObject, int i8, String str) {
        try {
            String valueOf = String.valueOf(i8);
            if (str == null) {
                str = "";
            }
            jSONObject.put(valueOf, str);
        } catch (Throwable th) {
            d.a(th);
        }
    }

    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            if (a.a(this.f10758c, jSONObject2, "2", 0, 1, jSONObject2.optInt("4", 0))) {
                String[] split = this.f10757b.e(Environment.getExternalStorageDirectory().getAbsolutePath()).split("\\|");
                if (TextUtils.isEmpty(split[0])) {
                    jSONObject.put(String.valueOf(10), 0);
                } else {
                    jSONObject.put(String.valueOf(10), Long.valueOf(split[0]));
                }
                if (!TextUtils.isEmpty(split[1])) {
                    jSONObject.put(String.valueOf(11), Long.valueOf(split[1]));
                    return;
                }
            } else {
                jSONObject.put(String.valueOf(10), 0);
            }
            jSONObject.put(String.valueOf(11), 0);
        } catch (Throwable th) {
            d.a(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006a, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(JSONObject jSONObject, boolean z7) {
        boolean a8;
        String s7;
        int optInt;
        int a9;
        int i8;
        try {
            JSONObject jSONObject2 = new JSONObject(e.e().k());
            int optInt2 = jSONObject2.optInt("4", 0);
            int i9 = 20;
            if (z7) {
                a8 = a.a(this.f10758c, jSONObject2, "", 0, 1, optInt2);
                s7 = jSONObject2.optString("10");
                optInt = jSONObject2.optInt("u", 20);
                a9 = e.e().b();
                i8 = 59;
            } else {
                a8 = a.a(this.f10758c, jSONObject2, "", 0, 1, optInt2);
                s7 = e.e().s();
                optInt = jSONObject2.optInt(MapBundleKey.MapObjKey.OBJ_SS_ARROW_Z, 20);
                a9 = e.e().a();
                i8 = 56;
            }
            if (optInt <= 20 && optInt != 0) {
                i9 = optInt;
            }
            if (!TextUtils.isEmpty(s7)) {
                s7 = this.f10757b.d(s7);
            }
            if (TextUtils.isEmpty(s7)) {
                jSONObject.put(String.valueOf(i8), new JSONObject());
                return;
            }
            JSONObject jSONObject3 = new JSONObject(s7);
            int length = jSONObject3.length();
            Pair<Integer, Integer> a10 = a.a(a9, length, i9);
            int intValue = ((Integer) a10.first).intValue();
            int intValue2 = ((Integer) a10.second).intValue();
            jSONObject.put(String.valueOf(i8), a(jSONObject3, intValue, intValue2));
            int i10 = intValue + intValue2;
            if (i10 <= length) {
                length = i10;
            }
            if (z7) {
                e.e().j(length);
            } else {
                e.e().i(length);
            }
        } catch (Throwable th) {
            d.a(th);
        }
    }
}
