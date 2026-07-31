package ru.rustore.sdk.pay.internal;

import android.content.Context;
import java.util.List;
import java.util.Map;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.IntentInteractor;
import ru.rustore.sdk.pay.ProductInteractor;
import ru.rustore.sdk.pay.PurchaseInteractor;
import ru.rustore.sdk.pay.RuStorePayClient;
import ru.rustore.sdk.pay.UserInteractor;
import ru.rustore.sdk.pay.model.ConsoleApplicationId;
import ru.rustore.sdk.user.profile.UserProfileProvider;

/* loaded from: classes3.dex */
public final class yj extends zj {

    @Nullable
    public static volatile yj I3;

    /* renamed from: B3, reason: collision with root package name */
    @NotNull
    public final W1.h f45287B3;

    /* renamed from: C3, reason: collision with root package name */
    @NotNull
    public final W1.h f45288C3;

    /* renamed from: D3, reason: collision with root package name */
    @NotNull
    public final W1.h f45289D3;

    /* renamed from: E3, reason: collision with root package name */
    @NotNull
    public final W1.h f45290E3;

    /* renamed from: F3, reason: collision with root package name */
    @NotNull
    public final W1.h f45291F3;

    @NotNull
    public final W1.h G3;

    @NotNull
    public final W1.h H3;

    public static final class a {
    }

    public static final class b extends kotlin.jvm.internal.s implements Function0<q0> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f45292a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new q0();
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements Function0<p6> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f45293a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new p6();
        }
    }

    public static final class d extends kotlin.jvm.internal.s implements Function0<ji> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f45294a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context) {
            super(0);
            this.f45294a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new ji(this.f45294a, new UserProfileProvider(this.f45294a));
        }
    }

    public static final class e extends kotlin.jvm.internal.s implements Function0<RuStorePayClient> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new RuStorePayClient((PurchaseInteractor) yj.this.f45492d.getValue(), (ProductInteractor) yj.this.f45497e.getValue(), (IntentInteractor) yj.this.f45502f.getValue(), (UserInteractor) yj.this.f45507g.getValue());
        }
    }

    public static final class f extends kotlin.jvm.internal.s implements Function0<bk> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ru.rustore.sdk.pay.internal.h hVar = (ru.rustore.sdk.pay.internal.h) yj.this.f45557q.getValue();
            return new bk((fi) yj.this.f45572t.getValue(), (di) yj.this.f45577u.getValue(), (ji) yj.this.H3.getValue(), hVar, (n2) yj.this.f45562r.getValue(), (s2) yj.this.f45567s.getValue());
        }
    }

    public static final class g extends kotlin.jvm.internal.s implements Function0<tk> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new tk((zn) yj.this.f45558q0.getValue(), (bk) yj.this.f45290E3.getValue());
        }
    }

    public static final class h extends kotlin.jvm.internal.s implements Function0<X509TrustManager> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return bo.a((List) yj.this.f45552p.getValue());
        }
    }

    public yj(Context context, ConsoleApplicationId consoleApplicationId, Map map) {
        super(context, consoleApplicationId, map);
        this.f45287B3 = W1.i.b(new e());
        this.f45288C3 = W1.i.b(new h());
        this.f45289D3 = W1.i.b(c.f45293a);
        this.f45290E3 = W1.i.b(new f());
        this.f45291F3 = W1.i.b(b.f45292a);
        this.G3 = W1.i.b(new g());
        this.H3 = W1.i.b(new d(context));
    }
}
