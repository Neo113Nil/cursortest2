package androidx.compose.ui.text;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JvmAnnotatedString.jvm.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "", "invoke", "(Ljava/util/List;)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
final class JvmAnnotatedString_jvmKt$transform$1 extends Lambda implements Function1 {
    final /* synthetic */ Map<Integer, Integer> $offsetMap;
    final /* synthetic */ Ref$ObjectRef<String> $resultStr;
    final /* synthetic */ AnnotatedString $this_transform;
    final /* synthetic */ Function3 $transform;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    JvmAnnotatedString_jvmKt$transform$1(Ref$ObjectRef<String> ref$ObjectRef, Function3 function3, AnnotatedString annotatedString, Map<Integer, Integer> map) {
        super(1);
        this.$resultStr = ref$ObjectRef;
        this.$transform = function3;
        this.$this_transform = annotatedString;
        this.$offsetMap = map;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.String] */
    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Integer invoke(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "<name for destructuring parameter 0>");
        int intValue = list.get(0).intValue();
        int intValue2 = list.get(1).intValue();
        this.$resultStr.element = this.$resultStr.element + ((String) this.$transform.invoke(this.$this_transform.getText(), Integer.valueOf(intValue), Integer.valueOf(intValue2)));
        return this.$offsetMap.put(Integer.valueOf(intValue2), Integer.valueOf(this.$resultStr.element.length()));
    }
}
