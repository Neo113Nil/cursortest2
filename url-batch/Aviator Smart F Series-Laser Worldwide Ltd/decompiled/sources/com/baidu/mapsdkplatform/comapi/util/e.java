package com.baidu.mapsdkplatform.comapi.util;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import java.io.File;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f8267a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8268b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8269c;

    /* renamed from: d, reason: collision with root package name */
    private final String f8270d;

    /* renamed from: e, reason: collision with root package name */
    private final String f8271e;

    /* renamed from: f, reason: collision with root package name */
    private final String f8272f;

    e(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir == null || !externalFilesDir.exists()) {
                this.f8268b = context.getFilesDir().getPath();
            } else {
                this.f8268b = externalFilesDir.getPath();
            }
        } else if (com.baidu.mapsdkplatform.comapi.b.b()) {
            this.f8268b = Environment.getExternalStorageDirectory().getAbsolutePath();
        } else {
            this.f8268b = context.getFilesDir().getAbsolutePath();
        }
        this.f8267a = false;
        this.f8269c = this.f8268b + File.separator + "BaiduMapSDKNew";
        this.f8270d = context.getCacheDir().getAbsolutePath();
        this.f8271e = "";
        this.f8272f = "";
    }

    public String a() {
        return this.f8268b + File.separator + "BaiduMapSDKNew";
    }

    public String b() {
        return this.f8270d;
    }

    public String c() {
        return this.f8268b;
    }

    public String d() {
        return this.f8271e;
    }

    public boolean equals(Object obj) {
        if (obj == null || !e.class.isInstance(obj)) {
            return false;
        }
        return this.f8268b.equals(((e) obj).f8268b);
    }
}
