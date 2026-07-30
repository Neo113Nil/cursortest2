package cn.hutool.core.io;

import cn.hutool.core.collection.LineIter;
import cn.hutool.core.exceptions.UtilException;
import cn.hutool.core.util.c1;
import cn.hutool.core.util.z;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PushbackInputStream;
import java.io.PushbackReader;
import java.io.Reader;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;

/* loaded from: classes.dex */
public class n extends q {
    public static Checksum checksum(InputStream inputStream, Checksum checksum) {
        InputStream inputStream2;
        Throwable th;
        cn.hutool.core.lang.q.notNull(inputStream, "InputStream is null !", new Object[0]);
        if (checksum == null) {
            checksum = new CRC32();
        }
        try {
            inputStream2 = new CheckedInputStream(inputStream, checksum);
            try {
                copy(inputStream2, new r());
                close((Closeable) inputStream2);
                return checksum;
            } catch (Throwable th2) {
                th = th2;
                close((Closeable) inputStream2);
                throw th;
            }
        } catch (Throwable th3) {
            inputStream2 = inputStream;
            th = th3;
        }
    }

    public static long checksumCRC32(InputStream inputStream) {
        return checksum(inputStream, new CRC32()).getValue();
    }

    public static long checksumValue(InputStream inputStream, Checksum checksum) {
        return checksum(inputStream, checksum).getValue();
    }

    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void closeIfPosible(Object obj) {
        if (obj instanceof AutoCloseable) {
            q.close((AutoCloseable) obj);
        }
    }

    public static boolean contentEquals(InputStream inputStream, InputStream inputStream2) {
        if (!(inputStream instanceof BufferedInputStream)) {
            inputStream = new BufferedInputStream(inputStream);
        }
        if (!(inputStream2 instanceof BufferedInputStream)) {
            inputStream2 = new BufferedInputStream(inputStream2);
        }
        try {
            for (int read = inputStream.read(); -1 != read; read = inputStream.read()) {
                if (read != inputStream2.read()) {
                    return false;
                }
            }
            return inputStream2.read() == -1;
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static boolean contentEqualsIgnoreEOL(Reader reader, Reader reader2) {
        BufferedReader reader3 = getReader(reader);
        BufferedReader reader4 = getReader(reader2);
        try {
            String readLine = reader3.readLine();
            String readLine2 = reader4.readLine();
            while (readLine != null && readLine.equals(readLine2)) {
                readLine = reader3.readLine();
                readLine2 = reader4.readLine();
            }
            return Objects.equals(readLine, readLine2);
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static long copy(Reader reader, Writer writer) {
        return copy(reader, writer, 8192);
    }

    public static void flush(Flushable flushable) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (Exception unused) {
            }
        }
    }

    public static b getBomReader(InputStream inputStream) {
        return new b(inputStream);
    }

    public static PushbackReader getPushBackReader(Reader reader, int i8) {
        return reader instanceof PushbackReader ? (PushbackReader) reader : new PushbackReader(reader, i8);
    }

    @Deprecated
    public static BufferedReader getReader(InputStream inputStream, String str) {
        return getReader(inputStream, Charset.forName(str));
    }

    public static BufferedReader getUtf8Reader(InputStream inputStream) {
        return getReader(inputStream, cn.hutool.core.util.l.CHARSET_UTF_8);
    }

    public static OutputStreamWriter getUtf8Writer(OutputStream outputStream) {
        return getWriter(outputStream, cn.hutool.core.util.l.CHARSET_UTF_8);
    }

    @Deprecated
    public static OutputStreamWriter getWriter(OutputStream outputStream, String str) {
        return getWriter(outputStream, Charset.forName(str));
    }

    public static LineIter lineIter(Reader reader) {
        return new LineIter(reader);
    }

    @Deprecated
    public static String read(InputStream inputStream, String str) {
        d read = read(inputStream);
        return cn.hutool.core.text.l.isBlank(str) ? read.toString() : read.toString(str);
    }

    public static byte[] readBytes(InputStream inputStream) {
        return readBytes(inputStream, true);
    }

    public static String readHex(InputStream inputStream, int i8, boolean z7) {
        return z.encodeHexStr(readBytes(inputStream, i8), z7);
    }

    public static String readHex64Lower(InputStream inputStream) {
        return readHex(inputStream, 64, true);
    }

    public static String readHex64Upper(InputStream inputStream) {
        return readHex(inputStream, 64, false);
    }

    public static String readHex8192Upper(InputStream inputStream) {
        try {
            inputStream.available();
            return readHex(inputStream, Math.min(8192, inputStream.available()), false);
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    @Deprecated
    public static <T extends Collection<String>> T readLines(InputStream inputStream, String str, T t7) {
        return (T) readLines(inputStream, cn.hutool.core.util.l.charset(str), t7);
    }

    public static <T> T readObj(InputStream inputStream) {
        return (T) readObj(inputStream, (Class) null);
    }

    public static String readUtf8(InputStream inputStream) {
        return read(inputStream, cn.hutool.core.util.l.CHARSET_UTF_8);
    }

    public static <T extends Collection<String>> T readUtf8Lines(InputStream inputStream, T t7) {
        return (T) readLines(inputStream, cn.hutool.core.util.l.CHARSET_UTF_8, t7);
    }

    public static InputStream toAvailableStream(InputStream inputStream) {
        if (inputStream instanceof FileInputStream) {
            return inputStream;
        }
        PushbackInputStream pushbackStream = toPushbackStream(inputStream, 1);
        try {
            if (pushbackStream.available() <= 0) {
                pushbackStream.unread(pushbackStream.read());
            }
            return pushbackStream;
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static BufferedInputStream toBuffered(InputStream inputStream) {
        cn.hutool.core.lang.q.notNull(inputStream, "InputStream must be not null!", new Object[0]);
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream);
    }

    public static InputStream toMarkSupportStream(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        return !inputStream.markSupported() ? new BufferedInputStream(inputStream) : inputStream;
    }

    public static PushbackInputStream toPushbackStream(InputStream inputStream, int i8) {
        return inputStream instanceof PushbackInputStream ? (PushbackInputStream) inputStream : new PushbackInputStream(inputStream, i8);
    }

    public static String toStr(ByteArrayOutputStream byteArrayOutputStream, Charset charset) {
        try {
            return byteArrayOutputStream.toString(charset.name());
        } catch (UnsupportedEncodingException e8) {
            throw new IORuntimeException(e8);
        }
    }

    @Deprecated
    public static ByteArrayInputStream toStream(String str, String str2) {
        return toStream(str, cn.hutool.core.util.l.charset(str2));
    }

    public static ByteArrayInputStream toUtf8Stream(String str) {
        return toStream(str, cn.hutool.core.util.l.CHARSET_UTF_8);
    }

    public static void write(OutputStream outputStream, boolean z7, byte[] bArr) {
        try {
            try {
                outputStream.write(bArr);
            } catch (IOException e8) {
                throw new IORuntimeException(e8);
            }
        } finally {
            if (z7) {
                close((Closeable) outputStream);
            }
        }
    }

    public static void writeObj(OutputStream outputStream, boolean z7, Serializable serializable) {
        writeObjects(outputStream, z7, serializable);
    }

    public static void writeObjects(OutputStream outputStream, boolean z7, Serializable... serializableArr) {
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                objectOutputStream = outputStream instanceof ObjectOutputStream ? (ObjectOutputStream) outputStream : new ObjectOutputStream(outputStream);
                for (Serializable serializable : serializableArr) {
                    if (serializable != null) {
                        objectOutputStream.writeObject(serializable);
                    }
                }
                objectOutputStream.flush();
                if (z7) {
                    close((Closeable) objectOutputStream);
                }
            } catch (IOException e8) {
                throw new IORuntimeException(e8);
            }
        } catch (Throwable th) {
            if (z7) {
                close((Closeable) objectOutputStream);
            }
            throw th;
        }
    }

    public static void writeUtf8(OutputStream outputStream, boolean z7, Object... objArr) {
        write(outputStream, cn.hutool.core.util.l.CHARSET_UTF_8, z7, objArr);
    }

    public static long copy(Reader reader, Writer writer, int i8) {
        return copy(reader, writer, i8, (s) null);
    }

    public static BufferedReader getReader(a aVar) {
        return getReader(aVar, aVar.getCharset());
    }

    public static OutputStreamWriter getWriter(OutputStream outputStream, Charset charset) {
        if (outputStream == null) {
            return null;
        }
        return charset == null ? new OutputStreamWriter(outputStream) : new OutputStreamWriter(outputStream, charset);
    }

    public static LineIter lineIter(InputStream inputStream, Charset charset) {
        return new LineIter(inputStream, charset);
    }

    public static byte[] readBytes(InputStream inputStream, boolean z7) {
        return read(inputStream, z7).toByteArray();
    }

    public static <T extends Collection<String>> T readLines(InputStream inputStream, Charset charset, T t7) {
        return (T) readLines(getReader(inputStream, charset), t7);
    }

    public static <T> T readObj(InputStream inputStream, Class<T> cls) {
        try {
            return (T) readObj(inputStream instanceof t ? (t) inputStream : new t(inputStream, new Class[0]), (Class) cls);
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static void readUtf8Lines(InputStream inputStream, p pVar) {
        readLines(inputStream, cn.hutool.core.util.l.CHARSET_UTF_8, pVar);
    }

    public static ByteArrayInputStream toStream(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        return toStream(cn.hutool.core.text.l.bytes(str, charset));
    }

    public static long copy(Reader reader, Writer writer, int i8, s sVar) {
        return copy(reader, writer, i8, -1L, sVar);
    }

    public static BufferedReader getReader(InputStream inputStream, Charset charset) {
        InputStreamReader inputStreamReader;
        if (inputStream == null) {
            return null;
        }
        if (charset == null) {
            inputStreamReader = new InputStreamReader(inputStream);
        } else {
            inputStreamReader = new InputStreamReader(inputStream, charset);
        }
        return new BufferedReader(inputStreamReader);
    }

    public static String read(InputStream inputStream, Charset charset) {
        return c1.str(readBytes(inputStream), charset);
    }

    public static byte[] readBytes(InputStream inputStream, int i8) {
        if (inputStream == null) {
            return null;
        }
        if (i8 <= 0) {
            return new byte[0];
        }
        d dVar = new d(i8);
        copy(inputStream, dVar, 8192, i8, (s) null);
        return dVar.toByteArray();
    }

    public static <T extends Collection<String>> T readLines(Reader reader, final T t7) {
        t7.getClass();
        readLines(reader, new p() { // from class: cn.hutool.core.io.m
            @Override // cn.hutool.core.io.p
            public final void handle(String str) {
                t7.add(str);
            }
        });
        return t7;
    }

    public static BufferedInputStream toBuffered(InputStream inputStream, int i8) {
        cn.hutool.core.lang.q.notNull(inputStream, "InputStream must be not null!", new Object[0]);
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i8);
    }

    public static FileInputStream toStream(File file) {
        try {
            return new FileInputStream(file);
        } catch (FileNotFoundException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static long copy(Reader reader, Writer writer, int i8, long j8, s sVar) {
        return new cn.hutool.core.io.copy.c(i8, j8, sVar).copy(reader, writer);
    }

    public static d read(InputStream inputStream) {
        return read(inputStream, true);
    }

    public static void readLines(InputStream inputStream, Charset charset, p pVar) {
        readLines(getReader(inputStream, charset), pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T readObj(t tVar, Class<T> cls) {
        if (tVar != 0) {
            if (cls != null) {
                tVar.accept(cls);
            }
            try {
                return (T) tVar.readObject();
            } catch (IOException e8) {
                throw new IORuntimeException(e8);
            } catch (ClassNotFoundException e9) {
                throw new UtilException(e9);
            }
        }
        throw new IllegalArgumentException("The InputStream must not be null");
    }

    public static long copy(InputStream inputStream, OutputStream outputStream) {
        return copy(inputStream, outputStream, 8192);
    }

    public static d read(InputStream inputStream, boolean z7) {
        d dVar;
        if (inputStream instanceof FileInputStream) {
            try {
                dVar = new d(inputStream.available());
            } catch (IOException e8) {
                throw new IORuntimeException(e8);
            }
        } else {
            dVar = new d();
        }
        try {
            copy(inputStream, dVar);
            return dVar;
        } finally {
            if (z7) {
                close((Closeable) inputStream);
            }
        }
    }

    public static void readLines(Reader reader, p pVar) {
        cn.hutool.core.lang.q.notNull(reader);
        cn.hutool.core.lang.q.notNull(pVar);
        Iterator it = lineIter(reader).iterator();
        while (it.hasNext()) {
            pVar.handle((String) it.next());
        }
    }

    public static BufferedOutputStream toBuffered(OutputStream outputStream) {
        cn.hutool.core.lang.q.notNull(outputStream, "OutputStream must be not null!", new Object[0]);
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream);
    }

    public static ByteArrayInputStream toStream(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new ByteArrayInputStream(bArr);
    }

    public static long copy(InputStream inputStream, OutputStream outputStream, int i8) {
        return copy(inputStream, outputStream, i8, (s) null);
    }

    public static BufferedReader getReader(Reader reader) {
        if (reader == null) {
            return null;
        }
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader);
    }

    public static ByteArrayInputStream toStream(ByteArrayOutputStream byteArrayOutputStream) {
        if (byteArrayOutputStream == null) {
            return null;
        }
        return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    }

    @Deprecated
    public static void write(OutputStream outputStream, String str, boolean z7, Object... objArr) {
        write(outputStream, cn.hutool.core.util.l.charset(str), z7, objArr);
    }

    public static long copy(InputStream inputStream, OutputStream outputStream, int i8, s sVar) {
        return copy(inputStream, outputStream, i8, -1L, sVar);
    }

    public static BufferedOutputStream toBuffered(OutputStream outputStream, int i8) {
        cn.hutool.core.lang.q.notNull(outputStream, "OutputStream must be not null!", new Object[0]);
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i8);
    }

    public static void write(OutputStream outputStream, Charset charset, boolean z7, Object... objArr) {
        OutputStreamWriter outputStreamWriter = null;
        try {
            try {
                outputStreamWriter = getWriter(outputStream, charset);
                for (Object obj : objArr) {
                    if (obj != null) {
                        outputStreamWriter.write(cn.hutool.core.convert.d.toStr(obj, ""));
                    }
                }
                outputStreamWriter.flush();
                if (z7) {
                    close((Closeable) outputStreamWriter);
                }
            } catch (IOException e8) {
                throw new IORuntimeException(e8);
            }
        } catch (Throwable th) {
            if (z7) {
                close((Closeable) outputStreamWriter);
            }
            throw th;
        }
    }

    public static long copy(InputStream inputStream, OutputStream outputStream, int i8, long j8, s sVar) {
        return new cn.hutool.core.io.copy.d(i8, j8, sVar).copy(inputStream, outputStream);
    }

    public static long copy(FileInputStream fileInputStream, FileOutputStream fileOutputStream) {
        FileChannel fileChannel;
        cn.hutool.core.lang.q.notNull(fileInputStream, "FileInputStream is null!", new Object[0]);
        cn.hutool.core.lang.q.notNull(fileOutputStream, "FileOutputStream is null!", new Object[0]);
        FileChannel fileChannel2 = null;
        try {
            fileChannel = fileInputStream.getChannel();
            try {
                fileChannel2 = fileOutputStream.getChannel();
                long copy = q.copy(fileChannel, fileChannel2);
                close((Closeable) fileChannel2);
                close((Closeable) fileChannel);
                return copy;
            } catch (Throwable th) {
                th = th;
                close((Closeable) fileChannel2);
                close((Closeable) fileChannel);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileChannel = null;
        }
    }

    public static BufferedReader toBuffered(Reader reader) {
        cn.hutool.core.lang.q.notNull(reader, "Reader must be not null!", new Object[0]);
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader);
    }

    public static boolean contentEquals(Reader reader, Reader reader2) {
        BufferedReader reader3 = getReader(reader);
        BufferedReader reader4 = getReader(reader2);
        try {
            for (int read = reader3.read(); -1 != read; read = reader3.read()) {
                if (read != reader4.read()) {
                    return false;
                }
            }
            return reader4.read() == -1;
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static BufferedReader toBuffered(Reader reader, int i8) {
        cn.hutool.core.lang.q.notNull(reader, "Reader must be not null!", new Object[0]);
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i8);
    }

    public static String read(Reader reader) {
        return read(reader, true);
    }

    public static String read(Reader reader, boolean z7) {
        StringBuilder builder = c1.builder();
        CharBuffer allocate = CharBuffer.allocate(8192);
        while (-1 != reader.read(allocate)) {
            try {
                try {
                    builder.append(allocate.flip());
                } catch (IOException e8) {
                    throw new IORuntimeException(e8);
                }
            } finally {
                if (z7) {
                    close((Closeable) reader);
                }
            }
        }
        return builder.toString();
    }

    public static BufferedWriter toBuffered(Writer writer) {
        cn.hutool.core.lang.q.notNull(writer, "Writer must be not null!", new Object[0]);
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer);
    }

    public static BufferedWriter toBuffered(Writer writer, int i8) {
        cn.hutool.core.lang.q.notNull(writer, "Writer must be not null!", new Object[0]);
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i8);
    }
}
