package com.huawei.hms.base.log;

import android.content.Context;
import android.util.Log;

/* loaded from: classes.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private String f13977b;

    /* renamed from: a, reason: collision with root package name */
    private int f13976a = 4;

    /* renamed from: c, reason: collision with root package name */
    private d f13978c = new c();

    public void a(Context context, int i4, String str) {
        this.f13976a = i4;
        this.f13977b = str;
        this.f13978c.a(context, "HMSCore");
    }

    public void b(int i4, String str, String str2, Throwable th) {
        try {
            if (a(i4)) {
                e a4 = a(i4, str, str2, th);
                String str3 = a4.c() + a4.a();
                this.f13978c.a(str3, i4, str, str2 + '\n' + Log.getStackTraceString(th));
            }
        } catch (OutOfMemoryError unused) {
            b();
        }
    }

    public d a() {
        return this.f13978c;
    }

    public void a(d dVar) {
        this.f13978c = dVar;
    }

    private void b() {
        try {
            Log.e("HMSSDK_LogAdaptor", "log happened OOM error.");
        } catch (Throwable unused) {
        }
    }

    public boolean a(int i4) {
        return i4 >= this.f13976a;
    }

    public void a(int i4, String str, String str2) {
        try {
            if (a(i4)) {
                e a4 = a(i4, str, str2, null);
                this.f13978c.a(a4.c() + a4.a(), i4, str, str2);
            }
        } catch (OutOfMemoryError unused) {
            b();
        }
    }

    public void a(String str, String str2) {
        try {
            e a4 = a(4, str, str2, null);
            this.f13978c.a(a4.c() + '\n' + a4.a(), 4, str, str2);
        } catch (OutOfMemoryError unused) {
            b();
        }
    }

    private e a(int i4, String str, String str2, Throwable th) {
        e eVar = new e(8, this.f13977b, i4, str);
        eVar.a((e) str2);
        eVar.a(th);
        return eVar;
    }
}
