package D;

import Z2.InterfaceC0331g;
import kotlin.Unit;
import p.C0925a;
import p.C0926b;
import p.C0927c;
import p.C0928d;
import p.C0929e;
import p.C0931g;
import p.C0932h;
import p.C0936l;
import p.C0937m;
import p.C0938n;
import p.InterfaceC0933i;

/* renamed from: D.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0162q implements InterfaceC0331g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q.v f1968e;

    public /* synthetic */ C0162q(Q.v vVar, int i2) {
        this.f1967d = i2;
        this.f1968e = vVar;
    }

    @Override // Z2.InterfaceC0331g
    public final Object d(Object obj, C2.a aVar) {
        switch (this.f1967d) {
            case 0:
                InterfaceC0933i interfaceC0933i = (InterfaceC0933i) obj;
                boolean z4 = interfaceC0933i instanceof C0931g;
                Q.v vVar = this.f1968e;
                if (z4) {
                    vVar.add(interfaceC0933i);
                } else if (interfaceC0933i instanceof C0932h) {
                    vVar.remove(((C0932h) interfaceC0933i).f8971a);
                } else if (interfaceC0933i instanceof C0928d) {
                    vVar.add(interfaceC0933i);
                } else if (interfaceC0933i instanceof C0929e) {
                    vVar.remove(((C0929e) interfaceC0933i).f8967a);
                } else if (interfaceC0933i instanceof C0937m) {
                    vVar.add(interfaceC0933i);
                } else if (interfaceC0933i instanceof C0938n) {
                    vVar.remove(((C0938n) interfaceC0933i).f8975a);
                } else if (interfaceC0933i instanceof C0936l) {
                    vVar.remove(((C0936l) interfaceC0933i).f8973a);
                }
                break;
            default:
                InterfaceC0933i interfaceC0933i2 = (InterfaceC0933i) obj;
                boolean z5 = interfaceC0933i2 instanceof C0931g;
                Q.v vVar2 = this.f1968e;
                if (z5) {
                    vVar2.add(interfaceC0933i2);
                } else if (interfaceC0933i2 instanceof C0932h) {
                    vVar2.remove(((C0932h) interfaceC0933i2).f8971a);
                } else if (interfaceC0933i2 instanceof C0928d) {
                    vVar2.add(interfaceC0933i2);
                } else if (interfaceC0933i2 instanceof C0929e) {
                    vVar2.remove(((C0929e) interfaceC0933i2).f8967a);
                } else if (interfaceC0933i2 instanceof C0937m) {
                    vVar2.add(interfaceC0933i2);
                } else if (interfaceC0933i2 instanceof C0938n) {
                    vVar2.remove(((C0938n) interfaceC0933i2).f8975a);
                } else if (interfaceC0933i2 instanceof C0936l) {
                    vVar2.remove(((C0936l) interfaceC0933i2).f8973a);
                } else if (interfaceC0933i2 instanceof C0926b) {
                    vVar2.add(interfaceC0933i2);
                } else if (interfaceC0933i2 instanceof C0927c) {
                    vVar2.remove(((C0927c) interfaceC0933i2).f8966a);
                } else if (interfaceC0933i2 instanceof C0925a) {
                    vVar2.remove(((C0925a) interfaceC0933i2).f8965a);
                }
                break;
        }
        return Unit.f7487a;
    }
}
