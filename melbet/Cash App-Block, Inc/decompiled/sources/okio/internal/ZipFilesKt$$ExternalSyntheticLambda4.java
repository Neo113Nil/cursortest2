package okio.internal;

import androidx.compose.runtime.CompositionContext;
import java.lang.reflect.Method;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.LinkedTags;
import okhttp3.internal.Tags;
import okio.Path;
import okio.internal.ResourceFileSystem;
import radiography.internal.CompositionContextsKt;
import radiography.internal.CompositionContextsKt$REFLECTION_CONSTANTS$2$1;
import xyz.block.genie.state.GenieStateValue;

/* loaded from: classes10.dex */
public final /* synthetic */ class ZipFilesKt$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ZipFilesKt$$ExternalSyntheticLambda4(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Iterable iterable;
        Method method;
        Object invoke;
        CompositionContextsKt$REFLECTION_CONSTANTS$2$1 compositionContextsKt$REFLECTION_CONSTANTS$2$1;
        switch (this.$r8$classId) {
            case 0:
                ((ZipEntry) obj).getClass();
                return Boolean.TRUE;
            case 1:
                LinkedTags linkedTags = (LinkedTags) obj;
                linkedTags.getClass();
                Tags tags = linkedTags.next;
                if (tags instanceof LinkedTags) {
                    return (LinkedTags) tags;
                }
                return null;
            case 2:
                LinkedTags linkedTags2 = (LinkedTags) obj;
                linkedTags2.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append(linkedTags2.key);
                sb.append('=');
                sb.append(linkedTags2.value);
                return sb.toString();
            case 3:
                ZipEntry zipEntry = (ZipEntry) obj;
                zipEntry.getClass();
                Path path = ResourceFileSystem.ROOT;
                return Boolean.valueOf(ResourceFileSystem.Companion.access$keepPath(zipEntry.canonicalPath));
            case 4:
                CompositionContext compositionContext = (CompositionContext) obj;
                compositionContext.getClass();
                CompositionContextsKt$REFLECTION_CONSTANTS$2$1 compositionContextsKt$REFLECTION_CONSTANTS$2$12 = (CompositionContextsKt$REFLECTION_CONSTANTS$2$1) CompositionContextsKt.REFLECTION_CONSTANTS$delegate.getValue();
                if (compositionContextsKt$REFLECTION_CONSTANTS$2$12 != null) {
                    if (compositionContextsKt$REFLECTION_CONSTANTS$2$12.CompositionContextImplClass.isInstance(compositionContext)) {
                        Object obj2 = compositionContextsKt$REFLECTION_CONSTANTS$2$12.CompositionContextImplComposersField.get(compositionContext);
                        Iterable iterable2 = obj2 instanceof Iterable ? (Iterable) obj2 : null;
                        if (iterable2 != null) {
                            iterable = iterable2;
                        }
                    } else {
                        iterable = EmptyList.INSTANCE;
                    }
                    return CollectionsKt.asSequence(iterable);
                }
                iterable = EmptyList.INSTANCE;
                return CollectionsKt.asSequence(iterable);
            case 5:
                if (obj == null || (method = obj.getClass().getMethod("getWrapped", null)) == null || (invoke = method.invoke(obj, null)) == null || (compositionContextsKt$REFLECTION_CONSTANTS$2$1 = (CompositionContextsKt$REFLECTION_CONSTANTS$2$1) CompositionContextsKt.REFLECTION_CONSTANTS$delegate.getValue()) == null) {
                    return null;
                }
                Object obj3 = compositionContextsKt$REFLECTION_CONSTANTS$2$1.CompositionContextHolderRefField.get(invoke);
                if (obj3 instanceof CompositionContext) {
                    return (CompositionContext) obj3;
                }
                return null;
            case 6:
                String str = (String) obj;
                str.getClass();
                return new GenieStateValue.StringValue(str);
            case 7:
                GenieStateValue genieStateValue = (GenieStateValue) obj;
                GenieStateValue.BoolValue boolValue = genieStateValue instanceof GenieStateValue.BoolValue ? (GenieStateValue.BoolValue) genieStateValue : null;
                return Boolean.valueOf(boolValue != null ? boolValue.value : false);
            case 8:
                return new GenieStateValue.BoolValue(((Boolean) obj).booleanValue());
            default:
                return new GenieStateValue.FloatValue(((Double) obj).doubleValue());
        }
    }
}
