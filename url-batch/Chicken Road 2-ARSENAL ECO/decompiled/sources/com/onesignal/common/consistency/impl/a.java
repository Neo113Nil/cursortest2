package com.onesignal.common.consistency.impl;

import H5.AbstractC0165z;
import H5.C0153m;
import H5.InterfaceC0152l;
import H5.U;
import H5.g0;
import O1.c;
import P5.d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k5.C0477g;
import k5.v;
import kotlin.jvm.internal.i;
import o5.InterfaceC0564d;
import o5.InterfaceC0569i;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public final class a implements c {
    private final P5.a mutex = new d();
    private final Map<String, Map<O1.b, M1.b>> indexedTokens = new LinkedHashMap();
    private final List<C0477g> conditions = new ArrayList();

    /* renamed from: com.onesignal.common.consistency.impl.a$a, reason: collision with other inner class name */
    public static final class C0005a extends AbstractC0607c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C0005a(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.getRywDataFromAwaitableCondition(null, this);
        }
    }

    public static final class b extends AbstractC0607c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.setRywData(null, null, null, this);
        }
    }

    private final void checkConditionsAndComplete() {
        ArrayList arrayList = new ArrayList();
        for (C0477g c0477g : this.conditions) {
            O1.a aVar = (O1.a) c0477g.f5198f;
            InterfaceC0569i interfaceC0569i = (InterfaceC0152l) c0477g.f5199g;
            if (aVar.isMet(this.indexedTokens)) {
                M1.b rywData = aVar.getRywData(this.indexedTokens);
                if (((g0) interfaceC0569i).C() instanceof U) {
                    ((C0153m) interfaceC0569i).U(rywData);
                }
                arrayList.add(new C0477g(aVar, interfaceC0569i));
            }
        }
        this.conditions.removeAll(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v6, types: [P5.a] */
    @Override // O1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getRywDataFromAwaitableCondition(O1.a aVar, InterfaceC0564d interfaceC0564d) {
        C0005a c0005a;
        int i7;
        d dVar;
        a aVar2;
        try {
            if (interfaceC0564d instanceof C0005a) {
                c0005a = (C0005a) interfaceC0564d;
                int i8 = c0005a.label;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    c0005a.label = i8 - Integer.MIN_VALUE;
                    Object obj = c0005a.result;
                    EnumC0580a enumC0580a = EnumC0580a.f5697f;
                    i7 = c0005a.label;
                    if (i7 != 0) {
                        AbstractC0676f.w(obj);
                        P5.a aVar3 = this.mutex;
                        c0005a.L$0 = this;
                        c0005a.L$1 = aVar;
                        c0005a.L$2 = aVar3;
                        c0005a.label = 1;
                        dVar = (d) aVar3;
                        if (dVar.c(c0005a) == enumC0580a) {
                            return enumC0580a;
                        }
                        aVar2 = this;
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r52 = (P5.a) c0005a.L$2;
                        O1.a aVar4 = (O1.a) c0005a.L$1;
                        aVar2 = (a) c0005a.L$0;
                        AbstractC0676f.w(obj);
                        dVar = r52;
                        aVar = aVar4;
                    }
                    C0153m a7 = AbstractC0165z.a();
                    aVar2.conditions.add(new C0477g(aVar, a7));
                    aVar2.checkConditionsAndComplete();
                    return a7;
                }
            }
            C0153m a72 = AbstractC0165z.a();
            aVar2.conditions.add(new C0477g(aVar, a72));
            aVar2.checkConditionsAndComplete();
            return a72;
        } finally {
            dVar.d(null);
        }
        c0005a = new C0005a(interfaceC0564d);
        Object obj2 = c0005a.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = c0005a.label;
        if (i7 != 0) {
        }
    }

    @Override // O1.c
    public Object resolveConditionsWithID(String str, InterfaceC0564d interfaceC0564d) {
        ArrayList arrayList = new ArrayList();
        for (C0477g c0477g : this.conditions) {
            O1.a aVar = (O1.a) c0477g.f5198f;
            InterfaceC0569i interfaceC0569i = (InterfaceC0152l) c0477g.f5199g;
            if (i.a(aVar.getId(), str) && (((g0) interfaceC0569i).C() instanceof U)) {
                ((C0153m) interfaceC0569i).U(null);
            }
            arrayList.add(new C0477g(aVar, interfaceC0569i));
        }
        this.conditions.removeAll(arrayList);
        return v.f5219a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:12:0x0062, B:14:0x006a, B:15:0x0075), top: B:11:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v6, types: [P5.a] */
    @Override // O1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setRywData(String str, O1.b bVar, M1.b bVar2, InterfaceC0564d interfaceC0564d) {
        b bVar3;
        int i7;
        d dVar;
        a aVar;
        Map<O1.b, M1.b> map;
        try {
            if (interfaceC0564d instanceof b) {
                bVar3 = (b) interfaceC0564d;
                int i8 = bVar3.label;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    bVar3.label = i8 - Integer.MIN_VALUE;
                    Object obj = bVar3.result;
                    EnumC0580a enumC0580a = EnumC0580a.f5697f;
                    i7 = bVar3.label;
                    if (i7 != 0) {
                        AbstractC0676f.w(obj);
                        P5.a aVar2 = this.mutex;
                        bVar3.L$0 = this;
                        bVar3.L$1 = str;
                        bVar3.L$2 = bVar;
                        bVar3.L$3 = bVar2;
                        bVar3.L$4 = aVar2;
                        bVar3.label = 1;
                        dVar = (d) aVar2;
                        if (dVar.c(bVar3) == enumC0580a) {
                            return enumC0580a;
                        }
                        aVar = this;
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r52 = (P5.a) bVar3.L$4;
                        bVar2 = (M1.b) bVar3.L$3;
                        bVar = (O1.b) bVar3.L$2;
                        String str2 = (String) bVar3.L$1;
                        aVar = (a) bVar3.L$0;
                        AbstractC0676f.w(obj);
                        dVar = r52;
                        str = str2;
                    }
                    Map<String, Map<O1.b, M1.b>> map2 = aVar.indexedTokens;
                    map = map2.get(str);
                    if (map == null) {
                        map = new LinkedHashMap<>();
                        map2.put(str, map);
                    }
                    map.put(bVar, bVar2);
                    aVar.checkConditionsAndComplete();
                    dVar.d(null);
                    return v.f5219a;
                }
            }
            Map<String, Map<O1.b, M1.b>> map22 = aVar.indexedTokens;
            map = map22.get(str);
            if (map == null) {
            }
            map.put(bVar, bVar2);
            aVar.checkConditionsAndComplete();
            dVar.d(null);
            return v.f5219a;
        } catch (Throwable th) {
            dVar.d(null);
            throw th;
        }
        bVar3 = new b(interfaceC0564d);
        Object obj2 = bVar3.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = bVar3.label;
        if (i7 != 0) {
        }
    }
}
