package okio.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import okio.o0;

/* loaded from: classes5.dex */
public final class c {
    private final o0 canonicalPath;
    private final List<o0> children;
    private final String comment;
    private final long compressedSize;
    private final int compressionMethod;
    private final long crc;
    private final boolean isDirectory;
    private final Long lastModifiedAtMillis;
    private final long offset;
    private final long size;

    public c(o0 canonicalPath, boolean z7, String comment, long j8, long j9, long j10, int i8, Long l8, long j11) {
        s.checkNotNullParameter(canonicalPath, "canonicalPath");
        s.checkNotNullParameter(comment, "comment");
        this.canonicalPath = canonicalPath;
        this.isDirectory = z7;
        this.comment = comment;
        this.crc = j8;
        this.compressedSize = j9;
        this.size = j10;
        this.compressionMethod = i8;
        this.lastModifiedAtMillis = l8;
        this.offset = j11;
        this.children = new ArrayList();
    }

    public final o0 getCanonicalPath() {
        return this.canonicalPath;
    }

    public final List<o0> getChildren() {
        return this.children;
    }

    public final String getComment() {
        return this.comment;
    }

    public final long getCompressedSize() {
        return this.compressedSize;
    }

    public final int getCompressionMethod() {
        return this.compressionMethod;
    }

    public final long getCrc() {
        return this.crc;
    }

    public final Long getLastModifiedAtMillis() {
        return this.lastModifiedAtMillis;
    }

    public final long getOffset() {
        return this.offset;
    }

    public final long getSize() {
        return this.size;
    }

    public final boolean isDirectory() {
        return this.isDirectory;
    }

    public /* synthetic */ c(o0 o0Var, boolean z7, String str, long j8, long j9, long j10, int i8, Long l8, long j11, int i9, o oVar) {
        this(o0Var, (i9 & 2) != 0 ? false : z7, (i9 & 4) != 0 ? "" : str, (i9 & 8) != 0 ? -1L : j8, (i9 & 16) != 0 ? -1L : j9, (i9 & 32) != 0 ? -1L : j10, (i9 & 64) != 0 ? -1 : i8, (i9 & 128) != 0 ? null : l8, (i9 & 256) == 0 ? j11 : -1L);
    }
}
