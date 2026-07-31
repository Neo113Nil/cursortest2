package l0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.room.h f18446a;

    /* renamed from: b, reason: collision with root package name */
    private final t.a<l0.a> f18447b;

    class a extends t.a<l0.a> {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // t.d
        public String d() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // t.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(w.f fVar, l0.a aVar) {
            String str = aVar.f18444a;
            if (str == null) {
                fVar.o(1);
            } else {
                fVar.l(1, str);
            }
            String str2 = aVar.f18445b;
            if (str2 == null) {
                fVar.o(2);
            } else {
                fVar.l(2, str2);
            }
        }
    }

    public c(androidx.room.h hVar) {
        this.f18446a = hVar;
        this.f18447b = new a(hVar);
    }

    @Override // l0.b
    public boolean a(String str) {
        t.c h7 = t.c.h("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            h7.o(1);
        } else {
            h7.l(1, str);
        }
        this.f18446a.b();
        boolean z6 = false;
        Cursor b7 = v.c.b(this.f18446a, h7, false, null);
        try {
            if (b7.moveToFirst()) {
                z6 = b7.getInt(0) != 0;
            }
            return z6;
        } finally {
            b7.close();
            h7.u();
        }
    }

    @Override // l0.b
    public void b(l0.a aVar) {
        this.f18446a.b();
        this.f18446a.c();
        try {
            this.f18447b.h(aVar);
            this.f18446a.r();
        } finally {
            this.f18446a.g();
        }
    }

    @Override // l0.b
    public boolean c(String str) {
        t.c h7 = t.c.h("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            h7.o(1);
        } else {
            h7.l(1, str);
        }
        this.f18446a.b();
        boolean z6 = false;
        Cursor b7 = v.c.b(this.f18446a, h7, false, null);
        try {
            if (b7.moveToFirst()) {
                z6 = b7.getInt(0) != 0;
            }
            return z6;
        } finally {
            b7.close();
            h7.u();
        }
    }

    @Override // l0.b
    public List<String> d(String str) {
        t.c h7 = t.c.h("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            h7.o(1);
        } else {
            h7.l(1, str);
        }
        this.f18446a.b();
        Cursor b7 = v.c.b(this.f18446a, h7, false, null);
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
