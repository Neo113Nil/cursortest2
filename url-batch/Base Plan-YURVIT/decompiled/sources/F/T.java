package F;

import java.io.File;

/* loaded from: classes.dex */
public final class T extends P0.i implements O0.l {

    /* renamed from: f, reason: collision with root package name */
    public static final T f307f = new T(1);

    @Override // O0.l
    public final Object j(Object obj) {
        File file = (File) obj;
        P0.h.e(file, "it");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        P0.h.d(absolutePath, "file.canonicalFile.absolutePath");
        return new k0(absolutePath);
    }
}
