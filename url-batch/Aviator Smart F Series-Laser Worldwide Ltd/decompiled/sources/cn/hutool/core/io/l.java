package cn.hutool.core.io;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.io.file.FileCopier;
import cn.hutool.core.io.file.FileMode;
import cn.hutool.core.io.file.FileReader;
import cn.hutool.core.io.file.FileWriter;
import cn.hutool.core.io.file.LineSeparator;
import cn.hutool.core.io.file.Tailer;
import cn.hutool.core.io.file.n0;
import cn.hutool.core.util.g1;
import cn.hutool.core.util.n1;
import cn.hutool.core.util.p0;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.LineNumberReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.jar.JarFile;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

/* loaded from: classes.dex */
public class l extends n0 {
    public static final String CLASS_EXT = ".class";
    public static final String JAR_FILE_EXT = ".jar";
    public static final String JAR_PATH_EXT = ".jar!";
    public static final String PATH_FILE_PRE = "file:";
    public static final String FILE_SEPARATOR = File.separator;
    public static final String PATH_SEPARATOR = File.pathSeparator;
    private static final Pattern PATTERN_PATH_ABSOLUTE = Pattern.compile("^[a-zA-Z]:([/\\\\].*)?");

    public static <T> File appendLines(Collection<T> collection, String str, String str2) {
        return writeLines((Collection) collection, str, str2, true);
    }

    public static File appendString(String str, String str2, String str3) {
        return appendString(str, touch(str2), str3);
    }

    public static <T> File appendUtf8Lines(Collection<T> collection, File file) {
        return appendLines(collection, file, cn.hutool.core.util.l.CHARSET_UTF_8);
    }

    public static File appendUtf8String(String str, String str2) {
        return appendString(str, str2, cn.hutool.core.util.l.CHARSET_UTF_8);
    }

    private static File buildFile(File file, String str) {
        String replace = str.replace(cn.hutool.core.io.file.c.WINDOWS_SEPARATOR, cn.hutool.core.io.file.c.UNIX_SEPARATOR);
        if (!isWindows() && replace.lastIndexOf(47, replace.length() - 2) > 0) {
            int i8 = 0;
            List<String> split = cn.hutool.core.text.l.split((CharSequence) replace, cn.hutool.core.io.file.c.UNIX_SEPARATOR, false, true);
            int size = split.size() - 1;
            while (i8 < size) {
                File file2 = new File(file, split.get(i8));
                i8++;
                file = file2;
            }
            file.mkdirs();
            replace = split.get(size);
        }
        return new File(file, replace);
    }

    public static File checkSlip(File file, File file2) {
        if (file == null || file2 == null || isSub(file, file2)) {
            return file2;
        }
        throw new IllegalArgumentException("New file is outside of the parent dir: " + file2.getName());
    }

    public static Checksum checksum(File file, Checksum checksum) {
        Path path;
        InputStream newInputStream;
        cn.hutool.core.lang.q.notNull(file, "File is null !", new Object[0]);
        if (file.isDirectory()) {
            throw new IllegalArgumentException("Checksums can't be computed on directories");
        }
        try {
            path = file.toPath();
            newInputStream = Files.newInputStream(path, new OpenOption[0]);
            return n.checksum(newInputStream, checksum);
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static long checksumCRC32(File file) {
        return checksum(file, new CRC32()).getValue();
    }

    public static boolean clean(String str) {
        return clean(file(str));
    }

    public static boolean cleanEmpty(File file) {
        if (file != null && file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (cn.hutool.core.util.h.isEmpty((Object[]) listFiles)) {
                return file.delete();
            }
            for (File file2 : listFiles) {
                cleanEmpty(file2);
            }
        }
        return true;
    }

    public static String cleanInvalid(String str) {
        return cn.hutool.core.io.file.c.cleanInvalid(str);
    }

    public static boolean containsInvalid(String str) {
        return cn.hutool.core.io.file.c.containsInvalid(str);
    }

    public static boolean contentEquals(File file, File file2) {
        BufferedInputStream bufferedInputStream;
        boolean exists = file.exists();
        if (exists != file2.exists()) {
            return false;
        }
        if (!exists) {
            return true;
        }
        if (file.isDirectory() || file2.isDirectory()) {
            throw new IORuntimeException("Can't compare directories, only files");
        }
        if (file.length() != file2.length()) {
            return false;
        }
        if (equals(file, file2)) {
            return true;
        }
        BufferedInputStream bufferedInputStream2 = null;
        try {
            BufferedInputStream inputStream = getInputStream(file);
            try {
                bufferedInputStream2 = getInputStream(file2);
                boolean contentEquals = n.contentEquals(inputStream, bufferedInputStream2);
                n.close((Closeable) inputStream);
                n.close((Closeable) bufferedInputStream2);
                return contentEquals;
            } catch (Throwable th) {
                th = th;
                BufferedInputStream bufferedInputStream3 = bufferedInputStream2;
                bufferedInputStream2 = inputStream;
                bufferedInputStream = bufferedInputStream3;
                n.close((Closeable) bufferedInputStream2);
                n.close((Closeable) bufferedInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream = null;
        }
    }

    public static boolean contentEqualsIgnoreEOL(File file, File file2, Charset charset) {
        BufferedReader bufferedReader;
        boolean exists = file.exists();
        if (exists != file2.exists()) {
            return false;
        }
        if (!exists) {
            return true;
        }
        if (file.isDirectory() || file2.isDirectory()) {
            throw new IORuntimeException("Can't compare directories, only files");
        }
        if (equals(file, file2)) {
            return true;
        }
        BufferedReader bufferedReader2 = null;
        try {
            BufferedReader reader = getReader(file, charset);
            try {
                bufferedReader2 = getReader(file2, charset);
                boolean contentEqualsIgnoreEOL = n.contentEqualsIgnoreEOL(reader, bufferedReader2);
                n.close((Closeable) reader);
                n.close((Closeable) bufferedReader2);
                return contentEqualsIgnoreEOL;
            } catch (Throwable th) {
                th = th;
                BufferedReader bufferedReader3 = bufferedReader2;
                bufferedReader2 = reader;
                bufferedReader = bufferedReader3;
                n.close((Closeable) bufferedReader2);
                n.close((Closeable) bufferedReader);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
    }

    public static File convertCharset(File file, Charset charset, Charset charset2) {
        return cn.hutool.core.util.l.convert(file, charset, charset2);
    }

    public static File convertLineSeparator(File file, Charset charset, LineSeparator lineSeparator) {
        return FileWriter.create(file, charset).writeLines(readLines(file, charset), lineSeparator, false);
    }

    public static File copy(String str, String str2, boolean z7) {
        return copy(file(str), file(str2), z7);
    }

    public static File copyContent(File file, File file2, boolean z7) {
        return FileCopier.create(file, file2).setCopyContentIfDir(true).setOverride(z7).copy();
    }

    public static File copyFile(String str, String str2, StandardCopyOption... standardCopyOptionArr) {
        Path path;
        Path path2;
        File file;
        cn.hutool.core.lang.q.notBlank(str, "Source File path is blank !", new Object[0]);
        cn.hutool.core.lang.q.notBlank(str2, "Destination File path is blank !", new Object[0]);
        path = Paths.get(str, new String[0]);
        path2 = Paths.get(str2, new String[0]);
        file = n0.copyFile(path, path2, standardCopyOptionArr).toFile();
        return file;
    }

    public static File copyFilesFromDir(File file, File file2, boolean z7) {
        return FileCopier.create(file, file2).setCopyContentIfDir(true).setOnlyCopyFile(true).setOverride(z7).copy();
    }

    public static RandomAccessFile createRandomAccessFile(Path path, FileMode fileMode) {
        File file;
        file = path.toFile();
        return createRandomAccessFile(file, fileMode);
    }

    public static File createTempFile(File file) {
        return createTempFile("hutool", null, file, true);
    }

    public static boolean del(String str) {
        return del(file(str));
    }

    public static boolean equals(File file, File file2) {
        Path path;
        Path path2;
        cn.hutool.core.lang.q.notNull(file);
        cn.hutool.core.lang.q.notNull(file2);
        if (!file.exists() || !file2.exists()) {
            return (file.exists() || file2.exists() || !pathEquals(file, file2)) ? false : true;
        }
        path = file.toPath();
        path2 = file2.toPath();
        return n0.equals(path, path2);
    }

    public static boolean exist(String str) {
        return str != null && file(str).exists();
    }

    public static String extName(File file) {
        return cn.hutool.core.io.file.c.extName(file);
    }

    public static File file(String str) {
        if (str == null) {
            return null;
        }
        return new File(getAbsolutePath(str));
    }

    public static String getAbsolutePath(String str, Class<?> cls) {
        String normalize;
        if (str == null) {
            normalize = "";
        } else {
            normalize = normalize(str);
            if (isAbsolutePath(normalize)) {
                return normalize;
            }
        }
        URL resource = cn.hutool.core.io.resource.f.getResource(normalize, cls);
        if (resource != null) {
            return normalize(g1.getDecodedPath(resource));
        }
        String classPath = cn.hutool.core.util.p.getClassPath();
        if (classPath == null) {
            return str;
        }
        Objects.requireNonNull(str);
        return normalize(classPath.concat(str));
    }

    public static a getBOMInputStream(File file) {
        Path path;
        InputStream newInputStream;
        try {
            path = file.toPath();
            newInputStream = Files.newInputStream(path, new OpenOption[0]);
            return new a(newInputStream);
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static BufferedReader getBOMReader(File file) {
        return n.getReader(getBOMInputStream(file));
    }

    public static String getCanonicalPath(File file) {
        if (file == null) {
            return null;
        }
        try {
            return file.getCanonicalPath();
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static BufferedInputStream getInputStream(File file) {
        return n.toBuffered(n.toStream(file));
    }

    public static String getLineSeparator() {
        return System.lineSeparator();
    }

    public static String getMimeType(String str) {
        Path path;
        if (cn.hutool.core.text.l.isBlank(str)) {
            return null;
        }
        if (cn.hutool.core.text.l.endWithIgnoreCase(str, ".css")) {
            return "text/css";
        }
        if (cn.hutool.core.text.l.endWithIgnoreCase(str, ".js")) {
            return "application/x-javascript";
        }
        if (cn.hutool.core.text.l.endWithIgnoreCase(str, ".rar")) {
            return "application/x-rar-compressed";
        }
        if (cn.hutool.core.text.l.endWithIgnoreCase(str, ".7z")) {
            return "application/x-7z-compressed";
        }
        if (cn.hutool.core.text.l.endWithIgnoreCase(str, ".wgt")) {
            return "application/widget";
        }
        if (cn.hutool.core.text.l.endWithIgnoreCase(str, ".webp")) {
            return MimeTypes.IMAGE_WEBP;
        }
        String contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(str);
        if (contentTypeFor != null) {
            return contentTypeFor;
        }
        path = Paths.get(str, new String[0]);
        return n0.getMimeType(path);
    }

    public static String getName(File file) {
        return cn.hutool.core.io.file.c.getName(file);
    }

    public static BufferedOutputStream getOutputStream(File file) {
        Path path;
        OutputStream newOutputStream;
        try {
            path = touch(file).toPath();
            newOutputStream = Files.newOutputStream(path, new OpenOption[0]);
            return n.toBuffered(newOutputStream);
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static String getParent(String str, int i8) {
        File parent = getParent(file(str), i8);
        if (parent == null) {
            return null;
        }
        try {
            return parent.getCanonicalPath();
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static String getPrefix(File file) {
        return cn.hutool.core.io.file.c.getPrefix(file);
    }

    public static PrintWriter getPrintWriter(String str, String str2, boolean z7) {
        return new PrintWriter(getWriter(str, str2, z7));
    }

    @Deprecated
    public static BufferedReader getReader(File file, String str) {
        return n.getReader(getInputStream(file), cn.hutool.core.util.l.charset(str));
    }

    public static String getSuffix(File file) {
        return cn.hutool.core.io.file.c.getSuffix(file);
    }

    public static File getTmpDir() {
        return file(getTmpDirPath());
    }

    public static String getTmpDirPath() {
        return System.getProperty("java.io.tmpdir");
    }

    public static int getTotalLines(File file) {
        if (!isFile(file)) {
            throw new IORuntimeException("Input must be a File");
        }
        try {
            LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(file));
            try {
                lineNumberReader.setLineNumber(1);
                lineNumberReader.skip(Long.MAX_VALUE);
                int lineNumber = lineNumberReader.getLineNumber();
                lineNumberReader.close();
                return lineNumber;
            } finally {
            }
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static String getType(File file) {
        return g.getType(file);
    }

    public static File getUserHomeDir() {
        return file(getUserHomePath());
    }

    public static String getUserHomePath() {
        return System.getProperty("user.home");
    }

    public static BufferedReader getUtf8Reader(File file) {
        return getReader(file, cn.hutool.core.util.l.CHARSET_UTF_8);
    }

    public static File getWebRoot() {
        String classPath = cn.hutool.core.util.p.getClassPath();
        if (cn.hutool.core.text.l.isNotBlank(classPath)) {
            return getParent(file(classPath), 2);
        }
        return null;
    }

    @Deprecated
    public static BufferedWriter getWriter(String str, String str2, boolean z7) {
        return getWriter(str, Charset.forName(str2), z7);
    }

    public static boolean isAbsolutePath(String str) {
        if (cn.hutool.core.text.l.isEmpty(str)) {
            return false;
        }
        return '/' == str.charAt(0) || p0.isMatch(PATTERN_PATH_ABSOLUTE, str);
    }

    public static boolean isDirEmpty(File file) {
        Path path;
        path = file.toPath();
        return n0.isDirEmpty(path);
    }

    public static boolean isDirectory(String str) {
        return str != null && file(str).isDirectory();
    }

    public static boolean isEmpty(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        return file.isDirectory() ? cn.hutool.core.util.h.isEmpty((Object[]) file.list()) : file.isFile() && file.length() <= 0;
    }

    public static boolean isFile(String str) {
        return str != null && file(str).isFile();
    }

    @Deprecated
    public static boolean isModifed(File file, long j8) {
        return isModified(file, j8);
    }

    public static boolean isModified(File file, long j8) {
        return (file != null && file.exists() && file.lastModified() == j8) ? false : true;
    }

    public static boolean isNotEmpty(File file) {
        return !isEmpty(file);
    }

    public static boolean isSub(File file, File file2) {
        Path path;
        Path path2;
        cn.hutool.core.lang.q.notNull(file);
        cn.hutool.core.lang.q.notNull(file2);
        path = file.toPath();
        path2 = file2.toPath();
        return n0.isSub(path, path2);
    }

    public static boolean isSymlink(File file) {
        Path path;
        path = file.toPath();
        return n0.isSymlink(path);
    }

    public static boolean isWindows() {
        return '\\' == File.separatorChar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$readLines$0(Predicate predicate, List list, String str) {
        boolean test;
        test = predicate.test(str);
        if (test) {
            list.add(str);
        }
    }

    public static int lastIndexOfSeparator(String str) {
        if (cn.hutool.core.text.l.isNotEmpty(str)) {
            int length = str.length();
            do {
                length--;
                if (length >= 0) {
                }
            } while (!cn.hutool.core.util.k.isFileSeparator(str.charAt(length)));
            return length;
        }
        return -1;
    }

    public static Date lastModifiedTime(File file) {
        if (exist(file)) {
            return new Date(file.lastModified());
        }
        return null;
    }

    public static List<String> listFileNames(String str) {
        JarFile jarFile;
        if (str == null) {
            return new ArrayList(0);
        }
        int lastIndexOf = str.lastIndexOf(JAR_PATH_EXT);
        if (lastIndexOf < 0) {
            ArrayList arrayList = new ArrayList();
            for (File file : ls(str)) {
                if (file.isFile()) {
                    arrayList.add(file.getName());
                }
            }
            return arrayList;
        }
        String absolutePath = getAbsolutePath(str);
        JarFile jarFile2 = null;
        try {
            try {
                jarFile = new JarFile(absolutePath.substring(0, lastIndexOf + 4));
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e8) {
            e = e8;
        }
        try {
            List<String> listFileNames = n1.listFileNames(jarFile, cn.hutool.core.text.l.removePrefix(absolutePath.substring(lastIndexOf + 5), "/"));
            n.close((Closeable) jarFile);
            return listFileNames;
        } catch (IOException e9) {
            e = e9;
            throw new IORuntimeException(cn.hutool.core.text.l.format("Can not read file path of [{}]", absolutePath), e);
        } catch (Throwable th2) {
            th = th2;
            jarFile2 = jarFile;
            n.close((Closeable) jarFile2);
            throw th;
        }
    }

    public static <T> T load(String str, String str2, FileReader.a aVar) {
        return (T) cn.hutool.core.io.file.FileReader.create(file(str), cn.hutool.core.util.l.charset(str2)).read(aVar);
    }

    public static <T> T loadUtf8(String str, FileReader.a aVar) {
        return (T) load(str, cn.hutool.core.util.l.CHARSET_UTF_8, aVar);
    }

    public static List<File> loopFiles(String str, FileFilter fileFilter) {
        return loopFiles(file(str), fileFilter);
    }

    public static File[] ls(String str) {
        if (str == null) {
            return null;
        }
        File file = file(str);
        if (file.isDirectory()) {
            return file.listFiles();
        }
        throw new IORuntimeException(cn.hutool.core.text.l.format("Path [{}] is not directory!", str));
    }

    public static String mainName(File file) {
        return cn.hutool.core.io.file.c.mainName(file);
    }

    public static File mkParentDirs(File file) {
        if (file == null) {
            return null;
        }
        return mkdir(getParent(file, 1));
    }

    public static File mkdir(String str) {
        if (str == null) {
            return null;
        }
        return mkdir(file(str));
    }

    public static boolean mkdirsSafely(File file, int i8, long j8) {
        if (file == null) {
            return false;
        }
        if (file.isDirectory()) {
            return true;
        }
        for (int i9 = 1; i9 <= i8; i9++) {
            file.mkdirs();
            if (file.exists()) {
                return true;
            }
            cn.hutool.core.thread.i.sleep(j8);
        }
        return file.exists();
    }

    public static void move(File file, File file2, boolean z7) {
        Path path;
        Path path2;
        cn.hutool.core.lang.q.notNull(file, "Src file must be not null!", new Object[0]);
        cn.hutool.core.lang.q.notNull(file2, "target file must be not null!", new Object[0]);
        path = file.toPath();
        path2 = file2.toPath();
        n0.move(path, path2, z7);
    }

    public static void moveContent(File file, File file2, boolean z7) {
        Path path;
        Path path2;
        cn.hutool.core.lang.q.notNull(file, "Src file must be not null!", new Object[0]);
        cn.hutool.core.lang.q.notNull(file2, "target file must be not null!", new Object[0]);
        path = file.toPath();
        path2 = file2.toPath();
        n0.moveContent(path, path2, z7);
    }

    public static File newFile(String str) {
        return new File(str);
    }

    public static boolean newerThan(File file, File file2) {
        if (file2 == null || !file2.exists()) {
            return true;
        }
        return newerThan(file, file2.lastModified());
    }

    public static String normalize(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("\\\\")) {
            return str;
        }
        String removePrefixIgnoreCase = cn.hutool.core.text.l.removePrefixIgnoreCase(cn.hutool.core.text.l.removePrefixIgnoreCase(str, g1.CLASSPATH_URL_PREFIX), "file:");
        if (cn.hutool.core.text.l.startWith((CharSequence) removePrefixIgnoreCase, '~')) {
            removePrefixIgnoreCase = getUserHomePath() + removePrefixIgnoreCase.substring(1);
        }
        String trimStart = cn.hutool.core.text.l.trimStart(removePrefixIgnoreCase.replaceAll("[/\\\\]+", "/"));
        int indexOf = trimStart.indexOf(":");
        String str2 = "";
        if (indexOf > -1) {
            int i8 = indexOf + 1;
            String substring = trimStart.substring(0, i8);
            if (cn.hutool.core.text.l.startWith(substring, cn.hutool.core.io.file.c.UNIX_SEPARATOR)) {
                substring = substring.substring(1);
            }
            if (!substring.contains("/")) {
                trimStart = trimStart.substring(i8);
                str2 = substring;
            }
        }
        if (trimStart.startsWith("/")) {
            str2 = str2 + "/";
            trimStart = trimStart.substring(1);
        }
        List<String> split = cn.hutool.core.text.l.split((CharSequence) trimStart, cn.hutool.core.io.file.c.UNIX_SEPARATOR);
        LinkedList linkedList = new LinkedList();
        int i9 = 0;
        for (int size = split.size() - 1; size >= 0; size--) {
            String str3 = split.get(size);
            if (!".".equals(str3)) {
                if ("..".equals(str3)) {
                    i9++;
                } else if (i9 > 0) {
                    i9--;
                } else {
                    linkedList.add(0, str3);
                }
            }
        }
        if (i9 > 0 && cn.hutool.core.text.l.isEmpty(str2)) {
            while (true) {
                int i10 = i9 - 1;
                if (i9 <= 0) {
                    break;
                }
                linkedList.add(0, "..");
                i9 = i10;
            }
        }
        return str2 + CollUtil.join(linkedList, "/");
    }

    public static boolean pathEndsWith(File file, String str) {
        return file.getPath().toLowerCase().endsWith(str);
    }

    public static boolean pathEquals(File file, File file2) {
        if (isWindows()) {
            try {
                return cn.hutool.core.text.l.equalsIgnoreCase(file.getCanonicalPath(), file2.getCanonicalPath());
            } catch (Exception unused) {
                return cn.hutool.core.text.l.equalsIgnoreCase(file.getAbsolutePath(), file2.getAbsolutePath());
            }
        }
        try {
            return cn.hutool.core.text.l.equals(file.getCanonicalPath(), file2.getCanonicalPath());
        } catch (Exception unused2) {
            return cn.hutool.core.text.l.equals(file.getAbsolutePath(), file2.getAbsolutePath());
        }
    }

    public static byte[] readBytes(File file) {
        return cn.hutool.core.io.file.FileReader.create(file).readBytes();
    }

    public static void readLine(RandomAccessFile randomAccessFile, Charset charset, p pVar) {
        String readLine = readLine(randomAccessFile, charset);
        if (readLine != null) {
            pVar.handle(readLine);
        }
    }

    public static <T extends Collection<String>> T readLines(String str, String str2, T t7) {
        return (T) readLines(file(str), str2, t7);
    }

    @Deprecated
    public static String readString(File file, String str) {
        return readString(file, cn.hutool.core.util.l.charset(str));
    }

    public static <T extends Collection<String>> T readUtf8Lines(String str, T t7) {
        return (T) readLines(str, cn.hutool.core.util.l.CHARSET_UTF_8, t7);
    }

    public static String readUtf8String(File file) {
        return readString(file, cn.hutool.core.util.l.CHARSET_UTF_8);
    }

    public static String readableFileSize(File file) {
        return readableFileSize(file.length());
    }

    public static File rename(File file, String str, boolean z7) {
        return rename(file, str, false, z7);
    }

    public static long size(File file) {
        return size(file, false);
    }

    public static String subPath(String str, File file) {
        try {
            return subPath(str, file.getCanonicalPath());
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static void tail(File file, p pVar) {
        tail(file, cn.hutool.core.util.l.CHARSET_UTF_8, pVar);
    }

    public static File touch(String str) {
        if (str == null) {
            return null;
        }
        return touch(file(str));
    }

    public static void walkFiles(File file, Consumer<File> consumer) {
        if (!file.isDirectory()) {
            consumer.accept(file);
            return;
        }
        File[] listFiles = file.listFiles();
        if (cn.hutool.core.util.h.isNotEmpty((Object[]) listFiles)) {
            for (File file2 : listFiles) {
                walkFiles(file2, consumer);
            }
        }
    }

    public static File writeBytes(byte[] bArr, String str) {
        return writeBytes(bArr, touch(str));
    }

    public static File writeFromStream(InputStream inputStream, File file) {
        return writeFromStream(inputStream, file, true);
    }

    public static <T> File writeLines(Collection<T> collection, String str, String str2) {
        return writeLines((Collection) collection, str, str2, false);
    }

    public static File writeMap(Map<?, ?> map, File file, Charset charset, String str, boolean z7) {
        return FileWriter.create(file, charset).writeMap(map, str, z7);
    }

    public static File writeString(String str, String str2, String str3) {
        return writeString(str, touch(str2), str3);
    }

    public static long writeToStream(File file, OutputStream outputStream) {
        return cn.hutool.core.io.file.FileReader.create(file).writeToStream(outputStream);
    }

    public static <T> File writeUtf8Lines(Collection<T> collection, String str) {
        return writeLines(collection, str, cn.hutool.core.util.l.CHARSET_UTF_8);
    }

    public static File writeUtf8Map(Map<?, ?> map, File file, String str, boolean z7) {
        return FileWriter.create(file, cn.hutool.core.util.l.CHARSET_UTF_8).writeMap(map, str, z7);
    }

    public static File writeUtf8String(String str, String str2) {
        return writeString(str, str2, cn.hutool.core.util.l.CHARSET_UTF_8);
    }

    public static <T> File appendLines(Collection<T> collection, File file, String str) {
        return writeLines((Collection) collection, file, str, true);
    }

    public static File appendString(String str, String str2, Charset charset) {
        return appendString(str, touch(str2), charset);
    }

    public static <T> File appendUtf8Lines(Collection<T> collection, String str) {
        return appendLines(collection, str, cn.hutool.core.util.l.CHARSET_UTF_8);
    }

    public static File appendUtf8String(String str, File file) {
        return appendString(str, file, cn.hutool.core.util.l.CHARSET_UTF_8);
    }

    public static boolean clean(File file) {
        File[] listFiles;
        if (file != null && file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (!del(file2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static File copy(File file, File file2, boolean z7) {
        return FileCopier.create(file, file2).setOverride(z7).copy();
    }

    public static RandomAccessFile createRandomAccessFile(File file, FileMode fileMode) {
        try {
            return new RandomAccessFile(file, fileMode.name());
        } catch (FileNotFoundException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static File createTempFile() {
        return createTempFile("hutool", null, null, true);
    }

    public static boolean del(File file) {
        Path path;
        if (file != null && file.exists()) {
            if (file.isDirectory() && !clean(file)) {
                return false;
            }
            path = file.toPath();
            try {
                n0.delFile(path);
            } catch (DirectoryNotEmptyException unused) {
                n0.del(path);
            } catch (IOException e8) {
                throw new IORuntimeException(e8);
            }
        }
        return true;
    }

    public static boolean exist(File file) {
        return file != null && file.exists();
    }

    public static String extName(String str) {
        return cn.hutool.core.io.file.c.extName(str);
    }

    public static File file(String str, String str2) {
        return file(new File(str), str2);
    }

    public static BufferedInputStream getInputStream(String str) {
        return getInputStream(file(str));
    }

    public static String getName(String str) {
        return cn.hutool.core.io.file.c.getName(str);
    }

    public static String getPrefix(String str) {
        return cn.hutool.core.io.file.c.getPrefix(str);
    }

    public static PrintWriter getPrintWriter(String str, Charset charset, boolean z7) {
        return new PrintWriter(getWriter(str, charset, z7));
    }

    public static BufferedReader getReader(File file, Charset charset) {
        return n.getReader(getInputStream(file), charset);
    }

    public static String getSuffix(String str) {
        return cn.hutool.core.io.file.c.getSuffix(str);
    }

    public static BufferedReader getUtf8Reader(String str) {
        return getReader(str, cn.hutool.core.util.l.CHARSET_UTF_8);
    }

    public static BufferedWriter getWriter(String str, Charset charset, boolean z7) {
        return getWriter(touch(str), charset, z7);
    }

    public static boolean isDirectory(File file) {
        return file != null && file.isDirectory();
    }

    public static boolean isFile(File file) {
        return file != null && file.isFile();
    }

    public static <T> T load(String str, Charset charset, FileReader.a aVar) {
        return (T) cn.hutool.core.io.file.FileReader.create(file(str), charset).read(aVar);
    }

    public static <T> T loadUtf8(File file, FileReader.a aVar) {
        return (T) load(file, cn.hutool.core.util.l.CHARSET_UTF_8, aVar);
    }

    public static List<File> loopFiles(File file, FileFilter fileFilter) {
        return loopFiles(file, -1, fileFilter);
    }

    public static String mainName(String str) {
        return cn.hutool.core.io.file.c.mainName(str);
    }

    public static File mkParentDirs(String str) {
        if (str == null) {
            return null;
        }
        return mkParentDirs(file(str));
    }

    public static byte[] readBytes(String str) {
        return readBytes(file(str));
    }

    public static <T extends Collection<String>> T readLines(String str, Charset charset, T t7) {
        return (T) readLines(file(str), charset, t7);
    }

    public static String readString(File file, Charset charset) {
        return cn.hutool.core.io.file.FileReader.create(file, charset).readString();
    }

    public static <T extends Collection<String>> T readUtf8Lines(File file, T t7) {
        return (T) readLines(file, cn.hutool.core.util.l.CHARSET_UTF_8, t7);
    }

    public static String readUtf8String(String str) {
        return readString(str, cn.hutool.core.util.l.CHARSET_UTF_8);
    }

    public static String readableFileSize(long j8) {
        return cn.hutool.core.io.unit.b.format(j8);
    }

    public static File rename(File file, String str, boolean z7, boolean z8) {
        Path path;
        File file2;
        if (z7) {
            String extName = extName(file);
            if (cn.hutool.core.text.l.isNotBlank(extName)) {
                str = str.concat(".").concat(extName);
            }
        }
        path = file.toPath();
        file2 = n0.rename(path, str, z8).toFile();
        return file2;
    }

    public static long size(File file, boolean z7) {
        if (file == null || !file.exists() || isSymlink(file)) {
            return 0L;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        long length = z7 ? file.length() : 0L;
        File[] listFiles = file.listFiles();
        if (cn.hutool.core.util.h.isEmpty((Object[]) listFiles)) {
            return 0L;
        }
        for (File file2 : listFiles) {
            length += size(file2, z7);
        }
        return length;
    }

    public static void tail(File file, Charset charset, p pVar) {
        new Tailer(file, charset, pVar).start();
    }

    public static File touch(File file) {
        if (file == null) {
            return null;
        }
        if (!file.exists()) {
            mkParentDirs(file);
            try {
                file.createNewFile();
            } catch (Exception e8) {
                throw new IORuntimeException(e8);
            }
        }
        return file;
    }

    public static File writeBytes(byte[] bArr, File file) {
        return writeBytes(bArr, file, 0, bArr.length, false);
    }

    public static File writeFromStream(InputStream inputStream, File file, boolean z7) {
        return FileWriter.create(file).writeFromStream(inputStream, z7);
    }

    public static <T> File writeLines(Collection<T> collection, String str, Charset charset) {
        return writeLines((Collection) collection, str, charset, false);
    }

    public static File writeString(String str, String str2, Charset charset) {
        return writeString(str, touch(str2), charset);
    }

    public static long writeToStream(String str, OutputStream outputStream) {
        return writeToStream(touch(str), outputStream);
    }

    public static <T> File writeUtf8Lines(Collection<T> collection, File file) {
        return writeLines(collection, file, cn.hutool.core.util.l.CHARSET_UTF_8);
    }

    public static File writeUtf8String(String str, File file) {
        return writeString(str, file, cn.hutool.core.util.l.CHARSET_UTF_8);
    }

    public static <T> File appendLines(Collection<T> collection, String str, Charset charset) {
        return writeLines((Collection) collection, str, charset, true);
    }

    public static File appendString(String str, File file, String str2) {
        return FileWriter.create(file, cn.hutool.core.util.l.charset(str2)).append(str);
    }

    public static File createTempFile(String str, boolean z7) {
        return createTempFile("hutool", str, null, z7);
    }

    public static boolean exist(String str, String str2) {
        String[] list;
        File file = new File(str);
        if (!file.exists() || (list = file.list()) == null) {
            return false;
        }
        for (String str3 : list) {
            if (str3.matches(str2)) {
                return true;
            }
        }
        return false;
    }

    public static File file(File file, String str) {
        if (!cn.hutool.core.text.l.isBlank(str)) {
            return checkSlip(file, buildFile(file, str));
        }
        throw new NullPointerException("File path is blank!");
    }

    public static PrintWriter getPrintWriter(File file, String str, boolean z7) {
        return new PrintWriter(getWriter(file, str, z7));
    }

    @Deprecated
    public static BufferedReader getReader(String str, String str2) {
        return getReader(str, cn.hutool.core.util.l.charset(str2));
    }

    @Deprecated
    public static BufferedWriter getWriter(File file, String str, boolean z7) {
        return getWriter(file, Charset.forName(str), z7);
    }

    public static Date lastModifiedTime(String str) {
        return lastModifiedTime(new File(str));
    }

    public static <T> T load(File file, Charset charset, FileReader.a aVar) {
        return (T) cn.hutool.core.io.file.FileReader.create(file, charset).read(aVar);
    }

    public static List<File> loopFiles(File file, int i8, FileFilter fileFilter) {
        Path path;
        path = file.toPath();
        return n0.loopFiles(path, i8, fileFilter);
    }

    public static File mkdir(File file) {
        if (file == null) {
            return null;
        }
        if (!file.exists()) {
            mkdirsSafely(file, 5, 1L);
        }
        return file;
    }

    public static boolean newerThan(File file, long j8) {
        return file != null && file.exists() && file.lastModified() > j8;
    }

    public static String readLine(RandomAccessFile randomAccessFile, Charset charset) {
        try {
            String readLine = randomAccessFile.readLine();
            if (readLine != null) {
                return cn.hutool.core.util.l.convert(readLine, cn.hutool.core.util.l.CHARSET_ISO_8859_1, charset);
            }
            return null;
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static <T extends Collection<String>> T readLines(File file, String str, T t7) {
        return (T) cn.hutool.core.io.file.FileReader.create(file, cn.hutool.core.util.l.charset(str)).readLines((cn.hutool.core.io.file.FileReader) t7);
    }

    @Deprecated
    public static String readString(String str, String str2) {
        return readString(str, cn.hutool.core.util.l.charset(str2));
    }

    public static <T extends Collection<String>> T readUtf8Lines(URL url, T t7) {
        return (T) readLines(url, cn.hutool.core.util.l.CHARSET_UTF_8, t7);
    }

    public static String subPath(String str, String str2) {
        if (!cn.hutool.core.text.l.isNotEmpty(str) || !cn.hutool.core.text.l.isNotEmpty(str2)) {
            return str2;
        }
        return cn.hutool.core.text.l.removePrefix(cn.hutool.core.text.l.removePrefixIgnoreCase(normalize(str2), cn.hutool.core.text.l.removeSuffix(normalize(str), "/")), "/");
    }

    public static void tail(File file, Charset charset) {
        tail(file, charset, Tailer.CONSOLE_HANDLER);
    }

    public static File writeBytes(byte[] bArr, File file, int i8, int i9, boolean z7) {
        return FileWriter.create(file).write(bArr, i8, i9, z7);
    }

    public static File writeFromStream(InputStream inputStream, String str) {
        return writeFromStream(inputStream, touch(str));
    }

    public static <T> File writeLines(Collection<T> collection, File file, String str) {
        return writeLines((Collection) collection, file, str, false);
    }

    public static File writeString(String str, File file, String str2) {
        return FileWriter.create(file, cn.hutool.core.util.l.charset(str2)).write(str);
    }

    public static <T> File appendLines(Collection<T> collection, File file, Charset charset) {
        return writeLines((Collection) collection, file, charset, true);
    }

    public static File appendString(String str, File file, Charset charset) {
        return FileWriter.create(file, charset).append(str);
    }

    public static File copyFile(File file, File file2, StandardCopyOption... standardCopyOptionArr) {
        Path path;
        Path path2;
        File file3;
        cn.hutool.core.lang.q.notNull(file, "Source File is null !", new Object[0]);
        if (file.exists()) {
            cn.hutool.core.lang.q.notNull(file2, "Destination File or directiory is null !", new Object[0]);
            if (!equals(file, file2)) {
                path = file.toPath();
                path2 = file2.toPath();
                file3 = n0.copyFile(path, path2, standardCopyOptionArr).toFile();
                return file3;
            }
            throw new IORuntimeException("Files '{}' and '{}' are equal", file, file2);
        }
        throw new IORuntimeException("File not exist: " + file);
    }

    public static File createTempFile(String str, String str2, boolean z7) {
        return createTempFile(str, str2, null, z7);
    }

    public static BufferedOutputStream getOutputStream(String str) {
        return getOutputStream(touch(str));
    }

    public static File getParent(File file, int i8) {
        if (i8 < 1 || file == null) {
            return file;
        }
        try {
            File parentFile = file.getCanonicalFile().getParentFile();
            return 1 == i8 ? parentFile : getParent(parentFile, i8 - 1);
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static PrintWriter getPrintWriter(File file, Charset charset, boolean z7) {
        return new PrintWriter(getWriter(file, charset, z7));
    }

    public static BufferedReader getReader(String str, Charset charset) {
        return getReader(file(str), charset);
    }

    public static BufferedWriter getWriter(File file, Charset charset, boolean z7) {
        return FileWriter.create(file, charset).getWriter(z7);
    }

    public static List<File> loopFiles(String str) {
        return loopFiles(file(str));
    }

    public static <T extends Collection<String>> T readLines(File file, Charset charset, T t7) {
        return (T) cn.hutool.core.io.file.FileReader.create(file, charset).readLines((cn.hutool.core.io.file.FileReader) t7);
    }

    public static String readString(String str, Charset charset) {
        return readString(file(str), charset);
    }

    public static List<String> readUtf8Lines(URL url) {
        return readLines(url, cn.hutool.core.util.l.CHARSET_UTF_8);
    }

    public static <T> File writeLines(Collection<T> collection, File file, Charset charset) {
        return writeLines((Collection) collection, file, charset, false);
    }

    public static File writeString(String str, File file, Charset charset) {
        return FileWriter.create(file, charset).write(str);
    }

    public static File createTempFile(File file, boolean z7) {
        return createTempFile("hutool", null, file, z7);
    }

    public static List<File> loopFiles(File file) {
        return loopFiles(file, (FileFilter) null);
    }

    @Deprecated
    public static <T extends Collection<String>> T readLines(URL url, String str, T t7) {
        return (T) readLines(url, cn.hutool.core.util.l.charset(str), t7);
    }

    @Deprecated
    public static String readString(URL url, String str) {
        return readString(url, cn.hutool.core.util.l.charset(str));
    }

    public static List<String> readUtf8Lines(String str) {
        return readLines(str, cn.hutool.core.util.l.CHARSET_UTF_8);
    }

    public static <T> File writeLines(Collection<T> collection, String str, String str2, boolean z7) {
        return writeLines(collection, file(str), str2, z7);
    }

    public static File createTempFile(String str, String str2, File file, boolean z7) {
        Path path;
        File file2;
        int i8 = 0;
        do {
            if (file == null) {
                path = null;
            } else {
                try {
                    path = file.toPath();
                } catch (IOException e8) {
                    i8++;
                }
            }
            file2 = n0.createTempFile(str, str2, path).toFile();
            File canonicalFile = file2.getCanonicalFile();
            if (z7) {
                canonicalFile.delete();
                canonicalFile.createNewFile();
            }
            return canonicalFile;
        } while (i8 < 50);
        throw new IORuntimeException(e8);
    }

    public static File file(File file, String... strArr) {
        cn.hutool.core.lang.q.notNull(file, "directory must not be null", new Object[0]);
        if (cn.hutool.core.util.h.isEmpty((Object[]) strArr)) {
            return file;
        }
        for (String str : strArr) {
            if (str != null) {
                file = file(file, str);
            }
        }
        return file;
    }

    public static <T extends Collection<String>> T readLines(URL url, Charset charset, T t7) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = url.openStream();
                return (T) n.readLines(inputStream, charset, t7);
            } catch (IOException e8) {
                throw new IORuntimeException(e8);
            }
        } finally {
            n.close((Closeable) inputStream);
        }
    }

    public static String readString(URL url, Charset charset) {
        if (url != null) {
            InputStream inputStream = null;
            try {
                try {
                    inputStream = url.openStream();
                    return n.read(inputStream, charset);
                } catch (IOException e8) {
                    throw new IORuntimeException(e8);
                }
            } finally {
                n.close((Closeable) inputStream);
            }
        }
        throw new NullPointerException("Empty url provided!");
    }

    public static List<String> readUtf8Lines(File file) {
        return readLines(file, cn.hutool.core.util.l.CHARSET_UTF_8);
    }

    public static File touch(File file, String str) {
        return touch(file(file, str));
    }

    public static <T> File writeLines(Collection<T> collection, String str, Charset charset, boolean z7) {
        return writeLines(collection, file(str), charset, z7);
    }

    public static String getAbsolutePath(String str) {
        return getAbsolutePath(str, null);
    }

    public static List<String> readUtf8Lines(File file, Predicate<String> predicate) {
        return readLines(file, cn.hutool.core.util.l.CHARSET_UTF_8, predicate);
    }

    public static File touch(String str, String str2) {
        return touch(file(str, str2));
    }

    public static <T> File writeLines(Collection<T> collection, File file, String str, boolean z7) {
        return FileWriter.create(file, cn.hutool.core.util.l.charset(str)).writeLines(collection, z7);
    }

    public static String getAbsolutePath(File file) {
        if (file == null) {
            return null;
        }
        try {
            return file.getCanonicalPath();
        } catch (IOException unused) {
            return file.getAbsolutePath();
        }
    }

    public static void readUtf8Lines(File file, p pVar) {
        readLines(file, cn.hutool.core.util.l.CHARSET_UTF_8, pVar);
    }

    public static <T> File writeLines(Collection<T> collection, File file, Charset charset, boolean z7) {
        return FileWriter.create(file, charset).writeLines(collection, z7);
    }

    public static File file(String... strArr) {
        File file = null;
        if (cn.hutool.core.util.h.isEmpty((Object[]) strArr)) {
            return null;
        }
        for (String str : strArr) {
            if (file == null) {
                file = file(str);
            } else {
                file = file(file, str);
            }
        }
        return file;
    }

    @Deprecated
    public static List<String> readLines(URL url, String str) {
        return readLines(url, cn.hutool.core.util.l.charset(str));
    }

    public static List<String> readLines(URL url, Charset charset) {
        return (List) readLines(url, charset, new ArrayList());
    }

    public static File file(URI uri) {
        if (uri != null) {
            return new File(uri);
        }
        throw new NullPointerException("File uri is null!");
    }

    public static List<String> readLines(String str, String str2) {
        return (List) readLines(str, str2, new ArrayList());
    }

    public static List<String> readLines(String str, Charset charset) {
        return (List) readLines(str, charset, new ArrayList());
    }

    public static File file(URL url) {
        return new File(g1.toURI(url));
    }

    public static List<String> readLines(File file, String str) {
        return (List) readLines(file, str, new ArrayList());
    }

    public static List<String> readLines(File file, Charset charset) {
        return (List) readLines(file, charset, new ArrayList());
    }

    public static List<String> readLines(File file, Charset charset, final Predicate<String> predicate) {
        final ArrayList arrayList = new ArrayList();
        readLines(file, charset, new p() { // from class: cn.hutool.core.io.k
            @Override // cn.hutool.core.io.p
            public final void handle(String str) {
                l.lambda$readLines$0(predicate, arrayList, str);
            }
        });
        return arrayList;
    }

    public static void readLines(File file, Charset charset, p pVar) {
        cn.hutool.core.io.file.FileReader.create(file, charset).readLines(pVar);
    }

    public static void readLines(RandomAccessFile randomAccessFile, Charset charset, p pVar) {
        while (true) {
            try {
                String readLine = randomAccessFile.readLine();
                if (readLine == null) {
                    return;
                } else {
                    pVar.handle(cn.hutool.core.util.l.convert(readLine, cn.hutool.core.util.l.CHARSET_ISO_8859_1, charset));
                }
            } catch (IOException e8) {
                throw new IORuntimeException(e8);
            }
        }
    }
}
