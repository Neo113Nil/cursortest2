package ru.rustore.sdk.pay.internal;

import java.util.ArrayList;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.model.PackageName;
import ru.rustore.sdk.pay.model.SdkTheme;
import ru.rustore.sdk.pay.model.Url;

/* loaded from: classes3.dex */
public final class w5 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final x f45151a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final f8 f45152b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final rj f45153c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final y4 f45154d;

    public w5(@NotNull x appSignatureRepository, @NotNull f8 currentPackageNameRepository, @NotNull rj sdkThemeRepository, @NotNull y4 deviceIdProvider) {
        Intrinsics.checkNotNullParameter(appSignatureRepository, "appSignatureRepository");
        Intrinsics.checkNotNullParameter(currentPackageNameRepository, "currentPackageNameRepository");
        Intrinsics.checkNotNullParameter(sdkThemeRepository, "sdkThemeRepository");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        this.f45151a = appSignatureRepository;
        this.f45152b = currentPackageNameRepository;
        this.f45153c = sdkThemeRepository;
        this.f45154d = deviceIdProvider;
    }

    @NotNull
    public final Url a(@NotNull Url inputUrl) {
        Intrinsics.checkNotNullParameter(inputUrl, "inputUrl");
        ArrayList value = this.f45151a.f45196a.a();
        Intrinsics.checkNotNullParameter(value, "value");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
        int size = value.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = value.get(i4);
            i4++;
            arrayList.add("\"" + ((String) obj) + '\"');
        }
        String str = "signature=" + arrayList;
        StringBuilder sb = new StringBuilder("packageName=");
        String packageName = this.f45152b.f44059a.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        sb.append(new PackageName(packageName).getValue());
        String sb2 = sb.toString();
        String str2 = "deviceId=" + this.f45154d.a();
        SdkTheme sdkTheme = this.f45153c.f44931a.f44852a.get();
        Intrinsics.checkNotNullExpressionValue(sdkTheme, "currentTheme.get()");
        String lowerCase = sdkTheme.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return new Url(inputUrl.getValue() + '?' + str + '&' + sb2 + '&' + str2 + '&' + ("theme=" + lowerCase));
    }
}
