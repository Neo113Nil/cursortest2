package kotlin.io;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.s;
import kotlin.sequences.m;

/* loaded from: classes4.dex */
final class j implements m {
    private final BufferedReader reader;

    public static final class a implements Iterator, g6.a {
        private boolean done;
        private String nextValue;

        a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextValue == null && !this.done) {
                String readLine = j.this.reader.readLine();
                this.nextValue = readLine;
                if (readLine == null) {
                    this.done = true;
                }
            }
            return this.nextValue != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Iterator
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.nextValue;
            this.nextValue = null;
            s.checkNotNull(str);
            return str;
        }
    }

    public j(BufferedReader reader) {
        s.checkNotNullParameter(reader, "reader");
        this.reader = reader;
    }

    @Override // kotlin.sequences.m
    public Iterator<String> iterator() {
        return new a();
    }
}
