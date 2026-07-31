package gbcorp.c312.merkmarker.info.ui.composable.navigation;

import com.google.android.gms.common.internal.ImagesContract;
import gbcorp.c312.merkmarker.info.ui.composable.navigation.NavRoute;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: NavRoute.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute;", "", "<init>", "()V", "GTSLYPrepScreen", "GTSLYDetailsScreen", "Splash", "Onboarding", "Home", "Cart", "Checkout", "Orders", "Settings", "ProductDetails", "Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute$Cart;", "Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute$Checkout;", "Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute$GTSLYDetailsScreen;", "Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute$GTSLYPrepScreen;", "Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute$Home;", "Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute$Onboarding;", "Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute$Orders;", "Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute$ProductDetails;", "Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute$Settings;", "Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute$Splash;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class NavRoute {
    public static final int $stable = 0;

    public /* synthetic */ NavRoute(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: NavRoute.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¨\u0006\u0006"}, d2 = {"Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute$GTSLYPrepScreen;", "Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute;", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @Serializable
    public static final class GTSLYPrepScreen extends NavRoute {
        public static final int $stable = 0;
        public static final GTSLYPrepScreen INSTANCE = new GTSLYPrepScreen();
        private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.NavRoute$GTSLYPrepScreen$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KSerializer _init_$_anonymous_;
                _init_$_anonymous_ = NavRoute.GTSLYPrepScreen._init_$_anonymous_();
                return _init_$_anonymous_;
            }
        });

        private GTSLYPrepScreen() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new ObjectSerializer("gbcorp.c312.merkmarker.info.ui.composable.navigation.NavRoute.GTSLYPrepScreen", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public final KSerializer<GTSLYPrepScreen> serializer() {
            return get$cachedSerializer();
        }
    }

    private NavRoute() {
    }

    /* compiled from: NavRoute.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004J%\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0001¢\u0006\u0002\b\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001f"}, d2 = {"Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute$GTSLYDetailsScreen;", "Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute;", ImagesContract.URL, "", "<init>", "(Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_release", "$serializer", "Companion", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @Serializable
    public static final /* data */ class GTSLYDetailsScreen extends NavRoute {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String url;

        public static /* synthetic */ GTSLYDetailsScreen copy$default(GTSLYDetailsScreen gTSLYDetailsScreen, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gTSLYDetailsScreen.url;
            }
            return gTSLYDetailsScreen.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final GTSLYDetailsScreen copy(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new GTSLYDetailsScreen(url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GTSLYDetailsScreen) && Intrinsics.areEqual(this.url, ((GTSLYDetailsScreen) other).url);
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return "GTSLYDetailsScreen(url=" + this.url + ")";
        }

        /* compiled from: NavRoute.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute$GTSLYDetailsScreen$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute$GTSLYDetailsScreen;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<GTSLYDetailsScreen> serializer() {
                return NavRoute$GTSLYDetailsScreen$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ GTSLYDetailsScreen(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, NavRoute$GTSLYDetailsScreen$$serializer.INSTANCE.getDescriptor());
            }
            this.url = str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GTSLYDetailsScreen(String url) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public final String getUrl() {
            return this.url;
        }
    }

    /* compiled from: NavRoute.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¨\u0006\u0006"}, d2 = {"Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute$Splash;", "Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute;", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @Serializable
    public static final class Splash extends NavRoute {
        public static final int $stable = 0;
        public static final Splash INSTANCE = new Splash();
        private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.NavRoute$Splash$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KSerializer _init_$_anonymous_;
                _init_$_anonymous_ = NavRoute.Splash._init_$_anonymous_();
                return _init_$_anonymous_;
            }
        });

        private Splash() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new ObjectSerializer("gbcorp.c312.merkmarker.info.ui.composable.navigation.NavRoute.Splash", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public final KSerializer<Splash> serializer() {
            return get$cachedSerializer();
        }
    }

    /* compiled from: NavRoute.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¨\u0006\u0006"}, d2 = {"Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute$Onboarding;", "Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute;", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @Serializable
    public static final class Onboarding extends NavRoute {
        public static final int $stable = 0;
        public static final Onboarding INSTANCE = new Onboarding();
        private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.NavRoute$Onboarding$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KSerializer _init_$_anonymous_;
                _init_$_anonymous_ = NavRoute.Onboarding._init_$_anonymous_();
                return _init_$_anonymous_;
            }
        });

        private Onboarding() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new ObjectSerializer("gbcorp.c312.merkmarker.info.ui.composable.navigation.NavRoute.Onboarding", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public final KSerializer<Onboarding> serializer() {
            return get$cachedSerializer();
        }
    }

    /* compiled from: NavRoute.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¨\u0006\u0006"}, d2 = {"Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute$Home;", "Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute;", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @Serializable
    public static final class Home extends NavRoute {
        public static final int $stable = 0;
        public static final Home INSTANCE = new Home();
        private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.NavRoute$Home$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KSerializer _init_$_anonymous_;
                _init_$_anonymous_ = NavRoute.Home._init_$_anonymous_();
                return _init_$_anonymous_;
            }
        });

        private Home() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new ObjectSerializer("gbcorp.c312.merkmarker.info.ui.composable.navigation.NavRoute.Home", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public final KSerializer<Home> serializer() {
            return get$cachedSerializer();
        }
    }

    /* compiled from: NavRoute.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¨\u0006\u0006"}, d2 = {"Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute$Cart;", "Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute;", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @Serializable
    public static final class Cart extends NavRoute {
        public static final int $stable = 0;
        public static final Cart INSTANCE = new Cart();
        private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.NavRoute$Cart$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KSerializer _init_$_anonymous_;
                _init_$_anonymous_ = NavRoute.Cart._init_$_anonymous_();
                return _init_$_anonymous_;
            }
        });

        private Cart() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new ObjectSerializer("gbcorp.c312.merkmarker.info.ui.composable.navigation.NavRoute.Cart", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public final KSerializer<Cart> serializer() {
            return get$cachedSerializer();
        }
    }

    /* compiled from: NavRoute.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¨\u0006\u0006"}, d2 = {"Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute$Checkout;", "Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute;", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @Serializable
    public static final class Checkout extends NavRoute {
        public static final int $stable = 0;
        public static final Checkout INSTANCE = new Checkout();
        private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.NavRoute$Checkout$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KSerializer _init_$_anonymous_;
                _init_$_anonymous_ = NavRoute.Checkout._init_$_anonymous_();
                return _init_$_anonymous_;
            }
        });

        private Checkout() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new ObjectSerializer("gbcorp.c312.merkmarker.info.ui.composable.navigation.NavRoute.Checkout", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public final KSerializer<Checkout> serializer() {
            return get$cachedSerializer();
        }
    }

    /* compiled from: NavRoute.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¨\u0006\u0006"}, d2 = {"Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute$Orders;", "Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute;", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @Serializable
    public static final class Orders extends NavRoute {
        public static final int $stable = 0;
        public static final Orders INSTANCE = new Orders();
        private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.NavRoute$Orders$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KSerializer _init_$_anonymous_;
                _init_$_anonymous_ = NavRoute.Orders._init_$_anonymous_();
                return _init_$_anonymous_;
            }
        });

        private Orders() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new ObjectSerializer("gbcorp.c312.merkmarker.info.ui.composable.navigation.NavRoute.Orders", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public final KSerializer<Orders> serializer() {
            return get$cachedSerializer();
        }
    }

    /* compiled from: NavRoute.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¨\u0006\u0006"}, d2 = {"Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute$Settings;", "Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute;", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @Serializable
    public static final class Settings extends NavRoute {
        public static final int $stable = 0;
        public static final Settings INSTANCE = new Settings();
        private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.NavRoute$Settings$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KSerializer _init_$_anonymous_;
                _init_$_anonymous_ = NavRoute.Settings._init_$_anonymous_();
                return _init_$_anonymous_;
            }
        });

        private Settings() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new ObjectSerializer("gbcorp.c312.merkmarker.info.ui.composable.navigation.NavRoute.Settings", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public final KSerializer<Settings> serializer() {
            return get$cachedSerializer();
        }
    }

    /* compiled from: NavRoute.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\tJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J%\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0001¢\u0006\u0002\b\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001f"}, d2 = {"Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute$ProductDetails;", "Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute;", "id", "", "<init>", "(I)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_release", "$serializer", "Companion", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @Serializable
    public static final /* data */ class ProductDetails extends NavRoute {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int id;

        public static /* synthetic */ ProductDetails copy$default(ProductDetails productDetails, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = productDetails.id;
            }
            return productDetails.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        public final ProductDetails copy(int id) {
            return new ProductDetails(id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ProductDetails) && this.id == ((ProductDetails) other).id;
        }

        public int hashCode() {
            return Integer.hashCode(this.id);
        }

        public String toString() {
            return "ProductDetails(id=" + this.id + ")";
        }

        /* compiled from: NavRoute.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute$ProductDetails$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute$ProductDetails;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ProductDetails> serializer() {
                return NavRoute$ProductDetails$$serializer.INSTANCE;
            }
        }

        public ProductDetails(int i) {
            super(null);
            this.id = i;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ProductDetails(int i, int i2, SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, NavRoute$ProductDetails$$serializer.INSTANCE.getDescriptor());
            }
            this.id = i2;
        }

        public final int getId() {
            return this.id;
        }
    }
}
