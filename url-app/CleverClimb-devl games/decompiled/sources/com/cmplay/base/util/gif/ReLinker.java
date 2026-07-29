package com.cmplay.base.util.gif;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
class ReLinker {
    private static final int COPY_BUFFER_SIZE = 8192;
    private static final String LIB_DIR = "lib";
    private static final String MAPPED_BASE_LIB_NAME = System.mapLibraryName("com_cmplay_base_util_gif");
    private static final int MAX_TRIES = 5;

    private ReLinker() {
    }

    @SuppressLint({"UnsafeDynamicallyLoadedCode"})
    static void loadLibrary(Context context) {
        synchronized (ReLinker.class) {
            System.load(unpackLibrary(context).getAbsolutePath());
        }
    }

    private static File unpackLibrary(Context context) {
        ZipFile zipFile;
        Throwable th;
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        String str = MAPPED_BASE_LIB_NAME;
        int i = 0;
        File file = new File(context.getDir(LIB_DIR, 0), str);
        if (file.isFile()) {
            return file;
        }
        File file2 = new File(context.getCacheDir(), str);
        if (file2.isFile()) {
            return file2;
        }
        final String mapLibraryName = System.mapLibraryName("com_cmplay_base_util_gif_surface");
        FilenameFilter filenameFilter = new FilenameFilter() { // from class: com.cmplay.base.util.gif.ReLinker.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file3, String str2) {
                return str2.startsWith(ReLinker.MAPPED_BASE_LIB_NAME) || str2.startsWith(mapLibraryName);
            }
        };
        clearOldLibraryFiles(file, filenameFilter);
        clearOldLibraryFiles(file2, filenameFilter);
        File file3 = new File(context.getApplicationInfo().sourceDir);
        FileOutputStream fileOutputStream2 = null;
        try {
            zipFile = openZipFile(file3);
            while (true) {
                int i2 = i + 1;
                if (i >= 5) {
                    break;
                }
                try {
                    ZipEntry findLibraryEntry = findLibraryEntry(zipFile);
                    if (findLibraryEntry == null) {
                        throw new IllegalStateException("Library " + MAPPED_BASE_LIB_NAME + " for supported ABIs not found in APK file");
                    }
                    try {
                        inputStream = zipFile.getInputStream(findLibraryEntry);
                        try {
                            fileOutputStream = new FileOutputStream(file);
                            try {
                                copy(inputStream, fileOutputStream);
                                closeSilently(inputStream);
                                closeSilently(fileOutputStream);
                                setFilePermissions(file);
                                break;
                            } catch (IOException unused) {
                                if (i2 > 2) {
                                    file = file2;
                                }
                                closeSilently(inputStream);
                                closeSilently(fileOutputStream);
                                i = i2;
                            } catch (Throwable th2) {
                                th = th2;
                                fileOutputStream2 = fileOutputStream;
                                closeSilently(inputStream);
                                closeSilently(fileOutputStream2);
                                throw th;
                            }
                        } catch (IOException unused2) {
                            fileOutputStream = null;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (IOException unused3) {
                        inputStream = null;
                        fileOutputStream = null;
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream = null;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    if (zipFile != null) {
                        try {
                            zipFile.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
                closeSilently(inputStream);
                closeSilently(fileOutputStream);
                i = i2;
            }
            if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (IOException unused5) {
                }
            }
            return file;
        } catch (Throwable th6) {
            zipFile = null;
            th = th6;
        }
    }

    private static ZipEntry findLibraryEntry(ZipFile zipFile) {
        for (String str : getSupportedABIs()) {
            ZipEntry entry = getEntry(zipFile, str);
            if (entry != null) {
                return entry;
            }
        }
        return null;
    }

    private static String[] getSupportedABIs() {
        if (Build.VERSION.SDK_INT >= 21) {
            return Build.SUPPORTED_ABIS;
        }
        return new String[]{Build.CPU_ABI, Build.CPU_ABI2};
    }

    private static ZipEntry getEntry(ZipFile zipFile, String str) {
        return zipFile.getEntry("lib/" + str + "/" + MAPPED_BASE_LIB_NAME);
    }

    private static ZipFile openZipFile(File file) {
        ZipFile zipFile;
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i >= 5) {
                zipFile = null;
                break;
            }
            try {
                zipFile = new ZipFile(file, 1);
                break;
            } catch (IOException unused) {
                i = i2;
            }
        }
        if (zipFile != null) {
            return zipFile;
        }
        throw new IllegalStateException("Could not open APK file: " + file.getAbsolutePath());
    }

    private static void clearOldLibraryFiles(File file, FilenameFilter filenameFilter) {
        File[] listFiles = file.getParentFile().listFiles(filenameFilter);
        if (listFiles != null) {
            for (File file2 : listFiles) {
                file2.delete();
            }
        }
    }

    @SuppressLint({"SetWorldReadable"})
    private static void setFilePermissions(File file) {
        file.setReadable(true, false);
        file.setExecutable(true, false);
        file.setWritable(true);
    }

    private static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    private static void closeSilently(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
