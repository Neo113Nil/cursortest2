package ru.rustore.sdk.pay.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.core.exception.RuStoreNotInstalledException;
import ru.rustore.sdk.core.exception.RuStoreOutdatedException;
import ru.rustore.sdk.core.util.CollectionExtKt;
import ru.rustore.sdk.core.util.RuStoreUtils;
import ru.rustore.sdk.pay.model.PackageName;
import ru.rustore.sdk.reactive.single.SingleEmitter;

/* loaded from: classes3.dex */
public final class b1 extends kotlin.jvm.internal.s implements Function1<SingleEmitter<String>, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f43842a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f43843b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(Context context, boolean z4) {
        super(1);
        this.f43842a = context;
        this.f43843b = z4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SingleEmitter emitter = (SingleEmitter) obj;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        try {
            if (RuStoreUtils.INSTANCE.isRuStoreInstalled(this.f43842a)) {
                Intent intent = new Intent("ru.vk.store.provider.RuStorePaymentInfoProvider");
                List<ResolveInfo> queryIntentServices = this.f43842a.getPackageManager().queryIntentServices(intent, 0);
                Intrinsics.checkNotNullExpressionValue(queryIntentServices, "context.packageManager.q…IntentServices(intent, 0)");
                ComponentName findRuStoreServiceComponentName = CollectionExtKt.findRuStoreServiceComponentName(queryIntentServices);
                if (findRuStoreServiceComponentName == null) {
                    emitter.error(new RuStoreOutdatedException());
                } else {
                    intent.setComponent(findRuStoreServiceComponentName);
                    G g4 = new G();
                    String packageName = this.f43842a.getPackageName();
                    Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
                    g4.f41132b = new e1(new PackageName(packageName), this.f43843b, new y0(emitter), new z0(emitter));
                    emitter.onFinish(new a1(this.f43842a, g4));
                    if (!this.f43842a.bindService(intent, (ServiceConnection) g4.f41132b, 1)) {
                        emitter.error(new RuStoreOutdatedException());
                    }
                }
            } else {
                emitter.error(new RuStoreNotInstalledException());
            }
        } catch (Throwable th) {
            emitter.error(th);
        }
        return Unit.f41027a;
    }
}
