package X5;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import e6.EnumC0356b;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import l5.C0512p;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements InterfaceC0732a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2966f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2967g;

    public /* synthetic */ l(int i7, Object obj) {
        this.f2966f = i7;
        this.f2967g = obj;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, k5.e] */
    @Override // x5.InterfaceC0732a
    public final Object invoke() {
        switch (this.f2966f) {
            case 0:
                try {
                    return (List) ((InterfaceC0732a) this.f2967g).invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return C0512p.f5303f;
                }
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return (List) this.f2967g;
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                ((PermissionsActivity) this.f2967g).reportFullyDrawn();
                return null;
            case 3:
                e6.r rVar = (e6.r) this.f2967g;
                rVar.getClass();
                try {
                    rVar.f4101B.m(2, 0, false);
                } catch (IOException e4) {
                    EnumC0356b enumC0356b = EnumC0356b.f4039i;
                    rVar.a(enumC0356b, enumC0356b, e4);
                }
                return k5.v.f5219a;
            case 4:
                Object[] array = (Object[]) this.f2967g;
                kotlin.jvm.internal.i.e(array, "array");
                return new R5.g(array);
            default:
                return new a6.d((n6.g) ((z3.l) this.f2967g).f6335f.getValue());
        }
    }
}
