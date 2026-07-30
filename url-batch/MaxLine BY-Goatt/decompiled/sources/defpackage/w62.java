package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class w62 {
    public final /* synthetic */ int a = 1;
    public long b;
    public Object c;
    public Object d;
    public final Object e;

    public w62(pt2 pt2Var) {
        pt2Var.getClass();
        TimeUnit.MINUTES.getClass();
        this.b = 300000000000L;
        this.c = pt2Var.e();
        this.d = new ty0(this, q40.p(new StringBuilder(), n33.f, " ConnectionPool"));
        this.e = new ConcurrentLinkedQueue();
    }

    public static w62 c(kd3 kd3Var) {
        return new w62(kd3Var.m, kd3Var.o, kd3Var.n.d(), kd3Var.p);
    }

    public boolean a(k5 k5Var, t62 t62Var, ArrayList arrayList, boolean z) {
        Iterator it = ((ConcurrentLinkedQueue) this.e).iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            v62 v62Var = (v62) it.next();
            v62Var.getClass();
            synchronized (v62Var) {
                if (z) {
                    try {
                        if (v62Var.g != null) {
                        }
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (v62Var.h(k5Var, arrayList)) {
                    t62Var.b(v62Var);
                    return true;
                }
                Unit unit2 = Unit.a;
            }
        }
    }

    public int b(v62 v62Var, long j) {
        byte[] bArr = n33.a;
        ArrayList arrayList = v62Var.p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + v62Var.b.a.h + " was leaked. Did you forget to close a response body?";
                r12 r12Var = r12.a;
                r12.a.j(((r62) reference).a, str);
                arrayList.remove(i);
                v62Var.j = true;
                if (arrayList.isEmpty()) {
                    v62Var.q = j - this.b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x012b, code lost:
    
        if (r6 != null) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cj3 d(String str, cj3 cj3Var) {
        Cursor cursor;
        cj3 cj3Var2;
        long j;
        Cursor cursor2;
        Pair pair;
        Object obj;
        Pair pair2;
        String s = cj3Var.s();
        List p = cj3Var.p();
        nb3 nb3Var = (nb3) this.e;
        oq3 oq3Var = nb3Var.n;
        oq3 oq3Var2 = nb3Var.n;
        pj3 pj3Var = (pj3) nb3Var.m;
        oq3Var.j0();
        hj3 E = bi3.E("_eid", cj3Var);
        Long l = (Long) (E == null ? null : bi3.L(E));
        if (l != null) {
            if (s.equals("_ep")) {
                oq3Var.j0();
                hj3 E2 = bi3.E("_en", cj3Var);
                String str2 = (String) (E2 == null ? null : bi3.L(E2));
                if (TextUtils.isEmpty(str2)) {
                    vh3 vh3Var = pj3Var.r;
                    pj3.m(vh3Var);
                    vh3Var.s.c(l, "Extra parameter without an event name. eventId");
                    return null;
                }
                if (((cj3) this.c) == null || ((Long) this.d) == null || l.longValue() != ((Long) this.d).longValue()) {
                    tc3 tc3Var = oq3Var.o;
                    oq3.U(tc3Var);
                    pj3 pj3Var2 = (pj3) tc3Var.m;
                    tc3Var.v();
                    tc3Var.x();
                    try {
                        cursor2 = tc3Var.l0().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                        try {
                            try {
                                if (cursor2.moveToFirst()) {
                                    cj3Var2 = null;
                                    try {
                                        try {
                                            Pair create = Pair.create((cj3) ((bj3) bi3.j0(cj3.z(), cursor2.getBlob(0))).d(), Long.valueOf(cursor2.getLong(1)));
                                            cursor2.close();
                                            pair2 = create;
                                        } catch (SQLiteException e) {
                                            e = e;
                                            j = 0;
                                            vh3 vh3Var2 = pj3Var2.r;
                                            pj3.m(vh3Var2);
                                            vh3Var2.r.c(e, "Error selecting main event");
                                        }
                                    } catch (IOException e2) {
                                        vh3 vh3Var3 = pj3Var2.r;
                                        pj3.m(vh3Var3);
                                        j = 0;
                                        try {
                                            vh3Var3.r.e("Failed to merge main event. appId, eventId", vh3.E(str), l, e2);
                                        } catch (SQLiteException e3) {
                                            e = e3;
                                            vh3 vh3Var22 = pj3Var2.r;
                                            pj3.m(vh3Var22);
                                            vh3Var22.r.c(e, "Error selecting main event");
                                        }
                                        cursor2.close();
                                        pair = cj3Var2;
                                        if (pair != 0) {
                                        }
                                        vh3 vh3Var4 = pj3Var.r;
                                        pj3.m(vh3Var4);
                                        vh3Var4.s.d(str2, l, "Extra parameter without existing main event. eventName, eventId");
                                        return cj3Var2;
                                    }
                                } else {
                                    vh3 vh3Var5 = pj3Var2.r;
                                    pj3.m(vh3Var5);
                                    vh3Var5.z.b("Main event not found");
                                    cursor2.close();
                                    pair2 = null;
                                    cj3Var2 = null;
                                }
                                j = 0;
                                pair = pair2;
                            } catch (SQLiteException e4) {
                                e = e4;
                                cj3Var2 = null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursor2;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        cj3Var2 = null;
                        j = 0;
                        cursor2 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = null;
                    }
                    if (pair != 0 || (obj = pair.first) == null) {
                        vh3 vh3Var42 = pj3Var.r;
                        pj3.m(vh3Var42);
                        vh3Var42.s.d(str2, l, "Extra parameter without existing main event. eventName, eventId");
                        return cj3Var2;
                    }
                    this.c = (cj3) obj;
                    this.b = ((Long) pair.second).longValue();
                    oq3Var2.j0();
                    this.d = (Long) bi3.F("_eid", (cj3) this.c);
                } else {
                    j = 0;
                }
                long j2 = this.b - 1;
                this.b = j2;
                if (j2 <= j) {
                    tc3 tc3Var2 = oq3Var2.o;
                    oq3.U(tc3Var2);
                    pj3 pj3Var3 = (pj3) tc3Var2.m;
                    tc3Var2.v();
                    vh3 vh3Var6 = pj3Var3.r;
                    pj3.m(vh3Var6);
                    vh3Var6.z.c(str, "Clearing complex main event info. appId");
                    try {
                        tc3Var2.l0().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e6) {
                        vh3 vh3Var7 = pj3Var3.r;
                        pj3.m(vh3Var7);
                        vh3Var7.r.c(e6, "Error clearing complex main event");
                    }
                } else {
                    tc3 tc3Var3 = oq3Var2.o;
                    oq3.U(tc3Var3);
                    tc3Var3.N(str, l, this.b, (cj3) this.c);
                }
                ArrayList arrayList = new ArrayList();
                for (hj3 hj3Var : ((cj3) this.c).p()) {
                    oq3Var2.j0();
                    if (bi3.E(hj3Var.q(), cj3Var) == null) {
                        arrayList.add(hj3Var);
                    }
                }
                if (arrayList.isEmpty()) {
                    vh3 vh3Var8 = pj3Var.r;
                    pj3.m(vh3Var8);
                    vh3Var8.s.c(str2, "No unique parameters in main event. eventName");
                } else {
                    arrayList.addAll(p);
                    p = arrayList;
                }
                s = str2;
            } else {
                this.d = l;
                this.c = cj3Var;
                oq3Var.j0();
                hj3 E3 = bi3.E("_epc", cj3Var);
                Object L = E3 == null ? null : bi3.L(E3);
                long longValue = ((Long) (L != null ? L : 0L)).longValue();
                this.b = longValue;
                if (longValue <= 0) {
                    vh3 vh3Var9 = pj3Var.r;
                    pj3.m(vh3Var9);
                    vh3Var9.s.c(s, "Complex event with zero extra param count. eventName");
                } else {
                    tc3 tc3Var4 = oq3Var.o;
                    oq3.U(tc3Var4);
                    tc3Var4.N(str, l, this.b, cj3Var);
                }
            }
        }
        bj3 bj3Var = (bj3) cj3Var.i();
        bj3Var.b();
        ((cj3) bj3Var.n).F(s);
        bj3Var.b();
        ((cj3) bj3Var.n).D();
        bj3Var.b();
        ((cj3) bj3Var.n).C(p);
        return (cj3) bj3Var.d();
    }

    public kd3 e() {
        return new kd3((String) this.c, new jd3(new Bundle((Bundle) this.e)), (String) this.d, this.b);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                String str = (String) this.d;
                String obj = ((Bundle) this.e).toString();
                int length = String.valueOf(str).length();
                String str2 = (String) this.c;
                StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + obj.length());
                sb.append("origin=");
                sb.append(str);
                sb.append(",name=");
                sb.append(str2);
                return q40.p(sb, ",params=", obj);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ w62(nb3 nb3Var) {
        this.e = nb3Var;
    }

    public w62(String str, String str2, Bundle bundle, long j) {
        this.c = str;
        this.d = str2;
        this.e = bundle;
        this.b = j;
    }
}
