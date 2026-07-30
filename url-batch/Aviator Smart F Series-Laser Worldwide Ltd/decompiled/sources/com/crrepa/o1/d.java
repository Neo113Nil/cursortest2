package com.crrepa.o1;

import com.crrepa.l1.n;
import com.crrepa.l1.p;
import com.crrepa.l1.u;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class d extends n {

    /* renamed from: c, reason: collision with root package name */
    private static final String f13481c = "DefaultDateTypeAdapter";

    /* renamed from: a, reason: collision with root package name */
    private final b f13482a;

    /* renamed from: b, reason: collision with root package name */
    private final List<DateFormat> f13483b;

    public static abstract class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f13484b = new a(Date.class);

        /* renamed from: a, reason: collision with root package name */
        private final Class<Date> f13485a;

        class a extends b {
            a(Class cls) {
                super(cls);
            }

            @Override // com.crrepa.o1.d.b
            protected Date a(Date date) {
                return date;
            }
        }

        protected b(Class<Date> cls) {
            this.f13485a = cls;
        }

        public final p a() {
            int i8 = 2;
            return a(new d(this, i8, i8));
        }

        protected abstract Date a(Date date);

        public final p a(int i8) {
            return a(new d(this, i8));
        }

        public final p a(int i8, int i9) {
            return a(new d(this, i8, i9));
        }

        private final p a(d dVar) {
            return m.a(this.f13485a, dVar);
        }

        public final p a(String str) {
            return a(new d(this, str));
        }
    }

    private d(b bVar, int i8) {
        ArrayList arrayList = new ArrayList();
        this.f13483b = arrayList;
        this.f13482a = (b) com.crrepa.n1.a.a(bVar);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateInstance(i8, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateInstance(i8));
        }
        if (com.crrepa.n1.e.c()) {
            arrayList.add(com.crrepa.n1.i.d(i8));
        }
    }

    @Override // com.crrepa.l1.n
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Date a(com.crrepa.t1.a aVar) {
        if (aVar.t() == com.crrepa.t1.c.NULL) {
            aVar.q();
            return null;
        }
        return this.f13482a.a(b(aVar.r()));
    }

    public String toString() {
        StringBuilder sb;
        String simpleName;
        DateFormat dateFormat = this.f13483b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            sb = new StringBuilder();
            sb.append("DefaultDateTypeAdapter(");
            simpleName = ((SimpleDateFormat) dateFormat).toPattern();
        } else {
            sb = new StringBuilder();
            sb.append("DefaultDateTypeAdapter(");
            simpleName = dateFormat.getClass().getSimpleName();
        }
        sb.append(simpleName);
        sb.append(')');
        return sb.toString();
    }

    private d(b bVar, int i8, int i9) {
        ArrayList arrayList = new ArrayList();
        this.f13483b = arrayList;
        this.f13482a = (b) com.crrepa.n1.a.a(bVar);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i8, i9, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i8, i9));
        }
        if (com.crrepa.n1.e.c()) {
            arrayList.add(com.crrepa.n1.i.a(i8, i9));
        }
    }

    private Date b(String str) {
        synchronized (this.f13483b) {
            try {
                Iterator<DateFormat> it = this.f13483b.iterator();
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
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.crrepa.l1.n
    public void a(com.crrepa.t1.b bVar, Date date) {
        if (date == null) {
            bVar.k();
            return;
        }
        synchronized (this.f13483b) {
            bVar.e(this.f13483b.get(0).format(date));
        }
    }

    private d(b bVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.f13483b = arrayList;
        this.f13482a = (b) com.crrepa.n1.a.a(bVar);
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }
}
