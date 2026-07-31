package coil3.network.okhttp;

import android.content.Context;
import coil3.network.ConnectivityChecker;
import coil3.network.ConnectivityCheckerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OkHttpNetworkFetcher.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class OkHttpNetworkFetcher$OkHttpNetworkFetcherFactory$9 extends FunctionReferenceImpl implements Function1<Context, ConnectivityChecker> {
    public static final OkHttpNetworkFetcher$OkHttpNetworkFetcherFactory$9 INSTANCE = new OkHttpNetworkFetcher$OkHttpNetworkFetcherFactory$9();

    OkHttpNetworkFetcher$OkHttpNetworkFetcherFactory$9() {
        super(1, ConnectivityCheckerKt.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ConnectivityChecker invoke(Context context) {
        return ConnectivityCheckerKt.ConnectivityChecker(context);
    }
}
