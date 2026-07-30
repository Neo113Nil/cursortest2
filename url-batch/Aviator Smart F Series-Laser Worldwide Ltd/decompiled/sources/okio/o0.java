package okio;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes5.dex */
public final class o0 implements Comparable {
    public static final a Companion = new a(null);
    public static final String DIRECTORY_SEPARATOR;
    private final ByteString bytes;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        public static /* synthetic */ o0 get$default(a aVar, String str, boolean z7, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                z7 = false;
            }
            return aVar.get(str, z7);
        }

        public final o0 get(File file) {
            kotlin.jvm.internal.s.checkNotNullParameter(file, "<this>");
            return get$default(this, file, false, 1, (Object) null);
        }

        public static /* synthetic */ o0 get$default(a aVar, File file, boolean z7, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                z7 = false;
            }
            return aVar.get(file, z7);
        }

        public final o0 get(String str) {
            kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
            return get$default(this, str, false, 1, (Object) null);
        }

        public static /* synthetic */ o0 get$default(a aVar, Path path, boolean z7, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                z7 = false;
            }
            return aVar.get(path, z7);
        }

        @IgnoreJRERequirement
        public final o0 get(Path path) {
            kotlin.jvm.internal.s.checkNotNullParameter(path, "<this>");
            return get$default(this, path, false, 1, (Object) null);
        }

        public final o0 get(String str, boolean z7) {
            kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
            return okio.internal.f.commonToPath(str, z7);
        }

        public final o0 get(File file, boolean z7) {
            kotlin.jvm.internal.s.checkNotNullParameter(file, "<this>");
            String file2 = file.toString();
            kotlin.jvm.internal.s.checkNotNullExpressionValue(file2, "toString()");
            return get(file2, z7);
        }

        @IgnoreJRERequirement
        public final o0 get(Path path, boolean z7) {
            kotlin.jvm.internal.s.checkNotNullParameter(path, "<this>");
            return get(path.toString(), z7);
        }
    }

    static {
        String separator = File.separator;
        kotlin.jvm.internal.s.checkNotNullExpressionValue(separator, "separator");
        DIRECTORY_SEPARATOR = separator;
    }

    public o0(ByteString bytes) {
        kotlin.jvm.internal.s.checkNotNullParameter(bytes, "bytes");
        this.bytes = bytes;
    }

    public static final o0 get(File file) {
        return Companion.get(file);
    }

    public static /* synthetic */ o0 resolve$default(o0 o0Var, String str, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        return o0Var.resolve(str, z7);
    }

    public boolean equals(Object obj) {
        return (obj instanceof o0) && kotlin.jvm.internal.s.areEqual(((o0) obj).getBytes$okio(), getBytes$okio());
    }

    public final ByteString getBytes$okio() {
        return this.bytes;
    }

    public final o0 getRoot() {
        int rootLength = okio.internal.f.rootLength(this);
        if (rootLength == -1) {
            return null;
        }
        return new o0(getBytes$okio().substring(0, rootLength));
    }

    public final List<String> getSegments() {
        ArrayList arrayList = new ArrayList();
        int rootLength = okio.internal.f.rootLength(this);
        if (rootLength == -1) {
            rootLength = 0;
        } else if (rootLength < getBytes$okio().size() && getBytes$okio().getByte(rootLength) == ((byte) 92)) {
            rootLength++;
        }
        int size = getBytes$okio().size();
        if (rootLength < size) {
            int i8 = rootLength;
            while (true) {
                int i9 = rootLength + 1;
                if (getBytes$okio().getByte(rootLength) == ((byte) 47) || getBytes$okio().getByte(rootLength) == ((byte) 92)) {
                    arrayList.add(getBytes$okio().substring(i8, rootLength));
                    i8 = i9;
                }
                if (i9 >= size) {
                    break;
                }
                rootLength = i9;
            }
            rootLength = i8;
        }
        if (rootLength < getBytes$okio().size()) {
            arrayList.add(getBytes$okio().substring(rootLength, getBytes$okio().size()));
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.r.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ByteString) it.next()).utf8());
        }
        return arrayList2;
    }

    public final List<ByteString> getSegmentsBytes() {
        ArrayList arrayList = new ArrayList();
        int rootLength = okio.internal.f.rootLength(this);
        if (rootLength == -1) {
            rootLength = 0;
        } else if (rootLength < getBytes$okio().size() && getBytes$okio().getByte(rootLength) == ((byte) 92)) {
            rootLength++;
        }
        int size = getBytes$okio().size();
        if (rootLength < size) {
            int i8 = rootLength;
            while (true) {
                int i9 = rootLength + 1;
                if (getBytes$okio().getByte(rootLength) == ((byte) 47) || getBytes$okio().getByte(rootLength) == ((byte) 92)) {
                    arrayList.add(getBytes$okio().substring(i8, rootLength));
                    i8 = i9;
                }
                if (i9 >= size) {
                    break;
                }
                rootLength = i9;
            }
            rootLength = i8;
        }
        if (rootLength < getBytes$okio().size()) {
            arrayList.add(getBytes$okio().substring(rootLength, getBytes$okio().size()));
        }
        return arrayList;
    }

    public int hashCode() {
        return getBytes$okio().hashCode();
    }

    public final boolean isAbsolute() {
        return okio.internal.f.rootLength(this) != -1;
    }

    public final boolean isRelative() {
        return okio.internal.f.rootLength(this) == -1;
    }

    public final boolean isRoot() {
        return okio.internal.f.rootLength(this) == getBytes$okio().size();
    }

    public final String name() {
        return nameBytes().utf8();
    }

    public final ByteString nameBytes() {
        int indexOfLastSlash = okio.internal.f.getIndexOfLastSlash(this);
        return indexOfLastSlash != -1 ? ByteString.substring$default(getBytes$okio(), indexOfLastSlash + 1, 0, 2, null) : (volumeLetter() == null || getBytes$okio().size() != 2) ? getBytes$okio() : ByteString.EMPTY;
    }

    public final o0 normalized() {
        return Companion.get(toString(), true);
    }

    public final o0 parent() {
        o0 o0Var;
        if (kotlin.jvm.internal.s.areEqual(getBytes$okio(), okio.internal.f.DOT) || kotlin.jvm.internal.s.areEqual(getBytes$okio(), okio.internal.f.SLASH) || kotlin.jvm.internal.s.areEqual(getBytes$okio(), okio.internal.f.BACKSLASH) || okio.internal.f.lastSegmentIsDotDot(this)) {
            return null;
        }
        int indexOfLastSlash = okio.internal.f.getIndexOfLastSlash(this);
        if (indexOfLastSlash != 2 || volumeLetter() == null) {
            if (indexOfLastSlash == 1 && getBytes$okio().startsWith(okio.internal.f.BACKSLASH)) {
                return null;
            }
            if (indexOfLastSlash != -1 || volumeLetter() == null) {
                if (indexOfLastSlash == -1) {
                    return new o0(okio.internal.f.DOT);
                }
                if (indexOfLastSlash != 0) {
                    return new o0(ByteString.substring$default(getBytes$okio(), 0, indexOfLastSlash, 1, null));
                }
                o0Var = new o0(ByteString.substring$default(getBytes$okio(), 0, 1, 1, null));
            } else {
                if (getBytes$okio().size() == 2) {
                    return null;
                }
                o0Var = new o0(ByteString.substring$default(getBytes$okio(), 0, 2, 1, null));
            }
        } else {
            if (getBytes$okio().size() == 3) {
                return null;
            }
            o0Var = new o0(ByteString.substring$default(getBytes$okio(), 0, 3, 1, null));
        }
        return o0Var;
    }

    public final o0 relativeTo(o0 other) {
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        if (!kotlin.jvm.internal.s.areEqual(getRoot(), other.getRoot())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        List<ByteString> segmentsBytes = getSegmentsBytes();
        List<ByteString> segmentsBytes2 = other.getSegmentsBytes();
        int min = Math.min(segmentsBytes.size(), segmentsBytes2.size());
        int i8 = 0;
        while (i8 < min && kotlin.jvm.internal.s.areEqual(segmentsBytes.get(i8), segmentsBytes2.get(i8))) {
            i8++;
        }
        if (i8 == min && getBytes$okio().size() == other.getBytes$okio().size()) {
            return a.get$default(Companion, ".", false, 1, (Object) null);
        }
        if (!(segmentsBytes2.subList(i8, segmentsBytes2.size()).indexOf(okio.internal.f.DOT_DOT) == -1)) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        c cVar = new c();
        ByteString slash = okio.internal.f.getSlash(other);
        if (slash == null && (slash = okio.internal.f.getSlash(this)) == null) {
            slash = okio.internal.f.toSlash(DIRECTORY_SEPARATOR);
        }
        int size = segmentsBytes2.size();
        if (i8 < size) {
            int i9 = i8;
            do {
                i9++;
                cVar.write(okio.internal.f.DOT_DOT);
                cVar.write(slash);
            } while (i9 < size);
        }
        int size2 = segmentsBytes.size();
        if (i8 < size2) {
            while (true) {
                int i10 = i8 + 1;
                cVar.write(segmentsBytes.get(i8));
                cVar.write(slash);
                if (i10 >= size2) {
                    break;
                }
                i8 = i10;
            }
        }
        return okio.internal.f.toPath(cVar, false);
    }

    public final o0 resolve(o0 child) {
        kotlin.jvm.internal.s.checkNotNullParameter(child, "child");
        return okio.internal.f.commonResolve(this, child, false);
    }

    public final File toFile() {
        return new File(toString());
    }

    @IgnoreJRERequirement
    public final Path toNioPath() {
        Path path;
        path = Paths.get(toString(), new String[0]);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(path, "get(toString())");
        return path;
    }

    public String toString() {
        return getBytes$okio().utf8();
    }

    public final Character volumeLetter() {
        if (ByteString.indexOf$default(getBytes$okio(), okio.internal.f.SLASH, 0, 2, (Object) null) != -1 || getBytes$okio().size() < 2 || getBytes$okio().getByte(1) != ((byte) 58)) {
            return null;
        }
        char c8 = (char) getBytes$okio().getByte(0);
        if (('a' > c8 || c8 > 'z') && ('A' > c8 || c8 > 'Z')) {
            return null;
        }
        return Character.valueOf(c8);
    }

    public static final o0 get(File file, boolean z7) {
        return Companion.get(file, z7);
    }

    public static /* synthetic */ o0 resolve$default(o0 o0Var, ByteString byteString, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        return o0Var.resolve(byteString, z7);
    }

    @Override // java.lang.Comparable
    public int compareTo(o0 other) {
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        return getBytes$okio().compareTo(other.getBytes$okio());
    }

    public final o0 resolve(o0 child, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(child, "child");
        return okio.internal.f.commonResolve(this, child, z7);
    }

    public static final o0 get(String str) {
        return Companion.get(str);
    }

    public static /* synthetic */ o0 resolve$default(o0 o0Var, o0 o0Var2, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        return o0Var.resolve(o0Var2, z7);
    }

    public final o0 resolve(String child) {
        kotlin.jvm.internal.s.checkNotNullParameter(child, "child");
        return okio.internal.f.commonResolve(this, okio.internal.f.toPath(new c().writeUtf8(child), false), false);
    }

    public static final o0 get(String str, boolean z7) {
        return Companion.get(str, z7);
    }

    @IgnoreJRERequirement
    public static final o0 get(Path path) {
        return Companion.get(path);
    }

    public final o0 resolve(ByteString child) {
        kotlin.jvm.internal.s.checkNotNullParameter(child, "child");
        return okio.internal.f.commonResolve(this, okio.internal.f.toPath(new c().write(child), false), false);
    }

    @IgnoreJRERequirement
    public static final o0 get(Path path, boolean z7) {
        return Companion.get(path, z7);
    }

    public final o0 resolve(String child, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(child, "child");
        return okio.internal.f.commonResolve(this, okio.internal.f.toPath(new c().writeUtf8(child), false), z7);
    }

    public final o0 resolve(ByteString child, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(child, "child");
        return okio.internal.f.commonResolve(this, okio.internal.f.toPath(new c().write(child), false), z7);
    }
}
