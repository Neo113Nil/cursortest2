package okhttp3.internal.cache2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import okhttp3.internal.Util;
import okio.ByteString;
import okio.c;
import okio.x0;
import okio.y0;
import y5.w;

/* loaded from: classes5.dex */
public final class Relay {
    public static final Companion Companion = new Companion(null);
    private static final long FILE_HEADER_SIZE = 32;
    public static final ByteString PREFIX_CLEAN;
    public static final ByteString PREFIX_DIRTY;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    private final c buffer;
    private final long bufferMaxSize;
    private boolean complete;
    private RandomAccessFile file;
    private final ByteString metadata;
    private int sourceCount;
    private x0 upstream;
    private final c upstreamBuffer;
    private long upstreamPos;
    private Thread upstreamReader;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final Relay edit(File file, x0 upstream, ByteString metadata, long j8) {
            s.checkNotNullParameter(file, "file");
            s.checkNotNullParameter(upstream, "upstream");
            s.checkNotNullParameter(metadata, "metadata");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            Relay relay = new Relay(randomAccessFile, upstream, 0L, metadata, j8, null);
            randomAccessFile.setLength(0L);
            relay.writeHeader(Relay.PREFIX_DIRTY, -1L, -1L);
            return relay;
        }

        public final Relay read(File file) {
            s.checkNotNullParameter(file, "file");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            s.checkNotNullExpressionValue(channel, "randomAccessFile.channel");
            FileOperator fileOperator = new FileOperator(channel);
            c cVar = new c();
            fileOperator.read(0L, cVar, 32L);
            if (!s.areEqual(cVar.readByteString(r1.size()), Relay.PREFIX_CLEAN)) {
                throw new IOException("unreadable cache file");
            }
            long readLong = cVar.readLong();
            long readLong2 = cVar.readLong();
            c cVar2 = new c();
            fileOperator.read(readLong + 32, cVar2, readLong2);
            return new Relay(randomAccessFile, null, readLong, cVar2.readByteString(), 0L, null);
        }
    }

    public final class RelaySource implements x0 {
        private FileOperator fileOperator;
        private long sourcePos;
        final /* synthetic */ Relay this$0;
        private final y0 timeout;

        public RelaySource(Relay this$0) {
            s.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
            this.timeout = new y0();
            RandomAccessFile file = this$0.getFile();
            s.checkNotNull(file);
            FileChannel channel = file.getChannel();
            s.checkNotNullExpressionValue(channel, "file!!.channel");
            this.fileOperator = new FileOperator(channel);
        }

        @Override // okio.x0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.fileOperator == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.fileOperator = null;
            Relay relay = this.this$0;
            synchronized (relay) {
                try {
                    relay.setSourceCount(relay.getSourceCount() - 1);
                    if (relay.getSourceCount() == 0) {
                        RandomAccessFile file = relay.getFile();
                        relay.setFile(null);
                        randomAccessFile = file;
                    }
                    w wVar = w.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (randomAccessFile == null) {
                return;
            }
            Util.closeQuietly(randomAccessFile);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
        
            if (r4 != 2) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
        
            r10 = java.lang.Math.min(r21, r19.this$0.getUpstreamPos() - r19.sourcePos);
            r2 = r19.fileOperator;
            kotlin.jvm.internal.s.checkNotNull(r2);
            r2.read(r19.sourcePos + 32, r20, r10);
            r19.sourcePos += r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
        
            return r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x009b, code lost:
        
            r0 = r19.this$0.getUpstream();
            kotlin.jvm.internal.s.checkNotNull(r0);
            r14 = r0.read(r19.this$0.getUpstreamBuffer(), r19.this$0.getBufferMaxSize());
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00b6, code lost:
        
            if (r14 != (-1)) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00b8, code lost:
        
            r0 = r19.this$0;
            r0.commit(r0.getUpstreamPos());
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00c1, code lost:
        
            r2 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00c3, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00c4, code lost:
        
            r2.setUpstreamReader(null);
            r2.notifyAll();
            r0 = y5.w.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00cc, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00cd, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00d4, code lost:
        
            r11 = java.lang.Math.min(r14, r21);
            r19.this$0.getUpstreamBuffer().copyTo(r20, 0, r11);
            r19.sourcePos += r11;
            r13 = r19.fileOperator;
            kotlin.jvm.internal.s.checkNotNull(r13);
            r13.write(r19.this$0.getUpstreamPos() + 32, r19.this$0.getUpstreamBuffer().clone(), r14);
            r2 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x010b, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x010c, code lost:
        
            r2.getBuffer().write(r2.getUpstreamBuffer(), r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0125, code lost:
        
            if (r2.getBuffer().size() <= r2.getBufferMaxSize()) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0127, code lost:
        
            r2.getBuffer().skip(r2.getBuffer().size() - r2.getBufferMaxSize());
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x013e, code lost:
        
            r2.setUpstreamPos(r2.getUpstreamPos() + r14);
            r0 = y5.w.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0148, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0149, code lost:
        
            r2 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x014b, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x014c, code lost:
        
            r2.setUpstreamReader(null);
            r2.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0152, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0153, code lost:
        
            return r11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x013c, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0158, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00d1, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0159, code lost:
        
            r2 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x015b, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x015c, code lost:
        
            r2.setUpstreamReader(null);
            r2.notifyAll();
            r3 = y5.w.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0165, code lost:
        
            throw r0;
         */
        @Override // okio.x0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public long read(c sink, long j8) {
            char c8;
            s.checkNotNullParameter(sink, "sink");
            if (this.fileOperator == null) {
                throw new IllegalStateException("Check failed.".toString());
            }
            Relay relay = this.this$0;
            synchronized (relay) {
                while (true) {
                    if (this.sourcePos == relay.getUpstreamPos()) {
                        if (!relay.getComplete()) {
                            if (relay.getUpstreamReader() == null) {
                                relay.setUpstreamReader(Thread.currentThread());
                                c8 = 1;
                                break;
                            }
                            this.timeout.waitUntilNotified(relay);
                        } else {
                            return -1L;
                        }
                    } else {
                        long upstreamPos = relay.getUpstreamPos() - relay.getBuffer().size();
                        if (this.sourcePos >= upstreamPos) {
                            long min = Math.min(j8, relay.getUpstreamPos() - this.sourcePos);
                            relay.getBuffer().copyTo(sink, this.sourcePos - upstreamPos, min);
                            this.sourcePos += min;
                            return min;
                        }
                        c8 = 2;
                    }
                }
            }
        }

        @Override // okio.x0
        public y0 timeout() {
            return this.timeout;
        }
    }

    static {
        ByteString.a aVar = ByteString.Companion;
        PREFIX_CLEAN = aVar.encodeUtf8("OkHttp cache v1\n");
        PREFIX_DIRTY = aVar.encodeUtf8("OkHttp DIRTY :(\n");
    }

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, x0 x0Var, long j8, ByteString byteString, long j9, o oVar) {
        this(randomAccessFile, x0Var, j8, byteString, j9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeHeader(ByteString byteString, long j8, long j9) {
        c cVar = new c();
        cVar.write(byteString);
        cVar.writeLong(j8);
        cVar.writeLong(j9);
        if (cVar.size() != 32) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        RandomAccessFile randomAccessFile = this.file;
        s.checkNotNull(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        s.checkNotNullExpressionValue(channel, "file!!.channel");
        new FileOperator(channel).write(0L, cVar, 32L);
    }

    private final void writeMetadata(long j8) {
        c cVar = new c();
        cVar.write(this.metadata);
        RandomAccessFile randomAccessFile = this.file;
        s.checkNotNull(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        s.checkNotNullExpressionValue(channel, "file!!.channel");
        new FileOperator(channel).write(32 + j8, cVar, this.metadata.size());
    }

    public final void commit(long j8) {
        writeMetadata(j8);
        RandomAccessFile randomAccessFile = this.file;
        s.checkNotNull(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j8, this.metadata.size());
        RandomAccessFile randomAccessFile2 = this.file;
        s.checkNotNull(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            setComplete(true);
            w wVar = w.INSTANCE;
        }
        x0 x0Var = this.upstream;
        if (x0Var != null) {
            Util.closeQuietly(x0Var);
        }
        this.upstream = null;
    }

    public final c getBuffer() {
        return this.buffer;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    public final x0 getUpstream() {
        return this.upstream;
    }

    public final c getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final boolean isClosed() {
        return this.file == null;
    }

    public final ByteString metadata() {
        return this.metadata;
    }

    public final x0 newSource() {
        synchronized (this) {
            if (getFile() == null) {
                return null;
            }
            setSourceCount(getSourceCount() + 1);
            return new RelaySource(this);
        }
    }

    public final void setComplete(boolean z7) {
        this.complete = z7;
    }

    public final void setFile(RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final void setSourceCount(int i8) {
        this.sourceCount = i8;
    }

    public final void setUpstream(x0 x0Var) {
        this.upstream = x0Var;
    }

    public final void setUpstreamPos(long j8) {
        this.upstreamPos = j8;
    }

    public final void setUpstreamReader(Thread thread) {
        this.upstreamReader = thread;
    }

    private Relay(RandomAccessFile randomAccessFile, x0 x0Var, long j8, ByteString byteString, long j9) {
        this.file = randomAccessFile;
        this.upstream = x0Var;
        this.upstreamPos = j8;
        this.metadata = byteString;
        this.bufferMaxSize = j9;
        this.upstreamBuffer = new c();
        this.complete = this.upstream == null;
        this.buffer = new c();
    }
}
