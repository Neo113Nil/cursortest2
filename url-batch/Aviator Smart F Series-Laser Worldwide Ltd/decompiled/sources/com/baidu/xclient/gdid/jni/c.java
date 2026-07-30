package com.baidu.xclient.gdid.jni;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.baidu.xclient.gdid.k.d;
import java.security.SecureRandom;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static volatile c f10759a;

    /* renamed from: b, reason: collision with root package name */
    public Native f10760b = new Native();

    /* renamed from: c, reason: collision with root package name */
    public Context f10761c;

    /* renamed from: d, reason: collision with root package name */
    public String f10762d;

    /* renamed from: e, reason: collision with root package name */
    public String f10763e;

    /* renamed from: f, reason: collision with root package name */
    public String f10764f;

    /* renamed from: g, reason: collision with root package name */
    public String f10765g;

    /* renamed from: h, reason: collision with root package name */
    public String f10766h;

    /* renamed from: i, reason: collision with root package name */
    public String f10767i;

    public c(Context context) {
        this.f10761c = context;
    }

    public static c a(Context context) {
        if (f10759a == null) {
            synchronized (c.class) {
                try {
                    if (f10759a == null) {
                        f10759a = new c(context);
                    }
                } finally {
                }
            }
        }
        return f10759a;
    }

    public String b() {
        String str = null;
        try {
            str = (String) this.f10760b.jnictl(6, null, null, null);
        } catch (Throwable th) {
            d.a(th);
        }
        return str == null ? "" : str;
    }

    public int c() {
        String str = null;
        try {
            str = (String) this.f10760b.jnictl(7, null, null, null);
        } catch (Throwable th) {
            d.a(th);
        }
        if (str == null) {
            return 0;
        }
        return Integer.parseInt(str);
    }

    public String d() {
        String str = null;
        try {
            str = (String) this.f10760b.jnictl(14, null, null, null);
        } catch (Throwable th) {
            d.a(th);
        }
        return TextUtils.isEmpty(str) ? "" : str;
    }

    public String e() {
        try {
            return (String) this.f10760b.jnictl(17, null, null, null);
        } catch (Throwable th) {
            d.a(th);
            return "";
        }
    }

    public String f() {
        if (!com.baidu.sec.privacy.e.a.a(this.f10761c).a()) {
            return "";
        }
        if (TextUtils.isEmpty(this.f10762d)) {
            this.f10762d = c("ro.product.manufacturer");
        }
        if (TextUtils.isEmpty(this.f10762d)) {
            this.f10762d = Build.MANUFACTURER;
        }
        return this.f10762d;
    }

    public String g() {
        if (!com.baidu.sec.privacy.e.a.a(this.f10761c).a()) {
            return "";
        }
        if (TextUtils.isEmpty(this.f10763e)) {
            this.f10763e = c("ro.product.name");
        }
        if (TextUtils.isEmpty(this.f10763e)) {
            this.f10763e = Build.PRODUCT;
        }
        return this.f10763e;
    }

    public String h() {
        if (!com.baidu.sec.privacy.e.a.a(this.f10761c).a()) {
            return "";
        }
        if (TextUtils.isEmpty(this.f10764f)) {
            this.f10764f = c("ro.hardware");
        }
        if (TextUtils.isEmpty(this.f10764f)) {
            this.f10764f = Build.HARDWARE;
        }
        return this.f10764f;
    }

    public String i() {
        if (!com.baidu.sec.privacy.e.a.a(this.f10761c).a()) {
            return "";
        }
        if (TextUtils.isEmpty(this.f10765g)) {
            this.f10765g = c("ro.product.device");
        }
        if (TextUtils.isEmpty(this.f10765g)) {
            this.f10765g = Build.DEVICE;
        }
        return this.f10765g;
    }

    public String j() {
        if (!com.baidu.sec.privacy.e.a.a(this.f10761c).a()) {
            return "";
        }
        if (TextUtils.isEmpty(this.f10766h)) {
            this.f10766h = c("ro.product.board");
        }
        if (TextUtils.isEmpty(this.f10766h)) {
            this.f10766h = Build.BOARD;
        }
        return this.f10766h;
    }

    public String k() {
        if (!com.baidu.sec.privacy.e.a.a(this.f10761c).a()) {
            return "";
        }
        if (TextUtils.isEmpty(this.f10767i)) {
            this.f10767i = c("ro.product.brand");
        }
        if (TextUtils.isEmpty(this.f10767i)) {
            this.f10767i = Build.BRAND;
        }
        return this.f10767i;
    }

    public Object a(int i8, Object obj, Object obj2, Object obj3) {
        try {
            return this.f10760b.jnictl(i8, obj, obj2, obj3);
        } catch (Throwable th) {
            d.a(th);
            return null;
        }
    }

    public String b(String str) {
        String str2 = null;
        try {
            byte[] bArr = (byte[]) this.f10760b.jnictl(9, str, null, null);
            if (bArr != null) {
                str2 = new String(bArr);
            }
        } catch (Throwable th) {
            d.a(th);
        }
        return str2 == null ? "" : str2;
    }

    public String c(String str) {
        String str2 = null;
        try {
            str2 = (String) this.f10760b.jnictl(10, str, null, null);
        } catch (Throwable th) {
            d.a(th);
        }
        return str2 == null ? "" : str2;
    }

    public String d(String str) {
        String str2 = null;
        try {
            str2 = (String) this.f10760b.jnictl(11, str, null, null);
        } catch (Throwable th) {
            d.a(th);
        }
        return str2 == null ? "" : str2;
    }

    public String e(String str) {
        String str2;
        try {
            str2 = (String) this.f10760b.jnictl(13, str, null, null);
        } catch (Throwable th) {
            d.a(th);
            str2 = "";
        }
        return TextUtils.isEmpty(str2) ? b5.b.VERTICAL : str2;
    }

    public String a() {
        return this.f10760b.a();
    }

    public String a(String str) {
        String str2 = null;
        try {
            str2 = (String) this.f10760b.jnictl(8, str, null, null);
        } catch (Throwable th) {
            d.a(th);
        }
        return str2 == null ? "" : str2;
    }

    public byte[] a(byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    byte[] bArr2 = new byte[8];
                    new SecureRandom().nextBytes(bArr2);
                    byte[] bArr3 = new byte[bArr.length + 8];
                    System.arraycopy(bArr2, 0, bArr3, 0, 8);
                    System.arraycopy(bArr, 0, bArr3, 8, bArr.length);
                    return (byte[]) this.f10760b.jnictl(12, bArr3, null, null);
                }
            } catch (Throwable th) {
                d.a(th);
            }
        }
        return null;
    }
}
