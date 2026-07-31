package z5;

import f6.p;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.n;
import v5.l;
import v5.q;
import y5.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c {

    public static final class a extends j {

        /* renamed from: f, reason: collision with root package name */
        private int f23726f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ p f23727g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Object f23728h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y5.d dVar, p pVar, Object obj) {
            super(dVar);
            this.f23727g = pVar;
            this.f23728h = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i7 = this.f23726f;
            if (i7 == 0) {
                this.f23726f = 1;
                l.b(obj);
                return ((p) n.a(this.f23727g, 2)).invoke(this.f23728h, this);
            }
            if (i7 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f23726f = 2;
            l.b(obj);
            return obj;
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f, reason: collision with root package name */
        private int f23729f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ p f23730g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Object f23731h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(y5.d dVar, g gVar, p pVar, Object obj) {
            super(dVar, gVar);
            this.f23730g = pVar;
            this.f23731h = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i7 = this.f23729f;
            if (i7 == 0) {
                this.f23729f = 1;
                l.b(obj);
                return ((p) n.a(this.f23730g, 2)).invoke(this.f23731h, this);
            }
            if (i7 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f23729f = 2;
            l.b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, T> y5.d<q> a(p<? super R, ? super y5.d<? super T>, ? extends Object> pVar, R r7, y5.d<? super T> dVar) {
        i.d(pVar, "<this>");
        i.d(dVar, "completion");
        y5.d<?> a7 = h.a(dVar);
        if (pVar instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) pVar).create(r7, a7);
        }
        g context = a7.getContext();
        return context == y5.h.f23481f ? new a(a7, pVar, r7) : new b(a7, context, pVar, r7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> y5.d<T> b(y5.d<? super T> dVar) {
        y5.d<T> dVar2;
        i.d(dVar, "<this>");
        kotlin.coroutines.jvm.internal.d dVar3 = dVar instanceof kotlin.coroutines.jvm.internal.d ? (kotlin.coroutines.jvm.internal.d) dVar : null;
        return (dVar3 == null || (dVar2 = (y5.d<T>) dVar3.intercepted()) == null) ? dVar : dVar2;
    }
}
