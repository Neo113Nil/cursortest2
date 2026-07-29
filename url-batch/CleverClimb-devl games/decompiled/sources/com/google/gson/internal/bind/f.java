package com.google.gson.internal.bind;

import com.google.gson.r;
import com.google.gson.t;
import com.google.gson.u;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* compiled from: SqlDateTypeAdapter.java */
/* loaded from: classes2.dex */
public final class f extends t<Date> {

    /* renamed from: a, reason: collision with root package name */
    public static final u f6599a = new u() { // from class: com.google.gson.internal.bind.SqlDateTypeAdapter$1
        @Override // com.google.gson.u
        public <T> t<T> a(com.google.gson.e eVar, com.google.gson.b.a<T> aVar) {
            if (aVar.getRawType() == Date.class) {
                return new f();
            }
            return null;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private final DateFormat f6600b = new SimpleDateFormat("MMM d, yyyy");

    @Override // com.google.gson.t
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public synchronized Date b(com.google.gson.c.a aVar) throws IOException {
        if (aVar.f() == com.google.gson.c.b.NULL) {
            aVar.j();
            return null;
        }
        try {
            return new Date(this.f6600b.parse(aVar.h()).getTime());
        } catch (ParseException e) {
            throw new r(e);
        }
    }

    @Override // com.google.gson.t
    public synchronized void a(com.google.gson.c.c cVar, Date date) throws IOException {
        cVar.b(date == null ? null : this.f6600b.format((java.util.Date) date));
    }
}
