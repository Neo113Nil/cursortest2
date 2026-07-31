package kotlin.collections;

import a2.AbstractC1241b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class X {

    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* renamed from: m, reason: collision with root package name */
        Object f41065m;

        /* renamed from: n, reason: collision with root package name */
        Object f41066n;

        /* renamed from: o, reason: collision with root package name */
        int f41067o;

        /* renamed from: p, reason: collision with root package name */
        int f41068p;

        /* renamed from: q, reason: collision with root package name */
        private /* synthetic */ Object f41069q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f41070r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f41071s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ Iterator f41072t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ boolean f41073u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ boolean f41074v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i4, int i5, Iterator it, boolean z4, boolean z5, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f41070r = i4;
            this.f41071s = i5;
            this.f41072t = it;
            this.f41073u = z4;
            this.f41074v = z5;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlin.sequences.j jVar, kotlin.coroutines.d dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            a aVar = new a(this.f41070r, this.f41071s, this.f41072t, this.f41073u, this.f41074v, dVar);
            aVar.f41069q = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0147, code lost:
        
            if (r4.a(r11, r10) == r0) goto L77;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0162, code lost:
        
            if (r4.a(r1, r10) == r0) goto L77;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0119, code lost:
        
            if (r6.a(r11, r10) == r0) goto L77;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x0094, code lost:
        
            r10.f41069q = r4;
            r10.f41065m = r3;
            r10.f41066n = r2;
            r10.f41067o = r1;
            r10.f41068p = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
        
            if (r4.a(r3, r10) != r0) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x00d6, code lost:
        
            if (r4.a(r3, r10) == r0) goto L77;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0150  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0126  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x00b8 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0147 -> B:12:0x014a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0119 -> B:29:0x011c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x00a2 -> B:48:0x0055). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            S s4;
            Iterator it;
            kotlin.sequences.j jVar;
            kotlin.sequences.j jVar2;
            int i4;
            ArrayList arrayList;
            Iterator it2;
            int i5;
            S s5;
            kotlin.sequences.j jVar3;
            Object f4 = AbstractC1241b.f();
            int i6 = this.f41068p;
            if (i6 == 0) {
                ResultKt.a(obj);
                kotlin.sequences.j jVar4 = (kotlin.sequences.j) this.f41069q;
                int g4 = kotlin.ranges.g.g(this.f41070r, 1024);
                int i7 = this.f41071s - this.f41070r;
                if (i7 < 0) {
                    s4 = new S(g4);
                    it = this.f41072t;
                    jVar = jVar4;
                    while (it.hasNext()) {
                    }
                    if (this.f41074v) {
                    }
                    return Unit.f41027a;
                }
                jVar2 = jVar4;
                i4 = 0;
                arrayList = new ArrayList(g4);
                it2 = this.f41072t;
                i5 = i7;
                while (true) {
                    if (!it2.hasNext()) {
                    }
                }
                return Unit.f41027a;
            }
            if (i6 == 1) {
                i5 = this.f41067o;
                it2 = (Iterator) this.f41066n;
                arrayList = (ArrayList) this.f41065m;
                jVar2 = (kotlin.sequences.j) this.f41069q;
                ResultKt.a(obj);
                i4 = i5;
                if (this.f41073u) {
                    arrayList.clear();
                } else {
                    arrayList = new ArrayList(this.f41070r);
                }
                i5 = i4;
                while (true) {
                    if (!it2.hasNext()) {
                        Object next = it2.next();
                        if (i4 > 0) {
                            i4--;
                        } else {
                            arrayList.add(next);
                            if (arrayList.size() == this.f41070r) {
                                break;
                            }
                        }
                    } else if (!arrayList.isEmpty() && (this.f41074v || arrayList.size() == this.f41070r)) {
                        this.f41069q = null;
                        this.f41065m = null;
                        this.f41066n = null;
                        this.f41068p = 2;
                    }
                }
                return Unit.f41027a;
            }
            if (i6 != 2) {
                if (i6 == 3) {
                    it = (Iterator) this.f41066n;
                    s4 = (S) this.f41065m;
                    jVar = (kotlin.sequences.j) this.f41069q;
                    ResultKt.a(obj);
                    s4.k(this.f41071s);
                    while (it.hasNext()) {
                        s4.f(it.next());
                        if (s4.h()) {
                            int size = s4.size();
                            int i8 = this.f41070r;
                            if (size >= i8) {
                                Object arrayList2 = this.f41073u ? s4 : new ArrayList(s4);
                                this.f41069q = jVar;
                                this.f41065m = s4;
                                this.f41066n = it;
                                this.f41068p = 3;
                            } else {
                                s4 = s4.g(i8);
                            }
                        }
                    }
                    if (this.f41074v) {
                        s5 = s4;
                        jVar3 = jVar;
                        if (s5.size() <= this.f41071s) {
                        }
                        return f4;
                    }
                    return Unit.f41027a;
                }
                if (i6 == 4) {
                    s5 = (S) this.f41065m;
                    jVar3 = (kotlin.sequences.j) this.f41069q;
                    ResultKt.a(obj);
                    s5.k(this.f41071s);
                    if (s5.size() <= this.f41071s) {
                        if (!s5.isEmpty()) {
                            this.f41069q = null;
                            this.f41065m = null;
                            this.f41066n = null;
                            this.f41068p = 5;
                        }
                        return Unit.f41027a;
                    }
                    Object arrayList3 = this.f41073u ? s5 : new ArrayList(s5);
                    this.f41069q = jVar3;
                    this.f41065m = s5;
                    this.f41066n = null;
                    this.f41068p = 4;
                    return f4;
                }
                if (i6 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            ResultKt.a(obj);
            return Unit.f41027a;
        }
    }

    public static final void a(int i4, int i5) {
        String str;
        if (i4 <= 0 || i5 <= 0) {
            if (i4 != i5) {
                str = "Both size " + i4 + " and step " + i5 + " must be greater than zero.";
            } else {
                str = "size " + i4 + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    public static final Iterator b(Iterator iterator, int i4, int i5, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        return !iterator.hasNext() ? C3233x.f41101b : kotlin.sequences.k.a(new a(i4, i5, iterator, z5, z4, null));
    }
}
