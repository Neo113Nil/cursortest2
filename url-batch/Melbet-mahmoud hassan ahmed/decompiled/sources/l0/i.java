package l0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.room.h f18456a;

    /* renamed from: b, reason: collision with root package name */
    private final t.a<g> f18457b;

    /* renamed from: c, reason: collision with root package name */
    private final t.d f18458c;

    class a extends t.a<g> {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // t.d
        public String d() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // t.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(w.f fVar, g gVar) {
            String str = gVar.f18454a;
            if (str == null) {
                fVar.o(1);
            } else {
                fVar.l(1, str);
            }
            fVar.z(2, gVar.f18455b);
        }
    }

    class b extends t.d {
        b(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // t.d
        public String d() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public i(androidx.room.h hVar) {
        this.f18456a = hVar;
        this.f18457b = new a(hVar);
        this.f18458c = new b(hVar);
    }

    @Override // l0.h
    public List<String> a() {
        t.c h7 = t.c.h("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f18456a.b();
        Cursor b7 = v.c.b(this.f18456a, h7, false, null);
        try {
            ArrayList arrayList = new ArrayList(b7.getCount());
            while (b7.moveToNext()) {
                arrayList.add(b7.getString(0));
            }
            return arrayList;
        } finally {
            b7.close();
            h7.u();
        }
    }

    @Override // l0.h
    public g b(String str) {
        t.c h7 = t.c.h("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            h7.o(1);
        } else {
            h7.l(1, str);
        }
        this.f18456a.b();
        Cursor b7 = v.c.b(this.f18456a, h7, false, null);
        try {
            return b7.moveToFirst() ? new g(b7.getString(v.b.b(b7, "work_spec_id")), b7.getInt(v.b.b(b7, "system_id"))) : null;
        } finally {
            b7.close();
            h7.u();
        }
    }

    @Override // l0.h
    public void c(String str) {
        this.f18456a.b();
        w.f a7 = this.f18458c.a();
        if (str == null) {
            a7.o(1);
        } else {
            a7.l(1, str);
        }
        this.f18456a.c();
        try {
            a7.m();
            this.f18456a.r();
        } finally {
            this.f18456a.g();
            this.f18458c.f(a7);
        }
    }

    @Override // l0.h
    public void d(g gVar) {
        this.f18456a.b();
        this.f18456a.c();
        try {
            this.f18457b.h(gVar);
            this.f18456a.r();
        } finally {
            this.f18456a.g();
        }
    }
}
