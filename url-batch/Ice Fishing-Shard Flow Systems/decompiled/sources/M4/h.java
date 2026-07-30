package M4;

import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1752a;

    public /* synthetic */ h(int i2) {
        this.f1752a = i2;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f1752a) {
            case 0:
                return !((g) obj).f1751l;
            case 1:
                return ((io.flutter.view.f) obj).h(19);
            default:
                IOException iOException = (IOException) obj;
                return (iOException instanceof SocketTimeoutException) || (iOException instanceof ConnectException) || (iOException instanceof UnknownHostException) || (iOException instanceof SocketException);
        }
    }
}
