package g6;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import c6.g;
import c6.i;
import c6.j;
import c6.l;
import c6.p;
import c6.s;
import cf.c;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import t5.o;
import z4.z;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4275a = o.f("DiagnosticsWrkr");

    public static final String a(l lVar, s sVar, i iVar, ArrayList arrayList) {
        String str;
        StringBuilder sb2 = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            p pVar = (p) obj;
            j A = g8.b.A(pVar);
            String str2 = pVar.f1839a;
            g f3 = iVar.f(A);
            Integer valueOf = f3 != null ? Integer.valueOf(f3.f1818c) : null;
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) lVar.f1829e;
            z a9 = z.a(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str2 == null) {
                a9.r(1);
            } else {
                a9.l(1, str2);
            }
            workDatabase_Impl.b();
            Cursor E = c.E(workDatabase_Impl, a9);
            try {
                ArrayList arrayList2 = new ArrayList(E.getCount());
                while (E.moveToNext()) {
                    arrayList2.add(E.isNull(0) ? null : E.getString(0));
                }
                E.close();
                a9.d();
                String B = CollectionsKt.B(arrayList2, ",", null, null, null, 62);
                String B2 = CollectionsKt.B(sVar.e(str2), ",", null, null, null, 62);
                StringBuilder q3 = v4.a.q("\n", str2, "\t ");
                q3.append(pVar.f1841c);
                q3.append("\t ");
                q3.append(valueOf);
                q3.append("\t ");
                switch (pVar.f1840b) {
                    case 1:
                        str = "ENQUEUED";
                        break;
                    case 2:
                        str = "RUNNING";
                        break;
                    case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                        str = "SUCCEEDED";
                        break;
                    case a4.j.LONG_FIELD_NUMBER /* 4 */:
                        str = "FAILED";
                        break;
                    case a4.j.STRING_FIELD_NUMBER /* 5 */:
                        str = "BLOCKED";
                        break;
                    case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        str = "CANCELLED";
                        break;
                    default:
                        throw null;
                }
                q3.append(str);
                q3.append("\t ");
                q3.append(B);
                q3.append("\t ");
                q3.append(B2);
                q3.append('\t');
                sb2.append(q3.toString());
            } catch (Throwable th) {
                E.close();
                a9.d();
                throw th;
            }
        }
        return sb2.toString();
    }
}
