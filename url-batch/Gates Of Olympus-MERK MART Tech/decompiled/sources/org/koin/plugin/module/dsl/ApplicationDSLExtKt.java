package org.koin.plugin.module.dsl;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.koin.core.KoinApplication;
import org.koin.core.module.Module;
import org.koin.dsl.KoinApplicationKt;
import org.koin.dsl.KoinConfiguration;
import org.koin.dsl.KoinConfigurationKt;
import org.koin.mp.KoinPlatformTools;

/* compiled from: ApplicationDSLExt.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032!\b\u0002\u0010\u0004\u001a\u001b\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\b¢\u0006\u0002\b\u0007\u001a7\u0010\t\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2!\b\u0002\u0010\u0004\u001a\u001b\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\b¢\u0006\u0002\b\u0007\u001a3\u0010\r\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032!\b\u0002\u0010\u0004\u001a\u001b\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\b¢\u0006\u0002\b\u0007\u001a7\u0010\u000e\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2!\b\u0002\u0010\u0004\u001a\u001b\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\b¢\u0006\u0002\b\u0007\u001a3\u0010\u000f\u001a\u00020\u0010\"\b\b\u0000\u0010\u0002*\u00020\u00032!\b\u0002\u0010\u0004\u001a\u001b\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\b¢\u0006\u0002\b\u0007\u001a7\u0010\u0011\u001a\u00020\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2!\b\u0002\u0010\u0004\u001a\u001b\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\b¢\u0006\u0002\b\u0007\u001a7\u0010\u0012\u001a\u00020\u0006\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00012!\b\u0002\u0010\u0004\u001a\u001b\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\b¢\u0006\u0002\b\u0007\u001a;\u0010\u0013\u001a\u00020\u0006*\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2!\b\u0002\u0010\u0004\u001a\u001b\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\b¢\u0006\u0002\b\u0007\u001a\u0014\u0010\n\u001a\u00020\u0006\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0001\u001a+\u0010\n\u001a\u00020\u0006*\u00020\u00012\u001a\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00150\u0014\"\u0006\u0012\u0002\b\u00030\u0015¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"startKoin", "Lorg/koin/core/KoinApplication;", ExifInterface.GPS_DIRECTION_TRUE, "", "appDeclaration", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "Lorg/koin/dsl/KoinAppDeclaration;", "startKoinWith", "modules", "", "Lorg/koin/core/module/Module;", "koinApplication", "koinApplicationWith", "koinConfiguration", "Lorg/koin/dsl/KoinConfiguration;", "koinConfigurationWith", "withConfiguration", "withConfigurationWith", "", "Lkotlin/reflect/KClass;", "(Lorg/koin/core/KoinApplication;[Lkotlin/reflect/KClass;)V", "koin-core"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ApplicationDSLExtKt {
    public static /* synthetic */ KoinApplication startKoin$default(Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return startKoin(function1);
    }

    public static final <T> KoinApplication startKoin(Function1<? super KoinApplication, Unit> function1) {
        CreateDSLKt.USE_KOIN_COMPILER_PLUGIN("startKoin<T>()");
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ KoinApplication startKoinWith$default(List list, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return startKoinWith(list, function1);
    }

    public static final KoinApplication startKoinWith(final List<Module> modules, final Function1<? super KoinApplication, Unit> function1) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        return KoinPlatformTools.INSTANCE.defaultContext().startKoin(new Function1() { // from class: org.koin.plugin.module.dsl.ApplicationDSLExtKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit startKoinWith$lambda$0;
                startKoinWith$lambda$0 = ApplicationDSLExtKt.startKoinWith$lambda$0(modules, function1, (KoinApplication) obj);
                return startKoinWith$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startKoinWith$lambda$0(List list, Function1 function1, KoinApplication startKoin) {
        Intrinsics.checkNotNullParameter(startKoin, "$this$startKoin");
        startKoin.modules((List<Module>) list);
        if (function1 != null) {
            function1.invoke(startKoin);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ KoinApplication koinApplication$default(Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return koinApplication(function1);
    }

    public static final <T> KoinApplication koinApplication(Function1<? super KoinApplication, Unit> function1) {
        CreateDSLKt.USE_KOIN_COMPILER_PLUGIN("koinApplication<T>()");
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ KoinApplication koinApplicationWith$default(List list, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return koinApplicationWith(list, function1);
    }

    public static final KoinApplication koinApplicationWith(final List<Module> modules, final Function1<? super KoinApplication, Unit> function1) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        return KoinApplicationKt.koinApplication((Function1<? super KoinApplication, Unit>) new Function1() { // from class: org.koin.plugin.module.dsl.ApplicationDSLExtKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit koinApplicationWith$lambda$0;
                koinApplicationWith$lambda$0 = ApplicationDSLExtKt.koinApplicationWith$lambda$0(modules, function1, (KoinApplication) obj);
                return koinApplicationWith$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit koinApplicationWith$lambda$0(List list, Function1 function1, KoinApplication koinApplication) {
        Intrinsics.checkNotNullParameter(koinApplication, "$this$koinApplication");
        koinApplication.modules((List<Module>) list);
        if (function1 != null) {
            function1.invoke(koinApplication);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ KoinConfiguration koinConfiguration$default(Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return koinConfiguration(function1);
    }

    public static final <T> KoinConfiguration koinConfiguration(Function1<? super KoinApplication, Unit> function1) {
        CreateDSLKt.USE_KOIN_COMPILER_PLUGIN("koinConfiguration<T>()");
        throw new KotlinNothingValueException();
    }

    public static final KoinConfiguration koinConfigurationWith(final List<Module> modules, final Function1<? super KoinApplication, Unit> function1) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        return KoinConfigurationKt.koinConfiguration(new Function1() { // from class: org.koin.plugin.module.dsl.ApplicationDSLExtKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit koinConfigurationWith$lambda$0;
                koinConfigurationWith$lambda$0 = ApplicationDSLExtKt.koinConfigurationWith$lambda$0(Function1.this, modules, (KoinApplication) obj);
                return koinConfigurationWith$lambda$0;
            }
        });
    }

    public static /* synthetic */ KoinConfiguration koinConfigurationWith$default(List list, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return koinConfigurationWith(list, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit koinConfigurationWith$lambda$0(Function1 function1, List list, KoinApplication koinConfiguration) {
        Intrinsics.checkNotNullParameter(koinConfiguration, "$this$koinConfiguration");
        KoinConfigurationKt.includes(koinConfiguration, (Function1<? super KoinApplication, Unit>[]) new Function1[]{function1});
        koinConfiguration.modules((List<Module>) list);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void withConfiguration$default(KoinApplication koinApplication, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        withConfiguration(koinApplication, function1);
    }

    public static final <T> void withConfiguration(KoinApplication koinApplication, Function1<? super KoinApplication, Unit> function1) {
        Intrinsics.checkNotNullParameter(koinApplication, "<this>");
        CreateDSLKt.USE_KOIN_COMPILER_PLUGIN("KoinApplication.useKoinConfiguration<T>()");
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void withConfigurationWith$default(KoinApplication koinApplication, List list, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        withConfigurationWith(koinApplication, list, function1);
    }

    public static final void withConfigurationWith(KoinApplication koinApplication, List<Module> modules, Function1<? super KoinApplication, Unit> function1) {
        Intrinsics.checkNotNullParameter(koinApplication, "<this>");
        Intrinsics.checkNotNullParameter(modules, "modules");
        KoinConfigurationKt.includes(koinApplication, (Function1<? super KoinApplication, Unit>[]) new Function1[]{function1});
        koinApplication.modules(modules);
    }

    public static final <T> void modules(KoinApplication koinApplication) {
        Intrinsics.checkNotNullParameter(koinApplication, "<this>");
        CreateDSLKt.USE_KOIN_COMPILER_PLUGIN("KoinApplication.modules<T>()");
        throw new KotlinNothingValueException();
    }

    public static final void modules(KoinApplication koinApplication, KClass<?>... modules) {
        Intrinsics.checkNotNullParameter(koinApplication, "<this>");
        Intrinsics.checkNotNullParameter(modules, "modules");
        CreateDSLKt.USE_KOIN_COMPILER_PLUGIN("KoinApplication.modules(KClass...)");
        throw new KotlinNothingValueException();
    }
}
