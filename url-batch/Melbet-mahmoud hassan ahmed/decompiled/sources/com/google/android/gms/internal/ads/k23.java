package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class k23 {

    /* renamed from: a, reason: collision with root package name */
    private final File f7336a;

    /* renamed from: b, reason: collision with root package name */
    final File f7337b;

    /* renamed from: c, reason: collision with root package name */
    private final SharedPreferences f7338c;

    /* renamed from: d, reason: collision with root package name */
    private final int f7339d;

    public k23(Context context, int i7) {
        this.f7338c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        l23.a(dir, false);
        this.f7336a = dir;
        File dir2 = context.getDir("tmppccache", 0);
        l23.a(dir2, true);
        this.f7337b = dir2;
        this.f7339d = i7;
    }

    static String a(yd ydVar) {
        return v3.i.a(ydVar.g().m());
    }

    private final File e() {
        File file = new File(this.f7336a, Integer.toString(this.f7339d - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String f() {
        int i7 = this.f7339d;
        StringBuilder sb = new StringBuilder(17);
        sb.append("FBAMTD");
        sb.append(i7 - 1);
        return sb.toString();
    }

    private final String g() {
        int i7 = this.f7339d;
        StringBuilder sb = new StringBuilder(17);
        sb.append("LATMTD");
        sb.append(i7 - 1);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(vd vdVar, r23 r23Var) {
        boolean z6;
        yd c7;
        yd c8;
        String O = vdVar.H().O();
        byte[] m7 = vdVar.J().m();
        byte[] m8 = vdVar.I().m();
        if (!TextUtils.isEmpty(O) && m8 != null && m8.length != 0) {
            l23.d(this.f7337b);
            this.f7337b.mkdirs();
            l23.c(O, this.f7337b).mkdirs();
            File b7 = l23.b(O, "pcam.jar", this.f7337b);
            if ((m7 == null || m7.length <= 0 || l23.e(b7, m7)) && l23.e(l23.b(O, "pcbc", this.f7337b), m8)) {
                File b8 = l23.b(vdVar.H().O(), "pcam.jar", this.f7337b);
                if (b8.exists() && r23Var != null && !r23Var.a(b8)) {
                    return false;
                }
                String O2 = vdVar.H().O();
                if (!TextUtils.isEmpty(O2)) {
                    File b9 = l23.b(O2, "pcam.jar", this.f7337b);
                    File b10 = l23.b(O2, "pcbc", this.f7337b);
                    File b11 = l23.b(O2, "pcam.jar", e());
                    File b12 = l23.b(O2, "pcbc", e());
                    if ((!b9.exists() || b9.renameTo(b11)) && b10.exists() && b10.renameTo(b12)) {
                        xd I = yd.I();
                        I.v(vdVar.H().O());
                        I.r(vdVar.H().N());
                        I.s(vdVar.H().F());
                        I.u(vdVar.H().H());
                        I.t(vdVar.H().G());
                        yd o7 = I.o();
                        yd c9 = c(1);
                        SharedPreferences.Editor edit = this.f7338c.edit();
                        if (c9 != null && !o7.O().equals(c9.O())) {
                            edit.putString(f(), a(c9));
                        }
                        edit.putString(g(), a(o7));
                        if (edit.commit()) {
                            z6 = true;
                            HashSet hashSet = new HashSet();
                            c7 = c(1);
                            if (c7 != null) {
                                hashSet.add(c7.O());
                            }
                            c8 = c(2);
                            if (c8 != null) {
                                hashSet.add(c8.O());
                            }
                            for (File file : e().listFiles()) {
                                String name = file.getName();
                                if (!hashSet.contains(name)) {
                                    l23.d(l23.c(name, e()));
                                }
                            }
                            return z6;
                        }
                    }
                }
                z6 = false;
                HashSet hashSet2 = new HashSet();
                c7 = c(1);
                if (c7 != null) {
                }
                c8 = c(2);
                if (c8 != null) {
                }
                while (r4 < r1) {
                }
                return z6;
            }
        }
        return false;
    }

    final yd c(int i7) {
        SharedPreferences sharedPreferences;
        String f7;
        if (i7 == 1) {
            sharedPreferences = this.f7338c;
            f7 = g();
        } else {
            sharedPreferences = this.f7338c;
            f7 = f();
        }
        String string = sharedPreferences.getString(f7, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            yd L = yd.L(uo3.J(v3.i.b(string)));
            String O = L.O();
            File b7 = l23.b(O, "pcam.jar", e());
            if (!b7.exists()) {
                b7 = l23.b(O, "pcam", e());
            }
            File b8 = l23.b(O, "pcbc", e());
            if (b7.exists()) {
                if (b8.exists()) {
                    return L;
                }
            }
        } catch (mq3 unused) {
        }
        return null;
    }

    public final j23 d(int i7) {
        yd c7 = c(1);
        if (c7 == null) {
            return null;
        }
        String O = c7.O();
        File b7 = l23.b(O, "pcam.jar", e());
        if (!b7.exists()) {
            b7 = l23.b(O, "pcam", e());
        }
        return new j23(c7, b7, l23.b(O, "pcbc", e()), l23.b(O, "pcopt", e()));
    }
}
