package com.baidu.ar.auth;

import android.content.Context;
import android.graphics.Bitmap;
import com.baidu.ar.callback.ICallbackWith;
import com.baidu.ar.n3;
import com.baidu.ar.q5;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ARAuth {

    /* renamed from: a, reason: collision with root package name */
    public static n3<q5> f1762a = new n3<>("com.baidu.ar.auth.ARAuthFacade");

    public static void a(int i8) {
        q5 b8 = f1762a.b();
        if (b8 != null) {
            b8.c(i8);
        }
    }

    public static List<Integer> checkAuth(Context context, byte[] bArr, IDuMixAuthCallback iDuMixAuthCallback) {
        q5 b8 = f1762a.b();
        return b8 != null ? b8.a(context, bArr, iDuMixAuthCallback) : new ArrayList();
    }

    public static boolean checkFeatureAuth(int i8) {
        q5 b8 = f1762a.b();
        if (b8 != null) {
            return b8.b(i8);
        }
        return true;
    }

    public static boolean checkOfflineLicenseAuth(Context context, byte[] bArr) {
        q5 b8 = f1762a.b();
        if (b8 != null) {
            return b8.a(context, bArr);
        }
        return true;
    }

    public static Bitmap createTipBitmap(Context context) {
        q5 b8 = f1762a.b();
        if (b8 != null) {
            return b8.a(context);
        }
        return null;
    }

    public static void doAuth(Context context, IAuthCallback iAuthCallback) {
        AuthJni.init();
        q5 b8 = f1762a.b();
        if (b8 != null) {
            b8.a(context, iAuthCallback);
        }
    }

    public static boolean enableFeature(int i8) {
        q5 b8 = f1762a.b();
        if (b8 != null) {
            return b8.a(i8);
        }
        return true;
    }

    public static boolean isShowAuthTip() {
        q5 b8 = f1762a.b();
        if (b8 != null) {
            return b8.a();
        }
        return true;
    }

    public static void loadAuthInfo(Context context) {
        q5 b8 = f1762a.b();
        if (b8 != null) {
            b8.b(context);
        }
    }

    public static void loadWhiteAuthInfo(Context context) {
        q5 b8 = f1762a.b();
        if (b8 != null) {
            b8.c(context);
        }
    }

    public static void release() {
        q5 a8 = f1762a.a();
        if (a8 != null) {
            a8.release();
        }
        f1762a.d();
        AuthJni.release();
    }

    public static void setAuthLicense(byte[] bArr, String str, String str2, String str3) {
        q5 b8 = f1762a.b();
        if (b8 != null) {
            b8.a(bArr, str, str2, str3);
        }
    }

    public static List<Integer> checkAuth(Context context, byte[] bArr, ICallbackWith<List<Integer>> iCallbackWith, ICallbackWith<Integer> iCallbackWith2) {
        q5 b8 = f1762a.b();
        return b8 != null ? b8.a(context, bArr, iCallbackWith, iCallbackWith2) : new ArrayList();
    }
}
