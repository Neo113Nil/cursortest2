package defpackage;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class hnq extends hmu {
    private final hno a;
    private final hnu b;
    private final hnp c;
    private final hmt d;

    public hnq() {
        hno hnoVar = (hno) p(hno.class, "flogger.backend_factory");
        this.a = hnoVar == null ? hnr.a : hnoVar;
        hnu hnuVar = (hnu) p(hnu.class, "flogger.logging_context");
        this.b = hnuVar == null ? hnw.a : hnuVar;
        hnp hnpVar = (hnp) p(hnp.class, "flogger.clock");
        this.c = hnpVar == null ? hnt.a : hnpVar;
        this.d = hns.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Object p(Class cls, String str) {
        String str2;
        int i;
        Object cast;
        try {
            str2 = System.getProperty(str, null);
        } catch (SecurityException e) {
            hoq.a("cannot read property name %s: %s", str, e);
            str2 = null;
        }
        if (str2 != null) {
            int indexOf = str2.indexOf(35);
            String substring = indexOf == -1 ? str2 : str2.substring(0, indexOf);
            String substring2 = indexOf == -1 ? "getInstance" : str2.substring(indexOf + 1);
            String str3 = substring + "#" + substring2 + "()";
            i = 0;
            try {
                Class<?> cls2 = Class.forName(substring);
                try {
                    cast = cls.cast(cls2.getMethod(substring2, null).invoke(null, null));
                } catch (NoSuchMethodException e2) {
                    if (indexOf != -1 && substring2.equals("getInstance")) {
                        a.Z(substring, "new ", "()");
                        cast = cls.cast(cls2.getConstructor(null).newInstance(null));
                    }
                    hoq.a("method '%s' does not exist: %s\n", str2, e2);
                }
            } catch (ClassCastException e3) {
                hoq.a("cannot cast result of calling '%s' to '%s': %s\n", str3, cls.getName(), e3);
            } catch (ClassNotFoundException unused) {
            } catch (Exception e4) {
                hoq.a("cannot call expected no-argument constructor or static method '%s': %s\n", str3, e4);
            }
            if (cast == null) {
                return cast;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ServiceLoader.load(cls).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            int size = arrayList.size();
            if (size == 0) {
                return null;
            }
            if (size == 1) {
                return arrayList.get(i);
            }
            PrintStream printStream = System.err;
            Object[] objArr = new Object[3];
            objArr[i] = cls.getName();
            objArr[1] = arrayList;
            objArr[2] = str;
            printStream.printf("Multiple implementations of service %s found on the classpath: %s%nEnsure only the service implementation you want to use is included on the classpath or else specify the service class at startup with the '%s' system property. The default implementation will be used instead.%n", objArr);
            return null;
        }
        i = 0;
        cast = null;
        if (cast == null) {
        }
    }

    @Override // defpackage.hmu
    protected final long c() {
        return this.c.a();
    }

    @Override // defpackage.hmu
    protected final hlw e(String str) {
        return this.a.a(str);
    }

    @Override // defpackage.hmu
    protected final hmt h() {
        return this.d;
    }

    @Override // defpackage.hmu
    protected final hnu j() {
        return this.b;
    }

    @Override // defpackage.hmu
    protected final String m() {
        return "Platform: " + getClass().getName() + "\nBackendFactory: " + this.a.toString() + "\nClock: " + this.c.toString() + "\nContextDataProvider: " + String.valueOf(this.b) + "\nLogCallerFinder: Default stack-based caller finder\n";
    }
}
