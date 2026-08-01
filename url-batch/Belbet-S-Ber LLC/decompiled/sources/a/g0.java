package a;

import android.view.View;
import com.google.android.material.internal.CheckableImageButton;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.ArrayList;
import n0.s1;
import n0.v1;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements h3.l, h3.p, n0.p, i2.b {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f24f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f25g;

    public /* synthetic */ g0(int i, Object obj) {
        this.f24f = i;
        this.f25g = obj;
    }

    @Override // i2.b
    public void a() {
        CheckableImageButton checkableImageButton = ((s2.w) this.f25g).i;
        r1.b.E(checkableImageButton, checkableImageButton.getContentDescription());
    }

    @Override // h3.l
    public Object b(Object obj) {
        switch (this.f24f) {
            case 1:
                a4.h hVar = (a4.h) this.f25g;
                Long l4 = (Long) obj;
                i3.d.b(l4);
                long longValue = l4.longValue();
                hVar.getClass();
                LocalDate localDate = Instant.ofEpochMilli(longValue).atZone(ZoneOffset.UTC).toLocalDate();
                i3.d.d(localDate, "toLocalDate(...)");
                hVar.a(localDate);
                return w2.d.f3820c;
            case 2:
                a0 a0Var = (a0) this.f25g;
                i3.d.e(obj, "it");
                return a0Var.a();
            default:
                return obj == ((x2.c) this.f25g) ? "(this Collection)" : String.valueOf(obj);
        }
    }

    @Override // n0.p
    public v1 l(View view, v1 v1Var) {
        q0.f fVar = (q0.f) this.f25g;
        ArrayList arrayList = fVar.f3137b;
        s1 s1Var = v1Var.f2842a;
        f0.c b2 = f0.c.b(s1Var.h(519), s1Var.h(64));
        f0.c b5 = f0.c.b(s1Var.i(519), s1Var.i(64));
        if (!b2.equals(fVar.f3138c) || !b5.equals(fVar.d)) {
            fVar.f3138c = b2;
            fVar.d = b5;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                q0.c cVar = (q0.c) arrayList.get(size);
                cVar.f3129c = b2;
                cVar.d = b5;
                cVar.c();
            }
        }
        return v1Var;
    }
}
