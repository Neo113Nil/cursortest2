package okio;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.collections.CollectionsKt;
import okio.Path;
import okio.internal.FixedLengthSource;
import okio.internal.ZipEntry;
import okio.internal.ZipFilesKt;

/* loaded from: classes9.dex */
public final class ZipFileSystem extends FileSystem {
    public static final Path ROOT;
    public final LinkedHashMap entries;
    public final FileSystem fileSystem;
    public final Path zipPath;

    static {
        String str = Path.DIRECTORY_SEPARATOR;
        ROOT = Path.Companion.get("/", false);
    }

    public ZipFileSystem(Path path, FileSystem fileSystem, LinkedHashMap linkedHashMap) {
        fileSystem.getClass();
        this.zipPath = path;
        this.fileSystem = fileSystem;
        this.entries = linkedHashMap;
    }

    @Override // okio.FileSystem
    public final Sink appendingSink(Path path) {
        path.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public final void atomicMove(Path path, Path path2) {
        path.getClass();
        path2.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public final void createDirectory(Path path) {
        path.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public final void delete(Path path, boolean z) {
        path.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public final List list(Path path) {
        path.getClass();
        List list$1 = list$1(path, true);
        list$1.getClass();
        return list$1;
    }

    public final List list$1(Path path, boolean z) {
        Path path2 = ROOT;
        path2.getClass();
        path.getClass();
        ZipEntry zipEntry = (ZipEntry) this.entries.get(okio.internal.Path.commonResolve(path2, path, true));
        if (zipEntry != null) {
            return CollectionsKt.toList(zipEntry.children);
        }
        if (!z) {
            return null;
        }
        a$$ExternalSyntheticBUOutline0.m$3(path, "not a directory: ");
        return null;
    }

    @Override // okio.FileSystem
    public final List listOrNull(Path path) {
        path.getClass();
        return list$1(path, false);
    }

    @Override // okio.FileSystem
    public final FileMetadata metadataOrNull(Path path) {
        boolean z;
        Long l;
        Long l2;
        Long l3;
        Long valueOf;
        Throwable th;
        Throwable th2;
        path.getClass();
        Path path2 = ROOT;
        path2.getClass();
        ZipEntry zipEntry = (ZipEntry) this.entries.get(okio.internal.Path.commonResolve(path2, path, true));
        if (zipEntry == null) {
            return null;
        }
        long j = zipEntry.offset;
        if (j != -1) {
            FileHandle openReadOnly = this.fileSystem.openReadOnly(this.zipPath);
            try {
                RealBufferedSource realBufferedSource = new RealBufferedSource(openReadOnly.source(j));
                try {
                    zipEntry = ZipFilesKt.readOrSkipLocalHeader(realBufferedSource, zipEntry);
                    zipEntry.getClass();
                    try {
                        realBufferedSource.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        realBufferedSource.close();
                    } catch (Throwable th5) {
                        ExceptionsKt__ExceptionsKt.addSuppressed(th4, th5);
                    }
                    th2 = th4;
                    zipEntry = null;
                }
            } catch (Throwable th6) {
                if (openReadOnly != null) {
                    try {
                        openReadOnly.close();
                    } catch (Throwable th7) {
                        ExceptionsKt__ExceptionsKt.addSuppressed(th6, th7);
                    }
                }
                th = th6;
                zipEntry = null;
            }
            if (th2 != null) {
                throw th2;
            }
            try {
                openReadOnly.close();
                th = null;
            } catch (Throwable th8) {
                th = th8;
            }
            if (th != null) {
                throw th;
            }
        }
        boolean z2 = zipEntry.isDirectory;
        boolean z3 = !z2;
        Long valueOf2 = z2 ? null : Long.valueOf(zipEntry.size);
        Long l4 = zipEntry.ntfsCreatedAtFiletime;
        if (l4 != null) {
            l = Long.valueOf((l4.longValue() / 10000) - 11644473600000L);
            z = true;
        } else {
            if (zipEntry.extendedCreatedAtSeconds != null) {
                z = true;
                l = Long.valueOf(r0.intValue() * 1000);
            } else {
                z = true;
                l = null;
            }
        }
        Long l5 = zipEntry.ntfsLastModifiedAtFiletime;
        if (l5 != null) {
            l2 = Long.valueOf((l5.longValue() / 10000) - 11644473600000L);
        } else {
            if (zipEntry.extendedLastModifiedAtSeconds != null) {
                l2 = Long.valueOf(r2.intValue() * 1000);
            } else {
                int i = zipEntry.dosLastModifiedAtTime;
                if (i != -1) {
                    int i2 = zipEntry.dosLastModifiedAtDate;
                    if (i != -1) {
                        int i3 = (i >> 11) & 31;
                        int i4 = (i >> 5) & 63;
                        int i5 = (i & 31) << 1;
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        gregorianCalendar.set(14, 0);
                        gregorianCalendar.set(((i2 >> 9) & 127) + 1980, ((i2 >> 5) & 15) - 1, i2 & 31, i3, i4, i5);
                        l2 = Long.valueOf(gregorianCalendar.getTime().getTime());
                    }
                }
                l2 = null;
            }
        }
        Long l6 = zipEntry.ntfsLastAccessedAtFiletime;
        if (l6 != null) {
            valueOf = Long.valueOf((l6.longValue() / 10000) - 11644473600000L);
        } else {
            if (zipEntry.extendedLastAccessedAtSeconds == null) {
                l3 = null;
                return new FileMetadata(z3, z2, (Path) null, valueOf2, l, l2, l3, 128);
            }
            valueOf = Long.valueOf(r1.intValue() * 1000);
        }
        l3 = valueOf;
        return new FileMetadata(z3, z2, (Path) null, valueOf2, l, l2, l3, 128);
    }

    @Override // okio.FileSystem
    public final FileHandle openReadOnly(Path path) {
        path.getClass();
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // okio.FileSystem
    public final Sink sink(Path path, boolean z) {
        path.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public final Source source(Path path) {
        Throwable th;
        RealBufferedSource realBufferedSource;
        path.getClass();
        Path path2 = ROOT;
        path2.getClass();
        ZipEntry zipEntry = (ZipEntry) this.entries.get(okio.internal.Path.commonResolve(path2, path, true));
        if (zipEntry == null) {
            Path$$ExternalSyntheticBUOutline0.m$2(path, "no such file: ");
            return null;
        }
        long j = zipEntry.size;
        FileHandle openReadOnly = this.fileSystem.openReadOnly(this.zipPath);
        try {
            realBufferedSource = new RealBufferedSource(openReadOnly.source(zipEntry.offset));
            try {
                openReadOnly.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (openReadOnly != null) {
                try {
                    openReadOnly.close();
                } catch (Throwable th4) {
                    ExceptionsKt__ExceptionsKt.addSuppressed(th3, th4);
                }
            }
            th = th3;
            realBufferedSource = null;
        }
        if (th != null) {
            throw th;
        }
        realBufferedSource.getClass();
        ZipFilesKt.readOrSkipLocalHeader(realBufferedSource, null);
        if (zipEntry.compressionMethod == 0) {
            return new FixedLengthSource(realBufferedSource, j, true);
        }
        return new FixedLengthSource(new InflaterSource(new RealBufferedSource(new FixedLengthSource(realBufferedSource, zipEntry.compressedSize, true)), new Inflater(true)), j, false);
    }
}
