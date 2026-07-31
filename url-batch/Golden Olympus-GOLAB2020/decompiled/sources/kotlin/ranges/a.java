package kotlin.ranges;

import c2.AbstractC1380c;
import i2.InterfaceC2471a;
import kotlin.collections.AbstractC3225o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l2.C3254a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class a implements Iterable, InterfaceC2471a {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final C0231a f41174e = new C0231a(null);

    /* renamed from: b, reason: collision with root package name */
    private final char f41175b;

    /* renamed from: c, reason: collision with root package name */
    private final char f41176c;

    /* renamed from: d, reason: collision with root package name */
    private final int f41177d;

    /* renamed from: kotlin.ranges.a$a, reason: collision with other inner class name */
    public static final class C0231a {
        public /* synthetic */ C0231a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0231a() {
        }
    }

    public a(char c4, char c5, int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i4 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f41175b = c4;
        this.f41176c = (char) AbstractC1380c.c(c4, c5, i4);
        this.f41177d = i4;
    }

    public final char b() {
        return this.f41175b;
    }

    public final char d() {
        return this.f41176c;
    }

    @Override // java.lang.Iterable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC3225o iterator() {
        return new C3254a(this.f41175b, this.f41176c, this.f41177d);
    }
}
