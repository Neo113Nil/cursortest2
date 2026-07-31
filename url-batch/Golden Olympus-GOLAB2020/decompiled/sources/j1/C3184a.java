package j1;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j1.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3184a extends Exception {

    /* renamed from: c, reason: collision with root package name */
    public static final C0220a f40847c = new C0220a(null);

    /* renamed from: b, reason: collision with root package name */
    private final String[] f40848b;

    /* renamed from: j1.a$a, reason: collision with other inner class name */
    public static final class C0220a {
        public /* synthetic */ C0220a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0220a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3184a(String error) {
        this(new String[]{error});
        Intrinsics.checkNotNullParameter(error, "error");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(C3184a.class, obj.getClass())) {
            return false;
        }
        return Arrays.equals(this.f40848b, ((C3184a) obj).f40848b);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f40848b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3184a(String[] errors) {
        super(r0);
        Intrinsics.checkNotNullParameter(errors, "errors");
        String arrays = Arrays.toString(errors);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        this.f40848b = errors;
    }
}
