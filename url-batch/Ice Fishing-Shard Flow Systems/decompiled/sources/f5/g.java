package f5;

import S.j;
import c4.AbstractC0303i;
import c4.C0295a;
import c4.C0302h;
import c4.InterfaceC0308n;
import com.appsflyer.attribution.RequestError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends AbstractC0303i {
    public static h i(int i2) {
        switch (i2) {
            case 0:
                return h.SEVERITY_NUMBER_UNSPECIFIED;
            case 1:
                return h.SEVERITY_NUMBER_TRACE;
            case 2:
                return h.SEVERITY_NUMBER_TRACE2;
            case 3:
                return h.SEVERITY_NUMBER_TRACE3;
            case 4:
                return h.SEVERITY_NUMBER_TRACE4;
            case 5:
                return h.SEVERITY_NUMBER_DEBUG;
            case 6:
                return h.SEVERITY_NUMBER_DEBUG2;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                return h.SEVERITY_NUMBER_DEBUG3;
            case j.BYTES_FIELD_NUMBER /* 8 */:
                return h.SEVERITY_NUMBER_DEBUG4;
            case 9:
                return h.SEVERITY_NUMBER_INFO;
            case 10:
                return h.SEVERITY_NUMBER_INFO2;
            case RequestError.STOP_TRACKING /* 11 */:
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

    @Override // c4.AbstractC0303i
    public final Object b(B.f reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        int l7 = ((C0295a) reader.f152e).l();
        h i2 = i(l7);
        if (i2 != null) {
            return i2;
        }
        throw new C0302h(l7, this.f4238b);
    }

    @Override // c4.AbstractC0303i
    public final Object c(C0295a reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        int l7 = reader.l();
        h i2 = i(l7);
        if (i2 != null) {
            return i2;
        }
        throw new C0302h(l7, this.f4238b);
    }

    @Override // c4.AbstractC0303i
    public final void e(l2.c writer, Object obj) {
        InterfaceC0308n value = (InterfaceC0308n) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.H(((h) value).f4853d);
    }

    @Override // c4.AbstractC0303i
    public final int g(Object obj) {
        InterfaceC0308n value = (InterfaceC0308n) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        int i2 = ((h) value).f4853d;
        return 1;
    }
}
