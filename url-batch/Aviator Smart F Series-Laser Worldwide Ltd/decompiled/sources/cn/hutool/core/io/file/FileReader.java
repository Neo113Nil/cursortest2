package cn.hutool.core.io.file;

import cn.hutool.core.io.IORuntimeException;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public class FileReader extends FileWrapper {
    private static final long serialVersionUID = 1;

    public interface a {
        Object a(BufferedReader bufferedReader);
    }

    public FileReader(File file, Charset charset) {
        super(file, charset);
        checkFile();
    }

    private void checkFile() {
        if (!this.file.exists()) {
            throw new IORuntimeException("File not exist: " + this.file);
        }
        if (this.file.isFile()) {
            return;
        }
        throw new IORuntimeException("Not a file:" + this.file);
    }

    public static FileReader create(File file, Charset charset) {
        return new FileReader(file, charset);
    }

    public BufferedInputStream getInputStream() {
        try {
            return new BufferedInputStream(new FileInputStream(this.file));
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public BufferedReader getReader() {
        return cn.hutool.core.io.n.getReader(getInputStream(), this.charset);
    }

    public <T> T read(a aVar) {
        BufferedReader bufferedReader = null;
        try {
            try {
                bufferedReader = cn.hutool.core.io.l.getReader(this.file, this.charset);
                return (T) aVar.a(bufferedReader);
            } catch (IOException e8) {
                throw new IORuntimeException(e8);
            }
        } finally {
            cn.hutool.core.io.n.close((Closeable) bufferedReader);
        }
    }

    public byte[] readBytes() {
        FileInputStream fileInputStream;
        long length = this.file.length();
        if (length >= 2147483647L) {
            throw new IORuntimeException("File is larger then max array size");
        }
        byte[] bArr = new byte[(int) length];
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(this.file);
            } catch (Exception e8) {
                e = e8;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            int read = fileInputStream.read(bArr);
            if (read < length) {
                throw new IOException(cn.hutool.core.text.l.format("File length is [{}] but read [{}]!", Long.valueOf(length), Integer.valueOf(read)));
            }
            cn.hutool.core.io.n.close((Closeable) fileInputStream);
            return bArr;
        } catch (Exception e9) {
            e = e9;
            fileInputStream2 = fileInputStream;
            throw new IORuntimeException(e);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            cn.hutool.core.io.n.close((Closeable) fileInputStream2);
            throw th;
        }
    }

    public <T extends Collection<String>> T readLines(T t7) {
        BufferedReader bufferedReader = null;
        try {
            try {
                bufferedReader = cn.hutool.core.io.l.getReader(this.file, this.charset);
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        return t7;
                    }
                    t7.add(readLine);
                }
            } catch (IOException e8) {
                throw new IORuntimeException(e8);
            }
        } finally {
            cn.hutool.core.io.n.close((Closeable) bufferedReader);
        }
    }

    public String readString() {
        return new String(readBytes(), this.charset);
    }

    public long writeToStream(OutputStream outputStream) {
        return writeToStream(outputStream, false);
    }

    public static FileReader create(File file) {
        return new FileReader(file);
    }

    public long writeToStream(OutputStream outputStream, boolean z7) {
        try {
            try {
                FileInputStream fileInputStream = new FileInputStream(this.file);
                try {
                    long copy = cn.hutool.core.io.n.copy(fileInputStream, outputStream);
                    fileInputStream.close();
                    return copy;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            } catch (IOException e8) {
                throw new IORuntimeException(e8);
            }
        } finally {
            if (z7) {
                cn.hutool.core.io.n.close((Closeable) outputStream);
            }
        }
    }

    public FileReader(File file, String str) {
        this(file, cn.hutool.core.util.l.charset(str));
    }

    public FileReader(String str, Charset charset) {
        this(cn.hutool.core.io.l.file(str), charset);
    }

    public FileReader(String str, String str2) {
        this(cn.hutool.core.io.l.file(str), cn.hutool.core.util.l.charset(str2));
    }

    public FileReader(File file) {
        this(file, FileWrapper.DEFAULT_CHARSET);
    }

    public FileReader(String str) {
        this(str, FileWrapper.DEFAULT_CHARSET);
    }

    public void readLines(cn.hutool.core.io.p pVar) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = cn.hutool.core.io.l.getReader(this.file, this.charset);
            cn.hutool.core.io.n.readLines(bufferedReader, pVar);
        } finally {
            cn.hutool.core.io.n.close((Closeable) bufferedReader);
        }
    }

    public List<String> readLines() {
        return (List) readLines((FileReader) new ArrayList());
    }
}
