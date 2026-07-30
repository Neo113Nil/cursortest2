package kotlin.text;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes.dex */
public final class c implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f6188a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6189b;

    /* renamed from: c, reason: collision with root package name */
    public final Function2 f6190c;

    public c(CharSequence input, int i2, Function2 getNextMatch) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(getNextMatch, "getNextMatch");
        this.f6188a = input;
        this.f6189b = i2;
        this.f6190c = getNextMatch;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new b(this);
    }
}
