package z7;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f10944a;

    public o(String str) {
        this.f10944a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    public static String b(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e2) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e2);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    public final void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", b(this.f10944a, str, objArr));
        }
    }
}
