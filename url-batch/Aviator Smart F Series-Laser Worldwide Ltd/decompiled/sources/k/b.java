package k;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/* loaded from: classes.dex */
public class b extends SimpleFileVisitor {
    public static b INSTANCE = new b();

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Object obj, IOException iOException) {
        return postVisitDirectory(h.c.a(obj), iOException);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        return visitFile(h.c.a(obj), basicFileAttributes);
    }

    public FileVisitResult postVisitDirectory(Path path, IOException iOException) {
        FileVisitResult fileVisitResult;
        if (iOException != null) {
            throw iOException;
        }
        Files.delete(path);
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }

    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) {
        FileVisitResult fileVisitResult;
        Files.delete(path);
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }
}
