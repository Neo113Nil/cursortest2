package J2;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public final File f3405a;

    public h(File root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.f3405a = root;
    }

    public abstract File a();
}
