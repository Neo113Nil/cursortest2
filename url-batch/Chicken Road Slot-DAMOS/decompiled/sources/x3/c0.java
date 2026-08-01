package x3;

import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class c0 {
    public static IOException a(File file, IOException iOException) {
        StringBuilder sb2 = new StringBuilder("Inoperable file:");
        try {
            sb2.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb2.append(" failed to attach additional metadata");
        }
        return new IOException(sb2.toString(), iOException);
    }

    public static IOException b(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        return parentFile == null ? a(file, iOException) : parentFile.exists() ? parentFile.isFile() ? parentFile.canRead() ? parentFile.canWrite() ? a(file, iOException) : a(file, iOException) : parentFile.canWrite() ? a(file, iOException) : a(file, iOException) : parentFile.canRead() ? parentFile.canWrite() ? a(file, iOException) : a(file, iOException) : parentFile.canWrite() ? a(file, iOException) : a(file, iOException) : a(file, iOException);
    }

    public static int c(int i3) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i10 = 0; i10 < 6; i10++) {
            int i11 = iArr[i10];
            int i12 = i11 - 1;
            if (i11 == 0) {
                throw null;
            }
            if (i12 == i3) {
                return i11;
            }
        }
        return 1;
    }
}
