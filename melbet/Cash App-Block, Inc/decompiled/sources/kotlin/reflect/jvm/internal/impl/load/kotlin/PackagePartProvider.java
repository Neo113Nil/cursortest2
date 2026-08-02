package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public interface PackagePartProvider {

    public static final class Empty implements PackagePartProvider {
        public static final Empty INSTANCE = new Empty();

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider
        public List<String> findPackageParts(String str) {
            str.getClass();
            return EmptyList.INSTANCE;
        }
    }

    List<String> findPackageParts(String str);
}
