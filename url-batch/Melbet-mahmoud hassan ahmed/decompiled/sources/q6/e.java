package q6;

import f6.p;
import kotlin.jvm.internal.j;
import kotlinx.coroutines.internal.w;
import m6.o1;
import y5.g;

/* loaded from: classes.dex */
public final class e {

    static final class a extends j implements p<Integer, g.b, Integer> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ c<?> f20384f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c<?> cVar) {
            super(2);
            this.f20384f = cVar;
        }

        public final Integer a(int i7, g.b bVar) {
            g.c<?> key = bVar.getKey();
            g.b bVar2 = this.f20384f.f20377g.get(key);
            if (key != o1.f19317c) {
                return Integer.valueOf(bVar != bVar2 ? Integer.MIN_VALUE : i7 + 1);
            }
            o1 o1Var = (o1) bVar2;
            o1 b7 = e.b((o1) bVar, o1Var);
            if (b7 == o1Var) {
                if (o1Var != null) {
                    i7++;
                }
                return Integer.valueOf(i7);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b7 + ", expected child of " + o1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // f6.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, g.b bVar) {
            return a(num.intValue(), bVar);
        }
    }

    public static final void a(c<?> cVar, g gVar) {
        if (((Number) gVar.fold(0, new a(cVar))).intValue() == cVar.f20378h) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + cVar.f20377g + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final o1 b(o1 o1Var, o1 o1Var2) {
        while (o1Var != null) {
            if (o1Var == o1Var2 || !(o1Var instanceof w)) {
                return o1Var;
            }
            o1Var = ((w) o1Var).x0();
        }
        return null;
    }
}
