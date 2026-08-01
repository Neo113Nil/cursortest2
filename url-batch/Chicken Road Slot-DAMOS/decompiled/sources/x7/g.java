package x7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import z7.o;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final o f10531a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10532b;

    /* renamed from: c, reason: collision with root package name */
    public final d f10533c;

    /* renamed from: d, reason: collision with root package name */
    public final z7.d f10534d;

    public g(Context context, o oVar, d dVar) {
        String str;
        this.f10532b = context.getPackageName();
        this.f10531a = oVar;
        this.f10533c = dVar;
        o oVar2 = z7.f.f10936a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr != null && (signatureArr.length) != 0) {
                    for (Signature signature : signatureArr) {
                        byte[] byteArray = signature.toByteArray();
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                            messageDigest.update(byteArray);
                            str = Base64.encodeToString(messageDigest.digest(), 11);
                        } catch (NoSuchAlgorithmException unused) {
                            str = "";
                        }
                        if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) {
                            String str2 = Build.TAGS;
                            if ((!str2.contains("dev-keys") && !str2.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str)) {
                            }
                        }
                        this.f10534d = new z7.d(context, oVar, h.f10535a);
                        return;
                    }
                }
                o oVar3 = z7.f.f10936a;
                Object[] objArr = new Object[0];
                oVar3.getClass();
                if (Log.isLoggable("PlayCore", 5)) {
                    Log.w("PlayCore", o.b(oVar3.f10944a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        Object[] objArr2 = new Object[0];
        oVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", o.b(oVar.f10944a, "Phonesky is not installed.", objArr2));
        }
        this.f10534d = null;
    }

    public static Bundle a(g gVar, byte[] bArr, Long l10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", gVar.f10532b);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        int i3 = 0;
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l10 != null) {
            bundle.putLong("cloud.prj", l10.longValue());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new z7.k(System.currentTimeMillis()));
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            z7.k kVar = (z7.k) obj;
            Bundle bundle2 = new Bundle();
            kVar.getClass();
            bundle2.putInt("event_type", 3);
            bundle2.putLong("event_timestamp", kVar.f10941a);
            arrayList2.add(bundle2);
        }
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(arrayList2));
        return bundle;
    }
}
