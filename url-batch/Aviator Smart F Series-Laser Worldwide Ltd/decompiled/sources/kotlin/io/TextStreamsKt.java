package kotlin.io;

import f6.l;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.m;
import y5.w;

/* loaded from: classes4.dex */
public abstract class TextStreamsKt {
    private static final BufferedReader buffered(Reader reader, int i8) {
        s.checkNotNullParameter(reader, "<this>");
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i8);
    }

    static /* synthetic */ BufferedReader buffered$default(Reader reader, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = 8192;
        }
        s.checkNotNullParameter(reader, "<this>");
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i8);
    }

    public static final long copyTo(Reader reader, Writer out, int i8) {
        s.checkNotNullParameter(reader, "<this>");
        s.checkNotNullParameter(out, "out");
        char[] cArr = new char[i8];
        int read = reader.read(cArr);
        long j8 = 0;
        while (read >= 0) {
            out.write(cArr, 0, read);
            j8 += read;
            read = reader.read(cArr);
        }
        return j8;
    }

    public static /* synthetic */ long copyTo$default(Reader reader, Writer writer, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 8192;
        }
        return copyTo(reader, writer, i8);
    }

    public static final void forEachLine(Reader reader, l action) {
        s.checkNotNullParameter(reader, "<this>");
        s.checkNotNullParameter(action, "action");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            Iterator<Object> it = lineSequence(bufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            w wVar = w.INSTANCE;
            b.closeFinally(bufferedReader, null);
        } finally {
        }
    }

    public static final m lineSequence(BufferedReader bufferedReader) {
        m constrainOnce;
        s.checkNotNullParameter(bufferedReader, "<this>");
        constrainOnce = SequencesKt__SequencesKt.constrainOnce(new j(bufferedReader));
        return constrainOnce;
    }

    public static final byte[] readBytes(URL url) {
        s.checkNotNullParameter(url, "<this>");
        InputStream it = url.openStream();
        try {
            s.checkNotNullExpressionValue(it, "it");
            byte[] readBytes = a.readBytes(it);
            b.closeFinally(it, null);
            return readBytes;
        } finally {
        }
    }

    public static final List<String> readLines(Reader reader) {
        s.checkNotNullParameter(reader, "<this>");
        final ArrayList arrayList = new ArrayList();
        forEachLine(reader, new l() { // from class: kotlin.io.TextStreamsKt$readLines$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return w.INSTANCE;
            }

            public final void invoke(String it) {
                s.checkNotNullParameter(it, "it");
                arrayList.add(it);
            }
        });
        return arrayList;
    }

    public static final String readText(Reader reader) {
        s.checkNotNullParameter(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        copyTo$default(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        s.checkNotNullExpressionValue(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }

    static /* synthetic */ String readText$default(URL url, Charset charset, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charset = kotlin.text.d.UTF_8;
        }
        s.checkNotNullParameter(url, "<this>");
        s.checkNotNullParameter(charset, "charset");
        return new String(readBytes(url), charset);
    }

    private static final StringReader reader(String str) {
        s.checkNotNullParameter(str, "<this>");
        return new StringReader(str);
    }

    public static final <T> T useLines(Reader reader, l block) {
        s.checkNotNullParameter(reader, "<this>");
        s.checkNotNullParameter(block, "block");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            T t7 = (T) block.invoke(lineSequence(bufferedReader));
            r.finallyStart(1);
            b.closeFinally(bufferedReader, null);
            r.finallyEnd(1);
            return t7;
        } finally {
        }
    }

    private static final BufferedWriter buffered(Writer writer, int i8) {
        s.checkNotNullParameter(writer, "<this>");
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i8);
    }

    static /* synthetic */ BufferedWriter buffered$default(Writer writer, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = 8192;
        }
        s.checkNotNullParameter(writer, "<this>");
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i8);
    }

    private static final String readText(URL url, Charset charset) {
        s.checkNotNullParameter(url, "<this>");
        s.checkNotNullParameter(charset, "charset");
        return new String(readBytes(url), charset);
    }
}
