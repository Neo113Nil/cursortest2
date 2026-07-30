package com.google.android.gms.internal.ads;

import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.ads.hK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3307hK implements InterfaceC3361iK, InterfaceC4277zL, InterfaceC3404jB, InterfaceC3865ro {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C3307hK f31226u = new C3307hK((byte) 0, 11);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C3307hK f31227v = new C3307hK((byte) 0, 13);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ C3307hK f31228w = new C3307hK((byte) 0, 17);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f31229n;

    public /* synthetic */ C3307hK(byte b9, int i) {
        this.f31229n = i;
    }

    public static final InterfaceC3630nL f(long j9, Object obj) {
        InterfaceC3630nL interfaceC3630nL = (InterfaceC3630nL) AbstractC3036cM.j(j9, obj);
        if (((JK) interfaceC3630nL).f25759n) {
            return interfaceC3630nL;
        }
        int size = interfaceC3630nL.size();
        InterfaceC3630nL A8 = interfaceC3630nL.A(size == 0 ? 10 : size + size);
        AbstractC3036cM.k(j9, obj, A8);
        return A8;
    }

    public static final C4169xL g(Object obj, Object obj2) {
        C4169xL c4169xL = (C4169xL) obj;
        C4169xL c4169xL2 = (C4169xL) obj2;
        if (!c4169xL2.isEmpty()) {
            if (!c4169xL.f35142n) {
                c4169xL = c4169xL.h();
            }
            c4169xL.j();
            if (!c4169xL2.isEmpty()) {
                c4169xL.putAll(c4169xL2);
            }
        }
        return c4169xL;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3404jB
    public /* synthetic */ Object a() {
        return new PN();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3865ro
    /* renamed from: b */
    public void mo2b(Object obj) {
        switch (this.f31229n) {
            case 12:
                ((I6) obj).w();
                break;
            case 13:
                break;
            case 14:
                int i = C3093dO.f30001K0;
                ((I6) obj).c();
                break;
            case 15:
                int i4 = C3093dO.f30001K0;
                ((I6) obj).u();
                break;
            case 16:
                int i9 = C3093dO.f30001K0;
                ((I6) obj).n();
                break;
            case 17:
                int i10 = C3093dO.f30001K0;
                ((I6) obj).g0(new RN(2, new B0.c("Player release timed out."), 1003));
                break;
            case 18:
                int i11 = C3093dO.f30001K0;
                ((I6) obj).t();
                break;
            case 19:
                int i12 = C3093dO.f30001K0;
                ((I6) obj).i();
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                break;
            default:
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4277zL
    public boolean c(Class cls) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3361iK
    public /* bridge */ /* synthetic */ Object d(String str, Provider provider) {
        switch (this.f31229n) {
            case 0:
                return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
            case 1:
                return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
            case 2:
                return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
            case 3:
                return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
            default:
                return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4277zL
    public KL e(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    public /* synthetic */ C3307hK(int i) {
        this.f31229n = 16;
    }
}
