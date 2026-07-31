package org.koin.android.ext.koin;

import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.InputStream;
import java.util.Properties;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.android.logger.AndroidLogger;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.registry.PropertyRegistryExtKt;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.DefinitionBindingKt;
import org.koin.dsl.ModuleDSLKt;

/* compiled from: KoinExt.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"androidLogger", "Lorg/koin/core/KoinApplication;", FirebaseAnalytics.Param.LEVEL, "Lorg/koin/core/logger/Level;", "androidContext", "Landroid/content/Context;", "androidFileProperties", "koinPropertyFile", "", "koin-android_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KoinExtKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Context androidContext$lambda$0$1(Context context, Scope single, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return context;
    }

    public static /* synthetic */ KoinApplication androidLogger$default(KoinApplication koinApplication, Level level, int i, Object obj) {
        if ((i & 1) != 0) {
            level = Level.INFO;
        }
        return androidLogger(koinApplication, level);
    }

    public static final KoinApplication androidLogger(KoinApplication koinApplication, Level level) {
        Intrinsics.checkNotNullParameter(koinApplication, "<this>");
        Intrinsics.checkNotNullParameter(level, "level");
        koinApplication.getKoin().setupLogger(new AndroidLogger(level));
        return koinApplication;
    }

    public static final KoinApplication androidContext(KoinApplication koinApplication, final Context androidContext) {
        Intrinsics.checkNotNullParameter(koinApplication, "<this>");
        Intrinsics.checkNotNullParameter(androidContext, "androidContext");
        Logger logger = koinApplication.getKoin().getLogger();
        if (logger.getLevel().compareTo(Level.INFO) <= 0) {
            koinApplication.getKoin().getLogger().info("[init] declare Android Context");
        }
        Koin.loadModules$default(koinApplication.getKoin(), CollectionsKt.listOf(ModuleDSLKt.module$default(false, new Function1() { // from class: org.koin.android.ext.koin.KoinExtKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit androidContext$lambda$0;
                androidContext$lambda$0 = KoinExtKt.androidContext$lambda$0(androidContext, (Module) obj);
                return androidContext$lambda$0;
            }
        }, 1, null)), false, false, 6, null);
        return koinApplication;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit androidContext$lambda$0(final Context context, Module module) {
        Intrinsics.checkNotNullParameter(module, "$this$module");
        if (context instanceof Application) {
            Function2 function2 = new Function2() { // from class: org.koin.android.ext.koin.KoinExtKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Application androidContext$lambda$0$0;
                    androidContext$lambda$0$0 = KoinExtKt.androidContext$lambda$0$0(context, (Scope) obj, (ParametersHolder) obj2);
                    return androidContext$lambda$0$0;
                }
            };
            Qualifier qualifier = null;
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(Application.class), qualifier, function2, Kind.Singleton, CollectionsKt.emptyList(), null, 64, null));
            SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
            module.indexPrimaryType(singleInstanceFactory2);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory2), Reflection.getOrCreateKotlinClass(Context.class));
        } else {
            Function2 function22 = new Function2() { // from class: org.koin.android.ext.koin.KoinExtKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Context androidContext$lambda$0$1;
                    androidContext$lambda$0$1 = KoinExtKt.androidContext$lambda$0$1(context, (Scope) obj, (ParametersHolder) obj2);
                    return androidContext$lambda$0$1;
                }
            };
            Qualifier qualifier2 = null;
            SingleInstanceFactory<?> singleInstanceFactory3 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(Context.class), qualifier2, function22, Kind.Singleton, CollectionsKt.emptyList(), null, 64, null));
            SingleInstanceFactory<?> singleInstanceFactory4 = singleInstanceFactory3;
            module.indexPrimaryType(singleInstanceFactory4);
            if (module.get_createdAtStart()) {
                module.prepareForCreationAtStart(singleInstanceFactory3);
            }
            new KoinDefinition(module, singleInstanceFactory4);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Application androidContext$lambda$0$0(Context context, Scope single, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return (Application) context;
    }

    public static /* synthetic */ KoinApplication androidFileProperties$default(KoinApplication koinApplication, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "koin.properties";
        }
        return androidFileProperties(koinApplication, str);
    }

    public static final KoinApplication androidFileProperties(KoinApplication koinApplication, String koinPropertyFile) {
        String[] list;
        Intrinsics.checkNotNullParameter(koinApplication, "<this>");
        Intrinsics.checkNotNullParameter(koinPropertyFile, "koinPropertyFile");
        Properties properties = new Properties();
        Context context = (Context) koinApplication.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Context.class), null, null);
        try {
            AssetManager assets = context.getAssets();
            if ((assets == null || (list = assets.list("")) == null) ? false : ArraysKt.contains(list, koinPropertyFile)) {
                try {
                    InputStream open = context.getAssets().open(koinPropertyFile);
                    try {
                        properties.load(open);
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(open, null);
                        PropertyRegistryExtKt.saveProperties(koinApplication.getKoin().getPropertyRegistry(), properties);
                        Unit unit2 = Unit.INSTANCE;
                        if (koinApplication.getKoin().getLogger().getLevel().compareTo(Level.INFO) <= 0) {
                            koinApplication.getKoin().getLogger().info("[Android-Properties] loaded " + unit2 + " properties from assets/" + koinPropertyFile);
                            return koinApplication;
                        }
                    } finally {
                    }
                } catch (Exception e) {
                    koinApplication.getKoin().getLogger().error("[Android-Properties] error for binding properties : " + e);
                }
            } else {
                if (koinApplication.getKoin().getLogger().getLevel().compareTo(Level.INFO) <= 0) {
                    koinApplication.getKoin().getLogger().info("[Android-Properties] no assets/" + koinPropertyFile + " file to load");
                    return koinApplication;
                }
            }
        } catch (Exception e2) {
            koinApplication.getKoin().getLogger().error("[Android-Properties] error while loading properties from assets/" + koinPropertyFile + " : " + e2);
        }
        return koinApplication;
    }
}
