package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes9.dex */
public abstract class ProtoContainer {
    public final NameResolver nameResolver;
    public final SourceElement source;
    public final TypeTable typeTable;

    public static final class Class extends ProtoContainer {
        public final ClassId classId;
        public final ProtoBuf.Class classProto;
        public final boolean isInner;
        public final ProtoBuf.Class.Kind kind;
        public final Class outerClass;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Class(ProtoBuf.Class r2, NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement, Class r6) {
            super(nameResolver, typeTable, sourceElement, null);
            r2.getClass();
            nameResolver.getClass();
            typeTable.getClass();
            this.classProto = r2;
            this.outerClass = r6;
            this.classId = NameResolverUtilKt.getClassId(nameResolver, r2.getFqName());
            ProtoBuf.Class.Kind kind = Flags.CLASS_KIND.get(r2.getFlags());
            this.kind = kind == null ? ProtoBuf.Class.Kind.CLASS : kind;
            Boolean bool = Flags.IS_INNER.get(r2.getFlags());
            bool.getClass();
            this.isInner = bool.booleanValue();
            Boolean bool2 = Flags.IS_DATA.get(r2.getFlags());
            bool2.getClass();
            bool2.getClass();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer
        public FqName debugFqName() {
            return this.classId.asSingleFqName();
        }

        public final ClassId getClassId() {
            return this.classId;
        }

        public final ProtoBuf.Class getClassProto() {
            return this.classProto;
        }

        public final ProtoBuf.Class.Kind getKind() {
            return this.kind;
        }

        public final Class getOuterClass() {
            return this.outerClass;
        }

        public final boolean isInner() {
            return this.isInner;
        }
    }

    public static final class Package extends ProtoContainer {
        public final FqName fqName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Package(FqName fqName, NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement) {
            super(nameResolver, typeTable, sourceElement, null);
            fqName.getClass();
            nameResolver.getClass();
            typeTable.getClass();
            this.fqName = fqName;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer
        public FqName debugFqName() {
            return this.fqName;
        }
    }

    public ProtoContainer(NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement, DefaultConstructorMarker defaultConstructorMarker) {
        this.nameResolver = nameResolver;
        this.typeTable = typeTable;
        this.source = sourceElement;
    }

    public abstract FqName debugFqName();

    public final NameResolver getNameResolver() {
        return this.nameResolver;
    }

    public final SourceElement getSource() {
        return this.source;
    }

    public final TypeTable getTypeTable() {
        return this.typeTable;
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + debugFqName();
    }
}
