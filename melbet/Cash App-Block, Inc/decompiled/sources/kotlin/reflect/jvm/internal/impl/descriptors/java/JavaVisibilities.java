package kotlin.reflect.jvm.internal.impl.descriptors.java;

import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;

/* loaded from: classes9.dex */
public final class JavaVisibilities {
    public static final JavaVisibilities INSTANCE = new JavaVisibilities();

    public static final class PackageVisibility extends Visibility {
        public static final PackageVisibility INSTANCE = new PackageVisibility("package", false);

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public Integer compareTo(Visibility visibility) {
            visibility.getClass();
            if (this == visibility) {
                return 0;
            }
            return Visibilities.INSTANCE.isPrivate(visibility) ? 1 : -1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public String getInternalDisplayName() {
            return "public/*package*/";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public Visibility normalize() {
            return Visibilities.Protected.INSTANCE;
        }
    }

    public static final class ProtectedAndPackage extends Visibility {
        public static final ProtectedAndPackage INSTANCE = new ProtectedAndPackage("protected_and_package", true);

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public Integer compareTo(Visibility visibility) {
            visibility.getClass();
            if (this == visibility) {
                return 0;
            }
            if (visibility == Visibilities.Internal.INSTANCE) {
                return null;
            }
            return Visibilities.INSTANCE.isPrivate(visibility) ? 1 : -1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public String getInternalDisplayName() {
            return "protected/*protected and package*/";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public Visibility normalize() {
            return Visibilities.Protected.INSTANCE;
        }
    }

    public static final class ProtectedStaticVisibility extends Visibility {
        public static final ProtectedStaticVisibility INSTANCE = new ProtectedStaticVisibility("protected_static", true);

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public String getInternalDisplayName() {
            return "protected/*protected static*/";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public Visibility normalize() {
            return Visibilities.Protected.INSTANCE;
        }
    }
}
