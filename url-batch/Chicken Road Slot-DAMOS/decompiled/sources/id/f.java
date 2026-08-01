package id;

import java.util.Iterator;
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f extends d4.c implements Iterator, xd.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4690s;

    public f(h hVar, int i3) {
        this.f4690s = i3;
        hVar.getClass();
        this.f3619r = hVar;
        this.f3617e = -1;
        this.f3618i = hVar.f4701v;
        c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4690s) {
            case 0:
                b();
                int i3 = this.f3616d;
                h hVar = (h) this.f3619r;
                if (i3 >= hVar.f4699t) {
                    i0.c();
                    break;
                } else {
                    this.f3616d = i3 + 1;
                    this.f3617e = i3;
                    g gVar = new g(hVar, i3);
                    c();
                    break;
                }
            case 1:
                b();
                int i10 = this.f3616d;
                h hVar2 = (h) this.f3619r;
                if (i10 >= hVar2.f4699t) {
                    i0.c();
                    break;
                } else {
                    this.f3616d = i10 + 1;
                    this.f3617e = i10;
                    Object obj = hVar2.f4694d[i10];
                    c();
                    break;
                }
            default:
                b();
                int i11 = this.f3616d;
                h hVar3 = (h) this.f3619r;
                if (i11 >= hVar3.f4699t) {
                    i0.c();
                    break;
                } else {
                    this.f3616d = i11 + 1;
                    this.f3617e = i11;
                    Object[] objArr = hVar3.f4695e;
                    objArr.getClass();
                    Object obj2 = objArr[this.f3617e];
                    c();
                    break;
                }
        }
        return null;
    }
}
