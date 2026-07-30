package com.baidu.platform.comapi.util.l;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.baidu.vi.VIContext;
import java.io.File;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private String f9847a;

    /* renamed from: b, reason: collision with root package name */
    private String f9848b;

    /* renamed from: c, reason: collision with root package name */
    private String f9849c;

    /* renamed from: d, reason: collision with root package name */
    private String f9850d;

    /* renamed from: e, reason: collision with root package name */
    private String f9851e;

    /* renamed from: f, reason: collision with root package name */
    private String f9852f;

    /* renamed from: g, reason: collision with root package name */
    private String f9853g;

    public void a(Context context) {
        this.f9847a = context.getFilesDir().getAbsolutePath();
        String absolutePath = context.getCacheDir().getAbsolutePath();
        this.f9850d = absolutePath;
        this.f9851e = absolutePath;
        this.f9848b = Environment.getExternalStorageDirectory().getPath();
        this.f9849c = Environment.getExternalStorageDirectory().getPath();
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            this.f9852f = externalFilesDir.getAbsolutePath();
        }
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir != null) {
            this.f9853g = externalCacheDir.getAbsolutePath();
        }
    }

    public String b() {
        if (TextUtils.isEmpty(this.f9852f)) {
            a(VIContext.getContext());
        }
        return this.f9852f;
    }

    public String c() {
        if (TextUtils.isEmpty(this.f9850d)) {
            a(VIContext.getContext());
        }
        return this.f9850d;
    }

    public String d() {
        if (TextUtils.isEmpty(this.f9847a)) {
            a(VIContext.getContext());
        }
        return this.f9847a;
    }

    public String e() {
        if (TextUtils.isEmpty(this.f9848b)) {
            a(VIContext.getContext());
        }
        return this.f9848b;
    }

    public String a() {
        if (TextUtils.isEmpty(this.f9849c)) {
            a(VIContext.getContext());
        }
        return this.f9849c;
    }
}
