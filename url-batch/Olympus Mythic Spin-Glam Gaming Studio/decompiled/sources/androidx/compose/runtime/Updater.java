package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Composer.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\u000e\u001a\u00020\n\"\u0004\b\u0001\u0010\u00072\u0006\u0010\b\u001a\u00028\u00012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u0012\u0004\b\u001e\u0010\u001f\u0088\u0001\u0004\u0092\u0001\u00020\u0003¨\u0006 "}, d2 = {"Landroidx/compose/runtime/Updater;", "T", "", "Landroidx/compose/runtime/Composer;", "composer", "constructor-impl", "(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;", "V", "value", "Lkotlin/Function2;", "", "block", "set-impl", "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "set", "Lkotlin/Function1;", "init-impl", "(Landroidx/compose/runtime/Composer;Lkotlin/jvm/functions/Function1;)V", "init", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/runtime/Composer;", "getComposer$annotations", "()V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Updater<T> {
    private final Composer composer;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static Composer m1149constructorimpl(Composer composer) {
        return composer;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1150equalsimpl(Composer composer, Object obj) {
        return (obj instanceof Updater) && Intrinsics.areEqual(composer, ((Updater) obj).getComposer());
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1151hashCodeimpl(Composer composer) {
        return composer.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1154toStringimpl(Composer composer) {
        return "Updater(composer=" + composer + ')';
    }

    public boolean equals(Object other) {
        return m1150equalsimpl(this.composer, other);
    }

    public int hashCode() {
        return m1151hashCodeimpl(this.composer);
    }

    public String toString() {
        return m1154toStringimpl(this.composer);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ Composer getComposer() {
        return this.composer;
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m1153setimpl(Composer composer, Object obj, Function2 function2) {
        if (composer.getInserting() || !Intrinsics.areEqual(composer.rememberedValue(), obj)) {
            composer.updateRememberedValue(obj);
            composer.apply(obj, function2);
        }
    }

    /* renamed from: init-impl, reason: not valid java name */
    public static final void m1152initimpl(Composer composer, final Function1 function1) {
        if (composer.getInserting()) {
            composer.apply(Unit.INSTANCE, new Function2() { // from class: androidx.compose.runtime.Updater$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit init_impl$lambda$4;
                    init_impl$lambda$4 = Updater.init_impl$lambda$4(Function1.this, obj, (Unit) obj2);
                    return init_impl$lambda$4;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit init_impl$lambda$4(Function1 function1, Object obj, Unit unit) {
        function1.invoke(obj);
        return Unit.INSTANCE;
    }
}
