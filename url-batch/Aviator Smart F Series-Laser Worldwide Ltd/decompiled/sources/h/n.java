package h;

import cn.hutool.core.io.IORuntimeException;
import cn.hutool.core.util.n1;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* loaded from: classes.dex */
public class n implements Closeable {
    private final ZipOutputStream out;

    public n(File file, Charset charset) {
        this.out = getZipOutputStream(file, charset);
    }

    private n _add(File file, String str, FileFilter fileFilter) {
        if (file != null && (fileFilter == null || fileFilter.accept(file))) {
            String subPath = cn.hutool.core.io.l.subPath(str, file);
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (cn.hutool.core.util.h.isEmpty((Object[]) listFiles)) {
                    add(subPath, (InputStream) null);
                } else {
                    for (File file2 : listFiles) {
                        _add(file2, str, fileFilter);
                    }
                }
            } else {
                putEntry(subPath, cn.hutool.core.io.l.getInputStream(file));
            }
        }
        return this;
    }

    private static ZipOutputStream getZipOutputStream(File file, Charset charset) {
        return n1.getZipOutputStream(cn.hutool.core.io.l.getOutputStream(file), charset);
    }

    public static n of(File file, Charset charset) {
        return new n(file, charset);
    }

    private n putEntry(String str, InputStream inputStream) {
        try {
            try {
                this.out.putNextEntry(new ZipEntry(str));
                if (inputStream != null) {
                    cn.hutool.core.io.n.copy(inputStream, this.out);
                }
                this.out.closeEntry();
                cn.hutool.core.io.n.close((Closeable) inputStream);
                cn.hutool.core.io.n.flush(this.out);
                return this;
            } catch (IOException e8) {
                throw new IORuntimeException(e8);
            }
        } catch (Throwable th) {
            cn.hutool.core.io.n.close((Closeable) inputStream);
            throw th;
        }
    }

    public n add(boolean z7, FileFilter fileFilter, File... fileArr) {
        for (File file : fileArr) {
            try {
                String canonicalPath = file.getCanonicalPath();
                if (!file.isDirectory() || z7) {
                    canonicalPath = file.getCanonicalFile().getParentFile().getCanonicalPath();
                }
                _add(file, canonicalPath, fileFilter);
            } catch (IOException e8) {
                throw new IORuntimeException(e8);
            }
        }
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            try {
                this.out.finish();
            } catch (IOException e8) {
                throw new IORuntimeException(e8);
            }
        } finally {
            cn.hutool.core.io.n.close((Closeable) this.out);
        }
    }

    public ZipOutputStream getOut() {
        return this.out;
    }

    public n setComment(String str) {
        this.out.setComment(str);
        return this;
    }

    public n setLevel(int i8) {
        this.out.setLevel(i8);
        return this;
    }

    public static n of(OutputStream outputStream, Charset charset) {
        return new n(outputStream, charset);
    }

    public n(OutputStream outputStream, Charset charset) {
        this.out = n1.getZipOutputStream(outputStream, charset);
    }

    public n(ZipOutputStream zipOutputStream) {
        this.out = zipOutputStream;
    }

    public n add(cn.hutool.core.io.resource.d... dVarArr) {
        for (cn.hutool.core.io.resource.d dVar : dVarArr) {
            if (dVar != null) {
                add(dVar.getName(), dVar.getStream());
            }
        }
        return this;
    }

    public n add(String str, InputStream inputStream) {
        String nullToEmpty = cn.hutool.core.text.l.nullToEmpty(str);
        if (inputStream == null) {
            nullToEmpty = cn.hutool.core.text.l.addSuffixIfNot(nullToEmpty, "/");
            if (cn.hutool.core.text.l.isBlank(nullToEmpty)) {
                return this;
            }
        }
        return putEntry(nullToEmpty, inputStream);
    }

    public n add(String[] strArr, InputStream[] inputStreamArr) {
        if (!cn.hutool.core.util.h.isEmpty((Object[]) strArr) && !cn.hutool.core.util.h.isEmpty((Object[]) inputStreamArr)) {
            if (strArr.length == inputStreamArr.length) {
                for (int i8 = 0; i8 < strArr.length; i8++) {
                    add(strArr[i8], inputStreamArr[i8]);
                }
                return this;
            }
            throw new IllegalArgumentException("Paths length is not equals to ins length !");
        }
        throw new IllegalArgumentException("Paths or ins is empty !");
    }
}
