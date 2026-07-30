package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.jvm.internal.s;
import okio.c;
import okio.l;
import okio.v0;

/* loaded from: classes5.dex */
public class FaultHidingSink extends l {
    private boolean hasErrors;
    private final f6.l onException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaultHidingSink(v0 delegate, f6.l onException) {
        super(delegate);
        s.checkNotNullParameter(delegate, "delegate");
        s.checkNotNullParameter(onException, "onException");
        this.onException = onException;
    }

    @Override // okio.l, okio.v0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e8) {
            this.hasErrors = true;
            this.onException.invoke(e8);
        }
    }

    @Override // okio.l, okio.v0, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e8) {
            this.hasErrors = true;
            this.onException.invoke(e8);
        }
    }

    public final f6.l getOnException() {
        return this.onException;
    }

    @Override // okio.l, okio.v0
    public void write(c source, long j8) {
        s.checkNotNullParameter(source, "source");
        if (this.hasErrors) {
            source.skip(j8);
            return;
        }
        try {
            super.write(source, j8);
        } catch (IOException e8) {
            this.hasErrors = true;
            this.onException.invoke(e8);
        }
    }
}
