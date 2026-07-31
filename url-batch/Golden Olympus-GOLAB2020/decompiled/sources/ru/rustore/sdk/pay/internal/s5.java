package ru.rustore.sdk.pay.internal;

import android.content.Context;
import com.ironsource.b9;
import java.util.Map;
import java.util.UUID;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.BuildConfig;
import ru.rustore.sdk.pay.internal.a;
import ru.rustore.sdk.pay.internal.ak;

/* loaded from: classes3.dex */
public final class s5 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final mj f44957a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final na f44958b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final jn f44959c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final i6 f44960d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final t5 f44961e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final a0 f44962f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public final Context f44963g;

    public s5(@NotNull mj sdkInfoRepository, @NotNull na paymentOperationIdRepository, @NotNull jn userRepository, @NotNull i6 getSandboxModeUseCase, @NotNull t5 getActivePurchaseUseCase, @NotNull a0 appVersionNameRepository, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(sdkInfoRepository, "sdkInfoRepository");
        Intrinsics.checkNotNullParameter(paymentOperationIdRepository, "paymentOperationIdRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(getSandboxModeUseCase, "getSandboxModeUseCase");
        Intrinsics.checkNotNullParameter(getActivePurchaseUseCase, "getActivePurchaseUseCase");
        Intrinsics.checkNotNullParameter(appVersionNameRepository, "appVersionNameRepository");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44957a = sdkInfoRepository;
        this.f44958b = paymentOperationIdRepository;
        this.f44959c = userRepository;
        this.f44960d = getSandboxModeUseCase;
        this.f44961e = getActivePurchaseUseCase;
        this.f44962f = appVersionNameRepository;
        this.f44963g = context;
    }

    @NotNull
    public final Map<String, String> a() {
        String value;
        String str;
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.putAll(MapsKt.mapOf(TuplesKt.to("sdkName", BuildConfig.SDK_NAME), TuplesKt.to("sdkType", this.f44957a.a().f44347a), TuplesKt.to("sdkVersion", BuildConfig.SDK_VERSION)));
        ma maVar = this.f44958b.f44684a;
        synchronized (maVar) {
            value = maVar.f44639a;
            if (value == null) {
                value = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(value, "randomUUID().toString()");
                Intrinsics.checkNotNullParameter(value, "value");
                maVar.f44639a = value;
            }
        }
        createMapBuilder.put("payment_operation_id", value);
        createMapBuilder.put("payment_sheet_type", "1");
        createMapBuilder.put("without_rustore", String.valueOf(!(this.f44959c.f44400a.f43878d.f44190a.get() instanceof ak.b)));
        wi a4 = this.f44960d.a();
        Intrinsics.checkNotNullParameter(a4, "<this>");
        boolean z4 = a4.f45190a;
        if (z4) {
            str = "1";
        } else {
            if (z4) {
                throw new W1.m();
            }
            str = "0";
        }
        createMapBuilder.put("sandbox", str);
        a aVar = this.f44961e.f45034a.f43892a.f43838a;
        createMapBuilder.putAll(aVar instanceof a.C0255a ? MapsKt.mapOf(TuplesKt.to("app_id", ((a.C0255a) aVar).f43787a.getValue())) : MapsKt.mapOf(TuplesKt.to(b9.h.f15462V, this.f44963g.getPackageName())));
        String value2 = (String) this.f44962f.f43790a.f45305b.getValue();
        if (value2 != null) {
            Intrinsics.checkNotNullParameter(value2, "value");
        } else {
            value2 = null;
        }
        if (value2 != null) {
            createMapBuilder.put(b9.i.f15541W, value2);
        }
        return MapsKt.build(createMapBuilder);
    }
}
