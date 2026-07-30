package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* renamed from: com.google.android.gms.internal.ads.uz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4038uz {

    /* renamed from: a, reason: collision with root package name */
    public final Context f34687a;

    /* renamed from: b, reason: collision with root package name */
    public final C4158xA f34688b;

    /* renamed from: c, reason: collision with root package name */
    public final Zy f34689c;

    /* renamed from: d, reason: collision with root package name */
    public final String f34690d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f34691e;

    public C4038uz(Context context, C4158xA c4158xA, Zy zy, C3066cy c3066cy) {
        this.f34687a = context;
        this.f34688b = c4158xA;
        this.f34689c = zy;
        this.f34690d = c3066cy.R();
        this.f34691e = c3066cy.j0();
    }

    public final String a(long j9) {
        boolean z8;
        String str = "E";
        Context context = this.f34687a;
        try {
            this.f34688b.a(55).a();
            K6 A8 = L6.A();
            String str2 = this.f34690d;
            A8.h();
            ((L6) A8.f30000u).C(str2);
            A8.h();
            ((L6) A8.f30000u).B("0.893135394");
            String packageName = context.getPackageName();
            A8.h();
            ((L6) A8.f30000u).E(packageName);
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            A8.h();
            ((L6) A8.f30000u).D(currentTimeMillis);
            long currentTimeMillis2 = (System.currentTimeMillis() - j9) / 1000;
            A8.h();
            ((L6) A8.f30000u).G(currentTimeMillis2);
            if (this.f34691e) {
                try {
                    Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
                    if (signatureArr != null && signatureArr.length > 0) {
                        byte[] digest = MessageDigest.getInstance("SHA-1").digest(signatureArr[0].toByteArray());
                        StringBuilder sb = new StringBuilder();
                        for (byte b9 : digest) {
                            String hexString = Integer.toHexString(b9 & 255);
                            if (hexString.length() == 1) {
                                sb.append('0');
                            }
                            sb.append(hexString);
                        }
                        str = Base64.encodeToString(sb.toString().getBytes(StandardCharsets.UTF_8), 11);
                    }
                } catch (Exception unused) {
                }
                A8.h();
                ((L6) A8.f30000u).H(str);
            }
            try {
                long j10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                A8.h();
                ((L6) A8.f30000u).F(j10);
            } catch (PackageManager.NameNotFoundException unused2) {
                A8.h();
                ((L6) A8.f30000u).F(-1L);
            }
            Zy zy = this.f34689c;
            synchronized (zy) {
                z8 = zy.f29128d;
            }
            if (!z8) {
                zy.a();
            }
            O6 d2 = zy.d(null, ((L6) A8.j()).b());
            d2.h();
            ((P6) d2.f30000u).D(5);
            d2.h();
            ((P6) d2.f30000u).E(2);
            byte[] b10 = ((P6) d2.j()).b();
            FC fc = HC.f25321e;
            if (fc.f25324b != null) {
                fc = new FC(fc.f25323a, (Character) null);
            }
            return fc.g(b10.length, b10);
        } finally {
        }
    }
}
