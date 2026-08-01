package z6;

import c7.c0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f10897d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f10898e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f10899i;

    public /* synthetic */ q(boolean z10, String str, p pVar) {
        this.f10897d = z10;
        this.f10898e = str;
        this.f10899i = pVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MessageDigest messageDigest;
        boolean z10 = this.f10897d;
        String str = this.f10898e;
        p pVar = this.f10899i;
        String str2 = (z10 || !s.b(str, pVar, true, false).f10915a) ? "not allowed" : "debug cert rejected";
        int i3 = 0;
        while (true) {
            if (i3 >= 2) {
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
            i3++;
        }
        c0.g(messageDigest);
        byte[] digest = messageDigest.digest(pVar.f10896f);
        int length = digest.length;
        char[] cArr = new char[length + length];
        int i10 = 0;
        for (byte b10 : digest) {
            char[] cArr2 = g7.b.f4278b;
            cArr[i10] = cArr2[(b10 & 255) >>> 4];
            cArr[i10 + 1] = cArr2[b10 & 15];
            i10 += 2;
        }
        return str2 + ": pkg=" + str + ", sha256=" + new String(cArr) + ", atk=" + z10 + ", ver=12451000.false";
    }
}
