package V0;

import a.AbstractC0157a;
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
public class g extends AbstractC0157a {
    @Override // a.AbstractC0157a
    public Typeface s(Context context, Y0.b[] bVarArr) {
        File file;
        String readlink;
        if (bVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(z(bVarArr).f3409a, "r", null);
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
                        Typeface t3 = t(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return t3;
                    }
                    Typeface t32 = t(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return t32;
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
