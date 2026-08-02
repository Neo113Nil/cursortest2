package kotlin.reflect.jvm.internal.impl.builtins;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$22;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public abstract class KotlinBuiltIns {
    public static final Name BUILTINS_MODULE_NAME = Name.special("<built-ins module>");
    public final MemoizedFunctionToNotNull builtInClassesByName;
    public final NotNullLazyValue builtInPackagesImportedByDefault;
    public ModuleDescriptorImpl builtInsModule;
    public final NotNullLazyValue primitives;
    public final StorageManager storageManager;

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns$3, reason: invalid class name */
    public final class AnonymousClass3 implements Function1 {
        public final /* synthetic */ int $r8$classId;
        public final KotlinBuiltIns this$0;

        public /* synthetic */ AnonymousClass3(KotlinBuiltIns kotlinBuiltIns, int i) {
            this.$r8$classId = i;
            this.this$0 = kotlinBuiltIns;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            int i = this.$r8$classId;
            KotlinBuiltIns kotlinBuiltIns = this.this$0;
            switch (i) {
                case 0:
                    Name name = (Name) obj;
                    ClassifierDescriptor mo4154getContributedClassifier = kotlinBuiltIns.getBuiltInsPackageScope().mo4154getContributedClassifier(name, NoLookupLocation.FROM_BUILTINS);
                    if (mo4154getContributedClassifier == null) {
                        f$$ExternalSyntheticLambda0.m$1("Built-in class ", StandardNames.BUILT_INS_PACKAGE_FQ_NAME.child(name), " is not found");
                        return null;
                    }
                    if (mo4154getContributedClassifier instanceof ClassDescriptor) {
                        return (ClassDescriptor) mo4154getContributedClassifier;
                    }
                    throw new AssertionError("Must be a class descriptor " + name + ", but was " + mo4154getContributedClassifier);
                default:
                    ModuleDescriptor moduleDescriptor = (ModuleDescriptor) obj;
                    Name name2 = AnnotationUtilKt.DEPRECATED_MESSAGE_NAME;
                    moduleDescriptor.getClass();
                    SimpleType arrayType = moduleDescriptor.getBuiltIns().getArrayType(Variance.INVARIANT, kotlinBuiltIns.getStringType());
                    arrayType.getClass();
                    return arrayType;
            }
        }
    }

    public final class Primitives {
        public final HashMap kotlinArrayTypeToPrimitiveKotlinType;
        public final EnumMap primitiveTypeToArrayKotlinType;

        public Primitives(EnumMap enumMap, HashMap hashMap, HashMap hashMap2) {
            this.primitiveTypeToArrayKotlinType = enumMap;
            this.kotlinArrayTypeToPrimitiveKotlinType = hashMap2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0409 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0058 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0369  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        if (i != 11 && i != 13 && i != 15 && i != 69 && i != 74 && i != 81 && i != 84 && i != 86 && i != 87) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            break;
                    }
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
            }
            if (i != 11 && i != 13 && i != 15 && i != 69 && i != 74 && i != 81 && i != 84 && i != 86 && i != 87) {
                switch (i) {
                    default:
                        switch (i) {
                            default:
                                switch (i) {
                                    default:
                                        switch (i) {
                                            case 55:
                                            case 56:
                                            case 57:
                                            case 58:
                                            case 59:
                                            case 60:
                                            case 61:
                                            case 62:
                                            case 63:
                                            case 64:
                                            case 65:
                                            case 66:
                                            case 67:
                                                break;
                                            default:
                                                i2 = 3;
                                                break;
                                        }
                                    case 48:
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                        i2 = 2;
                                        break;
                                }
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                                break;
                        }
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        break;
                }
                Object[] objArr = new Object[i2];
                switch (i) {
                    case 1:
                    case 72:
                        objArr[0] = "module";
                        break;
                    case 2:
                        objArr[0] = "computation";
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 11:
                    case 13:
                    case 15:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 69:
                    case 74:
                    case 81:
                    case 84:
                    case 86:
                    case 87:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                        break;
                    case 9:
                    case 10:
                    case 76:
                    case 77:
                    case 89:
                    case 96:
                    case 103:
                    case 107:
                    case 108:
                    case SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE:
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE:
                    case 147:
                    case SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE:
                    case SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE:
                    case SDK_ASSET_ILLUSTRATION_WALLET_VALUE:
                    case SDK_ASSET_ILLUSTRATION_INCOME_VALUE:
                        objArr[0] = "descriptor";
                        break;
                    case 12:
                    case 98:
                    case 100:
                    case 102:
                    case 104:
                    case 106:
                    case SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE:
                        objArr[0] = "fqName";
                        break;
                    case 14:
                        objArr[0] = "simpleName";
                        break;
                    case 16:
                    case 17:
                    case 54:
                    case 88:
                    case 90:
                    case 91:
                    case 92:
                    case 93:
                    case 94:
                    case 95:
                    case 97:
                    case 99:
                    case 105:
                    case 109:
                    case 110:
                    case 111:
                    case 113:
                    case 114:
                    case 115:
                    case 116:
                    case 117:
                    case 118:
                    case 119:
                    case 120:
                    case 121:
                    case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                    case SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE:
                    case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                    case 125:
                    case SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE:
                    case 127:
                    case 128:
                    case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                    case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                    case 131:
                    case SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE:
                    case SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE:
                    case SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE:
                    case 136:
                    case SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE:
                    case SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE:
                    case SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE:
                    case 140:
                    case SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE:
                    case SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE:
                    case 144:
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE:
                    case SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE:
                    case 150:
                    case 151:
                    case SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE:
                    case 153:
                    case SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE:
                    case SDK_ASSET_ILLUSTRATION_MANAGE_CONNECTIONS_VALUE:
                    case SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_CENTERED_VALUE:
                    case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE:
                        objArr[0] = "type";
                        break;
                    case 47:
                        objArr[0] = "classSimpleName";
                        break;
                    case 68:
                    case 70:
                        objArr[0] = "arrayType";
                        break;
                    case 71:
                        objArr[0] = "notNullArrayType";
                        break;
                    case 73:
                        objArr[0] = "primitiveType";
                        break;
                    case 75:
                        objArr[0] = "kotlinType";
                        break;
                    case 78:
                    case 82:
                        objArr[0] = "projectionType";
                        break;
                    case 79:
                    case 83:
                    case 85:
                        objArr[0] = "argument";
                        break;
                    case 80:
                        objArr[0] = "annotations";
                        break;
                    case 101:
                        objArr[0] = "typeConstructor";
                        break;
                    case 112:
                        objArr[0] = "classDescriptor";
                        break;
                    case SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE:
                        objArr[0] = "declarationDescriptor";
                        break;
                    default:
                        objArr[0] = "storageManager";
                        break;
                }
                if (i != 11) {
                    objArr[1] = "getBuiltInsPackageScope";
                } else if (i == 13) {
                    objArr[1] = "getBuiltInClassByFqName";
                } else if (i == 15) {
                    objArr[1] = "getBuiltInClassByName";
                } else if (i == 69) {
                    objArr[1] = "getArrayElementType";
                } else if (i == 74) {
                    objArr[1] = "getPrimitiveArrayKotlinType";
                } else if (i == 81 || i == 84) {
                    objArr[1] = "getArrayType";
                } else if (i == 86) {
                    objArr[1] = "getEnumType";
                } else if (i != 87) {
                    switch (i) {
                        case 3:
                            objArr[1] = "getAdditionalClassPartsProvider";
                            break;
                        case 4:
                            objArr[1] = "getPlatformDependentDeclarationFilter";
                            break;
                        case 5:
                            objArr[1] = "getClassDescriptorFactories";
                            break;
                        case 6:
                            objArr[1] = "getStorageManager";
                            break;
                        case 7:
                            objArr[1] = "getBuiltInsModule";
                            break;
                        case 8:
                            objArr[1] = "getBuiltInPackagesImportedByDefault";
                            break;
                        default:
                            switch (i) {
                                case 18:
                                    objArr[1] = "getSuspendFunction";
                                    break;
                                case 19:
                                    objArr[1] = "getKFunction";
                                    break;
                                case 20:
                                    objArr[1] = "getKSuspendFunction";
                                    break;
                                case 21:
                                    objArr[1] = "getKClass";
                                    break;
                                case 22:
                                    objArr[1] = "getKType";
                                    break;
                                case 23:
                                    objArr[1] = "getKCallable";
                                    break;
                                case 24:
                                    objArr[1] = "getKProperty";
                                    break;
                                case 25:
                                    objArr[1] = "getKProperty0";
                                    break;
                                case 26:
                                    objArr[1] = "getKProperty1";
                                    break;
                                case 27:
                                    objArr[1] = "getKProperty2";
                                    break;
                                case 28:
                                    objArr[1] = "getKMutableProperty0";
                                    break;
                                case 29:
                                    objArr[1] = "getKMutableProperty1";
                                    break;
                                case 30:
                                    objArr[1] = "getKMutableProperty2";
                                    break;
                                case 31:
                                    objArr[1] = "getIterator";
                                    break;
                                case 32:
                                    objArr[1] = "getIterable";
                                    break;
                                case 33:
                                    objArr[1] = "getMutableIterable";
                                    break;
                                case 34:
                                    objArr[1] = "getMutableIterator";
                                    break;
                                case 35:
                                    objArr[1] = "getCollection";
                                    break;
                                case 36:
                                    objArr[1] = "getMutableCollection";
                                    break;
                                case 37:
                                    objArr[1] = "getList";
                                    break;
                                case 38:
                                    objArr[1] = "getMutableList";
                                    break;
                                case 39:
                                    objArr[1] = "getSet";
                                    break;
                                case 40:
                                    objArr[1] = "getMutableSet";
                                    break;
                                case 41:
                                    objArr[1] = "getMap";
                                    break;
                                case 42:
                                    objArr[1] = "getMutableMap";
                                    break;
                                case 43:
                                    objArr[1] = "getMapEntry";
                                    break;
                                case 44:
                                    objArr[1] = "getMutableMapEntry";
                                    break;
                                case 45:
                                    objArr[1] = "getListIterator";
                                    break;
                                case 46:
                                    objArr[1] = "getMutableListIterator";
                                    break;
                                default:
                                    switch (i) {
                                        case 48:
                                            objArr[1] = "getBuiltInTypeByClassName";
                                            break;
                                        case 49:
                                            objArr[1] = "getNothingType";
                                            break;
                                        case 50:
                                            objArr[1] = "getNullableNothingType";
                                            break;
                                        case 51:
                                            objArr[1] = "getAnyType";
                                            break;
                                        case 52:
                                            objArr[1] = "getNullableAnyType";
                                            break;
                                        case 53:
                                            objArr[1] = "getDefaultBound";
                                            break;
                                        default:
                                            switch (i) {
                                                case 55:
                                                    objArr[1] = "getPrimitiveKotlinType";
                                                    break;
                                                case 56:
                                                    objArr[1] = "getNumberType";
                                                    break;
                                                case 57:
                                                    objArr[1] = "getByteType";
                                                    break;
                                                case 58:
                                                    objArr[1] = "getShortType";
                                                    break;
                                                case 59:
                                                    objArr[1] = "getIntType";
                                                    break;
                                                case 60:
                                                    objArr[1] = "getLongType";
                                                    break;
                                                case 61:
                                                    objArr[1] = "getFloatType";
                                                    break;
                                                case 62:
                                                    objArr[1] = "getDoubleType";
                                                    break;
                                                case 63:
                                                    objArr[1] = "getCharType";
                                                    break;
                                                case 64:
                                                    objArr[1] = "getBooleanType";
                                                    break;
                                                case 65:
                                                    objArr[1] = "getUnitType";
                                                    break;
                                                case 66:
                                                    objArr[1] = "getStringType";
                                                    break;
                                                case 67:
                                                    objArr[1] = "getIterableType";
                                                    break;
                                                default:
                                                    objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    objArr[1] = "getAnnotationType";
                }
                switch (i) {
                    case 1:
                        objArr[2] = "setBuiltInsModule";
                        break;
                    case 2:
                        objArr[2] = "setPostponedBuiltinsModuleComputation";
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 11:
                    case 13:
                    case 15:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 69:
                    case 74:
                    case 81:
                    case 84:
                    case 86:
                    case 87:
                        break;
                    case 9:
                        objArr[2] = "isBuiltIn";
                        break;
                    case 10:
                        objArr[2] = "isUnderKotlinPackage";
                        break;
                    case 12:
                        objArr[2] = "getBuiltInClassByFqName";
                        break;
                    case 14:
                        objArr[2] = "getBuiltInClassByName";
                        break;
                    case 16:
                        objArr[2] = "getPrimitiveClassDescriptor";
                        break;
                    case 17:
                        objArr[2] = "getPrimitiveArrayClassDescriptor";
                        break;
                    case 47:
                        objArr[2] = "getBuiltInTypeByClassName";
                        break;
                    case 54:
                        objArr[2] = "getPrimitiveKotlinType";
                        break;
                    case 68:
                        objArr[2] = "getArrayElementType";
                        break;
                    case 70:
                        objArr[2] = "getArrayElementTypeOrNull";
                        break;
                    case 71:
                    case 72:
                        objArr[2] = "getElementTypeForUnsignedArray";
                        break;
                    case 73:
                        objArr[2] = "getPrimitiveArrayKotlinType";
                        break;
                    case 75:
                        objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                        break;
                    case 76:
                    case 93:
                        objArr[2] = "getPrimitiveType";
                        break;
                    case 77:
                        objArr[2] = "getPrimitiveArrayType";
                        break;
                    case 78:
                    case 79:
                    case 80:
                    case 82:
                    case 83:
                        objArr[2] = "getArrayType";
                        break;
                    case 85:
                        objArr[2] = "getEnumType";
                        break;
                    case 88:
                        objArr[2] = "isArray";
                        break;
                    case 89:
                    case 90:
                        objArr[2] = "isArrayOrPrimitiveArray";
                        break;
                    case 91:
                        objArr[2] = "isPrimitiveArray";
                        break;
                    case 92:
                        objArr[2] = "getPrimitiveArrayElementType";
                        break;
                    case 94:
                        objArr[2] = "isPrimitiveType";
                        break;
                    case 95:
                        objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                        break;
                    case 96:
                        objArr[2] = "isPrimitiveClass";
                        break;
                    case 97:
                    case 98:
                    case 99:
                    case 100:
                        objArr[2] = "isConstructedFromGivenClass";
                        break;
                    case 101:
                    case 102:
                        objArr[2] = "isTypeConstructorForGivenClass";
                        break;
                    case 103:
                    case 104:
                        objArr[2] = "classFqNameEquals";
                        break;
                    case 105:
                    case 106:
                        objArr[2] = "isNotNullConstructedFromGivenClass";
                        break;
                    case 107:
                        objArr[2] = "isSpecialClassWithNoSupertypes";
                        break;
                    case 108:
                    case 109:
                        objArr[2] = "isAny";
                        break;
                    case 110:
                    case 112:
                        objArr[2] = "isBoolean";
                        break;
                    case 111:
                        objArr[2] = "isBooleanOrNullableBoolean";
                        break;
                    case 113:
                        objArr[2] = "isNumber";
                        break;
                    case 114:
                        objArr[2] = "isChar";
                        break;
                    case 115:
                        objArr[2] = "isCharOrNullableChar";
                        break;
                    case 116:
                        objArr[2] = "isInt";
                        break;
                    case 117:
                        objArr[2] = "isByte";
                        break;
                    case 118:
                        objArr[2] = "isLong";
                        break;
                    case 119:
                        objArr[2] = "isLongOrNullableLong";
                        break;
                    case 120:
                        objArr[2] = "isShort";
                        break;
                    case 121:
                        objArr[2] = "isFloat";
                        break;
                    case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                        objArr[2] = "isFloatOrNullableFloat";
                        break;
                    case SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE:
                        objArr[2] = "isDouble";
                        break;
                    case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                        objArr[2] = "isUByte";
                        break;
                    case 125:
                        objArr[2] = "isUShort";
                        break;
                    case SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE:
                        objArr[2] = "isUInt";
                        break;
                    case 127:
                        objArr[2] = "isULong";
                        break;
                    case 128:
                        objArr[2] = "isUByteArray";
                        break;
                    case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                        objArr[2] = "isUShortArray";
                        break;
                    case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                        objArr[2] = "isUIntArray";
                        break;
                    case 131:
                        objArr[2] = "isULongArray";
                        break;
                    case SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE:
                        objArr[2] = "isUnsignedArrayType";
                        break;
                    case SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE:
                        objArr[2] = "isDoubleOrNullableDouble";
                        break;
                    case SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE:
                    case SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE:
                        objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                        break;
                    case 136:
                        objArr[2] = "isNothing";
                        break;
                    case SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE:
                        objArr[2] = "isNullableNothing";
                        break;
                    case SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE:
                        objArr[2] = "isNothingOrNullableNothing";
                        break;
                    case SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE:
                        objArr[2] = "isAnyOrNullableAny";
                        break;
                    case 140:
                        objArr[2] = "isNullableAny";
                        break;
                    case SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE:
                        objArr[2] = "isDefaultBound";
                        break;
                    case SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE:
                        objArr[2] = "isUnit";
                        break;
                    case SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE:
                        objArr[2] = "mayReturnNonUnitValue";
                        break;
                    case 144:
                        objArr[2] = "isUnitOrNullableUnit";
                        break;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE:
                        objArr[2] = "isBooleanOrSubtype";
                        break;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE:
                        objArr[2] = "isMemberOfAny";
                        break;
                    case 147:
                    case SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE:
                        objArr[2] = "isEnum";
                        break;
                    case SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE:
                    case 150:
                        objArr[2] = "isComparable";
                        break;
                    case 151:
                        objArr[2] = "isCollectionOrNullableCollection";
                        break;
                    case SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE:
                        objArr[2] = "isListOrNullableList";
                        break;
                    case 153:
                        objArr[2] = "isSetOrNullableSet";
                        break;
                    case SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE:
                        objArr[2] = "isMapOrNullableMap";
                        break;
                    case SDK_ASSET_ILLUSTRATION_MANAGE_CONNECTIONS_VALUE:
                        objArr[2] = "isIterableOrNullableIterable";
                        break;
                    case SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_CENTERED_VALUE:
                        objArr[2] = "isThrowableOrNullableThrowable";
                        break;
                    case SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE:
                        objArr[2] = "isThrowable";
                        break;
                    case SDK_ASSET_ILLUSTRATION_WALLET_VALUE:
                        objArr[2] = "isKClass";
                        break;
                    case SDK_ASSET_ILLUSTRATION_INCOME_VALUE:
                        objArr[2] = "isNonPrimitiveArray";
                        break;
                    case SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE:
                        objArr[2] = "isDeprecated";
                        break;
                    case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE:
                        objArr[2] = "isNotNullOrNullableFunctionSupertype";
                        break;
                    default:
                        objArr[2] = "<init>";
                        break;
                }
                String format2 = String.format(str, objArr);
                if (i != 11 && i != 13 && i != 15 && i != 69 && i != 74 && i != 81 && i != 84 && i != 86 && i != 87) {
                    switch (i) {
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            break;
                        default:
                            switch (i) {
                                case 18:
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                case 35:
                                case 36:
                                case 37:
                                case 38:
                                case 39:
                                case 40:
                                case 41:
                                case 42:
                                case 43:
                                case 44:
                                case 45:
                                case 46:
                                    break;
                                default:
                                    switch (i) {
                                        case 48:
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                            break;
                                        default:
                                            switch (i) {
                                                case 55:
                                                case 56:
                                                case 57:
                                                case 58:
                                                case 59:
                                                case 60:
                                                case 61:
                                                case 62:
                                                case 63:
                                                case 64:
                                                case 65:
                                                case 66:
                                                case 67:
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException(format2);
                                            }
                                    }
                            }
                    }
                }
                throw new IllegalStateException(format2);
            }
            i2 = 2;
            Object[] objArr2 = new Object[i2];
            switch (i) {
            }
            if (i != 11) {
            }
            switch (i) {
            }
            String format22 = String.format(str, objArr2);
            if (i != 11) {
                switch (i) {
                }
            }
            throw new IllegalStateException(format22);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i != 11) {
            switch (i) {
            }
            Object[] objArr22 = new Object[i2];
            switch (i) {
            }
            if (i != 11) {
            }
            switch (i) {
            }
            String format222 = String.format(str, objArr22);
            if (i != 11) {
            }
            throw new IllegalStateException(format222);
        }
        i2 = 2;
        Object[] objArr222 = new Object[i2];
        switch (i) {
        }
        if (i != 11) {
        }
        switch (i) {
        }
        String format2222 = String.format(str, objArr222);
        if (i != 11) {
        }
        throw new IllegalStateException(format2222);
    }

    public KotlinBuiltIns(StorageManager storageManager) {
        final int i = 0;
        if (storageManager == null) {
            $$$reportNull$$$0(0);
            throw null;
        }
        this.storageManager = storageManager;
        this.builtInPackagesImportedByDefault = storageManager.createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.1
            public final /* synthetic */ KotlinBuiltIns this$0;

            {
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                KotlinBuiltIns kotlinBuiltIns = this.this$0;
                switch (i2) {
                    case 0:
                        return Arrays.asList(kotlinBuiltIns.getBuiltInsModule().getPackage(StandardNames.BUILT_INS_PACKAGE_FQ_NAME), kotlinBuiltIns.getBuiltInsModule().getPackage(StandardNames.COLLECTIONS_PACKAGE_FQ_NAME), kotlinBuiltIns.getBuiltInsModule().getPackage(StandardNames.RANGES_PACKAGE_FQ_NAME), kotlinBuiltIns.getBuiltInsModule().getPackage(StandardNames.ANNOTATION_PACKAGE_FQ_NAME));
                    default:
                        EnumMap enumMap = new EnumMap(PrimitiveType.class);
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        for (PrimitiveType primitiveType : PrimitiveType.values()) {
                            String asString = primitiveType.getTypeName().asString();
                            if (asString == null) {
                                KotlinBuiltIns.$$$reportNull$$$0(47);
                                throw null;
                            }
                            Name name = KotlinBuiltIns.BUILTINS_MODULE_NAME;
                            SimpleType defaultType = kotlinBuiltIns.getBuiltInClassByName(asString).getDefaultType();
                            if (defaultType == null) {
                                KotlinBuiltIns.$$$reportNull$$$0(48);
                                throw null;
                            }
                            String asString2 = primitiveType.getArrayTypeName().asString();
                            if (asString2 == null) {
                                KotlinBuiltIns.$$$reportNull$$$0(47);
                                throw null;
                            }
                            SimpleType defaultType2 = kotlinBuiltIns.getBuiltInClassByName(asString2).getDefaultType();
                            if (defaultType2 == null) {
                                KotlinBuiltIns.$$$reportNull$$$0(48);
                                throw null;
                            }
                            enumMap.put((EnumMap) primitiveType, (PrimitiveType) defaultType2);
                            hashMap.put(defaultType, defaultType2);
                            hashMap2.put(defaultType2, defaultType);
                        }
                        return new Primitives(enumMap, hashMap, hashMap2);
                }
            }
        });
        final int i2 = 1;
        this.primitives = storageManager.createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.1
            public final /* synthetic */ KotlinBuiltIns this$0;

            {
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                KotlinBuiltIns kotlinBuiltIns = this.this$0;
                switch (i22) {
                    case 0:
                        return Arrays.asList(kotlinBuiltIns.getBuiltInsModule().getPackage(StandardNames.BUILT_INS_PACKAGE_FQ_NAME), kotlinBuiltIns.getBuiltInsModule().getPackage(StandardNames.COLLECTIONS_PACKAGE_FQ_NAME), kotlinBuiltIns.getBuiltInsModule().getPackage(StandardNames.RANGES_PACKAGE_FQ_NAME), kotlinBuiltIns.getBuiltInsModule().getPackage(StandardNames.ANNOTATION_PACKAGE_FQ_NAME));
                    default:
                        EnumMap enumMap = new EnumMap(PrimitiveType.class);
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        for (PrimitiveType primitiveType : PrimitiveType.values()) {
                            String asString = primitiveType.getTypeName().asString();
                            if (asString == null) {
                                KotlinBuiltIns.$$$reportNull$$$0(47);
                                throw null;
                            }
                            Name name = KotlinBuiltIns.BUILTINS_MODULE_NAME;
                            SimpleType defaultType = kotlinBuiltIns.getBuiltInClassByName(asString).getDefaultType();
                            if (defaultType == null) {
                                KotlinBuiltIns.$$$reportNull$$$0(48);
                                throw null;
                            }
                            String asString2 = primitiveType.getArrayTypeName().asString();
                            if (asString2 == null) {
                                KotlinBuiltIns.$$$reportNull$$$0(47);
                                throw null;
                            }
                            SimpleType defaultType2 = kotlinBuiltIns.getBuiltInClassByName(asString2).getDefaultType();
                            if (defaultType2 == null) {
                                KotlinBuiltIns.$$$reportNull$$$0(48);
                                throw null;
                            }
                            enumMap.put((EnumMap) primitiveType, (PrimitiveType) defaultType2);
                            hashMap.put(defaultType, defaultType2);
                            hashMap2.put(defaultType2, defaultType);
                        }
                        return new Primitives(enumMap, hashMap, hashMap2);
                }
            }
        });
        this.builtInClassesByName = storageManager.createMemoizedFunction(new AnonymousClass3(this, i));
    }

    public static boolean classFqNameEquals(ClassDescriptor classDescriptor, FqNameUnsafe fqNameUnsafe) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(103);
            throw null;
        }
        if (fqNameUnsafe != null) {
            return classDescriptor.getName().equals(fqNameUnsafe.shortName()) && fqNameUnsafe.equals(DescriptorUtils.getFqName(classDescriptor));
        }
        $$$reportNull$$$0(104);
        throw null;
    }

    public static PrimitiveType getPrimitiveArrayElementType(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(92);
            throw null;
        }
        ClassifierDescriptor mo4153getDeclarationDescriptor = kotlinType.getConstructor().mo4153getDeclarationDescriptor();
        if (mo4153getDeclarationDescriptor == null) {
            return null;
        }
        return getPrimitiveArrayType(mo4153getDeclarationDescriptor);
    }

    public static PrimitiveType getPrimitiveArrayType(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(77);
            throw null;
        }
        if (StandardNames.FqNames.primitiveArrayTypeShortNames.contains(declarationDescriptor.getName())) {
            return StandardNames.FqNames.arrayClassFqNameToPrimitiveType.get(DescriptorUtils.getFqName(declarationDescriptor));
        }
        return null;
    }

    public static PrimitiveType getPrimitiveType(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(76);
            throw null;
        }
        if (StandardNames.FqNames.primitiveTypeShortNames.contains(declarationDescriptor.getName())) {
            return StandardNames.FqNames.fqNameToPrimitiveType.get(DescriptorUtils.getFqName(declarationDescriptor));
        }
        return null;
    }

    public static boolean isAny(ClassDescriptor classDescriptor) {
        if (classDescriptor != null) {
            return classFqNameEquals(classDescriptor, StandardNames.FqNames.any);
        }
        $$$reportNull$$$0(108);
        throw null;
    }

    public static boolean isAnyOrNullableAny(KotlinType kotlinType) {
        if (kotlinType != null) {
            return isConstructedFromGivenClass(kotlinType, StandardNames.FqNames.any);
        }
        $$$reportNull$$$0(EnumC0170g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE);
        throw null;
    }

    public static boolean isArray(KotlinType kotlinType) {
        if (kotlinType != null) {
            return isConstructedFromGivenClass(kotlinType, StandardNames.FqNames.f1524array);
        }
        $$$reportNull$$$0(88);
        throw null;
    }

    public static boolean isArrayOrPrimitiveArray(ClassDescriptor classDescriptor) {
        if (classDescriptor != null) {
            return classFqNameEquals(classDescriptor, StandardNames.FqNames.f1524array) || getPrimitiveArrayType(classDescriptor) != null;
        }
        $$$reportNull$$$0(89);
        throw null;
    }

    public static boolean isBoolean(KotlinType kotlinType) {
        if (kotlinType != null) {
            return isConstructedFromGivenClassAndNotNullable(kotlinType, StandardNames.FqNames._boolean);
        }
        $$$reportNull$$$0(110);
        throw null;
    }

    public static boolean isBuiltIn(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor != null) {
            return DescriptorUtils.getParentOfType(declarationDescriptor, BuiltInsPackageFragment.class, false) != null;
        }
        $$$reportNull$$$0(9);
        throw null;
    }

    public static boolean isConstructedFromGivenClass(KotlinType kotlinType, FqNameUnsafe fqNameUnsafe) {
        if (kotlinType == null) {
            $$$reportNull$$$0(97);
            throw null;
        }
        if (fqNameUnsafe != null) {
            return isTypeConstructorForGivenClass(kotlinType.getConstructor(), fqNameUnsafe);
        }
        $$$reportNull$$$0(98);
        throw null;
    }

    public static boolean isConstructedFromGivenClassAndNotNullable(KotlinType kotlinType, FqNameUnsafe fqNameUnsafe) {
        if (kotlinType == null) {
            $$$reportNull$$$0(EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE);
            throw null;
        }
        if (fqNameUnsafe != null) {
            return isConstructedFromGivenClass(kotlinType, fqNameUnsafe) && !kotlinType.isMarkedNullable();
        }
        $$$reportNull$$$0(EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE);
        throw null;
    }

    public static boolean isDefaultBound(KotlinType kotlinType) {
        if (kotlinType != null) {
            return isNullableAny(kotlinType);
        }
        $$$reportNull$$$0(EnumC0170g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE);
        throw null;
    }

    public static boolean isDeprecated(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
            throw null;
        }
        if (declarationDescriptor.getOriginal().getAnnotations().hasAnnotation(StandardNames.FqNames.deprecated)) {
            return true;
        }
        if (!(declarationDescriptor instanceof PropertyDescriptor)) {
            return false;
        }
        PropertyDescriptor propertyDescriptor = (PropertyDescriptor) declarationDescriptor;
        boolean isVar = propertyDescriptor.isVar();
        PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
        PropertySetterDescriptor setter = propertyDescriptor.getSetter();
        if (getter == null || !isDeprecated(getter)) {
            return false;
        }
        if (isVar) {
            return setter != null && isDeprecated(setter);
        }
        return true;
    }

    public static boolean isKClass(ClassDescriptor classDescriptor) {
        if (classDescriptor != null) {
            return classFqNameEquals(classDescriptor, StandardNames.FqNames.kClass);
        }
        $$$reportNull$$$0(EnumC0170g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE);
        throw null;
    }

    public static boolean isNotNullConstructedFromGivenClass(KotlinType kotlinType, FqNameUnsafe fqNameUnsafe) {
        if (kotlinType == null) {
            $$$reportNull$$$0(105);
            throw null;
        }
        if (fqNameUnsafe != null) {
            return !kotlinType.isMarkedNullable() && isConstructedFromGivenClass(kotlinType, fqNameUnsafe);
        }
        $$$reportNull$$$0(106);
        throw null;
    }

    public static boolean isNothing(KotlinType kotlinType) {
        if (kotlinType != null) {
            return isNothingOrNullableNothing(kotlinType) && !TypeUtils.isNullableType(kotlinType);
        }
        $$$reportNull$$$0(136);
        throw null;
    }

    public static boolean isNothingOrNullableNothing(KotlinType kotlinType) {
        if (kotlinType != null) {
            return isConstructedFromGivenClass(kotlinType, StandardNames.FqNames.nothing);
        }
        $$$reportNull$$$0(EnumC0170g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE);
        throw null;
    }

    public static boolean isNullableAny(KotlinType kotlinType) {
        if (kotlinType != null) {
            return isAnyOrNullableAny(kotlinType) && kotlinType.isMarkedNullable();
        }
        $$$reportNull$$$0(140);
        throw null;
    }

    public static boolean isPrimitiveArray(KotlinType kotlinType) {
        if (kotlinType != null) {
            ClassifierDescriptor mo4153getDeclarationDescriptor = kotlinType.getConstructor().mo4153getDeclarationDescriptor();
            return (mo4153getDeclarationDescriptor == null || getPrimitiveArrayType(mo4153getDeclarationDescriptor) == null) ? false : true;
        }
        $$$reportNull$$$0(91);
        throw null;
    }

    public static boolean isPrimitiveClass(ClassDescriptor classDescriptor) {
        if (classDescriptor != null) {
            return getPrimitiveType(classDescriptor) != null;
        }
        $$$reportNull$$$0(96);
        throw null;
    }

    public static boolean isPrimitiveType(KotlinType kotlinType) {
        if (kotlinType != null) {
            return !kotlinType.isMarkedNullable() && isPrimitiveTypeOrNullablePrimitiveType(kotlinType);
        }
        $$$reportNull$$$0(94);
        throw null;
    }

    public static boolean isPrimitiveTypeOrNullablePrimitiveType(KotlinType kotlinType) {
        if (kotlinType != null) {
            ClassifierDescriptor mo4153getDeclarationDescriptor = kotlinType.getConstructor().mo4153getDeclarationDescriptor();
            return (mo4153getDeclarationDescriptor instanceof ClassDescriptor) && isPrimitiveClass((ClassDescriptor) mo4153getDeclarationDescriptor);
        }
        $$$reportNull$$$0(95);
        throw null;
    }

    public static boolean isSpecialClassWithNoSupertypes(ClassDescriptor classDescriptor) {
        if (classDescriptor != null) {
            return classFqNameEquals(classDescriptor, StandardNames.FqNames.any) || classFqNameEquals(classDescriptor, StandardNames.FqNames.nothing);
        }
        $$$reportNull$$$0(107);
        throw null;
    }

    public static boolean isString(KotlinType kotlinType) {
        return kotlinType != null && isNotNullConstructedFromGivenClass(kotlinType, StandardNames.FqNames.f1525string);
    }

    public static boolean isTypeConstructorForGivenClass(TypeConstructor typeConstructor, FqNameUnsafe fqNameUnsafe) {
        if (typeConstructor == null) {
            $$$reportNull$$$0(101);
            throw null;
        }
        if (fqNameUnsafe != null) {
            ClassifierDescriptor mo4153getDeclarationDescriptor = typeConstructor.mo4153getDeclarationDescriptor();
            return (mo4153getDeclarationDescriptor instanceof ClassDescriptor) && classFqNameEquals((ClassDescriptor) mo4153getDeclarationDescriptor, fqNameUnsafe);
        }
        $$$reportNull$$$0(102);
        throw null;
    }

    public static boolean isUByteArray(KotlinType kotlinType) {
        if (kotlinType != null) {
            return isConstructedFromGivenClassAndNotNullable(kotlinType, StandardNames.FqNames.uByteArrayFqName.toUnsafe());
        }
        $$$reportNull$$$0(128);
        throw null;
    }

    public static boolean isUIntArray(KotlinType kotlinType) {
        if (kotlinType != null) {
            return isConstructedFromGivenClassAndNotNullable(kotlinType, StandardNames.FqNames.uIntArrayFqName.toUnsafe());
        }
        $$$reportNull$$$0(EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
        throw null;
    }

    public static boolean isULongArray(KotlinType kotlinType) {
        if (kotlinType != null) {
            return isConstructedFromGivenClassAndNotNullable(kotlinType, StandardNames.FqNames.uLongArrayFqName.toUnsafe());
        }
        $$$reportNull$$$0(131);
        throw null;
    }

    public static boolean isUShortArray(KotlinType kotlinType) {
        if (kotlinType != null) {
            return isConstructedFromGivenClassAndNotNullable(kotlinType, StandardNames.FqNames.uShortArrayFqName.toUnsafe());
        }
        $$$reportNull$$$0(EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE);
        throw null;
    }

    public static boolean isUnderKotlinPackage(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(10);
            throw null;
        }
        while (declarationDescriptor != null) {
            if (declarationDescriptor instanceof PackageFragmentDescriptor) {
                return ((PackageFragmentDescriptor) declarationDescriptor).getFqName().startsWith(StandardNames.BUILT_INS_PACKAGE_NAME);
            }
            declarationDescriptor = declarationDescriptor.getContainingDeclaration();
        }
        return false;
    }

    public static boolean isUnit(KotlinType kotlinType) {
        if (kotlinType != null) {
            return isNotNullConstructedFromGivenClass(kotlinType, StandardNames.FqNames.unit);
        }
        $$$reportNull$$$0(EnumC0170g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE);
        throw null;
    }

    public static boolean isUnsignedArrayType(KotlinType kotlinType) {
        if (kotlinType != null) {
            return isUByteArray(kotlinType) || isUShortArray(kotlinType) || isUIntArray(kotlinType) || isULongArray(kotlinType);
        }
        $$$reportNull$$$0(EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE);
        throw null;
    }

    public final void createBuiltInsModule(boolean z) {
        ModuleDescriptorImpl moduleDescriptorImpl = new ModuleDescriptorImpl(BUILTINS_MODULE_NAME, this.storageManager, this, null);
        this.builtInsModule = moduleDescriptorImpl;
        moduleDescriptorImpl.initialize(BuiltInsLoader.Companion.getInstance().createPackageFragmentProvider(this.storageManager, this.builtInsModule, getClassDescriptorFactories(), getPlatformDependentDeclarationFilter(), getAdditionalClassPartsProvider(), z));
        ModuleDescriptorImpl moduleDescriptorImpl2 = this.builtInsModule;
        moduleDescriptorImpl2.setDependencies(moduleDescriptorImpl2);
    }

    public AdditionalClassPartsProvider getAdditionalClassPartsProvider() {
        AdditionalClassPartsProvider.None none = AdditionalClassPartsProvider.None.INSTANCE;
        if (none != null) {
            return none;
        }
        $$$reportNull$$$0(3);
        throw null;
    }

    public ClassDescriptor getAny() {
        return getBuiltInClassByName("Any");
    }

    public SimpleType getAnyType() {
        SimpleType defaultType = getAny().getDefaultType();
        if (defaultType != null) {
            return defaultType;
        }
        $$$reportNull$$$0(51);
        throw null;
    }

    public ClassDescriptor getArray() {
        return getBuiltInClassByName("Array");
    }

    public KotlinType getArrayElementType(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(68);
            throw null;
        }
        KotlinType arrayElementTypeOrNull = getArrayElementTypeOrNull(kotlinType);
        if (arrayElementTypeOrNull != null) {
            return arrayElementTypeOrNull;
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1(kotlinType, "not array: ");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public KotlinType getArrayElementTypeOrNull(KotlinType kotlinType) {
        ClassId classId;
        ClassId unsignedClassIdByArrayClassId;
        ClassDescriptor findClassAcrossModuleDependencies;
        SimpleType defaultType;
        if (kotlinType == null) {
            $$$reportNull$$$0(70);
            throw null;
        }
        if (!isArray(kotlinType)) {
            KotlinType makeNotNullable = TypeUtils.makeNotNullable(kotlinType);
            KotlinType kotlinType2 = (KotlinType) ((Primitives) this.primitives.invoke()).kotlinArrayTypeToPrimitiveKotlinType.get(makeNotNullable);
            if (kotlinType2 != null) {
                return kotlinType2;
            }
            ModuleDescriptor containingModuleOrNull = DescriptorUtils.getContainingModuleOrNull(makeNotNullable);
            if (containingModuleOrNull != null) {
                if (makeNotNullable == null) {
                    $$$reportNull$$$0(71);
                    throw null;
                }
                ClassifierDescriptor mo4153getDeclarationDescriptor = makeNotNullable.getConstructor().mo4153getDeclarationDescriptor();
                if (mo4153getDeclarationDescriptor != null) {
                    UnsignedTypes unsignedTypes = UnsignedTypes.INSTANCE;
                    if (unsignedTypes.isShortNameOfUnsignedArray(mo4153getDeclarationDescriptor.getName()) && (classId = DescriptorUtilsKt.getClassId(mo4153getDeclarationDescriptor)) != null && (unsignedClassIdByArrayClassId = unsignedTypes.getUnsignedClassIdByArrayClassId(classId)) != null && (findClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(containingModuleOrNull, unsignedClassIdByArrayClassId)) != null) {
                        defaultType = findClassAcrossModuleDependencies.getDefaultType();
                        if (defaultType == null) {
                            return defaultType;
                        }
                    }
                }
                defaultType = null;
                if (defaultType == null) {
                }
            }
        } else if (kotlinType.getArguments().size() == 1) {
            return kotlinType.getArguments().get(0).getType();
        }
        return null;
    }

    public SimpleType getArrayType(Variance variance, KotlinType kotlinType, Annotations annotations) {
        if (variance == null) {
            $$$reportNull$$$0(78);
            throw null;
        }
        if (kotlinType == null) {
            $$$reportNull$$$0(79);
            throw null;
        }
        if (annotations == null) {
            $$$reportNull$$$0(80);
            throw null;
        }
        SimpleType simpleNotNullType = KotlinTypeFactory.simpleNotNullType(TypeAttributesKt.toDefaultAttributes(annotations), getArray(), Collections.singletonList(new TypeProjectionImpl(variance, kotlinType)));
        if (simpleNotNullType != null) {
            return simpleNotNullType;
        }
        $$$reportNull$$$0(81);
        throw null;
    }

    public SimpleType getBooleanType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.BOOLEAN);
        if (primitiveKotlinType != null) {
            return primitiveKotlinType;
        }
        $$$reportNull$$$0(64);
        throw null;
    }

    public ClassDescriptor getBuiltInClassByFqName(FqName fqName) {
        if (fqName == null) {
            $$$reportNull$$$0(12);
            throw null;
        }
        ClassDescriptor resolveClassByFqName = DescriptorUtilKt.resolveClassByFqName(getBuiltInsModule(), fqName, NoLookupLocation.FROM_BUILTINS);
        if (resolveClassByFqName != null) {
            return resolveClassByFqName;
        }
        $$$reportNull$$$0(13);
        throw null;
    }

    public final ClassDescriptor getBuiltInClassByName(String str) {
        if (str == null) {
            $$$reportNull$$$0(14);
            throw null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) this.builtInClassesByName.invoke(Name.identifier(str));
        if (classDescriptor != null) {
            return classDescriptor;
        }
        $$$reportNull$$$0(15);
        throw null;
    }

    public ModuleDescriptorImpl getBuiltInsModule() {
        this.builtInsModule.getClass();
        ModuleDescriptorImpl moduleDescriptorImpl = this.builtInsModule;
        if (moduleDescriptorImpl != null) {
            return moduleDescriptorImpl;
        }
        $$$reportNull$$$0(7);
        throw null;
    }

    public MemberScope getBuiltInsPackageScope() {
        MemberScope memberScope = getBuiltInsModule().getPackage(StandardNames.BUILT_INS_PACKAGE_FQ_NAME).getMemberScope();
        if (memberScope != null) {
            return memberScope;
        }
        $$$reportNull$$$0(11);
        throw null;
    }

    public SimpleType getByteType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.BYTE);
        if (primitiveKotlinType != null) {
            return primitiveKotlinType;
        }
        $$$reportNull$$$0(57);
        throw null;
    }

    public SimpleType getCharType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.CHAR);
        if (primitiveKotlinType != null) {
            return primitiveKotlinType;
        }
        $$$reportNull$$$0(63);
        throw null;
    }

    public Iterable getClassDescriptorFactories() {
        List singletonList = Collections.singletonList(new BuiltInFictitiousFunctionClassFactory(this.storageManager, getBuiltInsModule()));
        if (singletonList != null) {
            return singletonList;
        }
        $$$reportNull$$$0(5);
        throw null;
    }

    public ClassDescriptor getCollection() {
        ClassDescriptor builtInClassByFqName = getBuiltInClassByFqName(StandardNames.FqNames.collection);
        if (builtInClassByFqName != null) {
            return builtInClassByFqName;
        }
        $$$reportNull$$$0(35);
        throw null;
    }

    public ClassDescriptor getComparable() {
        return getBuiltInClassByName("Comparable");
    }

    public SimpleType getDefaultBound() {
        SimpleType nullableAnyType = getNullableAnyType();
        if (nullableAnyType != null) {
            return nullableAnyType;
        }
        $$$reportNull$$$0(53);
        throw null;
    }

    public SimpleType getDoubleType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.DOUBLE);
        if (primitiveKotlinType != null) {
            return primitiveKotlinType;
        }
        $$$reportNull$$$0(62);
        throw null;
    }

    public SimpleType getFloatType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.FLOAT);
        if (primitiveKotlinType != null) {
            return primitiveKotlinType;
        }
        $$$reportNull$$$0(61);
        throw null;
    }

    public ClassDescriptor getFunction(int i) {
        return getBuiltInClassByName(StandardNames.getFunctionName(i));
    }

    public SimpleType getIntType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.INT);
        if (primitiveKotlinType != null) {
            return primitiveKotlinType;
        }
        $$$reportNull$$$0(59);
        throw null;
    }

    public ClassDescriptor getKClass() {
        ClassDescriptor builtInClassByFqName = getBuiltInClassByFqName(StandardNames.FqNames.kClass.toSafe());
        if (builtInClassByFqName != null) {
            return builtInClassByFqName;
        }
        $$$reportNull$$$0(21);
        throw null;
    }

    public SimpleType getLongType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.LONG);
        if (primitiveKotlinType != null) {
            return primitiveKotlinType;
        }
        $$$reportNull$$$0(60);
        throw null;
    }

    public ClassDescriptor getNothing() {
        return getBuiltInClassByName("Nothing");
    }

    public SimpleType getNothingType() {
        SimpleType defaultType = getNothing().getDefaultType();
        if (defaultType != null) {
            return defaultType;
        }
        $$$reportNull$$$0(49);
        throw null;
    }

    public SimpleType getNullableAnyType() {
        SimpleType makeNullableAsSpecified = getAnyType().makeNullableAsSpecified(true);
        if (makeNullableAsSpecified != null) {
            return makeNullableAsSpecified;
        }
        $$$reportNull$$$0(52);
        throw null;
    }

    public SimpleType getNullableNothingType() {
        SimpleType makeNullableAsSpecified = getNothingType().makeNullableAsSpecified(true);
        if (makeNullableAsSpecified != null) {
            return makeNullableAsSpecified;
        }
        $$$reportNull$$$0(50);
        throw null;
    }

    public ClassDescriptor getNumber() {
        return getBuiltInClassByName("Number");
    }

    public SimpleType getNumberType() {
        SimpleType defaultType = getNumber().getDefaultType();
        if (defaultType != null) {
            return defaultType;
        }
        $$$reportNull$$$0(56);
        throw null;
    }

    public PlatformDependentDeclarationFilter getPlatformDependentDeclarationFilter() {
        PlatformDependentDeclarationFilter.NoPlatformDependent noPlatformDependent = PlatformDependentDeclarationFilter.NoPlatformDependent.INSTANCE;
        if (noPlatformDependent != null) {
            return noPlatformDependent;
        }
        $$$reportNull$$$0(4);
        throw null;
    }

    public SimpleType getPrimitiveArrayKotlinType(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            $$$reportNull$$$0(73);
            throw null;
        }
        SimpleType simpleType = (SimpleType) ((Primitives) this.primitives.invoke()).primitiveTypeToArrayKotlinType.get(primitiveType);
        if (simpleType != null) {
            return simpleType;
        }
        $$$reportNull$$$0(74);
        throw null;
    }

    public SimpleType getPrimitiveKotlinType(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            $$$reportNull$$$0(54);
            throw null;
        }
        if (primitiveType == null) {
            $$$reportNull$$$0(16);
            throw null;
        }
        SimpleType defaultType = getBuiltInClassByName(primitiveType.getTypeName().asString()).getDefaultType();
        if (defaultType != null) {
            return defaultType;
        }
        $$$reportNull$$$0(55);
        throw null;
    }

    public SimpleType getShortType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.SHORT);
        if (primitiveKotlinType != null) {
            return primitiveKotlinType;
        }
        $$$reportNull$$$0(58);
        throw null;
    }

    public ClassDescriptor getString() {
        return getBuiltInClassByName("String");
    }

    public SimpleType getStringType() {
        SimpleType defaultType = getString().getDefaultType();
        if (defaultType != null) {
            return defaultType;
        }
        $$$reportNull$$$0(66);
        throw null;
    }

    public ClassDescriptor getSuspendFunction(int i) {
        ClassDescriptor builtInClassByFqName = getBuiltInClassByFqName(StandardNames.COROUTINES_PACKAGE_FQ_NAME.child(Name.identifier(StandardNames.getSuspendFunctionName(i))));
        if (builtInClassByFqName != null) {
            return builtInClassByFqName;
        }
        $$$reportNull$$$0(18);
        throw null;
    }

    public ClassDescriptor getUnit() {
        return getBuiltInClassByName("Unit");
    }

    public SimpleType getUnitType() {
        SimpleType defaultType = getUnit().getDefaultType();
        if (defaultType != null) {
            return defaultType;
        }
        $$$reportNull$$$0(65);
        throw null;
    }

    public void setBuiltInsModule(ModuleDescriptorImpl moduleDescriptorImpl) {
        if (moduleDescriptorImpl == null) {
            $$$reportNull$$$0(1);
            throw null;
        }
        this.storageManager.compute(new KClassImpl$Data$$Lambda$22(this, moduleDescriptorImpl));
    }

    public static boolean isArrayOrPrimitiveArray(KotlinType kotlinType) {
        if (kotlinType != null) {
            return isArray(kotlinType) || isPrimitiveArray(kotlinType);
        }
        $$$reportNull$$$0(90);
        throw null;
    }

    public SimpleType getArrayType(Variance variance, KotlinType kotlinType) {
        if (variance == null) {
            $$$reportNull$$$0(82);
            throw null;
        }
        if (kotlinType != null) {
            SimpleType arrayType = getArrayType(variance, kotlinType, Annotations.Companion.getEMPTY());
            if (arrayType != null) {
                return arrayType;
            }
            $$$reportNull$$$0(84);
            throw null;
        }
        $$$reportNull$$$0(83);
        throw null;
    }
}
