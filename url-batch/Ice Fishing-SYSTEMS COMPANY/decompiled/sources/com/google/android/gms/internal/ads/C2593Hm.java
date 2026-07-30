package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.anythink.core.api.ATAdConst;
import com.google.android.gms.ads.nativead.NativeAd;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import q2.C4927z0;
import t0.AbstractC5051n;
import u2.C5107a;
import z2.InterfaceC5272b;

/* renamed from: com.google.android.gms.internal.ads.Hm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2593Hm implements InterfaceC2639Kh, InterfaceC5272b, LD, Gu, InterfaceC3222fq, Ju, Bt, InterfaceC3701ol, t.i {

    /* renamed from: w, reason: collision with root package name */
    public static C2593Hm f25414w;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f25415n;

    /* renamed from: u, reason: collision with root package name */
    public Object f25416u;

    /* renamed from: v, reason: collision with root package name */
    public Object f25417v;

    public C2593Hm(int i) {
        this.f25415n = i;
        switch (i) {
            case 29:
                this.f25417v = new HashMap();
                this.f25416u = new HashMap();
                break;
            default:
                Mu mu = new Mu(2);
                this.f25417v = mu;
                this.f25416u = new Mt(4, mu);
                break;
        }
    }

    public static BG A(C3789qI c3789qI) {
        return BG.a(c3789qI.B().A(), c3789qI.B().B(), c3789qI.B().C(), c3789qI.D(), c3789qI.D() == EI.RAW ? null : Integer.valueOf(c3789qI.C()));
    }

    public static boolean B(int i) {
        int i4 = i - 2;
        return i4 == 1 || i4 == 2 || i4 == 3;
    }

    public static final C2593Hm d(C3842rI c3842rI) {
        XC c3085dG;
        boolean z8;
        if (c3842rI == null || c3842rI.C() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        ArrayList arrayList = new ArrayList(c3842rI.C());
        for (C3789qI c3789qI : c3842rI.B()) {
            int C7 = c3789qI.C();
            try {
                BG A8 = A(c3789qI);
                C3517lG c3517lG = C3517lG.f32558b;
                HG hg = (HG) c3517lG.f32559a.get();
                hg.getClass();
                c3085dG = !hg.f25341b.containsKey(new FG(BG.class, A8.f24013b)) ? new C3085dG(A8) : c3517lG.e(A8);
                z8 = false;
            } catch (GeneralSecurityException e6) {
                if (IF.f25545a.f32574a.get()) {
                    throw e6;
                }
                c3085dG = new C3085dG(A(c3789qI));
                z8 = true;
            }
            if (IF.f25545a.f32574a.get() && !B(c3789qI.I())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            arrayList.add(new C3838rE(c3085dG, c3789qI.I(), C7, C7 == c3842rI.A(), z8));
        }
        return new C2593Hm(new HashMap(), Collections.unmodifiableList(arrayList));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0117 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C2593Hm y(AbstractC4000uE abstractC4000uE) {
        int i;
        int i4;
        boolean z8;
        com.bumptech.glide.manager.o oVar = new com.bumptech.glide.manager.o(10);
        C3785qE c3785qE = new C3785qE(abstractC4000uE);
        T2 t22 = T2.f27679A;
        c3785qE.f33674c = t22;
        c3785qE.f33672a = true;
        ArrayList arrayList = (ArrayList) oVar.f23624v;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C3785qE) it.next()).f33672a = false;
        }
        arrayList.add(c3785qE);
        if (oVar.f23623u) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        oVar.f23623u = true;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int i9 = 0;
        while (i9 < arrayList.size() - 1) {
            int i10 = i9 + 1;
            if (((C3785qE) arrayList.get(i9)).f33674c == t22 && ((C3785qE) arrayList.get(i10)).f33674c != t22) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i9 = i10;
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = arrayList.iterator();
        Integer num = null;
        while (it2.hasNext()) {
            C3785qE c3785qE2 = (C3785qE) it2.next();
            c3785qE2.getClass();
            T2 t23 = c3785qE2.f33674c;
            if (t23 == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            int i11 = 3;
            if (t23 == t22) {
                int i12 = 0;
                while (true) {
                    if (i12 != 0 && !hashSet.contains(Integer.valueOf(i12))) {
                        break;
                    }
                    int i13 = IG.f25546a;
                    i12 = 0;
                    while (i12 == 0) {
                        byte[] a9 = DG.a(4);
                        i12 = (a9[3] & 255) | ((a9[0] & 255) << 24) | ((a9[1] & 255) << 16) | ((a9[2] & 255) << 8);
                    }
                }
                i = i12;
            } else {
                i = 0;
            }
            Integer valueOf = Integer.valueOf(i);
            if (hashSet.contains(valueOf)) {
                int i14 = i;
                throw new GeneralSecurityException(AbstractC5051n.d(i14, "Id ", " is used twice in the keyset", new StringBuilder(String.valueOf(i14).length() + 31)));
            }
            hashSet.add(valueOf);
            AbstractC4000uE abstractC4000uE2 = c3785qE2.f33673b;
            XC b9 = C3249gG.f30974b.b(abstractC4000uE2, true != abstractC4000uE2.a() ? null : valueOf);
            Object obj = C3731pE.f33363v;
            if (!obj.equals(obj)) {
                if (C3731pE.f33364w.equals(obj)) {
                    i4 = 4;
                    z8 = c3785qE2.f33672a;
                    C3838rE c3838rE = new C3838rE(b9, i4, i, z8, false);
                    if (z8) {
                        if (num != null) {
                            throw new GeneralSecurityException("Two primaries were set");
                        }
                        num = valueOf;
                    }
                    arrayList2.add(c3838rE);
                } else {
                    if (!C3731pE.f33365x.equals(obj)) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    i11 = 5;
                }
            }
            i4 = i11;
            z8 = c3785qE2.f33672a;
            C3838rE c3838rE2 = new C3838rE(b9, i4, i, z8, false);
            if (z8) {
            }
            arrayList2.add(c3838rE2);
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        HashMap hashMap = (HashMap) oVar.f23625w;
        C2593Hm c2593Hm = new C2593Hm(hashMap, arrayList2);
        if (hashMap.get(AbstractC3194fG.class) == null) {
            return c2593Hm;
        }
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3222fq
    public Object a() {
        C5107a c5107a = (C5107a) this.f25417v;
        int i = c5107a.f41218u;
        int length = String.valueOf(i).length();
        int i4 = c5107a.f41219v;
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(i4).length());
        sb.append(i);
        sb.append(com.anythink.core.common.d.j.f12535z);
        sb.append(i4);
        String sb2 = sb.toString();
        if (TextUtils.isEmpty("Google")) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        if (TextUtils.isEmpty(sb2)) {
            throw new IllegalArgumentException("Version is null or empty");
        }
        return new C2955aw(new C3582ma("Google", sb2, 3), (WebView) this.f25416u);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3701ol, com.google.android.gms.internal.ads.InterfaceC3865ro
    /* renamed from: b, reason: collision with other method in class */
    public void mo2b(Object obj) {
        Ku ku = (Ku) this.f25417v;
        ((Pu) obj).u((Lu) ku.f26061n, ku.f26062u, (Throwable) this.f25416u);
    }

    @Override // t.i
    public Object c(t.h hVar) {
        String str;
        String str2;
        Context context = (Context) this.f25417v;
        C3066cy c3066cy = (C3066cy) this.f25416u;
        if (Build.VERSION.SDK_INT < 31) {
            hVar.a("");
            return "";
        }
        try {
            String packageName = context.getPackageName();
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            String[] strArr = {c3066cy.b0(), "308204433082032ba003020102020900c2e08746644a308d300d06092a864886f70d01010405003074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964301e170d3038303832313233313333345a170d3336303130373233313333345a3074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f696430820120300d06092a864886f70d01010105000382010d00308201080282010100ab562e00d83ba208ae0a966f124e29da11f2ab56d08f58e2cca91303e9b754d372f640a71b1dcb130967624e4656a7776a92193db2e5bfb724a91e77188b0e6a47a43b33d9609b77183145ccdf7b2e586674c9e1565b1f4c6a5955bff251a63dabf9c55c27222252e875e4f8154a645f897168c0b1bfc612eabf785769bb34aa7984dc7e2ea2764cae8307d8c17154d7ee5f64a51a44a602c249054157dc02cd5f5c0e55fbef8519fbe327f0b1511692c5a06f19d18385f5c4dbc2d6b93f68cc2979c70e18ab93866b3bd5db8999552a0e3b4c99df58fb918bedc182ba35e003c1b4b10dd244a8ee24fffd333872ab5221985edab0fc0d0b145b6aa192858e79020103a381d93081d6301d0603551d0e04160414c77d8cc2211756259a7fd382df6be398e4d786a53081a60603551d2304819e30819b8014c77d8cc2211756259a7fd382df6be398e4d786a5a178a4763074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964820900c2e08746644a308d300c0603551d13040530030101ff300d06092a864886f70d010104050003820101006dd252ceef85302c360aaace939bcff2cca904bb5d7a1661f8ae46b2994204d0ff4a68c7ed1a531ec4595a623ce60763b167297a7ae35712c407f208f0cb109429124d7b106219c084ca3eb3f9ad5fb871ef92269a8be28bf16d44c8d9a08e6cb2f005bb3fe2cb96447e868e731076ad45b33f6009ea19c161e62641aa99271dfd5228c5c587875ddb7f452758d661f6cc0cccb7352e424cc4365c523532f7325137593c4ae341f4db41edda0d0b1071a7c440f0fe9ea01cb627ca674369d084bd2fd911ff06cdbf2cfa10dc0f893ae35762919048c7efc64c7144178342f70581c9de573af55b390dd7fdb9418631895d5f759f30112687ff621410c069308a"};
            int i = 0;
            int i4 = 0;
            while (true) {
                if (i4 >= 2) {
                    str = "";
                    break;
                }
                str = strArr[i4];
                if (!TextUtils.isEmpty(str)) {
                    break;
                }
                i4++;
            }
            EC ec = HC.f25322f;
            byte[] h9 = ec.f().h(str);
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(h9)));
            if (!Build.TYPE.equals("user")) {
                String[] strArr2 = {c3066cy.c0(), "308204a830820390a003020102020900d585b86c7dd34ef5300d06092a864886f70d0101040500308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d301e170d3038303431353233333635365a170d3335303930313233333635365a308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d30820120300d06092a864886f70d01010105000382010d00308201080282010100d6ce2e080abfe2314dd18db3cfd3185cb43d33fa0c74e1bdb6d1db8913f62c5c39df56f846813d65bec0f3ca426b07c5a8ed5a3990c167e76bc999b927894b8f0b22001994a92915e572c56d2a301ba36fc5fc113ad6cb9e7435a16d23ab7dfaeee165e4df1f0a8dbda70a869d516c4e9d051196ca7c0c557f175bc375f948c56aae86089ba44f8aa6a4dd9a7dbf2c0a352282ad06b8cc185eb15579eef86d080b1d6189c0f9af98b1c2ebd107ea45abdb68a3c7838a5e5488c76c53d40b121de7bbd30e620c188ae1aa61dbbc87dd3c645f2f55f3d4c375ec4070a93f7151d83670c16a971abe5ef2d11890e1b8aef3298cf066bf9e6ce144ac9ae86d1c1b0f020103a381fc3081f9301d0603551d0e041604148d1cc5be954c433c61863a15b04cbc03f24fe0b23081c90603551d230481c13081be80148d1cc5be954c433c61863a15b04cbc03f24fe0b2a1819aa48197308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d820900d585b86c7dd34ef5300c0603551d13040530030101ff300d06092a864886f70d0101040500038201010019d30cf105fb78923f4c0d7dd223233d40967acfce00081d5bd7c6e9d6ed206b0e11209506416ca244939913d26b4aa0e0f524cad2bb5c6e4ca1016a15916ea1ec5dc95a5e3a010036f49248d5109bbf2e1e618186673a3be56daf0b77b1c229e3c255e3e84c905d2387efba09cbf13b202b4e5a22c93263484a23d2fc29fa9f1939759733afd8aa160f4296c2d0163e8182859c6643e9c1962fa0c18333335bc090ff9a6b22ded1ad444229a539a94eefadabd065ced24b3e51e5dd7b66787bef12fe97fba484c423fb4ff8cc494c02f0f5051612ff6529393e8e46eac5bb21f277c151aa5f2aa627d1e89da70ab6033569de3b9897bfff7ca9da3e1243f60b"};
                while (true) {
                    if (i >= 2) {
                        str2 = "";
                        break;
                    }
                    str2 = strArr2[i];
                    if (!TextUtils.isEmpty(str2)) {
                        break;
                    }
                    i++;
                }
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(ec.f().h(str2))));
            }
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new S6(2, hVar));
            return "";
        } catch (PackageManager.NameNotFoundException | NoClassDefFoundError | CertificateException unused) {
            hVar.a("");
            return "";
        }
    }

    public void e(Gu gu) {
        CallableC3454k7 callableC3454k7 = new CallableC3454k7(5, (C2715Op) this.f25417v);
        C3157eg c3157eg = (C3157eg) ((SD) this.f25416u);
        J3.a b9 = c3157eg.b(callableC3454k7);
        b9.c(new MD(0, b9, new Vx(this, gu)), c3157eg);
    }

    public void f(C4002uG c4002uG) {
        if (c4002uG == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        C4110wG c4110wG = new C4110wG(c4002uG.f34575a, c4002uG.f34576b);
        HashMap hashMap = (HashMap) this.f25417v;
        if (!hashMap.containsKey(c4110wG)) {
            hashMap.put(c4110wG, c4002uG);
            return;
        }
        C4002uG c4002uG2 = (C4002uG) hashMap.get(c4110wG);
        if (!c4002uG2.equals(c4002uG) || !c4002uG.equals(c4002uG2)) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(c4110wG.toString()));
        }
    }

    public synchronized J3.a g(C2593Hm c2593Hm, At at, InterfaceC3592mk interfaceC3592mk) {
        C2687Ne c2687Ne;
        this.f25416u = interfaceC3592mk;
        if (interfaceC3592mk == null || (c2687Ne = (C2687Ne) c2593Hm.f25417v) == null) {
            return ((C4086vt) this.f25417v).a(c2593Hm, at, interfaceC3592mk);
        }
        C2709Oj a9 = interfaceC3592mk.a();
        return a9.c(a9.a(C3686oN.c(c2687Ne)));
    }

    public C3842rI h() {
        try {
            C3681oI G7 = C3842rI.G();
            for (C3838rE c3838rE : (List) this.f25417v) {
                XC xc = c3838rE.f33995a;
                int i = c3838rE.f34000f;
                BG bg = (BG) C3517lG.f32558b.f(xc);
                Integer g9 = xc.g();
                int i4 = c3838rE.f33997c;
                if (g9 != null && g9.intValue() != i4) {
                    throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
                C3735pI E8 = C3789qI.E();
                C3411jI D8 = C3465kI.D();
                String str = bg.f24012a;
                D8.h();
                ((C3465kI) D8.f30000u).F(str);
                SK sk = bg.f24014c;
                D8.h();
                ((C3465kI) D8.f30000u).G(sk);
                int i9 = bg.f24015d;
                D8.h();
                ((C3465kI) D8.f30000u).H(i9);
                E8.h();
                ((C3789qI) E8.f30000u).F((C3465kI) D8.j());
                E8.h();
                ((C3789qI) E8.f30000u).J(i);
                E8.h();
                ((C3789qI) E8.f30000u).G(i4);
                EI ei = bg.f24016e;
                E8.h();
                ((C3789qI) E8.f30000u).H(ei);
                C3789qI c3789qI = (C3789qI) E8.j();
                G7.h();
                ((C3842rI) G7.f30000u).I(c3789qI);
                if (c3838rE.f33998d) {
                    G7.h();
                    ((C3842rI) G7.f30000u).H(i4);
                }
            }
            return (C3842rI) G7.j();
        } catch (GeneralSecurityException e6) {
            throw new B0.c(e6);
        }
    }

    public void i(Ut ut) {
        r("aai", ut.f28181w);
        r("request_id", ut.f28164n0);
        r(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, Ut.a(ut.f28141b));
    }

    public void j(Object obj, String str) {
        boolean commit;
        boolean z8 = obj instanceof String;
        String str2 = (String) this.f25417v;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f25416u;
        if (z8) {
            commit = sharedPreferences.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            commit = sharedPreferences.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else if (obj instanceof Boolean) {
            commit = sharedPreferences.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        } else {
            if (!(obj instanceof Integer)) {
                String valueOf = String.valueOf(obj.getClass());
                Log.e("GpidLifecycleSPHandler", com.anythink.basead.b.c.i.q(new StringBuilder(valueOf.length() + 33 + String.valueOf(str2).length()), "Unexpected object class ", valueOf, " for app ", str2));
                throw new IOException(com.anythink.basead.b.c.i.q(new StringBuilder(str.length() + 25 + String.valueOf(str2).length()), "Failed to store ", str, " for app ", str2));
            }
            commit = sharedPreferences.edit().putInt(str, ((Integer) obj).intValue()).commit();
        }
        if (commit) {
            return;
        }
        throw new IOException(com.anythink.basead.b.c.i.q(new StringBuilder(str.length() + 25 + String.valueOf(str2).length()), "Failed to store ", str, " for app ", str2));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2639Kh
    public void k(String str, int i, String str2, boolean z8) {
        switch (this.f25415n) {
            case 0:
                C2610Im c2610Im = (C2610Im) this.f25417v;
                c2610Im.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("messageType", "htmlLoaded");
                hashMap.put("id", (String) ((Map) this.f25416u).get("id"));
                c2610Im.f25589b.d(hashMap);
                break;
            case 1:
                C2661Lm c2661Lm = (C2661Lm) this.f25417v;
                c2661Lm.getClass();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("messageType", "validatorHtmlLoaded");
                hashMap2.put("id", (String) ((Map) this.f25416u).get("id"));
                c2661Lm.f26212b.d(hashMap2);
                break;
            default:
                C3320hg c3320hg = (C3320hg) this.f25416u;
                if (!z8) {
                    int length = String.valueOf(i).length();
                    StringBuilder sb = new StringBuilder(length + 55 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
                    sb.append("Ad Web View failed to load. Error code: ");
                    sb.append(i);
                    sb.append(", Description: ");
                    sb.append(str);
                    c3320hg.b(new Exception(AbstractC5051n.g(sb, ", Failing URL: ", str2)));
                    break;
                } else {
                    if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31494M2)).booleanValue()) {
                        p2.j.f39798C.f39810k.getClass();
                        ((C3002bo) this.f25417v).c("rendering-webview-load-html-end", System.currentTimeMillis());
                    }
                    c3320hg.a(null);
                    break;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.LD
    /* renamed from: l */
    public void mo7l(Object obj) {
        Bundle bundle;
        switch (this.f25415n) {
            case 6:
                String str = (String) obj;
                try {
                    C2653Le c2653Le = (C2653Le) this.f25416u;
                    C2534Ee c2534Ee = (C2534Ee) this.f25417v;
                    Parcel A02 = c2653Le.A0();
                    A02.writeString(str);
                    AbstractC3241g8.c(A02, c2534Ee);
                    c2653Le.G0(A02, 1);
                    return;
                } catch (RemoteException e6) {
                    t2.C.l("Service can't call client", e6);
                    return;
                }
            case 7:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                try {
                    C3151ea c3151ea = AbstractC3368ia.f31467J2;
                    q2.r rVar = q2.r.f40116e;
                    boolean booleanValue = ((Boolean) rVar.f40119c.a(c3151ea)).booleanValue();
                    InterfaceC2636Ke interfaceC2636Ke = (InterfaceC2636Ke) this.f25416u;
                    if (!booleanValue) {
                        interfaceC2636Ke.B2(parcelFileDescriptor);
                        return;
                    }
                    boolean booleanValue2 = ((Boolean) rVar.f40119c.a(AbstractC3368ia.f31476K2)).booleanValue();
                    C2687Ne c2687Ne = (C2687Ne) this.f25417v;
                    if (booleanValue2 && (bundle = c2687Ne.f26578F) != null) {
                        p2.j.f39798C.f39810k.getClass();
                        bundle.putLong("binder-call-start", System.currentTimeMillis());
                    }
                    interfaceC2636Ke.m3(parcelFileDescriptor, c2687Ne);
                    return;
                } catch (RemoteException e9) {
                    t2.C.l("Service can't call client", e9);
                    return;
                }
            case 11:
                S0.q qVar = (S0.q) this.f25416u;
                InterfaceC3005br interfaceC3005br = (InterfaceC3005br) obj;
                synchronized (qVar) {
                    ((C2801Tq) qVar.f2947j).b(interfaceC3005br, (Ut) this.f25417v);
                    Ut a9 = ((C2801Tq) qVar.f2947j).a();
                    if (a9 != null) {
                        qVar.q(a9);
                    }
                }
                return;
            case 16:
                C3877s c3877s = (C3877s) this.f25416u;
                synchronized (c3877s) {
                    c3877s.f34153x = null;
                    ((ArrayDeque) c3877s.f34152w).addFirst((C3870rt) this.f25417v);
                    if (c3877s.f34149n == 1) {
                        c3877s.f();
                    }
                }
                return;
            case 17:
                ((Ou) ((Q8) this.f25416u).f27124y).f26779c.u1(new Mt(2, (Ku) this.f25417v));
                return;
            default:
                return;
        }
    }

    public void m(boolean z8, boolean z9) {
        synchronized (this) {
            boolean z10 = false;
            if (z8) {
                if (((PowerManager.WakeLock) this.f25416u) == null) {
                    Context context = (Context) this.f25417v;
                    if (context.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        AbstractC3217fl.I("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) context.getSystemService("power");
                    if (powerManager == null) {
                        AbstractC3217fl.I("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    } else {
                        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                        this.f25416u = newWakeLock;
                        newWakeLock.setReferenceCounted(false);
                    }
                }
            }
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f25416u;
            if (wakeLock == null) {
                return;
            }
            if (z8 && z9) {
                z10 = true;
            }
            if (z10) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Bt
    public Object o() {
        InterfaceC3592mk interfaceC3592mk;
        synchronized (this) {
            interfaceC3592mk = (InterfaceC3592mk) this.f25416u;
        }
        return interfaceC3592mk;
    }

    @Override // z2.InterfaceC5272b
    public /* synthetic */ void onNativeAdLoaded(NativeAd nativeAd) {
        ((BinderC2948ap) this.f25417v).G3(nativeAd, (String) this.f25416u);
    }

    public C3838rE p() {
        for (C3838rE c3838rE : (List) this.f25417v) {
            if (c3838rE != null && c3838rE.f33998d) {
                if (c3838rE.f33996b == C3731pE.f33363v) {
                    return c3838rE;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    @Override // com.google.android.gms.internal.ads.LD
    public void q(Throwable th) {
        switch (this.f25415n) {
            case 6:
                try {
                    C2653Le c2653Le = (C2653Le) this.f25416u;
                    C4927z0 k6 = AbstractC3217fl.k(th);
                    t2.n nVar = new t2.n(AbstractC3217fl.q(th.getMessage()) ? k6.f40123u : th.getMessage(), k6.f40122n);
                    Parcel A02 = c2653Le.A0();
                    AbstractC3241g8.c(A02, nVar);
                    c2653Le.G0(A02, 2);
                    return;
                } catch (RemoteException e6) {
                    t2.C.l("Service can't call client", e6);
                    return;
                }
            case 7:
                try {
                    InterfaceC2636Ke interfaceC2636Ke = (InterfaceC2636Ke) this.f25416u;
                    C4927z0 k9 = AbstractC3217fl.k(th);
                    interfaceC2636Ke.J0(new t2.n(AbstractC3217fl.q(th.getMessage()) ? k9.f40123u : th.getMessage(), k9.f40122n));
                    return;
                } catch (RemoteException e9) {
                    t2.C.l("Service can't call client", e9);
                    return;
                }
            case 11:
                S0.q qVar = (S0.q) this.f25416u;
                synchronized (qVar) {
                    try {
                        C2801Tq c2801Tq = (C2801Tq) qVar.f2947j;
                        Ut ut = (Ut) this.f25417v;
                        c2801Tq.c(ut);
                        Ut a9 = ((C2801Tq) qVar.f2947j).a();
                        if (ut.f28180v0) {
                            while (a9 != null) {
                                qVar.q(a9);
                                a9 = ((C2801Tq) qVar.f2947j).a();
                            }
                        } else if (a9 != null) {
                            qVar.q(a9);
                        }
                    } finally {
                    }
                }
                return;
            case 16:
                C3877s c3877s = (C3877s) this.f25416u;
                synchronized (c3877s) {
                    c3877s.f34153x = null;
                }
                return;
            case 17:
                ((Ou) ((Q8) this.f25416u).f27124y).f26779c.u1(new C2593Hm(18, (Ku) this.f25417v, th));
                return;
            default:
                Vu vu = (Vu) this.f25416u;
                vu.c(th);
                vu.b(false);
                ((Yu) this.f25417v).a(vu);
                return;
        }
    }

    public void r(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        ((ConcurrentHashMap) this.f25417v).put(str, str2);
    }

    public void s() {
        ((C3165eo) this.f25416u).f30507b.execute(new RunnableC3056co(this, 1));
    }

    public C3838rE t(int i) {
        List list = (List) this.f25417v;
        if (i < 0 || i >= list.size()) {
            int size = list.size();
            throw new IndexOutOfBoundsException(D.y.n(new StringBuilder(String.valueOf(i).length() + 34 + String.valueOf(size).length()), "Invalid index ", i, " for keyset of size ", size));
        }
        C3838rE c3838rE = (C3838rE) list.get(i);
        if (!B(c3838rE.f34000f)) {
            throw new IllegalStateException(AbstractC5051n.d(i, "Keyset-Entry at position ", " has wrong status", new StringBuilder(String.valueOf(i).length() + 42)));
        }
        if (c3838rE.f33999e) {
            throw new IllegalStateException(AbstractC5051n.d(i, "Keyset-Entry at position ", " didn't parse correctly", new StringBuilder(String.valueOf(i).length() + 48)));
        }
        return (C3838rE) list.get(i);
    }

    public String toString() {
        switch (this.f25415n) {
            case 27:
                C3842rI h9 = h();
                int i = AbstractC4162xE.f35129a;
                C3896sI A8 = C4058vI.A();
                int A9 = h9.A();
                A8.h();
                ((C4058vI) A8.f30000u).B(A9);
                for (C3789qI c3789qI : h9.B()) {
                    C3950tI A10 = C4004uI.A();
                    String A11 = c3789qI.B().A();
                    A10.h();
                    ((C4004uI) A10.f30000u).B(A11);
                    int I2 = c3789qI.I();
                    A10.h();
                    ((C4004uI) A10.f30000u).E(I2);
                    EI D8 = c3789qI.D();
                    A10.h();
                    ((C4004uI) A10.f30000u).D(D8);
                    int C7 = c3789qI.C();
                    A10.h();
                    ((C4004uI) A10.f30000u).C(C7);
                    C4004uI c4004uI = (C4004uI) A10.j();
                    A8.h();
                    ((C4058vI) A8.f30000u).C(c4004uI);
                }
                return ((C4058vI) A8.j()).toString();
            default:
                return super.toString();
        }
    }

    public u2.k u() {
        boolean booleanValue = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.If)).booleanValue();
        u2.k kVar = u2.k.f41244n;
        if (!booleanValue) {
            s();
            return kVar;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f25417v;
        C3381io c3381io = ((C3165eo) this.f25416u).f30506a;
        c3381io.getClass();
        if (concurrentHashMap.isEmpty()) {
            int i = t2.C.f40822b;
            u2.i.a("Empty paramMap.");
            return kVar;
        }
        String a9 = c3381io.f32003f.a(concurrentHashMap);
        t2.C.k(a9);
        return c3381io.f32001d.a(null, a9);
    }

    public void v() {
        ((C3165eo) this.f25416u).f30507b.execute(new RunnableC3056co(this, 0));
    }

    public void w(String str) {
        if (((SharedPreferences) this.f25416u).edit().remove(str).commit()) {
            return;
        }
        int length = str.length();
        String str2 = (String) this.f25417v;
        throw new IOException(com.anythink.basead.b.c.i.q(new StringBuilder(length + 26 + String.valueOf(str2).length()), "Failed to remove ", str, " for app ", str2));
    }

    @Override // com.google.android.gms.internal.ads.Bt
    public /* bridge */ /* synthetic */ J3.a x(C2593Hm c2593Hm, At at) {
        return g(c2593Hm, at, null);
    }

    public Object z(InterfaceC3623nE interfaceC3623nE, Class cls) {
        C3842rI h9 = h();
        int i = AbstractC4162xE.f35129a;
        int A8 = h9.A();
        int i4 = 0;
        boolean z8 = true;
        int i9 = 0;
        boolean z9 = false;
        for (C3789qI c3789qI : h9.B()) {
            if (c3789qI.I() == 3) {
                if (!c3789qI.A()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(c3789qI.C())));
                }
                if (c3789qI.D() == EI.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(c3789qI.C())));
                }
                if (c3789qI.I() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(c3789qI.C())));
                }
                if (c3789qI.C() == A8) {
                    if (z9) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z9 = true;
                }
                z8 &= c3789qI.B().C() == 4;
                i9++;
            }
        }
        if (i9 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z9 && !z8) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        while (true) {
            List list = (List) this.f25417v;
            if (i4 >= list.size()) {
                return interfaceC3623nE.d(this, cls);
            }
            if (((C3838rE) list.get(i4)).f33999e || !B(((C3838rE) list.get(i4)).f34000f)) {
                break;
            }
            i4++;
        }
        String A9 = h9.D(i4).B().A();
        StringBuilder sb = new StringBuilder(String.valueOf(A9).length() + String.valueOf(i4).length() + 44 + 32);
        sb.append("Key parsing of key with index ");
        sb.append(i4);
        sb.append(" and type_url ");
        sb.append(A9);
        sb.append(" failed, unable to get primitive");
        throw new GeneralSecurityException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.Gu
    public Object b(Object obj) {
        C2834Vp c2834Vp = (C2834Vp) this.f25417v;
        c2834Vp.getClass();
        ContentValues contentValues = new ContentValues();
        C3614n5 c3614n5 = (C3614n5) this.f25416u;
        contentValues.put(com.anythink.expressad.foundation.d.d.f18754u, Long.valueOf(c3614n5.f32830a));
        contentValues.put("gws_query_id", (String) c3614n5.f32832c);
        contentValues.put("url", (String) c3614n5.f32833d);
        contentValues.put("event_state", Integer.valueOf(c3614n5.f32831b - 1));
        ((SQLiteDatabase) obj).insert("offline_buffered_pings", null, contentValues);
        t2.G g9 = p2.j.f39798C.f39803c;
        Context context = c2834Vp.f28309n;
        t2.u b9 = t2.G.b(context);
        if (b9 != null) {
            try {
                b9.zzf(new V2.b(context));
            } catch (RemoteException e6) {
                t2.C.l("Failed to schedule offline ping sender.", e6);
            }
        }
        return null;
    }

    public /* synthetic */ C2593Hm(int i, Object obj) {
        this.f25415n = i;
        this.f25417v = obj;
    }

    public /* synthetic */ C2593Hm(int i, Object obj, Object obj2) {
        this.f25415n = i;
        this.f25417v = obj;
        this.f25416u = obj2;
    }

    public /* synthetic */ C2593Hm(int i, boolean z8) {
        this.f25415n = i;
    }

    public C2593Hm(C4017ue c4017ue) {
        this.f25415n = 23;
        this.f25416u = c4017ue;
    }

    public C2593Hm(C3214fi c3214fi, Context context, SD sd) {
        this.f25415n = 5;
        this.f25417v = c3214fi;
        this.f25416u = context;
    }

    public /* synthetic */ C2593Hm(Object obj, Object obj2, int i, boolean z8) {
        this.f25415n = i;
        this.f25416u = obj;
        this.f25417v = obj2;
    }

    public C2593Hm(S0.q qVar, Ut ut) {
        this.f25415n = 11;
        this.f25417v = ut;
        Objects.requireNonNull(qVar);
        this.f25416u = qVar;
    }

    @Override // com.google.android.gms.internal.ads.Ju
    /* renamed from: a, reason: collision with other method in class */
    public void mo1a() {
        switch (this.f25415n) {
            case 12:
                C3744pa c3744pa = (C3744pa) ((C2563Fq) this.f25417v).f25030d;
                BinderC3690oa binderC3690oa = (BinderC3690oa) this.f25416u;
                Parcel A02 = c3744pa.A0();
                AbstractC3241g8.e(A02, binderC3690oa);
                c3744pa.G0(A02, 1);
                break;
            default:
                C3744pa c3744pa2 = (C3744pa) ((C3599mr) this.f25417v).f32766d;
                BinderC3690oa binderC3690oa2 = (BinderC3690oa) this.f25416u;
                Parcel A03 = c3744pa2.A0();
                AbstractC3241g8.e(A03, binderC3690oa2);
                c3744pa2.G0(A03, 1);
                break;
        }
    }

    public C2593Hm(Context context) {
        this.f25415n = 24;
        this.f25417v = context.getPackageName();
        this.f25416u = context.getSharedPreferences("paid_storage_sp", 0);
    }

    public C2593Hm(C3877s c3877s, C3870rt c3870rt) {
        this.f25415n = 16;
        this.f25417v = c3870rt;
        Objects.requireNonNull(c3877s);
        this.f25416u = c3877s;
    }

    public C2593Hm(Q8 q82, Ku ku) {
        this.f25415n = 17;
        this.f25417v = ku;
        Objects.requireNonNull(q82);
        this.f25416u = q82;
    }

    public C2593Hm(C3165eo c3165eo) {
        this.f25415n = 3;
        Objects.requireNonNull(c3165eo);
        this.f25416u = c3165eo;
        this.f25417v = new ConcurrentHashMap();
    }

    public C2593Hm(BinderC2630Jp binderC2630Jp, C2653Le c2653Le, C2534Ee c2534Ee) {
        this.f25415n = 6;
        this.f25416u = c2653Le;
        this.f25417v = c2534Ee;
    }

    public C2593Hm(BinderC2630Jp binderC2630Jp, C2687Ne c2687Ne, InterfaceC2636Ke interfaceC2636Ke) {
        this.f25415n = 7;
        this.f25417v = c2687Ne;
        this.f25416u = interfaceC2636Ke;
        Objects.requireNonNull(binderC2630Jp);
    }

    public C2593Hm(HashMap hashMap, List list) {
        this.f25415n = 27;
        this.f25417v = list;
        this.f25416u = hashMap;
        if (IF.f25545a.f32574a.get()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            boolean z8 = false;
            while (it.hasNext()) {
                C3838rE c3838rE = (C3838rE) it.next();
                boolean contains = hashSet.contains(Integer.valueOf(c3838rE.f33997c));
                int i = c3838rE.f33997c;
                if (!contains) {
                    hashSet.add(Integer.valueOf(i));
                    z8 |= c3838rE.f33998d;
                } else {
                    throw new GeneralSecurityException(AbstractC5051n.d(i, "KeyID ", " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.", new StringBuilder(String.valueOf(i).length() + 121)));
                }
            }
            if (!z8) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
    }

    public /* synthetic */ C2593Hm(C4218yG c4218yG) {
        this.f25415n = 29;
        this.f25417v = new HashMap(c4218yG.f35335a);
        this.f25416u = new HashMap(c4218yG.f35336b);
    }

    private final void n(Object obj) {
    }
}
