package X0;

import O2.l;
import a1.C0243b;
import android.content.Context;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public class g extends l {
    @Override // O2.l
    public Typeface U(Context context, C0243b[] c0243bArr) {
        File file;
        String readlink;
        if (c0243bArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(a0(c0243bArr).f4738a, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                } catch (ErrnoException unused) {
                }
                try {
                    if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                        file = new File(readlink);
                        if (file != null && file.canRead()) {
                            Typeface createFromFile = Typeface.createFromFile(file);
                            openFileDescriptor.close();
                            return createFromFile;
                        }
                        FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                        Typeface V2 = V(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return V2;
                    }
                    Typeface V22 = V(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return V22;
                } finally {
                }
                file = null;
                if (file != null) {
                    Typeface createFromFile2 = Typeface.createFromFile(file);
                    openFileDescriptor.close();
                    return createFromFile2;
                }
                FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
            } finally {
            }
        } catch (IOException unused2) {
            return null;
        }
    }
}
