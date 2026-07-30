package defpackage;

import java.io.File;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xk0 implements i81 {
    public final boolean a;

    public xk0(boolean z) {
        this.a = z;
    }

    @Override // defpackage.i81
    public final String a(Object obj, uw1 uw1Var) {
        File file = (File) obj;
        if (!this.a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
