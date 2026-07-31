package l2;

import java.util.NoSuchElementException;
import kotlin.collections.AbstractC3225o;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3254a extends AbstractC3225o {

    /* renamed from: b, reason: collision with root package name */
    private final int f41323b;

    /* renamed from: c, reason: collision with root package name */
    private final int f41324c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f41325d;

    /* renamed from: e, reason: collision with root package name */
    private int f41326e;

    public C3254a(char c4, char c5, int i4) {
        this.f41323b = i4;
        this.f41324c = c5;
        boolean z4 = false;
        if (i4 <= 0 ? Intrinsics.compare((int) c4, (int) c5) >= 0 : Intrinsics.compare((int) c4, (int) c5) <= 0) {
            z4 = true;
        }
        this.f41325d = z4;
        this.f41326e = z4 ? c4 : c5;
    }

    @Override // kotlin.collections.AbstractC3225o
    public char a() {
        int i4 = this.f41326e;
        if (i4 != this.f41324c) {
            this.f41326e = this.f41323b + i4;
        } else {
            if (!this.f41325d) {
                throw new NoSuchElementException();
            }
            this.f41325d = false;
        }
        return (char) i4;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41325d;
    }
}
