package kotlin.text;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes.dex */
public final class c implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final String f7522a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7523b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7524c;

    /* renamed from: d, reason: collision with root package name */
    public final M2.p f7525d;

    /* JADX WARN: Multi-variable type inference failed */
    public c(String input, int i2, int i4, Function2 getNextMatch) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(getNextMatch, "getNextMatch");
        this.f7522a = input;
        this.f7523b = i2;
        this.f7524c = i4;
        this.f7525d = (M2.p) getNextMatch;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new C0755b(this);
    }
}
