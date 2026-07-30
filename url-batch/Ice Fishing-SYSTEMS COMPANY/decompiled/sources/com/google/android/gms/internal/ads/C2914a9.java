package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.os.SystemClock;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.a9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2914a9 {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.manager.o f29175a;

    /* renamed from: b, reason: collision with root package name */
    public final W9 f29176b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f29177c;

    public C2914a9() {
        this.f29176b = X9.L();
        this.f29177c = false;
        this.f29175a = new com.bumptech.glide.manager.o(6);
    }

    public final synchronized void a(Z8 z8) {
        if (this.f29177c) {
            try {
                z8.a(this.f29176b);
            } catch (NullPointerException e6) {
                p2.j.f39798C.f39808h.d("AdMobClearcutLogger.modify", e6);
            }
        }
    }

    public final synchronized void b(int i) {
        if (this.f29177c) {
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31639c6)).booleanValue()) {
                d(i);
            } else {
                c(i);
            }
        }
    }

    public final synchronized void c(int i) {
        W9 w9 = this.f29176b;
        w9.h();
        ((X9) w9.f30000u).F();
        ArrayList H6 = t2.G.H();
        w9.h();
        ((X9) w9.f30000u).E(H6);
        byte[] b9 = ((X9) w9.j()).b();
        com.bumptech.glide.manager.o oVar = this.f29175a;
        C3398j5 c3398j5 = new C3398j5();
        Objects.requireNonNull(oVar);
        c3398j5.f32085v = oVar;
        c3398j5.f32084u = b9;
        int i4 = i - 1;
        c3398j5.f32083n = i4;
        synchronized (c3398j5) {
            ((ExecutorService) ((com.bumptech.glide.manager.o) c3398j5.f32085v).f23625w).execute(new RunnableC3068d(11, c3398j5));
        }
        t2.C.k("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i4, 10))));
    }

    public final synchronized void d(int i) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(new File(externalStorageDirectory, "clearcut_events.txt").getPath()), true);
            try {
                try {
                    fileOutputStream.write(e(i).getBytes());
                } catch (IOException unused) {
                    t2.C.k("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                        t2.C.k("Could not close Clearcut output stream.");
                    }
                }
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    t2.C.k("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            t2.C.k("Could not find file for Clearcut");
        }
    }

    public final synchronized String e(int i) {
        StringBuilder sb;
        W9 w9 = this.f29176b;
        String K8 = ((X9) w9.f30000u).K();
        p2.j.f39798C.f39810k.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String encodeToString = Base64.encodeToString(((X9) w9.j()).b(), 3);
        sb = new StringBuilder("id=");
        sb.append(K8);
        sb.append(",timestamp=");
        sb.append(elapsedRealtime);
        sb.append(",event=");
        sb.append(i - 1);
        sb.append(",data=");
        sb.append(encodeToString);
        sb.append("\n");
        return sb.toString();
    }

    public C2914a9(com.bumptech.glide.manager.o oVar) {
        this.f29176b = X9.L();
        this.f29175a = oVar;
        this.f29177c = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31630b6)).booleanValue();
    }
}
