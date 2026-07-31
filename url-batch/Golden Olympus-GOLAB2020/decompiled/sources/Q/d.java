package Q;

import W1.AbstractC1233c;
import a2.AbstractC1241b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f9059a = new a(null);

    public static final class a {

        /* renamed from: Q.d$a$a, reason: collision with other inner class name */
        static final class C0057a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* renamed from: l, reason: collision with root package name */
            int f9060l;

            /* renamed from: m, reason: collision with root package name */
            /* synthetic */ Object f9061m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ List f9062n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0057a(List list, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f9062n = list;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(h hVar, kotlin.coroutines.d dVar) {
                return ((C0057a) create(hVar, dVar)).invokeSuspend(Unit.f41027a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
                C0057a c0057a = new C0057a(this.f9062n, dVar);
                c0057a.f9061m = obj;
                return c0057a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object f4 = AbstractC1241b.f();
                int i4 = this.f9060l;
                if (i4 == 0) {
                    ResultKt.a(obj);
                    h hVar = (h) this.f9061m;
                    a aVar = d.f9059a;
                    List list = this.f9062n;
                    this.f9060l = 1;
                    if (aVar.c(list, hVar, this) == f4) {
                        return f4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.a(obj);
                }
                return Unit.f41027a;
            }
        }

        static final class b extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: l, reason: collision with root package name */
            Object f9063l;

            /* renamed from: m, reason: collision with root package name */
            Object f9064m;

            /* renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f9065n;

            /* renamed from: p, reason: collision with root package name */
            int f9067p;

            b(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f9065n = obj;
                this.f9067p |= Integer.MIN_VALUE;
                return a.this.c(null, null, this);
            }
        }

        static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* renamed from: l, reason: collision with root package name */
            Object f9068l;

            /* renamed from: m, reason: collision with root package name */
            Object f9069m;

            /* renamed from: n, reason: collision with root package name */
            Object f9070n;

            /* renamed from: o, reason: collision with root package name */
            int f9071o;

            /* renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f9072p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ List f9073q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ List f9074r;

            /* renamed from: Q.d$a$c$a, reason: collision with other inner class name */
            static final class C0058a extends kotlin.coroutines.jvm.internal.l implements Function1 {

                /* renamed from: l, reason: collision with root package name */
                int f9075l;

                C0058a(Q.c cVar, kotlin.coroutines.d dVar) {
                    super(1, dVar);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(kotlin.coroutines.d dVar) {
                    return ((C0058a) create(dVar)).invokeSuspend(Unit.f41027a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
                    return new C0058a(null, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    AbstractC1241b.f();
                    int i4 = this.f9075l;
                    if (i4 == 0) {
                        ResultKt.a(obj);
                        this.f9075l = 1;
                        throw null;
                    }
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.a(obj);
                    return Unit.f41027a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(List list, List list2, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f9073q = list;
                this.f9074r = list2;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Object obj, kotlin.coroutines.d dVar) {
                return ((c) create(obj, dVar)).invokeSuspend(Unit.f41027a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
                c cVar = new c(this.f9073q, this.f9074r, dVar);
                cVar.f9072p = obj;
                return cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                List list;
                Iterator it;
                AbstractC1241b.f();
                int i4 = this.f9071o;
                if (i4 == 0) {
                    ResultKt.a(obj);
                    obj = this.f9072p;
                    List list2 = this.f9073q;
                    list = this.f9074r;
                    it = list2.iterator();
                } else if (i4 == 1) {
                    Object obj2 = this.f9070n;
                    android.support.v4.media.session.b.a(this.f9069m);
                    Iterator it2 = (Iterator) this.f9068l;
                    List list3 = (List) this.f9072p;
                    ResultKt.a(obj);
                    if (((Boolean) obj).booleanValue()) {
                        list3.add(new C0058a(null, null));
                        this.f9072p = list3;
                        this.f9068l = it2;
                        this.f9069m = null;
                        this.f9070n = null;
                        this.f9071o = 2;
                        throw null;
                    }
                    obj = obj2;
                    it = it2;
                    list = list3;
                } else {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.f9068l;
                    list = (List) this.f9072p;
                    ResultKt.a(obj);
                }
                if (!it.hasNext()) {
                    return obj;
                }
                android.support.v4.media.session.b.a(it.next());
                this.f9072p = list;
                this.f9068l = it;
                this.f9069m = null;
                this.f9070n = obj;
                this.f9071o = 1;
                throw null;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0088 -> B:13:0x006b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008b -> B:13:0x006b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(List list, h hVar, kotlin.coroutines.d dVar) {
            b bVar;
            int i4;
            List list2;
            G g4;
            Iterator it;
            Throwable th;
            if (dVar instanceof b) {
                bVar = (b) dVar;
                int i5 = bVar.f9067p;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    bVar.f9067p = i5 - Integer.MIN_VALUE;
                    Object obj = bVar.f9065n;
                    Object f4 = AbstractC1241b.f();
                    i4 = bVar.f9067p;
                    if (i4 != 0) {
                        ResultKt.a(obj);
                        ArrayList arrayList = new ArrayList();
                        Function2 cVar = new c(list, arrayList, null);
                        bVar.f9063l = arrayList;
                        bVar.f9067p = 1;
                        if (hVar.a(cVar, bVar) != f4) {
                            list2 = arrayList;
                        }
                        return f4;
                    }
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (Iterator) bVar.f9064m;
                        g4 = (G) bVar.f9063l;
                        try {
                            ResultKt.a(obj);
                        } catch (Throwable th2) {
                            Object obj2 = g4.f41132b;
                            if (obj2 == null) {
                                g4.f41132b = th2;
                            } else {
                                Intrinsics.checkNotNull(obj2);
                                AbstractC1233c.a((Throwable) g4.f41132b, th2);
                            }
                        }
                        while (it.hasNext()) {
                            Function1 function1 = (Function1) it.next();
                            bVar.f9063l = g4;
                            bVar.f9064m = it;
                            bVar.f9067p = 2;
                            if (function1.invoke(bVar) == f4) {
                                return f4;
                            }
                        }
                        th = (Throwable) g4.f41132b;
                        if (th == null) {
                            return Unit.f41027a;
                        }
                        throw th;
                    }
                    list2 = (List) bVar.f9063l;
                    ResultKt.a(obj);
                    g4 = new G();
                    it = list2.iterator();
                    while (it.hasNext()) {
                    }
                    th = (Throwable) g4.f41132b;
                    if (th == null) {
                    }
                }
            }
            bVar = new b(dVar);
            Object obj3 = bVar.f9065n;
            Object f42 = AbstractC1241b.f();
            i4 = bVar.f9067p;
            if (i4 != 0) {
            }
            g4 = new G();
            it = list2.iterator();
            while (it.hasNext()) {
            }
            th = (Throwable) g4.f41132b;
            if (th == null) {
            }
        }

        public final Function2 b(List migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            return new C0057a(migrations, null);
        }

        private a() {
        }
    }
}
