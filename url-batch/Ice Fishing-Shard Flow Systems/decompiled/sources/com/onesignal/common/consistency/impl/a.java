package com.onesignal.common.consistency.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import n6.AbstractC0792z;
import n6.C0781n;
import n6.InterfaceC0780m;
import n6.X;
import n6.f0;
import o2.C0800b;
import q2.InterfaceC0833a;
import q2.c;
import v6.InterfaceC0979a;

/* loaded from: classes.dex */
public final class a implements c {
    private final InterfaceC0979a mutex = new v6.c();
    private final Map<String, Map<q2.b, C0800b>> indexedTokens = new LinkedHashMap();
    private final List<Pair<InterfaceC0833a, InterfaceC0780m>> conditions = new ArrayList();

    /* renamed from: com.onesignal.common.consistency.impl.a$a, reason: collision with other inner class name */
    public static final class C0005a extends X5.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C0005a(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.getRywDataFromAwaitableCondition(null, this);
        }
    }

    public static final class b extends X5.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public b(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.setRywData(null, null, null, this);
        }
    }

    private final void checkConditionsAndComplete() {
        ArrayList arrayList = new ArrayList();
        for (Pair<InterfaceC0833a, InterfaceC0780m> pair : this.conditions) {
            InterfaceC0833a interfaceC0833a = (InterfaceC0833a) pair.f6112d;
            X x7 = (InterfaceC0780m) pair.f6113e;
            if (interfaceC0833a.isMet(this.indexedTokens)) {
                C0800b rywData = interfaceC0833a.getRywData(this.indexedTokens);
                if (!((f0) x7).G()) {
                    ((C0781n) x7).J(rywData);
                }
                arrayList.add(new Pair(interfaceC0833a, x7));
            }
        }
        this.conditions.removeAll(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v6, types: [v6.a] */
    @Override // q2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getRywDataFromAwaitableCondition(InterfaceC0833a interfaceC0833a, V5.b bVar) {
        C0005a c0005a;
        int i2;
        v6.c cVar;
        a aVar;
        try {
            if (bVar instanceof C0005a) {
                c0005a = (C0005a) bVar;
                int i5 = c0005a.label;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    c0005a.label = i5 - Integer.MIN_VALUE;
                    Object obj = c0005a.result;
                    W5.a aVar2 = W5.a.f2787d;
                    i2 = c0005a.label;
                    if (i2 != 0) {
                        V6.b.P(obj);
                        InterfaceC0979a interfaceC0979a = this.mutex;
                        c0005a.L$0 = this;
                        c0005a.L$1 = interfaceC0833a;
                        c0005a.L$2 = interfaceC0979a;
                        c0005a.label = 1;
                        cVar = (v6.c) interfaceC0979a;
                        if (cVar.c(c0005a) == aVar2) {
                            return aVar2;
                        }
                        aVar = this;
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r52 = (InterfaceC0979a) c0005a.L$2;
                        InterfaceC0833a interfaceC0833a2 = (InterfaceC0833a) c0005a.L$1;
                        aVar = (a) c0005a.L$0;
                        V6.b.P(obj);
                        cVar = r52;
                        interfaceC0833a = interfaceC0833a2;
                    }
                    C0781n a7 = AbstractC0792z.a();
                    aVar.conditions.add(new Pair<>(interfaceC0833a, a7));
                    aVar.checkConditionsAndComplete();
                    return a7;
                }
            }
            C0781n a72 = AbstractC0792z.a();
            aVar.conditions.add(new Pair<>(interfaceC0833a, a72));
            aVar.checkConditionsAndComplete();
            return a72;
        } finally {
            cVar.e(null);
        }
        c0005a = new C0005a(bVar);
        Object obj2 = c0005a.result;
        W5.a aVar22 = W5.a.f2787d;
        i2 = c0005a.label;
        if (i2 != 0) {
        }
    }

    @Override // q2.c
    public Object resolveConditionsWithID(String str, V5.b bVar) {
        ArrayList arrayList = new ArrayList();
        for (Pair<InterfaceC0833a, InterfaceC0780m> pair : this.conditions) {
            InterfaceC0833a interfaceC0833a = (InterfaceC0833a) pair.f6112d;
            X x7 = (InterfaceC0780m) pair.f6113e;
            if (Intrinsics.a(interfaceC0833a.getId(), str) && !((f0) x7).G()) {
                ((C0781n) x7).J(null);
            }
            arrayList.add(new Pair(interfaceC0833a, x7));
        }
        this.conditions.removeAll(arrayList);
        return Unit.f6114a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:12:0x0062, B:14:0x006a, B:15:0x0075), top: B:11:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v7, types: [v6.a] */
    @Override // q2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setRywData(String str, q2.b bVar, C0800b c0800b, V5.b bVar2) {
        b bVar3;
        int i2;
        v6.c cVar;
        a aVar;
        Map<q2.b, C0800b> map;
        try {
            if (bVar2 instanceof b) {
                bVar3 = (b) bVar2;
                int i5 = bVar3.label;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    bVar3.label = i5 - Integer.MIN_VALUE;
                    Object obj = bVar3.result;
                    W5.a aVar2 = W5.a.f2787d;
                    i2 = bVar3.label;
                    if (i2 != 0) {
                        V6.b.P(obj);
                        InterfaceC0979a interfaceC0979a = this.mutex;
                        bVar3.L$0 = this;
                        bVar3.L$1 = str;
                        bVar3.L$2 = bVar;
                        bVar3.L$3 = c0800b;
                        bVar3.L$4 = interfaceC0979a;
                        bVar3.label = 1;
                        cVar = (v6.c) interfaceC0979a;
                        if (cVar.c(bVar3) == aVar2) {
                            return aVar2;
                        }
                        aVar = this;
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r52 = (InterfaceC0979a) bVar3.L$4;
                        c0800b = (C0800b) bVar3.L$3;
                        bVar = (q2.b) bVar3.L$2;
                        String str2 = (String) bVar3.L$1;
                        aVar = (a) bVar3.L$0;
                        V6.b.P(obj);
                        cVar = r52;
                        str = str2;
                    }
                    Map<String, Map<q2.b, C0800b>> map2 = aVar.indexedTokens;
                    map = map2.get(str);
                    if (map == null) {
                        map = new LinkedHashMap<>();
                        map2.put(str, map);
                    }
                    map.put(bVar, c0800b);
                    aVar.checkConditionsAndComplete();
                    Unit unit = Unit.f6114a;
                    cVar.e(null);
                    return Unit.f6114a;
                }
            }
            Map<String, Map<q2.b, C0800b>> map22 = aVar.indexedTokens;
            map = map22.get(str);
            if (map == null) {
            }
            map.put(bVar, c0800b);
            aVar.checkConditionsAndComplete();
            Unit unit2 = Unit.f6114a;
            cVar.e(null);
            return Unit.f6114a;
        } catch (Throwable th) {
            cVar.e(null);
            throw th;
        }
        bVar3 = new b(bVar2);
        Object obj2 = bVar3.result;
        W5.a aVar22 = W5.a.f2787d;
        i2 = bVar3.label;
        if (i2 != 0) {
        }
    }
}
