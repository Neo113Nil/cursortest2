package kotlin.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import kotlin.collections.n;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: kotlin.io.a$a, reason: collision with other inner class name */
    public static final class C0364a extends n {
        final /* synthetic */ BufferedInputStream $this_iterator;
        private boolean finished;
        private int nextByte = -1;
        private boolean nextPrepared;

        C0364a(BufferedInputStream bufferedInputStream) {
            this.$this_iterator = bufferedInputStream;
        }

        private final void prepareNext() {
            if (this.nextPrepared || this.finished) {
                return;
            }
            int read = this.$this_iterator.read();
            this.nextByte = read;
            this.nextPrepared = true;
            this.finished = read == -1;
        }

        public final boolean getFinished() {
            return this.finished;
        }

        public final int getNextByte() {
            return this.nextByte;
        }

        public final boolean getNextPrepared() {
            return this.nextPrepared;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            prepareNext();
            return !this.finished;
        }

        @Override // kotlin.collections.n
        public byte nextByte() {
            prepareNext();
            if (this.finished) {
                throw new NoSuchElementException("Input stream is over.");
            }
            byte b8 = (byte) this.nextByte;
            this.nextPrepared = false;
            return b8;
        }

        public final void setFinished(boolean z7) {
            this.finished = z7;
        }

        public final void setNextByte(int i8) {
            this.nextByte = i8;
        }

        public final void setNextPrepared(boolean z7) {
            this.nextPrepared = z7;
        }
    }

    private static final BufferedInputStream buffered(InputStream inputStream, int i8) {
        s.checkNotNullParameter(inputStream, "<this>");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i8);
    }

    static /* synthetic */ BufferedInputStream buffered$default(InputStream inputStream, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = 8192;
        }
        s.checkNotNullParameter(inputStream, "<this>");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i8);
    }

    private static final BufferedReader bufferedReader(InputStream inputStream, Charset charset) {
        s.checkNotNullParameter(inputStream, "<this>");
        s.checkNotNullParameter(charset, "charset");
        Reader inputStreamReader = new InputStreamReader(inputStream, charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
    }

    static /* synthetic */ BufferedReader bufferedReader$default(InputStream inputStream, Charset charset, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charset = kotlin.text.d.UTF_8;
        }
        s.checkNotNullParameter(inputStream, "<this>");
        s.checkNotNullParameter(charset, "charset");
        Reader inputStreamReader = new InputStreamReader(inputStream, charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
    }

    private static final BufferedWriter bufferedWriter(OutputStream outputStream, Charset charset) {
        s.checkNotNullParameter(outputStream, "<this>");
        s.checkNotNullParameter(charset, "charset");
        Writer outputStreamWriter = new OutputStreamWriter(outputStream, charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
    }

    static /* synthetic */ BufferedWriter bufferedWriter$default(OutputStream outputStream, Charset charset, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charset = kotlin.text.d.UTF_8;
        }
        s.checkNotNullParameter(outputStream, "<this>");
        s.checkNotNullParameter(charset, "charset");
        Writer outputStreamWriter = new OutputStreamWriter(outputStream, charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
    }

    private static final ByteArrayInputStream byteInputStream(String str, Charset charset) {
        s.checkNotNullParameter(str, "<this>");
        s.checkNotNullParameter(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        s.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return new ByteArrayInputStream(bytes);
    }

    static /* synthetic */ ByteArrayInputStream byteInputStream$default(String str, Charset charset, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charset = kotlin.text.d.UTF_8;
        }
        s.checkNotNullParameter(str, "<this>");
        s.checkNotNullParameter(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        s.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return new ByteArrayInputStream(bytes);
    }

    public static final long copyTo(InputStream inputStream, OutputStream out, int i8) {
        s.checkNotNullParameter(inputStream, "<this>");
        s.checkNotNullParameter(out, "out");
        byte[] bArr = new byte[i8];
        int read = inputStream.read(bArr);
        long j8 = 0;
        while (read >= 0) {
            out.write(bArr, 0, read);
            j8 += read;
            read = inputStream.read(bArr);
        }
        return j8;
    }

    public static /* synthetic */ long copyTo$default(InputStream inputStream, OutputStream outputStream, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 8192;
        }
        return copyTo(inputStream, outputStream, i8);
    }

    private static final ByteArrayInputStream inputStream(byte[] bArr) {
        s.checkNotNullParameter(bArr, "<this>");
        return new ByteArrayInputStream(bArr);
    }

    public static final n iterator(BufferedInputStream bufferedInputStream) {
        s.checkNotNullParameter(bufferedInputStream, "<this>");
        return new C0364a(bufferedInputStream);
    }

    public static final byte[] readBytes(InputStream inputStream, int i8) {
        s.checkNotNullParameter(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(i8, inputStream.available()));
        copyTo$default(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        s.checkNotNullExpressionValue(byteArray, "buffer.toByteArray()");
        return byteArray;
    }

    public static /* synthetic */ byte[] readBytes$default(InputStream inputStream, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = 8192;
        }
        return readBytes(inputStream, i8);
    }

    private static final InputStreamReader reader(InputStream inputStream, Charset charset) {
        s.checkNotNullParameter(inputStream, "<this>");
        s.checkNotNullParameter(charset, "charset");
        return new InputStreamReader(inputStream, charset);
    }

    static /* synthetic */ InputStreamReader reader$default(InputStream inputStream, Charset charset, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charset = kotlin.text.d.UTF_8;
        }
        s.checkNotNullParameter(inputStream, "<this>");
        s.checkNotNullParameter(charset, "charset");
        return new InputStreamReader(inputStream, charset);
    }

    private static final OutputStreamWriter writer(OutputStream outputStream, Charset charset) {
        s.checkNotNullParameter(outputStream, "<this>");
        s.checkNotNullParameter(charset, "charset");
        return new OutputStreamWriter(outputStream, charset);
    }

    static /* synthetic */ OutputStreamWriter writer$default(OutputStream outputStream, Charset charset, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charset = kotlin.text.d.UTF_8;
        }
        s.checkNotNullParameter(outputStream, "<this>");
        s.checkNotNullParameter(charset, "charset");
        return new OutputStreamWriter(outputStream, charset);
    }

    private static final BufferedOutputStream buffered(OutputStream outputStream, int i8) {
        s.checkNotNullParameter(outputStream, "<this>");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i8);
    }

    private static final ByteArrayInputStream inputStream(byte[] bArr, int i8, int i9) {
        s.checkNotNullParameter(bArr, "<this>");
        return new ByteArrayInputStream(bArr, i8, i9);
    }

    static /* synthetic */ BufferedOutputStream buffered$default(OutputStream outputStream, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = 8192;
        }
        s.checkNotNullParameter(outputStream, "<this>");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i8);
    }

    public static final byte[] readBytes(InputStream inputStream) {
        s.checkNotNullParameter(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        copyTo$default(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        s.checkNotNullExpressionValue(byteArray, "buffer.toByteArray()");
        return byteArray;
    }
}
