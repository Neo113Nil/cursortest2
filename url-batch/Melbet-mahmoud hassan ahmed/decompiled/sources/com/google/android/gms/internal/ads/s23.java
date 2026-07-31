package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class s23 {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f11626f = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final Context f11627a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f11628b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11629c;

    /* renamed from: d, reason: collision with root package name */
    private final y13 f11630d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f11631e;

    public s23(Context context, int i7, y13 y13Var, boolean z6) {
        this.f11631e = false;
        this.f11627a = context;
        this.f11629c = Integer.toString(i7 - 1);
        this.f11628b = context.getSharedPreferences("pcvmspf", 0);
        this.f11630d = y13Var;
        this.f11631e = z6;
    }

    private final File e(String str) {
        return new File(new File(this.f11627a.getDir("pccache", 0), this.f11629c), str);
    }

    private static String f(vd vdVar) {
        xd I = yd.I();
        I.v(vdVar.H().O());
        I.r(vdVar.H().N());
        I.s(vdVar.H().F());
        I.u(vdVar.H().H());
        I.t(vdVar.H().G());
        return v3.i.a(I.o().g().m());
    }

    private final String g() {
        String valueOf = String.valueOf(this.f11629c);
        return valueOf.length() != 0 ? "FBAMTD".concat(valueOf) : new String("FBAMTD");
    }

    private final String h() {
        String valueOf = String.valueOf(this.f11629c);
        return valueOf.length() != 0 ? "LATMTD".concat(valueOf) : new String("LATMTD");
    }

    private final void i(int i7, long j7) {
        y13 y13Var = this.f11630d;
        if (y13Var != null) {
            y13Var.b(i7, j7);
        }
    }

    private final void j(int i7, long j7, String str) {
        y13 y13Var = this.f11630d;
        if (y13Var != null) {
            y13Var.a(i7, j7, str);
        }
    }

    private final yd k(int i7) {
        SharedPreferences sharedPreferences;
        String g7;
        int i8;
        if (i7 == 1) {
            sharedPreferences = this.f11628b;
            g7 = h();
        } else {
            sharedPreferences = this.f11628b;
            g7 = g();
        }
        String string = sharedPreferences.getString(g7, null);
        if (string == null) {
            return null;
        }
        try {
            return yd.M(uo3.J(v3.i.b(string)), this.f11631e ? mp3.a() : mp3.b());
        } catch (mq3 unused) {
            return null;
        } catch (NullPointerException unused2) {
            i8 = 2029;
            i(i8, System.currentTimeMillis());
            return null;
        } catch (RuntimeException unused3) {
            i8 = 2032;
            i(i8, System.currentTimeMillis());
            return null;
        }
    }

    public final boolean a(vd vdVar) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f11626f) {
            if (!l23.e(new File(e(vdVar.H().O()), "pcbc"), vdVar.I().m())) {
                i(4020, currentTimeMillis);
                return false;
            }
            String f7 = f(vdVar);
            SharedPreferences.Editor edit = this.f11628b.edit();
            edit.putString(h(), f7);
            boolean commit = edit.commit();
            if (commit) {
                i(5015, currentTimeMillis);
            } else {
                i(4021, currentTimeMillis);
            }
            return commit;
        }
    }

    public final boolean b(vd vdVar, r23 r23Var) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f11626f) {
            yd k7 = k(1);
            String O = vdVar.H().O();
            if (k7 != null && k7.O().equals(O)) {
                i(4014, currentTimeMillis);
                return false;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            File e7 = e(O);
            if (e7.exists()) {
                String str = true != e7.isDirectory() ? "0" : "1";
                String str2 = true != e7.isFile() ? "0" : "1";
                StringBuilder sb = new StringBuilder(str.length() + 5 + str2.length());
                sb.append("d:");
                sb.append(str);
                sb.append(",f:");
                sb.append(str2);
                j(4023, currentTimeMillis2, sb.toString());
                i(4015, currentTimeMillis2);
            } else if (!e7.mkdirs()) {
                String str3 = true != e7.canWrite() ? "0" : "1";
                j(4024, currentTimeMillis2, str3.length() != 0 ? "cw:".concat(str3) : new String("cw:"));
                i(4015, currentTimeMillis2);
                return false;
            }
            File e8 = e(O);
            File file = new File(e8, "pcam.jar");
            File file2 = new File(e8, "pcbc");
            if (!l23.e(file, vdVar.J().m())) {
                i(4016, currentTimeMillis);
                return false;
            }
            if (!l23.e(file2, vdVar.I().m())) {
                i(4017, currentTimeMillis);
                return false;
            }
            if (r23Var != null && !r23Var.a(file)) {
                i(4018, currentTimeMillis);
                l23.d(e8);
                return false;
            }
            String f7 = f(vdVar);
            long currentTimeMillis3 = System.currentTimeMillis();
            String string = this.f11628b.getString(h(), null);
            SharedPreferences.Editor edit = this.f11628b.edit();
            edit.putString(h(), f7);
            if (string != null) {
                edit.putString(g(), string);
            }
            if (!edit.commit()) {
                i(4019, currentTimeMillis3);
                return false;
            }
            HashSet hashSet = new HashSet();
            yd k8 = k(1);
            if (k8 != null) {
                hashSet.add(k8.O());
            }
            yd k9 = k(2);
            if (k9 != null) {
                hashSet.add(k9.O());
            }
            for (File file3 : new File(this.f11627a.getDir("pccache", 0), this.f11629c).listFiles()) {
                if (!hashSet.contains(file3.getName())) {
                    l23.d(file3);
                }
            }
            i(5014, currentTimeMillis);
            return true;
        }
    }

    public final j23 c(int i7) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f11626f) {
            yd k7 = k(1);
            if (k7 == null) {
                i(4022, currentTimeMillis);
                return null;
            }
            File e7 = e(k7.O());
            File file = new File(e7, "pcam.jar");
            if (!file.exists()) {
                file = new File(e7, "pcam");
            }
            File file2 = new File(e7, "pcbc");
            File file3 = new File(e7, "pcopt");
            i(5016, currentTimeMillis);
            return new j23(k7, file, file2, file3);
        }
    }

    public final boolean d(int i7) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f11626f) {
            yd k7 = k(1);
            if (k7 == null) {
                i(4025, currentTimeMillis);
                return false;
            }
            File e7 = e(k7.O());
            if (!new File(e7, "pcam.jar").exists()) {
                i(4026, currentTimeMillis);
                return false;
            }
            if (new File(e7, "pcbc").exists()) {
                i(5019, currentTimeMillis);
                return true;
            }
            i(4027, currentTimeMillis);
            return false;
        }
    }
}
