package defpackage;

import android.net.http.BidirectionalStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalBidirectionalStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lhw extends ExperimentalBidirectionalStream {
    private final BidirectionalStream a;
    private final lia b;
    private final String c;
    private final Collection d;

    public lhw(BidirectionalStream bidirectionalStream, lia liaVar, String str, Collection collection) {
        this.a = bidirectionalStream;
        this.b = liaVar;
        this.c = str;
        this.d = collection;
    }

    final void a(int i, lim limVar, CronetException cronetException) {
        lie.a(this.b, this.c, this.d, null, i, limVar, cronetException);
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void cancel() {
        this.a.cancel();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void flush() {
        this.a.flush();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final boolean isDone() {
        boolean isDone;
        isDone = this.a.isDone();
        return isDone;
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void read(ByteBuffer byteBuffer) {
        this.a.read(byteBuffer);
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void start() {
        this.a.start();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void write(ByteBuffer byteBuffer, boolean z) {
        this.a.write(byteBuffer, z);
    }
}
