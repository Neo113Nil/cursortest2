package c6;

import R5.u;
import f.C0388g;
import java.io.BufferedReader;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes.dex */
public final class n implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4279a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4280b;

    public /* synthetic */ n(int i2, Object obj) {
        this.f4279a = i2;
        this.f4280b = obj;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.f4279a) {
            case 0:
                return new m(this);
            case 1:
                Object[] array = (Object[]) this.f4280b;
                Intrinsics.checkNotNullParameter(array, "array");
                return new u(array);
            case 2:
                return ((Iterable) this.f4280b).iterator();
            case 3:
                return new kotlin.text.d((CharSequence) this.f4280b);
            case 4:
                return new l6.g(this);
            default:
                return (Iterator) this.f4280b;
        }
    }

    public n(BufferedReader reader) {
        this.f4279a = 0;
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.f4280b = reader;
    }

    public n(c2.i getNextValue) {
        this.f4279a = 4;
        C0388g getInitialValue = C0388g.f4747d;
        Intrinsics.checkNotNullParameter(getInitialValue, "getInitialValue");
        Intrinsics.checkNotNullParameter(getNextValue, "getNextValue");
        this.f4280b = getNextValue;
    }
}
