package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$22;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: classes9.dex */
public final class JvmBuiltIns extends KotlinBuiltIns {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(JvmBuiltIns.class, "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;", 0)};
    public final NotNullLazyValue customizer$delegate;
    public Function0 settingsComputation;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Kind {
        public static final /* synthetic */ Kind[] $VALUES;
        public static final Kind FALLBACK;
        public static final Kind FROM_CLASS_LOADER;
        public static final Kind FROM_DEPENDENCIES;

        static {
            Kind kind = new Kind("FROM_DEPENDENCIES", 0);
            FROM_DEPENDENCIES = kind;
            Kind kind2 = new Kind("FROM_CLASS_LOADER", 1);
            FROM_CLASS_LOADER = kind2;
            Kind kind3 = new Kind("FALLBACK", 2);
            FALLBACK = kind3;
            $VALUES = new Kind[]{kind, kind2, kind3};
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) $VALUES.clone();
        }
    }

    public static final class Settings {
        public final boolean isAdditionalBuiltInsFeatureSupported;
        public final ModuleDescriptor ownerModuleDescriptor;

        public Settings(ModuleDescriptor moduleDescriptor, boolean z) {
            moduleDescriptor.getClass();
            this.ownerModuleDescriptor = moduleDescriptor;
            this.isAdditionalBuiltInsFeatureSupported = z;
        }

        public final ModuleDescriptor getOwnerModuleDescriptor() {
            return this.ownerModuleDescriptor;
        }

        public final boolean isAdditionalBuiltInsFeatureSupported() {
            return this.isAdditionalBuiltInsFeatureSupported;
        }
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Kind.values().length];
            try {
                iArr[Kind.FROM_DEPENDENCIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Kind.FROM_CLASS_LOADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Kind.FALLBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltIns(StorageManager storageManager, Kind kind) {
        super(storageManager);
        storageManager.getClass();
        kind.getClass();
        this.customizer$delegate = storageManager.createLazyValue(new KClassImpl$Data$$Lambda$22(15, this, storageManager));
        int i = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
        if (i != 1) {
            if (i == 2) {
                createBuiltInsModule(false);
            } else if (i == 3) {
                createBuiltInsModule(true);
            } else {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                throw null;
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    public final AdditionalClassPartsProvider getAdditionalClassPartsProvider() {
        return getCustomizer();
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    public Iterable getClassDescriptorFactories() {
        Iterable classDescriptorFactories = super.getClassDescriptorFactories();
        classDescriptorFactories.getClass();
        StorageManager storageManager = this.storageManager;
        if (storageManager == null) {
            KotlinBuiltIns.$$$reportNull$$$0(6);
            throw null;
        }
        ModuleDescriptorImpl builtInsModule = getBuiltInsModule();
        builtInsModule.getClass();
        return CollectionsKt.plus(classDescriptorFactories, new JvmBuiltInClassDescriptorFactory(storageManager, builtInsModule, null, 4, null));
    }

    public final JvmBuiltInsCustomizer getCustomizer() {
        return (JvmBuiltInsCustomizer) StorageKt.getValue(this.customizer$delegate, this, $$delegatedProperties[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    public final PlatformDependentDeclarationFilter getPlatformDependentDeclarationFilter() {
        return getCustomizer();
    }

    public final void initialize(final ModuleDescriptor moduleDescriptor, final boolean z) {
        moduleDescriptor.getClass();
        setPostponedSettingsComputation(new Function0(moduleDescriptor, z) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$$Lambda$1
            public final ModuleDescriptor arg$0;
            public final boolean arg$1;

            {
                this.arg$0 = moduleDescriptor;
                this.arg$1 = z;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KProperty[] kPropertyArr = JvmBuiltIns.$$delegatedProperties;
                return new JvmBuiltIns.Settings(this.arg$0, this.arg$1);
            }
        });
    }

    public final void setPostponedSettingsComputation(Function0<Settings> function0) {
        function0.getClass();
        this.settingsComputation = function0;
    }
}
