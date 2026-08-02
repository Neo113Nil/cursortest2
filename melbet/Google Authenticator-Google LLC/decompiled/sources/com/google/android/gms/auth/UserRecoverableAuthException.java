package com.google.android.gms.auth;

import android.content.Intent;
import defpackage.chh;
import defpackage.chr;
import defpackage.oy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class UserRecoverableAuthException extends chh {
    public final Intent a;
    public final chr b;

    private UserRecoverableAuthException(String str, Intent intent, chr chrVar) {
        super(str);
        this.a = intent;
        oy.at(chrVar);
        this.b = chrVar;
    }

    public static UserRecoverableAuthException a(String str, Intent intent) {
        oy.at(intent);
        return new UserRecoverableAuthException(str, intent, chr.b);
    }

    public UserRecoverableAuthException(String str, Intent intent) {
        this(str, intent, chr.a);
    }
}
