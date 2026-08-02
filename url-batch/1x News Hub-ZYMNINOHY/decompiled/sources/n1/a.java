package n1;

import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import q1.AbstractC1180a;

/* loaded from: classes.dex */
public final class a implements d {
    public static final a f;

    /* renamed from: a, reason: collision with root package name */
    public m1.c f10142a;

    /* renamed from: b, reason: collision with root package name */
    public Date f10143b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10144c;

    /* renamed from: d, reason: collision with root package name */
    public e f10145d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10146e;

    static {
        e eVar = new e();
        a aVar = new a();
        aVar.f10142a = new m1.c();
        aVar.f10145d = eVar;
        f = aVar;
    }

    @Override // n1.d
    public final void a(boolean z) {
        if (!this.f10146e && z) {
            this.f10142a.getClass();
            Date date = new Date();
            Date date2 = this.f10143b;
            if (date2 == null || date.after(date2)) {
                this.f10143b = date;
                if (this.f10144c) {
                    Iterator it = Collections.unmodifiableCollection(c.f10148c.f10150b).iterator();
                    while (it.hasNext()) {
                        AbstractC1180a abstractC1180a = ((j1.i) it.next()).f9544e;
                        Date date3 = this.f10143b;
                        abstractC1180a.e(date3 != null ? (Date) date3.clone() : null);
                    }
                }
            }
        }
        this.f10146e = z;
    }
}
