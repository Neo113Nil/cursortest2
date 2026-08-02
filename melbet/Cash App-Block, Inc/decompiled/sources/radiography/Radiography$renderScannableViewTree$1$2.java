package radiography;

import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsResourceLoader;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlinx.coroutines.JobNode;

/* loaded from: classes9.dex */
public final /* synthetic */ class Radiography$renderScannableViewTree$1$2 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Radiography$renderScannableViewTree$1$2(JobNode jobNode) {
        super(1, 0, JobNode.class, jobNode, "invoke", "invoke(Ljava/lang/Throwable;)V");
        this.$r8$classId = 6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Collection searchMethodsInSupertypesWithoutBuiltinMagic;
        String escape;
        SimpleType valueClassPropertyType;
        switch (this.$r8$classId) {
            case 0:
                ((ScannableView) obj).getClass();
                ((ViewFilters$$ExternalSyntheticLambda0) this.receiver).getClass();
                return Boolean.TRUE;
            case 1:
                Name name = (Name) obj;
                name.getClass();
                searchMethodsInSupertypesWithoutBuiltinMagic = ((LazyJavaClassMemberScope) this.receiver).searchMethodsInSupertypesWithoutBuiltinMagic(name);
                return searchMethodsInSupertypesWithoutBuiltinMagic;
            case 2:
                String str = (String) obj;
                str.getClass();
                escape = ((DescriptorRendererImpl) this.receiver).escape(str);
                return escape;
            case 3:
                String str2 = (String) obj;
                str2.getClass();
                return ((BuiltInsResourceLoader) this.receiver).loadResource(str2);
            case 4:
                Name name2 = (Name) obj;
                name2.getClass();
                valueClassPropertyType = ((DeserializedClassDescriptor) this.receiver).getValueClassPropertyType(name2);
                return valueClassPropertyType;
            case 5:
                KotlinTypeMarker kotlinTypeMarker = (KotlinTypeMarker) obj;
                kotlinTypeMarker.getClass();
                return ((KotlinTypePreparator) this.receiver).prepareType(kotlinTypeMarker);
            default:
                ((JobNode) this.receiver).invoke((Throwable) obj);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Radiography$renderScannableViewTree$1$2(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.$r8$classId = i3;
    }
}
