package F0;

import B0.g;
import B0.l;
import B0.q;
import B0.t;
import X.k;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import g4.AbstractC0465j;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import s0.s;
import u1.AbstractC1477a;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f673a;

    static {
        String f3 = s.f("DiagnosticsWrkr");
        i.d(f3, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f673a = f3;
    }

    public static final String a(l lVar, t tVar, B0.i iVar, ArrayList arrayList) {
        String str;
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            g a6 = iVar.a(AbstractC1477a.p(qVar));
            Integer valueOf = a6 != null ? Integer.valueOf(a6.f150c) : null;
            lVar.getClass();
            k c2 = k.c(1, "SELECT name FROM workname WHERE work_spec_id=?");
            String str2 = qVar.f173a;
            if (str2 == null) {
                c2.j(1);
            } else {
                c2.f(1, str2);
            }
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) lVar.f163b;
            workDatabase_Impl.b();
            Cursor m6 = workDatabase_Impl.m(c2, null);
            try {
                ArrayList arrayList2 = new ArrayList(m6.getCount());
                while (m6.moveToNext()) {
                    arrayList2.add(m6.isNull(0) ? null : m6.getString(0));
                }
                m6.close();
                c2.g();
                String K02 = AbstractC0465j.K0(arrayList2, StringUtils.COMMA, null, null, null, 62);
                String K03 = AbstractC0465j.K0(tVar.h(str2), StringUtils.COMMA, null, null, null, 62);
                StringBuilder sb2 = new StringBuilder("\n");
                sb2.append(str2);
                sb2.append("\t ");
                sb2.append(qVar.f175c);
                sb2.append("\t ");
                sb2.append(valueOf);
                sb2.append("\t ");
                switch (qVar.f174b) {
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
                sb2.append(str);
                sb2.append("\t ");
                sb2.append(K02);
                sb2.append("\t ");
                sb2.append(K03);
                sb2.append('\t');
                sb.append(sb2.toString());
            } catch (Throwable th) {
                m6.close();
                c2.g();
                throw th;
            }
        }
        String sb3 = sb.toString();
        i.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
