package defpackage;

import j$.util.DesugarTimeZone;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ibm implements ibi {
    private static final DateFormat a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        a = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    @Override // defpackage.ibd
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((ibj) obj2).c(a.format((Date) obj));
    }
}
