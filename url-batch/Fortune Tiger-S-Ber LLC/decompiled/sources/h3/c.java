package h3;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2019a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f2019a) {
            case 0:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(d3.c.f1493e);
                return simpleDateFormat;
            default:
                return new Random();
        }
    }
}
