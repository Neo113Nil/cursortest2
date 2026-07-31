package t3;

import com.ironsource.cc;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final C0279a f46267c = new C0279a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f46268a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f46269b = new ConcurrentHashMap();

    /* renamed from: t3.a$a, reason: collision with other inner class name */
    public static final class C0279a {
        public /* synthetic */ C0279a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(c tracer) {
            Intrinsics.checkNotNullParameter(tracer, "tracer");
            return tracer.m();
        }

        private C0279a() {
        }
    }

    public a(int i4) {
        this.f46268a = i4;
    }

    public final List a() {
        List createListBuilder = CollectionsKt.createListBuilder();
        synchronized (this.f46269b) {
            try {
                for (Map.Entry entry : this.f46269b.entrySet()) {
                    createListBuilder.add(((String) entry.getKey()) + cc.f15727T + ((String) entry.getValue()));
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return CollectionsKt.build(createListBuilder);
    }
}
