package s4;

import android.util.Log;
import java.nio.ByteBuffer;

/* renamed from: s4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0892a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7755a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7756b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7757c;

    public /* synthetic */ C0892a(Object obj, int i2, Object obj2) {
        this.f7755a = i2;
        this.f7757c = obj;
        this.f7756b = obj2;
    }

    @Override // s4.e
    public final void a(ByteBuffer byteBuffer) {
        switch (this.f7755a) {
            case 0:
                P0.i iVar = (P0.i) this.f7757c;
                try {
                    ((c) this.f7756b).g(((m) iVar.f2202c).b(byteBuffer));
                    break;
                } catch (RuntimeException e7) {
                    Log.e("BasicMessageChannel#" + ((String) iVar.f2201b), "Failed to handle message reply", e7);
                    return;
                }
            default:
                q qVar = (q) this.f7757c;
                p pVar = (p) this.f7756b;
                try {
                    if (byteBuffer == null) {
                        pVar.notImplemented();
                    } else {
                        try {
                            pVar.success(qVar.f7771c.f(byteBuffer));
                        } catch (j e8) {
                            pVar.error(e8.f7763d, e8.getMessage(), e8.f7764e);
                        }
                    }
                    break;
                } catch (RuntimeException e9) {
                    Log.e("MethodChannel#" + qVar.f7770b, "Failed to handle method call result", e9);
                    return;
                }
        }
    }
}
