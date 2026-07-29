package com.facebook.login;

/* compiled from: DefaultAudience.java */
/* loaded from: classes.dex */
public enum a {
    NONE(null),
    ONLY_ME("only_me"),
    FRIENDS("friends"),
    EVERYONE("everyone");

    private final String e;

    a(String str) {
        this.e = str;
    }

    public String a() {
        return this.e;
    }
}
