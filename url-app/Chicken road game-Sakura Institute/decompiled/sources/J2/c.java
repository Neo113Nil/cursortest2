package J2;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class c extends h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(File rootDir) {
        super(rootDir);
        Intrinsics.checkNotNullParameter(rootDir, "rootDir");
    }
}
