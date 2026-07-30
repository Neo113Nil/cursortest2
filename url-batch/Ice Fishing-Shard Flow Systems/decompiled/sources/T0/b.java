package T0;

import G0.s;
import P0.g;
import P0.i;
import P0.j;
import P0.l;
import P0.p;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import h0.C0465k;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2562a;

    static {
        String f7 = s.f("DiagnosticsWrkr");
        Intrinsics.checkNotNullExpressionValue(f7, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f2562a = f7;
    }

    public static final String a(l lVar, P0.s sVar, i iVar, ArrayList arrayList) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            p pVar = (p) obj;
            j x7 = AbstractC1053a.x(pVar);
            String str = pVar.f2220a;
            g h7 = iVar.h(x7);
            Integer valueOf = h7 != null ? Integer.valueOf(h7.f2198c) : null;
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) lVar.f2209e;
            C0465k g7 = C0465k.g(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str == null) {
                g7.l(1);
            } else {
                g7.f(1, str);
            }
            workDatabase_Impl.b();
            Cursor J7 = V6.b.J(workDatabase_Impl, g7);
            try {
                ArrayList arrayList2 = new ArrayList(J7.getCount());
                while (J7.moveToNext()) {
                    arrayList2.add(J7.isNull(0) ? null : J7.getString(0));
                }
                J7.close();
                g7.h();
                sb.append("\n" + str + "\t " + pVar.f2222c + "\t " + valueOf + "\t " + pVar.f2221b.name() + "\t " + CollectionsKt.s(arrayList2, ",", null, null, null, 62) + "\t " + CollectionsKt.s(sVar.w(str), ",", null, null, null, 62) + '\t');
            } catch (Throwable th) {
                J7.close();
                g7.h();
                throw th;
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
