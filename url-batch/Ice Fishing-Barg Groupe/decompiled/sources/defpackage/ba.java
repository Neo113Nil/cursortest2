package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ba extends b21 {
    public final /* synthetic */ int lS5Rgt96tfkO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ba(SerialDescriptor serialDescriptor, int i) {
        super(serialDescriptor);
        this.lS5Rgt96tfkO = i;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String lS5Rgt96tfkO() {
        switch (this.lS5Rgt96tfkO) {
            case 0:
                return "kotlin.Array";
            case 1:
                return "kotlin.collections.ArrayList";
            case 2:
                return "kotlin.collections.HashSet";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
