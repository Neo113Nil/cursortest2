package y0;

import Q.k;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import com.onesignal.core.internal.permissions.h;
import com.onesignal.inAppMessages.internal.display.impl.a;
import i6.g;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import l0.q;
import l5.AbstractC0506j;
import u0.C0677g;
import u0.C0679i;
import u0.C0680j;
import u0.C0682l;
import u0.C0686p;
import u0.C0689s;

/* renamed from: y0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0756b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6224a;

    static {
        String f7 = q.f("DiagnosticsWrkr");
        i.d(f7, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f6224a = f7;
    }

    public static final String a(C0682l c0682l, C0689s c0689s, C0679i c0679i, ArrayList arrayList) {
        String str;
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            C0686p c0686p = (C0686p) obj;
            C0680j n7 = g.n(c0686p);
            String str2 = c0686p.f6000a;
            C0677g b7 = c0679i.b(n7);
            Integer valueOf = b7 != null ? Integer.valueOf(b7.f5979c) : null;
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c0682l.f5989f;
            k e4 = k.e("SELECT name FROM workname WHERE work_spec_id=?", 1);
            if (str2 == null) {
                e4.o(1);
            } else {
                e4.B(str2, 1);
            }
            workDatabase_Impl.b();
            Cursor m4 = workDatabase_Impl.m(e4);
            try {
                ArrayList arrayList2 = new ArrayList(m4.getCount());
                while (m4.moveToNext()) {
                    arrayList2.add(m4.isNull(0) ? null : m4.getString(0));
                }
                m4.close();
                e4.g();
                String I6 = AbstractC0506j.I(arrayList2, ",", null, null, null, 62);
                String I7 = AbstractC0506j.I(c0689s.s(str2), ",", null, null, null, 62);
                StringBuilder sb2 = new StringBuilder("\n");
                sb2.append(str2);
                sb2.append("\t ");
                sb2.append(c0686p.f6002c);
                sb2.append("\t ");
                sb2.append(valueOf);
                sb2.append("\t ");
                switch (c0686p.f6001b) {
                    case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                        str = "ENQUEUED";
                        break;
                    case h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
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
                sb2.append(I6);
                sb2.append("\t ");
                sb2.append(I7);
                sb2.append('\t');
                sb.append(sb2.toString());
            } catch (Throwable th) {
                m4.close();
                e4.g();
                throw th;
            }
        }
        String sb3 = sb.toString();
        i.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
