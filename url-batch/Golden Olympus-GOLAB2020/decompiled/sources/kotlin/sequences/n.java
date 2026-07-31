package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class n extends m {

    public static final class a implements Sequence {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f41232a;

        public a(Iterator it) {
            this.f41232a = it;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator iterator() {
            return this.f41232a;
        }
    }

    static final class b extends s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f41233i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<Object> invoke(@NotNull Sequence<Object> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.iterator();
        }
    }

    static final class c extends s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final c f41234i = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return obj;
        }
    }

    static final class d extends s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0 f41235i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Function0 function0) {
            super(1);
            this.f41235i = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f41235i.invoke();
        }
    }

    static final class e extends s implements Function0 {

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Object f41236i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Object obj) {
            super(0);
            this.f41236i = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return this.f41236i;
        }
    }

    public static Sequence c(Iterator it) {
        Intrinsics.checkNotNullParameter(it, "<this>");
        return d(new a(it));
    }

    public static Sequence d(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return sequence instanceof kotlin.sequences.a ? sequence : new kotlin.sequences.a(sequence);
    }

    public static Sequence e() {
        return kotlin.sequences.d.f41202a;
    }

    public static final Sequence f(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return g(sequence, b.f41233i);
    }

    private static final Sequence g(Sequence sequence, Function1 function1) {
        return sequence instanceof q ? ((q) sequence).d(function1) : new f(sequence, c.f41234i, function1);
    }

    public static Sequence h(Object obj, Function1 nextFunction) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return obj == null ? kotlin.sequences.d.f41202a : new g(new e(obj), nextFunction);
    }

    public static Sequence i(Function0 nextFunction) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return d(new g(nextFunction, new d(nextFunction)));
    }

    public static final Sequence j(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? e() : AbstractC3219i.v(elements);
    }
}
