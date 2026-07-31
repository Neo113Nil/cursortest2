package com.iab.omid.library.startio.attestation;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: classes2.dex */
public class j implements k {
    private static volatile j d;

    /* renamed from: a, reason: collision with root package name */
    private volatile Boolean f24a;
    private volatile Boolean b;
    private final Context c;

    private j(Context context) {
        this.c = context;
        c();
    }

    public static j a(Context context) {
        if (d == null) {
            synchronized (j.class) {
                if (d == null) {
                    d = new j(context);
                }
            }
        }
        return d;
    }

    @Override // com.iab.omid.library.startio.attestation.k
    public boolean a() {
        return c();
    }

    public boolean b() {
        if (this.b != null) {
            return this.b.booleanValue();
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b.booleanValue();
            }
            if (!c()) {
                this.b = Boolean.FALSE;
                return false;
            }
            try {
                try {
                    PackageManager packageManager = this.c.getPackageManager();
                    if (packageManager == null) {
                        com.iab.omid.library.startio.utils.d.b("PackageManager is null when checking attestation capability");
                        this.b = Boolean.FALSE;
                        return false;
                    }
                    Boolean valueOf = Boolean.valueOf(packageManager.hasSystemFeature("com.amazon.privacypass"));
                    this.b = valueOf;
                    return valueOf.booleanValue();
                } catch (SecurityException e) {
                    com.iab.omid.library.startio.utils.d.a("Security exception when checking attestation capability", e);
                    this.b = Boolean.FALSE;
                    return false;
                }
            } catch (Exception e2) {
                com.iab.omid.library.startio.utils.d.a("Unexpected error when checking attestation capability", e2);
                this.b = Boolean.FALSE;
                return false;
            }
        }
    }

    public boolean c() {
        Boolean valueOf;
        int i;
        boolean booleanValue;
        if (this.f24a != null) {
            return this.f24a.booleanValue();
        }
        synchronized (this) {
            if (this.f24a != null) {
                valueOf = this.f24a;
            } else {
                valueOf = Boolean.valueOf(this.c != null && Build.MANUFACTURER.equalsIgnoreCase("Amazon") && Build.MODEL.toLowerCase().startsWith("aft") && (i = Build.VERSION.SDK_INT) >= 25 && i <= 30);
                this.f24a = valueOf;
            }
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }
}
