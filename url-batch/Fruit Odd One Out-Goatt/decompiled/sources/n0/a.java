package n0;

import android.util.Log;
import e0.h0;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f926a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f927b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f928c;

    public /* synthetic */ a(int i2, Object obj, Object obj2) {
        this.f926a = i2;
        this.f928c = obj;
        this.f927b = obj2;
    }

    @Override // n0.d
    public final void a(ByteBuffer byteBuffer) {
        switch (this.f926a) {
            case 0:
                h0 h0Var = (h0) this.f928c;
                try {
                    ((b) this.f927b).o(((h) h0Var.f153c).a(byteBuffer));
                    break;
                } catch (RuntimeException e2) {
                    Log.e("BasicMessageChannel#".concat((String) h0Var.f152b), "Failed to handle message reply", e2);
                    return;
                }
            default:
                h0 h0Var2 = (h0) this.f928c;
                m0.k kVar = (m0.k) this.f927b;
                try {
                    if (byteBuffer == null) {
                        kVar.b();
                    } else {
                        try {
                            kVar.d(((j) h0Var2.f153c).e(byteBuffer));
                        } catch (f e3) {
                            kVar.a(e3.f929b, e3.getMessage(), e3.f930c);
                        }
                    }
                    break;
                } catch (RuntimeException e4) {
                    Log.e("MethodChannel#".concat((String) h0Var2.f152b), "Failed to handle method call result", e4);
                    return;
                }
        }
    }
}
