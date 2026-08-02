package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes9.dex */
public abstract class DelegatedDescriptorVisibility extends DescriptorVisibility {
    public final Visibility delegate;

    public DelegatedDescriptorVisibility(Visibility visibility) {
        visibility.getClass();
        this.delegate = visibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    public Visibility getDelegate() {
        return this.delegate;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    public String getInternalDisplayName() {
        return getDelegate().getInternalDisplayName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    public DescriptorVisibility normalize() {
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.toDescriptorVisibility(getDelegate().normalize());
        descriptorVisibility.getClass();
        return descriptorVisibility;
    }
}
