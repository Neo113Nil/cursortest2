package z3;

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
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s extends r {
    public static Long f(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (millis != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // z3.r, z3.m
    public final l b(v path) {
        Intrinsics.checkNotNullParameter(path, "path");
        Path nioPath = path.n();
        Intrinsics.checkNotNullParameter(nioPath, "nioPath");
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(nioPath, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path readSymbolicLink = readAttributes.isSymbolicLink() ? Files.readSymbolicLink(nioPath) : null;
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            if (readSymbolicLink != null) {
                String str = v.f12037e;
                Intrinsics.checkNotNullParameter(readSymbolicLink, "<this>");
                E1.i.i(readSymbolicLink.toString(), false);
            }
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            Long f4 = creationTime != null ? f(creationTime) : null;
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            Long f5 = lastModifiedTime != null ? f(lastModifiedTime) : null;
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            return new l(isRegularFile, isDirectory, valueOf, f4, f5, lastAccessTime != null ? f(lastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // z3.r
    public final void d(v source, v target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        try {
            Files.move(source.n(), target.n(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e4) {
            throw new FileNotFoundException(e4.getMessage());
        }
    }

    @Override // z3.r
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
