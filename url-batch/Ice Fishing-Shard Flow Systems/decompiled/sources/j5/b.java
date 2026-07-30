package j5;

import i.C0511M;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;
import java.util.logging.Logger;
import x5.m;
import x5.n;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f5993f = Logger.getLogger(b.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final n f5994a = new n(f5993f);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f5995b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    public final String f5996c;

    /* renamed from: d, reason: collision with root package name */
    public final p5.d f5997d;

    /* renamed from: e, reason: collision with root package name */
    public final C0511M f5998e;

    public b(m mVar, p5.d dVar, Supplier supplier, int i2, String str) {
        String str2;
        int i5 = mVar.f8405c.f8401e;
        if (i5 == 1) {
            str2 = "SPAN";
        } else if (i5 == 2) {
            str2 = "METRIC";
        } else if (i5 == 3) {
            str2 = "LOG";
        } else {
            if (i5 != 4) {
                throw null;
            }
            str2 = "PROFILE";
        }
        this.f5996c = str2.toLowerCase(Locale.ENGLISH);
        this.f5997d = dVar;
        this.f5998e = new C0511M(i2, supplier, mVar, str);
    }
}
