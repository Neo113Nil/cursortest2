package s7;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.v8;
import com.google.android.gms.internal.measurement.w8;
import com.google.android.gms.internal.measurement.z8;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t4 {

    /* renamed from: a, reason: collision with root package name */
    public w8 f9031a;

    /* renamed from: b, reason: collision with root package name */
    public Long f9032b;

    /* renamed from: c, reason: collision with root package name */
    public long f9033c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f9034d;

    public /* synthetic */ t4(c cVar) {
        this.f9034d = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0122, code lost:
    
        if (r8 != null) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e8  */
    /* JADX WARN: Type inference failed for: r8v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w8 a(w8 w8Var, String str) {
        Cursor cursor;
        w8 w8Var2;
        long j;
        Cursor cursor2;
        Pair pair;
        Object obj;
        Pair pair2;
        String y3 = w8Var.y();
        List v10 = w8Var.v();
        c cVar = this.f9034d;
        j4 j4Var = cVar.f9150e;
        j4 j4Var2 = cVar.f9150e;
        q1 q1Var = (q1) cVar.f1478d;
        j4Var.j0();
        z8 C = l4.C(w8Var, "_eid");
        Long l10 = (Long) (C == null ? null : l4.K(C));
        if (l10 != null) {
            ?? equals = y3.equals("_ep");
            if (equals != 0) {
                j4Var.j0();
                z8 C2 = l4.C(w8Var, "_en");
                String str2 = (String) (C2 == null ? null : l4.K(C2));
                if (TextUtils.isEmpty(str2)) {
                    v0 v0Var = q1Var.f8937t;
                    q1.l(v0Var);
                    v0Var.f9051u.b(l10, "Extra parameter without an event name. eventId");
                    return null;
                }
                if (this.f9031a == null || this.f9032b == null || l10.longValue() != this.f9032b.longValue()) {
                    m mVar = j4Var.f8762i;
                    j4.T(mVar);
                    q1 q1Var2 = (q1) mVar.f1478d;
                    mVar.s();
                    mVar.t();
                    try {
                        try {
                            cursor2 = mVar.j0().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l10.toString()});
                            try {
                                if (cursor2.moveToFirst()) {
                                    w8Var2 = null;
                                    try {
                                        try {
                                            Pair create = Pair.create((w8) ((v8) l4.d0(w8.J(), cursor2.getBlob(0))).d(), Long.valueOf(cursor2.getLong(1)));
                                            cursor2.close();
                                            pair2 = create;
                                        } catch (IOException e2) {
                                            v0 v0Var2 = q1Var2.f8937t;
                                            q1.l(v0Var2);
                                            j = 0;
                                            try {
                                                v0Var2.f9050t.d("Failed to merge main event. appId, eventId", v0.A(str), l10, e2);
                                            } catch (SQLiteException e9) {
                                                e = e9;
                                                v0 v0Var3 = q1Var2.f8937t;
                                                q1.l(v0Var3);
                                                v0Var3.f9050t.b(e, "Error selecting main event");
                                            }
                                            cursor2.close();
                                            pair = w8Var2;
                                            if (pair != 0) {
                                            }
                                            v0 v0Var4 = q1Var.f8937t;
                                            q1.l(v0Var4);
                                            v0Var4.f9051u.c(str2, l10, "Extra parameter without existing main event. eventName, eventId");
                                            return w8Var2;
                                        }
                                    } catch (SQLiteException e10) {
                                        e = e10;
                                        j = 0;
                                        v0 v0Var32 = q1Var2.f8937t;
                                        q1.l(v0Var32);
                                        v0Var32.f9050t.b(e, "Error selecting main event");
                                    }
                                } else {
                                    v0 v0Var5 = q1Var2.f8937t;
                                    q1.l(v0Var5);
                                    v0Var5.B.a("Main event not found");
                                    cursor2.close();
                                    pair2 = null;
                                    w8Var2 = null;
                                }
                                j = 0;
                                pair = pair2;
                            } catch (SQLiteException e11) {
                                e = e11;
                                w8Var2 = null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = equals;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e12) {
                        e = e12;
                        w8Var2 = null;
                        j = 0;
                        cursor2 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = null;
                        if (cursor != null) {
                        }
                        throw th;
                    }
                    if (pair != 0 || (obj = pair.first) == null) {
                        v0 v0Var42 = q1Var.f8937t;
                        q1.l(v0Var42);
                        v0Var42.f9051u.c(str2, l10, "Extra parameter without existing main event. eventName, eventId");
                        return w8Var2;
                    }
                    this.f9031a = (w8) obj;
                    this.f9033c = ((Long) pair.second).longValue();
                    j4Var2.j0();
                    this.f9032b = (Long) l4.E(this.f9031a, "_eid");
                } else {
                    j = 0;
                }
                long j3 = this.f9033c - 1;
                this.f9033c = j3;
                if (j3 <= j) {
                    m mVar2 = j4Var2.f8762i;
                    j4.T(mVar2);
                    q1 q1Var3 = (q1) mVar2.f1478d;
                    mVar2.s();
                    v0 v0Var6 = q1Var3.f8937t;
                    q1.l(v0Var6);
                    v0Var6.B.b(str, "Clearing complex main event info. appId");
                    try {
                        mVar2.j0().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e13) {
                        v0 v0Var7 = q1Var3.f8937t;
                        q1.l(v0Var7);
                        v0Var7.f9050t.b(e13, "Error clearing complex main event");
                    }
                } else {
                    m mVar3 = j4Var2.f8762i;
                    j4.T(mVar3);
                    mVar3.K(str, l10, this.f9033c, this.f9031a);
                }
                ArrayList arrayList = new ArrayList();
                for (z8 z8Var : this.f9031a.v()) {
                    j4Var2.j0();
                    if (l4.C(w8Var, z8Var.u()) == null) {
                        arrayList.add(z8Var);
                    }
                }
                if (arrayList.isEmpty()) {
                    v0 v0Var8 = q1Var.f8937t;
                    q1.l(v0Var8);
                    v0Var8.f9051u.b(str2, "No unique parameters in main event. eventName");
                } else {
                    arrayList.addAll(v10);
                    v10 = arrayList;
                }
                y3 = str2;
            } else {
                this.f9032b = l10;
                this.f9031a = w8Var;
                j4Var.j0();
                z8 C3 = l4.C(w8Var, "_epc");
                Object K = C3 == null ? null : l4.K(C3);
                long longValue = ((Long) (K != null ? K : 0L)).longValue();
                this.f9033c = longValue;
                if (longValue <= 0) {
                    v0 v0Var9 = q1Var.f8937t;
                    q1.l(v0Var9);
                    v0Var9.f9051u.b(y3, "Complex event with zero extra param count. eventName");
                } else {
                    m mVar4 = j4Var.f8762i;
                    j4.T(mVar4);
                    mVar4.K(str, l10, this.f9033c, w8Var);
                }
            }
        }
        v8 v8Var = (v8) w8Var.k();
        v8Var.n(y3);
        v8Var.b();
        ((w8) v8Var.f2389e).N();
        v8Var.b();
        ((w8) v8Var.f2389e).M(v10);
        return (w8) v8Var.d();
    }
}
