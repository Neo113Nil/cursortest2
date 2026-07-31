package com.ironsource;

import android.os.Handler;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class zt {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f20584a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final d f20585b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final b f20586c;

    @Metadata
    public static final class a {

        @Metadata
        /* renamed from: com.ironsource.zt$a$a, reason: collision with other inner class name */
        static final class C0169a extends kotlin.jvm.internal.s implements Function0<iu> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TestSuiteActivity f20587a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Handler f20588b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0169a(TestSuiteActivity testSuiteActivity, Handler handler) {
                super(0);
                this.f20587a = testSuiteActivity;
                this.f20588b = handler;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final iu invoke() {
                return new iu(this.f20587a, this.f20588b);
            }
        }

        @Metadata
        static final class b extends kotlin.jvm.internal.s implements Function0<pu> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TestSuiteActivity f20589a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Handler f20590b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(TestSuiteActivity testSuiteActivity, Handler handler) {
                super(0);
                this.f20589a = testSuiteActivity;
                this.f20590b = handler;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final pu invoke() {
                return new pu(this.f20589a, this.f20590b);
            }
        }

        private static final iu a(W1.h hVar) {
            return (iu) hVar.getValue();
        }

        private static final pu b(W1.h hVar) {
            return (pu) hVar.getValue();
        }

        @NotNull
        public final zt a(@NotNull List<? extends IronSource.AD_UNIT> maduEnabledAdUnits, @NotNull TestSuiteActivity activity, @NotNull Handler handler) {
            Intrinsics.checkNotNullParameter(maduEnabledAdUnits, "maduEnabledAdUnits");
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(handler, "handler");
            W1.h b4 = W1.i.b(new C0169a(activity, handler));
            W1.h b5 = W1.i.b(new b(activity, handler));
            return new zt(maduEnabledAdUnits.contains(IronSource.AD_UNIT.INTERSTITIAL) ? a(b4) : b(b5), maduEnabledAdUnits.contains(IronSource.AD_UNIT.REWARDED_VIDEO) ? a(b4) : b(b5), maduEnabledAdUnits.contains(IronSource.AD_UNIT.BANNER) ? a(b4) : b(b5), null);
        }
    }

    @Metadata
    public interface b {
        void a(double d4);

        void a(@NotNull fu fuVar, @NotNull String str, int i4, int i5);

        void b();
    }

    @Metadata
    public interface c {
        void a(@NotNull fu fuVar);

        void c();

        boolean e();
    }

    @Metadata
    public interface d {
        boolean a();

        void b(@NotNull fu fuVar);

        void d();
    }

    private zt(c cVar, d dVar, b bVar) {
        this.f20584a = cVar;
        this.f20585b = dVar;
        this.f20586c = bVar;
    }

    @NotNull
    public final b a() {
        return this.f20586c;
    }

    @NotNull
    public final c b() {
        return this.f20584a;
    }

    @NotNull
    public final d c() {
        return this.f20585b;
    }

    public /* synthetic */ zt(c cVar, d dVar, b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, dVar, bVar);
    }
}
