package k6;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f extends e {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements b<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f18287a;

        public a(Iterator it) {
            this.f18287a = it;
        }

        @Override // k6.b
        public Iterator<T> iterator() {
            return this.f18287a;
        }
    }

    public static <T> b<T> a(Iterator<? extends T> it) {
        kotlin.jvm.internal.i.d(it, "<this>");
        return b(new a(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> b<T> b(b<? extends T> bVar) {
        kotlin.jvm.internal.i.d(bVar, "<this>");
        return bVar instanceof k6.a ? bVar : new k6.a(bVar);
    }
}
