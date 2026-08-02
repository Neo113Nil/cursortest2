package okio.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.sequences.SequenceScope;
import okio.FileSystem;
import okio.Path;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.SegmentedByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public abstract class _ZlibJvmKt {
    public static final char[] HEX_DIGIT_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];

    public static final int access$decodeHexDigit(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        Path$$ExternalSyntheticBUOutline0.m$2(c, "Unexpected hex digit: ");
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf A[Catch: all -> 0x0108, TRY_LEAVE, TryCatch #2 {all -> 0x0108, blocks: (B:21:0x00c9, B:23:0x00cf, B:63:0x00bd), top: B:62:0x00bd }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0100 -> B:20:0x004f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object collectRecursively(SequenceScope sequenceScope, FileSystem fileSystem, ArrayDeque arrayDeque, Path path, boolean z, BaseContinuationImpl baseContinuationImpl) {
        FileSystem$collectRecursively$1 fileSystem$collectRecursively$1;
        int i;
        FileSystem fileSystem2;
        boolean z2;
        ArrayDeque arrayDeque2;
        List listOrNull;
        Path commonResolve;
        Path path2;
        Iterator it;
        boolean z3;
        FileSystem$collectRecursively$1 fileSystem$collectRecursively$12;
        FileSystem fileSystem3;
        ArrayDeque arrayDeque3;
        SequenceScope sequenceScope2;
        ArrayDeque arrayDeque4;
        FileSystem fileSystem4;
        FileSystem$collectRecursively$1 fileSystem$collectRecursively$13;
        boolean z4;
        SequenceScope sequenceScope3 = sequenceScope;
        Path path3 = path;
        if (baseContinuationImpl instanceof FileSystem$collectRecursively$1) {
            fileSystem$collectRecursively$1 = (FileSystem$collectRecursively$1) baseContinuationImpl;
            int i2 = fileSystem$collectRecursively$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                fileSystem$collectRecursively$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = fileSystem$collectRecursively$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fileSystem$collectRecursively$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!z) {
                        fileSystem$collectRecursively$1.L$0 = sequenceScope3;
                        fileSystem$collectRecursively$1.L$1 = fileSystem;
                        fileSystem$collectRecursively$1.L$2 = arrayDeque;
                        fileSystem$collectRecursively$1.L$3 = path3;
                        fileSystem$collectRecursively$1.Z$1 = z;
                        fileSystem$collectRecursively$1.label = 1;
                        sequenceScope3.yield(path3, fileSystem$collectRecursively$1);
                        return coroutineSingletons;
                    }
                    fileSystem2 = fileSystem;
                    z2 = z;
                    arrayDeque2 = arrayDeque;
                } else if (i == 1) {
                    boolean z5 = fileSystem$collectRecursively$1.Z$1;
                    path3 = fileSystem$collectRecursively$1.L$3;
                    arrayDeque2 = fileSystem$collectRecursively$1.L$2;
                    FileSystem fileSystem5 = fileSystem$collectRecursively$1.L$1;
                    SequenceScope sequenceScope4 = fileSystem$collectRecursively$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    fileSystem2 = fileSystem5;
                    z2 = z5;
                    sequenceScope3 = sequenceScope4;
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z6 = fileSystem$collectRecursively$1.Z$1;
                    it = fileSystem$collectRecursively$1.L$4;
                    Path path4 = fileSystem$collectRecursively$1.L$3;
                    arrayDeque3 = fileSystem$collectRecursively$1.L$2;
                    FileSystem fileSystem6 = fileSystem$collectRecursively$1.L$1;
                    SequenceScope sequenceScope5 = fileSystem$collectRecursively$1.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj);
                        path2 = path4;
                        arrayDeque2 = arrayDeque3;
                        fileSystem$collectRecursively$12 = fileSystem$collectRecursively$1;
                        fileSystem3 = fileSystem6;
                        z3 = z6;
                        sequenceScope3 = sequenceScope5;
                        if (it.hasNext()) {
                            try {
                                Path path5 = (Path) it.next();
                                fileSystem$collectRecursively$12.L$0 = sequenceScope3;
                                fileSystem$collectRecursively$12.L$1 = fileSystem3;
                                fileSystem$collectRecursively$12.L$2 = arrayDeque2;
                                fileSystem$collectRecursively$12.L$3 = path2;
                                fileSystem$collectRecursively$12.L$4 = it;
                                fileSystem$collectRecursively$12.Z$1 = z3;
                                fileSystem$collectRecursively$12.label = 2;
                                Object collectRecursively = collectRecursively(sequenceScope2, fileSystem4, arrayDeque4, path5, z4, fileSystem$collectRecursively$13);
                                sequenceScope5 = sequenceScope2;
                                fileSystem6 = fileSystem4;
                                arrayDeque2 = arrayDeque4;
                                fileSystem$collectRecursively$1 = fileSystem$collectRecursively$13;
                                if (collectRecursively == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                z6 = z4;
                                fileSystem$collectRecursively$12 = fileSystem$collectRecursively$1;
                                fileSystem3 = fileSystem6;
                                z3 = z6;
                                sequenceScope3 = sequenceScope5;
                                if (it.hasNext()) {
                                    fileSystem$collectRecursively$1 = fileSystem$collectRecursively$12;
                                    z2 = z3;
                                    arrayDeque2.removeLast();
                                    path3 = path2;
                                    if (!z2) {
                                        return Unit.INSTANCE;
                                    }
                                    fileSystem$collectRecursively$1.L$0 = null;
                                    fileSystem$collectRecursively$1.L$1 = null;
                                    fileSystem$collectRecursively$1.L$2 = null;
                                    fileSystem$collectRecursively$1.L$3 = null;
                                    fileSystem$collectRecursively$1.L$4 = null;
                                    fileSystem$collectRecursively$1.label = 3;
                                    sequenceScope3.yield(path3, fileSystem$collectRecursively$1);
                                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    return coroutineSingletons;
                                }
                            } catch (Throwable th) {
                                th = th;
                                arrayDeque2 = arrayDeque4;
                                arrayDeque3 = arrayDeque2;
                                arrayDeque3.removeLast();
                                throw th;
                            }
                            sequenceScope2 = sequenceScope3;
                            arrayDeque4 = arrayDeque2;
                            fileSystem4 = fileSystem3;
                            fileSystem$collectRecursively$13 = fileSystem$collectRecursively$12;
                            z4 = z3;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        arrayDeque3.removeLast();
                        throw th;
                    }
                }
                listOrNull = fileSystem2.listOrNull(path3);
                if (listOrNull == null) {
                    listOrNull = EmptyList.INSTANCE;
                }
                if (!listOrNull.isEmpty()) {
                    Path path6 = path3;
                    int i3 = 0;
                    while (true) {
                        Path path7 = (Path) fileSystem2.metadata(path6).symlinkTarget;
                        if (path7 == null) {
                            commonResolve = null;
                        } else {
                            Path parent = path6.parent();
                            parent.getClass();
                            commonResolve = Path.commonResolve(parent, path7, false);
                        }
                        if (commonResolve == null) {
                            break;
                        }
                        i3++;
                        path6 = commonResolve;
                    }
                    if (i3 == 0) {
                        arrayDeque2.addLast(path6);
                        try {
                            FileSystem fileSystem7 = fileSystem2;
                            path2 = path3;
                            it = listOrNull.iterator();
                            z3 = z2;
                            fileSystem$collectRecursively$12 = fileSystem$collectRecursively$1;
                            fileSystem3 = fileSystem7;
                            if (it.hasNext()) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            arrayDeque3 = arrayDeque2;
                            arrayDeque3.removeLast();
                            throw th;
                        }
                    }
                }
                if (!z2) {
                }
            }
        }
        fileSystem$collectRecursively$1 = new FileSystem$collectRecursively$1(baseContinuationImpl);
        Object obj2 = fileSystem$collectRecursively$1.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fileSystem$collectRecursively$1.label;
        if (i != 0) {
        }
        listOrNull = fileSystem2.listOrNull(path3);
        if (listOrNull == null) {
        }
        if (!listOrNull.isEmpty()) {
        }
        if (!z2) {
        }
    }

    public static final int segment(SegmentedByteString segmentedByteString, int i) {
        int i2;
        int[] iArr = segmentedByteString.directory;
        int i3 = i + 1;
        int length = segmentedByteString.segments.length;
        iArr.getClass();
        int i4 = length - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = iArr[i2];
                if (i6 >= i3) {
                    if (i6 <= i3) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = (-i5) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }
}
