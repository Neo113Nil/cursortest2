package w0;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.cc;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public abstract class m {
    private static String a(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            Log.w("ResourcesUtils", "resName is empty");
            return null;
        }
        int identifier = context.getResources().getIdentifier(str2, "string", str);
        if (identifier == 0) {
            Log.w("ResourcesUtils", "resId == 0");
            return null;
        }
        try {
            return context.getResources().getString(identifier);
        } catch (Resources.NotFoundException e4) {
            Log.e("ResourcesUtils", "resources not fund" + e4.getMessage());
            return null;
        }
    }

    public static String b(Context context, String str, String str2, String str3) {
        try {
            return a(context, str, str2 + AbstractC3483a.c(c(str3.getBytes(cc.f15721N))));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e4) {
            Log.e("ResourcesUtils", "getResources exception:" + e4.getMessage());
            return null;
        }
    }

    public static byte[] c(byte[] bArr) {
        return MessageDigest.getInstance("SHA-256").digest(bArr);
    }
}
