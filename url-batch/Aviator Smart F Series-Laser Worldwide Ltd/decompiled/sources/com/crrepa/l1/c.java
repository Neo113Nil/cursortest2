package com.crrepa.l1;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public abstract class c implements com.crrepa.l1.d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f13196a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f13197b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f13198c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f13199d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f13200e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f13201f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ c[] f13202g;

    enum a extends c {
        a(String str, int i8) {
            super(str, i8, null);
        }

        @Override // com.crrepa.l1.c, com.crrepa.l1.d
        public String a(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        f13196a = aVar;
        c cVar = new c("UPPER_CAMEL_CASE", 1) { // from class: com.crrepa.l1.c.b
            {
                a aVar2 = null;
            }

            @Override // com.crrepa.l1.c, com.crrepa.l1.d
            public String a(Field field) {
                return c.a(field.getName());
            }
        };
        f13197b = cVar;
        c cVar2 = new c("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: com.crrepa.l1.c.c
            {
                a aVar2 = null;
            }

            @Override // com.crrepa.l1.c, com.crrepa.l1.d
            public String a(Field field) {
                return c.a(c.a(field.getName(), cn.hutool.core.text.l.SPACE));
            }
        };
        f13198c = cVar2;
        c cVar3 = new c("LOWER_CASE_WITH_UNDERSCORES", 3) { // from class: com.crrepa.l1.c.d
            {
                a aVar2 = null;
            }

            @Override // com.crrepa.l1.c, com.crrepa.l1.d
            public String a(Field field) {
                return c.a(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        };
        f13199d = cVar3;
        c cVar4 = new c("LOWER_CASE_WITH_DASHES", 4) { // from class: com.crrepa.l1.c.e
            {
                a aVar2 = null;
            }

            @Override // com.crrepa.l1.c, com.crrepa.l1.d
            public String a(Field field) {
                return c.a(field.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        };
        f13200e = cVar4;
        c cVar5 = new c("LOWER_CASE_WITH_DOTS", 5) { // from class: com.crrepa.l1.c.f
            {
                a aVar2 = null;
            }

            @Override // com.crrepa.l1.c, com.crrepa.l1.d
            public String a(Field field) {
                return c.a(field.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        };
        f13201f = cVar5;
        f13202g = new c[]{aVar, cVar, cVar2, cVar3, cVar4, cVar5};
    }

    private c(String str, int i8) {
    }

    static String a(String str) {
        int length = str.length() - 1;
        int i8 = 0;
        while (!Character.isLetter(str.charAt(i8)) && i8 < length) {
            i8++;
        }
        char charAt = str.charAt(i8);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        if (i8 == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i8) + upperCase + str.substring(i8 + 1);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f13202g.clone();
    }

    @Override // com.crrepa.l1.d
    public abstract /* synthetic */ String a(Field field);

    /* synthetic */ c(String str, int i8, a aVar) {
        this(str, i8);
    }

    static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = str.charAt(i8);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }
}
