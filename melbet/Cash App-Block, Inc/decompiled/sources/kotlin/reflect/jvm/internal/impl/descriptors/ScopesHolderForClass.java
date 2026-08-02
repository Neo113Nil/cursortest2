package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$22;
import kotlin.reflect.jvm.internal.KotlinKPropertyN$$Lambda$0;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes9.dex */
public final class ScopesHolderForClass<T extends MemberScope> {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(ScopesHolderForClass.class, "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0)};
    public static final Companion Companion = new Companion(null);
    public final ClassDescriptor classDescriptor;
    public final KotlinTypeRefiner kotlinTypeRefinerForOwnerModule;
    public final Function1 scopeFactory;
    public final NotNullLazyValue scopeForOwnerModule$delegate;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final <T extends MemberScope> ScopesHolderForClass<T> create(ClassDescriptor classDescriptor, StorageManager storageManager, KotlinTypeRefiner kotlinTypeRefiner, Function1<? super KotlinTypeRefiner, ? extends T> function1) {
            classDescriptor.getClass();
            storageManager.getClass();
            kotlinTypeRefiner.getClass();
            function1.getClass();
            return new ScopesHolderForClass<>(classDescriptor, storageManager, function1, kotlinTypeRefiner, null);
        }
    }

    public ScopesHolderForClass(ClassDescriptor classDescriptor, StorageManager storageManager, Function1 function1, KotlinTypeRefiner kotlinTypeRefiner, DefaultConstructorMarker defaultConstructorMarker) {
        this.classDescriptor = classDescriptor;
        this.scopeFactory = function1;
        this.kotlinTypeRefinerForOwnerModule = kotlinTypeRefiner;
        this.scopeForOwnerModule$delegate = storageManager.createLazyValue(new KotlinKPropertyN$$Lambda$0(this, 6));
    }

    public final T getScope(KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        ClassDescriptor classDescriptor = this.classDescriptor;
        boolean isRefinementNeededForModule = kotlinTypeRefiner.isRefinementNeededForModule(DescriptorUtilsKt.getModule(classDescriptor));
        KProperty[] kPropertyArr = $$delegatedProperties;
        NotNullLazyValue notNullLazyValue = this.scopeForOwnerModule$delegate;
        if (!isRefinementNeededForModule) {
            return (T) StorageKt.getValue(notNullLazyValue, this, kPropertyArr[0]);
        }
        TypeConstructor typeConstructor = classDescriptor.getTypeConstructor();
        typeConstructor.getClass();
        return !kotlinTypeRefiner.isRefinementNeededForTypeConstructor(typeConstructor) ? (T) StorageKt.getValue(notNullLazyValue, this, kPropertyArr[0]) : (T) kotlinTypeRefiner.getOrPutScopeForClass(classDescriptor, new KClassImpl$Data$$Lambda$22(18, this, kotlinTypeRefiner));
    }
}
