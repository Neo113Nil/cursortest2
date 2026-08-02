package kotlin.reflect.jvm.internal.impl.km.internal.extensions;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.reflect.jvm.internal.impl.km.KmClass;
import kotlin.reflect.jvm.internal.impl.km.KmConstructor;
import kotlin.reflect.jvm.internal.impl.km.KmEnumEntry;
import kotlin.reflect.jvm.internal.impl.km.KmFunction;
import kotlin.reflect.jvm.internal.impl.km.KmPackage;
import kotlin.reflect.jvm.internal.impl.km.KmProperty;
import kotlin.reflect.jvm.internal.impl.km.KmType;
import kotlin.reflect.jvm.internal.impl.km.KmTypeAlias;
import kotlin.reflect.jvm.internal.impl.km.KmTypeParameter;
import kotlin.reflect.jvm.internal.impl.km.KmValueParameter;
import kotlin.reflect.jvm.internal.impl.km.internal.ReadContext;
import kotlin.reflect.jvm.internal.impl.km.internal.WriteContext;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* loaded from: classes9.dex */
public interface MetadataExtensions {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final Lazy INSTANCES$delegate = LazyKt.lazy(MetadataExtensions$Companion$$Lambda$0.INSTANCE);

        public final List<MetadataExtensions> getINSTANCES$kotlin_metadata() {
            return (List) INSTANCES$delegate.getValue();
        }
    }

    KmClassExtension createClassExtension();

    KmConstructorExtension createConstructorExtension();

    KmEnumEntryExtension createEnumEntryExtension();

    KmFunctionExtension createFunctionExtension();

    KmPackageExtension createPackageExtension();

    KmPropertyExtension createPropertyExtension();

    KmTypeAliasExtension createTypeAliasExtension();

    KmTypeExtension createTypeExtension();

    KmTypeParameterExtension createTypeParameterExtension();

    KmValueParameterExtension createValueParameterExtension();

    void readClassExtensions(KmClass kmClass, ProtoBuf.Class r2, ReadContext readContext);

    void readConstructorExtensions(KmConstructor kmConstructor, ProtoBuf.Constructor constructor, ReadContext readContext);

    void readEnumEntryExtensions(KmEnumEntry kmEnumEntry, ProtoBuf.EnumEntry enumEntry, ReadContext readContext);

    void readFunctionExtensions(KmFunction kmFunction, ProtoBuf.Function function, ReadContext readContext);

    void readPackageExtensions(KmPackage kmPackage, ProtoBuf.Package r2, ReadContext readContext);

    void readPropertyExtensions(KmProperty kmProperty, ProtoBuf.Property property, ReadContext readContext);

    void readTypeAliasExtensions(KmTypeAlias kmTypeAlias, ProtoBuf.TypeAlias typeAlias, ReadContext readContext);

    void readTypeExtensions(KmType kmType, ProtoBuf.Type type2, ReadContext readContext);

    void readTypeParameterExtensions(KmTypeParameter kmTypeParameter, ProtoBuf.TypeParameter typeParameter, ReadContext readContext);

    void readValueParameterExtensions(KmValueParameter kmValueParameter, ProtoBuf.ValueParameter valueParameter, ReadContext readContext);

    void writePropertyExtensions(KmProperty kmProperty, ProtoBuf.Property.Builder builder, WriteContext writeContext);

    void writeTypeExtensions(KmType kmType, ProtoBuf.Type.Builder builder, WriteContext writeContext);

    void writeTypeParameterExtensions(KmTypeParameter kmTypeParameter, ProtoBuf.TypeParameter.Builder builder, WriteContext writeContext);

    void writeValueParameterExtensions(KmValueParameter kmValueParameter, ProtoBuf.ValueParameter.Builder builder, WriteContext writeContext);
}
