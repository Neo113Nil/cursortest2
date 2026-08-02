package kotlin.jvm.internal;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import papa.PapaEvent;

/* loaded from: classes9.dex */
public final class ClassReference implements KClass, ClassBasedDeclarationContainer, KotlinGenericDeclaration {
    public static final Companion Companion = new Companion(null);
    public static final Map FUNCTION_CLASSES;
    public final Class jClass;

    public final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
         */
        public static String classFqNameOf(String str) {
            int hashCode = str.hashCode();
            switch (hashCode) {
                case -2061550653:
                    if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                        return "kotlin.Double.Companion";
                    }
                    return null;
                case -2056817302:
                    if (str.equals("java.lang.Integer")) {
                        return "kotlin.Int";
                    }
                    return null;
                case -2034166429:
                    if (str.equals("java.lang.Cloneable")) {
                        return "kotlin.Cloneable";
                    }
                    return null;
                case -1979556166:
                    if (str.equals("java.lang.annotation.Annotation")) {
                        return "kotlin.Annotation";
                    }
                    return null;
                case -1571515090:
                    if (str.equals("java.lang.Comparable")) {
                        return "kotlin.Comparable";
                    }
                    return null;
                case -1383349348:
                    if (str.equals("java.util.Map")) {
                        return "kotlin.collections.Map";
                    }
                    return null;
                case -1383343454:
                    if (str.equals("java.util.Set")) {
                        return "kotlin.collections.Set";
                    }
                    return null;
                case -1325958191:
                    if (str.equals("double")) {
                        return "kotlin.Double";
                    }
                    return null;
                case -1182275604:
                    if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                        return "kotlin.Byte.Companion";
                    }
                    return null;
                case -1062240117:
                    if (str.equals("java.lang.CharSequence")) {
                        return "kotlin.CharSequence";
                    }
                    return null;
                case -688322466:
                    if (str.equals("java.util.Collection")) {
                        return "kotlin.collections.Collection";
                    }
                    return null;
                case -527879800:
                    if (str.equals("java.lang.Float")) {
                        return "kotlin.Float";
                    }
                    return null;
                case -515992664:
                    if (str.equals("java.lang.Short")) {
                        return "kotlin.Short";
                    }
                    return null;
                case -246476834:
                    if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                        return "kotlin.Char.Companion";
                    }
                    return null;
                case -207262728:
                    if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                        return "kotlin.Long.Companion";
                    }
                    return null;
                case -165139126:
                    if (str.equals("java.util.Map$Entry")) {
                        return "kotlin.collections.Map.Entry";
                    }
                    return null;
                case 104431:
                    if (str.equals("int")) {
                        return "kotlin.Int";
                    }
                    return null;
                case 3039496:
                    if (str.equals("byte")) {
                        return "kotlin.Byte";
                    }
                    return null;
                case 3052374:
                    if (str.equals("char")) {
                        return "kotlin.Char";
                    }
                    return null;
                case 3327612:
                    if (str.equals("long")) {
                        return "kotlin.Long";
                    }
                    return null;
                case 64711720:
                    if (str.equals(InquiryField.BooleanField.TYPE)) {
                        return "kotlin.Boolean";
                    }
                    return null;
                case 65821278:
                    if (str.equals("java.util.List")) {
                        return "kotlin.collections.List";
                    }
                    return null;
                case 77230534:
                    if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                        return "kotlin.Short.Companion";
                    }
                    return null;
                case 97526364:
                    if (str.equals(InquiryField.FloatField.TYPE)) {
                        return "kotlin.Float";
                    }
                    return null;
                case 109413500:
                    if (str.equals("short")) {
                        return "kotlin.Short";
                    }
                    return null;
                case 155276373:
                    if (str.equals("java.lang.Character")) {
                        return "kotlin.Char";
                    }
                    return null;
                case 226173651:
                    if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                        return "kotlin.Enum.Companion";
                    }
                    return null;
                case 344809556:
                    if (str.equals("java.lang.Boolean")) {
                        return "kotlin.Boolean";
                    }
                    return null;
                case 398507100:
                    if (str.equals("java.lang.Byte")) {
                        return "kotlin.Byte";
                    }
                    return null;
                case 398585941:
                    if (str.equals("java.lang.Enum")) {
                        return "kotlin.Enum";
                    }
                    return null;
                case 398795216:
                    if (str.equals("java.lang.Long")) {
                        return "kotlin.Long";
                    }
                    return null;
                case 482629606:
                    if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                        return "kotlin.Float.Companion";
                    }
                    return null;
                case 499831342:
                    if (str.equals("java.util.Iterator")) {
                        return "kotlin.collections.Iterator";
                    }
                    return null;
                case 577341676:
                    if (str.equals("java.util.ListIterator")) {
                        return "kotlin.collections.ListIterator";
                    }
                    return null;
                case 599019395:
                    if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                        return "kotlin.String.Companion";
                    }
                    return null;
                case 761287205:
                    if (str.equals("java.lang.Double")) {
                        return "kotlin.Double";
                    }
                    return null;
                case 1052881309:
                    if (str.equals("java.lang.Number")) {
                        return "kotlin.Number";
                    }
                    return null;
                case 1063877011:
                    if (str.equals("java.lang.Object")) {
                        return "kotlin.Any";
                    }
                    return null;
                case 1195259493:
                    if (str.equals("java.lang.String")) {
                        return "kotlin.String";
                    }
                    return null;
                case 1275614662:
                    if (str.equals("java.lang.Iterable")) {
                        return "kotlin.collections.Iterable";
                    }
                    return null;
                case 1383693018:
                    if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                        return "kotlin.Boolean.Companion";
                    }
                    return null;
                case 1630335596:
                    if (str.equals("java.lang.Throwable")) {
                        return "kotlin.Throwable";
                    }
                    return null;
                case 1877171123:
                    if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                        return "kotlin.Int.Companion";
                    }
                    return null;
                default:
                    switch (hashCode) {
                        case -1811142716:
                            if (str.equals("kotlin.jvm.functions.Function10")) {
                                return "kotlin.Function10";
                            }
                            return null;
                        case -1811142715:
                            if (str.equals("kotlin.jvm.functions.Function11")) {
                                return "kotlin.Function11";
                            }
                            return null;
                        case -1811142714:
                            if (str.equals("kotlin.jvm.functions.Function12")) {
                                return "kotlin.Function12";
                            }
                            return null;
                        case -1811142713:
                            if (str.equals("kotlin.jvm.functions.Function13")) {
                                return "kotlin.Function13";
                            }
                            return null;
                        case -1811142712:
                            if (str.equals("kotlin.jvm.functions.Function14")) {
                                return "kotlin.Function14";
                            }
                            return null;
                        case -1811142711:
                            if (str.equals("kotlin.jvm.functions.Function15")) {
                                return "kotlin.Function15";
                            }
                            return null;
                        case -1811142710:
                            if (str.equals("kotlin.jvm.functions.Function16")) {
                                return "kotlin.Function16";
                            }
                            return null;
                        case -1811142709:
                            if (str.equals("kotlin.jvm.functions.Function17")) {
                                return "kotlin.Function17";
                            }
                            return null;
                        case -1811142708:
                            if (str.equals("kotlin.jvm.functions.Function18")) {
                                return "kotlin.Function18";
                            }
                            return null;
                        case -1811142707:
                            if (str.equals("kotlin.jvm.functions.Function19")) {
                                return "kotlin.Function19";
                            }
                            return null;
                        default:
                            switch (hashCode) {
                                case -1811142685:
                                    if (str.equals("kotlin.jvm.functions.Function20")) {
                                        return "kotlin.Function20";
                                    }
                                    return null;
                                case -1811142684:
                                    if (str.equals("kotlin.jvm.functions.Function21")) {
                                        return "kotlin.Function21";
                                    }
                                    return null;
                                case -1811142683:
                                    if (str.equals("kotlin.jvm.functions.Function22")) {
                                        return "kotlin.Function22";
                                    }
                                    return null;
                                default:
                                    switch (hashCode) {
                                        case 80123371:
                                            if (str.equals("kotlin.jvm.functions.Function0")) {
                                                return "kotlin.Function0";
                                            }
                                            return null;
                                        case 80123372:
                                            if (str.equals("kotlin.jvm.functions.Function1")) {
                                                return "kotlin.Function1";
                                            }
                                            return null;
                                        case 80123373:
                                            if (str.equals("kotlin.jvm.functions.Function2")) {
                                                return "kotlin.Function2";
                                            }
                                            return null;
                                        case 80123374:
                                            if (str.equals("kotlin.jvm.functions.Function3")) {
                                                return "kotlin.Function3";
                                            }
                                            return null;
                                        case 80123375:
                                            if (str.equals("kotlin.jvm.functions.Function4")) {
                                                return "kotlin.Function4";
                                            }
                                            return null;
                                        case 80123376:
                                            if (str.equals("kotlin.jvm.functions.Function5")) {
                                                return "kotlin.Function5";
                                            }
                                            return null;
                                        case 80123377:
                                            if (str.equals("kotlin.jvm.functions.Function6")) {
                                                return "kotlin.Function6";
                                            }
                                            return null;
                                        case 80123378:
                                            if (str.equals("kotlin.jvm.functions.Function7")) {
                                                return "kotlin.Function7";
                                            }
                                            return null;
                                        case 80123379:
                                            if (str.equals("kotlin.jvm.functions.Function8")) {
                                                return "kotlin.Function8";
                                            }
                                            return null;
                                        case 80123380:
                                            if (str.equals("kotlin.jvm.functions.Function9")) {
                                                return "kotlin.Function9";
                                            }
                                            return null;
                                        default:
                                            return null;
                                    }
                            }
                    }
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
         */
        public static String simpleNameOf(String str) {
            int hashCode = str.hashCode();
            switch (hashCode) {
                case -2061550653:
                    if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                        return "Companion";
                    }
                    return null;
                case -2056817302:
                    if (str.equals("java.lang.Integer")) {
                        return "Int";
                    }
                    return null;
                case -2034166429:
                    if (str.equals("java.lang.Cloneable")) {
                        return "Cloneable";
                    }
                    return null;
                case -1979556166:
                    if (str.equals("java.lang.annotation.Annotation")) {
                        return "Annotation";
                    }
                    return null;
                case -1571515090:
                    if (str.equals("java.lang.Comparable")) {
                        return "Comparable";
                    }
                    return null;
                case -1383349348:
                    if (str.equals("java.util.Map")) {
                        return "Map";
                    }
                    return null;
                case -1383343454:
                    if (str.equals("java.util.Set")) {
                        return "Set";
                    }
                    return null;
                case -1325958191:
                    if (str.equals("double")) {
                        return "Double";
                    }
                    return null;
                case -1182275604:
                    if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                        return "Companion";
                    }
                    return null;
                case -1062240117:
                    if (str.equals("java.lang.CharSequence")) {
                        return "CharSequence";
                    }
                    return null;
                case -688322466:
                    if (str.equals("java.util.Collection")) {
                        return "Collection";
                    }
                    return null;
                case -527879800:
                    if (str.equals("java.lang.Float")) {
                        return "Float";
                    }
                    return null;
                case -515992664:
                    if (str.equals("java.lang.Short")) {
                        return "Short";
                    }
                    return null;
                case -246476834:
                    if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                        return "Companion";
                    }
                    return null;
                case -207262728:
                    if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                        return "Companion";
                    }
                    return null;
                case -165139126:
                    if (str.equals("java.util.Map$Entry")) {
                        return "Entry";
                    }
                    return null;
                case 104431:
                    if (str.equals("int")) {
                        return "Int";
                    }
                    return null;
                case 3039496:
                    if (str.equals("byte")) {
                        return "Byte";
                    }
                    return null;
                case 3052374:
                    if (str.equals("char")) {
                        return "Char";
                    }
                    return null;
                case 3327612:
                    if (str.equals("long")) {
                        return "Long";
                    }
                    return null;
                case 64711720:
                    if (str.equals(InquiryField.BooleanField.TYPE)) {
                        return "Boolean";
                    }
                    return null;
                case 65821278:
                    if (str.equals("java.util.List")) {
                        return "List";
                    }
                    return null;
                case 77230534:
                    if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                        return "Companion";
                    }
                    return null;
                case 97526364:
                    if (str.equals(InquiryField.FloatField.TYPE)) {
                        return "Float";
                    }
                    return null;
                case 109413500:
                    if (str.equals("short")) {
                        return "Short";
                    }
                    return null;
                case 155276373:
                    if (str.equals("java.lang.Character")) {
                        return "Char";
                    }
                    return null;
                case 226173651:
                    if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                        return "Companion";
                    }
                    return null;
                case 344809556:
                    if (str.equals("java.lang.Boolean")) {
                        return "Boolean";
                    }
                    return null;
                case 398507100:
                    if (str.equals("java.lang.Byte")) {
                        return "Byte";
                    }
                    return null;
                case 398585941:
                    if (str.equals("java.lang.Enum")) {
                        return "Enum";
                    }
                    return null;
                case 398795216:
                    if (str.equals("java.lang.Long")) {
                        return "Long";
                    }
                    return null;
                case 482629606:
                    if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                        return "Companion";
                    }
                    return null;
                case 499831342:
                    if (str.equals("java.util.Iterator")) {
                        return "Iterator";
                    }
                    return null;
                case 577341676:
                    if (str.equals("java.util.ListIterator")) {
                        return "ListIterator";
                    }
                    return null;
                case 599019395:
                    if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                        return "Companion";
                    }
                    return null;
                case 761287205:
                    if (str.equals("java.lang.Double")) {
                        return "Double";
                    }
                    return null;
                case 1052881309:
                    if (str.equals("java.lang.Number")) {
                        return "Number";
                    }
                    return null;
                case 1063877011:
                    if (str.equals("java.lang.Object")) {
                        return "Any";
                    }
                    return null;
                case 1195259493:
                    if (str.equals("java.lang.String")) {
                        return "String";
                    }
                    return null;
                case 1275614662:
                    if (str.equals("java.lang.Iterable")) {
                        return "Iterable";
                    }
                    return null;
                case 1383693018:
                    if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                        return "Companion";
                    }
                    return null;
                case 1630335596:
                    if (str.equals("java.lang.Throwable")) {
                        return "Throwable";
                    }
                    return null;
                case 1877171123:
                    if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                        return "Companion";
                    }
                    return null;
                default:
                    switch (hashCode) {
                        case -1811142716:
                            if (str.equals("kotlin.jvm.functions.Function10")) {
                                return "Function10";
                            }
                            return null;
                        case -1811142715:
                            if (str.equals("kotlin.jvm.functions.Function11")) {
                                return "Function11";
                            }
                            return null;
                        case -1811142714:
                            if (str.equals("kotlin.jvm.functions.Function12")) {
                                return "Function12";
                            }
                            return null;
                        case -1811142713:
                            if (str.equals("kotlin.jvm.functions.Function13")) {
                                return "Function13";
                            }
                            return null;
                        case -1811142712:
                            if (str.equals("kotlin.jvm.functions.Function14")) {
                                return "Function14";
                            }
                            return null;
                        case -1811142711:
                            if (str.equals("kotlin.jvm.functions.Function15")) {
                                return "Function15";
                            }
                            return null;
                        case -1811142710:
                            if (str.equals("kotlin.jvm.functions.Function16")) {
                                return "Function16";
                            }
                            return null;
                        case -1811142709:
                            if (str.equals("kotlin.jvm.functions.Function17")) {
                                return "Function17";
                            }
                            return null;
                        case -1811142708:
                            if (str.equals("kotlin.jvm.functions.Function18")) {
                                return "Function18";
                            }
                            return null;
                        case -1811142707:
                            if (str.equals("kotlin.jvm.functions.Function19")) {
                                return "Function19";
                            }
                            return null;
                        default:
                            switch (hashCode) {
                                case -1811142685:
                                    if (str.equals("kotlin.jvm.functions.Function20")) {
                                        return "Function20";
                                    }
                                    return null;
                                case -1811142684:
                                    if (str.equals("kotlin.jvm.functions.Function21")) {
                                        return "Function21";
                                    }
                                    return null;
                                case -1811142683:
                                    if (str.equals("kotlin.jvm.functions.Function22")) {
                                        return "Function22";
                                    }
                                    return null;
                                default:
                                    switch (hashCode) {
                                        case 80123371:
                                            if (str.equals("kotlin.jvm.functions.Function0")) {
                                                return "Function0";
                                            }
                                            return null;
                                        case 80123372:
                                            if (str.equals("kotlin.jvm.functions.Function1")) {
                                                return "Function1";
                                            }
                                            return null;
                                        case 80123373:
                                            if (str.equals("kotlin.jvm.functions.Function2")) {
                                                return "Function2";
                                            }
                                            return null;
                                        case 80123374:
                                            if (str.equals("kotlin.jvm.functions.Function3")) {
                                                return "Function3";
                                            }
                                            return null;
                                        case 80123375:
                                            if (str.equals("kotlin.jvm.functions.Function4")) {
                                                return "Function4";
                                            }
                                            return null;
                                        case 80123376:
                                            if (str.equals("kotlin.jvm.functions.Function5")) {
                                                return "Function5";
                                            }
                                            return null;
                                        case 80123377:
                                            if (str.equals("kotlin.jvm.functions.Function6")) {
                                                return "Function6";
                                            }
                                            return null;
                                        case 80123378:
                                            if (str.equals("kotlin.jvm.functions.Function7")) {
                                                return "Function7";
                                            }
                                            return null;
                                        case 80123379:
                                            if (str.equals("kotlin.jvm.functions.Function8")) {
                                                return "Function8";
                                            }
                                            return null;
                                        case 80123380:
                                            if (str.equals("kotlin.jvm.functions.Function9")) {
                                                return "Function9";
                                            }
                                            return null;
                                        default:
                                            return null;
                                    }
                            }
                    }
            }
        }
    }

    static {
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Class[]{Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, Function5.class, Function6.class, Function7.class, Function8.class, Function9.class, Function10.class, Function11.class, Function12.class, Function13.class, Function14.class, Function15.class, Function16.class, Function17.class, Function18.class, Function19.class, Function20.class, Function21.class, Function22.class});
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOf, 10));
        int i = 0;
        for (Object obj : listOf) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            arrayList.add(new Pair((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        FUNCTION_CLASSES = MapsKt__MapsKt.toMap(arrayList);
    }

    public ClassReference(Class cls) {
        cls.getClass();
        this.jClass = cls;
    }

    public static void error() {
        throw new KotlinReflectionNotSupportedError();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ClassReference) && PapaEvent.getJavaObjectType(this).equals(PapaEvent.getJavaObjectType((KClass) obj));
    }

    @Override // kotlin.jvm.internal.KotlinGenericDeclaration
    public final GenericDeclaration findJavaDeclaration() {
        return this.jClass;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final List getAnnotations() {
        error();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final Collection getConstructors() {
        error();
        throw null;
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    public final Class getJClass() {
        return this.jClass;
    }

    @Override // kotlin.reflect.KClass
    public final String getQualifiedName() {
        String classFqNameOf;
        Companion.getClass();
        Class cls = this.jClass;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String classFqNameOf2 = Companion.classFqNameOf(cls.getName());
            return classFqNameOf2 == null ? cls.getCanonicalName() : classFqNameOf2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (classFqNameOf = Companion.classFqNameOf(componentType.getName())) != null) {
            str = classFqNameOf.concat("Array");
        }
        return str == null ? "kotlin.Array" : str;
    }

    @Override // kotlin.reflect.KClass
    public final String getSimpleName() {
        String simpleNameOf;
        Companion.getClass();
        Class cls = this.jClass;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String simpleNameOf2 = Companion.simpleNameOf(cls.getName());
                return simpleNameOf2 == null ? cls.getSimpleName() : simpleNameOf2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (simpleNameOf = Companion.simpleNameOf(componentType.getName())) != null) {
                str = simpleNameOf.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return StringsKt.substringAfter(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return StringsKt.substringAfter('$', simpleName, simpleName);
        }
        return StringsKt.substringAfter(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    @Override // kotlin.reflect.KClass
    public final List getSupertypes() {
        error();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final List getTypeParameters() {
        error();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final int hashCode() {
        return PapaEvent.getJavaObjectType(this).hashCode();
    }

    @Override // kotlin.reflect.KClass
    public final boolean isInner() {
        error();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isInstance(Object obj) {
        Companion.getClass();
        Class cls = this.jClass;
        cls.getClass();
        Map map = FUNCTION_CLASSES;
        map.getClass();
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return TypeIntrinsics.isFunctionOfArity(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = PapaEvent.getJavaObjectType(Reflection.factory.getOrCreateKotlinClass(cls));
        }
        return cls.isInstance(obj);
    }

    @Override // kotlin.reflect.KClass
    public final boolean isValue() {
        error();
        throw null;
    }

    public final String toString() {
        return this.jClass.toString() + " (Kotlin reflection is not available)";
    }
}
