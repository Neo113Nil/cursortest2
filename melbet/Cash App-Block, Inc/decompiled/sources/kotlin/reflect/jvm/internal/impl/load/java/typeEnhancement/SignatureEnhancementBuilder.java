package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants;
import papa.internal.AppUpdateDetector$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public final class SignatureEnhancementBuilder {
    public final LinkedHashMap signatures = new LinkedHashMap();

    public final class ClassEnhancementBuilder {
        public final String className;
        public final /* synthetic */ SignatureEnhancementBuilder this$0;

        public ClassEnhancementBuilder(SignatureEnhancementBuilder signatureEnhancementBuilder, String str) {
            str.getClass();
            this.this$0 = signatureEnhancementBuilder;
            this.className = str;
        }

        public static /* synthetic */ void function$default(ClassEnhancementBuilder classEnhancementBuilder, String str, String str2, Function1 function1, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            classEnhancementBuilder.function(str, str2, function1);
        }

        public final void function(String str, String str2, Function1<? super FunctionEnhancementBuilder, Unit> function1) {
            str.getClass();
            function1.getClass();
            LinkedHashMap linkedHashMap = this.this$0.signatures;
            FunctionEnhancementBuilder functionEnhancementBuilder = new FunctionEnhancementBuilder(this, str, str2);
            function1.invoke(functionEnhancementBuilder);
            Pair<String, PredefinedFunctionEnhancementInfo> build = functionEnhancementBuilder.build();
            linkedHashMap.put(build.first, build.second);
        }

        public final String getClassName() {
            return this.className;
        }

        public final class FunctionEnhancementBuilder {
            public final String errorsSinceLanguageVersion;
            public final String functionName;
            public final ArrayList parameters;
            public Pair returnType;
            public ReturnValueStatus returnValueStatus;
            public final /* synthetic */ ClassEnhancementBuilder this$0;

            public FunctionEnhancementBuilder(ClassEnhancementBuilder classEnhancementBuilder, String str, String str2) {
                str.getClass();
                this.this$0 = classEnhancementBuilder;
                this.functionName = str;
                this.errorsSinceLanguageVersion = str2;
                this.parameters = new ArrayList();
                this.returnType = new Pair(GpsTagConstants.GPS_TAG_GPS_STATUS_VALUE_MEASUREMENT_INTEROPERABILITY, null);
            }

            public final Pair<String, PredefinedFunctionEnhancementInfo> build() {
                SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
                String className = this.this$0.getClassName();
                ArrayList arrayList = this.parameters;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add((String) ((Pair) it.next()).first);
                }
                String signature = signatureBuildingComponents.signature(className, signatureBuildingComponents.jvmDescriptor(this.functionName, arrayList2, (String) this.returnType.first));
                TypeEnhancementInfo typeEnhancementInfo = (TypeEnhancementInfo) this.returnType.second;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList3.add((TypeEnhancementInfo) ((Pair) it2.next()).second);
                }
                return new Pair<>(signature, new PredefinedFunctionEnhancementInfo(typeEnhancementInfo, arrayList3, this.errorsSinceLanguageVersion, this.returnValueStatus));
            }

            public final void mustUseReturnValue() {
                this.returnValueStatus = ReturnValueStatus.MustUse;
            }

            public final void parameter(String str, JavaTypeQualifiers... javaTypeQualifiersArr) {
                TypeEnhancementInfo typeEnhancementInfo;
                str.getClass();
                javaTypeQualifiersArr.getClass();
                if (javaTypeQualifiersArr.length == 0) {
                    typeEnhancementInfo = null;
                } else {
                    IndexingIterable indexingIterable = new IndexingIterable(new AppUpdateDetector$$ExternalSyntheticLambda0(javaTypeQualifiersArr, 11), 0);
                    int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(indexingIterable, 10));
                    if (mapCapacity < 16) {
                        mapCapacity = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                    Iterator it = indexingIterable.iterator();
                    while (true) {
                        ArrayIterator arrayIterator = (ArrayIterator) it;
                        if (!((Iterator) arrayIterator.f1520array).hasNext()) {
                            break;
                        }
                        IndexedValue indexedValue = (IndexedValue) arrayIterator.next();
                        linkedHashMap.put(Integer.valueOf(indexedValue.index), (JavaTypeQualifiers) indexedValue.value);
                    }
                    typeEnhancementInfo = new TypeEnhancementInfo(linkedHashMap);
                }
                this.parameters.add(new Pair(str, typeEnhancementInfo));
            }

            public final void returns(String str, JavaTypeQualifiers... javaTypeQualifiersArr) {
                str.getClass();
                javaTypeQualifiersArr.getClass();
                IndexingIterable indexingIterable = new IndexingIterable(new AppUpdateDetector$$ExternalSyntheticLambda0(javaTypeQualifiersArr, 11), 0);
                int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(indexingIterable, 10));
                if (mapCapacity < 16) {
                    mapCapacity = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                Iterator it = indexingIterable.iterator();
                while (true) {
                    ArrayIterator arrayIterator = (ArrayIterator) it;
                    if (!((Iterator) arrayIterator.f1520array).hasNext()) {
                        this.returnType = new Pair(str, new TypeEnhancementInfo(linkedHashMap));
                        return;
                    } else {
                        IndexedValue indexedValue = (IndexedValue) arrayIterator.next();
                        linkedHashMap.put(Integer.valueOf(indexedValue.index), (JavaTypeQualifiers) indexedValue.value);
                    }
                }
            }

            public final void returns(JvmPrimitiveType jvmPrimitiveType) {
                jvmPrimitiveType.getClass();
                this.returnType = new Pair(jvmPrimitiveType.getDesc(), null);
            }
        }
    }
}
