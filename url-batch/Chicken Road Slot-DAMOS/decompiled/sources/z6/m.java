package z6;

import android.os.Parcel;
import android.os.Process;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import x3.b0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class m {
    public static final Exception a(String str, FileNotFoundException fileNotFoundException) {
        int i3;
        boolean z10 = false;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            method.getClass();
            try {
                Parcel obtain = Parcel.obtain();
                obtain.getClass();
                Process.myUserHandle().writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                i3 = obtain.readInt();
            } catch (Throwable unused) {
                Log.d("DirectBootExceptionUtil", "Error when reading current user id. Selected default user id `0`.");
                i3 = 0;
            }
            Object invoke = method.invoke(null, "sys.user." + i3 + ".ce_available", "false");
            invoke.getClass();
            z10 = ((String) invoke).equals("true");
        } catch (Throwable th) {
            hd.b.a(fileNotFoundException, th);
        }
        if (z10 || str == null) {
            return fileNotFoundException;
        }
        File file = new File(str, "siblingTestFile.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return fileNotFoundException;
        } catch (IOException unused2) {
            return new b0(fileNotFoundException);
        } finally {
            file.delete();
        }
    }

    public static int b(int i3) {
        int[] iArr = {1, 2, 3};
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = iArr[i10];
            int i12 = i11 - 1;
            if (i11 == 0) {
                throw null;
            }
            if (i12 == i3) {
                return i11;
            }
        }
        return 1;
    }
}
