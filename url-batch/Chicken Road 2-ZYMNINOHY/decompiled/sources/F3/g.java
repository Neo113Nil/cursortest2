package F3;

import E.A;
import E.H;
import K.M;
import K.U;
import K.X;
import android.view.View;
import c3.C0296h;
import c3.C0297i;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;
import o3.InterfaceC1339l;
import x3.C1546f;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.j implements InterfaceC1339l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f798e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f799f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i4, Object obj) {
        super(1);
        this.f798e = i4;
        this.f799f = obj;
    }

    @Override // o3.InterfaceC1339l
    public final Object invoke(Object obj) {
        switch (this.f798e) {
            case 0:
                ((i) this.f799f).b();
                return C0297i.f5732a;
            case 1:
                Throwable th = (Throwable) obj;
                M m4 = (M) this.f799f;
                if (th != null) {
                    m4.f1280h.o(new X(th));
                }
                if (m4.f1282j.f5729b != C0296h.f5731a) {
                    ((U) m4.f1282j.a()).close();
                }
                return C0297i.f5732a;
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                kotlin.jvm.internal.i.e(entry, "entry");
                Collection collection = (Collection) this.f799f;
                View view = (View) entry.getValue();
                Field field = H.f375a;
                return Boolean.valueOf(d3.i.b0(collection, A.c(view)));
            default:
                C1546f c1546f = (C1546f) this.f799f;
                C0297i c0297i = C0297i.f5732a;
                c1546f.resumeWith(c0297i);
                return c0297i;
        }
    }
}
