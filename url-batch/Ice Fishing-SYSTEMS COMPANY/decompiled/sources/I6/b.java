package I6;

import W6.k;
import W6.l;
import g1.C4523c;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f1264f = Logger.getLogger(b.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final l f1265a = new l(f1264f);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f1266b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    public final String f1267c;

    /* renamed from: d, reason: collision with root package name */
    public final O6.e f1268d;

    /* renamed from: e, reason: collision with root package name */
    public final C4523c f1269e;

    public b(k kVar, O6.e eVar, D5.a aVar, int i, String str) {
        String str2;
        int i4 = kVar.f3490c.f3486u;
        if (i4 == 1) {
            str2 = "SPAN";
        } else if (i4 == 2) {
            str2 = "METRIC";
        } else if (i4 == 3) {
            str2 = "LOG";
        } else {
            if (i4 != 4) {
                throw null;
            }
            str2 = "PROFILE";
        }
        this.f1267c = str2.toLowerCase(Locale.ENGLISH);
        this.f1268d = eVar;
        this.f1269e = new C4523c(i, aVar, kVar, str);
    }
}
