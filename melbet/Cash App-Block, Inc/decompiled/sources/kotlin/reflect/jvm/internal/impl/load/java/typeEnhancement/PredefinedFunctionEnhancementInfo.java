package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus;

/* loaded from: classes9.dex */
public final class PredefinedFunctionEnhancementInfo {
    public final String errorsSinceLanguageVersion;
    public final List parametersInfo;
    public final TypeEnhancementInfo returnTypeInfo;
    public final PredefinedFunctionEnhancementInfo warningModeClone;

    public PredefinedFunctionEnhancementInfo(TypeEnhancementInfo typeEnhancementInfo, List<TypeEnhancementInfo> list, String str, ReturnValueStatus returnValueStatus) {
        list.getClass();
        this.returnTypeInfo = typeEnhancementInfo;
        this.parametersInfo = list;
        this.errorsSinceLanguageVersion = str;
        PredefinedFunctionEnhancementInfo predefinedFunctionEnhancementInfo = null;
        if (str != null) {
            TypeEnhancementInfo copyForWarnings = typeEnhancementInfo != null ? typeEnhancementInfo.copyForWarnings() : null;
            List<TypeEnhancementInfo> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (TypeEnhancementInfo typeEnhancementInfo2 : list2) {
                arrayList.add(typeEnhancementInfo2 != null ? typeEnhancementInfo2.copyForWarnings() : null);
            }
            predefinedFunctionEnhancementInfo = new PredefinedFunctionEnhancementInfo(copyForWarnings, arrayList, null, null, 8, null);
        }
        this.warningModeClone = predefinedFunctionEnhancementInfo;
    }

    public final String getErrorsSinceLanguageVersion() {
        return this.errorsSinceLanguageVersion;
    }

    public final List<TypeEnhancementInfo> getParametersInfo() {
        return this.parametersInfo;
    }

    public final TypeEnhancementInfo getReturnTypeInfo() {
        return this.returnTypeInfo;
    }

    public final PredefinedFunctionEnhancementInfo getWarningModeClone() {
        return this.warningModeClone;
    }

    public PredefinedFunctionEnhancementInfo() {
        this(null, null, null, null, 15, null);
    }

    public PredefinedFunctionEnhancementInfo(TypeEnhancementInfo typeEnhancementInfo, List list, String str, ReturnValueStatus returnValueStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : typeEnhancementInfo, (i & 2) != 0 ? EmptyList.INSTANCE : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : returnValueStatus);
    }
}
