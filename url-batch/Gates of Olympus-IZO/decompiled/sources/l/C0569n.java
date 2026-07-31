package l;

import java.util.ArrayList;
import java.util.List;
import r0.InterfaceC0827A;

/* renamed from: l.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0569n implements InterfaceC0827A {

    /* renamed from: a, reason: collision with root package name */
    public final t f5483a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5484b;

    public C0569n(t tVar) {
        this.f5483a = tVar;
    }

    @Override // r0.InterfaceC0827A
    public final r0.B f(t0.O o3, List list, long j3) {
        Object obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(((r0.z) list.get(i3)).b(j3));
        }
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int i4 = ((r0.H) obj).f7114d;
            int b02 = M1.m.b0(arrayList);
            if (1 <= b02) {
                int i5 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i5);
                    int i6 = ((r0.H) obj3).f7114d;
                    if (i4 < i6) {
                        obj = obj3;
                        i4 = i6;
                    }
                    if (i5 == b02) {
                        break;
                    }
                    i5++;
                }
            }
        }
        r0.H h3 = (r0.H) obj;
        int i7 = h3 != null ? h3.f7114d : 0;
        if (!arrayList.isEmpty()) {
            obj2 = arrayList.get(0);
            int i8 = ((r0.H) obj2).f7115e;
            int b03 = M1.m.b0(arrayList);
            if (1 <= b03) {
                int i9 = 1;
                while (true) {
                    Object obj4 = arrayList.get(i9);
                    int i10 = ((r0.H) obj4).f7115e;
                    if (i8 < i10) {
                        obj2 = obj4;
                        i8 = i10;
                    }
                    if (i9 == b03) {
                        break;
                    }
                    i9++;
                }
            }
        }
        r0.H h4 = (r0.H) obj2;
        int i11 = h4 != null ? h4.f7115e : 0;
        boolean B = o3.B();
        t tVar = this.f5483a;
        if (B) {
            this.f5484b = true;
            tVar.f5503a.setValue(new M0.i(I2.l.e(i7, i11)));
        } else if (!this.f5484b) {
            tVar.f5503a.setValue(new M0.i(I2.l.e(i7, i11)));
        }
        return o3.Y(i7, i11, M1.v.f2804d, new P0.h(1, arrayList));
    }
}
