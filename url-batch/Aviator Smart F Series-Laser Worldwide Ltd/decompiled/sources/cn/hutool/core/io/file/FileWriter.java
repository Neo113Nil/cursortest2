package cn.hutool.core.io.file;

import cn.hutool.core.io.IORuntimeException;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Map;

/* loaded from: classes.dex */
public class FileWriter extends FileWrapper {
    private static final long serialVersionUID = 1;

    public FileWriter(File file, Charset charset) {
        super(file, charset);
        checkFile();
    }

    private void checkFile() {
        cn.hutool.core.lang.q.notNull(this.file, "File to write content is null !", new Object[0]);
        if (this.file.exists() && !this.file.isFile()) {
            throw new IORuntimeException("File [{}] is not a file !", this.file.getAbsoluteFile());
        }
    }

    public static FileWriter create(File file, Charset charset) {
        return new FileWriter(file, charset);
    }

    private void printNewLine(PrintWriter printWriter, LineSeparator lineSeparator) {
        if (lineSeparator == null) {
            printWriter.println();
        } else {
            printWriter.print(lineSeparator.getValue());
        }
    }

    public File append(String str) {
        return write(str, true);
    }

    public <T> File appendLines(Iterable<T> iterable) {
        return writeLines(iterable, true);
    }

    public BufferedOutputStream getOutputStream() {
        Path path;
        OutputStream newOutputStream;
        try {
            path = cn.hutool.core.io.l.touch(this.file).toPath();
            newOutputStream = Files.newOutputStream(path, new OpenOption[0]);
            return new BufferedOutputStream(newOutputStream);
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public PrintWriter getPrintWriter(boolean z7) {
        return new PrintWriter(getWriter(z7));
    }

    public BufferedWriter getWriter(boolean z7) {
        try {
            return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(cn.hutool.core.io.l.touch(this.file), z7), this.charset));
        } catch (Exception e8) {
            throw new IORuntimeException(e8);
        }
    }

    public File write(String str, boolean z7) {
        BufferedWriter bufferedWriter = null;
        try {
            try {
                bufferedWriter = getWriter(z7);
                bufferedWriter.write(str);
                bufferedWriter.flush();
                cn.hutool.core.io.n.close((Closeable) bufferedWriter);
                return this.file;
            } catch (IOException e8) {
                throw new IORuntimeException(e8);
            }
        } catch (Throwable th) {
            cn.hutool.core.io.n.close((Closeable) bufferedWriter);
            throw th;
        }
    }

    public File writeFromStream(InputStream inputStream) {
        return writeFromStream(inputStream, true);
    }

    public <T> File writeLines(Iterable<T> iterable) {
        return writeLines(iterable, false);
    }

    public File writeMap(Map<?, ?> map, String str, boolean z7) {
        return writeMap(map, null, str, z7);
    }

    public static FileWriter create(File file) {
        return new FileWriter(file);
    }

    public File append(byte[] bArr, int i8, int i9) {
        return write(bArr, i8, i9, true);
    }

    public File writeFromStream(InputStream inputStream, boolean z7) {
        Path path;
        OutputStream outputStream = null;
        try {
            try {
                path = cn.hutool.core.io.l.touch(this.file).toPath();
                outputStream = Files.newOutputStream(path, new OpenOption[0]);
                cn.hutool.core.io.n.copy(inputStream, outputStream);
                return this.file;
            } catch (IOException e8) {
                throw new IORuntimeException(e8);
            }
        } finally {
            cn.hutool.core.io.n.close((Closeable) outputStream);
            if (z7) {
                cn.hutool.core.io.n.close((Closeable) inputStream);
            }
        }
    }

    public <T> File writeLines(Iterable<T> iterable, boolean z7) {
        return writeLines(iterable, null, z7);
    }

    public File writeMap(Map<?, ?> map, LineSeparator lineSeparator, String str, boolean z7) {
        if (str == null) {
            str = " = ";
        }
        PrintWriter printWriter = getPrintWriter(z7);
        try {
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                if (entry != null) {
                    printWriter.print(cn.hutool.core.text.l.format("{}{}{}", entry.getKey(), str, entry.getValue()));
                    printNewLine(printWriter, lineSeparator);
                    printWriter.flush();
                }
            }
            if (printWriter != null) {
                printWriter.close();
            }
            return this.file;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (printWriter != null) {
                    try {
                        printWriter.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public FileWriter(File file, String str) {
        this(file, cn.hutool.core.util.l.charset(str));
    }

    public <T> File writeLines(Iterable<T> iterable, LineSeparator lineSeparator, boolean z7) {
        PrintWriter printWriter = getPrintWriter(z7);
        try {
            boolean z8 = true;
            for (T t7 : iterable) {
                if (t7 != null) {
                    if (z8) {
                        if (z7 && cn.hutool.core.io.l.isNotEmpty(this.file)) {
                            printNewLine(printWriter, lineSeparator);
                        }
                        z8 = false;
                    } else {
                        printNewLine(printWriter, lineSeparator);
                    }
                    printWriter.print(t7);
                    printWriter.flush();
                }
            }
            if (printWriter != null) {
                printWriter.close();
            }
            return this.file;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (printWriter != null) {
                    try {
                        printWriter.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public FileWriter(String str, Charset charset) {
        this(cn.hutool.core.io.l.file(str), charset);
    }

    public FileWriter(String str, String str2) {
        this(cn.hutool.core.io.l.file(str), cn.hutool.core.util.l.charset(str2));
    }

    public FileWriter(File file) {
        this(file, FileWrapper.DEFAULT_CHARSET);
    }

    public FileWriter(String str) {
        this(str, FileWrapper.DEFAULT_CHARSET);
    }

    public File write(String str) {
        return write(str, false);
    }

    public File write(byte[] bArr, int i8, int i9) {
        return write(bArr, i8, i9, false);
    }

    public File write(byte[] bArr, int i8, int i9, boolean z7) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(cn.hutool.core.io.l.touch(this.file), z7);
            try {
                fileOutputStream.write(bArr, i8, i9);
                fileOutputStream.flush();
                fileOutputStream.close();
                return this.file;
            } finally {
            }
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }
}
