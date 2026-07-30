package com.onesignal.common.consistency.impl;

import O7.AbstractC0399y;
import O7.C0388m;
import O7.InterfaceC0387l;
import O7.V;
import O7.Y;
import O7.h0;
import W7.d;
import com.bumptech.glide.f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;
import m4.C4781b;
import o4.InterfaceC4837a;
import o4.c;
import q7.C4938g;
import q7.v;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class a implements c {
    private final W7.a mutex = new d();
    private final Map<String, Map<o4.b, C4781b>> indexedTokens = new LinkedHashMap();
    private final List<C4938g> conditions = new ArrayList();

    /* renamed from: com.onesignal.common.consistency.impl.a$a, reason: collision with other inner class name */
    public static final class C0174a extends AbstractC5219c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C0174a(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.getRywDataFromAwaitableCondition(null, this);
        }
    }

    public static final class b extends AbstractC5219c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.setRywData(null, null, null, this);
        }
    }

    private final void checkConditionsAndComplete() {
        ArrayList arrayList = new ArrayList();
        for (C4938g c4938g : this.conditions) {
            InterfaceC4837a interfaceC4837a = (InterfaceC4837a) c4938g.f40162n;
            Y y6 = (InterfaceC0387l) c4938g.f40163u;
            if (interfaceC4837a.isMet(this.indexedTokens)) {
                C4781b rywData = interfaceC4837a.getRywData(this.indexedTokens);
                if (((h0) y6).C() instanceof V) {
                    ((C0388m) y6).J(rywData);
                }
                arrayList.add(new C4938g(interfaceC4837a, y6));
            }
        }
        this.conditions.removeAll(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v6, types: [W7.a] */
    @Override // o4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getRywDataFromAwaitableCondition(InterfaceC4837a interfaceC4837a, InterfaceC5133d interfaceC5133d) {
        C0174a c0174a;
        int i;
        d dVar;
        a aVar;
        try {
            if (interfaceC5133d instanceof C0174a) {
                c0174a = (C0174a) interfaceC5133d;
                int i4 = c0174a.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c0174a.label = i4 - Integer.MIN_VALUE;
                    Object obj = c0174a.result;
                    EnumC5179a enumC5179a = EnumC5179a.f41704n;
                    i = c0174a.label;
                    if (i != 0) {
                        f.r(obj);
                        W7.a aVar2 = this.mutex;
                        c0174a.L$0 = this;
                        c0174a.L$1 = interfaceC4837a;
                        c0174a.L$2 = aVar2;
                        c0174a.label = 1;
                        dVar = (d) aVar2;
                        if (dVar.c(c0174a) == enumC5179a) {
                            return enumC5179a;
                        }
                        aVar = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r52 = (W7.a) c0174a.L$2;
                        InterfaceC4837a interfaceC4837a2 = (InterfaceC4837a) c0174a.L$1;
                        aVar = (a) c0174a.L$0;
                        f.r(obj);
                        dVar = r52;
                        interfaceC4837a = interfaceC4837a2;
                    }
                    C0388m a9 = AbstractC0399y.a();
                    aVar.conditions.add(new C4938g(interfaceC4837a, a9));
                    aVar.checkConditionsAndComplete();
                    return a9;
                }
            }
            C0388m a92 = AbstractC0399y.a();
            aVar.conditions.add(new C4938g(interfaceC4837a, a92));
            aVar.checkConditionsAndComplete();
            return a92;
        } finally {
            dVar.d(null);
        }
        c0174a = new C0174a(interfaceC5133d);
        Object obj2 = c0174a.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = c0174a.label;
        if (i != 0) {
        }
    }

    @Override // o4.c
    public Object resolveConditionsWithID(String str, InterfaceC5133d interfaceC5133d) {
        ArrayList arrayList = new ArrayList();
        for (C4938g c4938g : this.conditions) {
            InterfaceC4837a interfaceC4837a = (InterfaceC4837a) c4938g.f40162n;
            Y y6 = (InterfaceC0387l) c4938g.f40163u;
            if (h.a(interfaceC4837a.getId(), str) && (((h0) y6).C() instanceof V)) {
                ((C0388m) y6).J(null);
            }
            arrayList.add(new C4938g(interfaceC4837a, y6));
        }
        this.conditions.removeAll(arrayList);
        return v.f40183a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:12:0x0062, B:14:0x006a, B:15:0x0075), top: B:11:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v6, types: [W7.a] */
    @Override // o4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setRywData(String str, o4.b bVar, C4781b c4781b, InterfaceC5133d interfaceC5133d) {
        b bVar2;
        int i;
        d dVar;
        a aVar;
        Map<o4.b, C4781b> map;
        try {
            if (interfaceC5133d instanceof b) {
                bVar2 = (b) interfaceC5133d;
                int i4 = bVar2.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    bVar2.label = i4 - Integer.MIN_VALUE;
                    Object obj = bVar2.result;
                    EnumC5179a enumC5179a = EnumC5179a.f41704n;
                    i = bVar2.label;
                    if (i != 0) {
                        f.r(obj);
                        W7.a aVar2 = this.mutex;
                        bVar2.L$0 = this;
                        bVar2.L$1 = str;
                        bVar2.L$2 = bVar;
                        bVar2.L$3 = c4781b;
                        bVar2.L$4 = aVar2;
                        bVar2.label = 1;
                        dVar = (d) aVar2;
                        if (dVar.c(bVar2) == enumC5179a) {
                            return enumC5179a;
                        }
                        aVar = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r52 = (W7.a) bVar2.L$4;
                        c4781b = (C4781b) bVar2.L$3;
                        bVar = (o4.b) bVar2.L$2;
                        String str2 = (String) bVar2.L$1;
                        aVar = (a) bVar2.L$0;
                        f.r(obj);
                        dVar = r52;
                        str = str2;
                    }
                    Map<String, Map<o4.b, C4781b>> map2 = aVar.indexedTokens;
                    map = map2.get(str);
                    if (map == null) {
                        map = new LinkedHashMap<>();
                        map2.put(str, map);
                    }
                    map.put(bVar, c4781b);
                    aVar.checkConditionsAndComplete();
                    dVar.d(null);
                    return v.f40183a;
                }
            }
            Map<String, Map<o4.b, C4781b>> map22 = aVar.indexedTokens;
            map = map22.get(str);
            if (map == null) {
            }
            map.put(bVar, c4781b);
            aVar.checkConditionsAndComplete();
            dVar.d(null);
            return v.f40183a;
        } catch (Throwable th) {
            dVar.d(null);
            throw th;
        }
        bVar2 = new b(interfaceC5133d);
        Object obj2 = bVar2.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = bVar2.label;
        if (i != 0) {
        }
    }
}
