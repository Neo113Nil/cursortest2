package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import com.squareup.cash.arcade.components.avatar.AvatarKt$Avatar$5$1$1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$2;

/* loaded from: classes9.dex */
public final class PredefinedEnhancementInfoKt {
    public static final JavaTypeQualifiers NOT_NULLABLE;
    public static final JavaTypeQualifiers NOT_PLATFORM;
    public static final JavaTypeQualifiers NULLABLE = new JavaTypeQualifiers(NullabilityQualifier.NULLABLE, null, false, false, false, 24, null);
    public static final LinkedHashMap PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE;

    static {
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        NOT_PLATFORM = new JavaTypeQualifiers(nullabilityQualifier, null, false, false, false, 24, null);
        NOT_NULLABLE = new JavaTypeQualifiers(nullabilityQualifier, null, true, false, false, 24, null);
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        final String javaLang = signatureBuildingComponents.javaLang("Object");
        String javaFunction = signatureBuildingComponents.javaFunction("Predicate");
        final String javaFunction2 = signatureBuildingComponents.javaFunction("Function");
        String javaFunction3 = signatureBuildingComponents.javaFunction("Consumer");
        final String javaFunction4 = signatureBuildingComponents.javaFunction("BiFunction");
        String javaFunction5 = signatureBuildingComponents.javaFunction("BiConsumer");
        final String javaFunction6 = signatureBuildingComponents.javaFunction("UnaryOperator");
        final String javaUtil = signatureBuildingComponents.javaUtil("stream/Stream");
        final String javaUtil2 = signatureBuildingComponents.javaUtil("Optional");
        SignatureEnhancementBuilder signatureEnhancementBuilder = new SignatureEnhancementBuilder();
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaUtil("Iterator")), "forEachRemaining", null, new AvatarKt$Avatar$5$1$1(javaFunction3, 3), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaLang("Iterable")), "spliterator", null, new TasksKt$awaitImpl$2$2(signatureBuildingComponents, 13), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaUtil("Collection"));
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder, "removeIf", null, new AvatarKt$Avatar$5$1$1(javaFunction, 20), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder, "stream", null, new AvatarKt$Avatar$5$1$1(javaUtil, 29), 2, null);
        final int i = 0;
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder, "parallelStream", null, new Function1(javaUtil, i) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$4
            public final /* synthetic */ int $r8$classId;
            public final String arg$0;

            {
                this.$r8$classId = i;
                this.arg$0 = javaUtil;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = this.$r8$classId;
                String str = this.arg$0;
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                switch (i2) {
                    case 0:
                        JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.returns(str, javaTypeQualifiers2, javaTypeQualifiers2);
                        functionEnhancementBuilder.mustUseReturnValue();
                        break;
                    case 1:
                        JavaTypeQualifiers javaTypeQualifiers3 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers4 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers4);
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers4);
                        break;
                    case 2:
                        JavaTypeQualifiers javaTypeQualifiers5 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers6 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers6);
                        functionEnhancementBuilder.returns(str, javaTypeQualifiers6);
                        break;
                    case 3:
                        JavaTypeQualifiers javaTypeQualifiers7 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers8 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers8);
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers8);
                        functionEnhancementBuilder.returns(str, javaTypeQualifiers8);
                        break;
                    case 4:
                        JavaTypeQualifiers javaTypeQualifiers9 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    case 5:
                        JavaTypeQualifiers javaTypeQualifiers10 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers11 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers11, javaTypeQualifiers11);
                        break;
                    case 6:
                        JavaTypeQualifiers javaTypeQualifiers12 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.parameter(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    case 7:
                        JavaTypeQualifiers javaTypeQualifiers13 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.parameter(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    case 8:
                        JavaTypeQualifiers javaTypeQualifiers14 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    default:
                        JavaTypeQualifiers javaTypeQualifiers15 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                }
                return Unit.INSTANCE;
            }
        }, 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder2 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaUtil("List"));
        final int i2 = 5;
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder2, "replaceAll", null, new Function1(javaFunction6, i2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$4
            public final /* synthetic */ int $r8$classId;
            public final String arg$0;

            {
                this.$r8$classId = i2;
                this.arg$0 = javaFunction6;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = this.$r8$classId;
                String str = this.arg$0;
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                switch (i22) {
                    case 0:
                        JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.returns(str, javaTypeQualifiers2, javaTypeQualifiers2);
                        functionEnhancementBuilder.mustUseReturnValue();
                        break;
                    case 1:
                        JavaTypeQualifiers javaTypeQualifiers3 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers4 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers4);
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers4);
                        break;
                    case 2:
                        JavaTypeQualifiers javaTypeQualifiers5 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers6 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers6);
                        functionEnhancementBuilder.returns(str, javaTypeQualifiers6);
                        break;
                    case 3:
                        JavaTypeQualifiers javaTypeQualifiers7 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers8 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers8);
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers8);
                        functionEnhancementBuilder.returns(str, javaTypeQualifiers8);
                        break;
                    case 4:
                        JavaTypeQualifiers javaTypeQualifiers9 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    case 5:
                        JavaTypeQualifiers javaTypeQualifiers10 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers11 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers11, javaTypeQualifiers11);
                        break;
                    case 6:
                        JavaTypeQualifiers javaTypeQualifiers12 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.parameter(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    case 7:
                        JavaTypeQualifiers javaTypeQualifiers13 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.parameter(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    case 8:
                        JavaTypeQualifiers javaTypeQualifiers14 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    default:
                        JavaTypeQualifiers javaTypeQualifiers15 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                }
                return Unit.INSTANCE;
            }
        }, 2, null);
        final int i3 = 6;
        classEnhancementBuilder2.function("addFirst", "2.1", new Function1(javaLang, i3) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$4
            public final /* synthetic */ int $r8$classId;
            public final String arg$0;

            {
                this.$r8$classId = i3;
                this.arg$0 = javaLang;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = this.$r8$classId;
                String str = this.arg$0;
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                switch (i22) {
                    case 0:
                        JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.returns(str, javaTypeQualifiers2, javaTypeQualifiers2);
                        functionEnhancementBuilder.mustUseReturnValue();
                        break;
                    case 1:
                        JavaTypeQualifiers javaTypeQualifiers3 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers4 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers4);
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers4);
                        break;
                    case 2:
                        JavaTypeQualifiers javaTypeQualifiers5 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers6 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers6);
                        functionEnhancementBuilder.returns(str, javaTypeQualifiers6);
                        break;
                    case 3:
                        JavaTypeQualifiers javaTypeQualifiers7 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers8 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers8);
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers8);
                        functionEnhancementBuilder.returns(str, javaTypeQualifiers8);
                        break;
                    case 4:
                        JavaTypeQualifiers javaTypeQualifiers9 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    case 5:
                        JavaTypeQualifiers javaTypeQualifiers10 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers11 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers11, javaTypeQualifiers11);
                        break;
                    case 6:
                        JavaTypeQualifiers javaTypeQualifiers12 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.parameter(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    case 7:
                        JavaTypeQualifiers javaTypeQualifiers13 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.parameter(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    case 8:
                        JavaTypeQualifiers javaTypeQualifiers14 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    default:
                        JavaTypeQualifiers javaTypeQualifiers15 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        final int i4 = 7;
        classEnhancementBuilder2.function("addLast", "2.1", new Function1(javaLang, i4) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$4
            public final /* synthetic */ int $r8$classId;
            public final String arg$0;

            {
                this.$r8$classId = i4;
                this.arg$0 = javaLang;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = this.$r8$classId;
                String str = this.arg$0;
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                switch (i22) {
                    case 0:
                        JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.returns(str, javaTypeQualifiers2, javaTypeQualifiers2);
                        functionEnhancementBuilder.mustUseReturnValue();
                        break;
                    case 1:
                        JavaTypeQualifiers javaTypeQualifiers3 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers4 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers4);
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers4);
                        break;
                    case 2:
                        JavaTypeQualifiers javaTypeQualifiers5 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers6 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers6);
                        functionEnhancementBuilder.returns(str, javaTypeQualifiers6);
                        break;
                    case 3:
                        JavaTypeQualifiers javaTypeQualifiers7 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers8 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers8);
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers8);
                        functionEnhancementBuilder.returns(str, javaTypeQualifiers8);
                        break;
                    case 4:
                        JavaTypeQualifiers javaTypeQualifiers9 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    case 5:
                        JavaTypeQualifiers javaTypeQualifiers10 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers11 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers11, javaTypeQualifiers11);
                        break;
                    case 6:
                        JavaTypeQualifiers javaTypeQualifiers12 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.parameter(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    case 7:
                        JavaTypeQualifiers javaTypeQualifiers13 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.parameter(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    case 8:
                        JavaTypeQualifiers javaTypeQualifiers14 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    default:
                        JavaTypeQualifiers javaTypeQualifiers15 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        final int i5 = 8;
        classEnhancementBuilder2.function("removeFirst", "2.1", new Function1(javaLang, i5) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$4
            public final /* synthetic */ int $r8$classId;
            public final String arg$0;

            {
                this.$r8$classId = i5;
                this.arg$0 = javaLang;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = this.$r8$classId;
                String str = this.arg$0;
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                switch (i22) {
                    case 0:
                        JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.returns(str, javaTypeQualifiers2, javaTypeQualifiers2);
                        functionEnhancementBuilder.mustUseReturnValue();
                        break;
                    case 1:
                        JavaTypeQualifiers javaTypeQualifiers3 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers4 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers4);
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers4);
                        break;
                    case 2:
                        JavaTypeQualifiers javaTypeQualifiers5 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers6 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers6);
                        functionEnhancementBuilder.returns(str, javaTypeQualifiers6);
                        break;
                    case 3:
                        JavaTypeQualifiers javaTypeQualifiers7 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers8 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers8);
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers8);
                        functionEnhancementBuilder.returns(str, javaTypeQualifiers8);
                        break;
                    case 4:
                        JavaTypeQualifiers javaTypeQualifiers9 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    case 5:
                        JavaTypeQualifiers javaTypeQualifiers10 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers11 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers11, javaTypeQualifiers11);
                        break;
                    case 6:
                        JavaTypeQualifiers javaTypeQualifiers12 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.parameter(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    case 7:
                        JavaTypeQualifiers javaTypeQualifiers13 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.parameter(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    case 8:
                        JavaTypeQualifiers javaTypeQualifiers14 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    default:
                        JavaTypeQualifiers javaTypeQualifiers15 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        final int i6 = 9;
        classEnhancementBuilder2.function("removeLast", "2.1", new Function1(javaLang, i6) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$4
            public final /* synthetic */ int $r8$classId;
            public final String arg$0;

            {
                this.$r8$classId = i6;
                this.arg$0 = javaLang;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = this.$r8$classId;
                String str = this.arg$0;
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                switch (i22) {
                    case 0:
                        JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.returns(str, javaTypeQualifiers2, javaTypeQualifiers2);
                        functionEnhancementBuilder.mustUseReturnValue();
                        break;
                    case 1:
                        JavaTypeQualifiers javaTypeQualifiers3 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers4 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers4);
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers4);
                        break;
                    case 2:
                        JavaTypeQualifiers javaTypeQualifiers5 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers6 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers6);
                        functionEnhancementBuilder.returns(str, javaTypeQualifiers6);
                        break;
                    case 3:
                        JavaTypeQualifiers javaTypeQualifiers7 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers8 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers8);
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers8);
                        functionEnhancementBuilder.returns(str, javaTypeQualifiers8);
                        break;
                    case 4:
                        JavaTypeQualifiers javaTypeQualifiers9 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    case 5:
                        JavaTypeQualifiers javaTypeQualifiers10 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers11 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers11, javaTypeQualifiers11);
                        break;
                    case 6:
                        JavaTypeQualifiers javaTypeQualifiers12 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.parameter(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    case 7:
                        JavaTypeQualifiers javaTypeQualifiers13 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.parameter(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    case 8:
                        JavaTypeQualifiers javaTypeQualifiers14 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    default:
                        JavaTypeQualifiers javaTypeQualifiers15 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder3 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaUtil("LinkedList"));
        classEnhancementBuilder3.function("addFirst", "2.1", new AvatarKt$Avatar$5$1$1(javaLang, 4));
        classEnhancementBuilder3.function("addLast", "2.1", new AvatarKt$Avatar$5$1$1(javaLang, 5));
        classEnhancementBuilder3.function("removeFirst", "2.1", new AvatarKt$Avatar$5$1$1(javaLang, 6));
        classEnhancementBuilder3.function("removeLast", "2.1", new AvatarKt$Avatar$5$1$1(javaLang, 7));
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder4 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaUtil("LinkedHashSet"));
        classEnhancementBuilder4.function("addFirst", "2.2", new AvatarKt$Avatar$5$1$1(javaLang, 8));
        classEnhancementBuilder4.function("addLast", "2.2", new AvatarKt$Avatar$5$1$1(javaLang, 9));
        classEnhancementBuilder4.function("removeFirst", "2.2", new AvatarKt$Avatar$5$1$1(javaLang, 10));
        classEnhancementBuilder4.function("removeLast", "2.2", new AvatarKt$Avatar$5$1$1(javaLang, 11));
        classEnhancementBuilder4.function("getFirst", "2.2", new AvatarKt$Avatar$5$1$1(javaLang, 12));
        classEnhancementBuilder4.function("getLast", "2.2", new AvatarKt$Avatar$5$1$1(javaLang, 13));
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder5 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaUtil("Map"));
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "forEach", null, new AvatarKt$Avatar$5$1$1(javaFunction5, 14), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "putIfAbsent", null, new AvatarKt$Avatar$5$1$1(javaLang, 15), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "replace", null, new AvatarKt$Avatar$5$1$1(javaLang, 16), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "replace", null, new AvatarKt$Avatar$5$1$1(javaLang, 17), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "replaceAll", null, new AvatarKt$Avatar$5$1$1(javaFunction4, 18), 2, null);
        final int i7 = 0;
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "compute", null, new Function1(javaLang, javaFunction4, i7) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$25
            public final /* synthetic */ int $r8$classId;
            public final String arg$0;
            public final String arg$1;

            {
                this.$r8$classId = i7;
                this.arg$0 = javaLang;
                this.arg$1 = javaFunction4;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i8 = this.$r8$classId;
                String str = this.arg$1;
                String str2 = this.arg$0;
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                switch (i8) {
                    case 0:
                        JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers2);
                        JavaTypeQualifiers javaTypeQualifiers3 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers2, javaTypeQualifiers2, javaTypeQualifiers3, javaTypeQualifiers3);
                        functionEnhancementBuilder.returns(str2, javaTypeQualifiers3);
                        break;
                    case 1:
                        JavaTypeQualifiers javaTypeQualifiers4 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers5 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers5);
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers5, javaTypeQualifiers5, javaTypeQualifiers5);
                        functionEnhancementBuilder.returns(str2, javaTypeQualifiers5);
                        break;
                    case 2:
                        JavaTypeQualifiers javaTypeQualifiers6 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers7 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers7);
                        JavaTypeQualifiers javaTypeQualifiers8 = PredefinedEnhancementInfoKt.NOT_NULLABLE;
                        JavaTypeQualifiers javaTypeQualifiers9 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers7, javaTypeQualifiers7, javaTypeQualifiers8, javaTypeQualifiers9);
                        functionEnhancementBuilder.returns(str2, javaTypeQualifiers9);
                        break;
                    case 3:
                        JavaTypeQualifiers javaTypeQualifiers10 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers11 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers11);
                        JavaTypeQualifiers javaTypeQualifiers12 = PredefinedEnhancementInfoKt.NOT_NULLABLE;
                        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers12);
                        JavaTypeQualifiers javaTypeQualifiers13 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers11, javaTypeQualifiers12, javaTypeQualifiers12, javaTypeQualifiers13);
                        functionEnhancementBuilder.returns(str2, javaTypeQualifiers13);
                        break;
                    case 4:
                        JavaTypeQualifiers javaTypeQualifiers14 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers15 = PredefinedEnhancementInfoKt.NOT_NULLABLE;
                        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers15);
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM, javaTypeQualifiers15);
                        functionEnhancementBuilder.mustUseReturnValue();
                        break;
                    default:
                        JavaTypeQualifiers javaTypeQualifiers16 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.parameter(str2, PredefinedEnhancementInfoKt.NULLABLE);
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM, PredefinedEnhancementInfoKt.NOT_NULLABLE);
                        functionEnhancementBuilder.mustUseReturnValue();
                        break;
                }
                return Unit.INSTANCE;
            }
        }, 2, null);
        final int i8 = 1;
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "computeIfAbsent", null, new Function1(javaLang, javaFunction2, i8) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$25
            public final /* synthetic */ int $r8$classId;
            public final String arg$0;
            public final String arg$1;

            {
                this.$r8$classId = i8;
                this.arg$0 = javaLang;
                this.arg$1 = javaFunction2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i82 = this.$r8$classId;
                String str = this.arg$1;
                String str2 = this.arg$0;
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                switch (i82) {
                    case 0:
                        JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers2);
                        JavaTypeQualifiers javaTypeQualifiers3 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers2, javaTypeQualifiers2, javaTypeQualifiers3, javaTypeQualifiers3);
                        functionEnhancementBuilder.returns(str2, javaTypeQualifiers3);
                        break;
                    case 1:
                        JavaTypeQualifiers javaTypeQualifiers4 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers5 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers5);
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers5, javaTypeQualifiers5, javaTypeQualifiers5);
                        functionEnhancementBuilder.returns(str2, javaTypeQualifiers5);
                        break;
                    case 2:
                        JavaTypeQualifiers javaTypeQualifiers6 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers7 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers7);
                        JavaTypeQualifiers javaTypeQualifiers8 = PredefinedEnhancementInfoKt.NOT_NULLABLE;
                        JavaTypeQualifiers javaTypeQualifiers9 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers7, javaTypeQualifiers7, javaTypeQualifiers8, javaTypeQualifiers9);
                        functionEnhancementBuilder.returns(str2, javaTypeQualifiers9);
                        break;
                    case 3:
                        JavaTypeQualifiers javaTypeQualifiers10 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers11 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers11);
                        JavaTypeQualifiers javaTypeQualifiers12 = PredefinedEnhancementInfoKt.NOT_NULLABLE;
                        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers12);
                        JavaTypeQualifiers javaTypeQualifiers13 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers11, javaTypeQualifiers12, javaTypeQualifiers12, javaTypeQualifiers13);
                        functionEnhancementBuilder.returns(str2, javaTypeQualifiers13);
                        break;
                    case 4:
                        JavaTypeQualifiers javaTypeQualifiers14 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers15 = PredefinedEnhancementInfoKt.NOT_NULLABLE;
                        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers15);
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM, javaTypeQualifiers15);
                        functionEnhancementBuilder.mustUseReturnValue();
                        break;
                    default:
                        JavaTypeQualifiers javaTypeQualifiers16 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.parameter(str2, PredefinedEnhancementInfoKt.NULLABLE);
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM, PredefinedEnhancementInfoKt.NOT_NULLABLE);
                        functionEnhancementBuilder.mustUseReturnValue();
                        break;
                }
                return Unit.INSTANCE;
            }
        }, 2, null);
        final int i9 = 2;
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "computeIfPresent", null, new Function1(javaLang, javaFunction4, i9) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$25
            public final /* synthetic */ int $r8$classId;
            public final String arg$0;
            public final String arg$1;

            {
                this.$r8$classId = i9;
                this.arg$0 = javaLang;
                this.arg$1 = javaFunction4;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i82 = this.$r8$classId;
                String str = this.arg$1;
                String str2 = this.arg$0;
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                switch (i82) {
                    case 0:
                        JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers2);
                        JavaTypeQualifiers javaTypeQualifiers3 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers2, javaTypeQualifiers2, javaTypeQualifiers3, javaTypeQualifiers3);
                        functionEnhancementBuilder.returns(str2, javaTypeQualifiers3);
                        break;
                    case 1:
                        JavaTypeQualifiers javaTypeQualifiers4 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers5 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers5);
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers5, javaTypeQualifiers5, javaTypeQualifiers5);
                        functionEnhancementBuilder.returns(str2, javaTypeQualifiers5);
                        break;
                    case 2:
                        JavaTypeQualifiers javaTypeQualifiers6 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers7 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers7);
                        JavaTypeQualifiers javaTypeQualifiers8 = PredefinedEnhancementInfoKt.NOT_NULLABLE;
                        JavaTypeQualifiers javaTypeQualifiers9 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers7, javaTypeQualifiers7, javaTypeQualifiers8, javaTypeQualifiers9);
                        functionEnhancementBuilder.returns(str2, javaTypeQualifiers9);
                        break;
                    case 3:
                        JavaTypeQualifiers javaTypeQualifiers10 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers11 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers11);
                        JavaTypeQualifiers javaTypeQualifiers12 = PredefinedEnhancementInfoKt.NOT_NULLABLE;
                        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers12);
                        JavaTypeQualifiers javaTypeQualifiers13 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers11, javaTypeQualifiers12, javaTypeQualifiers12, javaTypeQualifiers13);
                        functionEnhancementBuilder.returns(str2, javaTypeQualifiers13);
                        break;
                    case 4:
                        JavaTypeQualifiers javaTypeQualifiers14 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers15 = PredefinedEnhancementInfoKt.NOT_NULLABLE;
                        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers15);
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM, javaTypeQualifiers15);
                        functionEnhancementBuilder.mustUseReturnValue();
                        break;
                    default:
                        JavaTypeQualifiers javaTypeQualifiers16 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.parameter(str2, PredefinedEnhancementInfoKt.NULLABLE);
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM, PredefinedEnhancementInfoKt.NOT_NULLABLE);
                        functionEnhancementBuilder.mustUseReturnValue();
                        break;
                }
                return Unit.INSTANCE;
            }
        }, 2, null);
        final int i10 = 3;
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "merge", null, new Function1(javaLang, javaFunction4, i10) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$25
            public final /* synthetic */ int $r8$classId;
            public final String arg$0;
            public final String arg$1;

            {
                this.$r8$classId = i10;
                this.arg$0 = javaLang;
                this.arg$1 = javaFunction4;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i82 = this.$r8$classId;
                String str = this.arg$1;
                String str2 = this.arg$0;
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                switch (i82) {
                    case 0:
                        JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers2);
                        JavaTypeQualifiers javaTypeQualifiers3 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers2, javaTypeQualifiers2, javaTypeQualifiers3, javaTypeQualifiers3);
                        functionEnhancementBuilder.returns(str2, javaTypeQualifiers3);
                        break;
                    case 1:
                        JavaTypeQualifiers javaTypeQualifiers4 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers5 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers5);
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers5, javaTypeQualifiers5, javaTypeQualifiers5);
                        functionEnhancementBuilder.returns(str2, javaTypeQualifiers5);
                        break;
                    case 2:
                        JavaTypeQualifiers javaTypeQualifiers6 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers7 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers7);
                        JavaTypeQualifiers javaTypeQualifiers8 = PredefinedEnhancementInfoKt.NOT_NULLABLE;
                        JavaTypeQualifiers javaTypeQualifiers9 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers7, javaTypeQualifiers7, javaTypeQualifiers8, javaTypeQualifiers9);
                        functionEnhancementBuilder.returns(str2, javaTypeQualifiers9);
                        break;
                    case 3:
                        JavaTypeQualifiers javaTypeQualifiers10 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers11 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers11);
                        JavaTypeQualifiers javaTypeQualifiers12 = PredefinedEnhancementInfoKt.NOT_NULLABLE;
                        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers12);
                        JavaTypeQualifiers javaTypeQualifiers13 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers11, javaTypeQualifiers12, javaTypeQualifiers12, javaTypeQualifiers13);
                        functionEnhancementBuilder.returns(str2, javaTypeQualifiers13);
                        break;
                    case 4:
                        JavaTypeQualifiers javaTypeQualifiers14 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers15 = PredefinedEnhancementInfoKt.NOT_NULLABLE;
                        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers15);
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM, javaTypeQualifiers15);
                        functionEnhancementBuilder.mustUseReturnValue();
                        break;
                    default:
                        JavaTypeQualifiers javaTypeQualifiers16 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.parameter(str2, PredefinedEnhancementInfoKt.NULLABLE);
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM, PredefinedEnhancementInfoKt.NOT_NULLABLE);
                        functionEnhancementBuilder.mustUseReturnValue();
                        break;
                }
                return Unit.INSTANCE;
            }
        }, 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder6 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaUtil("LinkedHashMap"));
        classEnhancementBuilder6.function("putFirst", "2.2", new AvatarKt$Avatar$5$1$1(javaLang, 19));
        classEnhancementBuilder6.function("putLast", "2.2", new AvatarKt$Avatar$5$1$1(javaLang, 21));
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder7 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, javaUtil2);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder7, "empty", null, new AvatarKt$Avatar$5$1$1(javaUtil2, 22), 2, null);
        final int i11 = 4;
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder7, "of", null, new Function1(javaLang, javaUtil2, i11) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$25
            public final /* synthetic */ int $r8$classId;
            public final String arg$0;
            public final String arg$1;

            {
                this.$r8$classId = i11;
                this.arg$0 = javaLang;
                this.arg$1 = javaUtil2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i82 = this.$r8$classId;
                String str = this.arg$1;
                String str2 = this.arg$0;
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                switch (i82) {
                    case 0:
                        JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers2);
                        JavaTypeQualifiers javaTypeQualifiers3 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers2, javaTypeQualifiers2, javaTypeQualifiers3, javaTypeQualifiers3);
                        functionEnhancementBuilder.returns(str2, javaTypeQualifiers3);
                        break;
                    case 1:
                        JavaTypeQualifiers javaTypeQualifiers4 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers5 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers5);
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers5, javaTypeQualifiers5, javaTypeQualifiers5);
                        functionEnhancementBuilder.returns(str2, javaTypeQualifiers5);
                        break;
                    case 2:
                        JavaTypeQualifiers javaTypeQualifiers6 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers7 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers7);
                        JavaTypeQualifiers javaTypeQualifiers8 = PredefinedEnhancementInfoKt.NOT_NULLABLE;
                        JavaTypeQualifiers javaTypeQualifiers9 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers7, javaTypeQualifiers7, javaTypeQualifiers8, javaTypeQualifiers9);
                        functionEnhancementBuilder.returns(str2, javaTypeQualifiers9);
                        break;
                    case 3:
                        JavaTypeQualifiers javaTypeQualifiers10 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers11 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers11);
                        JavaTypeQualifiers javaTypeQualifiers12 = PredefinedEnhancementInfoKt.NOT_NULLABLE;
                        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers12);
                        JavaTypeQualifiers javaTypeQualifiers13 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers11, javaTypeQualifiers12, javaTypeQualifiers12, javaTypeQualifiers13);
                        functionEnhancementBuilder.returns(str2, javaTypeQualifiers13);
                        break;
                    case 4:
                        JavaTypeQualifiers javaTypeQualifiers14 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers15 = PredefinedEnhancementInfoKt.NOT_NULLABLE;
                        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers15);
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM, javaTypeQualifiers15);
                        functionEnhancementBuilder.mustUseReturnValue();
                        break;
                    default:
                        JavaTypeQualifiers javaTypeQualifiers16 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.parameter(str2, PredefinedEnhancementInfoKt.NULLABLE);
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM, PredefinedEnhancementInfoKt.NOT_NULLABLE);
                        functionEnhancementBuilder.mustUseReturnValue();
                        break;
                }
                return Unit.INSTANCE;
            }
        }, 2, null);
        final int i12 = 5;
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder7, "ofNullable", null, new Function1(javaLang, javaUtil2, i12) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$25
            public final /* synthetic */ int $r8$classId;
            public final String arg$0;
            public final String arg$1;

            {
                this.$r8$classId = i12;
                this.arg$0 = javaLang;
                this.arg$1 = javaUtil2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i82 = this.$r8$classId;
                String str = this.arg$1;
                String str2 = this.arg$0;
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                switch (i82) {
                    case 0:
                        JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers2);
                        JavaTypeQualifiers javaTypeQualifiers3 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers2, javaTypeQualifiers2, javaTypeQualifiers3, javaTypeQualifiers3);
                        functionEnhancementBuilder.returns(str2, javaTypeQualifiers3);
                        break;
                    case 1:
                        JavaTypeQualifiers javaTypeQualifiers4 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers5 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers5);
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers5, javaTypeQualifiers5, javaTypeQualifiers5);
                        functionEnhancementBuilder.returns(str2, javaTypeQualifiers5);
                        break;
                    case 2:
                        JavaTypeQualifiers javaTypeQualifiers6 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers7 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers7);
                        JavaTypeQualifiers javaTypeQualifiers8 = PredefinedEnhancementInfoKt.NOT_NULLABLE;
                        JavaTypeQualifiers javaTypeQualifiers9 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers7, javaTypeQualifiers7, javaTypeQualifiers8, javaTypeQualifiers9);
                        functionEnhancementBuilder.returns(str2, javaTypeQualifiers9);
                        break;
                    case 3:
                        JavaTypeQualifiers javaTypeQualifiers10 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers11 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers11);
                        JavaTypeQualifiers javaTypeQualifiers12 = PredefinedEnhancementInfoKt.NOT_NULLABLE;
                        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers12);
                        JavaTypeQualifiers javaTypeQualifiers13 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers11, javaTypeQualifiers12, javaTypeQualifiers12, javaTypeQualifiers13);
                        functionEnhancementBuilder.returns(str2, javaTypeQualifiers13);
                        break;
                    case 4:
                        JavaTypeQualifiers javaTypeQualifiers14 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers15 = PredefinedEnhancementInfoKt.NOT_NULLABLE;
                        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers15);
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM, javaTypeQualifiers15);
                        functionEnhancementBuilder.mustUseReturnValue();
                        break;
                    default:
                        JavaTypeQualifiers javaTypeQualifiers16 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.parameter(str2, PredefinedEnhancementInfoKt.NULLABLE);
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM, PredefinedEnhancementInfoKt.NOT_NULLABLE);
                        functionEnhancementBuilder.mustUseReturnValue();
                        break;
                }
                return Unit.INSTANCE;
            }
        }, 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder7, "get", null, new AvatarKt$Avatar$5$1$1(javaLang, 23), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder7, "ifPresent", null, new AvatarKt$Avatar$5$1$1(javaFunction3, 24), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaLang("ref/Reference")), "get", null, new AvatarKt$Avatar$5$1$1(javaLang, 25), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, javaFunction), "test", null, new AvatarKt$Avatar$5$1$1(javaLang, 26), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaFunction("BiPredicate")), "test", null, new AvatarKt$Avatar$5$1$1(javaLang, 27), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, javaFunction3), "accept", null, new AvatarKt$Avatar$5$1$1(javaLang, 28), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, javaFunction5), "accept", null, new Function1(javaLang, i8) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$4
            public final /* synthetic */ int $r8$classId;
            public final String arg$0;

            {
                this.$r8$classId = i8;
                this.arg$0 = javaLang;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = this.$r8$classId;
                String str = this.arg$0;
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                switch (i22) {
                    case 0:
                        JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.returns(str, javaTypeQualifiers2, javaTypeQualifiers2);
                        functionEnhancementBuilder.mustUseReturnValue();
                        break;
                    case 1:
                        JavaTypeQualifiers javaTypeQualifiers3 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers4 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers4);
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers4);
                        break;
                    case 2:
                        JavaTypeQualifiers javaTypeQualifiers5 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers6 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers6);
                        functionEnhancementBuilder.returns(str, javaTypeQualifiers6);
                        break;
                    case 3:
                        JavaTypeQualifiers javaTypeQualifiers7 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers8 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers8);
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers8);
                        functionEnhancementBuilder.returns(str, javaTypeQualifiers8);
                        break;
                    case 4:
                        JavaTypeQualifiers javaTypeQualifiers9 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    case 5:
                        JavaTypeQualifiers javaTypeQualifiers10 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers11 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers11, javaTypeQualifiers11);
                        break;
                    case 6:
                        JavaTypeQualifiers javaTypeQualifiers12 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.parameter(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    case 7:
                        JavaTypeQualifiers javaTypeQualifiers13 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.parameter(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    case 8:
                        JavaTypeQualifiers javaTypeQualifiers14 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    default:
                        JavaTypeQualifiers javaTypeQualifiers15 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                }
                return Unit.INSTANCE;
            }
        }, 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, javaFunction2), "apply", null, new Function1(javaLang, i9) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$4
            public final /* synthetic */ int $r8$classId;
            public final String arg$0;

            {
                this.$r8$classId = i9;
                this.arg$0 = javaLang;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = this.$r8$classId;
                String str = this.arg$0;
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                switch (i22) {
                    case 0:
                        JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.returns(str, javaTypeQualifiers2, javaTypeQualifiers2);
                        functionEnhancementBuilder.mustUseReturnValue();
                        break;
                    case 1:
                        JavaTypeQualifiers javaTypeQualifiers3 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers4 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers4);
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers4);
                        break;
                    case 2:
                        JavaTypeQualifiers javaTypeQualifiers5 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers6 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers6);
                        functionEnhancementBuilder.returns(str, javaTypeQualifiers6);
                        break;
                    case 3:
                        JavaTypeQualifiers javaTypeQualifiers7 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers8 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers8);
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers8);
                        functionEnhancementBuilder.returns(str, javaTypeQualifiers8);
                        break;
                    case 4:
                        JavaTypeQualifiers javaTypeQualifiers9 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    case 5:
                        JavaTypeQualifiers javaTypeQualifiers10 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers11 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers11, javaTypeQualifiers11);
                        break;
                    case 6:
                        JavaTypeQualifiers javaTypeQualifiers12 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.parameter(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    case 7:
                        JavaTypeQualifiers javaTypeQualifiers13 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.parameter(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    case 8:
                        JavaTypeQualifiers javaTypeQualifiers14 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    default:
                        JavaTypeQualifiers javaTypeQualifiers15 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                }
                return Unit.INSTANCE;
            }
        }, 2, null);
        final int i13 = 3;
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, javaFunction4), "apply", null, new Function1(javaLang, i13) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$4
            public final /* synthetic */ int $r8$classId;
            public final String arg$0;

            {
                this.$r8$classId = i13;
                this.arg$0 = javaLang;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = this.$r8$classId;
                String str = this.arg$0;
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                switch (i22) {
                    case 0:
                        JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.returns(str, javaTypeQualifiers2, javaTypeQualifiers2);
                        functionEnhancementBuilder.mustUseReturnValue();
                        break;
                    case 1:
                        JavaTypeQualifiers javaTypeQualifiers3 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers4 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers4);
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers4);
                        break;
                    case 2:
                        JavaTypeQualifiers javaTypeQualifiers5 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers6 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers6);
                        functionEnhancementBuilder.returns(str, javaTypeQualifiers6);
                        break;
                    case 3:
                        JavaTypeQualifiers javaTypeQualifiers7 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers8 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers8);
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers8);
                        functionEnhancementBuilder.returns(str, javaTypeQualifiers8);
                        break;
                    case 4:
                        JavaTypeQualifiers javaTypeQualifiers9 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    case 5:
                        JavaTypeQualifiers javaTypeQualifiers10 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers11 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers11, javaTypeQualifiers11);
                        break;
                    case 6:
                        JavaTypeQualifiers javaTypeQualifiers12 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.parameter(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    case 7:
                        JavaTypeQualifiers javaTypeQualifiers13 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.parameter(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    case 8:
                        JavaTypeQualifiers javaTypeQualifiers14 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    default:
                        JavaTypeQualifiers javaTypeQualifiers15 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                }
                return Unit.INSTANCE;
            }
        }, 2, null);
        final int i14 = 4;
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaFunction("Supplier")), "get", null, new Function1(javaLang, i14) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$4
            public final /* synthetic */ int $r8$classId;
            public final String arg$0;

            {
                this.$r8$classId = i14;
                this.arg$0 = javaLang;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = this.$r8$classId;
                String str = this.arg$0;
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                switch (i22) {
                    case 0:
                        JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.returns(str, javaTypeQualifiers2, javaTypeQualifiers2);
                        functionEnhancementBuilder.mustUseReturnValue();
                        break;
                    case 1:
                        JavaTypeQualifiers javaTypeQualifiers3 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers4 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers4);
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers4);
                        break;
                    case 2:
                        JavaTypeQualifiers javaTypeQualifiers5 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers6 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers6);
                        functionEnhancementBuilder.returns(str, javaTypeQualifiers6);
                        break;
                    case 3:
                        JavaTypeQualifiers javaTypeQualifiers7 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers8 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers8);
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers8);
                        functionEnhancementBuilder.returns(str, javaTypeQualifiers8);
                        break;
                    case 4:
                        JavaTypeQualifiers javaTypeQualifiers9 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    case 5:
                        JavaTypeQualifiers javaTypeQualifiers10 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        JavaTypeQualifiers javaTypeQualifiers11 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                        functionEnhancementBuilder.parameter(str, javaTypeQualifiers11, javaTypeQualifiers11);
                        break;
                    case 6:
                        JavaTypeQualifiers javaTypeQualifiers12 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.parameter(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    case 7:
                        JavaTypeQualifiers javaTypeQualifiers13 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.parameter(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    case 8:
                        JavaTypeQualifiers javaTypeQualifiers14 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                    default:
                        JavaTypeQualifiers javaTypeQualifiers15 = PredefinedEnhancementInfoKt.NULLABLE;
                        functionEnhancementBuilder.getClass();
                        functionEnhancementBuilder.returns(str, PredefinedEnhancementInfoKt.NOT_PLATFORM);
                        break;
                }
                return Unit.INSTANCE;
            }
        }, 2, null);
        PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE = signatureEnhancementBuilder.signatures;
    }

    public static final Map<String, PredefinedFunctionEnhancementInfo> getPREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE() {
        return PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE;
    }
}
