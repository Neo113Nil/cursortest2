package E1;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

/* loaded from: classes.dex */
public final class c extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f231a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f231a) {
            case 0:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(A1.c.f16e);
                return simpleDateFormat;
            default:
                return new Random();
        }
    }
}
