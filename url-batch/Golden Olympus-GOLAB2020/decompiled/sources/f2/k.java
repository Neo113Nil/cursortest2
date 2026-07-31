package f2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class k extends j {
    public static byte[] c(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i4 = (int) length;
            byte[] bArr = new byte[i4];
            int i5 = i4;
            int i6 = 0;
            while (i5 > 0) {
                int read = fileInputStream.read(bArr, i6, i5);
                if (read < 0) {
                    break;
                }
                i5 -= read;
                i6 += read;
            }
            if (i5 > 0) {
                bArr = Arrays.copyOf(bArr, i6);
                Intrinsics.checkNotNullExpressionValue(bArr, "copyOf(...)");
            } else {
                int read2 = fileInputStream.read();
                if (read2 != -1) {
                    C2422e c2422e = new C2422e(8193);
                    c2422e.write(read2);
                    AbstractC2419b.b(fileInputStream, c2422e, 0, 2, null);
                    int size = c2422e.size() + i4;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] m4 = c2422e.m();
                    byte[] copyOf = Arrays.copyOf(bArr, size);
                    Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                    bArr = AbstractC3219i.f(m4, copyOf, i4, 0, c2422e.size());
                }
            }
            AbstractC2420c.a(fileInputStream, null);
            return bArr;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC2420c.a(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static final String d(File file, Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String f4 = p.f(inputStreamReader);
            AbstractC2420c.a(inputStreamReader, null);
            return f4;
        } finally {
        }
    }

    public static /* synthetic */ String e(File file, Charset charset, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return d(file, charset);
    }

    public static void f(File file, byte[] array) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            Unit unit = Unit.f41027a;
            AbstractC2420c.a(fileOutputStream, null);
        } finally {
        }
    }

    public static final void g(File file, String text, Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = text.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        f(file, bytes);
    }

    public static /* synthetic */ void h(File file, String str, Charset charset, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        g(file, str, charset);
    }
}
