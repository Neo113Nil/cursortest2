package h;

import cn.hutool.core.exceptions.UtilException;
import cn.hutool.core.io.IORuntimeException;
import cn.hutool.core.lang.a0;
import cn.hutool.core.util.n1;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Enumeration;
import java.util.function.Consumer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/* loaded from: classes.dex */
public class m implements Closeable {
    private static final int DEFAULT_MAX_SIZE_DIFF = 100;
    private ZipInputStream in;
    private int maxSizeDiff = 100;
    private ZipFile zipFile;

    public m(File file, Charset charset) {
        this.zipFile = n1.toZipFile(file, charset);
    }

    private ZipEntry checkZipBomb(ZipEntry zipEntry) {
        if (this.maxSizeDiff < 0) {
            return zipEntry;
        }
        if (zipEntry == null) {
            return null;
        }
        long compressedSize = zipEntry.getCompressedSize();
        long size = zipEntry.getSize();
        if (compressedSize < 0 || size < 0 || this.maxSizeDiff * compressedSize < size) {
            throw new UtilException("Zip bomb attack detected, invalid sizes: compressed {}, uncompressed {}, name {}", Long.valueOf(compressedSize), Long.valueOf(size), zipEntry.getName());
        }
        return zipEntry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$readTo$0(a0 a0Var, File file, ZipEntry zipEntry) {
        if (a0Var == null || a0Var.accept(zipEntry)) {
            String name = zipEntry.getName();
            if (cn.hutool.core.io.l.isWindows()) {
                name = cn.hutool.core.text.l.replace(name, "*", "_");
            }
            File file2 = cn.hutool.core.io.l.file(file, name);
            if (zipEntry.isDirectory()) {
                file2.mkdirs();
            } else {
                ZipFile zipFile = this.zipFile;
                cn.hutool.core.io.l.writeFromStream(zipFile != null ? n1.getStream(zipFile, zipEntry) : this.in, file2, false);
            }
        }
    }

    public static m of(File file, Charset charset) {
        return new m(file, charset);
    }

    private void readFromStream(Consumer<ZipEntry> consumer) {
        while (true) {
            try {
                ZipEntry nextEntry = this.in.getNextEntry();
                if (nextEntry == null) {
                    return;
                }
                consumer.accept(nextEntry);
                checkZipBomb(nextEntry);
            } catch (IOException e8) {
                throw new IORuntimeException(e8);
            }
        }
    }

    private void readFromZipFile(Consumer<ZipEntry> consumer) {
        Enumeration<? extends ZipEntry> entries = this.zipFile.entries();
        while (entries.hasMoreElements()) {
            consumer.accept(checkZipBomb(entries.nextElement()));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ZipFile zipFile = this.zipFile;
        if (zipFile != null) {
            cn.hutool.core.io.n.close((Closeable) zipFile);
        } else {
            cn.hutool.core.io.n.close((Closeable) this.in);
        }
    }

    public InputStream get(String str) {
        ZipEntry nextEntry;
        ZipFile zipFile = this.zipFile;
        if (zipFile != null) {
            ZipEntry entry = zipFile.getEntry(str);
            if (entry != null) {
                return n1.getStream(zipFile, entry);
            }
            return null;
        }
        do {
            try {
                nextEntry = this.in.getNextEntry();
                if (nextEntry == null) {
                    return null;
                }
            } catch (IOException e8) {
                throw new IORuntimeException(e8);
            }
        } while (!nextEntry.getName().equals(str));
        return this.in;
    }

    public m read(Consumer<ZipEntry> consumer) {
        if (this.zipFile != null) {
            readFromZipFile(consumer);
        } else {
            readFromStream(consumer);
        }
        return this;
    }

    public File readTo(File file) {
        return readTo(file, null);
    }

    public m setMaxSizeDiff(int i8) {
        this.maxSizeDiff = i8;
        return this;
    }

    public static m of(InputStream inputStream, Charset charset) {
        return new m(inputStream, charset);
    }

    public File readTo(final File file, final a0 a0Var) {
        read(new Consumer() { // from class: h.l
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                m.this.lambda$readTo$0(a0Var, file, (ZipEntry) obj);
            }
        });
        return file;
    }

    public m(ZipFile zipFile) {
        this.zipFile = zipFile;
    }

    public m(InputStream inputStream, Charset charset) {
        this.in = k.a(inputStream, charset);
    }

    public m(ZipInputStream zipInputStream) {
        this.in = zipInputStream;
    }
}
