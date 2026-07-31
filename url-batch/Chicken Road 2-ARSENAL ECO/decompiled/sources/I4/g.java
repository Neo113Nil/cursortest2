package I4;

import com.onesignal.inAppMessages.internal.display.impl.a;
import f4.C0380g;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1214a;

    public /* synthetic */ g(int i7) {
        this.f1214a = i7;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f1214a) {
            case 0:
                IOException iOException = (IOException) obj;
                return (iOException instanceof SocketTimeoutException) || (iOException instanceof ConnectException) || (iOException instanceof UnknownHostException) || (iOException instanceof SocketException);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return !((C0380g) obj).f4231i;
            default:
                return ((io.flutter.view.h) obj).h(19);
        }
    }
}
