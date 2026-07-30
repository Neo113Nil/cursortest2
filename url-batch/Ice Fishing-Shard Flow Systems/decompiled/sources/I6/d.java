package I6;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes.dex */
public final class d extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1294a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f1294a) {
            case 0:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(E6.e.f712a);
                return simpleDateFormat;
            default:
                return new N4.e();
        }
    }
}
