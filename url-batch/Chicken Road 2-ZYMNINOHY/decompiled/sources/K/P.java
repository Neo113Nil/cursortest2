package K;

import java.io.File;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public final class P extends kotlin.jvm.internal.j implements InterfaceC1339l {

    /* renamed from: e, reason: collision with root package name */
    public static final P f1292e = new P(1);

    @Override // o3.InterfaceC1339l
    public final Object invoke(Object obj) {
        File it = (File) obj;
        kotlin.jvm.internal.i.e(it, "it");
        String absolutePath = it.getCanonicalFile().getAbsolutePath();
        kotlin.jvm.internal.i.d(absolutePath, "file.canonicalFile.absolutePath");
        return new g0(absolutePath);
    }
}
