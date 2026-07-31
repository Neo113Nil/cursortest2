package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.c;
import com.chartboost.sdk.impl.o5;
import com.pubmatic.sdk.video.POBVastError;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/* loaded from: classes4.dex */
public final class yj {
    public static final a d = new a(null);
    public final tj a;
    public final int b;
    public List c;

    public static final class b {
        public static final b a = new b();

        public final void a(String str, int i, zj context) {
            Intrinsics.checkNotNullParameter(context, "context");
            List<qi> b = context.b();
            if (!(b instanceof Collection) || !b.isEmpty()) {
                for (qi qiVar : b) {
                    if (Intrinsics.areEqual(qiVar.a(), "error") && qiVar.c() == context.c() && Intrinsics.areEqual(qiVar.e(), str) && Intrinsics.areEqual(qiVar.b().get("VAST_ERROR_CODE"), Integer.valueOf(i))) {
                        return;
                    }
                }
            }
            context.b().add(new qi("error", str, context.c(), null, MapsKt.mapOf(TuplesKt.to("VAST_ERROR_CODE", Integer.valueOf(i))), null, 40, null));
        }
    }

    public static final class c extends ContinuationImpl {
        public /* synthetic */ Object b;
        public int d;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            Object a = yj.this.a(null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    public static final class d extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public Object h;
        public Object i;
        public Object j;
        public Object k;
        public Object l;
        public /* synthetic */ Object m;
        public int o;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.m = obj;
            this.o |= Integer.MIN_VALUE;
            Object a = yj.this.a(null, null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    public static final class e extends ContinuationImpl {
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            Object b = yj.this.b(null, null, this);
            return b == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b : Result.m8022boximpl(b);
        }
    }

    public yj(tj vastFetcher, int i) {
        Intrinsics.checkNotNullParameter(vastFetcher, "vastFetcher");
        this.a = vastFetcher;
        this.b = i;
        this.c = CollectionsKt.emptyList();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, zj zjVar, Continuation continuation) {
        e eVar;
        int i;
        Object a2;
        yj yjVar;
        List emptyList;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.f = i2 - Integer.MIN_VALUE;
                Object obj = eVar.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = eVar.f;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    eVar.b = this;
                    eVar.c = zjVar;
                    eVar.f = 1;
                    a2 = a(str, zjVar, eVar);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    yjVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zjVar = (zj) eVar.c;
                    yjVar = (yj) eVar.b;
                    ResultKt.throwOnFailure(obj);
                    a2 = ((Result) obj).getValue();
                }
                if (!Result.m8028isFailureimpl(a2)) {
                    List b2 = zjVar.b();
                    emptyList = new ArrayList();
                    for (Object obj2 : b2) {
                        if (Intrinsics.areEqual(((qi) obj2).a(), "error")) {
                            emptyList.add(obj2);
                        }
                    }
                } else {
                    emptyList = CollectionsKt.emptyList();
                }
                yjVar.c = emptyList;
                return a2;
            }
        }
        eVar = new e(continuation);
        Object obj3 = eVar.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = eVar.f;
        if (i != 0) {
        }
        if (!Result.m8028isFailureimpl(a2)) {
        }
        yjVar.c = emptyList;
        return a2;
    }

    public /* synthetic */ yj(tj tjVar, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(tjVar, (i2 & 2) != 0 ? 10 : i);
    }

    public final List a() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Continuation continuation) {
        c cVar;
        int i;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.d = i2 - Integer.MIN_VALUE;
                Object obj = cVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cVar.d;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((Result) obj).getValue();
                }
                ResultKt.throwOnFailure(obj);
                zj zjVar = new zj(this.a, this.b, 0, null, null, null, 56, null);
                cVar.d = 1;
                Object b2 = b(str, zjVar, cVar);
                return b2 == coroutine_suspended ? coroutine_suspended : b2;
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cVar.d;
        if (i == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x094f  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x090a  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31, types: [T] */
    /* JADX WARN: Type inference failed for: r12v52, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v54 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v21, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:193:0x05d5 -> B:11:0x05df). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, zj zjVar, Continuation continuation) {
        d dVar;
        int i;
        String a2;
        yj yjVar;
        ArrayList arrayList;
        String str2;
        List list;
        ArrayList arrayList2;
        d dVar2;
        Iterator it;
        zj zjVar2;
        String str3;
        Ref$ObjectRef ref$ObjectRef;
        Object obj;
        List list2;
        ArrayList arrayList3;
        ?? r13;
        String str4;
        String str5;
        Iterator it2;
        com.chartboost.sdk.impl.c cVar;
        zj zjVar3;
        yj yjVar2;
        List list3;
        Object obj2;
        Integer a3;
        Iterator it3;
        d dVar3;
        Object obj3;
        String str6;
        String str7;
        yj yjVar3;
        String str8;
        List b2;
        int i2;
        Iterator it4;
        boolean z;
        d dVar4;
        zj zjVar4;
        Object obj4;
        String str9;
        String str10;
        List plus;
        Iterator it5;
        String str11;
        String str12;
        o5 o5Var;
        y4 a4;
        Iterator it6;
        String str13;
        wa a5;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i3 = dVar.o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dVar.o = i3 - Integer.MIN_VALUE;
                Object obj5 = dVar.m;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dVar.o;
                String str14 = ", message=";
                String str15 = ", errorType=";
                String str16 = ", vastErrorCode=";
                String str17 = "VAST_ERROR_CODE";
                if (i != 0) {
                    ResultKt.throwOnFailure(obj5);
                    bm bmVar = bm.a;
                    Object a6 = bmVar.a(str);
                    if (Result.m8028isFailureimpl(a6)) {
                        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(a6);
                        Intrinsics.checkNotNull(m8026exceptionOrNullimpl);
                        return Result.m8023constructorimpl(ResultKt.createFailure(m8026exceptionOrNullimpl));
                    }
                    ResultKt.throwOnFailure(a6);
                    Element documentElement = ((Document) a6).getDocumentElement();
                    if (!Intrinsics.areEqual(documentElement.getNodeName(), VastTagName.VAST)) {
                        return Result.m8023constructorimpl(ResultKt.createFailure(new mb("Root element is not VAST.", Boxing.boxInt(101))));
                    }
                    Intrinsics.checkNotNull(documentElement);
                    a2 = bmVar.a(documentElement, "version");
                    List e2 = bmVar.e(documentElement, "Error");
                    List c2 = bmVar.c(documentElement, "Ad");
                    if (c2.isEmpty()) {
                        Iterator it7 = e2.iterator();
                        while (it7.hasNext()) {
                            zjVar.b().add(new qi("error", (String) it7.next(), zjVar.c(), null, MapsKt.mapOf(TuplesKt.to("VAST_ERROR_CODE", Boxing.boxInt(POBVastError.NO_VAST_RESPONSE))), null, 40, null));
                        }
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m8023constructorimpl(new qj(a2, CollectionsKt.emptyList(), CollectionsKt.toMutableList((Collection) CollectionsKt.distinct(zjVar.b())), CollectionsKt.toMutableList((Collection) CollectionsKt.distinct(zjVar.a())), null, 16, null));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    yjVar = this;
                    arrayList = new ArrayList();
                    str2 = a2;
                    list = e2;
                    arrayList2 = arrayList4;
                    dVar2 = dVar;
                    it = c2.iterator();
                    zjVar2 = zjVar;
                    while (it.hasNext()) {
                    }
                    if (!arrayList2.isEmpty()) {
                    }
                    if (zjVar2.c() == 0) {
                    }
                    List distinct = CollectionsKt.distinct(zjVar2.b());
                    List distinct2 = CollectionsKt.distinct(zjVar2.a());
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m8023constructorimpl(new qj(str2, arrayList2, distinct, distinct2, null, 16, null));
                }
                if (i == 1) {
                    Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) dVar.l;
                    List list4 = (List) dVar.k;
                    String str18 = (String) dVar.j;
                    com.chartboost.sdk.impl.c cVar2 = (com.chartboost.sdk.impl.c) dVar.i;
                    Iterator it8 = (Iterator) dVar.h;
                    r13 = (List) dVar.g;
                    ?? r14 = (List) dVar.f;
                    list2 = (List) dVar.e;
                    String str19 = (String) dVar.d;
                    zj zjVar5 = (zj) dVar.c;
                    yj yjVar4 = (yj) dVar.b;
                    ResultKt.throwOnFailure(obj5);
                    obj2 = ((Result) obj5).getValue();
                    ref$ObjectRef = ref$ObjectRef2;
                    obj = coroutine_suspended;
                    str3 = "VAST_ERROR_CODE";
                    cVar = cVar2;
                    yjVar2 = yjVar4;
                    list3 = list4;
                    str5 = str18;
                    it2 = it8;
                    zjVar3 = zjVar5;
                    str4 = str19;
                    arrayList3 = r14;
                    if (!Result.m8028isFailureimpl(obj2)) {
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) dVar.k;
                    List list5 = (List) dVar.j;
                    com.chartboost.sdk.impl.c cVar3 = (com.chartboost.sdk.impl.c) dVar.i;
                    Iterator it9 = (Iterator) dVar.h;
                    ?? r12 = (List) dVar.g;
                    ?? r11 = (List) dVar.f;
                    List list6 = (List) dVar.e;
                    String str20 = (String) dVar.d;
                    zj zjVar6 = (zj) dVar.c;
                    yj yjVar5 = (yj) dVar.b;
                    ResultKt.throwOnFailure(obj5);
                    Object a7 = ((Result) obj5).getValue();
                    String str21 = ", message=";
                    str3 = "VAST_ERROR_CODE";
                    List list7 = list5;
                    String str22 = str20;
                    Object obj6 = coroutine_suspended;
                    ArrayList arrayList5 = r11;
                    d dVar5 = dVar;
                    Ref$ObjectRef ref$ObjectRef4 = ref$ObjectRef3;
                    Iterator it10 = it9;
                    list = list6;
                    zjVar3 = zjVar6;
                    yjVar = yjVar5;
                    ArrayList arrayList6 = r12;
                    if (!Result.m8029isSuccessimpl(a7)) {
                        ResultKt.throwOnFailure(a7);
                        List a8 = ((qj) a7).a();
                        ArrayList arrayList7 = new ArrayList();
                        Iterator it11 = a8.iterator();
                        while (it11.hasNext()) {
                            Iterator it12 = it10;
                            Object next = it11.next();
                            Iterator it13 = it11;
                            if (next instanceof c.a) {
                                arrayList7.add(next);
                            }
                            it10 = it12;
                            it11 = it13;
                        }
                        Iterator it14 = it10;
                        Iterator it15 = arrayList7.iterator();
                        while (it15.hasNext()) {
                            c.a aVar = (c.a) it15.next();
                            if (list7.isEmpty() && ref$ObjectRef4.element == null) {
                                it4 = it15;
                                plus = aVar.a().b();
                                dVar4 = dVar5;
                                zjVar4 = zjVar3;
                                obj4 = obj6;
                                str9 = str15;
                                str10 = str16;
                            } else {
                                List b3 = aVar.a().b();
                                it4 = it15;
                                if (!(b3 instanceof Collection) || !b3.isEmpty()) {
                                    Iterator it16 = b3.iterator();
                                    while (it16.hasNext()) {
                                        if (((o5) it16.next()) instanceof o5.a) {
                                            z = true;
                                            break;
                                        }
                                    }
                                }
                                z = false;
                                List b4 = aVar.a().b();
                                dVar4 = dVar5;
                                zjVar4 = zjVar3;
                                obj4 = obj6;
                                ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(b4, 10));
                                Iterator it17 = b4.iterator();
                                while (it17.hasNext()) {
                                    o5 o5Var2 = (o5) it17.next();
                                    if (o5Var2 instanceof o5.a) {
                                        o5.a aVar2 = (o5.a) o5Var2;
                                        List a9 = aVar2.a().a();
                                        it5 = it17;
                                        str11 = str15;
                                        ArrayList arrayList9 = new ArrayList(CollectionsKt.collectionSizeOrDefault(a9, 10));
                                        Iterator it18 = a9.iterator();
                                        while (it18.hasNext()) {
                                            y4 y4Var = (y4) it18.next();
                                            ArrayList arrayList10 = new ArrayList();
                                            for (Object obj7 : list7) {
                                                y4 y4Var2 = (y4) obj7;
                                                if (y4Var2.g() != null) {
                                                    it6 = it18;
                                                    String g = y4Var2.g();
                                                    str13 = str16;
                                                    if (!Intrinsics.areEqual(g, y4Var.g())) {
                                                        str16 = str13;
                                                        it18 = it6;
                                                    }
                                                } else {
                                                    it6 = it18;
                                                    str13 = str16;
                                                }
                                                arrayList10.add(obj7);
                                                str16 = str13;
                                                it18 = it6;
                                            }
                                            Iterator it19 = it18;
                                            String str23 = str16;
                                            ArrayList arrayList11 = new ArrayList();
                                            Iterator it20 = arrayList10.iterator();
                                            while (it20.hasNext()) {
                                                CollectionsKt.addAll(arrayList11, ((y4) it20.next()).i());
                                            }
                                            List distinct3 = CollectionsKt.distinct(CollectionsKt.plus((Collection) arrayList11, (Iterable) y4Var.i()));
                                            ArrayList arrayList12 = new ArrayList();
                                            Iterator it21 = arrayList10.iterator();
                                            while (it21.hasNext()) {
                                                CollectionsKt.addAll(arrayList12, ((y4) it21.next()).c());
                                            }
                                            a4 = y4Var.a((r37 & 1) != 0 ? y4Var.a : null, (r37 & 2) != 0 ? y4Var.b : null, (r37 & 4) != 0 ? y4Var.c : null, (r37 & 8) != 0 ? y4Var.d : null, (r37 & 16) != 0 ? y4Var.e : null, (r37 & 32) != 0 ? y4Var.f : null, (r37 & 64) != 0 ? y4Var.g : null, (r37 & 128) != 0 ? y4Var.h : null, (r37 & 256) != 0 ? y4Var.i : null, (r37 & 512) != 0 ? y4Var.j : null, (r37 & 1024) != 0 ? y4Var.k : null, (r37 & 2048) != 0 ? y4Var.l : null, (r37 & 4096) != 0 ? y4Var.m : null, (r37 & 8192) != 0 ? y4Var.n : null, (r37 & 16384) != 0 ? y4Var.o : null, (r37 & 32768) != 0 ? y4Var.p : distinct3, (r37 & 65536) != 0 ? y4Var.q : null, (r37 & 131072) != 0 ? y4Var.r : CollectionsKt.distinct(CollectionsKt.plus((Collection) arrayList12, (Iterable) y4Var.c())), (r37 & 262144) != 0 ? y4Var.s : null);
                                            arrayList9.add(a4);
                                            str16 = str23;
                                            it18 = it19;
                                        }
                                        str12 = str16;
                                        o5Var = o5.a.a(aVar2, null, null, null, null, b5.a(aVar2.a(), null, arrayList9, 1, null), null, 47, null);
                                    } else {
                                        it5 = it17;
                                        str11 = str15;
                                        str12 = str16;
                                        if (o5Var2 instanceof o5.b) {
                                            if (ref$ObjectRef4.element != null) {
                                                o5.b bVar = (o5.b) o5Var2;
                                                mk c3 = bVar.a().c();
                                                if ((c3 != null ? c3.a() : null) == null) {
                                                    String str24 = (String) ref$ObjectRef4.element;
                                                    mk c4 = bVar.a().c();
                                                    List b5 = c4 != null ? c4.b() : null;
                                                    if (b5 == null) {
                                                        b5 = CollectionsKt.emptyList();
                                                    }
                                                    o5Var = o5.b.a(bVar, null, null, null, null, pb.a(bVar.a(), null, null, new mk(str24, b5), null, null, 27, null), null, 47, null);
                                                }
                                            }
                                            o5Var = (o5.b) o5Var2;
                                        } else {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                    arrayList8.add(o5Var);
                                    it17 = it5;
                                    str15 = str11;
                                    str16 = str12;
                                }
                                str9 = str15;
                                str10 = str16;
                                plus = (z || list7.isEmpty()) ? arrayList8 : CollectionsKt.plus(arrayList8, new o5.a(null, null, null, CollectionsKt.emptyList(), new b5(null, CollectionsKt.toList(list7)), null, 32, null));
                            }
                            c.b bVar2 = (c.b) cVar3;
                            a5 = r34.a((r20 & 1) != 0 ? r34.a : null, (r20 & 2) != 0 ? r34.b : null, (r20 & 4) != 0 ? r34.c : null, (r20 & 8) != 0 ? r34.d : null, (r20 & 16) != 0 ? r34.e : CollectionsKt.distinct(CollectionsKt.plus((Collection) bVar2.a().e(), (Iterable) aVar.a().d())), (r20 & 32) != 0 ? r34.f : plus, (r20 & 64) != 0 ? r34.g : CollectionsKt.distinct(CollectionsKt.plus((Collection) bVar2.a().d(), (Iterable) aVar.a().c())), (r20 & 128) != 0 ? r34.h : CollectionsKt.distinct(CollectionsKt.plus((Collection) bVar2.a().a(), (Iterable) aVar.a().a())), (r20 & 256) != 0 ? aVar.a().i : CollectionsKt.distinct(CollectionsKt.plus((Collection) bVar2.a().g(), (Iterable) aVar.a().e())));
                            arrayList5.add(c.a.a(aVar, null, a5, 1, null));
                            it15 = it4;
                            dVar5 = dVar4;
                            zjVar3 = zjVar4;
                            str15 = str9;
                            str16 = str10;
                            obj6 = obj4;
                        }
                        d dVar6 = dVar5;
                        zj zjVar7 = zjVar3;
                        it = it14;
                        coroutine_suspended = obj6;
                        arrayList = arrayList6;
                        arrayList2 = arrayList5;
                        dVar2 = dVar6;
                        zjVar2 = zjVar7;
                        str14 = str21;
                        str2 = str22;
                        str17 = str3;
                        while (it.hasNext()) {
                            Element element = (Element) it.next();
                            Object a10 = p.a.a(element, zjVar2);
                            if (Result.m8028isFailureimpl(a10)) {
                                Throwable m8026exceptionOrNullimpl2 = Result.m8026exceptionOrNullimpl(a10);
                                Intrinsics.checkNotNull(m8026exceptionOrNullimpl2);
                                if (zjVar2.c() > 0) {
                                    obj3 = coroutine_suspended;
                                    i2 = 300;
                                } else {
                                    i2 = POBVastError.UNDEFINED_ERROR;
                                    obj3 = coroutine_suspended;
                                }
                                if (m8026exceptionOrNullimpl2 instanceof rj) {
                                    rj rjVar = (rj) m8026exceptionOrNullimpl2;
                                    if (rjVar.a() != null) {
                                        i2 = rjVar.a().intValue();
                                    }
                                }
                                it3 = it;
                                int i4 = i2;
                                str7 = str2;
                                String a11 = bm.a.a(element, "id");
                                int c5 = zjVar2.c();
                                String simpleName = m8026exceptionOrNullimpl2.getClass().getSimpleName();
                                dVar3 = dVar2;
                                String message = m8026exceptionOrNullimpl2.getMessage();
                                yjVar3 = yjVar;
                                StringBuilder sb = new StringBuilder();
                                str6 = str17;
                                sb.append("VAST Ad parse failed: adId=");
                                sb.append(a11);
                                sb.append(", wrapperDepth=");
                                sb.append(c5);
                                sb.append(str16);
                                sb.append(i4);
                                sb.append(str15);
                                sb.append(simpleName);
                                sb.append(str14);
                                sb.append(message);
                                xb.b(sb.toString(), (Throwable) null, 2, (Object) null);
                                Iterator it22 = list.iterator();
                                while (it22.hasNext()) {
                                    b.a.a((String) it22.next(), i4, zjVar2);
                                }
                                arrayList.add(m8026exceptionOrNullimpl2);
                            } else {
                                it3 = it;
                                dVar3 = dVar2;
                                obj3 = coroutine_suspended;
                                str6 = str17;
                                str7 = str2;
                                yjVar3 = yjVar;
                                ResultKt.throwOnFailure(a10);
                                com.chartboost.sdk.impl.c cVar4 = (com.chartboost.sdk.impl.c) a10;
                                if (cVar4 instanceof c.a) {
                                    arrayList2.add(cVar4);
                                } else if (cVar4 instanceof c.b) {
                                    c.b bVar3 = (c.b) cVar4;
                                    String f = bVar3.a().f();
                                    if (zjVar2.e().contains(f)) {
                                        xb.b("VAST wrapper loop detected: uri=" + f + ", visitedUris=" + zjVar2.e(), (Throwable) null, 2, (Object) null);
                                        b.a.a(f, 302, zjVar2);
                                        return Result.m8023constructorimpl(ResultKt.createFailure(new am(f, null, 2, null)));
                                    }
                                    if (zjVar2.c() >= zjVar2.d()) {
                                        xb.b("VAST max wrapper depth exceeded: currentDepth=" + zjVar2.c() + ", maxDepth=" + zjVar2.d() + ", wrapperUri=" + f, (Throwable) null, 2, (Object) null);
                                        ec ecVar = new ec(null, 1, null);
                                        b.a.a(f, 302, zjVar2);
                                        return Result.m8023constructorimpl(ResultKt.createFailure(ecVar));
                                    }
                                    Iterator it23 = bVar3.a().e().iterator();
                                    while (it23.hasNext()) {
                                        zjVar2.b().add(new qi("impression", (String) it23.next(), zjVar2.c(), null, null, null, 56, null));
                                    }
                                    Iterator it24 = bVar3.a().c().iterator();
                                    while (it24.hasNext()) {
                                        zjVar2.b().add(new qi("error", (String) it24.next(), zjVar2.c(), null, MapsKt.mapOf(TuplesKt.to(str6, Boxing.boxInt(300))), null, 40, null));
                                    }
                                    String str25 = str6;
                                    zjVar2.a().addAll(bVar3.a().a());
                                    ArrayList arrayList13 = new ArrayList();
                                    Ref$ObjectRef ref$ObjectRef5 = new Ref$ObjectRef();
                                    Iterator it25 = bVar3.a().b().iterator();
                                    while (it25.hasNext()) {
                                        o5 o5Var3 = (o5) it25.next();
                                        Iterator it26 = it25;
                                        if (o5Var3 instanceof o5.b) {
                                            o5.b bVar4 = (o5.b) o5Var3;
                                            Iterator it27 = bVar4.a().b().iterator();
                                            while (it27.hasNext()) {
                                                zjVar2.b().add(qi.a((qi) it27.next(), null, null, zjVar2.c(), null, null, null, 59, null));
                                                it27 = it27;
                                                str25 = str25;
                                            }
                                            str8 = str25;
                                            mk c6 = bVar4.a().c();
                                            if (c6 != null && (b2 = c6.b()) != null) {
                                                for (Iterator it28 = b2.iterator(); it28.hasNext(); it28 = it28) {
                                                    zjVar2.b().add(new qi("click", (String) it28.next(), zjVar2.c(), null, null, null, 56, null));
                                                }
                                                Unit unit = Unit.INSTANCE;
                                            }
                                            if (ref$ObjectRef5.element == null) {
                                                mk c7 = bVar4.a().c();
                                                ref$ObjectRef5.element = c7 != null ? c7.a() : 0;
                                            }
                                        } else {
                                            str8 = str25;
                                            if (o5Var3 instanceof o5.a) {
                                                arrayList13.addAll(((o5.a) o5Var3).a().a());
                                            }
                                        }
                                        it25 = it26;
                                        str25 = str8;
                                    }
                                    str3 = str25;
                                    tj tjVar = yjVar3.a;
                                    String f2 = bVar3.a().f();
                                    dVar3.b = yjVar3;
                                    dVar3.c = zjVar2;
                                    str4 = str7;
                                    dVar3.d = str4;
                                    dVar3.e = list;
                                    dVar3.f = arrayList2;
                                    dVar3.g = arrayList;
                                    List list8 = list;
                                    it2 = it3;
                                    dVar3.h = it2;
                                    dVar3.i = cVar4;
                                    dVar3.j = f;
                                    dVar3.k = arrayList13;
                                    dVar3.l = ref$ObjectRef5;
                                    dVar3.o = 1;
                                    Object a12 = tjVar.a(f2, dVar3);
                                    if (a12 == obj3) {
                                        return obj3;
                                    }
                                    obj = obj3;
                                    list3 = arrayList13;
                                    ref$ObjectRef = ref$ObjectRef5;
                                    r13 = arrayList;
                                    cVar = cVar4;
                                    yjVar2 = yjVar3;
                                    str5 = f;
                                    list2 = list8;
                                    ArrayList arrayList14 = arrayList2;
                                    zjVar3 = zjVar2;
                                    obj2 = a12;
                                    dVar = dVar3;
                                    arrayList3 = arrayList14;
                                    if (!Result.m8028isFailureimpl(obj2)) {
                                        Throwable m8026exceptionOrNullimpl3 = Result.m8026exceptionOrNullimpl(obj2);
                                        sj sjVar = m8026exceptionOrNullimpl3 instanceof sj ? (sj) m8026exceptionOrNullimpl3 : null;
                                        int intValue = (sjVar == null || (a3 = sjVar.a()) == null) ? 300 : a3.intValue();
                                        c.b bVar5 = (c.b) cVar;
                                        xb.b("VAST wrapper fetch failed: wrapperUri=" + bVar5.a().f() + ", wrapperDepth=" + zjVar3.c() + str16 + intValue + str15 + (m8026exceptionOrNullimpl3 != null ? m8026exceptionOrNullimpl3.getClass().getSimpleName() : null) + str14 + (m8026exceptionOrNullimpl3 != null ? m8026exceptionOrNullimpl3.getMessage() : null), (Throwable) null, 2, (Object) null);
                                        b.a.a(bVar5.a().f(), intValue, zjVar3);
                                        Intrinsics.checkNotNull(m8026exceptionOrNullimpl3);
                                        return Result.m8023constructorimpl(ResultKt.createFailure(m8026exceptionOrNullimpl3));
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                    str21 = str14;
                                    zj a13 = zj.a(zjVar3, null, 0, zjVar3.c() + 1, SetsKt.plus(zjVar3.e(), str5), null, null, 51, null);
                                    dVar.b = yjVar2;
                                    dVar.c = zjVar3;
                                    dVar.d = str4;
                                    dVar.e = list2;
                                    dVar.f = arrayList3;
                                    dVar.g = r13;
                                    dVar.h = it2;
                                    dVar.i = cVar;
                                    dVar.j = list3;
                                    ref$ObjectRef4 = ref$ObjectRef;
                                    dVar.k = ref$ObjectRef4;
                                    list7 = list3;
                                    dVar.l = null;
                                    dVar.o = 2;
                                    a7 = yjVar2.a((String) obj2, a13, dVar);
                                    obj6 = obj;
                                    if (a7 == obj6) {
                                        return obj6;
                                    }
                                    yj yjVar6 = yjVar2;
                                    dVar5 = dVar;
                                    it10 = it2;
                                    list = list2;
                                    cVar3 = cVar;
                                    str22 = str4;
                                    arrayList6 = r13;
                                    yjVar = yjVar6;
                                    arrayList5 = arrayList3;
                                    if (!Result.m8029isSuccessimpl(a7)) {
                                        Throwable m8026exceptionOrNullimpl4 = Result.m8026exceptionOrNullimpl(a7);
                                        Intrinsics.checkNotNull(m8026exceptionOrNullimpl4);
                                        return Result.m8023constructorimpl(ResultKt.createFailure(m8026exceptionOrNullimpl4));
                                    }
                                }
                            }
                            str2 = str7;
                            it = it3;
                            dVar2 = dVar3;
                            yjVar = yjVar3;
                            str15 = str15;
                            str16 = str16;
                            coroutine_suspended = obj3;
                            str14 = str14;
                            str17 = str6;
                            list = list;
                        }
                        if (!arrayList2.isEmpty() && !arrayList.isEmpty()) {
                            Result.Companion companion3 = Result.INSTANCE;
                            return Result.m8023constructorimpl(ResultKt.createFailure((Throwable) CollectionsKt.first((List) arrayList)));
                        }
                        if (zjVar2.c() == 0) {
                            Iterator it29 = arrayList2.iterator();
                            while (it29.hasNext()) {
                                for (nl nlVar : ((c.a) it29.next()).a().e()) {
                                    Iterator it30 = nlVar.b().iterator();
                                    while (it30.hasNext()) {
                                        zjVar2.b().add(new qi("viewable", (String) it30.next(), zjVar2.c(), null, null, null, 56, null));
                                    }
                                    Iterator it31 = nlVar.a().iterator();
                                    while (it31.hasNext()) {
                                        zjVar2.b().add(new qi("notViewable", (String) it31.next(), zjVar2.c(), null, null, null, 56, null));
                                    }
                                }
                            }
                        }
                        List distinct4 = CollectionsKt.distinct(zjVar2.b());
                        List distinct22 = CollectionsKt.distinct(zjVar2.a());
                        Result.Companion companion22 = Result.INSTANCE;
                        return Result.m8023constructorimpl(new qj(str2, arrayList2, distinct4, distinct22, null, 16, null));
                    }
                }
            }
        }
        dVar = new d(continuation);
        Object obj52 = dVar.m;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dVar.o;
        String str142 = ", message=";
        String str152 = ", errorType=";
        String str162 = ", vastErrorCode=";
        String str172 = "VAST_ERROR_CODE";
        if (i != 0) {
        }
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
