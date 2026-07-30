package com.baidu.mshield.rp.b;

import androidx.exifinterface.media.ExifInterface;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public String f8341a;

    /* renamed from: b, reason: collision with root package name */
    public String f8342b;

    /* renamed from: c, reason: collision with root package name */
    public String f8343c;

    /* renamed from: d, reason: collision with root package name */
    public String f8344d;

    /* renamed from: e, reason: collision with root package name */
    public String f8345e;

    public static String a(a aVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0", aVar.f8341a);
            jSONObject.put("1", aVar.f8343c);
            jSONObject.put("2", aVar.f8344d);
            jSONObject.put(ExifInterface.GPS_MEASUREMENT_3D, aVar.f8345e);
            jSONObject.put("4", aVar.f8342b);
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
        }
        return jSONObject.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        try {
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f8344d;
        if (str == null) {
            if (aVar.f8344d != null) {
                return false;
            }
        } else if (!str.equals(aVar.f8344d)) {
            return false;
        }
        String str2 = this.f8345e;
        if (str2 == null) {
            if (aVar.f8345e != null) {
                return false;
            }
        } else if (!str2.equals(aVar.f8345e)) {
            return false;
        }
        String str3 = this.f8342b;
        if (str3 == null) {
            if (aVar.f8342b != null) {
                return false;
            }
        } else if (!str3.equals(aVar.f8342b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i8 = 0;
        try {
            String str = this.f8344d;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
            String str2 = this.f8345e;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f8342b;
            if (str3 != null) {
                i8 = str3.hashCode();
            }
            return hashCode2 + i8;
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
            return 0;
        }
    }

    public static a a(String str) {
        a aVar = new a();
        try {
            JSONObject jSONObject = new JSONObject(str);
            aVar.f8341a = jSONObject.optString("0");
            aVar.f8343c = jSONObject.optString("1");
            aVar.f8344d = jSONObject.optString("2");
            aVar.f8345e = jSONObject.optString(ExifInterface.GPS_MEASUREMENT_3D);
            aVar.f8342b = jSONObject.optString("4");
            return aVar;
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
            return null;
        }
    }
}
