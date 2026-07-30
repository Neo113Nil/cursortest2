package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class f {
    public static int a(TrackOutput trackOutput, DataReader dataReader, int i8, boolean z7) {
        return trackOutput.sampleData(dataReader, i8, z7, 0);
    }

    public static void b(TrackOutput trackOutput, ParsableByteArray parsableByteArray, int i8) {
        trackOutput.sampleData(parsableByteArray, i8, 0);
    }
}
