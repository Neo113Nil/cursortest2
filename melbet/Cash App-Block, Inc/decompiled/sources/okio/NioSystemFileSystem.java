package okio;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import okio.Path;

/* loaded from: classes3.dex */
public final class NioSystemFileSystem extends JvmSystemFileSystem {
    public static Long zeroToNull(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (millis != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public final void atomicMove(Path path, Path path2) {
        path.getClass();
        path2.getClass();
        try {
            java.nio.file.Path path3 = Paths.get(path.bytes.utf8(), new String[0]);
            path3.getClass();
            java.nio.file.Path path4 = Paths.get(path2.bytes.utf8(), new String[0]);
            path4.getClass();
            Files.move(path3, path4, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            a$$ExternalSyntheticBUOutline0.m$4("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public final FileMetadata metadataOrNull(Path path) {
        Path path2;
        path.getClass();
        java.nio.file.Path path3 = Paths.get(path.bytes.utf8(), new String[0]);
        path3.getClass();
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(path3, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            java.nio.file.Path readSymbolicLink = readAttributes.isSymbolicLink() ? Files.readSymbolicLink(path3) : null;
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            if (readSymbolicLink != null) {
                String str = Path.DIRECTORY_SEPARATOR;
                path2 = Path.Companion.get(readSymbolicLink.toString(), false);
            } else {
                path2 = null;
            }
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            Long zeroToNull = creationTime != null ? zeroToNull(creationTime) : null;
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            Long zeroToNull2 = lastModifiedTime != null ? zeroToNull(lastModifiedTime) : null;
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            return new FileMetadata(isRegularFile, isDirectory, path2, valueOf, zeroToNull, zeroToNull2, lastAccessTime != null ? zeroToNull(lastAccessTime) : null, 128);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // okio.JvmSystemFileSystem
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
