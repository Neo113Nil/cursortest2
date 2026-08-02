package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: classes9.dex */
public class DeserializedAnnotations implements Annotations {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(DeserializedAnnotations.class, "annotations", "getAnnotations()Ljava/util/List;", 0)};
    public final NotNullLazyValue annotations$delegate;

    public DeserializedAnnotations(StorageManager storageManager, Function0<? extends List<? extends AnnotationDescriptor>> function0) {
        storageManager.getClass();
        function0.getClass();
        this.annotations$delegate = storageManager.createLazyValue(function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* renamed from: findAnnotation */
    public /* bridge */ AnnotationDescriptor mo4143findAnnotation(FqName fqName) {
        return Annotations.DefaultImpls.findAnnotation(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public /* bridge */ boolean hasAnnotation(FqName fqName) {
        return Annotations.DefaultImpls.hasAnnotation(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return ((List) StorageKt.getValue(this.annotations$delegate, this, $$delegatedProperties[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<AnnotationDescriptor> iterator() {
        return ((List) StorageKt.getValue(this.annotations$delegate, this, $$delegatedProperties[0])).iterator();
    }
}
