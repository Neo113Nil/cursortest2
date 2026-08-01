package n9;

import androidx.lifecycle.o0;
import androidx.lifecycle.u0;
import b5.d0;
import com.appsflyer.R;
import ge.a0;
import ge.r1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import je.b0;
import je.l0;
import je.w;
import kotlin.collections.CollectionsKt;
import kotlin.collections.j0;
import kotlin.collections.m0;
import kotlin.collections.y;
import kotlin.collections.z;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c extends u0 {

    /* renamed from: b, reason: collision with root package name */
    public final k9.a f7195b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f7196c;

    /* renamed from: d, reason: collision with root package name */
    public final w f7197d;

    /* renamed from: e, reason: collision with root package name */
    public final r1 f7198e;

    /* renamed from: f, reason: collision with root package name */
    public r1 f7199f;
    public r1 g;

    /* renamed from: h, reason: collision with root package name */
    public int f7200h;

    /* renamed from: i, reason: collision with root package name */
    public Integer f7201i;
    public final float j;

    /* renamed from: k, reason: collision with root package name */
    public final float f7202k;

    /* renamed from: l, reason: collision with root package name */
    public final float f7203l;

    /* renamed from: m, reason: collision with root package name */
    public final float f7204m;

    /* renamed from: n, reason: collision with root package name */
    public final List f7205n;

    public c(k9.a aVar) {
        aVar.getClass();
        this.f7195b = aVar;
        l0 b10 = b0.b(new j9.a(0, false, false, false, false, 0.0f, 0.0f, -1, false, j0.f5574d, y.f(new j9.d(-0.3f, 0.006f, 1, R.drawable.big_car1, 0), new j9.d(-0.7f, 0.0055f, 2, R.drawable.big_car2, 1), new j9.d(-0.15f, 0.007f, 3, R.drawable.car1, 2), new j9.d(-0.55f, 0.0065f, 4, R.drawable.car2, 3), new j9.d(-0.95f, 0.0058f, 5, R.drawable.car3, 4))));
        this.f7196c = b10;
        this.f7197d = b0.e(b10);
        this.f7200h = 100;
        this.j = 0.138f;
        this.f7202k = 0.43f;
        this.f7203l = 0.1f;
        this.f7204m = 0.06f;
        this.f7205n = y.f(Integer.valueOf(R.drawable.big_car1), Integer.valueOf(R.drawable.big_car2), Integer.valueOf(R.drawable.car1), Integer.valueOf(R.drawable.car2), Integer.valueOf(R.drawable.car3));
        r1 r1Var = this.f7198e;
        ld.a aVar2 = null;
        if (r1Var != null) {
            r1Var.a(null);
        }
        this.f7198e = a0.s(o0.g(this), null, new d0(this, aVar2, 3), 3);
    }

    @Override // androidx.lifecycle.u0
    public final void d() {
        i();
        r1 r1Var = this.f7198e;
        if (r1Var != null) {
            r1Var.a(null);
        }
        r1 r1Var2 = this.f7199f;
        if (r1Var2 != null) {
            r1Var2.a(null);
        }
    }

    public final j9.d e(j9.a aVar) {
        int c10;
        int i3 = aVar.f5114h;
        int i10 = 0;
        if (i3 < 0) {
            i3 = 0;
        }
        IntRange intRange = new IntRange(i3 - 1, i3 + 8, 1);
        List list = aVar.f5116k;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((j9.d) obj).f5124d < 0.35f) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(z.j(arrayList, 10));
        int size = arrayList.size();
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            arrayList2.add(Integer.valueOf(((j9.d) obj2).f5123c));
        }
        Set T = CollectionsKt.T(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = intRange.iterator();
        while (((be.c) it).f1471i) {
            Object next = ((m0) it).next();
            if (!T.contains(Integer.valueOf(((Number) next).intValue()))) {
                arrayList3.add(next);
            }
        }
        zd.c cVar = zd.d.f10964d;
        Integer num = (Integer) CollectionsKt.I(arrayList3, cVar);
        if (num != null) {
            c10 = num.intValue();
        } else {
            cVar.getClass();
            c10 = i3 + zd.d.f10965e.c(7);
        }
        int i11 = c10;
        int i12 = this.f7200h;
        this.f7200h = i12 + 1;
        int intValue = ((Number) CollectionsKt.H(this.f7205n, cVar)).intValue();
        cVar.getClass();
        zd.a aVar2 = zd.d.f10965e;
        return new j9.d((aVar2.d().nextFloat() * (-0.8f)) - 0.25f, (aVar2.d().nextFloat() * 0.0025f) + 0.0055f, i12, intValue, i11);
    }

    public final boolean f(j9.d dVar, int i3) {
        if (dVar.f5123c != i3) {
            return false;
        }
        int i10 = dVar.f5122b;
        return Math.abs(dVar.f5124d - this.f7202k) < ((i10 == R.drawable.big_car1 || i10 == R.drawable.big_car2) ? 0.24f : 0.17f);
    }

    public final void g() {
        Object value;
        l0 l0Var = this.f7196c;
        if (((j9.a) l0Var.getValue()).f5110c) {
            return;
        }
        do {
            value = l0Var.getValue();
        } while (!l0Var.i(value, j9.a.a((j9.a) value, 0, true, false, 0.0f, 0.0f, 0, null, null, 2045)));
    }

    public final void h() {
        Object value;
        l0 l0Var = this.f7196c;
        if (((j9.a) l0Var.getValue()).f5110c) {
            return;
        }
        do {
            value = l0Var.getValue();
        } while (!l0Var.i(value, j9.a.a((j9.a) value, 0, false, false, 0.0f, 0.0f, 0, null, null, 2045)));
    }

    public final void i() {
        int i3 = ((j9.a) this.f7196c.getValue()).f5108a;
        if (i3 <= 0) {
            return;
        }
        Integer num = this.f7201i;
        if (num != null && num.intValue() == i3) {
            return;
        }
        this.f7201i = Integer.valueOf(i3);
        r1 r1Var = this.g;
        if (r1Var != null) {
            r1Var.a(null);
        }
        this.g = a0.s(o0.g(this), null, new b(this, i3, null), 3);
    }
}
