package J2;

import java.io.BufferedReader;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes.dex */
public final class o implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3415a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3416b;

    public o(Iterator it) {
        this.f3416b = it;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.f3415a) {
            case 0:
                return new n(this);
            default:
                return (Iterator) this.f3416b;
        }
    }

    public o(BufferedReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.f3416b = reader;
    }
}
