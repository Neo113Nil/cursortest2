package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class sc extends qd {

    /* renamed from: j, reason: collision with root package name */
    private static final rd<r9> f11783j = new rd<>();

    /* renamed from: i, reason: collision with root package name */
    private final Context f11784i;

    public sc(gc gcVar, String str, String str2, j8 j8Var, int i7, int i8, Context context, c8 c8Var) {
        super(gcVar, "iH08ecr5p8p5eQT3/BFJ6jAaJm3eLNoIe2oA7hLZl5P0jAtinrUdPK16lrJGpxBz", "Gvy6wet11FtrNaAWhnvYSI1hOQnkPBTAgqoI9PXuwaM=", j8Var, i7, 27);
        this.f11784i = context;
    }

    private final String d() {
        try {
            if (this.f10650b.l() != null) {
                this.f10650b.l().get();
            }
            a9 c7 = this.f10650b.c();
            if (c7 == null || !c7.k0()) {
                return null;
            }
            return c7.y0();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.qd
    protected final void a() {
        int i7;
        r9 r9Var;
        AtomicReference<r9> a7 = f11783j.a(this.f11784i.getPackageName());
        synchronized (a7) {
            r9 r9Var2 = a7.get();
            if (r9Var2 == null || jc.g(r9Var2.f11063b) || r9Var2.f11063b.equals("E") || r9Var2.f11063b.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (jc.g(null)) {
                    jc.g(null);
                    i7 = (Boolean.FALSE.booleanValue() && this.f10650b.p()) ? 4 : 3;
                } else {
                    i7 = 5;
                }
                Boolean valueOf = Boolean.valueOf(i7 == 3);
                Boolean bool = (Boolean) sw.c().b(m10.H1);
                String c7 = ((Boolean) sw.c().b(m10.G1)).booleanValue() ? c() : null;
                if (bool.booleanValue() && this.f10650b.p() && jc.g(c7)) {
                    c7 = d();
                }
                r9 r9Var3 = new r9((String) this.f10654f.invoke(null, this.f11784i, valueOf, c7));
                if (jc.g(r9Var3.f11063b) || r9Var3.f11063b.equals("E")) {
                    int i8 = i7 - 1;
                    if (i8 == 3) {
                        String d7 = d();
                        if (!jc.g(d7)) {
                            r9Var3.f11063b = d7;
                        }
                    } else if (i8 == 4) {
                        throw null;
                    }
                }
                a7.set(r9Var3);
            }
            r9Var = a7.get();
        }
        synchronized (this.f10653e) {
            if (r9Var != null) {
                this.f10653e.l0(r9Var.f11063b);
                this.f10653e.J(r9Var.f11064c);
                this.f10653e.L(r9Var.f11065d);
                this.f10653e.Y(r9Var.f11066e);
                this.f10653e.k0(r9Var.f11067f);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final String c() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] i7 = jc.i((String) sw.c().b(m10.I1));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(i7)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(jc.i((String) sw.c().b(m10.J1)))));
            }
            Context context = this.f11784i;
            String packageName = context.getPackageName();
            this.f10650b.k();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final kc3 E = kc3.E();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager.OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.sd
                @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
                public final void onChecksumsReady(List list) {
                    kc3 kc3Var = kc3.this;
                    if (list == null) {
                        kc3Var.w(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            ApkChecksum apkChecksum = (ApkChecksum) list.get(i8);
                            if (apkChecksum.getType() == 8) {
                                kc3Var.w(jc.c(apkChecksum.getValue()));
                                return;
                            }
                        }
                        kc3Var.w(null);
                    } catch (Throwable unused) {
                        kc3Var.w(null);
                    }
                }
            });
            return (String) E.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
