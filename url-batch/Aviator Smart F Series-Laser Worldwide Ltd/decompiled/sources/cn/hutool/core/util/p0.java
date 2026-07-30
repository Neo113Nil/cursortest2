package cn.hutool.core.util;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.exceptions.UtilException;
import cn.hutool.core.lang.func.Func1;
import cn.hutool.core.lang.mutable.MutableObj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class p0 {
    public static final String RE_CHINESE = "[⺀-\u2eff⼀-\u2fdf㇀-\u31ef㐀-䶿一-鿿豈-\ufaff𠀀-𪛟𪜀-\u2b73f𫝀-\u2b81f𫠠-\u2ceaf丽-\u2fa1f]";
    public static final String RE_CHINESES = "[⺀-\u2eff⼀-\u2fdf㇀-\u31ef㐀-䶿一-鿿豈-\ufaff𠀀-𪛟𪜀-\u2b73f𫝀-\u2b81f𫠠-\u2ceaf丽-\u2fa1f]+";
    public static final Set<Character> RE_KEYS = CollUtil.newHashSet('$', '(', ')', '*', '+', '.', '[', ']', '?', Character.valueOf(cn.hutool.core.io.file.c.WINDOWS_SEPARATOR), '^', '{', '}', '|');

    public static boolean contains(String str, CharSequence charSequence) {
        if (str == null || charSequence == null) {
            return false;
        }
        return contains(cn.hutool.core.lang.n0.get(str, 32), charSequence);
    }

    public static int count(String str, CharSequence charSequence) {
        if (str == null || charSequence == null) {
            return 0;
        }
        return count(cn.hutool.core.lang.n0.get(str, 32), charSequence);
    }

    public static String delAll(String str, CharSequence charSequence) {
        return cn.hutool.core.text.l.hasEmpty(str, charSequence) ? cn.hutool.core.text.l.str(charSequence) : delAll(cn.hutool.core.lang.n0.get(str, 32), charSequence);
    }

    public static String delFirst(String str, CharSequence charSequence) {
        return cn.hutool.core.text.l.hasBlank(str, charSequence) ? cn.hutool.core.text.l.str(charSequence) : delFirst(cn.hutool.core.lang.n0.get(str, 32), charSequence);
    }

    public static String delLast(String str, CharSequence charSequence) {
        return cn.hutool.core.text.l.hasBlank(str, charSequence) ? cn.hutool.core.text.l.str(charSequence) : delLast(cn.hutool.core.lang.n0.get(str, 32), charSequence);
    }

    public static String delPre(String str, CharSequence charSequence) {
        return (charSequence == null || str == null) ? cn.hutool.core.text.l.str(charSequence) : delPre(cn.hutool.core.lang.n0.get(str, 32), charSequence);
    }

    public static String escape(char c8) {
        StringBuilder sb = new StringBuilder();
        if (RE_KEYS.contains(Character.valueOf(c8))) {
            sb.append(cn.hutool.core.io.file.c.WINDOWS_SEPARATOR);
        }
        sb.append(c8);
        return sb.toString();
    }

    public static String extractMulti(Pattern pattern, CharSequence charSequence, String str) {
        if (charSequence != null && pattern != null && str != null) {
            TreeSet treeSet = new TreeSet(new Comparator() { // from class: cn.hutool.core.util.k0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int lambda$extractMulti$3;
                    lambda$extractMulti$3 = p0.lambda$extractMulti$3((Integer) obj, (Integer) obj2);
                    return lambda$extractMulti$3;
                }
            });
            Matcher matcher = cn.hutool.core.lang.n0.GROUP_VAR.matcher(str);
            while (matcher.find()) {
                treeSet.add(Integer.valueOf(Integer.parseInt(matcher.group(1))));
            }
            Matcher matcher2 = pattern.matcher(charSequence);
            if (matcher2.find()) {
                Iterator it = treeSet.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    str = str.replace("$" + num, matcher2.group(num.intValue()));
                }
                return str;
            }
        }
        return null;
    }

    public static String extractMultiAndDelPre(Pattern pattern, p.a aVar, String str) {
        if (aVar != null && pattern != null && str != null) {
            HashSet hashSet = (HashSet) findAll(cn.hutool.core.lang.n0.GROUP_VAR, str, 1, new HashSet());
            CharSequence charSequence = (CharSequence) aVar.get();
            Matcher matcher = pattern.matcher(charSequence);
            if (matcher.find()) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    str = str.replace("$" + str2, matcher.group(Integer.parseInt(str2)));
                }
                aVar.set(cn.hutool.core.text.l.sub(charSequence, matcher.end(), charSequence.length()));
                return str;
            }
        }
        return null;
    }

    public static List<String> findAll(String str, CharSequence charSequence, int i8) {
        return (List) findAll(str, charSequence, i8, new ArrayList());
    }

    public static List<String> findAllGroup0(String str, CharSequence charSequence) {
        return findAll(str, charSequence, 0);
    }

    public static List<String> findAllGroup1(String str, CharSequence charSequence) {
        return findAll(str, charSequence, 1);
    }

    public static String get(String str, CharSequence charSequence, int i8) {
        if (charSequence == null || str == null) {
            return null;
        }
        return get(cn.hutool.core.lang.n0.get(str, 32), charSequence, i8);
    }

    public static Map<String, String> getAllGroupNames(Pattern pattern, CharSequence charSequence) {
        if (charSequence == null || pattern == null) {
            return null;
        }
        final Matcher matcher = pattern.matcher(charSequence);
        final HashMap newHashMap = cn.hutool.core.map.h1.newHashMap(matcher.groupCount());
        if (matcher.find()) {
            ((Map) y0.invoke(pattern, "namedGroups", new Object[0])).forEach(new BiConsumer() { // from class: cn.hutool.core.util.n0
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    p0.lambda$getAllGroupNames$2(newHashMap, matcher, (String) obj, (Integer) obj2);
                }
            });
        }
        return newHashMap;
    }

    public static List<String> getAllGroups(Pattern pattern, CharSequence charSequence) {
        return getAllGroups(pattern, charSequence, true);
    }

    public static Integer getFirstNumber(CharSequence charSequence) {
        return cn.hutool.core.convert.d.toInt(get(cn.hutool.core.lang.n0.NUMBERS, charSequence, 0), null);
    }

    public static String getGroup0(String str, CharSequence charSequence) {
        return get(str, charSequence, 0);
    }

    public static String getGroup1(String str, CharSequence charSequence) {
        return get(str, charSequence, 1);
    }

    public static MatchResult indexOf(String str, CharSequence charSequence) {
        if (str == null || charSequence == null) {
            return null;
        }
        return indexOf(cn.hutool.core.lang.n0.get(str, 32), charSequence);
    }

    public static boolean isMatch(String str, CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        if (cn.hutool.core.text.l.isEmpty(str)) {
            return true;
        }
        return isMatch(cn.hutool.core.lang.n0.get(str, 32), charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$extractMulti$3(Integer num, Integer num2) {
        return e0.compare(num2, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$findAll$4(Collection collection, int i8, Matcher matcher) {
        collection.add(matcher.group(i8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$get$0(MutableObj mutableObj, int i8, Matcher matcher) {
        mutableObj.set(matcher.group(i8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$get$1(MutableObj mutableObj, String str, Matcher matcher) {
        String group;
        group = matcher.group(str);
        mutableObj.set(group);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getAllGroupNames$2(Map map, Matcher matcher, String str, Integer num) {
    }

    public static MatchResult lastIndexOf(String str, CharSequence charSequence) {
        if (str == null || charSequence == null) {
            return null;
        }
        return lastIndexOf(cn.hutool.core.lang.n0.get(str, 32), charSequence);
    }

    public static String replaceAll(CharSequence charSequence, String str, String str2) {
        return replaceAll(charSequence, Pattern.compile(str, 32), str2);
    }

    public static String replaceFirst(Pattern pattern, CharSequence charSequence, String str) {
        return (pattern == null || cn.hutool.core.text.l.isEmpty(charSequence)) ? cn.hutool.core.text.l.str(charSequence) : pattern.matcher(charSequence).replaceFirst(str);
    }

    public static <T extends Collection<String>> T findAll(String str, CharSequence charSequence, int i8, T t7) {
        return str == null ? t7 : (T) findAll(cn.hutool.core.lang.n0.get(str, 32), charSequence, i8, t7);
    }

    public static List<String> findAllGroup0(Pattern pattern, CharSequence charSequence) {
        return findAll(pattern, charSequence, 0);
    }

    public static List<String> findAllGroup1(Pattern pattern, CharSequence charSequence) {
        return findAll(pattern, charSequence, 1);
    }

    public static List<String> getAllGroups(Pattern pattern, CharSequence charSequence, boolean z7) {
        return getAllGroups(pattern, charSequence, z7, false);
    }

    public static String getGroup0(Pattern pattern, CharSequence charSequence) {
        return get(pattern, charSequence, 0);
    }

    public static String getGroup1(Pattern pattern, CharSequence charSequence) {
        return get(pattern, charSequence, 1);
    }

    public static boolean contains(Pattern pattern, CharSequence charSequence) {
        if (pattern == null || charSequence == null) {
            return false;
        }
        return pattern.matcher(charSequence).find();
    }

    public static int count(Pattern pattern, CharSequence charSequence) {
        int i8 = 0;
        if (pattern != null && charSequence != null) {
            while (pattern.matcher(charSequence).find()) {
                i8++;
            }
        }
        return i8;
    }

    public static List<String> findAll(Pattern pattern, CharSequence charSequence, int i8) {
        return (List) findAll(pattern, charSequence, i8, new ArrayList());
    }

    public static String get(String str, CharSequence charSequence, String str2) {
        if (charSequence == null || str == null) {
            return null;
        }
        return get(cn.hutool.core.lang.n0.get(str, 32), charSequence, str2);
    }

    public static List<String> getAllGroups(Pattern pattern, CharSequence charSequence, boolean z7, boolean z8) {
        if (charSequence == null || pattern == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Matcher matcher = pattern.matcher(charSequence);
        while (matcher.find()) {
            int groupCount = matcher.groupCount();
            for (int i8 = !z7 ? 1 : 0; i8 <= groupCount; i8++) {
                arrayList.add(matcher.group(i8));
            }
            if (!z8) {
                break;
            }
        }
        return arrayList;
    }

    public static MatchResult indexOf(Pattern pattern, CharSequence charSequence) {
        if (pattern == null || charSequence == null) {
            return null;
        }
        Matcher matcher = pattern.matcher(charSequence);
        if (matcher.find()) {
            return matcher.toMatchResult();
        }
        return null;
    }

    public static MatchResult lastIndexOf(Pattern pattern, CharSequence charSequence) {
        MatchResult matchResult = null;
        if (pattern != null && charSequence != null) {
            Matcher matcher = pattern.matcher(charSequence);
            while (matcher.find()) {
                matchResult = matcher.toMatchResult();
            }
        }
        return matchResult;
    }

    public static String replaceAll(CharSequence charSequence, Pattern pattern, String str) {
        if (cn.hutool.core.text.l.isEmpty(charSequence)) {
            return cn.hutool.core.text.l.str(charSequence);
        }
        Matcher matcher = pattern.matcher(charSequence);
        if (matcher.find()) {
            Set<String> set = (Set) findAll(cn.hutool.core.lang.n0.GROUP_VAR, str, 1, new TreeSet(cn.hutool.core.comparator.f.INSTANCE.reversed()));
            StringBuffer stringBuffer = new StringBuffer();
            do {
                String str2 = str;
                for (String str3 : set) {
                    str2 = str2.replace("$" + str3, matcher.group(Integer.parseInt(str3)));
                }
                matcher.appendReplacement(stringBuffer, escape(str2));
            } while (matcher.find());
            matcher.appendTail(stringBuffer);
            return stringBuffer.toString();
        }
        return cn.hutool.core.text.l.str(charSequence);
    }

    public static String delPre(Pattern pattern, CharSequence charSequence) {
        if (charSequence != null && pattern != null) {
            Matcher matcher = pattern.matcher(charSequence);
            if (matcher.find()) {
                return cn.hutool.core.text.l.sub(charSequence, matcher.end(), charSequence.length());
            }
            return cn.hutool.core.text.l.str(charSequence);
        }
        return cn.hutool.core.text.l.str(charSequence);
    }

    public static <T extends Collection<String>> T findAll(Pattern pattern, CharSequence charSequence, final int i8, final T t7) {
        if (pattern == null || charSequence == null) {
            return null;
        }
        cn.hutool.core.lang.q.notNull(t7, "Collection must be not null !", new Object[0]);
        findAll(pattern, charSequence, (Consumer<Matcher>) new Consumer() { // from class: cn.hutool.core.util.o0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                p0.lambda$findAll$4(t7, i8, (Matcher) obj);
            }
        });
        return t7;
    }

    public static boolean isMatch(Pattern pattern, CharSequence charSequence) {
        if (charSequence == null || pattern == null) {
            return false;
        }
        return pattern.matcher(charSequence).matches();
    }

    public static String delAll(Pattern pattern, CharSequence charSequence) {
        if (pattern != null && !cn.hutool.core.text.l.isEmpty(charSequence)) {
            return pattern.matcher(charSequence).replaceAll("");
        }
        return cn.hutool.core.text.l.str(charSequence);
    }

    public static String delFirst(Pattern pattern, CharSequence charSequence) {
        return replaceFirst(pattern, charSequence, "");
    }

    public static String delLast(Pattern pattern, CharSequence charSequence) {
        MatchResult lastIndexOf;
        if (pattern != null && cn.hutool.core.text.l.isNotEmpty(charSequence) && (lastIndexOf = lastIndexOf(pattern, charSequence)) != null) {
            return cn.hutool.core.text.l.subPre(charSequence, lastIndexOf.start()) + cn.hutool.core.text.l.subSuf(charSequence, lastIndexOf.end());
        }
        return cn.hutool.core.text.l.str(charSequence);
    }

    public static String get(Pattern pattern, CharSequence charSequence, final int i8) {
        if (charSequence == null || pattern == null) {
            return null;
        }
        final MutableObj mutableObj = new MutableObj();
        get(pattern, charSequence, (Consumer<Matcher>) new Consumer() { // from class: cn.hutool.core.util.m0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                p0.lambda$get$0(MutableObj.this, i8, (Matcher) obj);
            }
        });
        return (String) mutableObj.get();
    }

    public static String escape(CharSequence charSequence) {
        if (cn.hutool.core.text.l.isBlank(charSequence)) {
            return cn.hutool.core.text.l.str(charSequence);
        }
        StringBuilder sb = new StringBuilder();
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = charSequence.charAt(i8);
            if (RE_KEYS.contains(Character.valueOf(charAt))) {
                sb.append(cn.hutool.core.io.file.c.WINDOWS_SEPARATOR);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static void findAll(Pattern pattern, CharSequence charSequence, Consumer<Matcher> consumer) {
        if (pattern == null || charSequence == null) {
            return;
        }
        Matcher matcher = pattern.matcher(charSequence);
        while (matcher.find()) {
            consumer.accept(matcher);
        }
    }

    public static String get(Pattern pattern, CharSequence charSequence, final String str) {
        if (charSequence == null || pattern == null || str == null) {
            return null;
        }
        final MutableObj mutableObj = new MutableObj();
        get(pattern, charSequence, (Consumer<Matcher>) new Consumer() { // from class: cn.hutool.core.util.l0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                p0.lambda$get$1(MutableObj.this, str, (Matcher) obj);
            }
        });
        return (String) mutableObj.get();
    }

    public static String extractMulti(String str, CharSequence charSequence, String str2) {
        if (charSequence == null || str == null || str2 == null) {
            return null;
        }
        return extractMulti(cn.hutool.core.lang.n0.get(str, 32), charSequence, str2);
    }

    public static String extractMultiAndDelPre(String str, p.a aVar, String str2) {
        if (aVar == null || str == null || str2 == null) {
            return null;
        }
        return extractMultiAndDelPre(cn.hutool.core.lang.n0.get(str, 32), aVar, str2);
    }

    public static void get(Pattern pattern, CharSequence charSequence, Consumer<Matcher> consumer) {
        if (charSequence == null || pattern == null || consumer == null) {
            return;
        }
        Matcher matcher = pattern.matcher(charSequence);
        if (matcher.find()) {
            consumer.accept(matcher);
        }
    }

    public static String replaceAll(CharSequence charSequence, String str, Func1<Matcher, String> func1) {
        return replaceAll(charSequence, Pattern.compile(str), func1);
    }

    public static String replaceAll(CharSequence charSequence, Pattern pattern, Func1<Matcher, String> func1) {
        if (cn.hutool.core.text.l.isEmpty(charSequence)) {
            return cn.hutool.core.text.l.str(charSequence);
        }
        Matcher matcher = pattern.matcher(charSequence);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            try {
                matcher.appendReplacement(stringBuffer, func1.call(matcher));
            } catch (Exception e8) {
                throw new UtilException(e8);
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
