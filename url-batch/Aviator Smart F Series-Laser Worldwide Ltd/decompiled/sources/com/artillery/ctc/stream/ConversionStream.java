package com.artillery.ctc.stream;

import androidx.annotation.Keep;
import f6.a;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.charset.Charset;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.text.d;

@Keep
/* loaded from: classes.dex */
public final class ConversionStream extends PipedInputStream {
    private boolean isClosed;
    private boolean isStarted;
    private a mClose;
    private a mStart;
    private PipedOutputStream output;

    public ConversionStream() {
        this(0, 1, null);
    }

    private final void start() {
        this.isStarted = true;
        a aVar = this.mStart;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public static /* synthetic */ void write$default(ConversionStream conversionStream, String str, Charset charset, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            charset = d.UTF_8;
        }
        conversionStream.write(str, charset);
    }

    @Override // java.io.PipedInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        this.isStarted = false;
        this.isClosed = true;
        this.output.close();
        a aVar = this.mClose;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final ConversionStream onEventChange(a start, a close) {
        s.checkNotNullParameter(start, "start");
        s.checkNotNullParameter(close, "close");
        this.mStart = start;
        this.mClose = close;
        return this;
    }

    @Override // java.io.PipedInputStream, java.io.InputStream
    public int read(byte[] bArr, int i8, int i9) {
        if (!this.isStarted && !this.isClosed) {
            start();
            this.isStarted = true;
        }
        return super.read(bArr, i8, i9);
    }

    public final void write(String text, Charset charset) {
        s.checkNotNullParameter(text, "text");
        s.checkNotNullParameter(charset, "charset");
        PipedOutputStream pipedOutputStream = this.output;
        byte[] bytes = text.getBytes(charset);
        s.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        pipedOutputStream.write(bytes);
    }

    public ConversionStream(int i8) {
        super(i8);
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        this.output = pipedOutputStream;
        connect(pipedOutputStream);
    }

    public final void write(byte[] bytes) {
        s.checkNotNullParameter(bytes, "bytes");
        this.output.write(bytes);
    }

    public /* synthetic */ ConversionStream(int i8, int i9, o oVar) {
        this((i9 & 1) != 0 ? 1024 : i8);
    }
}
