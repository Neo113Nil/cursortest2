package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Arrays;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* loaded from: classes9.dex */
public final class CharValue extends IntegerValueConstant<Character> {
    public CharValue(char c) {
        super(Character.valueOf(c));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public SimpleType getType(ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        SimpleType charType = moduleDescriptor.getBuiltIns().getCharType();
        charType.getClass();
        return charType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public String toString() {
        String str;
        Integer valueOf = Integer.valueOf(getValue().charValue());
        char charValue = getValue().charValue();
        switch (charValue) {
            case '\b':
                str = "\\b";
                break;
            case '\t':
                str = "\\t";
                break;
            case '\n':
                str = "\\n";
                break;
            case 11:
            default:
                byte type2 = (byte) Character.getType(charValue);
                if (type2 != 0 && type2 != 13 && type2 != 14 && type2 != 15 && type2 != 16 && type2 != 18 && type2 != 19) {
                    str = String.valueOf(charValue);
                    break;
                } else {
                    str = "?";
                    break;
                }
                break;
            case '\f':
                str = "\\f";
                break;
            case '\r':
                str = "\\r";
                break;
        }
        return String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{valueOf, str}, 2));
    }
}
