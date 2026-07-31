package Q1;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final a f9169b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final b f9170c = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final Object f9171a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a() {
            return b.f9170c;
        }

        public final b b(Object value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new b(value, null);
        }

        private a() {
        }
    }

    public /* synthetic */ b(Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj);
    }

    public final Object b() {
        Object obj = this.f9171a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f9171a != null;
    }

    public final Object d() {
        return this.f9171a;
    }

    private b(Object obj) {
        this.f9171a = obj;
    }
}
