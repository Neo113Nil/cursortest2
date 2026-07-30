package L1;

import N1.l;
import N1.p;
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

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final p f1673a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1674b;

    /* renamed from: c, reason: collision with root package name */
    public final c f1675c;

    /* renamed from: d, reason: collision with root package name */
    public final N1.d f1676d;

    public f(Context context, p pVar, c cVar) {
        String str;
        this.f1674b = context.getPackageName();
        this.f1673a = pVar;
        this.f1675c = cVar;
        p pVar2 = N1.f.f1815a;
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
                        this.f1676d = new N1.d(context, pVar, g.f1677a);
                        return;
                    }
                }
                p pVar3 = N1.f.f1815a;
                Object[] objArr = new Object[0];
                pVar3.getClass();
                if (Log.isLoggable("PlayCore", 5)) {
                    Log.w("PlayCore", p.b(pVar3.f1824a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        Object[] objArr2 = new Object[0];
        pVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", p.b(pVar.f1824a, "Phonesky is not installed.", objArr2));
        }
        this.f1676d = null;
    }

    public static Bundle a(f fVar, byte[] bArr, Long l7) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", fVar.f1674b);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        int i2 = 0;
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l7 != null) {
            bundle.putLong("cloud.prj", l7.longValue());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new l(System.currentTimeMillis()));
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            l lVar = (l) obj;
            Bundle bundle2 = new Bundle();
            lVar.getClass();
            bundle2.putInt("event_type", 3);
            bundle2.putLong("event_timestamp", lVar.f1821a);
            arrayList2.add(bundle2);
        }
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(arrayList2));
        return bundle;
    }
}
