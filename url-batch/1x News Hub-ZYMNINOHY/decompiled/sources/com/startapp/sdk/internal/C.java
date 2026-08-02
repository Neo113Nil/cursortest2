package com.startapp.sdk.internal;

import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class C implements zi, ck, me {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3522a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j8 f3523b;

    public /* synthetic */ C(j8 j8Var, int i3) {
        this.f3522a = i3;
        this.f3523b = j8Var;
    }

    @Override // com.startapp.sdk.internal.ck, com.startapp.sdk.internal.me
    public void a(String str) {
        switch (this.f3522a) {
            case 1:
                this.f3523b.a(str);
                break;
            default:
                this.f3523b.b(str);
                break;
        }
    }

    @Override // com.startapp.sdk.internal.zi
    public void a(List list, VASTErrorCodes vASTErrorCodes) {
        this.f3523b.a(list, vASTErrorCodes);
    }
}
