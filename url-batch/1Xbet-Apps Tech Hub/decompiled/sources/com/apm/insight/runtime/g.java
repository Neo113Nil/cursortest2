package com.apm.insight.runtime;

import androidx.core.os.EnvironmentCompat;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.q;
import java.util.Comparator;

/* loaded from: classes.dex */
public class g {
    private static final Comparator<a> a = new Comparator<a>() { // from class: com.apm.insight.runtime.g.1
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compare(a aVar, a aVar2) {
            int i = aVar.b + aVar.c;
            int i2 = aVar2.b + aVar2.c;
            if (i != i2) {
                return i > i2 ? -1 : 1;
            }
            return 0;
        }
    };
    private static byte[] b = new byte[4096];

    public static class a {
        public String a = EnvironmentCompat.MEDIA_UNKNOWN;
        public int b;
        public int c;

        a() {
        }
    }

    public static long a(int i) {
        return NativeImpl.c(i) * q.a.a();
    }
}
