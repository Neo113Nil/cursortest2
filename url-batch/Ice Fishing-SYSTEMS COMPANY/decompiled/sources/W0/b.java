package W0;

import J0.s;
import S0.g;
import S0.i;
import S0.l;
import S0.p;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.ads.CL;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.h;
import r7.AbstractC4979j;
import u0.C5098i;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3414a;

    static {
        String f6 = s.f("DiagnosticsWrkr");
        h.d(f6, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f3414a = f6;
    }

    public static final String a(l lVar, S0.s sVar, i iVar, ArrayList arrayList) {
        String str;
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            g m8 = iVar.m(U2.a.e(pVar));
            Integer valueOf = m8 != null ? Integer.valueOf(m8.f2898c) : null;
            lVar.getClass();
            C5098i a9 = C5098i.a(1, "SELECT name FROM workname WHERE work_spec_id=?");
            String str2 = pVar.f2920a;
            if (str2 == null) {
                a9.o(1);
            } else {
                a9.c(1, str2);
            }
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) lVar.f2910u;
            workDatabase_Impl.b();
            Cursor m9 = workDatabase_Impl.m(a9);
            try {
                ArrayList arrayList2 = new ArrayList(m9.getCount());
                while (m9.moveToNext()) {
                    arrayList2.add(m9.isNull(0) ? null : m9.getString(0));
                }
                m9.close();
                a9.j();
                String K8 = AbstractC4979j.K(arrayList2, ",", null, null, null, 62);
                String K9 = AbstractC4979j.K(sVar.f(str2), ",", null, null, null, 62);
                StringBuilder m10 = CL.m("\n", str2, "\t ");
                m10.append(pVar.f2922c);
                m10.append("\t ");
                m10.append(valueOf);
                m10.append("\t ");
                switch (pVar.f2921b) {
                    case 1:
                        str = "ENQUEUED";
                        break;
                    case 2:
                        str = "RUNNING";
                        break;
                    case 3:
                        str = "SUCCEEDED";
                        break;
                    case 4:
                        str = "FAILED";
                        break;
                    case 5:
                        str = "BLOCKED";
                        break;
                    case 6:
                        str = "CANCELLED";
                        break;
                    default:
                        throw null;
                }
                m10.append(str);
                m10.append("\t ");
                m10.append(K8);
                m10.append("\t ");
                m10.append(K9);
                m10.append('\t');
                sb.append(m10.toString());
            } catch (Throwable th) {
                m9.close();
                a9.j();
                throw th;
            }
        }
        String sb2 = sb.toString();
        h.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
