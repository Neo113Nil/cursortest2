package v0;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;

/* renamed from: v0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0960d extends WebMessagePort.WebMessageCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8190a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0.o f8191b;

    public /* synthetic */ C0960d(u0.o oVar, int i2) {
        this.f8190a = i2;
        this.f8191b = oVar;
    }

    @Override // android.webkit.WebMessagePort.WebMessageCallback
    public final void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
        switch (this.f8190a) {
            case 0:
                this.f8191b.onMessage(new B(webMessagePort), AbstractC0962f.d(webMessage));
                break;
            default:
                this.f8191b.onMessage(new B(webMessagePort), AbstractC0962f.d(webMessage));
                break;
        }
    }
}
