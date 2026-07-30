package c6;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final File f4269a;

    public g(File root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.f4269a = root;
    }

    public abstract File a();
}
