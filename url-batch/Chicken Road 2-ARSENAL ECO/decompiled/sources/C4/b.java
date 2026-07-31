package C4;

import D3.M;
import Q4.m;
import Q4.n;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f204f = Logger.getLogger(b.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final n f205a = new n(f204f);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f206b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    public final String f207c;

    /* renamed from: d, reason: collision with root package name */
    public final I4.e f208d;

    /* renamed from: e, reason: collision with root package name */
    public final M f209e;

    public b(m mVar, I4.e eVar, Supplier supplier, int i7, String str) {
        String str2;
        int i8 = mVar.f2041e.f2037g;
        if (i8 == 1) {
            str2 = "SPAN";
        } else if (i8 == 2) {
            str2 = "METRIC";
        } else if (i8 == 3) {
            str2 = "LOG";
        } else {
            if (i8 != 4) {
                throw null;
            }
            str2 = "PROFILE";
        }
        this.f207c = str2.toLowerCase(Locale.ENGLISH);
        this.f208d = eVar;
        this.f209e = new M(i7, supplier, mVar, str);
    }
}
