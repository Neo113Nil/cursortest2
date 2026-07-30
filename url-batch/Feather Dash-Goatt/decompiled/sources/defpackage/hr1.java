package defpackage;

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

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class hr1 {
    public final ur1 a;
    public final String b;
    public final me1 c;
    public final br1 d;

    public hr1(Context context, ur1 ur1Var, me1 me1Var) {
        String str;
        this.b = context.getPackageName();
        this.a = ur1Var;
        this.c = me1Var;
        ur1 ur1Var2 = er1.a;
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
                        this.d = new br1(context, ur1Var, jr1.a);
                        return;
                    }
                }
                ur1 ur1Var3 = er1.a;
                Object[] objArr = new Object[0];
                ur1Var3.getClass();
                if (Log.isLoggable("PlayCore", 5)) {
                    Log.w("PlayCore", ur1.b(ur1Var3.a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        Object[] objArr2 = new Object[0];
        ur1Var.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", ur1.b(ur1Var.a, "Phonesky is not installed.", objArr2));
        }
        this.d = null;
    }

    public static Bundle a(hr1 hr1Var, byte[] bArr, Long l) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", hr1Var.b);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        int i = 0;
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l != null) {
            bundle.putLong("cloud.prj", l.longValue());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qr1(System.currentTimeMillis()));
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            qr1 qr1Var = (qr1) obj;
            Bundle bundle2 = new Bundle();
            qr1Var.getClass();
            bundle2.putInt("event_type", 3);
            bundle2.putLong("event_timestamp", qr1Var.a);
            arrayList2.add(bundle2);
        }
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(arrayList2));
        return bundle;
    }
}
