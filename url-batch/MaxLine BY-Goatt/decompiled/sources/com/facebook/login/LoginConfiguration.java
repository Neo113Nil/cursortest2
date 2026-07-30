package com.facebook.login;

import defpackage.lh;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class LoginConfiguration {
    public static final Companion Companion = new Companion(null);
    public static final String OPENID = "openid";
    private final String codeVerifier;
    private final String nonce;
    private final Set<String> permissions;

    public LoginConfiguration(Collection<String> collection, String str, String str2) {
        str.getClass();
        str2.getClass();
        if (!NonceUtil.isValidNonce(str) || !PKCEUtil.isValidCodeVerifier(str2)) {
            lh.e("Failed requirement.");
            throw null;
        }
        HashSet hashSet = collection != null ? new HashSet(collection) : new HashSet();
        hashSet.add(OPENID);
        Set<String> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        unmodifiableSet.getClass();
        this.permissions = unmodifiableSet;
        this.nonce = str;
        this.codeVerifier = str2;
    }

    public final String getCodeVerifier() {
        return this.codeVerifier;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final Set<String> getPermissions() {
        return this.permissions;
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ LoginConfiguration(Collection collection, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(collection, str);
        if ((i & 2) != 0) {
            str = UUID.randomUUID().toString();
            str.getClass();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginConfiguration(Collection<String> collection, String str) {
        this(collection, str, PKCEUtil.generateCodeVerifier());
        str.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ LoginConfiguration(Collection collection, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(collection, str, str2);
        collection = (i & 1) != 0 ? null : collection;
        if ((i & 2) != 0) {
            str = UUID.randomUUID().toString();
            str.getClass();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LoginConfiguration(Collection<String> collection) {
        this(collection, null, 2, 0 == true ? 1 : 0);
    }
}
