package okio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import okio.o0;

/* loaded from: classes5.dex */
public final class i0 extends u {
    private final Long zeroToNull(FileTime fileTime) {
        long millis;
        millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (valueOf.longValue() != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // okio.u, okio.k
    public void atomicMove(o0 source, o0 target) {
        String message;
        StandardCopyOption standardCopyOption;
        StandardCopyOption standardCopyOption2;
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.s.checkNotNullParameter(target, "target");
        try {
            Path nioPath = source.toNioPath();
            Path nioPath2 = target.toNioPath();
            standardCopyOption = StandardCopyOption.ATOMIC_MOVE;
            standardCopyOption2 = StandardCopyOption.REPLACE_EXISTING;
            Files.move(nioPath, nioPath2, a0.a(standardCopyOption), a0.a(standardCopyOption2));
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e8) {
            message = e8.getMessage();
            throw new FileNotFoundException(message);
        }
    }

    @Override // okio.u, okio.k
    public void createSymlink(o0 source, o0 target) {
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.s.checkNotNullParameter(target, "target");
        Files.createSymbolicLink(source.toNioPath(), target.toNioPath(), new FileAttribute[0]);
    }

    @Override // okio.u, okio.k
    public j metadataOrNull(o0 path) {
        LinkOption linkOption;
        BasicFileAttributes readAttributes;
        boolean isSymbolicLink;
        boolean isRegularFile;
        boolean isDirectory;
        long size;
        FileTime creationTime;
        FileTime lastModifiedTime;
        FileTime lastAccessTime;
        kotlin.jvm.internal.s.checkNotNullParameter(path, "path");
        Path nioPath = path.toNioPath();
        try {
            Class a8 = cn.hutool.core.io.file.t.a();
            linkOption = LinkOption.NOFOLLOW_LINKS;
            readAttributes = Files.readAttributes(nioPath, (Class<BasicFileAttributes>) a8, linkOption);
            isSymbolicLink = readAttributes.isSymbolicLink();
            Path readSymbolicLink = isSymbolicLink ? Files.readSymbolicLink(nioPath) : h.c.a(null);
            isRegularFile = readAttributes.isRegularFile();
            isDirectory = readAttributes.isDirectory();
            o0 o0Var = readSymbolicLink == null ? null : o0.a.get$default(o0.Companion, readSymbolicLink, false, 1, (Object) null);
            size = readAttributes.size();
            Long valueOf = Long.valueOf(size);
            creationTime = readAttributes.creationTime();
            Long zeroToNull = creationTime == null ? null : zeroToNull(creationTime);
            lastModifiedTime = readAttributes.lastModifiedTime();
            Long zeroToNull2 = lastModifiedTime == null ? null : zeroToNull(lastModifiedTime);
            lastAccessTime = readAttributes.lastAccessTime();
            return new j(isRegularFile, isDirectory, o0Var, valueOf, zeroToNull, zeroToNull2, lastAccessTime != null ? zeroToNull(lastAccessTime) : null, null, 128, null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // okio.u
    public String toString() {
        return "NioSystemFileSystem";
    }
}
