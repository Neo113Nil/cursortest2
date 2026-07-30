package f8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t extends s {
    public static Long i(FileTime fileTime) {
        long millis;
        millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (millis != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // f8.s, f8.m
    public final void a(w wVar, w wVar2) {
        r6.k.f(wVar2, "target");
        try {
            Files.move(wVar.m(), wVar2.m(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e9) {
            throw new FileNotFoundException(e9.getMessage());
        }
    }

    @Override // f8.s, f8.m
    public final l e(w wVar) {
        r6.k.f(wVar, "path");
        Path m8 = wVar.m();
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(m8, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path readSymbolicLink = readAttributes.isSymbolicLink() ? Files.readSymbolicLink(m8) : null;
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            if (readSymbolicLink != null) {
                String str = w.f3645g;
                j4.i.m(readSymbolicLink.toString(), false);
            }
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            Long i7 = creationTime != null ? i(creationTime) : null;
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            Long i8 = lastModifiedTime != null ? i(lastModifiedTime) : null;
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            return new l(isRegularFile, isDirectory, valueOf, i7, i8, lastAccessTime != null ? i(lastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // f8.s
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
