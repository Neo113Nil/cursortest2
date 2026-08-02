package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class evm {
    private static final Object f = new Object();
    private static volatile Map g;
    public final String a;
    public final iac b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public evm(Context context, evn evnVar) {
        this.a = evnVar.c ? etb.e(context, evnVar.b) : evnVar.b;
        iac b = iac.b(evnVar.d);
        this.b = b == null ? iac.UNKNOWN : b;
        this.c = evnVar.g;
        this.d = evnVar.e;
        this.e = evnVar.f;
    }

    public static Map a(Context context) {
        Map map;
        Map map2 = g;
        if (map2 != null) {
            return map2;
        }
        synchronized (f) {
            map = g;
            if (map == null) {
                hen henVar = new hen(4);
                try {
                    String[] list = context.getAssets().list("phenotype");
                    if (list != null) {
                        for (String str : list) {
                            if (str.endsWith("_package_metadata.binarypb")) {
                                try {
                                    InputStream open = context.getAssets().open(a.ah(str, "phenotype/"));
                                    try {
                                        evm evmVar = new evm(context, (evn) jkp.t(evn.a, open, jkd.a));
                                        henVar.g(evmVar.a, evmVar);
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
                                    }
                                } catch (jld e) {
                                    Log.e("PackageInfo", a.ah(str, "Unable to read Phenotype PackageMetadata for "), e);
                                }
                            }
                        }
                    }
                } catch (IOException e2) {
                    Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e2);
                }
                map = henVar.d(true);
                g = map;
            }
        }
        return map;
    }
}
