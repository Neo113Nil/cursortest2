package q5;

import android.content.Context;
import android.content.res.AssetManager;
import com.realsil.sdk.core.logger.ZLogger;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes4.dex */
public final class a {
    public static final a INSTANCE = new a();

    public static /* synthetic */ RandomAccessFile createRandomAccessFile$default(a aVar, String str, String str2, boolean z7, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            z7 = false;
        }
        return aVar.createRandomAccessFile(str, str2, z7);
    }

    public static /* synthetic */ String generateFileName$default(a aVar, String str, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = aVar.createTimeStamp();
        }
        return aVar.generateFileName(str, str2);
    }

    public final void appendDataToFile(File file, byte[] data) {
        s.checkNotNullParameter(file, "file");
        s.checkNotNullParameter(data, "data");
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file, true));
            bufferedOutputStream.write(data);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
        } catch (FileNotFoundException e8) {
            ZLogger.w("FileNotFoundException, " + e8);
        } catch (IOException e9) {
            ZLogger.w("pcm file append write error, " + e9);
        }
    }

    public final RandomAccessFile createRandomAccessFile(String dir, String fileName, boolean z7) {
        s.checkNotNullParameter(dir, "dir");
        s.checkNotNullParameter(fileName, "fileName");
        try {
            return createRandomAccessFile(new File(dir, fileName), z7);
        } catch (Exception e8) {
            ZLogger.w(e8.toString());
            ZLogger.w("FileNotFoundException");
            return null;
        }
    }

    public final String createTimeStamp() {
        String format = new SimpleDateFormat("yyMMddHHmmss", Locale.US).format(new Date());
        s.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public final String generateFileName(String timeStamp, String suffix) {
        s.checkNotNullParameter(timeStamp, "timeStamp");
        s.checkNotNullParameter(suffix, "suffix");
        return timeStamp + '.' + suffix;
    }

    public final String getFileName(String filePath) {
        s.checkNotNullParameter(filePath, "filePath");
        String separator = File.separator;
        s.checkNotNullExpressionValue(separator, "separator");
        String substring = filePath.substring(StringsKt__StringsKt.lastIndexOf$default((CharSequence) filePath, separator, 0, false, 6, (Object) null) + 1);
        s.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public final byte[] getMediaData(File file) {
        FileInputStream fileInputStream;
        s.checkNotNullParameter(file, "file");
        if (!file.exists()) {
            ZLogger.w("!file.exists()");
            return new byte[0];
        }
        byte[] bArr = new byte[(int) file.length()];
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Throwable th) {
                th = th;
                fileInputStream = null;
            }
        } catch (FileNotFoundException e8) {
            e = e8;
        } catch (IOException e9) {
            e = e9;
        }
        try {
            fileInputStream.read(bArr);
            try {
                fileInputStream.close();
            } catch (IOException unused) {
            }
            return bArr;
        } catch (FileNotFoundException e10) {
            e = e10;
            fileInputStream2 = fileInputStream;
            e.printStackTrace();
            byte[] bArr2 = new byte[0];
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException unused2) {
                }
            }
            return bArr2;
        } catch (IOException e11) {
            e = e11;
            fileInputStream2 = fileInputStream;
            e.printStackTrace();
            byte[] bArr3 = new byte[0];
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException unused3) {
                }
            }
            return bArr3;
        } catch (Throwable th2) {
            th = th2;
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    public final BufferedInputStream openInputStream(String filePath) {
        s.checkNotNullParameter(filePath, "filePath");
        try {
            return new BufferedInputStream(new FileInputStream(new File(filePath)));
        } catch (FileNotFoundException e8) {
            ZLogger.w("FileNotFoundException:" + e8.getMessage());
            return null;
        }
    }

    public final byte[] readAudioFile(File file) {
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = null;
            }
        } catch (IOException e8) {
            e = e8;
        }
        try {
            byte[] bArr = new byte[bufferedInputStream.available()];
            bufferedInputStream.read(bArr);
            bufferedInputStream.close();
            try {
                bufferedInputStream.close();
            } catch (IOException unused) {
            }
            return bArr;
        } catch (IOException e9) {
            e = e9;
            bufferedInputStream2 = bufferedInputStream;
            e.printStackTrace();
            if (bufferedInputStream2 != null) {
                try {
                    bufferedInputStream2.close();
                } catch (IOException unused2) {
                }
            }
            return new byte[0];
        } catch (Throwable th2) {
            th = th2;
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    public final String readFile(Context mContext, String str, String str2) {
        s.checkNotNullParameter(mContext, "mContext");
        try {
            AssetManager assets = mContext.getAssets();
            s.checkNotNull(str);
            InputStream open = assets.open(str);
            s.checkNotNullExpressionValue(open, "open(...)");
            int available = open.available();
            byte[] bArr = new byte[available];
            open.read(bArr, 0, available);
            s.checkNotNull(str2);
            Charset forName = Charset.forName(str2);
            s.checkNotNullExpressionValue(forName, "forName(...)");
            return new String(bArr, forName);
        } catch (Exception e8) {
            e8.printStackTrace();
            return "";
        }
    }

    public final boolean touch(File f8) {
        s.checkNotNullParameter(f8, "f");
        try {
            if (f8.exists()) {
                ZLogger.v("delete old file:" + f8.getPath());
                f8.delete();
            }
            return f8.createNewFile();
        } catch (IOException e8) {
            ZLogger.w(e8.toString());
            return false;
        }
    }

    public static /* synthetic */ RandomAccessFile createRandomAccessFile$default(a aVar, File file, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        return aVar.createRandomAccessFile(file, z7);
    }

    public final BufferedInputStream openInputStream(String dir, String fileName) {
        s.checkNotNullParameter(dir, "dir");
        s.checkNotNullParameter(fileName, "fileName");
        try {
            return new BufferedInputStream(new FileInputStream(new File(dir, fileName)));
        } catch (FileNotFoundException e8) {
            ZLogger.w("FileNotFoundException:" + e8.getMessage());
            return null;
        }
    }

    public final RandomAccessFile createRandomAccessFile(File file, boolean z7) {
        s.checkNotNullParameter(file, "file");
        try {
            if (!file.exists()) {
                touch(file);
            } else if (z7) {
                touch(file);
            }
            return new RandomAccessFile(file, "rw");
        } catch (Exception e8) {
            ZLogger.w(e8.toString());
            ZLogger.w("FileNotFoundException");
            return null;
        }
    }
}
