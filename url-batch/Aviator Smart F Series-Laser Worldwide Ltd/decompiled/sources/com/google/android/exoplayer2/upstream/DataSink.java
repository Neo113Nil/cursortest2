package com.google.android.exoplayer2.upstream;

@Deprecated
/* loaded from: classes3.dex */
public interface DataSink {

    public interface Factory {
        DataSink createDataSink();
    }

    void close();

    void open(DataSpec dataSpec);

    void write(byte[] bArr, int i8, int i9);
}
