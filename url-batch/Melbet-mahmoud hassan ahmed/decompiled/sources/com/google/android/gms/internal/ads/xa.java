package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class xa implements r23 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p03 f14103a;

    xa(za zaVar, p03 p03Var) {
        this.f14103a = p03Var;
    }

    @Override // com.google.android.gms.internal.ads.r23
    public final boolean a(File file) {
        try {
            return this.f14103a.a(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
