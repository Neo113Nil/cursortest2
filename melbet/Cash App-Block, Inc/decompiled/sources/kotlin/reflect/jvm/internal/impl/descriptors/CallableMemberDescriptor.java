package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;

/* loaded from: classes9.dex */
public interface CallableMemberDescriptor extends CallableDescriptor, MemberDescriptor {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Kind {
        public static final /* synthetic */ Kind[] $VALUES;
        public static final Kind DECLARATION;
        public static final Kind DELEGATION;
        public static final Kind FAKE_OVERRIDE;
        public static final Kind SYNTHESIZED;

        static {
            Kind kind = new Kind("DECLARATION", 0);
            DECLARATION = kind;
            Kind kind2 = new Kind("FAKE_OVERRIDE", 1);
            FAKE_OVERRIDE = kind2;
            Kind kind3 = new Kind("DELEGATION", 2);
            DELEGATION = kind3;
            Kind kind4 = new Kind("SYNTHESIZED", 3);
            SYNTHESIZED = kind4;
            $VALUES = new Kind[]{kind, kind2, kind3, kind4};
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) $VALUES.clone();
        }

        public boolean isReal() {
            return this != FAKE_OVERRIDE;
        }
    }

    CallableMemberDescriptor copy(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, Kind kind, boolean z);

    Kind getKind();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    CallableMemberDescriptor getOriginal();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    Collection<? extends CallableMemberDescriptor> getOverriddenDescriptors();

    void setOverriddenDescriptors(Collection<? extends CallableMemberDescriptor> collection);
}
