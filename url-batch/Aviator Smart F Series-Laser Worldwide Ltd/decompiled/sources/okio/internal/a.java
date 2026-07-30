package okio.internal;

/* loaded from: classes5.dex */
final class a {
    private final long centralDirectoryOffset;
    private final int commentByteCount;
    private final long entryCount;

    public a(long j8, long j9, int i8) {
        this.entryCount = j8;
        this.centralDirectoryOffset = j9;
        this.commentByteCount = i8;
    }

    public final long getCentralDirectoryOffset() {
        return this.centralDirectoryOffset;
    }

    public final int getCommentByteCount() {
        return this.commentByteCount;
    }

    public final long getEntryCount() {
        return this.entryCount;
    }
}
