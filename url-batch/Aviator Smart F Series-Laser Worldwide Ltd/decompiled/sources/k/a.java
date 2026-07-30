package k;

import cn.hutool.core.io.file.n0;
import java.nio.file.CopyOption;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/* loaded from: classes.dex */
public class a extends SimpleFileVisitor {
    private final CopyOption[] copyOptions;
    private boolean isTargetCreated;
    private final Path source;
    private final Path target;

    public a(Path path, Path path2, CopyOption... copyOptionArr) {
        if (n0.exists(path2, false) && !n0.isDirectory(path2)) {
            throw new IllegalArgumentException("Target must be a directory");
        }
        this.source = path;
        this.target = path2;
        this.copyOptions = copyOptionArr;
    }

    private void initTargetDir() {
        if (this.isTargetCreated) {
            return;
        }
        n0.mkdir(this.target);
        this.isTargetCreated = true;
    }

    private Path resolveTarget(Path path) {
        Path relativize;
        Path resolve;
        Path path2 = this.target;
        relativize = this.source.relativize(path);
        resolve = path2.resolve(relativize);
        return resolve;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        return preVisitDirectory(h.c.a(obj), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        return visitFile(h.c.a(obj), basicFileAttributes);
    }

    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) {
        boolean isDirectory;
        FileVisitResult fileVisitResult;
        initTargetDir();
        Path resolveTarget = resolveTarget(path);
        try {
            Files.copy(path, resolveTarget, this.copyOptions);
        } catch (FileAlreadyExistsException e8) {
            isDirectory = Files.isDirectory(resolveTarget, new LinkOption[0]);
            if (!isDirectory) {
                throw e8;
            }
        }
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }

    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) {
        FileVisitResult fileVisitResult;
        initTargetDir();
        Files.copy(path, resolveTarget(path), this.copyOptions);
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }
}
