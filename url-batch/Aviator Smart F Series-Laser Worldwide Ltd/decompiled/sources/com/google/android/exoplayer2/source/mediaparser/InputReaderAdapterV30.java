package com.google.android.exoplayer2.source.mediaparser;

import android.annotation.SuppressLint;
import android.media.MediaParser;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Util;

@RequiresApi(30)
@SuppressLint({"Override"})
@Deprecated
/* loaded from: classes3.dex */
public final class InputReaderAdapterV30 implements MediaParser.SeekableInputReader {
    private long currentPosition;

    @Nullable
    private DataReader dataReader;
    private long lastSeekPosition;
    private long resourceLength;

    public long getAndResetSeekPosition() {
        long j8 = this.lastSeekPosition;
        this.lastSeekPosition = -1L;
        return j8;
    }

    @Override // android.media.MediaParser.InputReader
    public long getLength() {
        return this.resourceLength;
    }

    @Override // android.media.MediaParser.InputReader
    public long getPosition() {
        return this.currentPosition;
    }

    @Override // android.media.MediaParser.InputReader
    public int read(byte[] bArr, int i8, int i9) {
        int read = ((DataReader) Util.castNonNull(this.dataReader)).read(bArr, i8, i9);
        this.currentPosition += read;
        return read;
    }

    @Override // android.media.MediaParser.SeekableInputReader
    public void seekToPosition(long j8) {
        this.lastSeekPosition = j8;
    }

    public void setCurrentPosition(long j8) {
        this.currentPosition = j8;
    }

    public void setDataReader(DataReader dataReader, long j8) {
        this.dataReader = dataReader;
        this.resourceLength = j8;
        this.lastSeekPosition = -1L;
    }
}
