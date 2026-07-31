package okhttp3;

import c2.AbstractC1380c;
import i2.InterfaceC2471a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.AbstractC3237c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.Util;

@Metadata
/* loaded from: classes3.dex */
public final class Headers implements Iterable<Pair<? extends String, ? extends String>>, InterfaceC2471a {

    /* renamed from: c, reason: collision with root package name */
    public static final Companion f42387c = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private final String[] f42388b;

    @Metadata
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final List f42389a = new ArrayList(20);

        public final Builder a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Companion companion = Headers.f42387c;
            companion.d(name);
            companion.e(value, name);
            c(name, value);
            return this;
        }

        public final Builder b(String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            int b02 = StringsKt.b0(line, ':', 1, false, 4, null);
            if (b02 != -1) {
                String substring = line.substring(0, b02);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = line.substring(b02 + 1);
                Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
                c(substring, substring2);
                return this;
            }
            if (line.charAt(0) != ':') {
                c("", line);
                return this;
            }
            String substring3 = line.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String).substring(startIndex)");
            c("", substring3);
            return this;
        }

        public final Builder c(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f42389a.add(name);
            this.f42389a.add(StringsKt.W0(value).toString());
            return this;
        }

        public final Headers d() {
            return new Headers((String[]) this.f42389a.toArray(new String[0]), null);
        }

        public final String e(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            int size = this.f42389a.size() - 2;
            int c4 = AbstractC1380c.c(size, 0, -2);
            if (c4 > size) {
                return null;
            }
            while (!StringsKt.w(name, (String) this.f42389a.get(size), true)) {
                if (size == c4) {
                    return null;
                }
                size -= 2;
            }
            return (String) this.f42389a.get(size + 1);
        }

        public final List f() {
            return this.f42389a;
        }

        public final Builder g(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            int i4 = 0;
            while (i4 < this.f42389a.size()) {
                if (StringsKt.w(name, (String) this.f42389a.get(i4), true)) {
                    this.f42389a.remove(i4);
                    this.f42389a.remove(i4);
                    i4 -= 2;
                }
                i4 += 2;
            }
            return this;
        }

        public final Builder h(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Companion companion = Headers.f42387c;
            companion.d(name);
            companion.e(value, name);
            g(name);
            c(name, value);
            return this;
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i4 = 0; i4 < length; i4++) {
                char charAt = str.charAt(i4);
                if ('!' > charAt || charAt >= 127) {
                    throw new IllegalArgumentException(Util.s("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i4), str).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(String str, String str2) {
            int length = str.length();
            for (int i4 = 0; i4 < length; i4++) {
                char charAt = str.charAt(i4);
                if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Util.s("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i4), str2));
                    sb.append(Util.G(str2) ? "" : ": " + str);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String f(String[] strArr, String str) {
            int length = strArr.length - 2;
            int c4 = AbstractC1380c.c(length, 0, -2);
            if (c4 > length) {
                return null;
            }
            while (!StringsKt.w(str, strArr[length], true)) {
                if (length == c4) {
                    return null;
                }
                length -= 2;
            }
            return strArr[length + 1];
        }

        public final Headers g(String... namesAndValues) {
            Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
            if (namesAndValues.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr = (String[]) namesAndValues.clone();
            int length = strArr.length;
            int i4 = 0;
            for (int i5 = 0; i5 < length; i5++) {
                String str = strArr[i5];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr[i5] = StringsKt.W0(str).toString();
            }
            int c4 = AbstractC1380c.c(0, strArr.length - 1, 2);
            if (c4 >= 0) {
                while (true) {
                    String str2 = strArr[i4];
                    String str3 = strArr[i4 + 1];
                    d(str2);
                    e(str3, str2);
                    if (i4 == c4) {
                        break;
                    }
                    i4 += 2;
                }
            }
            return new Headers(strArr, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ Headers(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }

    public final String b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return f42387c.f(this.f42388b, name);
    }

    public final String d(int i4) {
        return this.f42388b[i4 * 2];
    }

    public final Builder e() {
        Builder builder = new Builder();
        CollectionsKt.addAll(builder.f(), this.f42388b);
        return builder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Headers) && Arrays.equals(this.f42388b, ((Headers) obj).f42388b);
    }

    public final String f(int i4) {
        return this.f42388b[(i4 * 2) + 1];
    }

    public final List g(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i4 = 0; i4 < size; i4++) {
            if (StringsKt.w(name, d(i4), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(f(i4));
            }
        }
        if (arrayList == null) {
            return CollectionsKt.emptyList();
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return unmodifiableList;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f42388b);
    }

    @Override // java.lang.Iterable
    public Iterator<Pair<? extends String, ? extends String>> iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i4 = 0; i4 < size; i4++) {
            pairArr[i4] = TuplesKt.to(d(i4), f(i4));
        }
        return AbstractC3237c.a(pairArr);
    }

    public final int size() {
        return this.f42388b.length / 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            String d4 = d(i4);
            String f4 = f(i4);
            sb.append(d4);
            sb.append(": ");
            if (Util.G(d4)) {
                f4 = "██";
            }
            sb.append(f4);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    private Headers(String[] strArr) {
        this.f42388b = strArr;
    }
}
