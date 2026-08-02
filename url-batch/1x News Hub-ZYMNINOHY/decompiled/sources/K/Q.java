package K;

import java.io.File;

/* loaded from: classes.dex */
public final class Q extends kotlin.jvm.internal.k implements l2.l {

    /* renamed from: e, reason: collision with root package name */
    public static final Q f712e = new Q(1);

    @Override // l2.l
    public final Object invoke(Object obj) {
        File it = (File) obj;
        kotlin.jvm.internal.j.e(it, "it");
        String absolutePath = it.getCanonicalFile().getAbsolutePath();
        kotlin.jvm.internal.j.d(absolutePath, "file.canonicalFile.absolutePath");
        return new h0(absolutePath);
    }
}
