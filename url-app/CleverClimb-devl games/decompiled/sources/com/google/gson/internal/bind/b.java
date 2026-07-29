package com.google.gson.internal.bind;

import com.google.gson.r;
import com.google.gson.t;
import com.google.gson.u;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: DateTypeAdapter.java */
/* loaded from: classes2.dex */
public final class b extends t<Date> {

    /* renamed from: a, reason: collision with root package name */
    public static final u f6587a = new u() { // from class: com.google.gson.internal.bind.DateTypeAdapter$1
        @Override // com.google.gson.u
        public <T> t<T> a(com.google.gson.e eVar, com.google.gson.b.a<T> aVar) {
            if (aVar.getRawType() == Date.class) {
                return new b();
            }
            return null;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private final List<DateFormat> f6588b = new ArrayList();

    public b() {
        this.f6588b.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f6588b.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (com.google.gson.d.a.b()) {
            this.f6588b.add(com.google.gson.internal.h.a(2, 2));
        }
    }

    @Override // com.google.gson.t
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Date b(com.google.gson.c.a aVar) throws IOException {
        if (aVar.f() == com.google.gson.c.b.NULL) {
            aVar.j();
            return null;
        }
        return a(aVar.h());
    }

    private synchronized Date a(String str) {
        Iterator<DateFormat> it = this.f6588b.iterator();
        while (it.hasNext()) {
            try {
                return it.next().parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return com.google.gson.internal.bind.a.a.a(str, new ParsePosition(0));
        } catch (ParseException e) {
            throw new r(str, e);
        }
    }

    @Override // com.google.gson.t
    public synchronized void a(com.google.gson.c.c cVar, Date date) throws IOException {
        if (date == null) {
            cVar.f();
        } else {
            cVar.b(this.f6588b.get(0).format(date));
        }
    }
}
