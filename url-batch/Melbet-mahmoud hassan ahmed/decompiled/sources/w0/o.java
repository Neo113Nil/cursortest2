package w0;

import java.io.EOFException;
import r0.n2;

/* loaded from: classes.dex */
public final class o {
    public static void a(boolean z6, String str) {
        if (!z6) {
            throw n2.a(str, null);
        }
    }

    public static boolean b(m mVar, byte[] bArr, int i7, int i8, boolean z6) {
        try {
            return mVar.l(bArr, i7, i8, z6);
        } catch (EOFException e7) {
            if (z6) {
                return false;
            }
            throw e7;
        }
    }

    public static int c(m mVar, byte[] bArr, int i7, int i8) {
        int i9 = 0;
        while (i9 < i8) {
            int f7 = mVar.f(bArr, i7 + i9, i8 - i9);
            if (f7 == -1) {
                break;
            }
            i9 += f7;
        }
        return i9;
    }

    public static boolean d(m mVar, byte[] bArr, int i7, int i8) {
        try {
            mVar.readFully(bArr, i7, i8);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(m mVar, int i7) {
        try {
            mVar.i(i7);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
