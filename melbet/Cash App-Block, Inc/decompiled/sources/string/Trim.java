package string;

import androidx.camera.camera2.pipe.core.Debug;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import operation.StandardLogicOperation;
import string.TrimMode;
import utils.AnyUtilsKt;

/* loaded from: classes10.dex */
public final class Trim implements StandardLogicOperation {
    public final /* synthetic */ int $r8$classId;
    public static final Trim INSTANCE$1 = new Trim(1);
    public static final Trim INSTANCE$2 = new Trim(2);
    public static final Trim INSTANCE$3 = new Trim(3);
    public static final Trim INSTANCE$4 = new Trim(4);
    public static final Trim INSTANCE$5 = new Trim(5);
    public static final Trim INSTANCE$6 = new Trim(6);
    public static final Trim INSTANCE$7 = new Trim(7);
    public static final Trim INSTANCE$8 = new Trim(8);
    public static final Trim INSTANCE = new Trim(0);
    public static final Trim INSTANCE$9 = new Trim(9);

    public /* synthetic */ Trim(int i) {
        this.$r8$classId = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r9 = kotlin.text.StringsKt__StringsKt.split$default(r9, new java.lang.String[]{""}, false, 0, 6, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0319  */
    @Override // operation.StandardLogicOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object evaluateLogic(Object obj, Object obj2) {
        Object failure;
        TrimArguments trimArguments;
        String trim;
        String str;
        char single;
        String str2;
        int hashCode;
        TrimMode.End end;
        Object failure2;
        List split$default;
        Object failure3;
        Function0 fewReplace;
        Object failure4;
        List split$default2;
        List split$default3;
        List drop;
        boolean z = false;
        switch (this.$r8$classId) {
            case 0:
                TrimMode.End end2 = TrimMode.End.INSTANCE;
                TrimMode.End end3 = TrimMode.End.INSTANCE$2;
                TrimMode.End end4 = TrimMode.End.INSTANCE$1;
                List list = AnyUtilsKt.getAsList(obj).items;
                try {
                    Result.Companion companion = Result.Companion;
                    Object obj3 = list.get(0);
                    obj3.getClass();
                    str = (String) obj3;
                    Object obj4 = list.get(1);
                    obj4.getClass();
                    single = StringsKt___StringsKt.single((String) obj4);
                    Object obj5 = list.get(2);
                    obj5.getClass();
                    str2 = (String) obj5;
                    hashCode = str2.hashCode();
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                if (hashCode == 100571) {
                    if (str2.equals("end")) {
                        end = end2;
                        failure = new TrimArguments(str, single, end);
                        if (Result.m4120exceptionOrNullimpl(failure) == null) {
                        }
                        if (trimArguments == null) {
                        }
                    }
                    throw new IllegalStateException("Invalid TrimMode value");
                }
                if (hashCode == 109757538) {
                    if (str2.equals("start")) {
                        end = end3;
                        failure = new TrimArguments(str, single, end);
                        if (Result.m4120exceptionOrNullimpl(failure) == null) {
                        }
                        if (trimArguments == null) {
                        }
                    }
                    throw new IllegalStateException("Invalid TrimMode value");
                }
                if (hashCode == 2144573977 && str2.equals("bothEnds")) {
                    end = end4;
                    failure = new TrimArguments(str, single, end);
                    trimArguments = Result.m4120exceptionOrNullimpl(failure) == null ? (TrimArguments) failure : null;
                    if (trimArguments == null) {
                        return null;
                    }
                    TrimMode trimMode = trimArguments.mode;
                    char c = trimArguments.f836char;
                    String str3 = trimArguments.text;
                    if (trimMode.equals(end3)) {
                        trim = StringsKt.trimStart(str3, c);
                    } else if (trimMode.equals(end2)) {
                        trim = StringsKt.trimEnd(str3, c);
                    } else {
                        if (!trimMode.equals(end4)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        trim = StringsKt.trim(str3, c);
                    }
                    return trim;
                }
                throw new IllegalStateException("Invalid TrimMode value");
            case 1:
                String unwrapValueAsString = Debug.unwrapValueAsString(obj);
                if (unwrapValueAsString == null) {
                    return null;
                }
                if (unwrapValueAsString.length() <= 0) {
                    return unwrapValueAsString;
                }
                StringBuilder sb = new StringBuilder();
                String valueOf = String.valueOf(unwrapValueAsString.charAt(0));
                valueOf.getClass();
                String upperCase = valueOf.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                sb.append((Object) upperCase);
                sb.append(unwrapValueAsString.substring(1));
                return sb.toString();
            case 2:
                String unwrapValueAsString2 = Debug.unwrapValueAsString(obj);
                if (unwrapValueAsString2 != null) {
                    return Boolean.valueOf(StringsKt.isBlank(unwrapValueAsString2));
                }
                return null;
            case 3:
                String unwrapValueAsString3 = Debug.unwrapValueAsString(obj);
                if (unwrapValueAsString3 != null) {
                    return Integer.valueOf(unwrapValueAsString3.length());
                }
                return null;
            case 4:
                String unwrapValueAsString4 = Debug.unwrapValueAsString(obj);
                if (unwrapValueAsString4 == null) {
                    return null;
                }
                String lowerCase = unwrapValueAsString4.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                return lowerCase;
            case 5:
                List list2 = AnyUtilsKt.getAsList(obj).items;
                try {
                    Result.Companion companion3 = Result.Companion;
                    Object obj6 = list2.get(0);
                    obj6.getClass();
                    Object obj7 = list2.get(1);
                    obj7.getClass();
                    Object obj8 = list2.get(2);
                    obj8.getClass();
                    failure2 = new MatchArguments((String) obj6, (String) obj7, (List) obj8);
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.Companion;
                    failure2 = new Result.Failure(th2);
                }
                MatchArguments matchArguments = Result.m4120exceptionOrNullimpl(failure2) == null ? (MatchArguments) failure2 : null;
                if (matchArguments == null) {
                    return null;
                }
                List list3 = matchArguments.regexOptions;
                String str4 = matchArguments.regexPattern;
                boolean isEmpty = list3.isEmpty();
                String str5 = matchArguments.text;
                if (isEmpty) {
                    z = new Regex(str4).matches(str5);
                } else {
                    List list4 = list3;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                    for (Object obj9 : list4) {
                        obj9.getClass();
                        arrayList.add(RegexOption.valueOf((String) obj9));
                    }
                    Set set = CollectionsKt.toSet(arrayList);
                    set.getClass();
                    Regex.Companion companion5 = Regex.INSTANCE;
                    Set set2 = set;
                    Iterator it = set2.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        i |= ((RegexOption) it.next()).value;
                    }
                    companion5.getClass();
                    if ((i & 2) != 0) {
                        i |= 64;
                    }
                    Pattern compile = Pattern.compile(str4, i);
                    compile.getClass();
                    Regex regex = new Regex(compile);
                    if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                        Iterator it2 = set2.iterator();
                        while (it2.hasNext()) {
                            if (((RegexOption) it2.next()) == RegexOption.MULTILINE) {
                                split$default = StringsKt__StringsKt.split$default(str5, new String[]{"\n"}, false, 0, 6, null);
                                List list5 = split$default;
                                if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                                    Iterator it3 = list5.iterator();
                                    while (it3.hasNext()) {
                                        if (!regex.matches((String) it3.next())) {
                                        }
                                    }
                                }
                                z = true;
                            }
                        }
                    }
                    z = regex.matches(str5);
                }
                return Boolean.valueOf(z);
            case 6:
                List list6 = AnyUtilsKt.getAsList(obj).items;
                try {
                    Result.Companion companion6 = Result.Companion;
                    Object obj10 = list6.get(0);
                    obj10.getClass();
                    Object obj11 = list6.get(1);
                    obj11.getClass();
                    Object obj12 = list6.get(2);
                    obj12.getClass();
                    ReplaceData replaceData = new ReplaceData((String) obj10, (String) obj11, (String) obj12);
                    Object obj13 = list6.get(3);
                    obj13.getClass();
                    String str6 = (String) obj13;
                    if (str6.equals("all")) {
                        fewReplace = new AllReplace(replaceData);
                    } else {
                        if (StringsKt.toIntOrNull(str6) == null) {
                            throw new IllegalArgumentException(str6);
                        }
                        fewReplace = new FewReplace(replaceData, Integer.parseInt(str6));
                    }
                    failure3 = fewReplace.invoke();
                } catch (Throwable th3) {
                    Result.Companion companion7 = Result.Companion;
                    failure3 = new Result.Failure(th3);
                }
                if (Result.m4120exceptionOrNullimpl(failure3) == null) {
                    return failure3;
                }
                return null;
            case 7:
                List list7 = AnyUtilsKt.getAsList(obj).items;
                try {
                    Result.Companion companion8 = Result.Companion;
                    Object obj14 = list7.get(0);
                    obj14.getClass();
                    Object obj15 = list7.get(1);
                    obj15.getClass();
                    failure4 = new SplitArguments((String) obj14, (List) obj15);
                } catch (Throwable th4) {
                    Result.Companion companion9 = Result.Companion;
                    failure4 = new Result.Failure(th4);
                }
                SplitArguments splitArguments = Result.m4120exceptionOrNullimpl(failure4) == null ? (SplitArguments) failure4 : null;
                if (splitArguments == null) {
                    return null;
                }
                List list8 = splitArguments.delimiters;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list8, 10));
                for (Object obj16 : list8) {
                    obj16.getClass();
                    arrayList2.add((String) obj16);
                }
                String[] strArr = (String[]) CollectionsKt.toSet(arrayList2).toArray(new String[0]);
                split$default2 = StringsKt__StringsKt.split$default(splitArguments.text, (String[]) Arrays.copyOf(strArr, strArr.length), false, 0, 6, null);
                return split$default2;
            case 8:
                Object firstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) AnyUtilsKt.getAsList(obj));
                String str7 = firstOrNull instanceof String ? (String) firstOrNull : null;
                if (str7 == null || split$default3 == null || (drop = CollectionsKt.drop(split$default3, 1)) == null) {
                    return null;
                }
                return CollectionsKt.dropLast(1, drop);
            default:
                String unwrapValueAsString5 = Debug.unwrapValueAsString(obj);
                if (unwrapValueAsString5 == null) {
                    return null;
                }
                String upperCase2 = unwrapValueAsString5.toUpperCase(Locale.ROOT);
                upperCase2.getClass();
                return upperCase2;
        }
    }
}
