package defpackage;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yr1 extends e71 {
    public static Long m(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (millis != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // defpackage.e71, defpackage.gl0
    public final void b(qz1 qz1Var, qz1 qz1Var2) {
        qz1Var.getClass();
        qz1Var2.getClass();
        try {
            Path path = Paths.get(qz1Var.m.p(), new String[0]);
            path.getClass();
            Path path2 = Paths.get(qz1Var2.m.p(), new String[0]);
            path2.getClass();
            Files.move(path, path2, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            dm0.j("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // defpackage.e71, defpackage.gl0
    public final yk0 i(qz1 qz1Var) {
        qz1 qz1Var2;
        qz1Var.getClass();
        Path path = Paths.get(qz1Var.m.p(), new String[0]);
        path.getClass();
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path readSymbolicLink = readAttributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            if (readSymbolicLink != null) {
                String str = qz1.n;
                qz1Var2 = nm1.r(readSymbolicLink.toString());
            } else {
                qz1Var2 = null;
            }
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            Long m = creationTime != null ? m(creationTime) : null;
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            Long m2 = lastModifiedTime != null ? m(lastModifiedTime) : null;
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            return new yk0(isRegularFile, isDirectory, qz1Var2, valueOf, m, m2, lastAccessTime != null ? m(lastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // defpackage.e71
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
