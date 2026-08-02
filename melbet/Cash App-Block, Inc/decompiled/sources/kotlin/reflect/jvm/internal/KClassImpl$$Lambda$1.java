package kotlin.reflect.jvm.internal;

import java.util.HashSet;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;

/* loaded from: classes9.dex */
public final class KClassImpl$$Lambda$1 implements Function2 {
    public static final KClassImpl$$Lambda$1 INSTANCE = new KClassImpl$$Lambda$1(0);
    public static final KClassImpl$$Lambda$1 INSTANCE$1 = new KClassImpl$$Lambda$1(1);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ KClassImpl$$Lambda$1(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        MemberDeserializer memberDeserializer = (MemberDeserializer) obj;
        ProtoBuf.Property property = (ProtoBuf.Property) obj2;
        switch (this.$r8$classId) {
            case 0:
                HashSet hashSet = KClassImpl.SPECIAL_JVM_ANNOTATION_NAMES;
                memberDeserializer.getClass();
                property.getClass();
                break;
            default:
                int i = KPackageImpl.$r8$clinit;
                memberDeserializer.getClass();
                property.getClass();
                break;
        }
        return memberDeserializer.loadProperty(property, true);
    }
}
