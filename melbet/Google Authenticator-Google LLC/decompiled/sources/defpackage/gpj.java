package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gpj {
    public final Object a;
    public Object b;

    public gpj(bd bdVar, Executor executor) {
        gbf gbfVar = new gbf(executor, true);
        this.a = gbfVar;
        gbfVar.c();
        bdVar.L().a(new gwn(new gep(this, bdVar)));
    }

    private final synchronized Context d() {
        Context createDeviceProtectedStorageContext;
        if (this.b == null) {
            Object obj = this.a;
            createDeviceProtectedStorageContext = ((Context) obj).createDeviceProtectedStorageContext();
            if (createDeviceProtectedStorageContext != null) {
                this.b = createDeviceProtectedStorageContext;
            } else {
                this.b = obj;
            }
        }
        return (Context) this.b;
    }

    private final File e(int i, int i2) {
        Object d = i2 == 1 ? d() : this.a;
        return i + (-1) != 0 ? ((Context) d).getCacheDir() : ((Context) d).getFilesDir();
    }

    public final hfm a() {
        return hfm.r(e(1, 2), e(1, 1), e(2, 2), e(2, 1));
    }

    public final File b(gpk gpkVar) {
        return e(gpkVar.a, gpkVar.b);
    }

    public final Uri c(gpk gpkVar, String str) {
        int i = gpkVar.a - 1;
        String str2 = gpkVar.b == 1 ? "directboot-" : "";
        String concat = i != 0 ? str2.concat("cache") : str2.concat("files");
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        return new Uri.Builder().scheme("android").authority(((Context) this.a).getPackageName()).path("/" + concat + "/" + str).build();
    }

    public gpj(Context context) {
        this.a = context;
    }

    public gpj() {
        throw null;
    }
}
