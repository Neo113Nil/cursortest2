package L1;

import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a extends r1.f {

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f1661e;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(int i2, Exception exc) {
        super(new Status(i2, "Integrity API error (" + i2 + "): " + r1 + ".", null, null));
        String str;
        Locale locale = Locale.ROOT;
        HashMap hashMap = M1.a.f1726a;
        Integer valueOf = Integer.valueOf(i2);
        if (hashMap.containsKey(valueOf)) {
            HashMap hashMap2 = M1.a.f1727b;
            if (hashMap2.containsKey(valueOf)) {
                str = ((String) hashMap.get(valueOf)) + " (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/IntegrityErrorCode.html#" + ((String) hashMap2.get(valueOf)) + ")";
                if (i2 != 0) {
                    throw new IllegalArgumentException("ErrorCode should not be 0.");
                }
                this.f1661e = exc;
                return;
            }
        }
        str = "";
        if (i2 != 0) {
        }
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f1661e;
    }
}
