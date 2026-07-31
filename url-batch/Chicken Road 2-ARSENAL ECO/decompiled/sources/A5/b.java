package A5;

import com.onesignal.inAppMessages.internal.display.impl.a;
import g4.C0397e;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

/* loaded from: classes.dex */
public final class b extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f55a) {
            case 0:
                return new Random();
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(Y5.e.f3102a);
                return simpleDateFormat;
            default:
                return new C0397e();
        }
    }
}
