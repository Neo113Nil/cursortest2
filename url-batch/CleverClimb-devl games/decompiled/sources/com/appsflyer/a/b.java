package com.appsflyer.a;

import java.util.Scanner;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private String f3413a;

    /* renamed from: b, reason: collision with root package name */
    private String f3414b;

    /* renamed from: c, reason: collision with root package name */
    private String f3415c;

    /* renamed from: d, reason: collision with root package name */
    private String f3416d;

    public b(String str, String str2, String str3) {
        this.f3415c = str;
        this.f3414b = str2;
        this.f3413a = str3;
    }

    public b(char[] cArr) {
        Scanner scanner = new Scanner(new String(cArr));
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            if (nextLine.startsWith("url=")) {
                this.f3415c = nextLine.substring(4).trim();
            } else if (nextLine.startsWith("version=")) {
                this.f3413a = nextLine.substring(8).trim();
            } else if (nextLine.startsWith("data=")) {
                this.f3414b = nextLine.substring(5).trim();
            }
        }
        scanner.close();
    }

    public String a() {
        return this.f3413a;
    }

    public String b() {
        return this.f3414b;
    }

    public String c() {
        return this.f3415c;
    }

    public String d() {
        return this.f3416d;
    }

    public void a(String str) {
        this.f3416d = str;
    }
}
