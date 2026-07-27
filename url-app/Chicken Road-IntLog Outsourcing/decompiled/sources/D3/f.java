package D3;

import a3.C0188g;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f446a;

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f446a) {
            case 0:
                IOException iOException = (IOException) obj;
                return (iOException instanceof SocketTimeoutException) || (iOException instanceof ConnectException) || (iOException instanceof UnknownHostException) || (iOException instanceof SocketException);
            case 1:
                return !((C0188g) obj).f3867d;
            default:
                return ((io.flutter.view.f) obj).I(19);
        }
    }
}
