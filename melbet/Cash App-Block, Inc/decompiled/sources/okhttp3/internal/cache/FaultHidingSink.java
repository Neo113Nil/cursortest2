package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.jvm.functions.Function1;
import okio.Buffer;
import okio.ForwardingSink;
import okio.Sink;

/* loaded from: classes3.dex */
public final class FaultHidingSink extends ForwardingSink {
    public boolean hasErrors;
    public final Function1 onException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaultHidingSink(Sink sink, Function1 function1) {
        super(sink);
        sink.getClass();
        this.onException = function1;
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
    public final void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }

    @Override // okio.ForwardingSink, okio.Sink
    public final void write(Buffer buffer, long j) {
        buffer.getClass();
        if (this.hasErrors) {
            buffer.skip(j);
            return;
        }
        try {
            this.delegate.write(buffer, j);
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }
}
