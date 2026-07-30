package l5;

import J4.l;
import J4.q;
import J4.s;
import S.i;
import S.j;
import com.appsflyer.attribution.RequestError;
import com.onesignal.inAppMessages.internal.display.impl.m;
import java.util.function.Supplier;

/* renamed from: l5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0666d implements InterfaceC0664b {

    /* renamed from: i, reason: collision with root package name */
    public static final H4.e f6285i = H4.e.a(C4.e.f301d, m.EVENT_TYPE_KEY);
    public static final H4.e j = H4.e.a(C4.e.f302e, "success");

    /* renamed from: a, reason: collision with root package name */
    public final Supplier f6286a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6287b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6288c;

    /* renamed from: d, reason: collision with root package name */
    public final C4.b f6289d;

    /* renamed from: e, reason: collision with root package name */
    public final C4.b f6290e;

    /* renamed from: f, reason: collision with root package name */
    public final C4.b f6291f;

    /* renamed from: g, reason: collision with root package name */
    public volatile l f6292g;

    /* renamed from: h, reason: collision with root package name */
    public volatile l f6293h;

    public C0666d(Supplier supplier, x5.l lVar) {
        String str;
        String str2;
        String str3;
        this.f6286a = supplier;
        switch (lVar.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
            case j.BYTES_FIELD_NUMBER /* 8 */:
                str = "otlp";
                break;
            case 9:
            case 10:
                str = "zipkin";
                break;
            case RequestError.STOP_TRACKING /* 11 */:
                throw new IllegalArgumentException("Profiles are not supported");
            default:
                throw new IllegalArgumentException("Not a supported exporter type: " + lVar);
        }
        this.f6287b = str;
        switch (lVar.ordinal()) {
            case 0:
            case 3:
            case 6:
                str2 = "grpc";
                break;
            case 1:
            case 4:
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
                str2 = "http";
                break;
            case 2:
            case 5:
            case j.BYTES_FIELD_NUMBER /* 8 */:
            case 10:
                str2 = "http-json";
                break;
            case RequestError.STOP_TRACKING /* 11 */:
                throw new IllegalArgumentException("Profiles are not supported");
            default:
                throw new IllegalArgumentException("Not a supported exporter type: " + lVar);
        }
        this.f6288c = str2;
        C4.d dVar = new C4.d(0);
        int i2 = lVar.f8401e;
        int b7 = i.b(i2);
        if (b7 == 0) {
            str3 = "span";
        } else if (b7 == 1) {
            str3 = "metric";
        } else {
            if (b7 != 2) {
                if (b7 == 3) {
                    throw new IllegalArgumentException("Profiles are not supported");
                }
                throw new IllegalArgumentException("Unhandled signal type: ".concat(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "null" : "PROFILE" : "LOG" : "METRIC" : "SPAN"));
            }
            str3 = "log";
        }
        dVar.e(f6285i, str3);
        C4.b b8 = dVar.b();
        this.f6289d = b8;
        C4.d e7 = b8.e();
        Boolean bool = Boolean.TRUE;
        H4.e eVar = j;
        e7.e(eVar, bool);
        this.f6290e = e7.b();
        C4.d e8 = b8.e();
        e8.e(eVar, Boolean.FALSE);
        this.f6291f = e8.b();
    }

    @Override // l5.InterfaceC0664b
    public final AbstractC0663a a(int i2) {
        return new C0665c(this, i2);
    }

    public final l b() {
        l lVar = this.f6293h;
        if (lVar != null && !C0670h.e(lVar)) {
            return lVar;
        }
        l build = c().d(this.f6287b + ".exporter.exported").build();
        this.f6293h = build;
        return build;
    }

    public final q c() {
        s sVar = (s) this.f6286a.get();
        if (sVar == null) {
            sVar = J4.h.f1386d;
        }
        return sVar.a("io.opentelemetry.exporters." + this.f6287b + "-" + this.f6288c).mo5build();
    }
}
