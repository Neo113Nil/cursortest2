package g1;

import e1.InterfaceC0315f;
import e1.InterfaceC0316g;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: g1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0334c implements InterfaceC0315f {

    /* renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f5039a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f5039a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // e1.InterfaceC0310a
    public final void a(Object obj, Object obj2) {
        ((InterfaceC0316g) obj2).b(f5039a.format((Date) obj));
    }
}
