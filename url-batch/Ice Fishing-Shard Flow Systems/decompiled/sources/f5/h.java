package f5;

import c4.EnumC0298d;
import c4.EnumC0307m;
import c4.InterfaceC0308n;
import com.onesignal.inAppMessages.internal.display.impl.m;
import kotlin.jvm.internal.C0643h;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public enum h implements InterfaceC0308n {
    SEVERITY_NUMBER_UNSPECIFIED(0),
    SEVERITY_NUMBER_TRACE(1),
    SEVERITY_NUMBER_TRACE2(2),
    SEVERITY_NUMBER_TRACE3(3),
    SEVERITY_NUMBER_TRACE4(4),
    SEVERITY_NUMBER_DEBUG(5),
    SEVERITY_NUMBER_DEBUG2(6),
    SEVERITY_NUMBER_DEBUG3(7),
    SEVERITY_NUMBER_DEBUG4(8),
    SEVERITY_NUMBER_INFO(9),
    SEVERITY_NUMBER_INFO2(10),
    SEVERITY_NUMBER_INFO3(11),
    SEVERITY_NUMBER_INFO4(12),
    SEVERITY_NUMBER_WARN(13),
    SEVERITY_NUMBER_WARN2(14),
    SEVERITY_NUMBER_WARN3(15),
    SEVERITY_NUMBER_WARN4(16),
    SEVERITY_NUMBER_ERROR(17),
    SEVERITY_NUMBER_ERROR2(18),
    SEVERITY_NUMBER_ERROR3(19),
    SEVERITY_NUMBER_ERROR4(20),
    SEVERITY_NUMBER_FATAL(21),
    SEVERITY_NUMBER_FATAL2(22),
    SEVERITY_NUMBER_FATAL3(23),
    SEVERITY_NUMBER_FATAL4(24);


    /* renamed from: I, reason: collision with root package name */
    public static final g f4834I;

    /* renamed from: d, reason: collision with root package name */
    public final int f4853d;

    static {
        h hVar = SEVERITY_NUMBER_UNSPECIFIED;
        EnumC0307m syntax = EnumC0307m.f4252i;
        Intrinsics.checkNotNullParameter(h.class, m.EVENT_TYPE_KEY);
        Intrinsics.checkNotNullParameter(syntax, "syntax");
        Intrinsics.checkNotNullParameter(h.class, "<this>");
        C0643h type = E.a(h.class);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
        f4834I = new g(EnumC0298d.f4212e, type, syntax, hVar);
    }

    h(int i2) {
        this.f4853d = i2;
    }
}
