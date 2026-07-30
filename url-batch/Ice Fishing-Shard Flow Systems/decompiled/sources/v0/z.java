package v0;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* loaded from: classes.dex */
public final class z implements WebMessageBoundaryInterface {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f8211b = {"WEB_MESSAGE_ARRAY_BUFFER"};

    /* renamed from: a, reason: collision with root package name */
    public final u0.n f8212a;

    public z(u0.n nVar) {
        this.f8212a = nVar;
    }

    public static u0.n a(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        u0.p[] pVarArr = new u0.p[ports.length];
        for (int i2 = 0; i2 < ports.length; i2++) {
            pVarArr[i2] = new B(ports[i2]);
        }
        if (!F.f8170u.b()) {
            return new u0.n(webMessageBoundaryInterface.getData(), pVarArr);
        }
        WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) V6.b.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
        int type = webMessagePayloadBoundaryInterface.getType();
        if (type == 0) {
            return new u0.n(webMessagePayloadBoundaryInterface.getAsString(), pVarArr);
        }
        if (type != 1) {
            return null;
        }
        return new u0.n(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), pVarArr);
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public final String getData() {
        u0.n nVar = this.f8212a;
        nVar.a(0);
        return nVar.f8058b;
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public final InvocationHandler getMessagePayload() {
        C0956A c0956a;
        u0.n nVar = this.f8212a;
        int i2 = nVar.f8060d;
        if (i2 == 0) {
            nVar.a(0);
            c0956a = new C0956A(nVar.f8058b);
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("Unknown web message payload type: " + i2);
            }
            nVar.a(1);
            byte[] bArr = nVar.f8059c;
            Objects.requireNonNull(bArr);
            c0956a = new C0956A(bArr);
        }
        return new V6.a(c0956a);
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public final InvocationHandler[] getPorts() {
        u0.p[] pVarArr = this.f8212a.f8057a;
        if (pVarArr == null) {
            return null;
        }
        InvocationHandler[] invocationHandlerArr = new InvocationHandler[pVarArr.length];
        for (int i2 = 0; i2 < pVarArr.length; i2++) {
            invocationHandlerArr[i2] = Proxy.getInvocationHandler(((B) pVarArr[i2]).b());
        }
        return invocationHandlerArr;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return f8211b;
    }
}
