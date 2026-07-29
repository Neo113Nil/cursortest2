package com.facebook.login;

import com.facebook.AccessToken;
import java.util.Set;

/* compiled from: LoginResult.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final AccessToken f6275a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<String> f6276b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<String> f6277c;

    public g(AccessToken accessToken, Set<String> set, Set<String> set2) {
        this.f6275a = accessToken;
        this.f6276b = set;
        this.f6277c = set2;
    }

    public Set<String> a() {
        return this.f6276b;
    }
}
