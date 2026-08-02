package Y1;

import android.view.inputmethod.InputMethodSubtype;
import com.startapp.sdk.internal.ea;
import com.startapp.sdk.internal.o7;

/* renamed from: Y1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0120q implements l2.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1882a;

    public /* synthetic */ C0120q(int i3) {
        this.f1882a = i3;
    }

    @Override // l2.l
    public final Object invoke(Object it) {
        switch (this.f1882a) {
            case 0:
                return null;
            case 1:
                int i3 = V.f1792h;
                return null;
            case 2:
                int i4 = b0.f1823c;
                return null;
            case 3:
                int i5 = f0.f1850d;
                return null;
            case 4:
                return Boolean.valueOf(ea.a((InputMethodSubtype) it));
            case 5:
                return ea.b((InputMethodSubtype) it);
            case 6:
                return Boolean.valueOf(ea.a((String) it));
            case 7:
                return o7.a(((Boolean) it).booleanValue());
            case 8:
                kotlin.jvm.internal.j.e(it, "it");
                return Integer.valueOf(n2.e.f10172a.a() + 65536);
            case 9:
                r2.f it2 = (r2.f) it;
                kotlin.jvm.internal.j.e(it2, "it");
                return it2.iterator();
            case 10:
                Iterable it3 = (Iterable) it;
                kotlin.jvm.internal.j.e(it3, "it");
                return it3.iterator();
            case 11:
                return it;
            default:
                return Boolean.valueOf(it == null);
        }
    }
}
