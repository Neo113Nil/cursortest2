package y1;

import H1.C0133g;
import N3.j;
import O3.i;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.firebase.components.ComponentRegistrar;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import l5.AbstractC0505i;
import p1.C0576a;
import u0.C0675e;
import u0.C0679i;
import u0.C0689s;

/* renamed from: y1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0760d implements F0.b, i, P.d, U.b {

    /* renamed from: f, reason: collision with root package name */
    public static C0760d f6234f;

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static n6.i c(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = i7 * 2;
            bArr[i7] = (byte) (o6.b.a(str.charAt(i8 + 1)) + (o6.b.a(str.charAt(i8)) << 4));
        }
        return new n6.i(bArr);
    }

    public static n6.i d(String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        byte[] bytes = str.getBytes(F5.a.f785a);
        kotlin.jvm.internal.i.d(bytes, "getBytes(...)");
        n6.i iVar = new n6.i(bytes);
        iVar.f5528h = str;
        return iVar;
    }

    public static C0689s e(Context context, String[] strArr, String str, C0679i c0679i) {
        String[] j4 = j(context);
        int length = j4.length;
        int i7 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i7 >= length) {
                return null;
            }
            String str2 = j4[i7];
            int i8 = 0;
            while (true) {
                int i9 = i8 + 1;
                if (i8 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i8 = i9;
                }
            }
            if (zipFile != null) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (i10 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb = new StringBuilder("lib");
                            char c7 = File.separatorChar;
                            sb.append(c7);
                            sb.append(str3);
                            sb.append(c7);
                            sb.append(str);
                            String sb2 = sb.toString();
                            c0679i.e("Looking for %s in APK %s...", sb2, str2);
                            ZipEntry entry = zipFile.getEntry(sb2);
                            if (entry != null) {
                                C0689s c0689s = new C0689s();
                                c0689s.f6034f = zipFile;
                                c0689s.f6035g = entry;
                                return c0689s;
                            }
                        }
                        i10 = i11;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i7++;
        }
    }

    public static String[] f(Context context, String str) {
        StringBuilder sb = new StringBuilder("lib");
        char c7 = File.separatorChar;
        sb.append(c7);
        sb.append("([^\\");
        sb.append(c7);
        sb.append("]*)");
        sb.append(c7);
        sb.append(str);
        Pattern compile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : j(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(entries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public static n6.i h(byte[] bArr, int i7, int i8) {
        if (i8 == -1234567890) {
            i8 = bArr.length;
        }
        n6.b.d(bArr.length, i7, i8);
        return new n6.i(AbstractC0505i.H(bArr, i7, i8 + i7));
    }

    public static String[] j(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    @Override // U.b
    public U.c a(U.a aVar) {
        return new V.g((Context) aVar.f2483c, (String) aVar.f2484d, (D1.b) aVar.f2485e, aVar.f2481a, aVar.f2482b);
    }

    @Override // j5.InterfaceC0438a
    public Object get() {
        U0.h hVar = new U0.h(4);
        HashMap hashMap = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(A0.d.f43f, new J0.c(30000L, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(A0.d.f45h, new J0.c(1000L, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(J0.e.f1248g)));
        if (unmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(A0.d.f44g, new J0.c(86400000L, 86400000L, unmodifiableSet));
        if (hashMap.keySet().size() < A0.d.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new J0.b(hVar, hashMap);
    }

    public List i(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (C0576a c0576a : componentRegistrar.getComponents()) {
            String str = c0576a.f5660a;
            if (str != null) {
                c0576a = new C0576a(str, c0576a.f5661b, c0576a.f5662c, c0576a.f5663d, c0576a.f5664e, new C0133g(str, 6, c0576a), c0576a.f5666g);
            }
            arrayList.add(c0576a);
        }
        return arrayList;
    }

    @Override // P.d
    public void l() {
    }

    @Override // O3.i
    public void g(C0675e c0675e, j jVar) {
    }

    @Override // P.d
    public void m(int i7, Object obj) {
    }
}
