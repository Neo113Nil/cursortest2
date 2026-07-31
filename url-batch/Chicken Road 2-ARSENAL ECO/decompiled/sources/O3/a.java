package O3;

import android.util.Log;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1764a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1765b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1766c;

    public /* synthetic */ a(Object obj, int i7, Object obj2) {
        this.f1764a = i7;
        this.f1766c = obj;
        this.f1765b = obj2;
    }

    @Override // O3.d
    public final void a(ByteBuffer byteBuffer) {
        switch (this.f1764a) {
            case 0:
                B0.c cVar = (B0.c) this.f1766c;
                try {
                    ((b) this.f1765b).o(((h) cVar.f73i).f(byteBuffer));
                    break;
                } catch (RuntimeException e4) {
                    Log.e("BasicMessageChannel#".concat((String) cVar.f71g), "Failed to handle message reply", e4);
                    return;
                }
            default:
                B0.c cVar2 = (B0.c) this.f1766c;
                N3.j jVar = (N3.j) this.f1765b;
                try {
                    if (byteBuffer == null) {
                        jVar.b();
                    } else {
                        try {
                            jVar.d(((j) cVar2.f73i).h(byteBuffer));
                        } catch (f e7) {
                            jVar.a(e7.f1767f, e7.getMessage(), e7.f1768g);
                        }
                    }
                    break;
                } catch (RuntimeException e8) {
                    Log.e("MethodChannel#" + ((String) cVar2.f71g), "Failed to handle method call result", e8);
                    return;
                }
        }
    }
}
