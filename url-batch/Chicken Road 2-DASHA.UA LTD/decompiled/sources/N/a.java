package N;

import android.util.Log;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f343a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f344b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f345c;

    public /* synthetic */ a(int i2, Object obj, Object obj2) {
        this.f343a = i2;
        this.f345c = obj;
        this.f344b = obj2;
    }

    @Override // N.e
    public final void a(ByteBuffer byteBuffer) {
        switch (this.f343a) {
            case 0:
                B.e eVar = (B.e) this.f345c;
                try {
                    ((c) this.f344b).e(((i) eVar.f9c).b(byteBuffer));
                    break;
                } catch (RuntimeException e2) {
                    Log.e("BasicMessageChannel#" + ((String) eVar.f8b), "Failed to handle message reply", e2);
                    return;
                }
            default:
                C.b bVar = (C.b) this.f345c;
                M.k kVar = (M.k) this.f344b;
                try {
                    if (byteBuffer == null) {
                        kVar.getClass();
                    } else {
                        try {
                            kVar.c(((k) bVar.f15c).h(byteBuffer));
                        } catch (g e3) {
                            kVar.a(e3.f346b, e3.getMessage(), e3.f347c);
                        }
                    }
                    break;
                } catch (RuntimeException e4) {
                    Log.e("MethodChannel#".concat((String) bVar.f14b), "Failed to handle method call result", e4);
                    return;
                }
        }
    }
}
