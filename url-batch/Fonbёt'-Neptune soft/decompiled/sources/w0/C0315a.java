package w0;

import I.C0079n;
import android.util.Log;
import java.nio.ByteBuffer;

/* renamed from: w0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0315a implements InterfaceC0319e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3550a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3551b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3552c;

    public /* synthetic */ C0315a(int i2, Object obj, Object obj2) {
        this.f3550a = i2;
        this.f3552c = obj;
        this.f3551b = obj2;
    }

    @Override // w0.InterfaceC0319e
    public final void a(ByteBuffer byteBuffer) {
        switch (this.f3550a) {
            case 0:
                C0079n c0079n = (C0079n) this.f3552c;
                try {
                    ((InterfaceC0317c) this.f3551b).b(((k) c0079n.f691g).a(byteBuffer));
                    break;
                } catch (RuntimeException e2) {
                    Log.e("BasicMessageChannel#" + ((String) c0079n.f690f), "Failed to handle message reply", e2);
                    return;
                }
            default:
                C0079n c0079n2 = (C0079n) this.f3552c;
                v0.i iVar = (v0.i) this.f3551b;
                try {
                    if (byteBuffer == null) {
                        iVar.getClass();
                    } else {
                        try {
                            iVar.c(((m) c0079n2.f691g).c(byteBuffer));
                        } catch (C0321g e3) {
                            iVar.a(e3.f3553e, e3.getMessage(), e3.f3554f);
                        }
                    }
                    break;
                } catch (RuntimeException e4) {
                    Log.e("MethodChannel#" + ((String) c0079n2.f690f), "Failed to handle method call result", e4);
                    return;
                }
        }
    }
}
