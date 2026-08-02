package L3;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

/* loaded from: classes.dex */
public final class c extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1668a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f1668a) {
            case 0:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(H3.b.f1106d);
                return simpleDateFormat;
            default:
                return new Random();
        }
    }
}
