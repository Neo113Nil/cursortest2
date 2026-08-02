package com.startapp.sdk.internal;

import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class E implements zi, ck, me {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6622a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j8 f6623b;

    public /* synthetic */ E(j8 j8Var, int i4) {
        this.f6622a = i4;
        this.f6623b = j8Var;
    }

    @Override // com.startapp.sdk.internal.ck, com.startapp.sdk.internal.me
    public void a(String str) {
        switch (this.f6622a) {
            case 1:
                this.f6623b.a(str);
                break;
            default:
                this.f6623b.b(str);
                break;
        }
    }

    @Override // com.startapp.sdk.internal.zi
    public void a(List list, VASTErrorCodes vASTErrorCodes) {
        this.f6623b.a(list, vASTErrorCodes);
    }
}
