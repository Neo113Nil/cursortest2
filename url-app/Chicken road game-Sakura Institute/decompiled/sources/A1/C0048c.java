package A1;

import G.InterfaceC0191c0;
import com.appsflyer.attribution.RequestError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import q.AbstractC1024c;

/* renamed from: A1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0048c implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f573d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f574e;

    public /* synthetic */ C0048c(int i2, InterfaceC0191c0 interfaceC0191c0) {
        this.f573d = i2;
        this.f574e = interfaceC0191c0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f573d) {
            case 0:
                this.f574e.setValue(Boolean.FALSE);
                break;
            case 1:
                this.f574e.setValue(Boolean.FALSE);
                break;
            case 2:
                this.f574e.setValue(Boolean.TRUE);
                break;
            case 3:
                this.f574e.setValue(Boolean.TRUE);
                break;
            case 4:
                this.f574e.setValue(Boolean.FALSE);
                break;
            case 5:
                this.f574e.setValue(Boolean.TRUE);
                break;
            case 6:
                this.f574e.setValue(Boolean.TRUE);
                break;
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f574e.setValue(Boolean.FALSE);
                break;
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                InterfaceC0191c0 interfaceC0191c0 = this.f574e;
                if (((Number) interfaceC0191c0.getValue()).intValue() > 0) {
                    interfaceC0191c0.setValue(Integer.valueOf(((Number) interfaceC0191c0.getValue()).intValue() - 1));
                }
                break;
            case AbstractC1024c.f9242c /* 9 */:
                this.f574e.setValue(Boolean.TRUE);
                break;
            case 10:
                this.f574e.setValue(Boolean.TRUE);
                break;
            case RequestError.STOP_TRACKING /* 11 */:
                this.f574e.setValue(Boolean.FALSE);
                break;
            case 12:
                this.f574e.setValue(Boolean.TRUE);
                break;
            case 13:
                this.f574e.setValue(Boolean.TRUE);
                break;
            case 14:
                this.f574e.setValue(Boolean.TRUE);
                break;
            case AbstractC1024c.f9246g /* 15 */:
                this.f574e.setValue(Boolean.TRUE);
                break;
            case 16:
                this.f574e.setValue(Boolean.FALSE);
                break;
            case 17:
                this.f574e.setValue(0);
                break;
            case 18:
                this.f574e.setValue(1);
                break;
            case 19:
                this.f574e.setValue(Boolean.FALSE);
                break;
            case 20:
                this.f574e.setValue(Boolean.FALSE);
                break;
            case 21:
                this.f574e.setValue(null);
                break;
            case 22:
                this.f574e.setValue(Boolean.TRUE);
                break;
            case 23:
                this.f574e.setValue(Boolean.TRUE);
                break;
            case 24:
                this.f574e.setValue(null);
                break;
            case 25:
                this.f574e.setValue(0);
                break;
            case 26:
                this.f574e.setValue(1);
                break;
            case 27:
                this.f574e.setValue(2);
                break;
            case 28:
                this.f574e.setValue(Boolean.TRUE);
                break;
            default:
                this.f574e.setValue(Boolean.TRUE);
                break;
        }
        return Unit.f7487a;
    }
}
