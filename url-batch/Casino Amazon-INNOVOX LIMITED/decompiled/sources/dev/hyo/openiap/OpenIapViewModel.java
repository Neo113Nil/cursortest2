package dev.hyo.openiap;

import android.app.Application;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelKt;
import com.onesignal.core.internal.config.ConfigModelStoreKt;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import dev.hyo.openiap.store.IapStatus;
import dev.hyo.openiap.store.OpenIapStore;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: OpenIapViewModel.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0006\u0010\u001a\u001a\u00020\u0017J\u001e\u0010\u001b\u001a\u00020\u00172\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\r2\b\b\u0002\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u0017J\u001e\u0010!\u001a\u00020\u00172\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\r2\b\b\u0002\u0010\u001e\u001a\u00020\u001fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000bR\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000b¨\u0006\""}, d2 = {"Ldev/hyo/openiap/OpenIapViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "store", "Ldev/hyo/openiap/store/OpenIapStore;", "isConnected", "Lkotlinx/coroutines/flow/StateFlow;", "", "()Lkotlinx/coroutines/flow/StateFlow;", "products", "", "Ldev/hyo/openiap/Product;", "getProducts", "availablePurchases", "Ldev/hyo/openiap/Purchase;", "getAvailablePurchases", NotificationCompat.CATEGORY_STATUS, "Ldev/hyo/openiap/store/IapStatus;", "getStatus", "initConnection", "", ConfigModelStoreKt.CONFIG_NAME_SPACE, "Ldev/hyo/openiap/InitConnectionConfig;", "endConnection", "fetchProducts", "skus", "", WebViewManager.EVENT_TYPE_KEY, "Ldev/hyo/openiap/ProductQueryType;", "restorePurchases", "requestPurchase", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OpenIapViewModel extends AndroidViewModel {
    public static final int $stable = 8;
    private final StateFlow<List<Purchase>> availablePurchases;
    private final StateFlow<Boolean> isConnected;
    private final StateFlow<List<Product>> products;
    private final StateFlow<IapStatus> status;
    private final OpenIapStore store;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenIapViewModel(Application app) {
        super(app);
        Intrinsics.checkNotNullParameter(app, "app");
        Context applicationContext = app.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        OpenIapStore openIapStore = new OpenIapStore(applicationContext);
        this.store = openIapStore;
        this.isConnected = openIapStore.isConnected();
        this.products = openIapStore.getProducts();
        this.availablePurchases = openIapStore.getAvailablePurchases();
        this.status = openIapStore.getStatus();
    }

    public final StateFlow<Boolean> isConnected() {
        return this.isConnected;
    }

    public final StateFlow<List<Product>> getProducts() {
        return this.products;
    }

    public final StateFlow<List<Purchase>> getAvailablePurchases() {
        return this.availablePurchases;
    }

    public final StateFlow<IapStatus> getStatus() {
        return this.status;
    }

    public static /* synthetic */ void initConnection$default(OpenIapViewModel openIapViewModel, InitConnectionConfig initConnectionConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            initConnectionConfig = null;
        }
        openIapViewModel.initConnection(initConnectionConfig);
    }

    public final void initConnection(InitConnectionConfig config) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OpenIapViewModel$initConnection$1(this, config, null), 3, null);
    }

    public final void endConnection() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OpenIapViewModel$endConnection$1(this, null), 3, null);
    }

    public static /* synthetic */ void fetchProducts$default(OpenIapViewModel openIapViewModel, List list, ProductQueryType productQueryType, int i, Object obj) {
        if ((i & 2) != 0) {
            productQueryType = ProductQueryType.All;
        }
        openIapViewModel.fetchProducts(list, productQueryType);
    }

    public final void fetchProducts(List<String> skus, ProductQueryType type) {
        Intrinsics.checkNotNullParameter(skus, "skus");
        Intrinsics.checkNotNullParameter(type, "type");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OpenIapViewModel$fetchProducts$1(skus, type, this, null), 3, null);
    }

    public final void restorePurchases() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OpenIapViewModel$restorePurchases$1(this, null), 3, null);
    }

    public static /* synthetic */ void requestPurchase$default(OpenIapViewModel openIapViewModel, List list, ProductQueryType productQueryType, int i, Object obj) {
        if ((i & 2) != 0) {
            productQueryType = ProductQueryType.InApp;
        }
        openIapViewModel.requestPurchase(list, productQueryType);
    }

    public final void requestPurchase(List<String> skus, ProductQueryType type) {
        Intrinsics.checkNotNullParameter(skus, "skus");
        Intrinsics.checkNotNullParameter(type, "type");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OpenIapViewModel$requestPurchase$1(type, skus, this, null), 3, null);
    }
}
