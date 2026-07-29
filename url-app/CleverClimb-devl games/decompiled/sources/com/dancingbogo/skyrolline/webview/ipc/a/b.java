package com.dancingbogo.skyrolline.webview.ipc.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

/* compiled from: WebConfigManager.java */
/* loaded from: classes2.dex */
public class b implements a {

    /* renamed from: d, reason: collision with root package name */
    private static b f4631d;

    /* renamed from: a, reason: collision with root package name */
    private SharedPreferences f4632a;

    /* renamed from: b, reason: collision with root package name */
    private String f4633b;

    /* renamed from: c, reason: collision with root package name */
    private a f4634c;

    private b(Context context) {
        com.dancingbogo.skyrolline.util.b.b("ly", "WebConfigManager\u3000RuntimeCheck.IsWebProcess() = " + com.dancingbogo.skyrolline.c.a.c());
        if (com.dancingbogo.skyrolline.c.a.c()) {
            this.f4633b = new String("com.cmplay.tiles2.web");
            this.f4632a = context.getSharedPreferences(this.f4633b, 0);
        }
        this.f4634c = new c();
    }

    public static b a(Context context) {
        if (f4631d == null) {
            synchronized (b.class) {
                if (f4631d == null) {
                    f4631d = new b(context);
                }
            }
        }
        return f4631d;
    }

    private SharedPreferences a() {
        com.dancingbogo.skyrolline.c.a.e();
        return this.f4632a;
    }

    @Override // com.dancingbogo.skyrolline.webview.ipc.a.a
    public long a(String str, long j) {
        if (com.dancingbogo.skyrolline.c.a.c()) {
            return a().getLong(str, j);
        }
        return this.f4634c.a(str, j);
    }

    @Override // com.dancingbogo.skyrolline.webview.ipc.a.a
    public boolean a(String str, boolean z) {
        if (com.dancingbogo.skyrolline.c.a.c()) {
            return a().getBoolean(str, z);
        }
        return this.f4634c.a(str, z);
    }

    @Override // com.dancingbogo.skyrolline.webview.ipc.a.a
    public int a(String str, int i) {
        if (com.dancingbogo.skyrolline.c.a.c()) {
            return a().getInt(str, i);
        }
        return this.f4634c.a(str, i);
    }

    @Override // com.dancingbogo.skyrolline.webview.ipc.a.a
    public String a(String str, String str2) {
        if (com.dancingbogo.skyrolline.c.a.c()) {
            return a().getString(str, str2);
        }
        return this.f4634c.a(str, str2);
    }

    @Override // com.dancingbogo.skyrolline.webview.ipc.a.a
    public void b(String str, boolean z) {
        if (com.dancingbogo.skyrolline.c.a.c()) {
            SharedPreferences.Editor edit = a().edit();
            edit.putBoolean(str, z);
            a(edit);
            return;
        }
        this.f4634c.b(str, z);
    }

    @Override // com.dancingbogo.skyrolline.webview.ipc.a.a
    public void b(String str, long j) {
        if (com.dancingbogo.skyrolline.c.a.c()) {
            SharedPreferences.Editor edit = a().edit();
            edit.putLong(str, j);
            a(edit);
            return;
        }
        this.f4634c.b(str, j);
    }

    @Override // com.dancingbogo.skyrolline.webview.ipc.a.a
    public void b(String str, int i) {
        if (com.dancingbogo.skyrolline.c.a.c()) {
            SharedPreferences.Editor edit = a().edit();
            edit.putInt(str, i);
            a(edit);
            return;
        }
        this.f4634c.b(str, i);
    }

    @Override // com.dancingbogo.skyrolline.webview.ipc.a.a
    public void b(String str, String str2) {
        if (com.dancingbogo.skyrolline.c.a.c()) {
            SharedPreferences.Editor edit = a().edit();
            edit.putString(str, str2);
            a(edit);
            return;
        }
        this.f4634c.b(str, str2);
    }

    @SuppressLint({"NewApi"})
    public static void a(SharedPreferences.Editor editor) {
        if (Build.VERSION.SDK_INT >= 9) {
            editor.apply();
        } else {
            editor.commit();
        }
    }
}
