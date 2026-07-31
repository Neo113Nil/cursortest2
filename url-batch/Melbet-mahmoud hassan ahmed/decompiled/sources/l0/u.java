package l0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class u implements t {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.room.h f18518a;

    /* renamed from: b, reason: collision with root package name */
    private final t.a<s> f18519b;

    class a extends t.a<s> {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // t.d
        public String d() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // t.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(w.f fVar, s sVar) {
            String str = sVar.f18516a;
            if (str == null) {
                fVar.o(1);
            } else {
                fVar.l(1, str);
            }
            String str2 = sVar.f18517b;
            if (str2 == null) {
                fVar.o(2);
            } else {
                fVar.l(2, str2);
            }
        }
    }

    public u(androidx.room.h hVar) {
        this.f18518a = hVar;
        this.f18519b = new a(hVar);
    }

    @Override // l0.t
    public void a(s sVar) {
        this.f18518a.b();
        this.f18518a.c();
        try {
            this.f18519b.h(sVar);
            this.f18518a.r();
        } finally {
            this.f18518a.g();
        }
    }

    @Override // l0.t
    public List<String> b(String str) {
        t.c h7 = t.c.h("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            h7.o(1);
        } else {
            h7.l(1, str);
        }
        this.f18518a.b();
        Cursor b7 = v.c.b(this.f18518a, h7, false, null);
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
