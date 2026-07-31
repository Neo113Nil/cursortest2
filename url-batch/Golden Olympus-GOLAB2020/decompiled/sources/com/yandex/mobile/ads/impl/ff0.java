package com.yandex.mobile.ads.impl;

import c2.AbstractC1380c;
import i2.InterfaceC2471a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.AbstractC3237c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ff0 implements Iterable<Pair<? extends String, ? extends String>>, InterfaceC2471a {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String[] f25767b;

    public static final class b {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i4 = 0; i4 < length; i4++) {
                char charAt = str.charAt(i4);
                if ('!' > charAt || charAt >= 127) {
                    throw new IllegalArgumentException(v82.a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i4), str).toString());
                }
            }
        }

        public /* synthetic */ b(int i4) {
            this();
        }

        @NotNull
        public static ff0 a(@NotNull Map map) {
            Intrinsics.checkNotNullParameter(map, "<this>");
            String[] strArr = new String[map.size() * 2];
            int i4 = 0;
            int i5 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                String obj = StringsKt.W0(str).toString();
                String obj2 = StringsKt.W0(str2).toString();
                b(obj);
                b(obj2, obj);
                strArr[i5] = obj;
                strArr[i5 + 1] = obj2;
                i5 += 2;
            }
            return new ff0(strArr, i4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(String str, String str2) {
            int length = str.length();
            for (int i4 = 0; i4 < length; i4++) {
                char charAt = str.charAt(i4);
                if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                    throw new IllegalArgumentException((v82.a("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i4), str2) + (v82.c(str2) ? "" : ": " + str)).toString());
                }
            }
        }

        @NotNull
        public static ff0 a(@NotNull String... namesAndValues) {
            Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
            if (namesAndValues.length % 2 == 0) {
                String[] strArr = (String[]) namesAndValues.clone();
                int length = strArr.length;
                int i4 = 0;
                for (int i5 = 0; i5 < length; i5++) {
                    String str = strArr[i5];
                    if (str != null) {
                        strArr[i5] = StringsKt.W0(str).toString();
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null");
                    }
                }
                int c4 = AbstractC1380c.c(0, strArr.length - 1, 2);
                if (c4 >= 0) {
                    int i6 = 0;
                    while (true) {
                        String str2 = strArr[i6];
                        String str3 = strArr[i6 + 1];
                        b(str2);
                        b(str3, str2);
                        if (i6 == c4) {
                            break;
                        }
                        i6 += 2;
                    }
                }
                return new ff0(strArr, i4);
            }
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
    }

    private ff0(String[] strArr) {
        this.f25767b = strArr;
    }

    @Nullable
    public final String a(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String[] strArr = this.f25767b;
        int length = strArr.length - 2;
        int c4 = AbstractC1380c.c(length, 0, -2);
        if (c4 > length) {
            return null;
        }
        while (!StringsKt.w(name, strArr[length], true)) {
            if (length == c4) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    @NotNull
    public final String b(int i4) {
        return this.f25767b[(i4 * 2) + 1];
    }

    @NotNull
    public final TreeMap c() {
        TreeMap treeMap = new TreeMap(StringsKt.y(kotlin.jvm.internal.L.f41137a));
        int length = this.f25767b.length / 2;
        for (int i4 = 0; i4 < length; i4++) {
            String str = this.f25767b[i4 * 2];
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(b(i4));
        }
        return treeMap;
    }

    @NotNull
    public final List d() {
        Intrinsics.checkNotNullParameter("Set-Cookie", "name");
        int length = this.f25767b.length / 2;
        ArrayList arrayList = null;
        for (int i4 = 0; i4 < length; i4++) {
            if (StringsKt.w("Set-Cookie", this.f25767b[i4 * 2], true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(b(i4));
            }
        }
        if (arrayList == null) {
            return CollectionsKt.emptyList();
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.checkNotNull(unmodifiableList);
        return unmodifiableList;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof ff0) && Arrays.equals(this.f25767b, ((ff0) obj).f25767b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f25767b);
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<Pair<? extends String, ? extends String>> iterator() {
        int length = this.f25767b.length / 2;
        Pair[] pairArr = new Pair[length];
        for (int i4 = 0; i4 < length; i4++) {
            pairArr[i4] = TuplesKt.to(this.f25767b[i4 * 2], b(i4));
        }
        return AbstractC3237c.a(pairArr);
    }

    public final int size() {
        return this.f25767b.length / 2;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.f25767b.length / 2;
        for (int i4 = 0; i4 < length; i4++) {
            String str = this.f25767b[i4 * 2];
            String b4 = b(i4);
            sb.append(str);
            sb.append(": ");
            if (v82.c(str)) {
                b4 = "██";
            }
            sb.append(b4);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    @NotNull
    public final a b() {
        a aVar = new a();
        CollectionsKt.addAll(aVar.b(), this.f25767b);
        return aVar;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ArrayList f25768a = new ArrayList(20);

        @NotNull
        public final void a(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f25768a.add(name);
            this.f25768a.add(StringsKt.W0(value).toString());
        }

        @NotNull
        public final ArrayList b() {
            return this.f25768a;
        }

        @NotNull
        public final a a(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            int i4 = 0;
            while (i4 < this.f25768a.size()) {
                if (StringsKt.w(name, (String) this.f25768a.get(i4), true)) {
                    this.f25768a.remove(i4);
                    this.f25768a.remove(i4);
                    i4 -= 2;
                }
                i4 += 2;
            }
            return this;
        }

        @NotNull
        public final ff0 a() {
            return new ff0((String[]) this.f25768a.toArray(new String[0]), 0);
        }
    }

    public /* synthetic */ ff0(String[] strArr, int i4) {
        this(strArr);
    }

    @NotNull
    public final String a(int i4) {
        return this.f25767b[i4 * 2];
    }
}
