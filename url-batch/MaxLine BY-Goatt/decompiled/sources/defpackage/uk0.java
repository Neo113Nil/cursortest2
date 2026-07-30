package defpackage;

import android.webkit.MimeTypeMap;
import com.google.firebase.encoders.json.BuildConfig;
import java.io.File;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class uk0 implements qk0 {
    public final File a;

    public uk0(File file) {
        this.a = file;
    }

    @Override // defpackage.qk0
    public final Object a(o30 o30Var) {
        String str = qz1.n;
        File file = this.a;
        wk0 wk0Var = new wk0(nm1.s(file), gl0.a, null, null);
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String name = file.getName();
        name.getClass();
        return new tn2(wk0Var, singleton.getMimeTypeFromExtension(up2.I(name, '.', BuildConfig.FLAVOR)), m60.o);
    }
}
