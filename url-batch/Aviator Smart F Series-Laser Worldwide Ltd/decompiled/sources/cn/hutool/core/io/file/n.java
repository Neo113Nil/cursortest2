package cn.hutool.core.io.file;

import cn.hutool.core.io.IORuntimeException;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

/* loaded from: classes.dex */
public class n {
    private final CopyOption[] options;
    private final Path src;
    private final Path target;

    public n(Path path, Path path2, CopyOption[] copyOptionArr) {
        cn.hutool.core.lang.q.notNull(path2, "Src path must be not null !", new Object[0]);
        if (!n0.exists(path, false)) {
            throw new IllegalArgumentException("Src path is not exist!");
        }
        this.src = path;
        this.target = h.c.a(cn.hutool.core.lang.q.notNull(path2, "Target path must be not null !", new Object[0]));
        this.options = (CopyOption[]) cn.hutool.core.util.e0.defaultIfNull(copyOptionArr, new CopyOption[0]);
    }

    public static n of(Path path, Path path2, boolean z7) {
        CopyOption[] copyOptionArr;
        StandardCopyOption standardCopyOption;
        if (z7) {
            standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
            copyOptionArr = new CopyOption[]{standardCopyOption};
        } else {
            copyOptionArr = new CopyOption[0];
        }
        return of(path, path2, copyOptionArr);
    }

    private static void walkMove(Path path, Path path2, CopyOption... copyOptionArr) {
        try {
            Files.walkFileTree(path, new k.e(path, path2, copyOptionArr));
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public Path move() {
        Path move;
        Path fileName;
        boolean exists;
        Path path = this.src;
        Path path2 = this.target;
        CopyOption[] copyOptionArr = this.options;
        if (n0.isSub(path, path2)) {
            exists = Files.exists(path2, new LinkOption[0]);
            if (exists && n0.equals(path, path2)) {
                return path2;
            }
            throw new IllegalArgumentException(cn.hutool.core.text.l.format("Target [{}] is sub path of src [{}]!", path2, path));
        }
        if (n0.isDirectory(path2)) {
            fileName = path.getFileName();
            path2 = path2.resolve(fileName);
        }
        n0.mkParentDirs(path2);
        try {
            move = Files.move(path, path2, copyOptionArr);
            return move;
        } catch (IOException e8) {
            if (m.a(e8)) {
                throw new IORuntimeException(e8);
            }
            walkMove(path, path2, copyOptionArr);
            n0.del(path);
            return path2;
        }
    }

    public Path moveContent() {
        Path path = this.src;
        if (n0.isExistsAndNotDirectory(this.target, false)) {
            return move();
        }
        Path path2 = this.target;
        if (n0.isExistsAndNotDirectory(path2, false)) {
            throw new IllegalArgumentException("Can not move dir content to a file");
        }
        if (n0.equals(path, path2)) {
            return path2;
        }
        CopyOption[] copyOptionArr = this.options;
        n0.mkParentDirs(path2);
        walkMove(path, path2, copyOptionArr);
        return path2;
    }

    public static n of(Path path, Path path2, CopyOption[] copyOptionArr) {
        return new n(path, path2, copyOptionArr);
    }
}
