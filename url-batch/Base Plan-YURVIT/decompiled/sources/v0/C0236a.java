package v0;

import B0.C0008i;
import F.C0032n;
import android.util.Log;
import java.nio.ByteBuffer;

/* renamed from: v0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0236a implements InterfaceC0240e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3082a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3083b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3084c;

    public /* synthetic */ C0236a(int i2, Object obj, Object obj2) {
        this.f3082a = i2;
        this.f3084c = obj;
        this.f3083b = obj2;
    }

    @Override // v0.InterfaceC0240e
    public final void a(ByteBuffer byteBuffer) {
        switch (this.f3082a) {
            case 0:
                C0032n c0032n = (C0032n) this.f3084c;
                try {
                    ((InterfaceC0238c) this.f3083b).n(((j) c0032n.f411c).b(byteBuffer));
                    break;
                } catch (RuntimeException e2) {
                    Log.e("BasicMessageChannel#" + ((String) c0032n.f410b), "Failed to handle message reply", e2);
                    return;
                }
            default:
                C0008i c0008i = (C0008i) this.f3084c;
                u0.k kVar = (u0.k) this.f3083b;
                try {
                    if (byteBuffer == null) {
                        kVar.b();
                    } else {
                        try {
                            kVar.d(((l) c0008i.f86h).e(byteBuffer));
                        } catch (C0242g e3) {
                            kVar.a(e3.f3085e, e3.getMessage(), e3.f3086f);
                        }
                    }
                    break;
                } catch (RuntimeException e4) {
                    Log.e("MethodChannel#".concat((String) c0008i.f85g), "Failed to handle method call result", e4);
                    return;
                }
        }
    }
}
