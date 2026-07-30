package com.crrepa.r1;

import com.crrepa.l1.e;
import com.crrepa.l1.n;
import com.crrepa.l1.p;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes3.dex */
class c extends n {

    /* renamed from: b, reason: collision with root package name */
    static final p f13753b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final n f13754a;

    class a implements p {
        a() {
        }

        @Override // com.crrepa.l1.p
        public <T> n a(e eVar, com.crrepa.s1.a aVar) {
            a aVar2 = null;
            if (aVar.a() == Timestamp.class) {
                return new c(eVar.a((Class) Date.class), aVar2);
            }
            return null;
        }
    }

    private c(n nVar) {
        this.f13754a = nVar;
    }

    @Override // com.crrepa.l1.n
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Timestamp a(com.crrepa.t1.a aVar) {
        Date date = (Date) this.f13754a.a(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    /* synthetic */ c(n nVar, a aVar) {
        this(nVar);
    }

    @Override // com.crrepa.l1.n
    public void a(com.crrepa.t1.b bVar, Timestamp timestamp) {
        this.f13754a.a(bVar, timestamp);
    }
}
