package kotlin.reflect.jvm.internal.impl.name;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes3.dex */
public final class FqNamesUtilKt {

    /* loaded from: classes9.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                State state = State.BEGINNING;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                State state2 = State.BEGINNING;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                State state3 = State.BEGINNING;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final <V> V findValueForMostSpecificFqname(FqName fqName, Map<FqName, ? extends V> map) {
        Object next;
        fqName.getClass();
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<FqName, ? extends V> entry : map.entrySet()) {
            FqName key = entry.getKey();
            if (Intrinsics.areEqual(fqName, key) || isChildOf(fqName, key)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int length = tail((FqName) ((Map.Entry) next).getKey(), fqName).asString().length();
                do {
                    Object next2 = it.next();
                    int length2 = tail((FqName) ((Map.Entry) next2).getKey(), fqName).asString().length();
                    if (length > length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 != null) {
            return (V) entry2.getValue();
        }
        return null;
    }

    public static final boolean isChildOf(FqName fqName, FqName fqName2) {
        fqName.getClass();
        fqName2.getClass();
        return Intrinsics.areEqual(parentOrNull(fqName), fqName2);
    }

    public static final boolean isSubpackageOf(FqName fqName, FqName fqName2) {
        fqName.getClass();
        fqName2.getClass();
        if (fqName.equals(fqName2) || fqName2.isRoot()) {
            return true;
        }
        String asString = fqName.asString();
        String asString2 = fqName2.asString();
        return StringsKt__StringsJVMKt.startsWith(asString, asString2, false) && asString.charAt(asString2.length()) == '.';
    }

    public static final boolean isValidJavaFqName(String str) {
        if (str == null) {
            return false;
        }
        State state = State.BEGINNING;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            int ordinal = state.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    if (charAt == '.') {
                        state = State.AFTER_DOT;
                    } else if (!Character.isJavaIdentifierPart(charAt)) {
                        return false;
                    }
                } else if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return false;
                }
            }
            if (!Character.isJavaIdentifierStart(charAt)) {
                return false;
            }
            state = State.MIDDLE;
        }
        return state != State.AFTER_DOT;
    }

    public static final FqName parentOrNull(FqName fqName) {
        fqName.getClass();
        if (fqName.isRoot()) {
            return null;
        }
        return fqName.parent();
    }

    public static final FqName tail(FqName fqName, FqName fqName2) {
        fqName.getClass();
        fqName2.getClass();
        return (!isSubpackageOf(fqName, fqName2) || fqName2.isRoot()) ? fqName : Intrinsics.areEqual(fqName, fqName2) ? FqName.ROOT : new FqName(fqName.asString().substring(fqName2.asString().length() + 1));
    }
}
