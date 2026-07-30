package com.crrepa.o1;

import com.crrepa.l1.n;
import com.crrepa.l1.p;
import com.crrepa.l1.u;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class c extends n {

    /* renamed from: b, reason: collision with root package name */
    public static final p f13479b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final List<DateFormat> f13480a;

    class a implements p {
        a() {
        }

        @Override // com.crrepa.l1.p
        public <T> n a(com.crrepa.l1.e eVar, com.crrepa.s1.a aVar) {
            if (aVar.a() == Date.class) {
                return new c();
            }
            return null;
        }
    }

    public c() {
        ArrayList arrayList = new ArrayList();
        this.f13480a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (com.crrepa.n1.e.c()) {
            arrayList.add(com.crrepa.n1.i.a(2, 2));
        }
    }

    @Override // com.crrepa.l1.n
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Date a(com.crrepa.t1.a aVar) {
        if (aVar.t() != com.crrepa.t1.c.NULL) {
            return b(aVar.r());
        }
        aVar.q();
        return null;
    }

    private synchronized Date b(String str) {
        Iterator<DateFormat> it = this.f13480a.iterator();
        while (it.hasNext()) {
            try {
                return it.next().parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return j4.a.a(str, new ParsePosition(0));
        } catch (ParseException e8) {
            throw new u(str, e8);
        }
    }

    @Override // com.crrepa.l1.n
    public synchronized void a(com.crrepa.t1.b bVar, Date date) {
        if (date == null) {
            bVar.k();
        } else {
            bVar.e(this.f13480a.get(0).format(date));
        }
    }
}
