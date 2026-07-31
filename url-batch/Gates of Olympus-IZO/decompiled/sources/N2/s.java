package N2;

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

/* loaded from: classes.dex */
public final class s extends r {
    public static Long f(FileTime fileTime) {
        long millis;
        millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (millis != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // N2.r, N2.m
    public final l b(v vVar) {
        Z1.i.f(vVar, "path");
        Path g3 = vVar.g();
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(g3, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path readSymbolicLink = readAttributes.isSymbolicLink() ? Files.readSymbolicLink(g3) : null;
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            if (readSymbolicLink != null) {
                String str = v.f2966e;
                F0.a.l(readSymbolicLink.toString(), false);
            }
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            Long f3 = creationTime != null ? f(creationTime) : null;
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            Long f4 = lastModifiedTime != null ? f(lastModifiedTime) : null;
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            return new l(isRegularFile, isDirectory, valueOf, f3, f4, lastAccessTime != null ? f(lastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // N2.r
    public final void d(v vVar, v vVar2) {
        Z1.i.f(vVar2, "target");
        try {
            Files.move(vVar.g(), vVar2.g(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e3) {
            throw new FileNotFoundException(e3.getMessage());
        }
    }

    @Override // N2.r
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
