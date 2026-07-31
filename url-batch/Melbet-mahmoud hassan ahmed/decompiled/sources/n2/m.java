package n2;

import java.io.IOException;

/* loaded from: classes.dex */
public class m extends IOException {

    /* renamed from: f, reason: collision with root package name */
    public final int f19472f;

    public m(int i7) {
        this.f19472f = i7;
    }

    public m(String str, int i7) {
        super(str);
        this.f19472f = i7;
    }

    public m(String str, Throwable th, int i7) {
        super(str, th);
        this.f19472f = i7;
    }

    public m(Throwable th, int i7) {
        super(th);
        this.f19472f = i7;
    }

    public static boolean a(IOException iOException) {
        for (IOException iOException2 = iOException; iOException2 != null; iOException2 = iOException2.getCause()) {
            if ((iOException2 instanceof m) && ((m) iOException2).f19472f == 2008) {
                return true;
            }
        }
        return false;
    }
}
