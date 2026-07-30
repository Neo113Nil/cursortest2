package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
class i extends FilesKt__FileReadWriteKt {
    public static final f walk(File file, FileWalkDirection direction) {
        s.checkNotNullParameter(file, "<this>");
        s.checkNotNullParameter(direction, "direction");
        return new f(file, direction);
    }

    public static /* synthetic */ f walk$default(File file, FileWalkDirection fileWalkDirection, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            fileWalkDirection = FileWalkDirection.TOP_DOWN;
        }
        return walk(file, fileWalkDirection);
    }

    public static final f walkBottomUp(File file) {
        s.checkNotNullParameter(file, "<this>");
        return walk(file, FileWalkDirection.BOTTOM_UP);
    }

    public static final f walkTopDown(File file) {
        s.checkNotNullParameter(file, "<this>");
        return walk(file, FileWalkDirection.TOP_DOWN);
    }
}
