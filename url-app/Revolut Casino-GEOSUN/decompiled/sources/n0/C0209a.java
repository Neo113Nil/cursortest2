package n0;

import D.C0013n;
import L.C0026b;
import android.util.Log;
import java.nio.ByteBuffer;
import m0.C0201k;

/* renamed from: n0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0209a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2779a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2780b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2781c;

    public /* synthetic */ C0209a(int i2, Object obj, Object obj2) {
        this.f2779a = i2;
        this.f2781c = obj;
        this.f2780b = obj2;
    }

    @Override // n0.e
    public final void a(ByteBuffer byteBuffer) {
        switch (this.f2779a) {
            case 0:
                C0013n c0013n = (C0013n) this.f2781c;
                try {
                    ((InterfaceC0211c) this.f2780b).e(((j) c0013n.f246c).a(byteBuffer));
                    break;
                } catch (RuntimeException e2) {
                    Log.e("BasicMessageChannel#" + ((String) c0013n.f245b), "Failed to handle message reply", e2);
                    return;
                }
            default:
                C0026b c0026b = (C0026b) this.f2781c;
                C0201k c0201k = (C0201k) this.f2780b;
                try {
                    if (byteBuffer == null) {
                        c0201k.getClass();
                    } else {
                        try {
                            c0201k.c(((l) c0026b.f522h).f(byteBuffer));
                        } catch (g e3) {
                            c0201k.a(e3.f2782e, e3.getMessage(), e3.f2783f);
                        }
                    }
                    break;
                } catch (RuntimeException e4) {
                    Log.e("MethodChannel#".concat((String) c0026b.f520f), "Failed to handle method call result", e4);
                    return;
                }
        }
    }
}
