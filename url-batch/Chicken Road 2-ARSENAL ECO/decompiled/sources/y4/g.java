package y4;

import com.onesignal.inAppMessages.internal.display.impl.a;
import z3.i;
import z3.n;

/* loaded from: classes.dex */
public final class g extends i {
    public static h h(int i7) {
        switch (i7) {
            case 0:
                return h.SEVERITY_NUMBER_UNSPECIFIED;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return h.SEVERITY_NUMBER_TRACE;
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return h.SEVERITY_NUMBER_TRACE2;
            case 3:
                return h.SEVERITY_NUMBER_TRACE3;
            case 4:
                return h.SEVERITY_NUMBER_TRACE4;
            case 5:
                return h.SEVERITY_NUMBER_DEBUG;
            case 6:
                return h.SEVERITY_NUMBER_DEBUG2;
            case 7:
                return h.SEVERITY_NUMBER_DEBUG3;
            case 8:
                return h.SEVERITY_NUMBER_DEBUG4;
            case 9:
                return h.SEVERITY_NUMBER_INFO;
            case com.onesignal.core.internal.config.e.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                return h.SEVERITY_NUMBER_INFO2;
            case 11:
                return h.SEVERITY_NUMBER_INFO3;
            case 12:
                return h.SEVERITY_NUMBER_INFO4;
            case 13:
                return h.SEVERITY_NUMBER_WARN;
            case 14:
                return h.SEVERITY_NUMBER_WARN2;
            case 15:
                return h.SEVERITY_NUMBER_WARN3;
            case 16:
                return h.SEVERITY_NUMBER_WARN4;
            case 17:
                return h.SEVERITY_NUMBER_ERROR;
            case 18:
                return h.SEVERITY_NUMBER_ERROR2;
            case 19:
                return h.SEVERITY_NUMBER_ERROR3;
            case 20:
                return h.SEVERITY_NUMBER_ERROR4;
            case 21:
                return h.SEVERITY_NUMBER_FATAL;
            case 22:
                return h.SEVERITY_NUMBER_FATAL2;
            case 23:
                return h.SEVERITY_NUMBER_FATAL3;
            case 24:
                return h.SEVERITY_NUMBER_FATAL4;
            default:
                return null;
        }
    }

    @Override // z3.i
    public final Object b(V5.g reader) {
        kotlin.jvm.internal.i.e(reader, "reader");
        int l7 = ((z3.a) reader.f2734g).l();
        h h7 = h(l7);
        if (h7 != null) {
            return h7;
        }
        throw new z3.h(l7, this.f6324b);
    }

    @Override // z3.i
    public final Object c(z3.a aVar) {
        int l7 = aVar.l();
        h h7 = h(l7);
        if (h7 != null) {
            return h7;
        }
        throw new z3.h(l7, this.f6324b);
    }

    @Override // z3.i
    public final void d(a6.d writer, Object obj) {
        n value = (n) obj;
        kotlin.jvm.internal.i.e(writer, "writer");
        kotlin.jvm.internal.i.e(value, "value");
        writer.n(((h) value).f6282f);
    }

    @Override // z3.i
    public final int f(Object obj) {
        n value = (n) obj;
        kotlin.jvm.internal.i.e(value, "value");
        return 1;
    }
}
