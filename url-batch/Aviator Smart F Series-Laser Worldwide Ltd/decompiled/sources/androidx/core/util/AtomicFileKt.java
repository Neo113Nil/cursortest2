package androidx.core.util;

import f6.l;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class AtomicFileKt {
    public static final byte[] readBytes(android.util.AtomicFile atomicFile) {
        return atomicFile.readFully();
    }

    public static final String readText(android.util.AtomicFile atomicFile, Charset charset) {
        return new String(atomicFile.readFully(), charset);
    }

    public static /* synthetic */ String readText$default(android.util.AtomicFile atomicFile, Charset charset, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charset = kotlin.text.d.UTF_8;
        }
        return readText(atomicFile, charset);
    }

    public static final void tryWrite(android.util.AtomicFile atomicFile, l lVar) {
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            lVar.invoke(startWrite);
            r.finallyStart(1);
            atomicFile.finishWrite(startWrite);
            r.finallyEnd(1);
        } catch (Throwable th) {
            r.finallyStart(1);
            atomicFile.failWrite(startWrite);
            r.finallyEnd(1);
            throw th;
        }
    }

    public static final void writeBytes(android.util.AtomicFile atomicFile, byte[] bArr) {
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            startWrite.write(bArr);
            atomicFile.finishWrite(startWrite);
        } catch (Throwable th) {
            atomicFile.failWrite(startWrite);
            throw th;
        }
    }

    public static final void writeText(android.util.AtomicFile atomicFile, String str, Charset charset) {
        byte[] bytes = str.getBytes(charset);
        s.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        writeBytes(atomicFile, bytes);
    }

    public static /* synthetic */ void writeText$default(android.util.AtomicFile atomicFile, String str, Charset charset, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            charset = kotlin.text.d.UTF_8;
        }
        writeText(atomicFile, str, charset);
    }
}
