package F;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

/* renamed from: F.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0019a {
    public static boolean a(File file, File file2) {
        try {
            Files.move(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
