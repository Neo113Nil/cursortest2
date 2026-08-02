package w3;

import java.util.Iterator;

/* renamed from: w3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1506c implements v3.j {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f15942a;

    /* renamed from: b, reason: collision with root package name */
    public final o3.p f15943b;

    public C1506c(CharSequence input, o3.p pVar) {
        kotlin.jvm.internal.i.e(input, "input");
        this.f15942a = input;
        this.f15943b = pVar;
    }

    @Override // v3.j
    public final Iterator iterator() {
        return new C1505b(this);
    }
}
