package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class xc implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2982d = 1;

    /* renamed from: e, reason: collision with root package name */
    public Object f2983e;

    /* renamed from: i, reason: collision with root package name */
    public Object f2984i;

    public /* synthetic */ xc(sa saVar, String str) {
        this.f2983e = saVar;
        this.f2984i = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2982d) {
            case 0:
                Context context = ((sa) this.f2983e).f2787b;
                b8.x xVar = yc.f3014r;
                if (xVar == null) {
                    synchronized (yc.f3013i) {
                        xVar = yc.f3014r;
                        if (xVar == null) {
                            b1.c0 c0Var = new b1.c0(4);
                            try {
                                String[] list = context.getAssets().list("phenotype");
                                if (list != null) {
                                    for (String str : list) {
                                        if (str.endsWith("_package_metadata.binarypb")) {
                                            try {
                                                AssetManager assets = context.getAssets();
                                                StringBuilder sb2 = new StringBuilder(str.length() + 10);
                                                sb2.append("phenotype/");
                                                sb2.append(str);
                                                InputStream open = assets.open(sb2.toString());
                                                try {
                                                    c1 c1Var = c1.f2180a;
                                                    int i3 = q0.f2690a;
                                                    yc ycVar = new yc(context, zc.v(open, c1.f2181b));
                                                    c0Var.g(ycVar.f3016e, ycVar);
                                                    if (open != null) {
                                                        open.close();
                                                    }
                                                } catch (Throwable th) {
                                                    if (open != null) {
                                                        try {
                                                            open.close();
                                                        } catch (Throwable th2) {
                                                            th.addSuppressed(th2);
                                                        }
                                                    }
                                                    throw th;
                                                    break;
                                                }
                                            } catch (v1 e2) {
                                                StringBuilder sb3 = new StringBuilder(str.length() + 45);
                                                sb3.append("Unable to read Phenotype PackageMetadata for ");
                                                sb3.append(str);
                                                Log.e("PackageInfo", sb3.toString(), e2);
                                            }
                                        }
                                    }
                                }
                            } catch (IOException e9) {
                                Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e9);
                            }
                            b8.x b10 = c0Var.b(true);
                            yc.f3014r = b10;
                            xVar = b10;
                        }
                    }
                }
                String str2 = (String) this.f2984i;
                if (xVar.containsKey(str2)) {
                    return;
                }
                StringBuilder sb4 = new StringBuilder(str2.length() + 173);
                sb4.append("Config package ");
                sb4.append(str2);
                sb4.append(" cannot use FILE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags.");
                Log.e("FilePhenotypeFlags", sb4.toString());
                return;
            default:
                this.f2983e = null;
                this.f2984i = null;
                return;
        }
    }

    public /* synthetic */ xc() {
    }
}
