package com.withpersona.sdk2.inquiry.document.network;

import java.io.File;
import java.io.FileInputStream;
import kotlin.math.MathKt__MathJVMKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;

/* loaded from: classes9.dex */
public final class ProgressRequestBody extends RequestBody {
    public final File file;
    public final StateFlowImpl flow = FlowKt.MutableStateFlow(0);
    public final MediaType mediaType;

    public ProgressRequestBody(File file, MediaType mediaType) {
        this.file = file;
        this.mediaType = mediaType;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.file.length();
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        return this.mediaType;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(BufferedSink bufferedSink) {
        File file = this.file;
        float length = file.length();
        byte[] bArr = new byte[2048];
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            int read = fileInputStream.read(bArr);
            long j = 0;
            int i = 0;
            while (read != -1) {
                j += read;
                bufferedSink.write(0, read, bArr);
                read = fileInputStream.read(bArr);
                int roundToInt = MathKt__MathJVMKt.roundToInt((j / length) * 100.0f);
                if (roundToInt - i > 1 || roundToInt >= 100) {
                    StateFlowImpl stateFlowImpl = this.flow;
                    Integer valueOf = Integer.valueOf(roundToInt);
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, valueOf);
                    i = roundToInt;
                }
            }
            fileInputStream.close();
        } finally {
        }
    }
}
