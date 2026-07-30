package com.crrepa.r1;

import com.crrepa.l1.e;
import com.crrepa.l1.n;
import com.crrepa.l1.p;
import com.crrepa.l1.u;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes3.dex */
final class b extends n {

    /* renamed from: b, reason: collision with root package name */
    static final p f13751b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final DateFormat f13752a;

    class a implements p {
        a() {
        }

        @Override // com.crrepa.l1.p
        public <T> n a(e eVar, com.crrepa.s1.a aVar) {
            a aVar2 = null;
            if (aVar.a() == Time.class) {
                return new b(aVar2);
            }
            return null;
        }
    }

    private b() {
        this.f13752a = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // com.crrepa.l1.n
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized Time a(com.crrepa.t1.a aVar) {
        if (aVar.t() == com.crrepa.t1.c.NULL) {
            aVar.q();
            return null;
        }
        try {
            return new Time(this.f13752a.parse(aVar.r()).getTime());
        } catch (ParseException e8) {
            throw new u(e8);
        }
    }

    /* synthetic */ b(a aVar) {
        this();
    }

    @Override // com.crrepa.l1.n
    public synchronized void a(com.crrepa.t1.b bVar, Time time) {
        bVar.e(time == null ? null : this.f13752a.format((Date) time));
    }
}
