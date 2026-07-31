package E4;

import D3.M;
import N.p;
import c4.C0289h;
import c4.l;
import c4.q;
import c4.s;
import com.onesignal.inAppMessages.internal.display.impl.a;
import com.onesignal.inAppMessages.internal.display.impl.n;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: i, reason: collision with root package name */
    public static final a4.e f664i = a4.e.a(V3.b.f2707f, n.EVENT_TYPE_KEY);

    /* renamed from: j, reason: collision with root package name */
    public static final a4.e f665j = a4.e.a(V3.b.f2708g, "success");

    /* renamed from: a, reason: collision with root package name */
    public final Supplier f666a;

    /* renamed from: b, reason: collision with root package name */
    public final String f667b;

    /* renamed from: c, reason: collision with root package name */
    public final String f668c;

    /* renamed from: d, reason: collision with root package name */
    public final V3.a f669d;

    /* renamed from: e, reason: collision with root package name */
    public final V3.a f670e;

    /* renamed from: f, reason: collision with root package name */
    public final V3.a f671f;

    /* renamed from: g, reason: collision with root package name */
    public volatile l f672g;

    /* renamed from: h, reason: collision with root package name */
    public volatile l f673h;

    public d(Supplier supplier, Q4.l lVar) {
        String str;
        String str2;
        String str3;
        this.f666a = supplier;
        switch (lVar.ordinal()) {
            case 0:
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                str = "otlp";
                break;
            case 9:
            case com.onesignal.core.internal.config.e.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                str = "zipkin";
                break;
            case 11:
                throw new IllegalArgumentException("Profiles are not supported");
            default:
                throw new IllegalArgumentException("Not a supported exporter type: " + lVar);
        }
        this.f667b = str;
        switch (lVar.ordinal()) {
            case 0:
            case 3:
            case 6:
                str2 = "grpc";
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
            case 4:
            case 7:
            case 9:
                str2 = "http";
                break;
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
            case 5:
            case 8:
            case com.onesignal.core.internal.config.e.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                str2 = "http-json";
                break;
            case 11:
                throw new IllegalArgumentException("Profiles are not supported");
            default:
                throw new IllegalArgumentException("Not a supported exporter type: " + lVar);
        }
        this.f668c = str2;
        M m4 = new M(27);
        int i7 = lVar.f2037g;
        int c7 = p.c(i7);
        if (c7 == 0) {
            str3 = "span";
        } else if (c7 == 1) {
            str3 = "metric";
        } else {
            if (c7 != 2) {
                if (c7 == 3) {
                    throw new IllegalArgumentException("Profiles are not supported");
                }
                throw new IllegalArgumentException("Unhandled signal type: ".concat(i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "null" : "PROFILE" : "LOG" : "METRIC" : "SPAN"));
            }
            str3 = "log";
        }
        m4.u(f664i, str3);
        V3.a t6 = m4.t();
        this.f669d = t6;
        M e4 = t6.e();
        Boolean bool = Boolean.TRUE;
        a4.e eVar = f665j;
        e4.u(eVar, bool);
        this.f670e = e4.t();
        M e7 = t6.e();
        e7.u(eVar, Boolean.FALSE);
        this.f671f = e7.t();
    }

    @Override // E4.b
    public final a a(int i7) {
        return new c(this, i7);
    }

    public final l b() {
        l lVar = this.f673h;
        if (lVar != null && !h.e(lVar)) {
            return lVar;
        }
        l build = c().d(this.f667b + ".exporter.exported").build();
        this.f673h = build;
        return build;
    }

    public final q c() {
        s sVar = (s) this.f666a.get();
        if (sVar == null) {
            sVar = C0289h.f3817f;
        }
        return sVar.a("io.opentelemetry.exporters." + this.f667b + "-" + this.f668c).build();
    }
}
