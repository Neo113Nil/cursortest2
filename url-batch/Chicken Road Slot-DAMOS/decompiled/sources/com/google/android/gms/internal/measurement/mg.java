package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class mg extends vg {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2546f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mg(String str, Class cls, boolean z10, boolean z11, int i3) {
        super(str, cls, z10, z11);
        this.f2546f = i3;
    }

    @Override // com.google.android.gms.internal.measurement.vg
    public void a(Iterator it, hh hhVar) {
        switch (this.f2546f) {
            case 0:
                if (it.hasNext()) {
                    Object next = it.next();
                    boolean hasNext = it.hasNext();
                    String str = this.f2898a;
                    if (!hasNext) {
                        hhVar.a(next, str);
                        break;
                    } else {
                        StringBuilder sb2 = new StringBuilder("[");
                        sb2.append(next);
                        do {
                            sb2.append(',');
                            sb2.append(it.next());
                        } while (it.hasNext());
                        sb2.append(']');
                        hhVar.a(sb2.toString(), str);
                        break;
                    }
                }
                break;
            default:
                super.a(it, hhVar);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.vg
    public void b(Object obj, hh hhVar) {
        switch (this.f2546f) {
            case 1:
                x xVar = (x) obj;
                if (xVar != null) {
                    v vVar = xVar.f2960a.f2906i;
                    vVar.getClass();
                    int i3 = 0;
                    while (true) {
                        if (!(i3 < vVar.c() - vVar.b())) {
                            break;
                        } else if (i3 >= vVar.c() - vVar.b()) {
                            kotlin.collections.i0.c();
                            break;
                        } else {
                            w wVar = vVar.f2859e;
                            int b10 = vVar.b() + i3;
                            i3++;
                            Map.Entry entry = (Map.Entry) wVar.f2904d[b10];
                            if (((Set) entry.getValue()).isEmpty()) {
                                hhVar.a(null, (String) entry.getKey());
                            } else {
                                Iterator it = ((Set) entry.getValue()).iterator();
                                while (it.hasNext()) {
                                    hhVar.a(it.next(), (String) entry.getKey());
                                }
                            }
                        }
                    }
                }
                break;
            default:
                super.b(obj, hhVar);
                break;
        }
    }
}
