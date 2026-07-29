package com.google.gson.internal.bind;

import com.google.gson.r;
import com.google.gson.t;
import com.google.gson.u;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: TimeTypeAdapter.java */
/* loaded from: classes2.dex */
public final class g extends t<Time> {

    /* renamed from: a, reason: collision with root package name */
    public static final u f6601a = new u() { // from class: com.google.gson.internal.bind.TimeTypeAdapter$1
        @Override // com.google.gson.u
        public <T> t<T> a(com.google.gson.e eVar, com.google.gson.b.a<T> aVar) {
            if (aVar.getRawType() == Time.class) {
                return new g();
            }
            return null;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private final DateFormat f6602b = new SimpleDateFormat("hh:mm:ss a");

    @Override // com.google.gson.t
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public synchronized Time b(com.google.gson.c.a aVar) throws IOException {
        if (aVar.f() == com.google.gson.c.b.NULL) {
            aVar.j();
            return null;
        }
        try {
            return new Time(this.f6602b.parse(aVar.h()).getTime());
        } catch (ParseException e) {
            throw new r(e);
        }
    }

    @Override // com.google.gson.t
    public synchronized void a(com.google.gson.c.c cVar, Time time) throws IOException {
        cVar.b(time == null ? null : this.f6602b.format((Date) time));
    }
}
