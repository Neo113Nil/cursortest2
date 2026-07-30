package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class kf3 implements Callable {
    public final /* synthetic */ boolean m;
    public final /* synthetic */ String n;
    public final /* synthetic */ ml3 o;

    public /* synthetic */ kf3(boolean z, String str, ml3 ml3Var) {
        this.m = z;
        this.n = str;
        this.o = ml3Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MessageDigest messageDigest;
        boolean z = this.m;
        String str = this.n;
        ml3 ml3Var = this.o;
        String str2 = (z || !zn3.a(str, ml3Var, true, false).b) ? "not allowed" : "debug cert rejected";
        int i = 0;
        while (true) {
            if (i >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                break;
            }
            i++;
        }
        ll3.v(messageDigest);
        byte[] digest = messageDigest.digest(ml3Var.i);
        int length = digest.length;
        char[] cArr = new char[length + length];
        int i2 = 0;
        for (byte b : digest) {
            char[] cArr2 = ll3.e;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
            i2 += 2;
        }
        return str2 + ": pkg=" + str + ", sha256=" + new String(cArr) + ", atk=" + z + ", ver=12451000.false";
    }
}
