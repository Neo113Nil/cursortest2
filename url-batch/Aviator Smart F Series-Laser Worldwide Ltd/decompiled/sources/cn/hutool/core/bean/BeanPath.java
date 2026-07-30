package cn.hutool.core.bean;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.collection.n0;
import cn.hutool.core.map.h1;
import cn.hutool.core.util.d0;
import cn.hutool.core.util.g0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class BeanPath implements Serializable {
    private static final char[] EXP_CHARS = {'.', '[', ']'};
    private static final long serialVersionUID = 1;
    private boolean isStartWith = false;
    protected List<String> patternParts;

    public BeanPath(String str) {
        init(str);
    }

    public static BeanPath create(String str) {
        return new BeanPath(str);
    }

    private static Object getFieldValue(Object obj, String str) {
        if (cn.hutool.core.text.l.isBlank(str)) {
            return null;
        }
        if (cn.hutool.core.text.l.contains((CharSequence) str, ':')) {
            List<String> splitTrim = cn.hutool.core.text.l.splitTrim((CharSequence) str, ':');
            int parseInt = Integer.parseInt(splitTrim.get(0));
            int parseInt2 = Integer.parseInt(splitTrim.get(1));
            int parseInt3 = 3 == splitTrim.size() ? Integer.parseInt(splitTrim.get(2)) : 1;
            if (obj instanceof Collection) {
                return CollUtil.sub((Collection) obj, parseInt, parseInt2, parseInt3);
            }
            if (cn.hutool.core.util.h.isArray(obj)) {
                return cn.hutool.core.util.h.sub(obj, parseInt, parseInt2, parseInt3);
            }
            return null;
        }
        if (!cn.hutool.core.text.l.contains((CharSequence) str, ',')) {
            return q.getFieldValue(obj, str);
        }
        List<String> splitTrim2 = cn.hutool.core.text.l.splitTrim((CharSequence) str, ',');
        if (obj instanceof Collection) {
            return CollUtil.getAny((Collection) obj, (int[]) cn.hutool.core.convert.d.convert(int[].class, (Object) splitTrim2));
        }
        if (cn.hutool.core.util.h.isArray(obj)) {
            return cn.hutool.core.util.h.getAny(obj, (int[]) cn.hutool.core.convert.d.convert(int[].class, (Object) splitTrim2));
        }
        int size = splitTrim2.size();
        String[] strArr = new String[size];
        for (int i8 = 0; i8 < size; i8++) {
            strArr[i8] = cn.hutool.core.text.l.unWrap(splitTrim2.get(i8), '\'');
        }
        return obj instanceof Map ? h1.getAny((Map) obj, strArr) : h1.getAny(q.beanToMap(obj, new String[0]), strArr);
    }

    private static List<String> getParentParts(List<String> list) {
        return list.subList(0, list.size() - 1);
    }

    private void init(String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        boolean z7 = false;
        boolean z8 = false;
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = str.charAt(i8);
            if (i8 == 0 && '$' == charAt) {
                this.isStartWith = true;
            } else if ('\'' == charAt) {
                z8 = !z8;
            } else if (z8 || !g0.contains(EXP_CHARS, charAt)) {
                sb.append(charAt);
            } else {
                if (']' == charAt) {
                    if (!z7) {
                        throw new IllegalArgumentException(cn.hutool.core.text.l.format("Bad expression '{}':{}, we find ']' but no '[' !", str, Integer.valueOf(i8)));
                    }
                    z7 = false;
                } else {
                    if (z7) {
                        throw new IllegalArgumentException(cn.hutool.core.text.l.format("Bad expression '{}':{}, we find '[' but no ']' !", str, Integer.valueOf(i8)));
                    }
                    if ('[' == charAt) {
                        z7 = true;
                    }
                }
                if (sb.length() > 0) {
                    arrayList.add(sb.toString());
                }
                sb.setLength(0);
            }
        }
        if (z7) {
            throw new IllegalArgumentException(cn.hutool.core.text.l.format("Bad expression '{}':{}, we find '[' but no ']' !", str, Integer.valueOf(length - 1)));
        }
        if (sb.length() > 0) {
            arrayList.add(sb.toString());
        }
        this.patternParts = n0.unmodifiable(arrayList);
    }

    private static boolean lastIsNumber(List<String> list) {
        return d0.isInteger(list.get(list.size() - 1));
    }

    public Object get(Object obj) {
        return get(this.patternParts, obj, false);
    }

    public List<String> getPatternParts() {
        return this.patternParts;
    }

    public void set(Object obj, Object obj2) {
        List<String> list = this.patternParts;
        set(obj, list, lastIsNumber(list), obj2);
    }

    public String toString() {
        return this.patternParts.toString();
    }

    private Object get(List<String> list, Object obj, boolean z7) {
        int size = list.size();
        if (z7) {
            size--;
        }
        Object obj2 = obj;
        boolean z8 = true;
        for (int i8 = 0; i8 < size; i8++) {
            String str = list.get(i8);
            obj2 = getFieldValue(obj2, str);
            if (obj2 == null) {
                if (!z8 || this.isStartWith || !q.isMatchName(obj, str, true)) {
                    return null;
                }
                obj2 = obj;
                z8 = false;
            }
        }
        return obj2;
    }

    private void set(Object obj, List<String> list, boolean z7, Object obj2) {
        Object obj3 = get(list, obj, true);
        if (obj3 == null) {
            List<String> parentParts = getParentParts(list);
            set(obj, parentParts, lastIsNumber(parentParts), z7 ? new ArrayList() : new HashMap());
            obj3 = get(list, obj, true);
        }
        Object fieldValue = q.setFieldValue(obj3, list.get(list.size() - 1), obj2);
        if (fieldValue != obj3) {
            set(obj, getParentParts(list), z7, fieldValue);
        }
    }
}
