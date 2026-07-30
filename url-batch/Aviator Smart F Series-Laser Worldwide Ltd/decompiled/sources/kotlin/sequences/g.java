package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.z;

/* loaded from: classes4.dex */
final class g implements m, e {
    public static final g INSTANCE = new g();

    private g() {
    }

    @Override // kotlin.sequences.e
    public g drop(int i8) {
        return INSTANCE;
    }

    @Override // kotlin.sequences.m
    public Iterator iterator() {
        return z.INSTANCE;
    }

    @Override // kotlin.sequences.e
    public g take(int i8) {
        return INSTANCE;
    }
}
