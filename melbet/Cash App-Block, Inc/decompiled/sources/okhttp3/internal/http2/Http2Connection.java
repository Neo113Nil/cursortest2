package okhttp3.internal.http2;

import androidx.compose.ui.node.RulerTrackingMap;
import bo.app.c7$$ExternalSyntheticLambda4;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$0;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskQueue$execute$1;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.flowcontrol.WindowCounter;
import okio.Buffer;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import papa.internal.LaunchTracker;

/* loaded from: classes3.dex */
public final class Http2Connection implements Closeable {
    public static final Settings DEFAULT_SETTINGS;
    public final String connectionName;
    public final LinkedHashSet currentPushRequests;
    public long degradedPingsSent;
    public long degradedPongDeadlineNs;
    public long degradedPongsReceived;
    public final FlowControlListener$None flowControlListener;
    public long intervalPingsSent;
    public long intervalPongsReceived;
    public boolean isShutdown;
    public int lastGoodStreamId;
    public final Listener listener;
    public int nextStreamId;
    public final Settings okHttpSettings;
    public Settings peerSettings;
    public final ErrorCode.Companion pushObserver;
    public final TaskQueue pushQueue;
    public final WindowCounter readBytes;
    public final KClassImpl$Data$$Lambda$0 readerRunnable;
    public final TaskQueue settingsListenerQueue;
    public final LaunchTracker socket;
    public final LinkedHashMap streams = new LinkedHashMap();
    public final TaskRunner taskRunner;
    public long writeBytesMaximum;
    public long writeBytesTotal;
    public final Http2Writer writer;
    public final TaskQueue writerQueue;

    public abstract class Listener {
        public static final Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1 REFUSE_INCOMING_STREAMS = new Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1();

        public void onSettings(Http2Connection http2Connection, Settings settings) {
            settings.getClass();
        }

        public abstract void onStream(Http2Stream http2Stream);
    }

    static {
        Settings settings = new Settings();
        settings.set(4, 65535);
        settings.set(5, 16384);
        DEFAULT_SETTINGS = settings;
    }

    public Http2Connection(RulerTrackingMap rulerTrackingMap) {
        this.listener = (Listener) rulerTrackingMap.layoutNodes;
        String str = (String) rulerTrackingMap.accessFlags;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionName");
            throw null;
        }
        this.connectionName = str;
        this.nextStreamId = 3;
        TaskRunner taskRunner = (TaskRunner) rulerTrackingMap.rulers;
        this.taskRunner = taskRunner;
        TaskQueue newQueue = taskRunner.newQueue();
        this.writerQueue = newQueue;
        this.pushQueue = taskRunner.newQueue();
        this.settingsListenerQueue = taskRunner.newQueue();
        this.pushObserver = ErrorCode.Companion.CANCEL;
        this.flowControlListener = (FlowControlListener$None) rulerTrackingMap.newRulers;
        Settings settings = new Settings();
        settings.set(4, 16777216);
        this.okHttpSettings = settings;
        this.peerSettings = DEFAULT_SETTINGS;
        int i = 0;
        this.readBytes = new WindowCounter(0);
        this.writeBytesMaximum = r2.getInitialWindowSize();
        LaunchTracker launchTracker = (LaunchTracker) rulerTrackingMap.values;
        if (launchTracker == null) {
            Intrinsics.throwUninitializedPropertyAccessException("socket");
            throw null;
        }
        this.socket = launchTracker;
        this.writer = new Http2Writer((RealBufferedSink) launchTracker.launchInProgress);
        this.readerRunnable = new KClassImpl$Data$$Lambda$0(10, this, new Http2Reader((RealBufferedSource) launchTracker.lastAppBecameInvisibleRealtimeMillis));
        this.currentPushRequests = new LinkedHashSet();
        int i2 = rulerTrackingMap.size;
        if (i2 != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i2);
            newQueue.schedule(new TaskQueue$execute$1(str.concat(" ping"), new Http2Connection$$ExternalSyntheticLambda0(this, nanos, i)), nanos);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void close$okhttp(ErrorCode errorCode, ErrorCode errorCode2, IOException iOException) {
        int i;
        Object[] objArr;
        TimeZone timeZone = _UtilJvmKt.UTC;
        try {
            shutdown(errorCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.streams.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.streams.values().toArray(new Http2Stream[0]);
                this.streams.clear();
            }
        }
        Http2Stream[] http2StreamArr = (Http2Stream[]) objArr;
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.close(errorCode2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.writer.close();
        } catch (IOException unused3) {
        }
        try {
            this.socket.cancel();
        } catch (IOException unused4) {
        }
        this.writerQueue.shutdown();
        this.pushQueue.shutdown();
        this.settingsListenerQueue.shutdown();
    }

    public final Http2Stream getStream(int i) {
        Http2Stream http2Stream;
        synchronized (this) {
            http2Stream = (Http2Stream) this.streams.get(Integer.valueOf(i));
        }
        return http2Stream;
    }

    public final Http2Stream removeStream$okhttp(int i) {
        Http2Stream http2Stream;
        synchronized (this) {
            http2Stream = (Http2Stream) this.streams.remove(Integer.valueOf(i));
            notifyAll();
        }
        return http2Stream;
    }

    public final void shutdown(ErrorCode errorCode) {
        synchronized (this.writer) {
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                this.writer.goAway(this.lastGoodStreamId, errorCode, _UtilCommonKt.EMPTY_BYTE_ARRAY);
            }
        }
    }

    public final void updateConnectionFlowControl$okhttp(long j) {
        synchronized (this) {
            try {
                WindowCounter.update$default(this.readBytes, j, 0L, 2);
                long unacknowledged = this.readBytes.getUnacknowledged();
                if (unacknowledged >= this.okHttpSettings.getInitialWindowSize() / 2) {
                    writeWindowUpdateLater$okhttp(0, unacknowledged);
                    WindowCounter.update$default(this.readBytes, 0L, unacknowledged, 1);
                }
                FlowControlListener$None flowControlListener$None = this.flowControlListener;
                WindowCounter windowCounter = this.readBytes;
                flowControlListener$None.getClass();
                windowCounter.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.writer.maxFrameSize);
        r6 = r2;
        r8.writeBytesTotal += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void writeData(int i, boolean z, Buffer buffer, long j) {
        int min;
        long j2;
        if (j == 0) {
            this.writer.data(z, i, buffer, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j3 = this.writeBytesTotal;
                            long j4 = this.writeBytesMaximum;
                            if (j3 < j4) {
                                break;
                            } else {
                                if (!this.streams.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            j -= j2;
            this.writer.data(z && j == 0, i, buffer, min);
        }
    }

    public final void writeSynResetLater$okhttp(int i, ErrorCode errorCode) {
        TaskQueue.execute$default(this.writerQueue, this.connectionName + '[' + i + "] writeSynReset", 0L, new Http2Connection$$ExternalSyntheticLambda3(this, i, errorCode, 0), 6);
    }

    public final void writeWindowUpdateLater$okhttp(int i, long j) {
        TaskQueue.execute$default(this.writerQueue, this.connectionName + '[' + i + "] windowUpdate", 0L, new c7$$ExternalSyntheticLambda4(this, i, j), 6);
    }
}
