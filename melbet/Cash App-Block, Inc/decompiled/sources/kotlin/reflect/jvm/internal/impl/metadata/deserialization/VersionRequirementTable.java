package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* loaded from: classes9.dex */
public final class VersionRequirementTable {
    public static final Companion Companion = new Companion(null);
    public static final VersionRequirementTable EMPTY = new VersionRequirementTable(EmptyList.INSTANCE);
    public final List infos;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final VersionRequirementTable create(ProtoBuf.VersionRequirementTable versionRequirementTable) {
            versionRequirementTable.getClass();
            if (versionRequirementTable.getRequirementCount() == 0) {
                return getEMPTY();
            }
            List<ProtoBuf.VersionRequirement> requirementList = versionRequirementTable.getRequirementList();
            requirementList.getClass();
            return new VersionRequirementTable(requirementList, null);
        }

        public final VersionRequirementTable getEMPTY() {
            return VersionRequirementTable.EMPTY;
        }
    }

    public VersionRequirementTable(List list) {
        this.infos = list;
    }

    public final ProtoBuf.VersionRequirement get(int i) {
        return (ProtoBuf.VersionRequirement) CollectionsKt.getOrNull(i, this.infos);
    }

    public /* synthetic */ VersionRequirementTable(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }
}
