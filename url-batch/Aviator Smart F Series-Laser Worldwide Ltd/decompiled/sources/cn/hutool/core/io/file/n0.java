package cn.hutool.core.io.file;

import cn.hutool.core.io.IORuntimeException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.file.AccessDeniedException;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class n0 {

    static class a extends SimpleFileVisitor {
        final /* synthetic */ FileFilter val$fileFilter;
        final /* synthetic */ List val$fileList;

        a(FileFilter fileFilter, List list) {
            this.val$fileFilter = fileFilter;
            this.val$fileList = list;
        }

        @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
        public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
            return visitFile(h.c.a(obj), basicFileAttributes);
        }

        public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) {
            File file;
            FileVisitResult fileVisitResult;
            file = path.toFile();
            FileFilter fileFilter = this.val$fileFilter;
            if (fileFilter == null || fileFilter.accept(file)) {
                this.val$fileList.add(file);
            }
            fileVisitResult = FileVisitResult.CONTINUE;
            return fileVisitResult;
        }
    }

    public static Path copy(Path path, Path path2, CopyOption... copyOptionArr) {
        Path fileName;
        Path resolve;
        cn.hutool.core.lang.q.notNull(path, "Src path must be not null !", new Object[0]);
        cn.hutool.core.lang.q.notNull(path2, "Target path must be not null !", new Object[0]);
        if (!isDirectory(path)) {
            return copyFile(path, path2, copyOptionArr);
        }
        fileName = path.getFileName();
        resolve = path2.resolve(fileName);
        return copyContent(path, resolve, copyOptionArr);
    }

    public static Path copyContent(Path path, Path path2, CopyOption... copyOptionArr) {
        cn.hutool.core.lang.q.notNull(path, "Src path must be not null !", new Object[0]);
        cn.hutool.core.lang.q.notNull(path2, "Target path must be not null !", new Object[0]);
        try {
            Files.walkFileTree(path, new k.a(path, path2, copyOptionArr));
            return path2;
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static Path copyFile(Path path, Path path2, StandardCopyOption... standardCopyOptionArr) {
        return copyFile(path, path2, (CopyOption[]) standardCopyOptionArr);
    }

    public static Path createTempFile(String str, String str2, Path path) {
        Path createTempFile;
        Path createTempFile2;
        int i8 = 0;
        do {
            try {
                if (path == null) {
                    createTempFile2 = Files.createTempFile(str, str2, new FileAttribute[0]);
                    return createTempFile2;
                }
                createTempFile = Files.createTempFile(mkdir(path), str, str2, new FileAttribute[0]);
                return createTempFile;
            } catch (IOException e8) {
                i8++;
            }
        } while (i8 < 50);
        throw new IORuntimeException(e8);
    }

    public static boolean del(Path path) {
        boolean notExists;
        notExists = Files.notExists(path, new LinkOption[0]);
        if (notExists) {
            return true;
        }
        try {
            if (isDirectory(path)) {
                Files.walkFileTree(path, k.b.INSTANCE);
            } else {
                delFile(path);
            }
            return true;
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    protected static void delFile(Path path) {
        File file;
        try {
            Files.delete(path);
        } catch (AccessDeniedException e8) {
            file = path.toFile();
            if (!file.delete()) {
                throw e8;
            }
        }
    }

    public static boolean equals(Path path, Path path2) {
        boolean isSameFile;
        try {
            isSameFile = Files.isSameFile(path, path2);
            return isSameFile;
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static boolean exists(Path path, boolean z7) {
        LinkOption[] linkOptionArr;
        LinkOption linkOption;
        boolean exists;
        if (z7) {
            linkOptionArr = new LinkOption[0];
        } else {
            linkOption = LinkOption.NOFOLLOW_LINKS;
            linkOptionArr = new LinkOption[]{linkOption};
        }
        exists = Files.exists(path, linkOptionArr);
        return exists;
    }

    public static BasicFileAttributes getAttributes(Path path, boolean z7) {
        LinkOption[] linkOptionArr;
        LinkOption linkOption;
        BasicFileAttributes readAttributes;
        if (path == null) {
            return null;
        }
        if (z7) {
            linkOptionArr = new LinkOption[0];
        } else {
            linkOption = LinkOption.NOFOLLOW_LINKS;
            linkOptionArr = new LinkOption[]{linkOption};
        }
        try {
            readAttributes = Files.readAttributes(path, (Class<BasicFileAttributes>) t.a(), linkOptionArr);
            return readAttributes;
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static BufferedInputStream getInputStream(Path path) {
        InputStream newInputStream;
        try {
            newInputStream = Files.newInputStream(path, new OpenOption[0]);
            return cn.hutool.core.io.n.toBuffered(newInputStream);
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static Path getLastPathEle(Path path) {
        int nameCount;
        nameCount = path.getNameCount();
        return getPathEle(path, nameCount - 1);
    }

    public static String getMimeType(Path path) {
        String probeContentType;
        try {
            probeContentType = Files.probeContentType(path);
            return probeContentType;
        } catch (IOException unused) {
            return null;
        }
    }

    public static String getName(Path path) {
        Path fileName;
        String path2;
        if (path == null) {
            return null;
        }
        fileName = path.getFileName();
        path2 = fileName.toString();
        return path2;
    }

    public static BufferedOutputStream getOutputStream(Path path) {
        OutputStream newOutputStream;
        try {
            newOutputStream = Files.newOutputStream(path, new OpenOption[0]);
            return cn.hutool.core.io.n.toBuffered(newOutputStream);
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static Path getPathEle(Path path, int i8) {
        return subPath(path, i8, i8 == -1 ? path.getNameCount() : i8 + 1);
    }

    public static BufferedReader getReader(Path path, Charset charset) {
        return cn.hutool.core.io.n.getReader(getInputStream(path), charset);
    }

    public static BufferedReader getUtf8Reader(Path path) {
        return getReader(path, cn.hutool.core.util.l.CHARSET_UTF_8);
    }

    public static boolean isDirEmpty(Path path) {
        DirectoryStream newDirectoryStream;
        Iterator it;
        try {
            newDirectoryStream = Files.newDirectoryStream(path);
            try {
                it = newDirectoryStream.iterator();
                boolean z7 = !it.hasNext();
                if (newDirectoryStream != null) {
                    newDirectoryStream.close();
                }
                return z7;
            } finally {
            }
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static boolean isDirectory(Path path) {
        return isDirectory(path, false);
    }

    public static boolean isExistsAndNotDirectory(Path path, boolean z7) {
        return exists(path, z7) && !isDirectory(path, z7);
    }

    public static boolean isFile(Path path, boolean z7) {
        LinkOption[] linkOptionArr;
        LinkOption linkOption;
        boolean isRegularFile;
        if (path == null) {
            return false;
        }
        if (z7) {
            linkOptionArr = new LinkOption[0];
        } else {
            linkOption = LinkOption.NOFOLLOW_LINKS;
            linkOptionArr = new LinkOption[]{linkOption};
        }
        isRegularFile = Files.isRegularFile(path, linkOptionArr);
        return isRegularFile;
    }

    public static boolean isSub(Path path, Path path2) {
        boolean startsWith;
        startsWith = toAbsNormal(path2).startsWith(toAbsNormal(path));
        return startsWith;
    }

    public static boolean isSymlink(Path path) {
        boolean isSymbolicLink;
        isSymbolicLink = Files.isSymbolicLink(path);
        return isSymbolicLink;
    }

    public static List<File> loopFiles(Path path, FileFilter fileFilter) {
        return loopFiles(path, -1, fileFilter);
    }

    public static Path mkParentDirs(Path path) {
        Path parent;
        parent = path.getParent();
        return mkdir(parent);
    }

    public static Path mkdir(Path path) {
        if (path != null && !exists(path, false)) {
            try {
                Files.createDirectories(path, new FileAttribute[0]);
            } catch (IOException e8) {
                throw new IORuntimeException(e8);
            }
        }
        return path;
    }

    public static Path move(Path path, Path path2, boolean z7) {
        return n.of(path, path2, z7).move();
    }

    public static Path moveContent(Path path, Path path2, boolean z7) {
        return n.of(path, path2, z7).moveContent();
    }

    public static byte[] readBytes(Path path) {
        byte[] readAllBytes;
        try {
            readAllBytes = Files.readAllBytes(path);
            return readAllBytes;
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static Path rename(Path path, String str, boolean z7) {
        Path resolveSibling;
        resolveSibling = path.resolveSibling(str);
        return move(path, resolveSibling, z7);
    }

    public static Path subPath(Path path, int i8, int i9) {
        int nameCount;
        Path subpath;
        if (path == null) {
            return null;
        }
        nameCount = path.getNameCount();
        if (i8 < 0) {
            i8 += nameCount;
            if (i8 < 0) {
                i8 = 0;
            }
        } else if (i8 > nameCount) {
            i8 = nameCount;
        }
        if (i9 >= 0 ? i9 > nameCount : (i9 = i9 + nameCount) < 0) {
            i9 = nameCount;
        }
        if (i9 < i8) {
            int i10 = i9;
            i9 = i8;
            i8 = i10;
        }
        if (i8 == i9) {
            return null;
        }
        subpath = path.subpath(i8, i9);
        return subpath;
    }

    public static Path toAbsNormal(Path path) {
        Path absolutePath;
        Path normalize;
        cn.hutool.core.lang.q.notNull(path);
        absolutePath = path.toAbsolutePath();
        normalize = absolutePath.normalize();
        return normalize;
    }

    public static void walkFiles(Path path, FileVisitor<? super Path> fileVisitor) {
        walkFiles(path, -1, fileVisitor);
    }

    public static Path copyFile(Path path, Path path2, CopyOption... copyOptionArr) {
        Path copy;
        Path fileName;
        cn.hutool.core.lang.q.notNull(path, "Source File is null !", new Object[0]);
        cn.hutool.core.lang.q.notNull(path2, "Destination File or directory is null !", new Object[0]);
        if (isDirectory(path2)) {
            fileName = path.getFileName();
            path2 = path2.resolve(fileName);
        }
        mkParentDirs(path2);
        try {
            copy = Files.copy(path, path2, copyOptionArr);
            return copy;
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static boolean isDirectory(Path path, boolean z7) {
        LinkOption[] linkOptionArr;
        LinkOption linkOption;
        boolean isDirectory;
        if (path == null) {
            return false;
        }
        if (z7) {
            linkOptionArr = new LinkOption[0];
        } else {
            linkOption = LinkOption.NOFOLLOW_LINKS;
            linkOptionArr = new LinkOption[]{linkOption};
        }
        isDirectory = Files.isDirectory(path, linkOptionArr);
        return isDirectory;
    }

    public static List<File> loopFiles(Path path, int i8, FileFilter fileFilter) {
        boolean exists;
        File file;
        ArrayList arrayList = new ArrayList();
        if (path != null) {
            exists = Files.exists(path, new LinkOption[0]);
            if (exists) {
                if (!isDirectory(path)) {
                    file = path.toFile();
                    if (fileFilter == null || fileFilter.accept(file)) {
                        arrayList.add(file);
                    }
                    return arrayList;
                }
                walkFiles(path, i8, new a(fileFilter, arrayList));
            }
        }
        return arrayList;
    }

    public static void walkFiles(Path path, int i8, FileVisitor<? super Path> fileVisitor) {
        if (i8 < 0) {
            i8 = Integer.MAX_VALUE;
        }
        try {
            Files.walkFileTree(path, EnumSet.noneOf(d0.a()), i8, fileVisitor);
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }
}
