package l0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.room.h f18463a;

    /* renamed from: b, reason: collision with root package name */
    private final t.a<j> f18464b;

    class a extends t.a<j> {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // t.d
        public String d() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // t.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(w.f fVar, j jVar) {
            String str = jVar.f18461a;
            if (str == null) {
                fVar.o(1);
            } else {
                fVar.l(1, str);
            }
            String str2 = jVar.f18462b;
            if (str2 == null) {
                fVar.o(2);
            } else {
                fVar.l(2, str2);
            }
        }
    }

    public l(androidx.room.h hVar) {
        this.f18463a = hVar;
        this.f18464b = new a(hVar);
    }

    @Override // l0.k
    public void a(j jVar) {
        this.f18463a.b();
        this.f18463a.c();
        try {
            this.f18464b.h(jVar);
            this.f18463a.r();
        } finally {
            this.f18463a.g();
        }
    }

    @Override // l0.k
    public List<String> b(String str) {
        t.c h7 = t.c.h("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            h7.o(1);
        } else {
            h7.l(1, str);
        }
        this.f18463a.b();
        Cursor b7 = v.c.b(this.f18463a, h7, false, null);
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
}
