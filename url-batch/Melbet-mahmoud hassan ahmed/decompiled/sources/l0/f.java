package l0;

import android.database.Cursor;

/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.room.h f18451a;

    /* renamed from: b, reason: collision with root package name */
    private final t.a<d> f18452b;

    class a extends t.a<d> {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // t.d
        public String d() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // t.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(w.f fVar, d dVar) {
            String str = dVar.f18449a;
            if (str == null) {
                fVar.o(1);
            } else {
                fVar.l(1, str);
            }
            Long l7 = dVar.f18450b;
            if (l7 == null) {
                fVar.o(2);
            } else {
                fVar.z(2, l7.longValue());
            }
        }
    }

    public f(androidx.room.h hVar) {
        this.f18451a = hVar;
        this.f18452b = new a(hVar);
    }

    @Override // l0.e
    public void a(d dVar) {
        this.f18451a.b();
        this.f18451a.c();
        try {
            this.f18452b.h(dVar);
            this.f18451a.r();
        } finally {
            this.f18451a.g();
        }
    }

    @Override // l0.e
    public Long b(String str) {
        t.c h7 = t.c.h("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            h7.o(1);
        } else {
            h7.l(1, str);
        }
        this.f18451a.b();
        Long l7 = null;
        Cursor b7 = v.c.b(this.f18451a, h7, false, null);
        try {
            if (b7.moveToFirst() && !b7.isNull(0)) {
                l7 = Long.valueOf(b7.getLong(0));
            }
            return l7;
        } finally {
            b7.close();
            h7.u();
        }
    }
}
