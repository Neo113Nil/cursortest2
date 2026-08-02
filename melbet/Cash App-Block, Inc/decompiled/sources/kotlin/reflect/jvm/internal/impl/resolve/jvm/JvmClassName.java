package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes3.dex */
public class JvmClassName {
    public final String internalName;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        if (i != 3 && i != 5) {
            switch (i) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i != 3 && i != 5) {
                switch (i) {
                    case 8:
                    case 9:
                    case 10:
                        break;
                    default:
                        i2 = 3;
                        break;
                }
                Object[] objArr = new Object[i2];
                switch (i) {
                    case 1:
                    case 2:
                        objArr[0] = "classId";
                        break;
                    case 3:
                    case 5:
                    case 8:
                    case 9:
                    case 10:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                        break;
                    case 4:
                    case 6:
                        objArr[0] = "fqName";
                        break;
                    case 7:
                    default:
                        objArr[0] = "internalName";
                        break;
                }
                if (i != 3) {
                    objArr[1] = "internalNameByClassId";
                } else if (i != 5) {
                    switch (i) {
                        case 8:
                            objArr[1] = "getFqNameForClassNameWithoutDollars";
                            break;
                        case 9:
                            objArr[1] = "getPackageFqName";
                            break;
                        case 10:
                            objArr[1] = "getInternalName";
                            break;
                        default:
                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                            break;
                    }
                } else {
                    objArr[1] = "byFqNameWithoutInnerClasses";
                }
                switch (i) {
                    case 1:
                        objArr[2] = "byClassId";
                        break;
                    case 2:
                        objArr[2] = "internalNameByClassId";
                        break;
                    case 3:
                    case 5:
                    case 8:
                    case 9:
                    case 10:
                        break;
                    case 4:
                    case 6:
                        objArr[2] = "byFqNameWithoutInnerClasses";
                        break;
                    case 7:
                        objArr[2] = "<init>";
                        break;
                    default:
                        objArr[2] = "byInternalName";
                        break;
                }
                String format2 = String.format(str, objArr);
                if (i != 3 && i != 5) {
                    switch (i) {
                        case 8:
                        case 9:
                        case 10:
                            break;
                        default:
                            throw new IllegalArgumentException(format2);
                    }
                }
                throw new IllegalStateException(format2);
            }
            i2 = 2;
            Object[] objArr2 = new Object[i2];
            switch (i) {
            }
            if (i != 3) {
            }
            switch (i) {
            }
            String format22 = String.format(str, objArr2);
            if (i != 3) {
                switch (i) {
                }
            }
            throw new IllegalStateException(format22);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i != 3) {
            switch (i) {
            }
            Object[] objArr22 = new Object[i2];
            switch (i) {
            }
            if (i != 3) {
            }
            switch (i) {
            }
            String format222 = String.format(str, objArr22);
            if (i != 3) {
            }
            throw new IllegalStateException(format222);
        }
        i2 = 2;
        Object[] objArr222 = new Object[i2];
        switch (i) {
        }
        if (i != 3) {
        }
        switch (i) {
        }
        String format2222 = String.format(str, objArr222);
        if (i != 3) {
        }
        throw new IllegalStateException(format2222);
    }

    public JvmClassName(String str) {
        if (str != null) {
            this.internalName = str;
        } else {
            $$$reportNull$$$0(7);
            throw null;
        }
    }

    public static JvmClassName byClassId(ClassId classId) {
        if (classId != null) {
            return new JvmClassName(internalNameByClassId(classId));
        }
        $$$reportNull$$$0(1);
        throw null;
    }

    public static JvmClassName byFqNameWithoutInnerClasses(FqName fqName) {
        if (fqName != null) {
            return new JvmClassName(fqName.asString().replace('.', '/'));
        }
        $$$reportNull$$$0(4);
        throw null;
    }

    public static JvmClassName byInternalName(String str) {
        if (str != null) {
            return new JvmClassName(str);
        }
        $$$reportNull$$$0(0);
        throw null;
    }

    public static String internalNameByClassId(ClassId classId) {
        if (classId == null) {
            $$$reportNull$$$0(2);
            throw null;
        }
        FqName packageFqName = classId.getPackageFqName();
        String replace = classId.getRelativeClassName().asString().replace('.', '$');
        if (!packageFqName.isRoot()) {
            replace = packageFqName.asString().replace('.', '/') + "/" + replace;
        }
        if (replace != null) {
            return replace;
        }
        $$$reportNull$$$0(3);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.internalName.equals(((JvmClassName) obj).internalName);
    }

    public FqName getFqNameForTopLevelClassMaybeWithDollars() {
        return new FqName(this.internalName.replace('/', '.'));
    }

    public String getInternalName() {
        String str = this.internalName;
        if (str != null) {
            return str;
        }
        $$$reportNull$$$0(10);
        throw null;
    }

    public FqName getPackageFqName() {
        String str = this.internalName;
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf != -1) {
            return new FqName(str.substring(0, lastIndexOf).replace('/', '.'));
        }
        FqName fqName = FqName.ROOT;
        if (fqName != null) {
            return fqName;
        }
        $$$reportNull$$$0(9);
        throw null;
    }

    public int hashCode() {
        return this.internalName.hashCode();
    }

    public String toString() {
        return this.internalName;
    }
}
