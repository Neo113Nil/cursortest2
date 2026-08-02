package J2;

import java.util.Collections;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: f, reason: collision with root package name */
    public static final a f1166f;

    /* renamed from: a, reason: collision with root package name */
    public a2.i f1167a;

    /* renamed from: b, reason: collision with root package name */
    public Date f1168b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1169c;

    /* renamed from: d, reason: collision with root package name */
    public e f1170d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1171e;

    static {
        e eVar = new e();
        a aVar = new a();
        aVar.f1167a = new a2.i(15);
        aVar.f1170d = eVar;
        f1166f = aVar;
    }

    @Override // J2.d
    public final void a(boolean z) {
        if (!this.f1171e && z) {
            this.f1167a.getClass();
            Date date = new Date();
            Date date2 = this.f1168b;
            if (date2 == null || date.after(date2)) {
                this.f1168b = date;
                if (this.f1169c) {
                    Iterator it = Collections.unmodifiableCollection(c.f1173c.f1175b).iterator();
                    while (it.hasNext()) {
                        M2.a aVar = ((F2.i) it.next()).f785e;
                        Date date3 = this.f1168b;
                        aVar.e(date3 != null ? (Date) date3.clone() : null);
                    }
                }
            }
        }
        this.f1171e = z;
    }
}
