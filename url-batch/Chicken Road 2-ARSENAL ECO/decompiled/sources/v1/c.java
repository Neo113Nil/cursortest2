package v1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import t1.InterfaceC0659f;
import t1.InterfaceC0660g;

/* loaded from: classes.dex */
public final class c implements InterfaceC0659f {

    /* renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f6108a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f6108a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // t1.InterfaceC0654a
    public final void a(Object obj, Object obj2) {
        ((InterfaceC0660g) obj2).b(f6108a.format((Date) obj));
    }
}
