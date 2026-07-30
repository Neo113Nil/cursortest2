package kotlin.io;

import f6.p;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.t;
import y5.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class FilesKt__UtilsKt extends i {
    public static final boolean copyRecursively(File file, File target, boolean z7, final p onError) {
        s.checkNotNullParameter(file, "<this>");
        s.checkNotNullParameter(target, "target");
        s.checkNotNullParameter(onError, "onError");
        if (!file.exists()) {
            return onError.invoke(file, new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null)) != OnErrorAction.TERMINATE;
        }
        try {
            Iterator<File> it = i.walkTopDown(file).onFail(new p() { // from class: kotlin.io.FilesKt__UtilsKt$copyRecursively$2
                {
                    super(2);
                }

                @Override // f6.p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((File) obj, (IOException) obj2);
                    return w.INSTANCE;
                }

                public final void invoke(File f8, IOException e8) {
                    s.checkNotNullParameter(f8, "f");
                    s.checkNotNullParameter(e8, "e");
                    if (p.this.invoke(f8, e8) == OnErrorAction.TERMINATE) {
                        throw new TerminateException(f8);
                    }
                }
            }).iterator();
            while (it.hasNext()) {
                File next = it.next();
                if (next.exists()) {
                    File file2 = new File(target, toRelativeString(next, file));
                    if (file2.exists() && (!next.isDirectory() || !file2.isDirectory())) {
                        if (z7) {
                            if (file2.isDirectory()) {
                                if (!deleteRecursively(file2)) {
                                }
                            } else if (!file2.delete()) {
                            }
                        }
                        if (onError.invoke(file2, new FileAlreadyExistsException(next, file2, "The destination file already exists.")) == OnErrorAction.TERMINATE) {
                            return false;
                        }
                    }
                    if (next.isDirectory()) {
                        file2.mkdirs();
                    } else if (copyTo$default(next, file2, z7, 0, 4, null).length() != next.length() && onError.invoke(next, new IOException("Source file wasn't copied completely, length of destination file differs.")) == OnErrorAction.TERMINATE) {
                        return false;
                    }
                } else if (onError.invoke(next, new NoSuchFileException(next, null, "The source file doesn't exist.", 2, null)) == OnErrorAction.TERMINATE) {
                    return false;
                }
            }
            return true;
        } catch (TerminateException unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean copyRecursively$default(File file, File file2, boolean z7, p pVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        if ((i8 & 4) != 0) {
            pVar = new p() { // from class: kotlin.io.FilesKt__UtilsKt$copyRecursively$1
                @Override // f6.p
                public final Void invoke(File file3, IOException exception) {
                    s.checkNotNullParameter(file3, "<anonymous parameter 0>");
                    s.checkNotNullParameter(exception, "exception");
                    throw exception;
                }
            };
        }
        return copyRecursively(file, file2, z7, pVar);
    }

    public static final File copyTo(File file, File target, boolean z7, int i8) {
        s.checkNotNullParameter(file, "<this>");
        s.checkNotNullParameter(target, "target");
        if (!file.exists()) {
            throw new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists()) {
            if (!z7) {
                throw new FileAlreadyExistsException(file, target, "The destination file already exists.");
            }
            if (!target.delete()) {
                throw new FileAlreadyExistsException(file, target, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (!file.isDirectory()) {
            File parentFile = target.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(target);
                try {
                    a.copyTo(fileInputStream, fileOutputStream, i8);
                    b.closeFinally(fileOutputStream, null);
                    b.closeFinally(fileInputStream, null);
                } finally {
                }
            } finally {
            }
        } else if (!target.mkdirs()) {
            throw new FileSystemException(file, target, "Failed to create target directory.");
        }
        return target;
    }

    public static /* synthetic */ File copyTo$default(File file, File file2, boolean z7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z7 = false;
        }
        if ((i9 & 4) != 0) {
            i8 = 8192;
        }
        return copyTo(file, file2, z7, i8);
    }

    public static final File createTempDir(String prefix, String str, File file) {
        s.checkNotNullParameter(prefix, "prefix");
        File dir = File.createTempFile(prefix, str, file);
        dir.delete();
        if (dir.mkdir()) {
            s.checkNotNullExpressionValue(dir, "dir");
            return dir;
        }
        throw new IOException("Unable to create temporary directory " + dir + '.');
    }

    public static /* synthetic */ File createTempDir$default(String str, String str2, File file, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = "tmp";
        }
        if ((i8 & 2) != 0) {
            str2 = null;
        }
        if ((i8 & 4) != 0) {
            file = null;
        }
        return createTempDir(str, str2, file);
    }

    public static final File createTempFile(String prefix, String str, File file) {
        s.checkNotNullParameter(prefix, "prefix");
        File createTempFile = File.createTempFile(prefix, str, file);
        s.checkNotNullExpressionValue(createTempFile, "createTempFile(prefix, suffix, directory)");
        return createTempFile;
    }

    public static /* synthetic */ File createTempFile$default(String str, String str2, File file, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = "tmp";
        }
        if ((i8 & 2) != 0) {
            str2 = null;
        }
        if ((i8 & 4) != 0) {
            file = null;
        }
        return createTempFile(str, str2, file);
    }

    public static final boolean deleteRecursively(File file) {
        s.checkNotNullParameter(file, "<this>");
        while (true) {
            boolean z7 = true;
            for (File file2 : i.walkBottomUp(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (z7) {
                        break;
                    }
                }
                z7 = false;
            }
            return z7;
        }
    }

    public static final boolean endsWith(File file, File other) {
        s.checkNotNullParameter(file, "<this>");
        s.checkNotNullParameter(other, "other");
        e components = h.toComponents(file);
        e components2 = h.toComponents(other);
        if (components2.isRooted()) {
            return s.areEqual(file, other);
        }
        int size = components.getSize() - components2.getSize();
        if (size < 0) {
            return false;
        }
        return components.getSegments().subList(size, components.getSize()).equals(components2.getSegments());
    }

    public static String getExtension(File file) {
        s.checkNotNullParameter(file, "<this>");
        String name = file.getName();
        s.checkNotNullExpressionValue(name, "name");
        return StringsKt__StringsKt.substringAfterLast(name, '.', "");
    }

    public static final String getInvariantSeparatorsPath(File file) {
        String replace$default;
        s.checkNotNullParameter(file, "<this>");
        char c8 = File.separatorChar;
        String path = file.getPath();
        s.checkNotNullExpressionValue(path, "path");
        if (c8 == '/') {
            return path;
        }
        replace$default = t.replace$default(path, c8, cn.hutool.core.io.file.c.UNIX_SEPARATOR, false, 4, (Object) null);
        return replace$default;
    }

    public static String getNameWithoutExtension(File file) {
        String substringBeforeLast$default;
        s.checkNotNullParameter(file, "<this>");
        String name = file.getName();
        s.checkNotNullExpressionValue(name, "name");
        substringBeforeLast$default = StringsKt__StringsKt.substringBeforeLast$default(name, ".", (String) null, 2, (Object) null);
        return substringBeforeLast$default;
    }

    public static final File normalize(File file) {
        String joinToString$default;
        s.checkNotNullParameter(file, "<this>");
        e components = h.toComponents(file);
        File root = components.getRoot();
        List<File> normalize$FilesKt__UtilsKt = normalize$FilesKt__UtilsKt(components.getSegments());
        String separator = File.separator;
        s.checkNotNullExpressionValue(separator, "separator");
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(normalize$FilesKt__UtilsKt, separator, null, null, 0, null, null, 62, null);
        return resolve(root, joinToString$default);
    }

    private static final e normalize$FilesKt__UtilsKt(e eVar) {
        return new e(eVar.getRoot(), normalize$FilesKt__UtilsKt(eVar.getSegments()));
    }

    public static final File relativeTo(File file, File base) {
        s.checkNotNullParameter(file, "<this>");
        s.checkNotNullParameter(base, "base");
        return new File(toRelativeString(file, base));
    }

    public static final File relativeToOrNull(File file, File base) {
        s.checkNotNullParameter(file, "<this>");
        s.checkNotNullParameter(base, "base");
        String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt(file, base);
        if (relativeStringOrNull$FilesKt__UtilsKt != null) {
            return new File(relativeStringOrNull$FilesKt__UtilsKt);
        }
        return null;
    }

    public static final File relativeToOrSelf(File file, File base) {
        s.checkNotNullParameter(file, "<this>");
        s.checkNotNullParameter(base, "base");
        String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt(file, base);
        return relativeStringOrNull$FilesKt__UtilsKt != null ? new File(relativeStringOrNull$FilesKt__UtilsKt) : file;
    }

    public static final File resolve(File file, File relative) {
        boolean endsWith$default;
        s.checkNotNullParameter(file, "<this>");
        s.checkNotNullParameter(relative, "relative");
        if (h.isRooted(relative)) {
            return relative;
        }
        String file2 = file.toString();
        s.checkNotNullExpressionValue(file2, "this.toString()");
        if (file2.length() != 0) {
            char c8 = File.separatorChar;
            endsWith$default = StringsKt__StringsKt.endsWith$default((CharSequence) file2, c8, false, 2, (Object) null);
            if (!endsWith$default) {
                return new File(file2 + c8 + relative);
            }
        }
        return new File(file2 + relative);
    }

    public static final File resolveSibling(File file, File relative) {
        s.checkNotNullParameter(file, "<this>");
        s.checkNotNullParameter(relative, "relative");
        e components = h.toComponents(file);
        return resolve(resolve(components.getRoot(), components.getSize() == 0 ? new File("..") : components.subPath(0, components.getSize() - 1)), relative);
    }

    public static final boolean startsWith(File file, File other) {
        s.checkNotNullParameter(file, "<this>");
        s.checkNotNullParameter(other, "other");
        e components = h.toComponents(file);
        e components2 = h.toComponents(other);
        if (s.areEqual(components.getRoot(), components2.getRoot()) && components.getSize() >= components2.getSize()) {
            return components.getSegments().subList(0, components2.getSize()).equals(components2.getSegments());
        }
        return false;
    }

    public static final String toRelativeString(File file, File base) {
        s.checkNotNullParameter(file, "<this>");
        s.checkNotNullParameter(base, "base");
        String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt(file, base);
        if (relativeStringOrNull$FilesKt__UtilsKt != null) {
            return relativeStringOrNull$FilesKt__UtilsKt;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + base + '.');
    }

    private static final String toRelativeStringOrNull$FilesKt__UtilsKt(File file, File file2) {
        List drop;
        e normalize$FilesKt__UtilsKt = normalize$FilesKt__UtilsKt(h.toComponents(file));
        e normalize$FilesKt__UtilsKt2 = normalize$FilesKt__UtilsKt(h.toComponents(file2));
        if (!s.areEqual(normalize$FilesKt__UtilsKt.getRoot(), normalize$FilesKt__UtilsKt2.getRoot())) {
            return null;
        }
        int size = normalize$FilesKt__UtilsKt2.getSize();
        int size2 = normalize$FilesKt__UtilsKt.getSize();
        int min = Math.min(size2, size);
        int i8 = 0;
        while (i8 < min && s.areEqual(normalize$FilesKt__UtilsKt.getSegments().get(i8), normalize$FilesKt__UtilsKt2.getSegments().get(i8))) {
            i8++;
        }
        StringBuilder sb = new StringBuilder();
        int i9 = size - 1;
        if (i8 <= i9) {
            while (!s.areEqual(normalize$FilesKt__UtilsKt2.getSegments().get(i9).getName(), "..")) {
                sb.append("..");
                if (i9 != i8) {
                    sb.append(File.separatorChar);
                }
                if (i9 != i8) {
                    i9--;
                }
            }
            return null;
        }
        if (i8 < size2) {
            if (i8 < size) {
                sb.append(File.separatorChar);
            }
            drop = CollectionsKt___CollectionsKt.drop(normalize$FilesKt__UtilsKt.getSegments(), i8);
            String separator = File.separator;
            s.checkNotNullExpressionValue(separator, "separator");
            kotlin.collections.p.joinTo$default(drop, sb, separator, null, null, 0, null, null, 124, null);
        }
        return sb.toString();
    }

    private static final List<File> normalize$FilesKt__UtilsKt(List<? extends File> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (File file : list) {
            String name = file.getName();
            if (!s.areEqual(name, ".")) {
                if (!s.areEqual(name, "..")) {
                    arrayList.add(file);
                } else if (arrayList.isEmpty() || s.areEqual(((File) CollectionsKt___CollectionsKt.last((List) arrayList)).getName(), "..")) {
                    arrayList.add(file);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        return arrayList;
    }

    public static final File resolve(File file, String relative) {
        s.checkNotNullParameter(file, "<this>");
        s.checkNotNullParameter(relative, "relative");
        return resolve(file, new File(relative));
    }

    public static final File resolveSibling(File file, String relative) {
        s.checkNotNullParameter(file, "<this>");
        s.checkNotNullParameter(relative, "relative");
        return resolveSibling(file, new File(relative));
    }

    public static final boolean startsWith(File file, String other) {
        s.checkNotNullParameter(file, "<this>");
        s.checkNotNullParameter(other, "other");
        return startsWith(file, new File(other));
    }

    public static final boolean endsWith(File file, String other) {
        s.checkNotNullParameter(file, "<this>");
        s.checkNotNullParameter(other, "other");
        return endsWith(file, new File(other));
    }
}
