package k;

import cn.hutool.core.io.file.n0;
import java.nio.file.CopyOption;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;

/* loaded from: classes.dex */
public class e extends SimpleFileVisitor {
    private final CopyOption[] copyOptions;
    private boolean isTargetCreated;
    private final Path source;
    private final Path target;

    public e(Path path, Path path2, CopyOption... copyOptionArr) {
        if (n0.exists(path2, false) && !n0.isDirectory(path2)) {
            throw new IllegalArgumentException("Target must be a directory");
        }
        this.source = path;
        this.target = path2;
        this.copyOptions = copyOptionArr;
    }

    private void initTarget() {
        if (this.isTargetCreated) {
            return;
        }
        n0.mkdir(this.target);
        this.isTargetCreated = true;
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
        Path relativize;
        Path resolve;
        boolean exists;
        boolean isDirectory;
        String path2;
        FileVisitResult fileVisitResult;
        initTarget();
        Path path3 = this.target;
        relativize = this.source.relativize(path);
        resolve = path3.resolve(relativize);
        exists = Files.exists(resolve, new LinkOption[0]);
        if (exists) {
            isDirectory = Files.isDirectory(resolve, new LinkOption[0]);
            if (!isDirectory) {
                d.a();
                path2 = resolve.toString();
                throw c.a(path2);
            }
        } else {
            Files.createDirectories(resolve, new FileAttribute[0]);
        }
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }

    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) {
        Path relativize;
        Path resolve;
        FileVisitResult fileVisitResult;
        initTarget();
        Path path2 = this.target;
        relativize = this.source.relativize(path);
        resolve = path2.resolve(relativize);
        Files.move(path, resolve, this.copyOptions);
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }
}
