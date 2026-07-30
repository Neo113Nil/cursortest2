package R7;

import S7.w;
import q7.v;
import v7.InterfaceC5133d;
import v7.InterfaceC5138i;
import w7.EnumC5179a;

/* loaded from: classes2.dex */
public final class f implements c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2854n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final Object f2855u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f2856v;

    /* renamed from: w, reason: collision with root package name */
    public final x7.h f2857w;

    public f(kotlin.jvm.internal.p pVar, c cVar, X.o oVar) {
        this.f2855u = pVar;
        this.f2856v = cVar;
        this.f2857w = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    @Override // R7.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, InterfaceC5133d interfaceC5133d) {
        e eVar;
        int i;
        f fVar;
        switch (this.f2854n) {
            case 0:
                if (interfaceC5133d instanceof e) {
                    eVar = (e) interfaceC5133d;
                    int i4 = eVar.f2853x;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        eVar.f2853x = i4 - Integer.MIN_VALUE;
                        Object obj2 = eVar.f2851v;
                        EnumC5179a enumC5179a = EnumC5179a.f41704n;
                        i = eVar.f2853x;
                        v vVar = v.f40183a;
                        if (i != 0) {
                            com.bumptech.glide.f.r(obj2);
                            if (((kotlin.jvm.internal.p) this.f2855u).f38859n) {
                                eVar.f2853x = 1;
                                if (((c) this.f2856v).a(obj, eVar) == enumC5179a) {
                                    return enumC5179a;
                                }
                                return vVar;
                            }
                            eVar.f2849n = this;
                            eVar.f2850u = obj;
                            eVar.f2853x = 2;
                            obj2 = ((X.o) this.f2857w).invoke(obj, eVar);
                            if (obj2 == enumC5179a) {
                                return enumC5179a;
                            }
                            fVar = this;
                            if (!((Boolean) obj2).booleanValue()) {
                            }
                            return vVar;
                        }
                        if (i != 1) {
                            if (i == 2) {
                                obj = eVar.f2850u;
                                fVar = eVar.f2849n;
                                com.bumptech.glide.f.r(obj2);
                                if (!((Boolean) obj2).booleanValue()) {
                                    ((kotlin.jvm.internal.p) fVar.f2855u).f38859n = true;
                                    eVar.f2849n = null;
                                    eVar.f2850u = null;
                                    eVar.f2853x = 3;
                                    if (((c) fVar.f2856v).a(obj, eVar) == enumC5179a) {
                                        return enumC5179a;
                                    }
                                }
                                return vVar;
                            }
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        com.bumptech.glide.f.r(obj2);
                        return vVar;
                    }
                }
                eVar = new e(this, interfaceC5133d);
                Object obj22 = eVar.f2851v;
                EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
                i = eVar.f2853x;
                v vVar2 = v.f40183a;
                if (i != 0) {
                }
            default:
                Object a9 = S7.o.a((InterfaceC5138i) this.f2855u, obj, this.f2856v, (w) this.f2857w, interfaceC5133d);
                return a9 == EnumC5179a.f41704n ? a9 : v.f40183a;
        }
    }

    public f(c cVar, InterfaceC5138i interfaceC5138i) {
        this.f2855u = interfaceC5138i;
        this.f2856v = T7.a.l(interfaceC5138i);
        this.f2857w = new w(cVar, null);
    }
}
