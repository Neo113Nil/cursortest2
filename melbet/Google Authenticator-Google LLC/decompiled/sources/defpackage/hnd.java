package defpackage;

import android.os.Build;
import dalvik.system.VMStack;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hnd extends hmu {
    private static final boolean a = hnc.a();
    private static final boolean b;
    private static final hmt c;

    static {
        boolean z = true;
        if (Build.FINGERPRINT != null && !"robolectric".equals(Build.FINGERPRINT)) {
            z = false;
        }
        b = z;
        c = new hnb();
    }

    static Class p() {
        return VMStack.getStackClass2();
    }

    static String q() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean t() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            return hnc.class.getName().equals(q());
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // defpackage.hmu
    protected hlw e(String str) {
        AtomicReference atomicReference = hng.d;
        if (atomicReference.get() != null) {
            return ((hmz) atomicReference.get()).a(str);
        }
        int length = str.length();
        while (true) {
            length--;
            if (length >= 0) {
                char charAt = str.charAt(length);
                if (charAt != '$') {
                    if (charAt == '.') {
                        break;
                    }
                } else {
                    str = str.replace('$', '.');
                    break;
                }
            } else {
                break;
            }
        }
        hng hngVar = new hng(str);
        hnf.a.offer(hngVar);
        if (atomicReference.get() == null) {
            return hngVar;
        }
        hng.e();
        return hngVar;
    }

    @Override // defpackage.hmu
    protected hmt h() {
        return c;
    }

    @Override // defpackage.hmu
    protected hnu j() {
        return hnh.a;
    }

    @Override // defpackage.hmu
    protected String m() {
        return "platform: Android";
    }
}
