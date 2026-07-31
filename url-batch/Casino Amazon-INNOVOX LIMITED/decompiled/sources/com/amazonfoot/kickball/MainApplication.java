package com.amazonfoot.kickball;

import android.app.Application;
import android.content.Context;
import com.facebook.react.PackageList;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactNativeApplicationEntryPoint;
import com.facebook.react.ReactPackage;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.defaults.DefaultReactHost;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MainApplication.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/amazonfoot/kickball/MainApplication;", "Landroid/app/Application;", "Lcom/facebook/react/ReactApplication;", "<init>", "()V", "reactHost", "Lcom/facebook/react/ReactHost;", "getReactHost", "()Lcom/facebook/react/ReactHost;", "reactHost$delegate", "Lkotlin/Lazy;", "onCreate", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MainApplication extends Application implements ReactApplication {

    /* renamed from: reactHost$delegate, reason: from kotlin metadata */
    private final Lazy reactHost = LazyKt.lazy(new Function0() { // from class: com.amazonfoot.kickball.MainApplication$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ReactHost reactHost_delegate$lambda$1;
            reactHost_delegate$lambda$1 = MainApplication.reactHost_delegate$lambda$1(MainApplication.this);
            return reactHost_delegate$lambda$1;
        }
    });

    @Override // com.facebook.react.ReactApplication
    public ReactHost getReactHost() {
        return (ReactHost) this.reactHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactHost reactHost_delegate$lambda$1(MainApplication mainApplication) {
        ReactHost defaultReactHost;
        Context applicationContext = mainApplication.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        ArrayList<ReactPackage> packages = new PackageList(mainApplication).getPackages();
        Intrinsics.checkNotNullExpressionValue(packages, "apply(...)");
        defaultReactHost = DefaultReactHost.getDefaultReactHost(applicationContext, packages, (r19 & 4) != 0 ? "index" : null, (r19 & 8) != 0 ? "index.android.bundle" : null, (r19 & 16) != 0 ? null : null, (r19 & 32) != 0 ? null : null, (r19 & 64) != 0 ? ReactBuildConfig.DEBUG : false, (r19 & 128) != 0 ? CollectionsKt.emptyList() : null, (r19 & 256) != 0 ? new Function1() { // from class: com.facebook.react.defaults.DefaultReactHost$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit defaultReactHost$lambda$0;
                defaultReactHost$lambda$0 = DefaultReactHost.getDefaultReactHost$lambda$0((Exception) obj);
                return defaultReactHost$lambda$0;
            }
        } : null, (r19 & 512) != 0 ? null : null);
        return defaultReactHost;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        ReactNativeApplicationEntryPoint.loadReactNative(this);
    }
}
