package com.squareup.util.pseudolocalization;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.extractor.mkv.Sniffer;
import androidx.paging.PagingConfig;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Illustration;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.util.pseudolocalization.annotations.DoNotPseudoLocalize;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KAnnotatedElement;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.DescriptorKCallable;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.ReflectKFunction;
import kotlin.reflect.jvm.internal.ReflectKParameter;
import kotlin.reflect.jvm.internal.ReflectProperties$LazySoftVal;
import kotlin.text.CharsKt;
import org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants;
import papa.PapaEvent;

/* loaded from: classes9.dex */
public abstract class MaybePseudoLocalizeKt {
    public static final Set neverPseudoLocalized;
    public static final Locale pseudoLocale = Locale.forLanguageTag("en-XA");

    static {
        ReflectionFactory reflectionFactory = Reflection.factory;
        neverPseudoLocalized = ArraysKt___ArraysKt.toSet(new KClass[]{reflectionFactory.getOrCreateKotlinClass(Color.class), reflectionFactory.getOrCreateKotlinClass(Icon.class), reflectionFactory.getOrCreateKotlinClass(Illustration.class), reflectionFactory.getOrCreateKotlinClass(Image.class), reflectionFactory.getOrCreateKotlinClass(Money.class)});
    }

    public static final boolean isPseudoLocalizable(KAnnotatedElement kAnnotatedElement) {
        if (CollectionsKt.contains(neverPseudoLocalized, kAnnotatedElement)) {
            return false;
        }
        List annotations = kAnnotatedElement.getAnnotations();
        if ((annotations instanceof Collection) && annotations.isEmpty()) {
            return true;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (PapaEvent.getAnnotationClass((Annotation) it.next()).equals(Reflection.factory.getOrCreateKotlinClass(DoNotPseudoLocalize.class))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:205:0x0284. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:206:0x0287. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.String] */
    public static final Object maybePseudoLocalize(Object obj, Locale locale, Sniffer sniffer) {
        Object obj2;
        Object obj3;
        Object obj4;
        boolean z;
        int i;
        int i2;
        boolean z2;
        int i3;
        int i4;
        boolean z3;
        int i5;
        int i6;
        String str;
        boolean z4;
        Object obj5 = obj;
        Locale locale2 = pseudoLocale;
        if (!locale.equals(locale2)) {
            return obj5;
        }
        if (obj5 instanceof String) {
            String str2 = (String) obj5;
            obj4 = str2;
            if (locale.equals(locale2)) {
                PagingConfig pagingConfig = (PagingConfig) sniffer.scratch;
                String start = pagingConfig.start();
                StringBuilder sb = new StringBuilder();
                int i7 = sniffer.peekLength;
                int length = str2.length();
                int i8 = 0;
                boolean z5 = false;
                int i9 = 0;
                while (i8 < length) {
                    char charAt = str2.charAt(i8);
                    if (z5) {
                        i8++;
                        z5 = false;
                    } else if (charAt == '\'') {
                        i8++;
                        z5 = true;
                    } else {
                        if (charAt == '{') {
                            i7++;
                        } else if (charAt == '}' && i7 != 0) {
                            i7--;
                        }
                        int i10 = sniffer.peekLength;
                        if (i10 != i7 || i8 == length - 1) {
                            boolean z6 = i10 % 2 == 0;
                            int i11 = (!z6 || i7 == i10) ? i8 + 1 : i8;
                            if (i11 - i9 != 0) {
                                String substring = str2.substring(i9, i11);
                                if (z6) {
                                    StringBuilder sb2 = new StringBuilder();
                                    int length2 = substring.length();
                                    boolean z7 = true;
                                    int i12 = 0;
                                    while (i12 < length2) {
                                        char charAt2 = substring.charAt(i12);
                                        boolean z8 = z6;
                                        char c = '%';
                                        if (charAt2 == '%') {
                                            i3 = length;
                                            i4 = i8;
                                            z3 = z5;
                                            int length3 = substring.length();
                                            char charAt3 = substring.charAt(i12);
                                            ?? sb3 = new StringBuilder();
                                            sb3.append(charAt3);
                                            while (true) {
                                                i5 = i12 + 1;
                                                if (i5 < length3) {
                                                    charAt3 = substring.charAt(i5);
                                                    sb3.append(charAt3);
                                                    if (charAt3 != c && charAt3 != 'E' && charAt3 != 'S' && charAt3 != 'X' && charAt3 != 's' && charAt3 != 'x' && charAt3 != 'G' && charAt3 != 'H' && charAt3 != 'n' && charAt3 != 'o') {
                                                        switch (charAt3) {
                                                            case 'A':
                                                            case 'B':
                                                            case 'C':
                                                                break;
                                                            default:
                                                                switch (charAt3) {
                                                                    case 'a':
                                                                    case 'b':
                                                                    case 'c':
                                                                    case 'd':
                                                                    case 'e':
                                                                    case 'f':
                                                                    case 'g':
                                                                    case 'h':
                                                                        break;
                                                                    default:
                                                                        i12 += 2;
                                                                        if (i12 < length3 && charAt3 == 't') {
                                                                            charAt3 = substring.charAt(i12);
                                                                            sb3.append(charAt3);
                                                                            break;
                                                                        } else {
                                                                            i12 = i5;
                                                                            c = '%';
                                                                        }
                                                                        break;
                                                                }
                                                        }
                                                    }
                                                }
                                            }
                                            i12 = i5;
                                            c = '%';
                                            if (charAt3 != c) {
                                                sb3 = pagingConfig.placeholder(sb3.toString());
                                            }
                                            sb2.append((CharSequence) sb3);
                                        } else if (charAt2 == '&' || charAt2 == '<') {
                                            int length4 = substring.length();
                                            char charAt4 = substring.charAt(i12);
                                            i3 = length;
                                            StringBuilder sb4 = new StringBuilder();
                                            i4 = i8;
                                            int i13 = i12;
                                            while (true) {
                                                i6 = i13;
                                                if (i13 >= length4) {
                                                    z3 = z5;
                                                } else if (charAt4 == '&') {
                                                    StringBuilder sb5 = new StringBuilder();
                                                    sb5.append(charAt4);
                                                    z3 = z5;
                                                    int i14 = i6;
                                                    while (true) {
                                                        int i15 = i14 + 1;
                                                        if (i15 < length4) {
                                                            charAt4 = substring.charAt(i15);
                                                            sb5.append(charAt4);
                                                            i14 = i15;
                                                            if (charAt4 == ';') {
                                                                i6 = i14;
                                                            } else if (charAt4 != '#' && ('a' > charAt4 || charAt4 >= '{')) {
                                                                if ('A' > charAt4 || charAt4 >= '[') {
                                                                    if ('0' <= charAt4 && charAt4 < ':') {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    sb4.append((CharSequence) sb5);
                                                    if (sb5.toString().equals("&lt;")) {
                                                        i13 = i6;
                                                        z5 = z3;
                                                    }
                                                } else {
                                                    z3 = z5;
                                                    if (charAt4 == '>') {
                                                        sb4.append('>');
                                                    } else {
                                                        sb4.append(charAt4);
                                                        i13 = i6 + 1;
                                                        if (i13 >= length4) {
                                                            sb2.append(substring.charAt(i12));
                                                        } else {
                                                            charAt4 = substring.charAt(i13);
                                                            z5 = z3;
                                                        }
                                                    }
                                                }
                                            }
                                            i12 = i6;
                                            sb2.append(sb4.toString());
                                        } else {
                                            if (charAt2 == '!') {
                                                str = "¡";
                                            } else if (charAt2 == '$') {
                                                str = "€";
                                            } else if (charAt2 != '?') {
                                                switch (charAt2) {
                                                    case 'A':
                                                        str = "Å";
                                                        break;
                                                    case 'B':
                                                        str = "β";
                                                        break;
                                                    case 'C':
                                                        str = "Ç";
                                                        break;
                                                    case 'D':
                                                        str = "Ð";
                                                        break;
                                                    case 'E':
                                                        str = "É";
                                                        break;
                                                    default:
                                                        switch (charAt2) {
                                                            case 'G':
                                                                str = "Ĝ";
                                                                break;
                                                            case 'H':
                                                                str = "Ĥ";
                                                                break;
                                                            case 'I':
                                                                str = "Î";
                                                                break;
                                                            case 'J':
                                                                str = "Ĵ";
                                                                break;
                                                            case 'K':
                                                                str = "Ķ";
                                                                break;
                                                            case 'L':
                                                                str = "Ļ";
                                                                break;
                                                            case 'M':
                                                                str = "Ḿ";
                                                                break;
                                                            case 'N':
                                                                str = "Ñ";
                                                                break;
                                                            case 'O':
                                                                str = "Ö";
                                                                break;
                                                            case 'P':
                                                                str = "Þ";
                                                                break;
                                                            case 'Q':
                                                                str = "q";
                                                                break;
                                                            case 'R':
                                                                str = "Ŕ";
                                                                break;
                                                            case 'S':
                                                                str = "Š";
                                                                break;
                                                            case 'T':
                                                                str = "Ţ";
                                                                break;
                                                            case 'U':
                                                                str = "Û";
                                                                break;
                                                            case 'V':
                                                                str = "ν";
                                                                break;
                                                            case 'W':
                                                                str = "Ŵ";
                                                                break;
                                                            case 'X':
                                                                str = "×";
                                                                break;
                                                            case 'Y':
                                                                str = "Ý";
                                                                break;
                                                            case 'Z':
                                                                str = "Ž";
                                                                break;
                                                            default:
                                                                switch (charAt2) {
                                                                    case 'a':
                                                                        str = "å";
                                                                        break;
                                                                    case 'b':
                                                                        str = "ɓ";
                                                                        break;
                                                                    case 'c':
                                                                        str = "ç";
                                                                        break;
                                                                    case 'd':
                                                                        str = "ð";
                                                                        break;
                                                                    case 'e':
                                                                        str = "é";
                                                                        break;
                                                                    case 'f':
                                                                        str = "ƒ";
                                                                        break;
                                                                    case 'g':
                                                                        str = "ĝ";
                                                                        break;
                                                                    case 'h':
                                                                        str = "ĥ";
                                                                        break;
                                                                    case 'i':
                                                                        str = "î";
                                                                        break;
                                                                    case 'j':
                                                                        str = "ĵ";
                                                                        break;
                                                                    case 'k':
                                                                        str = "ķ";
                                                                        break;
                                                                    case 'l':
                                                                        str = "ļ";
                                                                        break;
                                                                    case 'm':
                                                                        str = "ḿ";
                                                                        break;
                                                                    case 'n':
                                                                        str = "ñ";
                                                                        break;
                                                                    case 'o':
                                                                        str = "ö";
                                                                        break;
                                                                    case 'p':
                                                                        str = "þ";
                                                                        break;
                                                                    case 'q':
                                                                        str = "Q";
                                                                        break;
                                                                    case 'r':
                                                                        str = "ŕ";
                                                                        break;
                                                                    case 's':
                                                                        str = "š";
                                                                        break;
                                                                    case 't':
                                                                        str = "ţ";
                                                                        break;
                                                                    case 'u':
                                                                        str = "û";
                                                                        break;
                                                                    case 'v':
                                                                        str = GpsTagConstants.GPS_TAG_GPS_STATUS_VALUE_MEASUREMENT_INTEROPERABILITY;
                                                                        break;
                                                                    case 'w':
                                                                        str = "ŵ";
                                                                        break;
                                                                    case 'x':
                                                                        str = "х";
                                                                        break;
                                                                    case 'y':
                                                                        str = "ý";
                                                                        break;
                                                                    case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                                                                        str = "ž";
                                                                        break;
                                                                    default:
                                                                        str = null;
                                                                        break;
                                                                }
                                                        }
                                                }
                                            } else {
                                                str = "¿";
                                            }
                                            if (str != null) {
                                                sb2.append(str);
                                            } else {
                                                boolean isWhitespace = CharsKt.isWhitespace(charAt2);
                                                if (!z7 || isWhitespace) {
                                                    z4 = isWhitespace;
                                                } else {
                                                    z4 = isWhitespace;
                                                    pagingConfig.prefetchDistance++;
                                                }
                                                sb2.append(charAt2);
                                                z7 = z4;
                                            }
                                            pagingConfig.initialLoadSize++;
                                            i3 = length;
                                            i4 = i8;
                                            z3 = z5;
                                        }
                                        i12++;
                                        z6 = z8;
                                        length = i3;
                                        i8 = i4;
                                        z5 = z3;
                                    }
                                    z = z6;
                                    i = length;
                                    i2 = i8;
                                    z2 = z5;
                                    substring = sb2.toString();
                                } else {
                                    z = z6;
                                    i = length;
                                    i2 = i8;
                                    z2 = z5;
                                    if (str2.charAt(i9) == '{' && str2.charAt(i11 - 1) == '}') {
                                        substring = pagingConfig.placeholder(substring);
                                    }
                                }
                                sb.append(substring);
                            } else {
                                z = z6;
                                i = length;
                                i2 = i8;
                                z2 = z5;
                            }
                            if (z && i7 < sniffer.peekLength) {
                                sb.append(pagingConfig.end());
                            } else if (!z && i7 > sniffer.peekLength) {
                                sb.append(pagingConfig.start());
                            }
                            sniffer.peekLength = i7;
                            i9 = i11;
                        } else {
                            i = length;
                            i2 = i8;
                            z2 = z5;
                        }
                        i8 = i2 + 1;
                        length = i;
                        z5 = z2;
                    }
                }
                obj4 = Recorder$$ExternalSyntheticOutline2.m(start, sb.toString(), pagingConfig.end());
            }
        } else if (obj5 instanceof List) {
            Iterable iterable = (Iterable) obj5;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                arrayList.add(next != null ? maybePseudoLocalize(next, locale, sniffer) : null);
            }
            obj4 = arrayList;
        } else if (obj5 instanceof Set) {
            Iterable iterable2 = (Iterable) obj5;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
            Iterator it2 = iterable2.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                arrayList2.add(next2 != null ? maybePseudoLocalize(next2, locale, sniffer) : null);
            }
            obj4 = CollectionsKt.toSet(arrayList2);
        } else if (obj5 instanceof Map) {
            Map map = (Map) obj5;
            ArrayList arrayList3 = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Object maybePseudoLocalize = key != null ? maybePseudoLocalize(key, locale, sniffer) : null;
                Object value = entry.getValue();
                arrayList3.add(new Pair(maybePseudoLocalize, value != null ? maybePseudoLocalize(value, locale, sniffer) : null));
            }
            obj4 = MapsKt__MapsKt.toMap(arrayList3);
        } else {
            Class<?> cls = obj5.getClass();
            ReflectionFactory reflectionFactory = Reflection.factory;
            obj4 = obj5;
            if (isPseudoLocalizable(reflectionFactory.getOrCreateKotlinClass(cls))) {
                Iterator it3 = reflectionFactory.getOrCreateKotlinClass(obj5.getClass()).getConstructors().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it3.next();
                    KFunction kFunction = (KFunction) obj2;
                    kFunction.getClass();
                    if (((ReflectKFunction) kFunction).isPrimaryConstructor()) {
                        break;
                    }
                }
                KFunction kFunction2 = (KFunction) obj2;
                if ((kFunction2 != null ? kFunction2.getVisibility() : null) != KVisibility.PUBLIC) {
                    kFunction2 = null;
                }
                if (kFunction2 != null) {
                    List<ReflectKParameter> parameters = kFunction2.getParameters();
                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters, 10));
                    for (ReflectKParameter reflectKParameter : parameters) {
                        ReflectProperties$LazySoftVal reflectProperties$LazySoftVal = ((KClassImpl.Data) ((KClassImpl) Reflection.factory.getOrCreateKotlinClass(obj5.getClass())).data.getValue()).allNonStaticMembers$delegate;
                        KProperty kProperty = KClassImpl.Data.$$delegatedProperties[14];
                        Object invoke = reflectProperties$LazySoftVal.invoke();
                        invoke.getClass();
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj6 : (Collection) invoke) {
                            DescriptorKCallable descriptorKCallable = (DescriptorKCallable) obj6;
                            if (descriptorKCallable.getDescriptor().getExtensionReceiverParameter() == null && (descriptorKCallable instanceof KProperty1)) {
                                arrayList5.add(obj6);
                            }
                        }
                        Iterator it4 = arrayList5.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it4.next();
                            if (Intrinsics.areEqual(((KProperty1) obj3).getName(), reflectKParameter.getName())) {
                                break;
                            }
                        }
                        KProperty1 kProperty1 = (KProperty1) obj3;
                        if (kProperty1 != null) {
                            Intrinsics.areEqual(kProperty1.getReturnType().getClassifier(), Reflection.factory.getOrCreateKotlinClass(String.class));
                            Object obj7 = kProperty1.get(obj5);
                            if (obj7 == null) {
                                obj7 = null;
                            } else if (isPseudoLocalizable(kProperty1)) {
                                obj7 = maybePseudoLocalize(obj7, locale, sniffer);
                            }
                            arrayList4.add(obj7);
                        }
                    }
                    Object[] array2 = arrayList4.toArray(new Object[0]);
                    obj4 = kFunction2.call(Arrays.copyOf(array2, array2.length));
                }
                return obj5;
            }
        }
        obj4.getClass();
        return obj4;
    }

    public static Object maybePseudoLocalize$default(Object obj) {
        Locale locale = Locale.getDefault();
        locale.getClass();
        obj.getClass();
        Pseudolocalizer$Method[] pseudolocalizer$MethodArr = Pseudolocalizer$Method.$VALUES;
        Sniffer sniffer = new Sniffer((byte) 0, 27, false);
        sniffer.scratch = new PagingConfig();
        return maybePseudoLocalize(obj, locale, sniffer);
    }
}
