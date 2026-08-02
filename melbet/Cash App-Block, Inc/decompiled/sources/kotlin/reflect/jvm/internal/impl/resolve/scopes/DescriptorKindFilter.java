package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class DescriptorKindFilter {
    public static final DescriptorKindFilter ALL;
    public static final int ALL_KINDS_MASK;
    public static final DescriptorKindFilter CALLABLES;
    public static final DescriptorKindFilter CLASSIFIERS;
    public static final int CLASSIFIERS_MASK;
    public static final Companion Companion;
    public static final ArrayList DEBUG_MASK_BIT_NAMES;
    public static final ArrayList DEBUG_PREDEFINED_FILTERS_MASK_NAMES;
    public static final DescriptorKindFilter FUNCTIONS;
    public static final int FUNCTIONS_MASK;
    public static final DescriptorKindFilter NON_SINGLETON_CLASSIFIERS;
    public static final int NON_SINGLETON_CLASSIFIERS_MASK;
    public static final DescriptorKindFilter PACKAGES;
    public static final int PACKAGES_MASK;
    public static final DescriptorKindFilter SINGLETON_CLASSIFIERS;
    public static final int SINGLETON_CLASSIFIERS_MASK;
    public static final DescriptorKindFilter TYPE_ALIASES;
    public static final int TYPE_ALIASES_MASK;
    public static final DescriptorKindFilter VALUES;
    public static final DescriptorKindFilter VARIABLES;
    public static final int VARIABLES_MASK;
    public static int nextMaskValue;
    public final List excludes;
    public final int kindMask;

    public static final class Companion {

        public final class MaskToName {
            public final int mask;
            public final String name;

            public MaskToName(int i, String str) {
                str.getClass();
                this.mask = i;
                this.name = str;
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static final int access$nextMask(Companion companion) {
            companion.getClass();
            int i = DescriptorKindFilter.nextMaskValue;
            DescriptorKindFilter.nextMaskValue <<= 1;
            return i;
        }

        public final int getALL_KINDS_MASK() {
            return DescriptorKindFilter.ALL_KINDS_MASK;
        }

        public final int getCLASSIFIERS_MASK() {
            return DescriptorKindFilter.CLASSIFIERS_MASK;
        }

        public final int getFUNCTIONS_MASK() {
            return DescriptorKindFilter.FUNCTIONS_MASK;
        }

        public final int getNON_SINGLETON_CLASSIFIERS_MASK() {
            return DescriptorKindFilter.NON_SINGLETON_CLASSIFIERS_MASK;
        }

        public final int getPACKAGES_MASK() {
            return DescriptorKindFilter.PACKAGES_MASK;
        }

        public final int getSINGLETON_CLASSIFIERS_MASK() {
            return DescriptorKindFilter.SINGLETON_CLASSIFIERS_MASK;
        }

        public final int getTYPE_ALIASES_MASK() {
            return DescriptorKindFilter.TYPE_ALIASES_MASK;
        }

        public final int getVARIABLES_MASK() {
            return DescriptorKindFilter.VARIABLES_MASK;
        }
    }

    static {
        Companion.MaskToName maskToName;
        Companion.MaskToName maskToName2;
        Companion companion = new Companion(null);
        Companion = companion;
        nextMaskValue = 1;
        int access$nextMask = Companion.access$nextMask(companion);
        NON_SINGLETON_CLASSIFIERS_MASK = access$nextMask;
        int access$nextMask2 = Companion.access$nextMask(companion);
        SINGLETON_CLASSIFIERS_MASK = access$nextMask2;
        int access$nextMask3 = Companion.access$nextMask(companion);
        TYPE_ALIASES_MASK = access$nextMask3;
        int access$nextMask4 = Companion.access$nextMask(companion);
        PACKAGES_MASK = access$nextMask4;
        int access$nextMask5 = Companion.access$nextMask(companion);
        FUNCTIONS_MASK = access$nextMask5;
        int access$nextMask6 = Companion.access$nextMask(companion);
        VARIABLES_MASK = access$nextMask6;
        int access$nextMask7 = Companion.access$nextMask(companion) - 1;
        ALL_KINDS_MASK = access$nextMask7;
        int i = access$nextMask | access$nextMask2 | access$nextMask3;
        CLASSIFIERS_MASK = i;
        ALL = new DescriptorKindFilter(access$nextMask7, null, 2, null);
        CALLABLES = new DescriptorKindFilter(access$nextMask5 | access$nextMask6, null, 2, null);
        NON_SINGLETON_CLASSIFIERS = new DescriptorKindFilter(access$nextMask, null, 2, null);
        SINGLETON_CLASSIFIERS = new DescriptorKindFilter(access$nextMask2, null, 2, null);
        TYPE_ALIASES = new DescriptorKindFilter(access$nextMask3, null, 2, null);
        CLASSIFIERS = new DescriptorKindFilter(i, null, 2, null);
        PACKAGES = new DescriptorKindFilter(access$nextMask4, null, 2, null);
        FUNCTIONS = new DescriptorKindFilter(access$nextMask5, null, 2, null);
        VARIABLES = new DescriptorKindFilter(access$nextMask6, null, 2, null);
        VALUES = new DescriptorKindFilter(access$nextMask2 | access$nextMask5 | access$nextMask6, null, 2, null);
        Field[] fields = DescriptorKindFilter.class.getFields();
        fields.getClass();
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            DescriptorKindFilter descriptorKindFilter = obj instanceof DescriptorKindFilter ? (DescriptorKindFilter) obj : null;
            if (descriptorKindFilter != null) {
                int i2 = descriptorKindFilter.kindMask;
                String name = field2.getName();
                name.getClass();
                maskToName2 = new Companion.MaskToName(i2, name);
            } else {
                maskToName2 = null;
            }
            if (maskToName2 != null) {
                arrayList2.add(maskToName2);
            }
        }
        DEBUG_PREDEFINED_FILTERS_MASK_NAMES = arrayList2;
        Field[] fields2 = DescriptorKindFilter.class.getFields();
        fields2.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (Intrinsics.areEqual(((Field) next).getType(), Integer.TYPE)) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Field field4 = (Field) it3.next();
            Object obj2 = field4.get(null);
            obj2.getClass();
            int intValue = ((Integer) obj2).intValue();
            if (intValue == ((-intValue) & intValue)) {
                String name2 = field4.getName();
                name2.getClass();
                maskToName = new Companion.MaskToName(intValue, name2);
            } else {
                maskToName = null;
            }
            if (maskToName != null) {
                arrayList5.add(maskToName);
            }
        }
        DEBUG_MASK_BIT_NAMES = arrayList5;
    }

    public DescriptorKindFilter(int i, List<? extends DescriptorKindExclude> list) {
        list.getClass();
        this.excludes = list;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            i &= ~((DescriptorKindExclude) it.next()).getFullyExcludedDescriptorKinds();
        }
        this.kindMask = i;
    }

    public final boolean acceptsKinds(int i) {
        return (this.kindMask & i) != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!DescriptorKindFilter.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        DescriptorKindFilter descriptorKindFilter = (DescriptorKindFilter) obj;
        return Intrinsics.areEqual(this.excludes, descriptorKindFilter.excludes) && this.kindMask == descriptorKindFilter.kindMask;
    }

    public final List<DescriptorKindExclude> getExcludes() {
        return this.excludes;
    }

    public final int getKindMask() {
        return this.kindMask;
    }

    public int hashCode() {
        return (this.excludes.hashCode() * 31) + this.kindMask;
    }

    public final DescriptorKindFilter restrictedToKindsOrNull(int i) {
        int i2 = i & this.kindMask;
        if (i2 == 0) {
            return null;
        }
        return new DescriptorKindFilter(i2, this.excludes);
    }

    public String toString() {
        Object obj;
        Iterator it = DEBUG_PREDEFINED_FILTERS_MASK_NAMES.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Companion.MaskToName) obj).mask == this.kindMask) {
                break;
            }
        }
        Companion.MaskToName maskToName = (Companion.MaskToName) obj;
        String str = maskToName != null ? maskToName.name : null;
        if (str == null) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = DEBUG_MASK_BIT_NAMES.iterator();
            while (it2.hasNext()) {
                Companion.MaskToName maskToName2 = (Companion.MaskToName) it2.next();
                String str2 = acceptsKinds(maskToName2.mask) ? maskToName2.name : null;
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            str = CollectionsKt.joinToString$default(arrayList, " | ", null, null, 0, null, null, 62);
        }
        return CameraState$Type$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("DescriptorKindFilter(", str, ", "), this.excludes, ')');
    }

    public DescriptorKindFilter(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? EmptyList.INSTANCE : list);
    }
}
