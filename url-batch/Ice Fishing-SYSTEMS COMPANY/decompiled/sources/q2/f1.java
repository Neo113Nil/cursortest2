package q2;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import u.AbstractC5088e;

/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public static final f1 f40041a = new f1();

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e7, code lost:
    
        if (r2.contains(r1) == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d1 a(Context context, F0 f02) {
        boolean z8;
        Context applicationContext;
        String str;
        int i;
        int i4;
        String str2;
        String str3 = f02.f39931a;
        Set set = f02.f39933c;
        List unmodifiableList = !set.isEmpty() ? Collections.unmodifiableList(new ArrayList(set)) : null;
        k2.r rVar = J0.c().f39969j;
        u2.d dVar = C4907p.f40108g.f40109a;
        String c4 = u2.d.c(context);
        if (!f02.f39938h.contains(c4)) {
            rVar.getClass();
            if (!new ArrayList(rVar.f38728b).contains(c4)) {
                z8 = false;
                Bundle bundle = f02.f39934d.getBundle(AdMobAdapter.class.getName());
                applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    String packageName = applicationContext.getPackageName();
                    StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                    while (true) {
                        i4 = i + 1;
                        if (i4 >= stackTrace.length) {
                            str2 = null;
                            break;
                        }
                        StackTraceElement stackTraceElement = stackTrace[i];
                        String className = stackTraceElement.getClassName();
                        i = ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (u2.d.f41225c.equalsIgnoreCase(className) || u2.d.f41226d.equalsIgnoreCase(className) || u2.d.f41227e.equalsIgnoreCase(className) || u2.d.f41228f.equalsIgnoreCase(className) || u2.d.f41229g.equalsIgnoreCase(className))) ? 0 : i4;
                    }
                    str2 = stackTrace[i4].getClassName();
                    if (packageName != null) {
                        StringTokenizer stringTokenizer = new StringTokenizer(packageName, com.anythink.core.common.d.j.f12535z);
                        StringBuilder sb = new StringBuilder();
                        if (stringTokenizer.hasMoreElements()) {
                            sb.append(stringTokenizer.nextToken());
                            for (int i9 = 2; i9 > 0 && stringTokenizer.hasMoreElements(); i9--) {
                                sb.append(com.anythink.core.common.d.j.f12535z);
                                sb.append(stringTokenizer.nextToken());
                            }
                            packageName = sb.toString();
                        }
                        if (str2 != null) {
                        }
                    }
                    str2 = null;
                    str = str2;
                } else {
                    str = null;
                }
                k2.r rVar2 = J0.c().f39969j;
                return new d1(8, -1L, bundle, -1, unmodifiableList, z8, Math.max(f02.f39937g, rVar2.f38727a), false, f02.f39935e, null, null, str3, f02.f39934d, f02.i, Collections.unmodifiableList(new ArrayList(f02.f39939j)), f02.f39936f, str, f02.f39940k, null, -1, (String) Collections.max(Arrays.asList(null, ""), e1.f40038n), new ArrayList(f02.f39932b), f02.f39942m, f02.f39941l, AbstractC5088e.d(rVar2.f38729c), f02.f39943n, 0L, -1);
            }
        }
        z8 = true;
        Bundle bundle2 = f02.f39934d.getBundle(AdMobAdapter.class.getName());
        applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
        }
        k2.r rVar22 = J0.c().f39969j;
        return new d1(8, -1L, bundle2, -1, unmodifiableList, z8, Math.max(f02.f39937g, rVar22.f38727a), false, f02.f39935e, null, null, str3, f02.f39934d, f02.i, Collections.unmodifiableList(new ArrayList(f02.f39939j)), f02.f39936f, str, f02.f39940k, null, -1, (String) Collections.max(Arrays.asList(null, ""), e1.f40038n), new ArrayList(f02.f39932b), f02.f39942m, f02.f39941l, AbstractC5088e.d(rVar22.f38729c), f02.f39943n, 0L, -1);
    }
}
