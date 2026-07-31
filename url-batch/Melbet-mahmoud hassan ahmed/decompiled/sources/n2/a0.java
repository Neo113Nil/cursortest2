package n2;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public class a0 extends m {

    /* renamed from: g, reason: collision with root package name */
    public final p f19390g;

    /* renamed from: h, reason: collision with root package name */
    public final int f19391h;

    public a0(IOException iOException, p pVar, int i7, int i8) {
        super(iOException, b(i7, i8));
        this.f19390g = pVar;
        this.f19391h = i8;
    }

    public a0(String str, IOException iOException, p pVar, int i7, int i8) {
        super(str, iOException, b(i7, i8));
        this.f19390g = pVar;
        this.f19391h = i8;
    }

    public a0(String str, p pVar, int i7, int i8) {
        super(str, b(i7, i8));
        this.f19390g = pVar;
        this.f19391h = i8;
    }

    public a0(p pVar, int i7, int i8) {
        super(b(i7, i8));
        this.f19390g = pVar;
        this.f19391h = i8;
    }

    private static int b(int i7, int i8) {
        if (i7 == 2000 && i8 == 1) {
            return 2001;
        }
        return i7;
    }

    public static a0 c(IOException iOException, p pVar, int i7) {
        String message = iOException.getMessage();
        int i8 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !l4.b.e(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i8 == 2007 ? new z(iOException, pVar) : new a0(iOException, pVar, i8, i7);
    }
}
