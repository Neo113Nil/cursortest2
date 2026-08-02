package C2;

import A2.f;
import A2.g;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f264a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f264a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // A2.a
    public final void a(Object obj, Object obj2) {
        ((g) obj2).c(f264a.format((Date) obj));
    }
}
