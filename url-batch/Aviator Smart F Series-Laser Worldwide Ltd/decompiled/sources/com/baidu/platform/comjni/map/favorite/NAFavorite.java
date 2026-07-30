package com.baidu.platform.comjni.map.favorite;

import android.os.Bundle;
import com.baidu.platform.comjni.JNIBaseApi;

/* loaded from: classes2.dex */
public class NAFavorite extends JNIBaseApi {

    /* renamed from: a, reason: collision with root package name */
    private long f10614a = 0;

    private native boolean nativeAdd(long j8, String str, String str2);

    private native boolean nativeClear(long j8);

    private native boolean nativeCloseCache(long j8);

    private native long nativeCreate();

    private native boolean nativeDelete(long j8);

    private native int nativeGetAll(long j8, Bundle bundle);

    private native int nativeGetLength(long j8);

    private native int nativeGetRelations(long j8, String str, Bundle bundle, int i8);

    private native String nativeGetValue(long j8, String str);

    private native boolean nativeIsExist(long j8, String str);

    private native boolean nativeLoad(long j8, String str, String str2, String str3, int i8, int i9, int i10);

    private native int nativeRelease(long j8);

    private native boolean nativeRemove(long j8, String str);

    private native boolean nativeResumeCache(long j8);

    private native boolean nativeSaveCache(long j8);

    private native boolean nativeSetType(long j8, int i8);

    private native boolean nativeUpdate(long j8, String str, String str2);

    private native boolean nativeUpdateInOrder(long j8, String str, String str2);

    public boolean a(String str, String str2, String str3, int i8, int i9, int i10) {
        long j8 = this.f10614a;
        if (j8 == 0) {
            return false;
        }
        return nativeLoad(j8, str, str2, str3, i8, i9, i10);
    }

    public int b() {
        return nativeRelease(this.f10614a);
    }

    public boolean c(String str) {
        long j8 = this.f10614a;
        if (j8 == 0) {
            return false;
        }
        return nativeRemove(j8, str);
    }

    public long create() {
        long nativeCreate = nativeCreate();
        this.f10614a = nativeCreate;
        return nativeCreate;
    }

    public boolean saveCache() {
        long j8 = this.f10614a;
        if (j8 == 0) {
            return false;
        }
        return nativeSaveCache(j8);
    }

    public boolean a(int i8) {
        long j8 = this.f10614a;
        if (j8 == 0) {
            return false;
        }
        return nativeSetType(j8, i8);
    }

    public boolean b(String str, String str2) {
        long j8 = this.f10614a;
        if (j8 == 0) {
            return false;
        }
        return nativeUpdate(j8, str, str2);
    }

    public boolean a(String str, String str2) {
        long j8 = this.f10614a;
        if (j8 == 0) {
            return false;
        }
        return nativeAdd(j8, str, str2);
    }

    public boolean b(String str) {
        long j8 = this.f10614a;
        if (j8 == 0) {
            return false;
        }
        try {
            return nativeIsExist(j8, str);
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean a() {
        long j8 = this.f10614a;
        if (j8 == 0) {
            return false;
        }
        return nativeClear(j8);
    }

    public String a(String str) {
        long j8 = this.f10614a;
        if (j8 == 0) {
            return null;
        }
        try {
            return nativeGetValue(j8, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public int a(Bundle bundle) {
        long j8 = this.f10614a;
        if (j8 == 0) {
            return 0;
        }
        try {
            return nativeGetAll(j8, bundle);
        } catch (Throwable unused) {
            return 0;
        }
    }
}
