package f2;

import java.io.File;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
class l extends k {
    public static final h i(File file, FileWalkDirection direction) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return new h(file, direction);
    }

    public static final h j(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return i(file, FileWalkDirection.f41126c);
    }
}
