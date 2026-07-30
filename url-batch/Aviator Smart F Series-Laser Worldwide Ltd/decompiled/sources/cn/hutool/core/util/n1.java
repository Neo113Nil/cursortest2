package cn.hutool.core.util;

import cn.hutool.core.collection.EnumerationIter;
import cn.hutool.core.exceptions.UtilException;
import cn.hutool.core.io.IORuntimeException;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.file.CopyOption;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* loaded from: classes.dex */
public class n1 {
    private static final int DEFAULT_BYTE_ARRAY_LENGTH = 32;
    private static final Charset DEFAULT_CHARSET = l.defaultCharset();

    public static void append(Path path, Path path2, CopyOption... copyOptionArr) {
        String path3;
        boolean isDirectory;
        Path path4;
        Path parent;
        try {
            path3 = path.toString();
            FileSystem createZip = cn.hutool.core.io.file.f.createZip(path3);
            try {
                isDirectory = Files.isDirectory(path2, new LinkOption[0]);
                if (isDirectory) {
                    parent = path2.getParent();
                    if (parent == null) {
                        parent = path2;
                    }
                    Files.walkFileTree(path2, new h.j(parent, createZip, copyOptionArr));
                } else {
                    path4 = createZip.getPath(cn.hutool.core.io.file.n0.getName(path2), new String[0]);
                    Files.copy(path2, path4, copyOptionArr);
                }
                if (createZip != null) {
                    createZip.close();
                }
            } finally {
            }
        } catch (FileAlreadyExistsException unused) {
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static InputStream get(File file, Charset charset, String str) {
        return get(toZipFile(file, charset), str);
    }

    public static InputStream getStream(ZipFile zipFile, ZipEntry zipEntry) {
        try {
            return new cn.hutool.core.io.o(zipFile.getInputStream(zipEntry), zipEntry.getSize());
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static ZipOutputStream getZipOutputStream(OutputStream outputStream, Charset charset) {
        return outputStream instanceof ZipOutputStream ? (ZipOutputStream) outputStream : k1.a(outputStream, charset);
    }

    public static byte[] gzip(String str, String str2) {
        return gzip(cn.hutool.core.text.l.bytes(str, str2));
    }

    public static List<String> listFileNames(ZipFile zipFile, String str) {
        if (cn.hutool.core.text.l.isNotBlank(str)) {
            str = cn.hutool.core.text.l.addSuffixIfNot(str, "/");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = new EnumerationIter(zipFile.entries()).iterator();
        while (it.hasNext()) {
            String name = ((ZipEntry) it.next()).getName();
            if (cn.hutool.core.text.l.isEmpty(str) || name.startsWith(str)) {
                String removePrefix = cn.hutool.core.text.l.removePrefix(name, str);
                if (cn.hutool.core.text.l.isNotEmpty(removePrefix) && !cn.hutool.core.text.l.contains(removePrefix, cn.hutool.core.io.file.c.UNIX_SEPARATOR)) {
                    arrayList.add(removePrefix);
                }
            }
        }
        return arrayList;
    }

    public static void read(ZipFile zipFile, Consumer<ZipEntry> consumer) {
        h.m mVar = new h.m(zipFile);
        try {
            mVar.read(consumer);
            mVar.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    mVar.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static ZipFile toZipFile(File file, Charset charset) {
        try {
            m1.a();
            return l1.a(file, (Charset) e0.defaultIfNull(charset, l.CHARSET_UTF_8));
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static String unGzip(byte[] bArr, String str) {
        return c1.str(unGzip(bArr), str);
    }

    public static String unZlib(byte[] bArr, String str) {
        return c1.str(unZlib(bArr), str);
    }

    public static File unzip(String str) {
        return unzip(str, DEFAULT_CHARSET);
    }

    public static byte[] unzipFileBytes(String str, String str2) {
        return unzipFileBytes(str, DEFAULT_CHARSET, str2);
    }

    private static void validateFiles(File file, File... fileArr) {
        File parentFile;
        if (file.isDirectory()) {
            throw new UtilException("Zip file [{}] must not be a directory !", file.getAbsoluteFile());
        }
        for (File file2 : fileArr) {
            if (file2 != null) {
                if (!file2.exists()) {
                    throw new UtilException(cn.hutool.core.text.l.format("File [{}] not exist!", file2.getAbsolutePath()));
                }
                try {
                    parentFile = file.getCanonicalFile().getParentFile();
                } catch (IOException unused) {
                    parentFile = file.getParentFile();
                }
                if (file2.isDirectory() && cn.hutool.core.io.l.isSub(file2, parentFile)) {
                    throw new UtilException("Zip file path [{}] must not be the child directory of [{}] !", file.getPath(), file2.getPath());
                }
            }
        }
    }

    public static File zip(String str) {
        return zip(str, DEFAULT_CHARSET);
    }

    public static byte[] zlib(String str, String str2, int i8) {
        return zlib(cn.hutool.core.text.l.bytes(str, str2), i8);
    }

    public static InputStream get(ZipFile zipFile, String str) {
        ZipEntry entry = zipFile.getEntry(str);
        if (entry != null) {
            return getStream(zipFile, entry);
        }
        return null;
    }

    public static byte[] gzip(byte[] bArr) {
        return gzip(new ByteArrayInputStream(bArr), bArr.length);
    }

    public static byte[] unGzip(byte[] bArr) {
        return unGzip(new ByteArrayInputStream(bArr), bArr.length);
    }

    public static byte[] unZlib(byte[] bArr) {
        return unZlib(new ByteArrayInputStream(bArr), bArr.length);
    }

    public static File unzip(String str, Charset charset) {
        return unzip(cn.hutool.core.io.l.file(str), charset);
    }

    public static byte[] unzipFileBytes(String str, Charset charset, String str2) {
        return unzipFileBytes(cn.hutool.core.io.l.file(str), charset, str2);
    }

    public static File zip(String str, Charset charset) {
        return zip(cn.hutool.core.io.l.file(str), charset);
    }

    public static byte[] zlib(File file, int i8) {
        BufferedInputStream bufferedInputStream;
        try {
            bufferedInputStream = cn.hutool.core.io.l.getInputStream(file);
            try {
                byte[] zlib = zlib(bufferedInputStream, i8, (int) file.length());
                cn.hutool.core.io.n.close((Closeable) bufferedInputStream);
                return zlib;
            } catch (Throwable th) {
                th = th;
                cn.hutool.core.io.n.close((Closeable) bufferedInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream = null;
        }
    }

    public static byte[] gzip(File file) {
        BufferedInputStream bufferedInputStream;
        try {
            bufferedInputStream = cn.hutool.core.io.l.getInputStream(file);
            try {
                byte[] gzip = gzip(bufferedInputStream, (int) file.length());
                cn.hutool.core.io.n.close((Closeable) bufferedInputStream);
                return gzip;
            } catch (Throwable th) {
                th = th;
                cn.hutool.core.io.n.close((Closeable) bufferedInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream = null;
        }
    }

    public static byte[] unGzip(InputStream inputStream) {
        return unGzip(inputStream, 32);
    }

    public static byte[] unZlib(InputStream inputStream) {
        return unZlib(inputStream, 32);
    }

    public static File unzip(File file) {
        return unzip(file, DEFAULT_CHARSET);
    }

    public static byte[] unzipFileBytes(File file, String str) {
        return unzipFileBytes(file, DEFAULT_CHARSET, str);
    }

    public static File zip(File file) {
        return zip(file, DEFAULT_CHARSET);
    }

    public static byte[] unGzip(InputStream inputStream, int i8) {
        cn.hutool.core.io.d dVar = new cn.hutool.core.io.d(i8);
        h.b.of(inputStream, dVar).unGzip().close();
        return dVar.toByteArray();
    }

    public static byte[] unZlib(InputStream inputStream, int i8) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i8);
        h.a.of(inputStream, byteArrayOutputStream, false).inflater();
        return byteArrayOutputStream.toByteArray();
    }

    public static File unzip(File file, Charset charset) {
        return unzip(file, cn.hutool.core.io.l.file(file.getParentFile(), cn.hutool.core.io.l.mainName(file)), charset);
    }

    public static byte[] unzipFileBytes(File file, Charset charset, String str) {
        h.m of = h.m.of(file, charset);
        try {
            byte[] readBytes = cn.hutool.core.io.n.readBytes(of.get(str));
            of.close();
            return readBytes;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (of != null) {
                    try {
                        of.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public static File zip(File file, Charset charset) {
        File file2 = cn.hutool.core.io.l.file(file.getParentFile(), cn.hutool.core.io.l.mainName(file) + ".zip");
        zip(file2, charset, false, file);
        return file2;
    }

    public static void read(ZipInputStream zipInputStream, Consumer<ZipEntry> consumer) {
        h.m mVar = new h.m(zipInputStream);
        try {
            mVar.read(consumer);
            mVar.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    mVar.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static File unzip(String str, String str2) {
        return unzip(str, str2, DEFAULT_CHARSET);
    }

    public static File zip(String str, String str2) {
        return zip(str, str2, false);
    }

    public static byte[] zlib(byte[] bArr, int i8) {
        return zlib(new ByteArrayInputStream(bArr), i8, bArr.length);
    }

    public static byte[] gzip(InputStream inputStream) {
        return gzip(inputStream, 32);
    }

    public static File unzip(String str, String str2, Charset charset) {
        return unzip(cn.hutool.core.io.l.file(str), cn.hutool.core.io.l.mkdir(str2), charset);
    }

    public static File zip(String str, String str2, boolean z7) {
        return zip(str, str2, DEFAULT_CHARSET, z7);
    }

    public static byte[] zlib(InputStream inputStream, int i8) {
        return zlib(inputStream, i8, 32);
    }

    public static byte[] gzip(InputStream inputStream, int i8) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i8);
        h.b.of(inputStream, byteArrayOutputStream).gzip().close();
        return byteArrayOutputStream.toByteArray();
    }

    public static File unzip(File file, File file2) {
        return unzip(file, file2, DEFAULT_CHARSET);
    }

    public static File zip(String str, String str2, Charset charset, boolean z7) {
        File file = cn.hutool.core.io.l.file(str);
        File file2 = cn.hutool.core.io.l.file(str2);
        zip(file2, charset, z7, file);
        return file2;
    }

    public static byte[] zlib(InputStream inputStream, int i8, int i9) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i9);
        h.a.of(inputStream, byteArrayOutputStream, false).deflater(i8);
        return byteArrayOutputStream.toByteArray();
    }

    public static File unzip(File file, File file2, Charset charset) {
        return unzip(toZipFile(file, charset), file2);
    }

    public static File unzip(ZipFile zipFile, File file) {
        return unzip(zipFile, file, -1L);
    }

    public static File unzip(ZipFile zipFile, File file, long j8) {
        if (file.exists() && file.isFile()) {
            throw new IllegalArgumentException(cn.hutool.core.text.l.format("Target path [{}] exist!", file.getAbsolutePath()));
        }
        long j9 = 0;
        if (j8 > 0) {
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                j9 += entries.nextElement().getSize();
                if (j9 > j8) {
                    throw new IllegalArgumentException("The file size exceeds the limit");
                }
            }
        }
        h.m mVar = new h.m(zipFile);
        try {
            mVar.readTo(file);
            mVar.close();
            return file;
        } finally {
        }
    }

    public static File zip(File file, boolean z7, File... fileArr) {
        return zip(file, DEFAULT_CHARSET, z7, fileArr);
    }

    public static File zip(File file, Charset charset, boolean z7, File... fileArr) {
        return zip(file, charset, z7, (FileFilter) null, fileArr);
    }

    public static File zip(File file, Charset charset, boolean z7, FileFilter fileFilter, File... fileArr) {
        validateFiles(file, fileArr);
        h.n.of(file, charset).add(z7, fileFilter, fileArr).close();
        return file;
    }

    public static void zip(OutputStream outputStream, Charset charset, boolean z7, FileFilter fileFilter, File... fileArr) {
        h.n.of(outputStream, charset).add(z7, fileFilter, fileArr).close();
    }

    @Deprecated
    public static void zip(ZipOutputStream zipOutputStream, boolean z7, FileFilter fileFilter, File... fileArr) {
        h.n nVar = new h.n(zipOutputStream);
        try {
            nVar.add(z7, fileFilter, fileArr);
            nVar.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    nVar.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static File zip(File file, String str, String str2) {
        return zip(file, str, str2, DEFAULT_CHARSET);
    }

    public static File zip(File file, String str, String str2, Charset charset) {
        return zip(file, str, cn.hutool.core.io.n.toStream(str2, charset), charset);
    }

    public static File zip(File file, String str, InputStream inputStream) {
        return zip(file, str, inputStream, DEFAULT_CHARSET);
    }

    public static File unzip(InputStream inputStream, File file, Charset charset) {
        if (charset == null) {
            charset = DEFAULT_CHARSET;
        }
        return unzip(h.k.a(inputStream, charset), file);
    }

    public static File zip(File file, String str, InputStream inputStream, Charset charset) {
        return zip(file, new String[]{str}, new InputStream[]{inputStream}, charset);
    }

    public static File unzip(ZipInputStream zipInputStream, File file) {
        h.m mVar = new h.m(zipInputStream);
        try {
            mVar.readTo(file);
            mVar.close();
            return file;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    mVar.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static File zip(File file, String[] strArr, InputStream[] inputStreamArr) {
        return zip(file, strArr, inputStreamArr, DEFAULT_CHARSET);
    }

    public static File zip(File file, String[] strArr, InputStream[] inputStreamArr, Charset charset) {
        h.n of = h.n.of(file, charset);
        try {
            of.add(strArr, inputStreamArr);
            of.close();
            return file;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (of != null) {
                    try {
                        of.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public static void zip(OutputStream outputStream, String[] strArr, InputStream[] inputStreamArr) {
        zip(getZipOutputStream(outputStream, DEFAULT_CHARSET), strArr, inputStreamArr);
    }

    public static void zip(ZipOutputStream zipOutputStream, String[] strArr, InputStream[] inputStreamArr) {
        h.n nVar = new h.n(zipOutputStream);
        try {
            nVar.add(strArr, inputStreamArr);
            nVar.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    nVar.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static File zip(File file, Charset charset, cn.hutool.core.io.resource.d... dVarArr) {
        h.n.of(file, charset).add(dVarArr).close();
        return file;
    }
}
