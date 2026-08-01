package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.input.InputManager;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InputInfo.java */
/* renamed from: com.pgl.ssdk.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1140u {
    private static int a = 0;
    private static int b = 0;
    private static int c = 0;
    private static int d = 0;
    private static int e = 0;
    private static int f = 0;
    private static boolean g = false;
    private static InputManager h;

    /* compiled from: InputInfo.java */
    /* renamed from: com.pgl.ssdk.u$a */
    static class a implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ int b;

        a(Context context, int i) {
            this.a = context;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            InputManager a = C1140u.a(this.a);
            if (a == null) {
                return;
            }
            InputDevice inputDevice = a.getInputDevice(this.b);
            C1140u.g();
            if (inputDevice == null) {
                C1140u.a();
                C1140u.b();
                C1140u.a("nihc");
            } else if (inputDevice.isVirtual()) {
                C1140u.c();
                C1140u.d();
                C1140u.a("vihc");
            } else {
                if (Build.VERSION.SDK_INT < 29 || !inputDevice.isExternal()) {
                    return;
                }
                C1140u.e();
                C1140u.f();
                C1140u.a("eihc");
            }
        }
    }

    static /* synthetic */ int a() {
        int i = c;
        c = i + 1;
        return i;
    }

    static /* synthetic */ int b() {
        int i = f;
        f = i + 1;
        return i;
    }

    static /* synthetic */ int c() {
        int i = a;
        a = i + 1;
        return i;
    }

    static /* synthetic */ int d() {
        int i = d;
        d = i + 1;
        return i;
    }

    static /* synthetic */ int e() {
        int i = b;
        b = i + 1;
        return i;
    }

    static /* synthetic */ int f() {
        int i = e;
        e = i + 1;
        return i;
    }

    public static void g() {
        if (g) {
            return;
        }
        try {
            SharedPreferences a2 = L.a(C1141v.b());
            if (a2 != null) {
                f = a2.getInt("nihc", 0);
                e = a2.getInt("eihc", 0);
                d = a2.getInt("vihc", 0);
                g = true;
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(MotionEvent motionEvent, Context context) {
        if (motionEvent == null || context == null) {
            return;
        }
        if (motionEvent.getRawX() > 0.0f || motionEvent.getRawY() > 0.0f) {
            AbstractC1123c.a(new a(context, motionEvent.getDeviceId()));
        }
    }

    static void a(String str) {
        try {
            SharedPreferences a2 = L.a(C1141v.b());
            if (a2 != null) {
                a2.edit().putInt(str, a2.getInt(str, 0) + 1).apply();
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(JSONObject jSONObject) {
        try {
            jSONObject.put("vihc", d);
            jSONObject.put("eihc", e);
            jSONObject.put("nihc", f);
            jSONObject.put("vic", a);
            jSONObject.put("nic", c);
            jSONObject.put("eic", b);
        } catch (JSONException unused) {
        }
    }

    static InputManager a(Context context) {
        if (h == null) {
            h = (InputManager) context.getSystemService("input");
        }
        return h;
    }
}
