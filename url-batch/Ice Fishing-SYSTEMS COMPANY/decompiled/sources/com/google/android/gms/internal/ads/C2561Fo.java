package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import j3.AbstractC4596a;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Fo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2561Fo implements InterfaceC3572mH {

    /* renamed from: n, reason: collision with root package name */
    public int f25017n;

    /* renamed from: u, reason: collision with root package name */
    public int f25018u;

    /* renamed from: v, reason: collision with root package name */
    public Object f25019v;

    /* renamed from: w, reason: collision with root package name */
    public Object f25020w;

    /* renamed from: x, reason: collision with root package name */
    public Serializable f25021x;

    public C2561Fo(Context context, int i) {
        switch (i) {
            case 2:
                this.f25018u = 0;
                this.f25019v = context;
                break;
            default:
                this.f25021x = "";
                this.f25019v = context;
                this.f25020w = context.getApplicationInfo();
                C3151ea c3151ea = AbstractC3368ia.xa;
                q2.r rVar = q2.r.f40116e;
                this.f25017n = ((Integer) rVar.f40119c.a(c3151ea)).intValue();
                this.f25018u = ((Integer) rVar.f40119c.a(AbstractC3368ia.ya)).intValue();
                break;
        }
    }

    public static String c(K3.g gVar) {
        gVar.a();
        K3.i iVar = gVar.f1625c;
        String str = iVar.f1640e;
        if (str != null) {
            return str;
        }
        gVar.a();
        String str2 = iVar.f1637b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH
    public long F(C3197fJ c3197fJ) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH
    public void a(DN dn) {
        dn.getClass();
        ((InterfaceC3572mH) this.f25019v).a(dn);
    }

    public synchronized String b() {
        try {
            if (((String) this.f25021x) == null) {
                g();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.f25021x;
    }

    public PackageInfo d(String str) {
        try {
            return ((Context) this.f25019v).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e6) {
            Log.w("FirebaseMessaging", "Failed to find package " + e6);
            return null;
        }
    }

    public boolean e() {
        int i;
        synchronized (this) {
            i = this.f25018u;
            if (i == 0) {
                PackageManager packageManager = ((Context) this.f25019v).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i = 0;
                } else {
                    if (!S2.b.f()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.f25018u = 1;
                            i = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (S2.b.f()) {
                            this.f25018u = 2;
                        } else {
                            this.f25018u = 1;
                        }
                        i = this.f25018u;
                    } else {
                        this.f25018u = 2;
                        i = 2;
                    }
                }
            }
        }
        return i != 0;
    }

    public void f(O.A0 a02, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((O.n0) it.next()).f2300a.c() & 8) != 0) {
                ((View) this.f25020w).setTranslationY(AbstractC4596a.c(this.f25018u, 0, r3.f2300a.b()));
                return;
            }
        }
    }

    public synchronized void g() {
        PackageInfo d2 = d(((Context) this.f25019v).getPackageName());
        if (d2 != null) {
            this.f25021x = Integer.toString(d2.versionCode);
            this.f25020w = d2.versionName;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH, com.google.android.gms.internal.ads.KM
    public Map h() {
        return ((InterfaceC3572mH) this.f25019v).h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH
    public Uri i() {
        return ((InterfaceC3572mH) this.f25019v).i();
    }

    public JSONObject j() {
        String str;
        String encodeToString;
        ApplicationInfo applicationInfo = (ApplicationInfo) this.f25020w;
        Context context = (Context) this.f25019v;
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = applicationInfo.packageName;
            t2.D d2 = t2.G.f40858l;
            Context context2 = U2.c.a(context).f3280n;
            jSONObject.put("name", context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(str2, 0)));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", applicationInfo.packageName);
        t2.G g9 = p2.j.f39798C.f39803c;
        Drawable drawable = null;
        try {
            str = t2.G.M(context);
        } catch (RemoteException unused2) {
            str = null;
        }
        jSONObject.put("adMobAppId", str);
        boolean isEmpty = ((String) this.f25021x).isEmpty();
        int i = this.f25018u;
        int i4 = this.f25017n;
        if (isEmpty) {
            try {
                U2.b a9 = U2.c.a(context);
                String str3 = applicationInfo.packageName;
                Context context3 = a9.f3280n;
                ApplicationInfo applicationInfo2 = context3.getPackageManager().getApplicationInfo(str3, 0);
                context3.getPackageManager().getApplicationLabel(applicationInfo2);
                drawable = context3.getPackageManager().getApplicationIcon(applicationInfo2);
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (drawable == null) {
                encodeToString = "";
            } else {
                drawable.setBounds(0, 0, i4, i);
                Bitmap createBitmap = Bitmap.createBitmap(i4, i, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.f25021x = encodeToString;
        }
        if (!((String) this.f25021x).isEmpty()) {
            jSONObject.put("icon", (String) this.f25021x);
            jSONObject.put("iconWidthPx", i4);
            jSONObject.put("iconHeightPx", i);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH
    public void o() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.JN
    public int z(byte[] bArr, int i, int i4) {
        int i9 = this.f25018u;
        InterfaceC3572mH interfaceC3572mH = (InterfaceC3572mH) this.f25019v;
        if (i9 == 0) {
            byte[] bArr2 = (byte[]) this.f25021x;
            int i10 = 0;
            if (interfaceC3572mH.z(bArr2, 0, 1) != -1) {
                int i11 = (bArr2[0] & com.anythink.basead.exoplayer.k.p.f8630b) << 4;
                if (i11 != 0) {
                    byte[] bArr3 = new byte[i11];
                    int i12 = i11;
                    while (i12 > 0) {
                        int z8 = interfaceC3572mH.z(bArr3, i10, i12);
                        if (z8 != -1) {
                            i10 += z8;
                            i12 -= z8;
                        }
                    }
                    while (i11 > 0) {
                        int i13 = i11 - 1;
                        if (bArr3[i13] != 0) {
                            break;
                        }
                        i11 = i13;
                    }
                    if (i11 > 0) {
                        Lr lr = new Lr(bArr3, i11);
                        MQ mq = (MQ) this.f25020w;
                        long max = !mq.f26349l ? mq.i : Math.max(mq.f26350m.z(true), mq.i);
                        int B8 = lr.B();
                        InterfaceC3448k1 interfaceC3448k1 = mq.f26348k;
                        interfaceC3448k1.getClass();
                        interfaceC3448k1.a(B8, lr);
                        interfaceC3448k1.b(max, 1, B8, 0, null);
                        mq.f26349l = true;
                    }
                }
                i9 = this.f25017n;
                this.f25018u = i9;
            }
            return -1;
        }
        int z9 = interfaceC3572mH.z(bArr, i, Math.min(i9, i4));
        if (z9 != -1) {
            this.f25018u -= z9;
        }
        return z9;
    }
}
