package com.crrepa.r1;

import com.crrepa.l1.e;
import com.crrepa.l1.n;
import com.crrepa.l1.p;
import com.crrepa.l1.u;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* loaded from: classes3.dex */
final class a extends n {

    /* renamed from: b, reason: collision with root package name */
    static final p f13749b = new C0241a();

    /* renamed from: a, reason: collision with root package name */
    private final DateFormat f13750a;

    /* renamed from: com.crrepa.r1.a$a, reason: collision with other inner class name */
    class C0241a implements p {
        C0241a() {
        }

        @Override // com.crrepa.l1.p
        public <T> n a(e eVar, com.crrepa.s1.a aVar) {
            C0241a c0241a = null;
            if (aVar.a() == Date.class) {
                return new a(c0241a);
            }
            return null;
        }
    }

    private a() {
        this.f13750a = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // com.crrepa.l1.n
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized Date a(com.crrepa.t1.a aVar) {
        if (aVar.t() == com.crrepa.t1.c.NULL) {
            aVar.q();
            return null;
        }
        try {
            return new Date(this.f13750a.parse(aVar.r()).getTime());
        } catch (ParseException e8) {
            throw new u(e8);
        }
    }

    /* synthetic */ a(C0241a c0241a) {
        this();
    }

    @Override // com.crrepa.l1.n
    public synchronized void a(com.crrepa.t1.b bVar, Date date) {
        bVar.e(date == null ? null : this.f13750a.format((java.util.Date) date));
    }
}
