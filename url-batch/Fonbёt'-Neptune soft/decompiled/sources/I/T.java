package I;

import java.io.File;

/* loaded from: classes.dex */
public final class T extends Q0.i implements P0.l {

    /* renamed from: f, reason: collision with root package name */
    public static final T f588f = new T(1);

    @Override // P0.l
    public final Object i(Object obj) {
        File file = (File) obj;
        Q0.h.e(file, "it");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        Q0.h.d(absolutePath, "file.canonicalFile.absolutePath");
        return new j0(absolutePath);
    }
}
