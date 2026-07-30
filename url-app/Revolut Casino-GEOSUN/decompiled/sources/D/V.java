package D;

import java.io.File;

/* loaded from: classes.dex */
public final class V extends F0.j implements E0.l {

    /* renamed from: f, reason: collision with root package name */
    public static final V f145f = new V(1);

    @Override // E0.l
    public final Object i(Object obj) {
        File file = (File) obj;
        F0.i.e(file, "it");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        F0.i.d(absolutePath, "file.canonicalFile.absolutePath");
        return new l0(absolutePath);
    }
}
