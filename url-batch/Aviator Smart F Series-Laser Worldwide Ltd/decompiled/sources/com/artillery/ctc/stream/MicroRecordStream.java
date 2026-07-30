package com.artillery.ctc.stream;

import android.media.AudioRecord;
import androidx.annotation.Keep;
import java.io.InputStream;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class MicroRecordStream extends InputStream {
    public static final a Companion = new a(null);
    private static final int NUMBER_16000 = 16000;
    private boolean isClosed;
    private boolean isStarted;
    private AudioRecord mAudioRecord;
    private f6.a mClose;
    private f6.a mStart;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    private final void start() {
        if (this.mAudioRecord == null) {
            this.mAudioRecord = new AudioRecord(1, 16000, 16, 2, AudioRecord.getMinBufferSize(16000, 16, 2) * 16);
        }
        AudioRecord audioRecord = this.mAudioRecord;
        s.checkNotNull(audioRecord);
        audioRecord.startRecording();
        this.isStarted = true;
        f6.a aVar = this.mStart;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AudioRecord audioRecord = this.mAudioRecord;
        if (audioRecord != null) {
            s.checkNotNull(audioRecord);
            audioRecord.stop();
            AudioRecord audioRecord2 = this.mAudioRecord;
            s.checkNotNull(audioRecord2);
            audioRecord2.release();
            this.isStarted = false;
            this.isClosed = true;
            this.mAudioRecord = null;
        }
        f6.a aVar = this.mClose;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final MicroRecordStream onEventChange(f6.a start, f6.a close) {
        s.checkNotNullParameter(start, "start");
        s.checkNotNullParameter(close, "close");
        this.mStart = start;
        this.mClose = close;
        return this;
    }

    @Override // java.io.InputStream
    public int read() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i8, int i9) {
        if (!this.isStarted && !this.isClosed) {
            start();
            this.isStarted = true;
        }
        AudioRecord audioRecord = this.mAudioRecord;
        s.checkNotNull(audioRecord);
        s.checkNotNull(bArr);
        return audioRecord.read(bArr, i8, i9);
    }
}
