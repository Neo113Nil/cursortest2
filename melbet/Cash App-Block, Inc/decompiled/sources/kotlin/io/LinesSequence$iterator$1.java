package kotlin.io;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.BufferedReader;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes9.dex */
public final class LinesSequence$iterator$1 implements Iterator, KMappedMarker {
    public boolean done;
    public String nextValue;
    public final /* synthetic */ LinesSequence this$0;

    public LinesSequence$iterator$1(LinesSequence linesSequence) {
        this.this$0 = linesSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.nextValue == null && !this.done) {
            String readLine = ((BufferedReader) this.this$0.reader).readLine();
            this.nextValue = readLine;
            if (readLine == null) {
                this.done = true;
            }
        }
        return this.nextValue != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        String str = this.nextValue;
        this.nextValue = null;
        str.getClass();
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
