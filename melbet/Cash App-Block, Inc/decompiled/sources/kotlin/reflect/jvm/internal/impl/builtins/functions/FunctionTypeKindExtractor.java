package kotlin.reflect.jvm.internal.impl.builtins.functions;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes9.dex */
public final class FunctionTypeKindExtractor {
    public static final Companion Companion = new Companion(null);
    public static final FunctionTypeKindExtractor Default = new FunctionTypeKindExtractor(CollectionsKt__CollectionsKt.listOf((Object[]) new FunctionTypeKind[]{FunctionTypeKind.Function.INSTANCE, FunctionTypeKind.SuspendFunction.INSTANCE, FunctionTypeKind.KFunction.INSTANCE, FunctionTypeKind.KSuspendFunction.INSTANCE}));
    public final List kinds;
    public final LinkedHashMap knownKindsByPackageFqName;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final FunctionTypeKindExtractor getDefault() {
            return FunctionTypeKindExtractor.Default;
        }
    }

    public static final class KindWithArity {
        public final int arity;
        public final FunctionTypeKind kind;

        public KindWithArity(FunctionTypeKind functionTypeKind, int i) {
            functionTypeKind.getClass();
            this.kind = functionTypeKind;
            this.arity = i;
        }

        public final FunctionTypeKind component1() {
            return this.kind;
        }

        public final int component2() {
            return this.arity;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KindWithArity)) {
                return false;
            }
            KindWithArity kindWithArity = (KindWithArity) obj;
            return Intrinsics.areEqual(this.kind, kindWithArity.kind) && this.arity == kindWithArity.arity;
        }

        public final FunctionTypeKind getKind() {
            return this.kind;
        }

        public int hashCode() {
            return Integer.hashCode(this.arity) + (this.kind.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("KindWithArity(kind=");
            sb.append(this.kind);
            sb.append(", arity=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.arity, ')');
        }
    }

    public FunctionTypeKindExtractor(List<? extends FunctionTypeKind> list) {
        list.getClass();
        this.kinds = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            FqName packageFqName = ((FunctionTypeKind) obj).getPackageFqName();
            Object obj2 = linkedHashMap.get(packageFqName);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(packageFqName, obj2);
            }
            ((List) obj2).add(obj);
        }
        this.knownKindsByPackageFqName = linkedHashMap;
    }

    public final FunctionTypeKind getFunctionalClassKind(FqName fqName, String str) {
        fqName.getClass();
        str.getClass();
        KindWithArity functionalClassKindWithArity = getFunctionalClassKindWithArity(fqName, str);
        if (functionalClassKindWithArity != null) {
            return functionalClassKindWithArity.getKind();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0016 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final KindWithArity getFunctionalClassKindWithArity(FqName fqName, String str) {
        Integer valueOf;
        fqName.getClass();
        str.getClass();
        List<FunctionTypeKind> list = (List) this.knownKindsByPackageFqName.get(fqName);
        if (list == null) {
            return null;
        }
        for (FunctionTypeKind functionTypeKind : list) {
            if (StringsKt__StringsJVMKt.startsWith(str, functionTypeKind.getClassNamePrefix(), false)) {
                String substring = str.substring(functionTypeKind.getClassNamePrefix().length());
                if (substring.length() != 0) {
                    int length = substring.length();
                    int i = 0;
                    for (int i2 = 0; i2 < length; i2++) {
                        int charAt = substring.charAt(i2) - '0';
                        if (charAt >= 0 && charAt < 10) {
                            i = (i * 10) + charAt;
                        }
                    }
                    valueOf = Integer.valueOf(i);
                    if (valueOf == null) {
                        return new KindWithArity(functionTypeKind, valueOf.intValue());
                    }
                }
                valueOf = null;
                if (valueOf == null) {
                }
            }
        }
        return null;
    }
}
