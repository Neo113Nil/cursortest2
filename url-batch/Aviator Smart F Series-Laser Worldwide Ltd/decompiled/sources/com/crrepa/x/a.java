package com.crrepa.x;

import java.io.File;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13975a = "GET";

    /* renamed from: b, reason: collision with root package name */
    private static final String f13976b = "POST";

    /* renamed from: c, reason: collision with root package name */
    public static final String f13977c = "file/*";

    /* renamed from: d, reason: collision with root package name */
    public static final String f13978d = "image/*";

    /* renamed from: e, reason: collision with root package name */
    public static final String f13979e = "audio/*";

    /* renamed from: f, reason: collision with root package name */
    public static final String f13980f = "video/*";

    public static void a(String str, com.crrepa.y.a aVar) {
        a(str, (Map<String, String>) null, aVar);
    }

    public static void b(String str, com.crrepa.y.a aVar) {
        b(str, null, null, aVar);
    }

    public static void c(String str, com.crrepa.y.a aVar) {
        c(str, null, aVar);
    }

    public static void a(String str, com.crrepa.y.b bVar) {
        a(str, (Map<String, String>) null, bVar);
    }

    public static void b(String str, Map<String, String> map, com.crrepa.y.a aVar) {
        b(str, map, null, aVar);
    }

    public static void c(String str, Map<String, String> map, com.crrepa.y.a aVar) {
        c(str, map, null, aVar);
    }

    public static void a(String str, File file, String str2, String str3, com.crrepa.y.a aVar) {
        a(str, file, str2, str3, (Map<String, String>) null, aVar);
    }

    public static void b(String str, Map<String, String> map, Map<String, String> map2, com.crrepa.y.a aVar) {
        new d("GET", str, map, map2, aVar).a();
    }

    public static void c(String str, Map<String, String> map, Map<String, String> map2, com.crrepa.y.a aVar) {
        new d("POST", str, map, map2, aVar).a();
    }

    public static void a(String str, File file, String str2, String str3, Map<String, String> map, com.crrepa.y.a aVar) {
        a(str, file, str2, str3, map, (Map<String, String>) null, aVar);
    }

    public static void a(String str, File file, String str2, String str3, Map<String, String> map, Map<String, String> map2, com.crrepa.y.a aVar) {
        new d(str, file, null, null, str2, str3, map, map2, aVar).a();
    }

    public static void a(String str, String str2, com.crrepa.y.a aVar) {
        a(str, str2, (Map<String, String>) null, aVar);
    }

    public static void a(String str, String str2, Map<String, String> map, com.crrepa.y.a aVar) {
        new d(str, str2, map, aVar).a();
    }

    public static void a(String str, List<File> list, String str2, String str3, com.crrepa.y.a aVar) {
        a(str, list, str2, str3, (Map<String, String>) null, aVar);
    }

    public static void a(String str, List<File> list, String str2, String str3, Map<String, String> map, com.crrepa.y.a aVar) {
        a(str, list, str2, str3, map, (Map<String, String>) null, aVar);
    }

    public static void a(String str, List<File> list, String str2, String str3, Map<String, String> map, Map<String, String> map2, com.crrepa.y.a aVar) {
        new d(str, null, list, null, str2, str3, map, map2, aVar).a();
    }

    public static void a(String str, Map<String, String> map, com.crrepa.y.a aVar) {
        a(str, map, (Map<String, String>) null, aVar);
    }

    public static void a(String str, Map<String, String> map, com.crrepa.y.b bVar) {
        b(str, map, null, bVar);
    }

    public static void a(String str, Map<String, File> map, String str2, com.crrepa.y.a aVar) {
        a(str, map, str2, (Map<String, String>) null, aVar);
    }

    public static void a(String str, Map<String, File> map, String str2, Map<String, String> map2, com.crrepa.y.a aVar) {
        a(str, map, str2, map2, (Map<String, String>) null, aVar);
    }

    public static void a(String str, Map<String, File> map, String str2, Map<String, String> map2, Map<String, String> map3, com.crrepa.y.a aVar) {
        new d(str, null, null, map, null, str2, map2, map3, aVar).a();
    }

    public static void a(String str, Map<String, String> map, Map<String, String> map2, com.crrepa.y.a aVar) {
        b(str, map, map2, aVar);
    }
}
