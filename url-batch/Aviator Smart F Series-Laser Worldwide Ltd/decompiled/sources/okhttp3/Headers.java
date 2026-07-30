package okhttp3;

import b6.c;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.v;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.w;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.t;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import y5.h;

/* loaded from: classes5.dex */
public final class Headers implements Iterable<Pair<? extends String, ? extends String>>, g6.a {
    public static final Companion Companion = new Companion(null);
    private final String[] namesAndValues;

    public static final class Builder {
        private final List<String> namesAndValues = new ArrayList(20);

        public final Builder add(String line) {
            s.checkNotNullParameter(line, "line");
            int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) line, ':', 0, false, 6, (Object) null);
            if (indexOf$default == -1) {
                throw new IllegalArgumentException(s.stringPlus("Unexpected header: ", line).toString());
            }
            String substring = line.substring(0, indexOf$default);
            s.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String obj = StringsKt__StringsKt.trim((CharSequence) substring).toString();
            String substring2 = line.substring(indexOf$default + 1);
            s.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
            add(obj, substring2);
            return this;
        }

        public final Builder addAll(Headers headers) {
            s.checkNotNullParameter(headers, "headers");
            int size = headers.size();
            for (int i8 = 0; i8 < size; i8++) {
                addLenient$okhttp(headers.name(i8), headers.value(i8));
            }
            return this;
        }

        public final Builder addLenient$okhttp(String line) {
            s.checkNotNullParameter(line, "line");
            int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) line, ':', 1, false, 4, (Object) null);
            if (indexOf$default != -1) {
                String substring = line.substring(0, indexOf$default);
                s.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = line.substring(indexOf$default + 1);
                s.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
                addLenient$okhttp(substring, substring2);
            } else if (line.charAt(0) == ':') {
                String substring3 = line.substring(1);
                s.checkNotNullExpressionValue(substring3, "this as java.lang.String).substring(startIndex)");
                addLenient$okhttp("", substring3);
            } else {
                addLenient$okhttp("", line);
            }
            return this;
        }

        public final Builder addUnsafeNonAscii(String name, String value) {
            s.checkNotNullParameter(name, "name");
            s.checkNotNullParameter(value, "value");
            Headers.Companion.checkName(name);
            addLenient$okhttp(name, value);
            return this;
        }

        public final Headers build() {
            Object[] array = this.namesAndValues.toArray(new String[0]);
            if (array != null) {
                return new Headers((String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final String get(String name) {
            s.checkNotNullParameter(name, "name");
            int size = this.namesAndValues.size() - 2;
            int progressionLastElement = c.getProgressionLastElement(size, 0, -2);
            if (progressionLastElement > size) {
                return null;
            }
            while (true) {
                int i8 = size - 2;
                if (t.equals(name, this.namesAndValues.get(size), true)) {
                    return this.namesAndValues.get(size + 1);
                }
                if (size == progressionLastElement) {
                    return null;
                }
                size = i8;
            }
        }

        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        public final Builder removeAll(String name) {
            s.checkNotNullParameter(name, "name");
            int i8 = 0;
            while (i8 < getNamesAndValues$okhttp().size()) {
                if (t.equals(name, getNamesAndValues$okhttp().get(i8), true)) {
                    getNamesAndValues$okhttp().remove(i8);
                    getNamesAndValues$okhttp().remove(i8);
                    i8 -= 2;
                }
                i8 += 2;
            }
            return this;
        }

        public final Builder set(String name, Date value) {
            s.checkNotNullParameter(name, "name");
            s.checkNotNullParameter(value, "value");
            set(name, DatesKt.toHttpDateString(value));
            return this;
        }

        @IgnoreJRERequirement
        public final Builder set(String name, Instant value) {
            long epochMilli;
            s.checkNotNullParameter(name, "name");
            s.checkNotNullParameter(value, "value");
            epochMilli = value.toEpochMilli();
            return set(name, new Date(epochMilli));
        }

        public final Builder set(String name, String value) {
            s.checkNotNullParameter(name, "name");
            s.checkNotNullParameter(value, "value");
            Companion companion = Headers.Companion;
            companion.checkName(name);
            companion.checkValue(value, name);
            removeAll(name);
            addLenient$okhttp(name, value);
            return this;
        }

        public final Builder add(String name, String value) {
            s.checkNotNullParameter(name, "name");
            s.checkNotNullParameter(value, "value");
            Companion companion = Headers.Companion;
            companion.checkName(name);
            companion.checkValue(value, name);
            addLenient$okhttp(name, value);
            return this;
        }

        public final Builder addLenient$okhttp(String name, String value) {
            s.checkNotNullParameter(name, "name");
            s.checkNotNullParameter(value, "value");
            getNamesAndValues$okhttp().add(name);
            getNamesAndValues$okhttp().add(StringsKt__StringsKt.trim((CharSequence) value).toString());
            return this;
        }

        public final Builder add(String name, Date value) {
            s.checkNotNullParameter(name, "name");
            s.checkNotNullParameter(value, "value");
            add(name, DatesKt.toHttpDateString(value));
            return this;
        }

        @IgnoreJRERequirement
        public final Builder add(String name, Instant value) {
            long epochMilli;
            s.checkNotNullParameter(name, "name");
            s.checkNotNullParameter(value, "value");
            epochMilli = value.toEpochMilli();
            add(name, new Date(epochMilli));
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkName(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            int i8 = 0;
            while (i8 < length) {
                int i9 = i8 + 1;
                char charAt = str.charAt(i8);
                if ('!' > charAt || charAt >= 127) {
                    throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i8), str).toString());
                }
                i8 = i9;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkValue(String str, String str2) {
            int length = str.length();
            int i8 = 0;
            while (i8 < length) {
                int i9 = i8 + 1;
                char charAt = str.charAt(i8);
                if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                    throw new IllegalArgumentException(s.stringPlus(Util.format("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i8), str2), Util.isSensitiveHeader(str2) ? "" : s.stringPlus(": ", str)).toString());
                }
                i8 = i9;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String get(String[] strArr, String str) {
            int length = strArr.length - 2;
            int progressionLastElement = c.getProgressionLastElement(length, 0, -2);
            if (progressionLastElement > length) {
                return null;
            }
            while (true) {
                int i8 = length - 2;
                if (t.equals(str, strArr[length], true)) {
                    return strArr[length + 1];
                }
                if (length == progressionLastElement) {
                    return null;
                }
                length = i8;
            }
        }

        /* renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m1350deprecated_of(String... namesAndValues) {
            s.checkNotNullParameter(namesAndValues, "namesAndValues");
            return of((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        public final Headers of(String... namesAndValues) {
            s.checkNotNullParameter(namesAndValues, "namesAndValues");
            if (namesAndValues.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            String[] strArr = (String[]) namesAndValues.clone();
            int length = strArr.length;
            int i8 = 0;
            int i9 = 0;
            while (i9 < length) {
                int i10 = i9 + 1;
                String str = strArr[i9];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                strArr[i9] = StringsKt__StringsKt.trim((CharSequence) str).toString();
                i9 = i10;
            }
            int progressionLastElement = c.getProgressionLastElement(0, strArr.length - 1, 2);
            if (progressionLastElement >= 0) {
                while (true) {
                    int i11 = i8 + 2;
                    String str2 = strArr[i8];
                    String str3 = strArr[i8 + 1];
                    checkName(str2);
                    checkValue(str3, str2);
                    if (i8 == progressionLastElement) {
                        break;
                    }
                    i8 = i11;
                }
            }
            return new Headers(strArr, null);
        }

        /* renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m1349deprecated_of(Map<String, String> headers) {
            s.checkNotNullParameter(headers, "headers");
            return of(headers);
        }

        public final Headers of(Map<String, String> map) {
            s.checkNotNullParameter(map, "<this>");
            String[] strArr = new String[map.size() * 2];
            int i8 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String obj = StringsKt__StringsKt.trim((CharSequence) key).toString();
                String obj2 = StringsKt__StringsKt.trim((CharSequence) value).toString();
                checkName(obj);
                checkValue(obj2, obj);
                strArr[i8] = obj;
                strArr[i8 + 1] = obj2;
                i8 += 2;
            }
            return new Headers(strArr, null);
        }
    }

    public /* synthetic */ Headers(String[] strArr, o oVar) {
        this(strArr);
    }

    public static final Headers of(Map<String, String> map) {
        return Companion.of(map);
    }

    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m1348deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        for (int i8 = 0; i8 < strArr.length; i8++) {
            length += this.namesAndValues[i8].length();
        }
        return length;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) obj).namesAndValues);
    }

    public final String get(String name) {
        s.checkNotNullParameter(name, "name");
        return Companion.get(this.namesAndValues, name);
    }

    public final Date getDate(String name) {
        s.checkNotNullParameter(name, "name");
        String str = get(name);
        if (str == null) {
            return null;
        }
        return DatesKt.toHttpDateOrNull(str);
    }

    @IgnoreJRERequirement
    public final Instant getInstant(String name) {
        Instant instant;
        s.checkNotNullParameter(name, "name");
        Date date = getDate(name);
        if (date == null) {
            return null;
        }
        instant = date.toInstant();
        return instant;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @Override // java.lang.Iterable
    public Iterator<Pair<? extends String, ? extends String>> iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i8 = 0; i8 < size; i8++) {
            pairArr[i8] = h.to(name(i8), value(i8));
        }
        return kotlin.jvm.internal.h.iterator(pairArr);
    }

    public final String name(int i8) {
        return this.namesAndValues[i8 * 2];
    }

    public final Set<String> names() {
        Comparator case_insensitive_order;
        case_insensitive_order = t.getCASE_INSENSITIVE_ORDER(w.INSTANCE);
        TreeSet treeSet = new TreeSet(case_insensitive_order);
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            treeSet.add(name(i8));
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(treeSet);
        s.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(result)");
        return unmodifiableSet;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        v.addAll(builder.getNamesAndValues$okhttp(), this.namesAndValues);
        return builder;
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    public final Map<String, List<String>> toMultimap() {
        Comparator case_insensitive_order;
        case_insensitive_order = t.getCASE_INSENSITIVE_ORDER(w.INSTANCE);
        TreeMap treeMap = new TreeMap(case_insensitive_order);
        int size = size();
        int i8 = 0;
        while (i8 < size) {
            int i9 = i8 + 1;
            String name = name(i8);
            Locale US = Locale.US;
            s.checkNotNullExpressionValue(US, "US");
            String lowerCase = name.toLowerCase(US);
            s.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(value(i8));
            i8 = i9;
        }
        return treeMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        int i8 = 0;
        while (i8 < size) {
            int i9 = i8 + 1;
            String name = name(i8);
            String value = value(i8);
            sb.append(name);
            sb.append(": ");
            if (Util.isSensitiveHeader(name)) {
                value = "██";
            }
            sb.append(value);
            sb.append("\n");
            i8 = i9;
        }
        String sb2 = sb.toString();
        s.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String value(int i8) {
        return this.namesAndValues[(i8 * 2) + 1];
    }

    public final List<String> values(String name) {
        s.checkNotNullParameter(name, "name");
        int size = size();
        ArrayList arrayList = null;
        int i8 = 0;
        while (i8 < size) {
            int i9 = i8 + 1;
            if (t.equals(name, name(i8), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i8));
            }
            i8 = i9;
        }
        if (arrayList == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        s.checkNotNullExpressionValue(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return unmodifiableList;
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    public static final Headers of(String... strArr) {
        return Companion.of(strArr);
    }
}
