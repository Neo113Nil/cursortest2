package com.onesignal.common.consistency.impl;

import ge.a0;
import ge.c1;
import ge.k1;
import ge.m;
import ge.n;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.internal.Intrinsics;
import y9.c;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements c {
    private final oe.a mutex = new oe.c();
    private final Map<String, Map<y9.b, w9.b>> indexedTokens = new LinkedHashMap();
    private final List<Pair<y9.a, m>> conditions = new ArrayList();

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.common.consistency.impl.a$a, reason: collision with other inner class name */
    public static final class C0002a extends nd.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C0002a(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.getRywDataFromAwaitableCondition(null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends nd.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public b(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.setRywData(null, null, null, this);
        }
    }

    private final void checkConditionsAndComplete() {
        ArrayList arrayList = new ArrayList();
        for (Pair<y9.a, m> pair : this.conditions) {
            y9.a aVar = (y9.a) pair.f5552d;
            c1 c1Var = (m) pair.f5553e;
            if (aVar.isMet(this.indexedTokens)) {
                w9.b rywData = aVar.getRywData(this.indexedTokens);
                if (!((k1) c1Var).Q()) {
                    ((n) c1Var).S(rywData);
                }
                arrayList.add(new Pair(aVar, c1Var));
            }
        }
        this.conditions.removeAll(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // y9.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getRywDataFromAwaitableCondition(y9.a aVar, ld.a aVar2) {
        C0002a c0002a;
        int i3;
        oe.a aVar3;
        a aVar4;
        try {
            if (aVar2 instanceof C0002a) {
                c0002a = (C0002a) aVar2;
                int i10 = c0002a.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c0002a.label = i10 - Integer.MIN_VALUE;
                    Object obj = c0002a.result;
                    md.a aVar5 = md.a.f6622d;
                    i3 = c0002a.label;
                    if (i3 != 0) {
                        cf.c.M(obj);
                        aVar3 = this.mutex;
                        c0002a.L$0 = this;
                        c0002a.L$1 = aVar;
                        c0002a.L$2 = aVar3;
                        c0002a.label = 1;
                        if (aVar3.a(c0002a) == aVar5) {
                            return aVar5;
                        }
                        aVar4 = this;
                    } else {
                        if (i3 != 1) {
                            i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oe.a aVar6 = (oe.a) c0002a.L$2;
                        y9.a aVar7 = (y9.a) c0002a.L$1;
                        aVar4 = (a) c0002a.L$0;
                        cf.c.M(obj);
                        aVar3 = aVar6;
                        aVar = aVar7;
                    }
                    n a9 = a0.a();
                    aVar4.conditions.add(new Pair<>(aVar, a9));
                    aVar4.checkConditionsAndComplete();
                    return a9;
                }
            }
            n a92 = a0.a();
            aVar4.conditions.add(new Pair<>(aVar, a92));
            aVar4.checkConditionsAndComplete();
            return a92;
        } finally {
            aVar3.d(null);
        }
        c0002a = new C0002a(aVar2);
        Object obj2 = c0002a.result;
        md.a aVar52 = md.a.f6622d;
        i3 = c0002a.label;
        if (i3 != 0) {
        }
    }

    @Override // y9.c
    public Object resolveConditionsWithID(String str, ld.a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Pair<y9.a, m> pair : this.conditions) {
            y9.a aVar2 = (y9.a) pair.f5552d;
            c1 c1Var = (m) pair.f5553e;
            if (Intrinsics.a(aVar2.getId(), str) && !((k1) c1Var).Q()) {
                ((n) c1Var).S(null);
            }
            arrayList.add(new Pair(aVar2, c1Var));
        }
        this.conditions.removeAll(arrayList);
        return Unit.f5554a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0067 A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:12:0x005f, B:14:0x0067, B:15:0x0072), top: B:11:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // y9.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setRywData(String str, y9.b bVar, w9.b bVar2, ld.a aVar) {
        b bVar3;
        int i3;
        oe.a aVar2;
        a aVar3;
        Map<y9.b, w9.b> map;
        try {
            if (aVar instanceof b) {
                bVar3 = (b) aVar;
                int i10 = bVar3.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    bVar3.label = i10 - Integer.MIN_VALUE;
                    Object obj = bVar3.result;
                    md.a aVar4 = md.a.f6622d;
                    i3 = bVar3.label;
                    if (i3 != 0) {
                        cf.c.M(obj);
                        aVar2 = this.mutex;
                        bVar3.L$0 = this;
                        bVar3.L$1 = str;
                        bVar3.L$2 = bVar;
                        bVar3.L$3 = bVar2;
                        bVar3.L$4 = aVar2;
                        bVar3.label = 1;
                        if (aVar2.a(bVar3) == aVar4) {
                            return aVar4;
                        }
                        aVar3 = this;
                    } else {
                        if (i3 != 1) {
                            i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oe.a aVar5 = (oe.a) bVar3.L$4;
                        bVar2 = (w9.b) bVar3.L$3;
                        bVar = (y9.b) bVar3.L$2;
                        String str2 = (String) bVar3.L$1;
                        aVar3 = (a) bVar3.L$0;
                        cf.c.M(obj);
                        aVar2 = aVar5;
                        str = str2;
                    }
                    Map<String, Map<y9.b, w9.b>> map2 = aVar3.indexedTokens;
                    map = map2.get(str);
                    if (map == null) {
                        map = new LinkedHashMap<>();
                        map2.put(str, map);
                    }
                    map.put(bVar, bVar2);
                    aVar3.checkConditionsAndComplete();
                    aVar2.d(null);
                    return Unit.f5554a;
                }
            }
            Map<String, Map<y9.b, w9.b>> map22 = aVar3.indexedTokens;
            map = map22.get(str);
            if (map == null) {
            }
            map.put(bVar, bVar2);
            aVar3.checkConditionsAndComplete();
            aVar2.d(null);
            return Unit.f5554a;
        } catch (Throwable th) {
            aVar2.d(null);
            throw th;
        }
        bVar3 = new b(aVar);
        Object obj2 = bVar3.result;
        md.a aVar42 = md.a.f6622d;
        i3 = bVar3.label;
        if (i3 != 0) {
        }
    }
}
