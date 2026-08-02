package P1;

import android.util.Log;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1257a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1258b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1259c;

    public /* synthetic */ a(Object obj, int i3, Object obj2) {
        this.f1257a = i3;
        this.f1259c = obj;
        this.f1258b = obj2;
    }

    @Override // P1.e
    public final void a(ByteBuffer byteBuffer) {
        switch (this.f1257a) {
            case 0:
                B0.p pVar = (B0.p) this.f1259c;
                try {
                    ((c) this.f1258b).n(((k) pVar.f164c).decodeMessage(byteBuffer));
                    break;
                } catch (RuntimeException e3) {
                    Log.e("BasicMessageChannel#" + ((String) pVar.f163b), "Failed to handle message reply", e3);
                    return;
                }
            default:
                o oVar = (o) this.f1259c;
                O1.j jVar = (O1.j) this.f1258b;
                try {
                    if (byteBuffer == null) {
                        jVar.getClass();
                    } else {
                        try {
                            jVar.success(oVar.f1270c.f(byteBuffer));
                        } catch (h e4) {
                            jVar.b(e4.f1262a, e4.getMessage(), e4.f1263b);
                        }
                    }
                    break;
                } catch (RuntimeException e5) {
                    Log.e("MethodChannel#" + oVar.f1269b, "Failed to handle method call result", e5);
                    return;
                }
        }
    }
}
