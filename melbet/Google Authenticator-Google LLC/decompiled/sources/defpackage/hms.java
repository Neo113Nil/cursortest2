package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hms {
    public static final hmu a;

    static {
        String[] strArr;
        strArr = hmu.d;
        a = a(strArr);
    }

    private static hmu a(String[] strArr) {
        hnd hndVar;
        try {
            hndVar = hne.a;
        } catch (NoClassDefFoundError unused) {
            hndVar = null;
        }
        if (hndVar != null) {
            return hndVar;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            try {
                return (hmu) Class.forName(str).getConstructor(null).newInstance(null);
            } catch (Throwable th) {
                th = th;
                sb.append('\n');
                sb.append(str);
                sb.append(": ");
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb.append(th);
            }
        }
        throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
    }
}
