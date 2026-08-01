package N;

import android.util.Log;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f401a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f402b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f403c;

    public /* synthetic */ a(int i2, Object obj, Object obj2) {
        this.f401a = i2;
        this.f403c = obj;
        this.f402b = obj2;
    }

    @Override // N.e
    public final void a(ByteBuffer byteBuffer) {
        switch (this.f401a) {
            case 0:
                A.e eVar = (A.e) this.f403c;
                try {
                    ((c) this.f402b).e(((i) eVar.f9d).b(byteBuffer));
                    break;
                } catch (RuntimeException e2) {
                    Log.e("BasicMessageChannel#" + ((String) eVar.f8c), "Failed to handle message reply", e2);
                    return;
                }
            default:
                A.e eVar2 = (A.e) this.f403c;
                M.j jVar = (M.j) this.f402b;
                try {
                    if (byteBuffer == null) {
                        jVar.getClass();
                    } else {
                        try {
                            jVar.c(((k) eVar2.f9d).h(byteBuffer));
                        } catch (g e3) {
                            jVar.a(e3.f404b, e3.getMessage(), e3.f405c);
                        }
                    }
                    break;
                } catch (RuntimeException e4) {
                    Log.e("MethodChannel#" + ((String) eVar2.f8c), "Failed to handle method call result", e4);
                    return;
                }
        }
    }
}
