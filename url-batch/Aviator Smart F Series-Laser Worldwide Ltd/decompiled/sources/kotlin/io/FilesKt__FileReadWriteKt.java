package kotlin.io;

import f6.l;
import f6.p;
import j6.v;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.k;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import y5.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class FilesKt__FileReadWriteKt extends h {
    public static final void appendBytes(File file, byte[] array) {
        s.checkNotNullParameter(file, "<this>");
        s.checkNotNullParameter(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            fileOutputStream.write(array);
            w wVar = w.INSTANCE;
            b.closeFinally(fileOutputStream, null);
        } finally {
        }
    }

    public static final void appendText(File file, String text, Charset charset) {
        s.checkNotNullParameter(file, "<this>");
        s.checkNotNullParameter(text, "text");
        s.checkNotNullParameter(charset, "charset");
        byte[] bytes = text.getBytes(charset);
        s.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        appendBytes(file, bytes);
    }

    public static /* synthetic */ void appendText$default(File file, String str, Charset charset, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            charset = kotlin.text.d.UTF_8;
        }
        appendText(file, str, charset);
    }

    private static final BufferedReader bufferedReader(File file, Charset charset, int i8) {
        s.checkNotNullParameter(file, "<this>");
        s.checkNotNullParameter(charset, "charset");
        Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, i8);
    }

    static /* synthetic */ BufferedReader bufferedReader$default(File file, Charset charset, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            charset = kotlin.text.d.UTF_8;
        }
        if ((i9 & 2) != 0) {
            i8 = 8192;
        }
        s.checkNotNullParameter(file, "<this>");
        s.checkNotNullParameter(charset, "charset");
        Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, i8);
    }

    private static final BufferedWriter bufferedWriter(File file, Charset charset, int i8) {
        s.checkNotNullParameter(file, "<this>");
        s.checkNotNullParameter(charset, "charset");
        Writer outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, i8);
    }

    static /* synthetic */ BufferedWriter bufferedWriter$default(File file, Charset charset, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            charset = kotlin.text.d.UTF_8;
        }
        if ((i9 & 2) != 0) {
            i8 = 8192;
        }
        s.checkNotNullParameter(file, "<this>");
        s.checkNotNullParameter(charset, "charset");
        Writer outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, i8);
    }

    public static final void forEachBlock(File file, p action) {
        s.checkNotNullParameter(file, "<this>");
        s.checkNotNullParameter(action, "action");
        forEachBlock(file, 4096, action);
    }

    public static final void forEachLine(File file, Charset charset, l action) {
        s.checkNotNullParameter(file, "<this>");
        s.checkNotNullParameter(charset, "charset");
        s.checkNotNullParameter(action, "action");
        TextStreamsKt.forEachLine(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), action);
    }

    public static /* synthetic */ void forEachLine$default(File file, Charset charset, l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charset = kotlin.text.d.UTF_8;
        }
        forEachLine(file, charset, lVar);
    }

    private static final FileInputStream inputStream(File file) {
        s.checkNotNullParameter(file, "<this>");
        return new FileInputStream(file);
    }

    private static final FileOutputStream outputStream(File file) {
        s.checkNotNullParameter(file, "<this>");
        return new FileOutputStream(file);
    }

    private static final PrintWriter printWriter(File file, Charset charset) {
        s.checkNotNullParameter(file, "<this>");
        s.checkNotNullParameter(charset, "charset");
        Writer outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return new PrintWriter(outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192));
    }

    static /* synthetic */ PrintWriter printWriter$default(File file, Charset charset, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charset = kotlin.text.d.UTF_8;
        }
        s.checkNotNullParameter(file, "<this>");
        s.checkNotNullParameter(charset, "charset");
        Writer outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return new PrintWriter(outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192));
    }

    public static byte[] readBytes(File file) {
        s.checkNotNullParameter(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i8 = (int) length;
            byte[] bArr = new byte[i8];
            int i9 = i8;
            int i10 = 0;
            while (i9 > 0) {
                int read = fileInputStream.read(bArr, i10, i9);
                if (read < 0) {
                    break;
                }
                i9 -= read;
                i10 += read;
            }
            if (i9 > 0) {
                bArr = Arrays.copyOf(bArr, i10);
                s.checkNotNullExpressionValue(bArr, "copyOf(this, newSize)");
            } else {
                int read2 = fileInputStream.read();
                if (read2 != -1) {
                    d dVar = new d(8193);
                    dVar.write(read2);
                    a.copyTo$default(fileInputStream, dVar, 0, 2, null);
                    int size = dVar.size() + i8;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] buffer = dVar.getBuffer();
                    byte[] copyOf = Arrays.copyOf(bArr, size);
                    s.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                    bArr = k.copyInto(buffer, copyOf, i8, 0, dVar.size());
                }
            }
            b.closeFinally(fileInputStream, null);
            return bArr;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                b.closeFinally(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static final List<String> readLines(File file, Charset charset) {
        s.checkNotNullParameter(file, "<this>");
        s.checkNotNullParameter(charset, "charset");
        final ArrayList arrayList = new ArrayList();
        forEachLine(file, charset, new l() { // from class: kotlin.io.FilesKt__FileReadWriteKt$readLines$1
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

    public static /* synthetic */ List readLines$default(File file, Charset charset, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charset = kotlin.text.d.UTF_8;
        }
        return readLines(file, charset);
    }

    public static final String readText(File file, Charset charset) {
        s.checkNotNullParameter(file, "<this>");
        s.checkNotNullParameter(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String readText = TextStreamsKt.readText(inputStreamReader);
            b.closeFinally(inputStreamReader, null);
            return readText;
        } finally {
        }
    }

    public static /* synthetic */ String readText$default(File file, Charset charset, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charset = kotlin.text.d.UTF_8;
        }
        return readText(file, charset);
    }

    private static final InputStreamReader reader(File file, Charset charset) {
        s.checkNotNullParameter(file, "<this>");
        s.checkNotNullParameter(charset, "charset");
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    static /* synthetic */ InputStreamReader reader$default(File file, Charset charset, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charset = kotlin.text.d.UTF_8;
        }
        s.checkNotNullParameter(file, "<this>");
        s.checkNotNullParameter(charset, "charset");
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    public static final <T> T useLines(File file, Charset charset, l block) {
        s.checkNotNullParameter(file, "<this>");
        s.checkNotNullParameter(charset, "charset");
        s.checkNotNullParameter(block, "block");
        Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        try {
            T t7 = (T) block.invoke(TextStreamsKt.lineSequence(bufferedReader));
            r.finallyStart(1);
            b.closeFinally(bufferedReader, null);
            r.finallyEnd(1);
            return t7;
        } finally {
        }
    }

    public static /* synthetic */ Object useLines$default(File file, Charset charset, l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charset = kotlin.text.d.UTF_8;
        }
        Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        try {
            Object invoke = lVar.invoke(TextStreamsKt.lineSequence(bufferedReader));
            r.finallyStart(1);
            b.closeFinally(bufferedReader, null);
            r.finallyEnd(1);
            return invoke;
        } finally {
        }
    }

    public static final void writeBytes(File file, byte[] array) {
        s.checkNotNullParameter(file, "<this>");
        s.checkNotNullParameter(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            w wVar = w.INSTANCE;
            b.closeFinally(fileOutputStream, null);
        } finally {
        }
    }

    public static final void writeText(File file, String text, Charset charset) {
        s.checkNotNullParameter(file, "<this>");
        s.checkNotNullParameter(text, "text");
        s.checkNotNullParameter(charset, "charset");
        byte[] bytes = text.getBytes(charset);
        s.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        writeBytes(file, bytes);
    }

    public static /* synthetic */ void writeText$default(File file, String str, Charset charset, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            charset = kotlin.text.d.UTF_8;
        }
        writeText(file, str, charset);
    }

    private static final OutputStreamWriter writer(File file, Charset charset) {
        s.checkNotNullParameter(file, "<this>");
        s.checkNotNullParameter(charset, "charset");
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    static /* synthetic */ OutputStreamWriter writer$default(File file, Charset charset, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charset = kotlin.text.d.UTF_8;
        }
        s.checkNotNullParameter(file, "<this>");
        s.checkNotNullParameter(charset, "charset");
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    public static final void forEachBlock(File file, int i8, p action) {
        int coerceAtLeast;
        s.checkNotNullParameter(file, "<this>");
        s.checkNotNullParameter(action, "action");
        coerceAtLeast = v.coerceAtLeast(i8, 512);
        byte[] bArr = new byte[coerceAtLeast];
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    w wVar = w.INSTANCE;
                    b.closeFinally(fileInputStream, null);
                    return;
                }
                action.invoke(bArr, Integer.valueOf(read));
            } finally {
            }
        }
    }
}
