package com.baidu.mshield.x0.l;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.mshield.x0.d.d;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public String f8489a;

    /* renamed from: b, reason: collision with root package name */
    public String f8490b;

    /* renamed from: c, reason: collision with root package name */
    public String f8491c;

    /* renamed from: d, reason: collision with root package name */
    public String f8492d;

    /* renamed from: e, reason: collision with root package name */
    public String f8493e;

    public static b a(String str) {
        b bVar = new b();
        try {
            JSONObject jSONObject = new JSONObject(str);
            bVar.f8489a = jSONObject.optString("0");
            bVar.f8491c = jSONObject.optString("1");
            bVar.f8492d = jSONObject.optString("2");
            bVar.f8493e = jSONObject.optString(ExifInterface.GPS_MEASUREMENT_3D);
            bVar.f8490b = jSONObject.optString("4");
            return bVar;
        } catch (Throwable th) {
            d.a(th);
            return null;
        }
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
            d.a(th);
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.f8492d;
        if (str == null) {
            if (bVar.f8492d != null) {
                return false;
            }
        } else if (!str.equals(bVar.f8492d)) {
            return false;
        }
        String str2 = this.f8493e;
        if (str2 == null) {
            if (bVar.f8493e != null) {
                return false;
            }
        } else if (!str2.equals(bVar.f8493e)) {
            return false;
        }
        String str3 = this.f8490b;
        if (str3 == null) {
            if (bVar.f8490b != null) {
                return false;
            }
        } else if (!str3.equals(bVar.f8490b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i8 = 1;
        try {
            String str = this.f8492d;
            int i9 = 0;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
            String str2 = this.f8493e;
            i8 = (str2 == null ? 0 : str2.hashCode()) + hashCode;
            int i10 = i8 * 31;
            String str3 = this.f8490b;
            if (str3 != null) {
                i9 = str3.hashCode();
            }
            return i10 + i9;
        } catch (Throwable th) {
            d.a(th);
            return i8;
        }
    }
}
