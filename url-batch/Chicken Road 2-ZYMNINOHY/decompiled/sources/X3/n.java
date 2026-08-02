package X3;

import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import c3.C0297i;
import com.startapp.sdk.internal.ea;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements InterfaceC1339l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3650a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3651b;

    public /* synthetic */ n(int i4, Object obj) {
        this.f3650a = i4;
        this.f3651b = obj;
    }

    @Override // o3.InterfaceC1339l
    public final Object invoke(Object obj) {
        switch (this.f3650a) {
            case 0:
                o oVar = (o) this.f3651b;
                if (((Boolean) obj).booleanValue()) {
                    g gVar = oVar.f3656e;
                    if (gVar != null) {
                        gVar.pause();
                    }
                } else {
                    oVar.d();
                }
                return C0297i.f5732a;
            case 1:
                return ea.a((InputMethodManager) this.f3651b, (InputMethodInfo) obj);
            default:
                return obj == ((d3.d) this.f3651b) ? "(this Collection)" : String.valueOf(obj);
        }
    }
}
