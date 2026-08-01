package x7;

import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Locale;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends a7.e {

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f10519e;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(int i3, Exception exc) {
        super(new Status(i3, "Integrity API error (" + i3 + "): " + r1 + ".", null, null));
        String str;
        Locale locale = Locale.ROOT;
        HashMap hashMap = y7.a.f10665a;
        Integer valueOf = Integer.valueOf(i3);
        if (hashMap.containsKey(valueOf)) {
            HashMap hashMap2 = y7.a.f10666b;
            if (hashMap2.containsKey(valueOf)) {
                str = ((String) hashMap.get(valueOf)) + " (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/IntegrityErrorCode.html#" + ((String) hashMap2.get(valueOf)) + ")";
                if (i3 == 0) {
                    this.f10519e = exc;
                    return;
                } else {
                    a1.e("ErrorCode should not be 0.");
                    throw null;
                }
            }
        }
        str = "";
        if (i3 == 0) {
        }
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f10519e;
    }
}
