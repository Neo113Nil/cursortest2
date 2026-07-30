package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.upstream.DataReader;

@Deprecated
/* loaded from: classes3.dex */
public interface ExtractorInput extends DataReader {
    void advancePeekPosition(int i8);

    boolean advancePeekPosition(int i8, boolean z7);

    long getLength();

    long getPeekPosition();

    long getPosition();

    int peek(byte[] bArr, int i8, int i9);

    void peekFully(byte[] bArr, int i8, int i9);

    boolean peekFully(byte[] bArr, int i8, int i9, boolean z7);

    @Override // com.google.android.exoplayer2.upstream.DataReader
    int read(byte[] bArr, int i8, int i9);

    void readFully(byte[] bArr, int i8, int i9);

    boolean readFully(byte[] bArr, int i8, int i9, boolean z7);

    void resetPeekPosition();

    <E extends Throwable> void setRetryPosition(long j8, E e8);

    int skip(int i8);

    void skipFully(int i8);

    boolean skipFully(int i8, boolean z7);
}
