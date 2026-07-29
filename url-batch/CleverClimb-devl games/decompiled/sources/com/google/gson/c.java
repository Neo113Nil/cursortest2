package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* compiled from: FieldNamingPolicy.java */
/* loaded from: classes2.dex */
public enum c implements d {
    IDENTITY { // from class: com.google.gson.c.1
        @Override // com.google.gson.d
        public String a(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE { // from class: com.google.gson.c.2
        @Override // com.google.gson.d
        public String a(Field field) {
            return a(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES { // from class: com.google.gson.c.3
        @Override // com.google.gson.d
        public String a(Field field) {
            return a(a(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES { // from class: com.google.gson.c.4
        @Override // com.google.gson.d
        public String a(Field field) {
            return a(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES { // from class: com.google.gson.c.5
        @Override // com.google.gson.d
        public String a(Field field) {
            return a(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS { // from class: com.google.gson.c.6
        @Override // com.google.gson.d
        public String a(Field field) {
            return a(field.getName(), ".").toLowerCase(Locale.ENGLISH);
        }
    };

    static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    static String a(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        char charAt = str.charAt(0);
        int length = str.length();
        while (i < length - 1 && !Character.isLetter(charAt)) {
            sb.append(charAt);
            i++;
            charAt = str.charAt(i);
        }
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        sb.append(a(Character.toUpperCase(charAt), str, i + 1));
        return sb.toString();
    }

    private static String a(char c2, String str, int i) {
        if (i < str.length()) {
            return c2 + str.substring(i);
        }
        return String.valueOf(c2);
    }
}
