package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import b2.InterfaceC0272c;
import j2.C0569a;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4523a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4524b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f4525c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4526d;

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean[], java.io.Serializable] */
    public s(int i2) {
        this.f4524b = new long[i2];
        this.f4525c = new boolean[i2];
        this.f4526d = new int[i2];
    }

    public int[] a() {
        synchronized (this) {
            try {
                if (!this.f4523a) {
                    return null;
                }
                long[] jArr = (long[]) this.f4524b;
                int length = jArr.length;
                int i2 = 0;
                int i5 = 0;
                while (i2 < length) {
                    int i7 = i5 + 1;
                    int i8 = 1;
                    boolean z7 = jArr[i2] > 0;
                    boolean[] zArr = (boolean[]) this.f4525c;
                    if (z7 != zArr[i5]) {
                        int[] iArr = (int[]) this.f4526d;
                        if (!z7) {
                            i8 = 2;
                        }
                        iArr[i5] = i8;
                    } else {
                        ((int[]) this.f4526d)[i5] = 0;
                    }
                    zArr[i5] = z7;
                    i2++;
                    i5 = i7;
                }
                this.f4523a = false;
                return (int[]) ((int[]) this.f4526d).clone();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized boolean b() {
        boolean z7;
        boolean z8;
        try {
            synchronized (this) {
                try {
                    if (!this.f4523a) {
                        Boolean c7 = c();
                        this.f4525c = c7;
                        if (c7 == null) {
                            ((S1.l) ((InterfaceC0272c) this.f4524b)).b(new r(this));
                        }
                        this.f4523a = true;
                    }
                } finally {
                }
            }
            return z8;
        } catch (Throwable th) {
            throw th;
        }
        Boolean bool = (Boolean) this.f4525c;
        if (bool != null) {
            z8 = bool.booleanValue();
        } else {
            P1.g gVar = ((FirebaseMessaging) this.f4526d).f4438a;
            gVar.a();
            C0569a c0569a = (C0569a) gVar.f2276g.get();
            synchronized (c0569a) {
                z7 = c0569a.f5951d;
            }
            z8 = z7;
        }
        return z8;
    }

    public Boolean c() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        P1.g gVar = ((FirebaseMessaging) this.f4526d).f4438a;
        gVar.a();
        Context context = gVar.f2270a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public s(FirebaseMessaging firebaseMessaging, InterfaceC0272c interfaceC0272c) {
        this.f4526d = firebaseMessaging;
        this.f4524b = interfaceC0272c;
    }
}
