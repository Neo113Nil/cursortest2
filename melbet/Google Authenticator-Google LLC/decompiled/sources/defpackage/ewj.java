package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ewj implements hac {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ ewj(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // defpackage.hac
    public final Object bB() {
        iaa iaaVar;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                Object obj = this.a;
                fuj fujVar = (fuj) obj;
                fuy fuyVar = fujVar.d;
                hvi a = fuyVar.a();
                fuyVar.c(a);
                return hoq.au(a, new bpp(obj, this.b, this.c, 12), fujVar.e);
            }
            int i2 = hpe.a;
            int i3 = hpj.a;
            hpi hpiVar = new hpi();
            hpiVar.d(((String) this.b).getBytes());
            hpiVar.a.put((byte) 0);
            hpiVar.g();
            hpiVar.d(((String) this.c).getBytes());
            return ((hpx) ((iyi) this.a).b).g(hpiVar.k().d());
        }
        Object obj2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.a;
        try {
            Object obj5 = ((ifn) obj3).a;
            iaa iaaVar2 = iab.a;
            if (obj2 == null) {
                throw null;
            }
            Intent intent = new Intent("com.google.android.build.data.Properties");
            intent.setPackage((String) obj2);
            List<ResolveInfo> queryIntentServices = ((PackageManager) obj5).queryIntentServices(intent, 787072);
            if (queryIntentServices.isEmpty()) {
                iaaVar = iab.a;
            } else {
                if (queryIntentServices.size() > 1) {
                    throw new IOException("Failed to resolve target AndroidBuildData");
                }
                int i4 = queryIntentServices.get(0).serviceInfo.metaData.getInt("com.google.android.build.data.properties");
                if (i4 == 0) {
                    iaaVar = iab.a;
                } else {
                    try {
                        iaaVar = (iaa) jkp.t(iaa.a, ((ewm) obj4).a().openRawResource(i4), jkd.a);
                    } catch (PackageManager.NameNotFoundException unused) {
                        iaaVar = iab.a;
                    }
                }
            }
            return Long.valueOf(iaaVar.b);
        } catch (IOException e) {
            Log.e("PhenotypeResourceReader", "Failed to read baseline CL for package ".concat(String.valueOf(obj2)), e);
            return -1L;
        }
    }
}
