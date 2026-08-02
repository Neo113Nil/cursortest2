package E2;

import Y1.N;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import b2.C0192f;
import b2.C0195i;
import com.startapp.sdk.internal.ea;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements l2.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f457a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f458b;

    public /* synthetic */ o(int i3, Object obj) {
        this.f457a = i3;
        this.f458b = obj;
    }

    @Override // l2.l
    public final Object invoke(Object obj) {
        switch (this.f457a) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                p pVar = (p) this.f458b;
                if (booleanValue) {
                    h hVar = pVar.f463e;
                    if (hVar != null) {
                        hVar.b();
                    }
                } else {
                    pVar.d();
                }
                return C0195i.f2555a;
            case 1:
                ((l2.l) this.f458b).invoke(new N(((C0192f) obj).f2550a));
                return C0195i.f2555a;
            default:
                return ea.a((InputMethodManager) this.f458b, (InputMethodInfo) obj);
        }
    }
}
