package defpackage;

import android.database.Cursor;
import android.os.Looper;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class qy extends x70 implements ho {
    public final /* synthetic */ ry j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy(ry ryVar, le leVar) {
        super(leVar);
        this.j = ryVar;
    }

    @Override // defpackage.ho
    public final Object f(Object obj, Object obj2) {
        qy qyVar = (qy) h((le) obj2);
        ej ejVar = ej.q;
        qyVar.i(ejVar);
        return ejVar;
    }

    @Override // defpackage.x70
    public final le h(le leVar) {
        return new qy(this.j, leVar);
    }

    @Override // defpackage.x70
    public final Object i(Object obj) {
        Cursor query;
        ArrayList g;
        boolean z;
        xf.M(obj);
        boolean b0 = f70.b0(this.j.e);
        ry ryVar = this.j;
        if (b0) {
            boolean b = kr.b(ryVar.f, "All");
            ry ryVar2 = this.j;
            oy oyVar = ryVar2.b;
            if (b) {
                query = oyVar.getReadableDatabase().query("notes", null, null, null, null, null, "isPinned DESC, updatedAt DESC");
                try {
                    query.getClass();
                    g = oy.g(query);
                    query.close();
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            } else {
                String str = ryVar2.f;
                oyVar.getClass();
                str.getClass();
                query = oyVar.getReadableDatabase().query("notes", null, "category = ?", new String[]{str}, null, null, "isPinned DESC, updatedAt DESC");
                try {
                    query.getClass();
                    g = oy.g(query);
                    query.close();
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
        } else {
            oy oyVar2 = ryVar.b;
            String str2 = ryVar.e;
            oyVar2.getClass();
            str2.getClass();
            query = oyVar2.getReadableDatabase().query("notes", null, "title LIKE ? OR content LIKE ?", new String[]{f60.f("%", str2, "%"), f60.f("%", str2, "%")}, null, null, "isPinned DESC, updatedAt DESC");
            try {
                query.getClass();
                g = oy.g(query);
                query.close();
            } finally {
            }
        }
        rx rxVar = this.j.c;
        synchronized (rxVar.a) {
            z = rxVar.f == rx.k;
            rxVar.f = g;
        }
        if (z) {
            o6 V = o6.V();
            j7 j7Var = rxVar.j;
            xg xgVar = V.j;
            if (xgVar.k == null) {
                synchronized (xgVar.j) {
                    try {
                        if (xgVar.k == null) {
                            xgVar.k = xg.V(Looper.getMainLooper());
                        }
                    } finally {
                    }
                }
            }
            xgVar.k.post(j7Var);
        }
        return ej.q;
    }
}
