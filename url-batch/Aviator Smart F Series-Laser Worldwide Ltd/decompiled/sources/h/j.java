package h;

import java.nio.file.CopyOption;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystem;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/* loaded from: classes.dex */
public class j extends SimpleFileVisitor {
    private final CopyOption[] copyOptions;
    private final FileSystem fileSystem;
    private final Path source;

    public j(Path path, FileSystem fileSystem, CopyOption... copyOptionArr) {
        this.source = path;
        this.fileSystem = fileSystem;
        this.copyOptions = copyOptionArr;
    }

    private Path resolveTarget(Path path) {
        Path relativize;
        String path2;
        Path path3;
        FileSystem fileSystem = this.fileSystem;
        relativize = this.source.relativize(path);
        path2 = relativize.toString();
        path3 = fileSystem.getPath(path2, new String[0]);
        return path3;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        return preVisitDirectory(c.a(obj), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        return visitFile(c.a(obj), basicFileAttributes);
    }

    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) {
        String path2;
        boolean isDirectory;
        FileVisitResult fileVisitResult;
        Path resolveTarget = resolveTarget(path);
        path2 = resolveTarget.toString();
        if (cn.hutool.core.text.l.isNotEmpty(path2)) {
            try {
                Files.copy(path, resolveTarget, this.copyOptions);
            } catch (DirectoryNotEmptyException unused) {
            } catch (FileAlreadyExistsException e8) {
                isDirectory = Files.isDirectory(resolveTarget, new LinkOption[0]);
                if (!isDirectory) {
                    throw e8;
                }
            }
        }
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }

    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) {
        FileVisitResult fileVisitResult;
        Files.copy(path, resolveTarget(path), this.copyOptions);
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }
}
