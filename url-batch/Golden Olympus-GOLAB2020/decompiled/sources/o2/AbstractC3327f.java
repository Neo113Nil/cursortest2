package o2;

import a2.AbstractC1241b;
import java.util.Collection;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* renamed from: o2.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3327f {

    /* renamed from: o2.f$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: l, reason: collision with root package name */
        Object f42059l;

        /* renamed from: m, reason: collision with root package name */
        int f42060m;

        /* renamed from: n, reason: collision with root package name */
        int f42061n;

        /* renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f42062o;

        /* renamed from: p, reason: collision with root package name */
        int f42063p;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f42062o = obj;
            this.f42063p |= Integer.MIN_VALUE;
            return AbstractC3327f.d(null, this);
        }
    }

    /* renamed from: o2.f$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: l, reason: collision with root package name */
        Object f42064l;

        /* renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f42065m;

        /* renamed from: n, reason: collision with root package name */
        int f42066n;

        b(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f42065m = obj;
            this.f42066n |= Integer.MIN_VALUE;
            return AbstractC3327f.c(null, this);
        }
    }

    public static final Object a(Collection collection, kotlin.coroutines.d dVar) {
        return collection.isEmpty() ? CollectionsKt.emptyList() : new C3325e((Q[]) collection.toArray(new Q[0])).c(dVar);
    }

    public static final Object b(Q[] qArr, kotlin.coroutines.d dVar) {
        return qArr.length == 0 ? CollectionsKt.emptyList() : new C3325e(qArr).c(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(Collection collection, kotlin.coroutines.d dVar) {
        b bVar;
        int i4;
        Iterator it;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i5 = bVar.f42066n;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                bVar.f42066n = i5 - Integer.MIN_VALUE;
                Object obj = bVar.f42065m;
                Object f4 = AbstractC1241b.f();
                i4 = bVar.f42066n;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    it = collection.iterator();
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) bVar.f42064l;
                    ResultKt.a(obj);
                }
                while (it.hasNext()) {
                    InterfaceC3359v0 interfaceC3359v0 = (InterfaceC3359v0) it.next();
                    bVar.f42064l = it;
                    bVar.f42066n = 1;
                    if (interfaceC3359v0.join(bVar) == f4) {
                        return f4;
                    }
                }
                return Unit.f41027a;
            }
        }
        bVar = new b(dVar);
        Object obj2 = bVar.f42065m;
        Object f42 = AbstractC1241b.f();
        i4 = bVar.f42066n;
        if (i4 != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.f41027a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0052 -> B:10:0x0055). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(InterfaceC3359v0[] interfaceC3359v0Arr, kotlin.coroutines.d dVar) {
        a aVar;
        int i4;
        int i5;
        InterfaceC3359v0[] interfaceC3359v0Arr2;
        int length;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i6 = aVar.f42063p;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.f42063p = i6 - Integer.MIN_VALUE;
                Object obj = aVar.f42062o;
                Object f4 = AbstractC1241b.f();
                i4 = aVar.f42063p;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    i5 = 0;
                    interfaceC3359v0Arr2 = interfaceC3359v0Arr;
                    length = interfaceC3359v0Arr.length;
                    if (i5 < length) {
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    length = aVar.f42061n;
                    i5 = aVar.f42060m;
                    InterfaceC3359v0[] interfaceC3359v0Arr3 = (InterfaceC3359v0[]) aVar.f42059l;
                    ResultKt.a(obj);
                    interfaceC3359v0Arr2 = interfaceC3359v0Arr3;
                    i5++;
                    if (i5 < length) {
                        InterfaceC3359v0 interfaceC3359v0 = interfaceC3359v0Arr2[i5];
                        aVar.f42059l = interfaceC3359v0Arr2;
                        aVar.f42060m = i5;
                        aVar.f42061n = length;
                        aVar.f42063p = 1;
                        if (interfaceC3359v0.join(aVar) == f4) {
                            return f4;
                        }
                        i5++;
                        if (i5 < length) {
                            return Unit.f41027a;
                        }
                    }
                }
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f42062o;
        Object f42 = AbstractC1241b.f();
        i4 = aVar.f42063p;
        if (i4 != 0) {
        }
    }
}
