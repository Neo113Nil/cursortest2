package T2;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes.dex */
public final class s implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4054a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4055b;

    /* renamed from: c, reason: collision with root package name */
    public final M2.p f4056c;

    /* JADX WARN: Multi-variable type inference failed */
    public s(Sequence sequence, Function1 transformer, int i2) {
        this.f4054a = i2;
        switch (i2) {
            case 1:
                Intrinsics.checkNotNullParameter(sequence, "sequence");
                Intrinsics.checkNotNullParameter(transformer, "transformer");
                this.f4055b = sequence;
                this.f4056c = (M2.p) transformer;
                break;
            default:
                Intrinsics.checkNotNullParameter(sequence, "sequence");
                Intrinsics.checkNotNullParameter(transformer, "predicate");
                this.f4055b = sequence;
                this.f4056c = (M2.p) transformer;
                break;
        }
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.f4054a) {
            case 0:
                return new f(this);
            case 1:
                return new t(this);
            default:
                return new M.c(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(Function0 getInitialValue, Function1 getNextValue) {
        this.f4054a = 2;
        Intrinsics.checkNotNullParameter(getInitialValue, "getInitialValue");
        Intrinsics.checkNotNullParameter(getNextValue, "getNextValue");
        this.f4056c = (M2.p) getInitialValue;
        this.f4055b = getNextValue;
    }
}
