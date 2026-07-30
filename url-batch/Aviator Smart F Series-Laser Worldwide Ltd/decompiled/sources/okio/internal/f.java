package okio.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.collections.v;
import kotlin.jvm.internal.s;
import okio.ByteString;
import okio.o0;

/* loaded from: classes5.dex */
public abstract class f {
    private static final ByteString ANY_SLASH;
    private static final ByteString BACKSLASH;
    private static final ByteString DOT;
    private static final ByteString DOT_DOT;
    private static final ByteString SLASH;

    static {
        ByteString.a aVar = ByteString.Companion;
        SLASH = aVar.encodeUtf8("/");
        BACKSLASH = aVar.encodeUtf8("\\");
        ANY_SLASH = aVar.encodeUtf8("/\\");
        DOT = aVar.encodeUtf8(".");
        DOT_DOT = aVar.encodeUtf8("..");
    }

    public static final int commonCompareTo(o0 o0Var, o0 other) {
        s.checkNotNullParameter(o0Var, "<this>");
        s.checkNotNullParameter(other, "other");
        return o0Var.getBytes$okio().compareTo(other.getBytes$okio());
    }

    public static final boolean commonEquals(o0 o0Var, Object obj) {
        s.checkNotNullParameter(o0Var, "<this>");
        return (obj instanceof o0) && s.areEqual(((o0) obj).getBytes$okio(), o0Var.getBytes$okio());
    }

    public static final int commonHashCode(o0 o0Var) {
        s.checkNotNullParameter(o0Var, "<this>");
        return o0Var.getBytes$okio().hashCode();
    }

    public static final boolean commonIsAbsolute(o0 o0Var) {
        s.checkNotNullParameter(o0Var, "<this>");
        return rootLength(o0Var) != -1;
    }

    public static final boolean commonIsRelative(o0 o0Var) {
        s.checkNotNullParameter(o0Var, "<this>");
        return rootLength(o0Var) == -1;
    }

    public static final boolean commonIsRoot(o0 o0Var) {
        s.checkNotNullParameter(o0Var, "<this>");
        return rootLength(o0Var) == o0Var.getBytes$okio().size();
    }

    public static final String commonName(o0 o0Var) {
        s.checkNotNullParameter(o0Var, "<this>");
        return o0Var.nameBytes().utf8();
    }

    public static final ByteString commonNameBytes(o0 o0Var) {
        s.checkNotNullParameter(o0Var, "<this>");
        int indexOfLastSlash = getIndexOfLastSlash(o0Var);
        return indexOfLastSlash != -1 ? ByteString.substring$default(o0Var.getBytes$okio(), indexOfLastSlash + 1, 0, 2, null) : (o0Var.volumeLetter() == null || o0Var.getBytes$okio().size() != 2) ? o0Var.getBytes$okio() : ByteString.EMPTY;
    }

    public static final o0 commonNormalized(o0 o0Var) {
        s.checkNotNullParameter(o0Var, "<this>");
        return o0.Companion.get(o0Var.toString(), true);
    }

    public static final o0 commonParent(o0 o0Var) {
        s.checkNotNullParameter(o0Var, "<this>");
        if (s.areEqual(o0Var.getBytes$okio(), DOT) || s.areEqual(o0Var.getBytes$okio(), SLASH) || s.areEqual(o0Var.getBytes$okio(), BACKSLASH) || lastSegmentIsDotDot(o0Var)) {
            return null;
        }
        int indexOfLastSlash = getIndexOfLastSlash(o0Var);
        if (indexOfLastSlash == 2 && o0Var.volumeLetter() != null) {
            if (o0Var.getBytes$okio().size() == 3) {
                return null;
            }
            return new o0(ByteString.substring$default(o0Var.getBytes$okio(), 0, 3, 1, null));
        }
        if (indexOfLastSlash == 1 && o0Var.getBytes$okio().startsWith(BACKSLASH)) {
            return null;
        }
        if (indexOfLastSlash != -1 || o0Var.volumeLetter() == null) {
            return indexOfLastSlash == -1 ? new o0(DOT) : indexOfLastSlash == 0 ? new o0(ByteString.substring$default(o0Var.getBytes$okio(), 0, 1, 1, null)) : new o0(ByteString.substring$default(o0Var.getBytes$okio(), 0, indexOfLastSlash, 1, null));
        }
        if (o0Var.getBytes$okio().size() == 2) {
            return null;
        }
        return new o0(ByteString.substring$default(o0Var.getBytes$okio(), 0, 2, 1, null));
    }

    public static final o0 commonRelativeTo(o0 o0Var, o0 other) {
        s.checkNotNullParameter(o0Var, "<this>");
        s.checkNotNullParameter(other, "other");
        if (!s.areEqual(o0Var.getRoot(), other.getRoot())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + o0Var + " and " + other).toString());
        }
        List<ByteString> segmentsBytes = o0Var.getSegmentsBytes();
        List<ByteString> segmentsBytes2 = other.getSegmentsBytes();
        int min = Math.min(segmentsBytes.size(), segmentsBytes2.size());
        int i8 = 0;
        while (i8 < min && s.areEqual(segmentsBytes.get(i8), segmentsBytes2.get(i8))) {
            i8++;
        }
        if (i8 == min && o0Var.getBytes$okio().size() == other.getBytes$okio().size()) {
            return o0.a.get$default(o0.Companion, ".", false, 1, (Object) null);
        }
        if (!(segmentsBytes2.subList(i8, segmentsBytes2.size()).indexOf(DOT_DOT) == -1)) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + o0Var + " and " + other).toString());
        }
        okio.c cVar = new okio.c();
        ByteString slash = getSlash(other);
        if (slash == null && (slash = getSlash(o0Var)) == null) {
            slash = toSlash(o0.DIRECTORY_SEPARATOR);
        }
        int size = segmentsBytes2.size();
        if (i8 < size) {
            int i9 = i8;
            do {
                i9++;
                cVar.write(DOT_DOT);
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
        return toPath(cVar, false);
    }

    public static final o0 commonResolve(o0 o0Var, String child, boolean z7) {
        s.checkNotNullParameter(o0Var, "<this>");
        s.checkNotNullParameter(child, "child");
        return commonResolve(o0Var, toPath(new okio.c().writeUtf8(child), false), z7);
    }

    public static final o0 commonRoot(o0 o0Var) {
        s.checkNotNullParameter(o0Var, "<this>");
        int rootLength = rootLength(o0Var);
        if (rootLength == -1) {
            return null;
        }
        return new o0(o0Var.getBytes$okio().substring(0, rootLength));
    }

    public static final List<String> commonSegments(o0 o0Var) {
        s.checkNotNullParameter(o0Var, "<this>");
        ArrayList arrayList = new ArrayList();
        int rootLength = rootLength(o0Var);
        if (rootLength == -1) {
            rootLength = 0;
        } else if (rootLength < o0Var.getBytes$okio().size() && o0Var.getBytes$okio().getByte(rootLength) == ((byte) 92)) {
            rootLength++;
        }
        int size = o0Var.getBytes$okio().size();
        if (rootLength < size) {
            int i8 = rootLength;
            while (true) {
                int i9 = rootLength + 1;
                if (o0Var.getBytes$okio().getByte(rootLength) == ((byte) 47) || o0Var.getBytes$okio().getByte(rootLength) == ((byte) 92)) {
                    arrayList.add(o0Var.getBytes$okio().substring(i8, rootLength));
                    i8 = i9;
                }
                if (i9 >= size) {
                    break;
                }
                rootLength = i9;
            }
            rootLength = i8;
        }
        if (rootLength < o0Var.getBytes$okio().size()) {
            arrayList.add(o0Var.getBytes$okio().substring(rootLength, o0Var.getBytes$okio().size()));
        }
        ArrayList arrayList2 = new ArrayList(r.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ByteString) it.next()).utf8());
        }
        return arrayList2;
    }

    public static final List<ByteString> commonSegmentsBytes(o0 o0Var) {
        s.checkNotNullParameter(o0Var, "<this>");
        ArrayList arrayList = new ArrayList();
        int rootLength = rootLength(o0Var);
        if (rootLength == -1) {
            rootLength = 0;
        } else if (rootLength < o0Var.getBytes$okio().size() && o0Var.getBytes$okio().getByte(rootLength) == ((byte) 92)) {
            rootLength++;
        }
        int size = o0Var.getBytes$okio().size();
        if (rootLength < size) {
            int i8 = rootLength;
            while (true) {
                int i9 = rootLength + 1;
                if (o0Var.getBytes$okio().getByte(rootLength) == ((byte) 47) || o0Var.getBytes$okio().getByte(rootLength) == ((byte) 92)) {
                    arrayList.add(o0Var.getBytes$okio().substring(i8, rootLength));
                    i8 = i9;
                }
                if (i9 >= size) {
                    break;
                }
                rootLength = i9;
            }
            rootLength = i8;
        }
        if (rootLength < o0Var.getBytes$okio().size()) {
            arrayList.add(o0Var.getBytes$okio().substring(rootLength, o0Var.getBytes$okio().size()));
        }
        return arrayList;
    }

    public static final o0 commonToPath(String str, boolean z7) {
        s.checkNotNullParameter(str, "<this>");
        return toPath(new okio.c().writeUtf8(str), z7);
    }

    public static final String commonToString(o0 o0Var) {
        s.checkNotNullParameter(o0Var, "<this>");
        return o0Var.getBytes$okio().utf8();
    }

    public static final Character commonVolumeLetter(o0 o0Var) {
        s.checkNotNullParameter(o0Var, "<this>");
        if (ByteString.indexOf$default(o0Var.getBytes$okio(), SLASH, 0, 2, (Object) null) != -1 || o0Var.getBytes$okio().size() < 2 || o0Var.getBytes$okio().getByte(1) != ((byte) 58)) {
            return null;
        }
        char c8 = (char) o0Var.getBytes$okio().getByte(0);
        if (('a' > c8 || c8 > 'z') && ('A' > c8 || c8 > 'Z')) {
            return null;
        }
        return Character.valueOf(c8);
    }

    private static /* synthetic */ void getANY_SLASH$annotations() {
    }

    private static /* synthetic */ void getBACKSLASH$annotations() {
    }

    private static /* synthetic */ void getDOT$annotations() {
    }

    private static /* synthetic */ void getDOT_DOT$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getIndexOfLastSlash(o0 o0Var) {
        int lastIndexOf$default = ByteString.lastIndexOf$default(o0Var.getBytes$okio(), SLASH, 0, 2, (Object) null);
        return lastIndexOf$default != -1 ? lastIndexOf$default : ByteString.lastIndexOf$default(o0Var.getBytes$okio(), BACKSLASH, 0, 2, (Object) null);
    }

    private static /* synthetic */ void getSLASH$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteString getSlash(o0 o0Var) {
        ByteString bytes$okio = o0Var.getBytes$okio();
        ByteString byteString = SLASH;
        if (ByteString.indexOf$default(bytes$okio, byteString, 0, 2, (Object) null) != -1) {
            return byteString;
        }
        ByteString bytes$okio2 = o0Var.getBytes$okio();
        ByteString byteString2 = BACKSLASH;
        if (ByteString.indexOf$default(bytes$okio2, byteString2, 0, 2, (Object) null) != -1) {
            return byteString2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lastSegmentIsDotDot(o0 o0Var) {
        return o0Var.getBytes$okio().endsWith(DOT_DOT) && (o0Var.getBytes$okio().size() == 2 || o0Var.getBytes$okio().rangeEquals(o0Var.getBytes$okio().size() + (-3), SLASH, 0, 1) || o0Var.getBytes$okio().rangeEquals(o0Var.getBytes$okio().size() + (-3), BACKSLASH, 0, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int rootLength(o0 o0Var) {
        if (o0Var.getBytes$okio().size() == 0) {
            return -1;
        }
        if (o0Var.getBytes$okio().getByte(0) == ((byte) 47)) {
            return 1;
        }
        byte b8 = (byte) 92;
        if (o0Var.getBytes$okio().getByte(0) == b8) {
            if (o0Var.getBytes$okio().size() <= 2 || o0Var.getBytes$okio().getByte(1) != b8) {
                return 1;
            }
            int indexOf = o0Var.getBytes$okio().indexOf(BACKSLASH, 2);
            return indexOf == -1 ? o0Var.getBytes$okio().size() : indexOf;
        }
        if (o0Var.getBytes$okio().size() > 2 && o0Var.getBytes$okio().getByte(1) == ((byte) 58) && o0Var.getBytes$okio().getByte(2) == b8) {
            char c8 = (char) o0Var.getBytes$okio().getByte(0);
            if ('a' <= c8 && c8 <= 'z') {
                return 3;
            }
            if ('A' <= c8 && c8 <= 'Z') {
                return 3;
            }
        }
        return -1;
    }

    private static final boolean startsWithVolumeLetterAndColon(okio.c cVar, ByteString byteString) {
        if (!s.areEqual(byteString, BACKSLASH) || cVar.size() < 2 || cVar.getByte(1L) != ((byte) 58)) {
            return false;
        }
        char c8 = (char) cVar.getByte(0L);
        return ('a' <= c8 && c8 <= 'z') || ('A' <= c8 && c8 <= 'Z');
    }

    public static final o0 toPath(okio.c cVar, boolean z7) {
        ByteString byteString;
        ByteString readByteString;
        s.checkNotNullParameter(cVar, "<this>");
        okio.c cVar2 = new okio.c();
        ByteString byteString2 = null;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (!cVar.rangeEquals(0L, SLASH)) {
                byteString = BACKSLASH;
                if (!cVar.rangeEquals(0L, byteString)) {
                    break;
                }
            }
            byte readByte = cVar.readByte();
            if (byteString2 == null) {
                byteString2 = toSlash(readByte);
            }
            i9++;
        }
        boolean z8 = i9 >= 2 && s.areEqual(byteString2, byteString);
        if (z8) {
            s.checkNotNull(byteString2);
            cVar2.write(byteString2);
            cVar2.write(byteString2);
        } else if (i9 > 0) {
            s.checkNotNull(byteString2);
            cVar2.write(byteString2);
        } else {
            long indexOfElement = cVar.indexOfElement(ANY_SLASH);
            if (byteString2 == null) {
                byteString2 = indexOfElement == -1 ? toSlash(o0.DIRECTORY_SEPARATOR) : toSlash(cVar.getByte(indexOfElement));
            }
            if (startsWithVolumeLetterAndColon(cVar, byteString2)) {
                if (indexOfElement == 2) {
                    cVar2.write(cVar, 3L);
                } else {
                    cVar2.write(cVar, 2L);
                }
            }
        }
        boolean z9 = cVar2.size() > 0;
        ArrayList arrayList = new ArrayList();
        while (!cVar.exhausted()) {
            long indexOfElement2 = cVar.indexOfElement(ANY_SLASH);
            if (indexOfElement2 == -1) {
                readByteString = cVar.readByteString();
            } else {
                readByteString = cVar.readByteString(indexOfElement2);
                cVar.readByte();
            }
            ByteString byteString3 = DOT_DOT;
            if (s.areEqual(readByteString, byteString3)) {
                if (!z9 || !arrayList.isEmpty()) {
                    if (!z7 || (!z9 && (arrayList.isEmpty() || s.areEqual(CollectionsKt___CollectionsKt.last((List) arrayList), byteString3)))) {
                        arrayList.add(readByteString);
                    } else if (!z8 || arrayList.size() != 1) {
                        v.removeLastOrNull(arrayList);
                    }
                }
            } else if (!s.areEqual(readByteString, DOT) && !s.areEqual(readByteString, ByteString.EMPTY)) {
                arrayList.add(readByteString);
            }
        }
        int size = arrayList.size();
        if (size > 0) {
            while (true) {
                int i10 = i8 + 1;
                if (i8 > 0) {
                    cVar2.write(byteString2);
                }
                cVar2.write((ByteString) arrayList.get(i8));
                if (i10 >= size) {
                    break;
                }
                i8 = i10;
            }
        }
        if (cVar2.size() == 0) {
            cVar2.write(DOT);
        }
        return new o0(cVar2.readByteString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteString toSlash(String str) {
        if (s.areEqual(str, "/")) {
            return SLASH;
        }
        if (s.areEqual(str, "\\")) {
            return BACKSLASH;
        }
        throw new IllegalArgumentException(s.stringPlus("not a directory separator: ", str));
    }

    public static final o0 commonResolve(o0 o0Var, ByteString child, boolean z7) {
        s.checkNotNullParameter(o0Var, "<this>");
        s.checkNotNullParameter(child, "child");
        return commonResolve(o0Var, toPath(new okio.c().write(child), false), z7);
    }

    private static final ByteString toSlash(byte b8) {
        if (b8 == 47) {
            return SLASH;
        }
        if (b8 == 92) {
            return BACKSLASH;
        }
        throw new IllegalArgumentException(s.stringPlus("not a directory separator: ", Byte.valueOf(b8)));
    }

    public static final o0 commonResolve(o0 o0Var, okio.c child, boolean z7) {
        s.checkNotNullParameter(o0Var, "<this>");
        s.checkNotNullParameter(child, "child");
        return commonResolve(o0Var, toPath(child, false), z7);
    }

    public static final o0 commonResolve(o0 o0Var, o0 child, boolean z7) {
        s.checkNotNullParameter(o0Var, "<this>");
        s.checkNotNullParameter(child, "child");
        if (child.isAbsolute() || child.volumeLetter() != null) {
            return child;
        }
        ByteString slash = getSlash(o0Var);
        if (slash == null && (slash = getSlash(child)) == null) {
            slash = toSlash(o0.DIRECTORY_SEPARATOR);
        }
        okio.c cVar = new okio.c();
        cVar.write(o0Var.getBytes$okio());
        if (cVar.size() > 0) {
            cVar.write(slash);
        }
        cVar.write(child.getBytes$okio());
        return toPath(cVar, z7);
    }
}
