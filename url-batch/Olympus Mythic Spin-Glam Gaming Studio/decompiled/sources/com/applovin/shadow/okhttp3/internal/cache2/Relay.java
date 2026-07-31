package com.applovin.shadow.okhttp3.internal.cache2;

import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.Source;
import com.applovin.shadow.okio.Timeout;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Relay.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 :2\u00020\u0001:\u0002:;B3\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\u000e\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\tJ\b\u00105\u001a\u0004\u0018\u00010\u0005J \u00106\u001a\u0002032\u0006\u00107\u001a\u00020\t2\u0006\u00104\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u0007H\u0002J\u0010\u00109\u001a\u0002032\u0006\u00104\u001a\u00020\u0007H\u0002R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0015R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0011\"\u0004\b*\u0010+R\u001c\u0010,\u001a\u0004\u0018\u00010-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u0006<"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;", "", "file", "Ljava/io/RandomAccessFile;", "upstream", "Lcom/applovin/shadow/okio/Source;", "upstreamPos", "", "metadata", "Lcom/applovin/shadow/okio/ByteString;", "bufferMaxSize", "(Ljava/io/RandomAccessFile;Lokio/Source;JLokio/ByteString;J)V", "buffer", "Lcom/applovin/shadow/okio/Buffer;", "getBuffer", "()Lokio/Buffer;", "getBufferMaxSize", "()J", "complete", "", "getComplete", "()Z", "setComplete", "(Z)V", "getFile", "()Ljava/io/RandomAccessFile;", "setFile", "(Ljava/io/RandomAccessFile;)V", "isClosed", "sourceCount", "", "getSourceCount", "()I", "setSourceCount", "(I)V", "getUpstream", "()Lokio/Source;", "setUpstream", "(Lokio/Source;)V", "upstreamBuffer", "getUpstreamBuffer", "getUpstreamPos", "setUpstreamPos", "(J)V", "upstreamReader", "Ljava/lang/Thread;", "getUpstreamReader", "()Ljava/lang/Thread;", "setUpstreamReader", "(Ljava/lang/Thread;)V", "commit", "", "upstreamSize", "newSource", "writeHeader", "prefix", "metadataSize", "writeMetadata", "Companion", "RelaySource", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Relay {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long FILE_HEADER_SIZE = 32;

    @NotNull
    public static final ByteString PREFIX_CLEAN;

    @NotNull
    public static final ByteString PREFIX_DIRTY;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;

    @NotNull
    private final Buffer buffer;
    private final long bufferMaxSize;
    private boolean complete;

    @Nullable
    private RandomAccessFile file;

    @NotNull
    private final ByteString metadata;
    private int sourceCount;

    @Nullable
    private Source upstream;

    @NotNull
    private final Buffer upstreamBuffer;
    private long upstreamPos;

    @Nullable
    private Thread upstreamReader;

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, Source source, long j, ByteString byteString, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(randomAccessFile, source, j, byteString, j2);
    }

    private Relay(RandomAccessFile randomAccessFile, Source source, long j, ByteString byteString, long j2) {
        this.file = randomAccessFile;
        this.upstream = source;
        this.upstreamPos = j;
        this.metadata = byteString;
        this.bufferMaxSize = j2;
        this.upstreamBuffer = new Buffer();
        this.complete = this.upstream == null;
        this.buffer = new Buffer();
    }

    @Nullable
    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final void setFile(@Nullable RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    @Nullable
    public final Source getUpstream() {
        return this.upstream;
    }

    public final void setUpstream(@Nullable Source source) {
        this.upstream = source;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    public final void setUpstreamPos(long j) {
        this.upstreamPos = j;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    @Nullable
    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final void setUpstreamReader(@Nullable Thread thread) {
        this.upstreamReader = thread;
    }

    @NotNull
    public final Buffer getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final void setComplete(boolean z) {
        this.complete = z;
    }

    @NotNull
    public final Buffer getBuffer() {
        return this.buffer;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    public final void setSourceCount(int i) {
        this.sourceCount = i;
    }

    public final boolean isClosed() {
        return this.file == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeHeader(ByteString prefix, long upstreamSize, long metadataSize) throws IOException {
        Buffer buffer = new Buffer();
        buffer.write(prefix);
        buffer.writeLong(upstreamSize);
        buffer.writeLong(metadataSize);
        if (buffer.size() != FILE_HEADER_SIZE) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        RandomAccessFile randomAccessFile = this.file;
        Intrinsics.checkNotNull(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        Intrinsics.checkNotNullExpressionValue(channel, "file!!.channel");
        new FileOperator(channel).write(0L, buffer, FILE_HEADER_SIZE);
    }

    private final void writeMetadata(long upstreamSize) throws IOException {
        Buffer buffer = new Buffer();
        buffer.write(this.metadata);
        RandomAccessFile randomAccessFile = this.file;
        Intrinsics.checkNotNull(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        Intrinsics.checkNotNullExpressionValue(channel, "file!!.channel");
        new FileOperator(channel).write(FILE_HEADER_SIZE + upstreamSize, buffer, this.metadata.size());
    }

    public final void commit(long upstreamSize) throws IOException {
        writeMetadata(upstreamSize);
        RandomAccessFile randomAccessFile = this.file;
        Intrinsics.checkNotNull(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, upstreamSize, this.metadata.size());
        RandomAccessFile randomAccessFile2 = this.file;
        Intrinsics.checkNotNull(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
            Unit unit = Unit.INSTANCE;
        }
        Source source = this.upstream;
        if (source != null) {
            Util.closeQuietly(source);
        }
        this.upstream = null;
    }

    @NotNull
    /* renamed from: metadata, reason: from getter */
    public final ByteString getMetadata() {
        return this.metadata;
    }

    @Nullable
    public final Source newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }

    /* compiled from: Relay.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;", "Lcom/applovin/shadow/okio/Source;", "(Lokhttp3/internal/cache2/Relay;)V", "fileOperator", "Lcom/applovin/shadow/okhttp3/internal/cache2/FileOperator;", "sourcePos", "", "timeout", "Lcom/applovin/shadow/okio/Timeout;", "close", "", "read", "sink", "Lcom/applovin/shadow/okio/Buffer;", "byteCount", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class RelaySource implements Source {

        @Nullable
        private FileOperator fileOperator;
        private long sourcePos;

        @NotNull
        private final Timeout timeout = new Timeout();

        public RelaySource() {
            RandomAccessFile file = Relay.this.getFile();
            Intrinsics.checkNotNull(file);
            FileChannel channel = file.getChannel();
            Intrinsics.checkNotNullExpressionValue(channel, "file!!.channel");
            this.fileOperator = new FileOperator(channel);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
        
            if (r0 != 2) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        
            r10 = java.lang.Math.min(r23, r21.this$0.getUpstreamPos() - r21.sourcePos);
            r2 = r21.fileOperator;
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2);
            r2.read(r21.sourcePos + com.applovin.shadow.okhttp3.internal.cache2.Relay.FILE_HEADER_SIZE, r22, r10);
            r21.sourcePos += r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
        
            return r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
        
            r0 = r21.this$0.getUpstream();
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0);
            r11 = r0.read(r21.this$0.getUpstreamBuffer(), r21.this$0.getBufferMaxSize());
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0095, code lost:
        
            if (r11 != (-1)) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0097, code lost:
        
            r0 = r21.this$0;
            r0.commit(r0.getUpstreamPos());
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00a0, code lost:
        
            r2 = r21.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00a2, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
        
            r2.setUpstreamReader(null);
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type java.lang.Object");
            r2.notifyAll();
            r0 = kotlin.Unit.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00b0, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00b1, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00b8, code lost:
        
            r19 = java.lang.Math.min(r11, r23);
            r21.this$0.getUpstreamBuffer().copyTo(r22, 0, r19);
            r21.sourcePos += r19;
            r13 = r21.fileOperator;
            kotlin.jvm.internal.Intrinsics.checkNotNull(r13);
            r13.write(r21.this$0.getUpstreamPos() + com.applovin.shadow.okhttp3.internal.cache2.Relay.FILE_HEADER_SIZE, r21.this$0.getUpstreamBuffer().m3195clone(), r11);
            r2 = r21.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00f0, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00f1, code lost:
        
            r2.getBuffer().write(r2.getUpstreamBuffer(), r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x010a, code lost:
        
            if (r2.getBuffer().size() <= r2.getBufferMaxSize()) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x010c, code lost:
        
            r2.getBuffer().skip(r2.getBuffer().size() - r2.getBufferMaxSize());
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0123, code lost:
        
            r2.setUpstreamPos(r2.getUpstreamPos() + r11);
            r0 = kotlin.Unit.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x012d, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x012e, code lost:
        
            r2 = r21.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0130, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0131, code lost:
        
            r2.setUpstreamReader(null);
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type java.lang.Object");
            r2.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x013c, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x013d, code lost:
        
            return r19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0121, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0142, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00b5, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0143, code lost:
        
            r2 = r21.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0145, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0146, code lost:
        
            r2.setUpstreamReader(null);
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type java.lang.Object");
            r2.notifyAll();
            r3 = kotlin.Unit.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0154, code lost:
        
            throw r0;
         */
        @Override // com.applovin.shadow.okio.Source
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public long read(@NotNull Buffer sink, long byteCount) throws IOException {
            char c;
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (this.fileOperator == null) {
                throw new IllegalStateException("Check failed.");
            }
            Relay relay = Relay.this;
            synchronized (relay) {
                while (true) {
                    try {
                        if (this.sourcePos != relay.getUpstreamPos()) {
                            long upstreamPos = relay.getUpstreamPos() - relay.getBuffer().size();
                            if (this.sourcePos >= upstreamPos) {
                                long min = Math.min(byteCount, relay.getUpstreamPos() - this.sourcePos);
                                relay.getBuffer().copyTo(sink, this.sourcePos - upstreamPos, min);
                                this.sourcePos += min;
                                return min;
                            }
                            c = 2;
                        } else if (!relay.getComplete()) {
                            if (relay.getUpstreamReader() == null) {
                                relay.setUpstreamReader(Thread.currentThread());
                                c = 1;
                                break;
                            }
                            this.timeout.waitUntilNotified(relay);
                        } else {
                            return -1L;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // com.applovin.shadow.okio.Source
        @NotNull
        /* renamed from: timeout, reason: from getter */
        public Timeout getTimeout() {
            return this.timeout;
        }

        @Override // com.applovin.shadow.okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.fileOperator == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.fileOperator = null;
            Relay relay = Relay.this;
            synchronized (relay) {
                try {
                    relay.setSourceCount(relay.getSourceCount() - 1);
                    if (relay.getSourceCount() == 0) {
                        RandomAccessFile file = relay.getFile();
                        relay.setFile(null);
                        randomAccessFile = file;
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (randomAccessFile != null) {
                Util.closeQuietly(randomAccessFile);
            }
        }
    }

    /* compiled from: Relay.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$Companion;", "", "()V", "FILE_HEADER_SIZE", "", "PREFIX_CLEAN", "Lcom/applovin/shadow/okio/ByteString;", "PREFIX_DIRTY", "SOURCE_FILE", "", "SOURCE_UPSTREAM", "edit", "Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;", "file", "Ljava/io/File;", "upstream", "Lcom/applovin/shadow/okio/Source;", "metadata", "bufferMaxSize", "read", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final Relay edit(@NotNull File file, @NotNull Source upstream, @NotNull ByteString metadata, long bufferMaxSize) throws IOException {
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(upstream, "upstream");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            Relay relay = new Relay(randomAccessFile, upstream, 0L, metadata, bufferMaxSize, null);
            randomAccessFile.setLength(0L);
            relay.writeHeader(Relay.PREFIX_DIRTY, -1L, -1L);
            return relay;
        }

        @NotNull
        public final Relay read(@NotNull File file) throws IOException {
            Intrinsics.checkNotNullParameter(file, "file");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            Intrinsics.checkNotNullExpressionValue(channel, "randomAccessFile.channel");
            FileOperator fileOperator = new FileOperator(channel);
            Buffer buffer = new Buffer();
            fileOperator.read(0L, buffer, Relay.FILE_HEADER_SIZE);
            if (!Intrinsics.areEqual(buffer.readByteString(r1.size()), Relay.PREFIX_CLEAN)) {
                throw new IOException("unreadable cache file");
            }
            long readLong = buffer.readLong();
            long readLong2 = buffer.readLong();
            Buffer buffer2 = new Buffer();
            fileOperator.read(readLong + Relay.FILE_HEADER_SIZE, buffer2, readLong2);
            return new Relay(randomAccessFile, null, readLong, buffer2.readByteString(), 0L, null);
        }
    }

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        PREFIX_CLEAN = companion.encodeUtf8("OkHttp cache v1\n");
        PREFIX_DIRTY = companion.encodeUtf8("OkHttp DIRTY :(\n");
    }
}
