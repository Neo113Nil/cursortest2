package kotlin.reflect;

import W1.m;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m2.k;
import m2.l;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class KTypeProjection {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f41192c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final KTypeProjection f41193d = new KTypeProjection(null, null);

    /* renamed from: a, reason: collision with root package name */
    private final l f41194a;

    /* renamed from: b, reason: collision with root package name */
    private final k f41195b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41196a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.f41361b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.f41362c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.f41363d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f41196a = iArr;
        }
    }

    public KTypeProjection(l lVar, k kVar) {
        String str;
        this.f41194a = lVar;
        this.f41195b = kVar;
        if ((lVar == null) == (kVar == null)) {
            return;
        }
        if (lVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + lVar + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final k a() {
        return this.f41195b;
    }

    public final l b() {
        return this.f41194a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KTypeProjection)) {
            return false;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) obj;
        return this.f41194a == kTypeProjection.f41194a && Intrinsics.areEqual(this.f41195b, kTypeProjection.f41195b);
    }

    public int hashCode() {
        l lVar = this.f41194a;
        int hashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        k kVar = this.f41195b;
        return hashCode + (kVar != null ? kVar.hashCode() : 0);
    }

    public String toString() {
        l lVar = this.f41194a;
        int i4 = lVar == null ? -1 : b.f41196a[lVar.ordinal()];
        if (i4 == -1) {
            return "*";
        }
        if (i4 == 1) {
            return String.valueOf(this.f41195b);
        }
        if (i4 == 2) {
            return "in " + this.f41195b;
        }
        if (i4 != 3) {
            throw new m();
        }
        return "out " + this.f41195b;
    }
}
