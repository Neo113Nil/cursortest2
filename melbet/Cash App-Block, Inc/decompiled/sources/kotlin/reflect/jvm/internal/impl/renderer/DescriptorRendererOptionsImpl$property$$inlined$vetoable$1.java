package kotlin.reflect.jvm.internal.impl.renderer;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* loaded from: classes9.dex */
public final class DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 extends ObservableProperty {
    public final /* synthetic */ DescriptorRendererOptionsImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(Object obj, DescriptorRendererOptionsImpl descriptorRendererOptionsImpl) {
        super(obj);
        this.this$0 = descriptorRendererOptionsImpl;
    }

    @Override // kotlin.properties.ObservableProperty
    public final void beforeChange(KProperty kProperty) {
        kProperty.getClass();
        if (this.this$0.isLocked()) {
            a$$ExternalSyntheticBUOutline0.m$1("Cannot modify readonly DescriptorRendererOptions");
        }
    }
}
