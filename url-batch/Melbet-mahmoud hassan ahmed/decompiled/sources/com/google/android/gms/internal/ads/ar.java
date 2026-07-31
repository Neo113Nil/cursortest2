package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ar {

    /* renamed from: a, reason: collision with root package name */
    private final fr f2920a;

    /* renamed from: b, reason: collision with root package name */
    private final ps f2921b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f2922c;

    private ar() {
        this.f2921b = qs.H();
        this.f2922c = false;
        this.f2920a = new fr();
    }

    public ar(fr frVar) {
        this.f2921b = qs.H();
        this.f2920a = frVar;
        this.f2922c = ((Boolean) sw.c().b(m10.f8322v3)).booleanValue();
    }

    public static ar a() {
        return new ar();
    }

    private final synchronized String d(int i7) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.f2921b.B(), Long.valueOf(y2.t.a().a()), Integer.valueOf(i7 - 1), Base64.encodeToString(this.f2921b.o().d(), 3));
    }

    private final synchronized void e(int i7) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
            try {
                try {
                    fileOutputStream.write(d(i7).getBytes());
                } catch (IOException unused) {
                    a3.r1.k("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                        a3.r1.k("Could not close Clearcut output stream.");
                    }
                }
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    a3.r1.k("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            a3.r1.k("Could not find file for Clearcut");
        }
    }

    private final synchronized void f(int i7) {
        ps psVar = this.f2921b;
        psVar.u();
        List<String> b7 = m10.b();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = b7.iterator();
        while (it.hasNext()) {
            for (String str : it.next().split(",")) {
                try {
                    arrayList.add(Long.valueOf(str));
                } catch (NumberFormatException unused) {
                    a3.r1.k("Experiment ID is not a number");
                }
            }
        }
        psVar.t(arrayList);
        er erVar = new er(this.f2920a, this.f2921b.o().d(), null);
        int i8 = i7 - 1;
        erVar.a(i8);
        erVar.b();
        String valueOf = String.valueOf(Integer.toString(i8, 10));
        a3.r1.k(valueOf.length() != 0 ? "Logging Event with event code : ".concat(valueOf) : new String("Logging Event with event code : "));
    }

    public final synchronized void b(zq zqVar) {
        if (this.f2922c) {
            try {
                zqVar.a(this.f2921b);
            } catch (NullPointerException e7) {
                y2.t.p().s(e7, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void c(int i7) {
        if (this.f2922c) {
            if (((Boolean) sw.c().b(m10.f8329w3)).booleanValue()) {
                e(i7);
            } else {
                f(i7);
            }
        }
    }
}
