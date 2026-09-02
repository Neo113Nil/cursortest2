package v1;

import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Map;
import t1.C0655b;
import t1.InterfaceC0657d;
import t1.InterfaceC0658e;
import w1.f;

/* renamed from: v1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0703a implements InterfaceC0657d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6106a;

    public /* synthetic */ C0703a(int i7) {
        this.f6106a = i7;
    }

    @Override // t1.InterfaceC0654a
    public final void a(Object obj, Object obj2) {
        switch (this.f6106a) {
            case 0:
                throw new C0655b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                Map.Entry entry = (Map.Entry) obj;
                InterfaceC0658e interfaceC0658e = (InterfaceC0658e) obj2;
                interfaceC0658e.a(f.f6183g, entry.getKey());
                interfaceC0658e.a(f.f6184h, entry.getValue());
                return;
            default:
                throw new C0655b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
