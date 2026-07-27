package Y4;

import b3.C0284e;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

/* loaded from: classes.dex */
public final class d extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3710a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f3710a) {
            case 0:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(U4.e.f3179a);
                return simpleDateFormat;
            case 1:
                return new C0284e();
            case 2:
                return Boolean.FALSE;
            default:
                return new Random();
        }
    }
}
