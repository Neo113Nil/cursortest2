package com.baidu.location.b;

import android.os.Bundle;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static Object f4694a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static h f4695b;

    /* renamed from: c, reason: collision with root package name */
    private int f4696c = -1;

    public static h a() {
        h hVar;
        synchronized (f4694a) {
            try {
                if (f4695b == null) {
                    f4695b = new h();
                }
                hVar = f4695b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    public void a(int i8, int i9, String str) {
        if (i9 != this.f4696c) {
            this.f4696c = i9;
            Bundle bundle = new Bundle();
            bundle.putInt("loctype", i8);
            bundle.putInt("diagtype", i9);
            bundle.putByteArray("diagmessage", str.getBytes());
            d.a().a(bundle, 303);
        }
    }
}
