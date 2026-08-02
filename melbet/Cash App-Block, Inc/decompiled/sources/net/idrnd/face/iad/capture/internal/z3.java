package net.idrnd.face.iad.capture.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.stream.Collectors;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import net.idrnd.face.iad.capture.checker.nativelib.NativeInterface;

/* loaded from: classes9.dex */
public final class z3 {
    public final Context a;
    public final LinkedHashSet b = new LinkedHashSet();
    public final LinkedHashSet c = new LinkedHashSet();
    public final d4 d;

    public z3(Context context) {
        this.a = context;
        this.d = new d4(context);
        try {
            if (NativeInterface.a) {
                NativeInterface.call(new Object[]{1, Boolean.FALSE});
            }
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public static boolean a(String str) {
        String str2 = t.a;
        boolean z = false;
        for (String str3 : s.b()) {
            if (new File(str3, str).exists()) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(51:37|38|39|(1:41)(3:159|(7:161|(3:163|(3:166|(1:206)(2:168|169)|164)|207)|208|170|(3:174|(3:176|(6:178|(3:180|(3:183|(1:200)(2:185|186)|181)|201)|202|187|188|(1:(2:190|(3:193|194|195)(1:192))(3:197|198|199)))(2:203|204)|196)|205)|172|173)|209)|42|(1:44)|45|(1:158)(1:49)|(1:51)|(2:52|53)|(2:55|56)|(39:58|59|(1:61)|62|(5:139|(1:141)|142|143|(2:145|(2:147|(33:149|(1:66)|67|(1:69)|70|(1:138)(1:78)|79|(1:81)|82|83|(2:85|(2:87|(22:89|90|(1:92)|93|(1:95)|96|97|98|(12:100|(1:102)(1:132)|103|(1:105)(1:130)|106|(1:108)|109|(1:111)|112|(1:114)|115|(2:128|129)(2:125|126))|133|103|(0)(0)|106|(0)|109|(0)|112|(0)|115|(0)|128|129)))|136|90|(0)|93|(0)|96|97|98|(0)|133|103|(0)(0)|106|(0)|109|(0)|112|(0)|115|(0)|128|129))))|64|(0)|67|(0)|70|(1:72)|138|79|(0)|82|83|(0)|136|90|(0)|93|(0)|96|97|98|(0)|133|103|(0)(0)|106|(0)|109|(0)|112|(0)|115|(0)|128|129)|152|59|(0)|62|(0)|64|(0)|67|(0)|70|(0)|138|79|(0)|82|83|(0)|136|90|(0)|93|(0)|96|97|98|(0)|133|103|(0)(0)|106|(0)|109|(0)|112|(0)|115|(0)|128|129) */
    /* JADX WARN: Removed duplicated region for block: B:100:0x033f A[Catch: UnsatisfiedLinkError -> 0x035a, TryCatch #3 {UnsatisfiedLinkError -> 0x035a, blocks: (B:98:0x033b, B:100:0x033f, B:102:0x0351), top: B:97:0x033b }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02ee A[Catch: UnsatisfiedLinkError -> 0x030a, TryCatch #4 {UnsatisfiedLinkError -> 0x030a, blocks: (B:83:0x02ea, B:85:0x02ee, B:87:0x0300), top: B:82:0x02ea }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x031d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d() {
        boolean z;
        String[] strArr;
        boolean z2;
        Collection collection;
        boolean z3;
        int i;
        boolean z4;
        Collection collection2;
        boolean z5;
        boolean z6;
        boolean z7;
        Process process;
        boolean z8;
        boolean z9;
        boolean a;
        boolean z10;
        boolean z11;
        int i2;
        int i3;
        Object[] objArr;
        int i4;
        boolean z12;
        boolean exists;
        InputStream inputStream;
        Collection collection3;
        LinkedHashSet linkedHashSet = this.b;
        linkedHashSet.clear();
        String[] strArr2 = t.b;
        ArrayList arrayList = new ArrayList(CollectionsKt__CollectionsKt.listOf(Arrays.copyOf(strArr2, strArr2.length)));
        Context context = this.a;
        PackageManager packageManager = context.getPackageManager();
        Iterator it = arrayList.iterator();
        int i5 = 0;
        boolean z13 = false;
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            try {
                packageManager.getPackageInfo((String) it.next(), 0);
                z13 = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (z13) {
            linkedHashSet.add(a4.a);
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr3 = t.c;
        arrayList2.addAll(CollectionsKt__CollectionsKt.listOf(Arrays.copyOf(strArr3, strArr3.length)));
        PackageManager packageManager2 = context.getPackageManager();
        Iterator it2 = arrayList2.iterator();
        boolean z14 = false;
        while (it2.hasNext()) {
            try {
                packageManager2.getPackageInfo((String) it2.next(), 0);
                z14 = true;
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        if (z14) {
            linkedHashSet.add(a4.b);
        }
        boolean a2 = a(t.a);
        if (a2) {
            linkedHashSet.add(a4.c);
        }
        try {
            inputStream = Runtime.getRuntime().exec("mount").getInputStream();
        } catch (IOException | NoSuchElementException unused3) {
        }
        if (inputStream != null) {
            String next = new Scanner(inputStream).useDelimiter("\\A").next();
            next.getClass();
            List split = new Regex("\n").split(0, next);
            if (!split.isEmpty()) {
                ListIterator listIterator = split.listIterator(split.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        collection3 = CollectionsKt.take(split, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            collection3 = EmptyList.INSTANCE;
            strArr = (String[]) collection3.toArray(new String[0]);
            char c = 2;
            if (strArr != null) {
            }
            z5 = a2;
            z6 = z14;
            if (z2) {
            }
            String str = Build.TAGS;
            if (str == null) {
            }
            if (z7) {
            }
            process = Runtime.getRuntime().exec(new String[]{"which", t.a});
            if (new BufferedReader(new InputStreamReader(process.getInputStream())).readLine() != null) {
            }
            z8 = false;
            process.destroy();
            if (z8) {
            }
            if (NativeInterface.a) {
            }
            z9 = false;
            if (z9) {
            }
            a = a("magisk");
            if (a) {
            }
            d4 d4Var = this.d;
            d4Var.getClass();
            HashSet hashSet = d4Var.b;
            ArrayList arrayList3 = new ArrayList();
            hashSet.clear();
            String absolutePath = d4Var.a.getFilesDir().getAbsolutePath();
            int a3 = m4.a(absolutePath);
            if (m4.a(d4.a(0)) != 0) {
            }
            arrayList3.add(Boolean.valueOf(z10));
            if (z10) {
            }
            if (NativeInterface.a) {
            }
            z11 = false;
            arrayList3.add(Boolean.valueOf(z11));
            if (z11) {
            }
            if (d4.d == 0) {
            }
            i2 = d4.d + 11;
            i3 = Integer.MAX_VALUE & i2;
            d4.d = i3;
            objArr = new Object[]{Integer.valueOf(i3)};
            if (NativeInterface.a) {
            }
            i4 = 1;
            if ((1073741824 & i4) == 0) {
            }
            if (((Integer) objArr[0]).intValue() != (d4.c[i2 & 5] ^ (~(i3 + i4)))) {
            }
            arrayList3.add(Boolean.valueOf(!z12));
            if (!z12) {
            }
            exists = new File(d4.a(1)).exists();
            arrayList3.add(Boolean.valueOf(exists));
            if (exists) {
            }
            boolean contains = ((String) arrayList3.stream().map(new d4$$ExternalSyntheticLambda0(0)).collect(Collectors.joining())).contains("1");
            hashSet.getClass();
            CollectionsKt__MutableCollectionsKt.addAll(hashSet, this.c);
            if (z13) {
            }
        }
        strArr = null;
        char c2 = 2;
        if (strArr != null) {
            z2 = false;
        } else {
            int length = strArr.length;
            int i6 = 0;
            z2 = false;
            z14 = z14;
            while (i6 < length) {
                List split2 = new Regex(" ").split(i5, strArr[i6]);
                if (!split2.isEmpty()) {
                    ListIterator listIterator2 = split2.listIterator(split2.size());
                    while (listIterator2.hasPrevious()) {
                        if (((String) listIterator2.previous()).length() != 0) {
                            collection = CollectionsKt.take(split2, listIterator2.nextIndex() + (z ? 1 : 0));
                            break;
                        }
                    }
                }
                collection = EmptyList.INSTANCE;
                String[] strArr4 = (String[]) collection.toArray(new String[i5]);
                if (strArr4.length >= 6) {
                    String str2 = strArr4[c2];
                    String str3 = strArr4[5];
                    String[] strArr5 = t.e;
                    int length2 = strArr5.length;
                    int i7 = i5;
                    z14 = z14;
                    while (i7 < length2) {
                        if (StringsKt__StringsJVMKt.equals(str2, strArr5[i7], z)) {
                            boolean z15 = z;
                            String replace$default = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(str3, "(", ""), ")", "");
                            List split3 = new Regex(",").split(0, replace$default);
                            if (!split3.isEmpty()) {
                                ListIterator listIterator3 = split3.listIterator(split3.size());
                                while (listIterator3.hasPrevious()) {
                                    if (((String) listIterator3.previous()).length() != 0) {
                                        collection2 = CollectionsKt.take(split3, listIterator3.nextIndex() + 1);
                                        break;
                                    }
                                }
                            }
                            collection2 = EmptyList.INSTANCE;
                            z3 = a2;
                            String[] strArr6 = (String[]) collection2.toArray(new String[0]);
                            int length3 = strArr6.length;
                            int i8 = 0;
                            boolean z16 = z14;
                            while (true) {
                                if (i8 >= length3) {
                                    i = length2;
                                    z4 = z16;
                                    str3 = replace$default;
                                    break;
                                }
                                String[] strArr7 = strArr6;
                                i = length2;
                                z4 = z16;
                                if (StringsKt__StringsJVMKt.equals(strArr7[i8], "rw", z15)) {
                                    str3 = replace$default;
                                    z2 = true;
                                    break;
                                }
                                i8++;
                                strArr6 = strArr7;
                                length2 = i;
                                z16 = z4;
                                z15 = true;
                            }
                        } else {
                            z3 = a2;
                            i = length2;
                            z4 = z14;
                        }
                        i7++;
                        a2 = z3;
                        length2 = i;
                        z14 = z4;
                        z = true;
                    }
                }
                i6++;
                a2 = a2;
                z14 = z14;
                i5 = 0;
                z = true;
                c2 = 2;
            }
        }
        z5 = a2;
        z6 = z14;
        if (z2) {
            linkedHashSet.add(a4.f);
        }
        String str4 = Build.TAGS;
        z7 = str4 == null && StringsKt.contains((CharSequence) str4, (CharSequence) "test-keys", false);
        if (z7) {
            linkedHashSet.add(a4.g);
        }
        try {
            process = Runtime.getRuntime().exec(new String[]{"which", t.a});
        } catch (Throwable unused4) {
            process = null;
        }
        try {
        } catch (Throwable unused5) {
            if (process == null) {
                z8 = false;
                if (z8) {
                }
                if (NativeInterface.a) {
                }
                z9 = false;
                if (z9) {
                }
                a = a("magisk");
                if (a) {
                }
                d4 d4Var2 = this.d;
                d4Var2.getClass();
                HashSet hashSet2 = d4Var2.b;
                ArrayList arrayList32 = new ArrayList();
                hashSet2.clear();
                String absolutePath2 = d4Var2.a.getFilesDir().getAbsolutePath();
                int a32 = m4.a(absolutePath2);
                if (m4.a(d4.a(0)) != 0) {
                }
                arrayList32.add(Boolean.valueOf(z10));
                if (z10) {
                }
                if (NativeInterface.a) {
                }
                z11 = false;
                arrayList32.add(Boolean.valueOf(z11));
                if (z11) {
                }
                if (d4.d == 0) {
                }
                i2 = d4.d + 11;
                i3 = Integer.MAX_VALUE & i2;
                d4.d = i3;
                objArr = new Object[]{Integer.valueOf(i3)};
                if (NativeInterface.a) {
                }
                i4 = 1;
                if ((1073741824 & i4) == 0) {
                }
                if (((Integer) objArr[0]).intValue() != (d4.c[i2 & 5] ^ (~(i3 + i4)))) {
                }
                arrayList32.add(Boolean.valueOf(!z12));
                if (!z12) {
                }
                exists = new File(d4.a(1)).exists();
                arrayList32.add(Boolean.valueOf(exists));
                if (exists) {
                }
                boolean contains2 = ((String) arrayList32.stream().map(new d4$$ExternalSyntheticLambda0(0)).collect(Collectors.joining())).contains("1");
                hashSet2.getClass();
                CollectionsKt__MutableCollectionsKt.addAll(hashSet2, this.c);
                if (z13) {
                }
            }
            z8 = false;
            process.destroy();
            if (z8) {
            }
            if (NativeInterface.a) {
            }
            z9 = false;
            if (z9) {
            }
            a = a("magisk");
            if (a) {
            }
            d4 d4Var22 = this.d;
            d4Var22.getClass();
            HashSet hashSet22 = d4Var22.b;
            ArrayList arrayList322 = new ArrayList();
            hashSet22.clear();
            String absolutePath22 = d4Var22.a.getFilesDir().getAbsolutePath();
            int a322 = m4.a(absolutePath22);
            if (m4.a(d4.a(0)) != 0) {
            }
            arrayList322.add(Boolean.valueOf(z10));
            if (z10) {
            }
            if (NativeInterface.a) {
            }
            z11 = false;
            arrayList322.add(Boolean.valueOf(z11));
            if (z11) {
            }
            if (d4.d == 0) {
            }
            i2 = d4.d + 11;
            i3 = Integer.MAX_VALUE & i2;
            d4.d = i3;
            objArr = new Object[]{Integer.valueOf(i3)};
            if (NativeInterface.a) {
            }
            i4 = 1;
            if ((1073741824 & i4) == 0) {
            }
            if (((Integer) objArr[0]).intValue() != (d4.c[i2 & 5] ^ (~(i3 + i4)))) {
            }
            arrayList322.add(Boolean.valueOf(!z12));
            if (!z12) {
            }
            exists = new File(d4.a(1)).exists();
            arrayList322.add(Boolean.valueOf(exists));
            if (exists) {
            }
            boolean contains22 = ((String) arrayList322.stream().map(new d4$$ExternalSyntheticLambda0(0)).collect(Collectors.joining())).contains("1");
            hashSet22.getClass();
            CollectionsKt__MutableCollectionsKt.addAll(hashSet22, this.c);
            if (z13) {
            }
        }
        if (new BufferedReader(new InputStreamReader(process.getInputStream())).readLine() != null) {
            z8 = true;
            process.destroy();
            if (z8) {
                linkedHashSet.add(a4.d);
            }
            if (NativeInterface.a) {
                String str5 = t.a;
                String[] b = s.b();
                int length4 = b.length;
                String[] strArr8 = new String[length4];
                for (int i9 = 0; i9 < length4; i9++) {
                    strArr8[i9] = Recorder$$ExternalSyntheticOutline2.m$1(b[i9], t.a);
                }
                if (NativeInterface.a) {
                    Object call = NativeInterface.call(new Object[]{3, strArr8});
                    if (call instanceof Integer) {
                        if (((Integer) call).intValue() > 0) {
                            z9 = true;
                            if (z9) {
                                linkedHashSet.add(a4.e);
                            }
                            a = a("magisk");
                            if (a) {
                                linkedHashSet.add(a4.h);
                            }
                            d4 d4Var222 = this.d;
                            d4Var222.getClass();
                            HashSet hashSet222 = d4Var222.b;
                            ArrayList arrayList3222 = new ArrayList();
                            hashSet222.clear();
                            String absolutePath222 = d4Var222.a.getFilesDir().getAbsolutePath();
                            int a3222 = m4.a(absolutePath222);
                            z10 = m4.a(d4.a(0)) != 0 && new File(absolutePath222).exists() && (a3222 == 2 || a3222 == 13);
                            arrayList3222.add(Boolean.valueOf(z10));
                            if (z10) {
                                hashSet222.add(g4.b);
                            }
                            if (NativeInterface.a) {
                                Object call2 = NativeInterface.call(new Object[]{4, null});
                                if (call2 instanceof Integer) {
                                    if (((Integer) call2).intValue() != 0) {
                                        z11 = true;
                                        arrayList3222.add(Boolean.valueOf(z11));
                                        if (z11) {
                                            hashSet222.add(g4.c);
                                        }
                                        if (d4.d == 0) {
                                            d4.d = (int) ((-System.currentTimeMillis()) & 2146500607);
                                        }
                                        i2 = d4.d + 11;
                                        i3 = Integer.MAX_VALUE & i2;
                                        d4.d = i3;
                                        objArr = new Object[]{Integer.valueOf(i3)};
                                        if (NativeInterface.a) {
                                            Object call3 = NativeInterface.call(new Object[]{2, objArr});
                                            i4 = call3 instanceof Integer ? ((Integer) call3).intValue() : 0;
                                            z12 = (1073741824 & i4) == 0;
                                            if (((Integer) objArr[0]).intValue() != (d4.c[i2 & 5] ^ (~(i3 + i4)))) {
                                                z12 = false;
                                            }
                                            arrayList3222.add(Boolean.valueOf(!z12));
                                            if (!z12) {
                                                hashSet222.add(g4.d);
                                            }
                                            exists = new File(d4.a(1)).exists();
                                            arrayList3222.add(Boolean.valueOf(exists));
                                            if (exists) {
                                                hashSet222.add(g4.e);
                                            }
                                            boolean contains222 = ((String) arrayList3222.stream().map(new d4$$ExternalSyntheticLambda0(0)).collect(Collectors.joining())).contains("1");
                                            hashSet222.getClass();
                                            CollectionsKt__MutableCollectionsKt.addAll(hashSet222, this.c);
                                            return !z13 || z6 || z5 || z2 || z7 || z8 || z9 || a || contains222;
                                        }
                                        i4 = 1;
                                        if ((1073741824 & i4) == 0) {
                                        }
                                        if (((Integer) objArr[0]).intValue() != (d4.c[i2 & 5] ^ (~(i3 + i4)))) {
                                        }
                                        arrayList3222.add(Boolean.valueOf(!z12));
                                        if (!z12) {
                                        }
                                        exists = new File(d4.a(1)).exists();
                                        arrayList3222.add(Boolean.valueOf(exists));
                                        if (exists) {
                                        }
                                        boolean contains2222 = ((String) arrayList3222.stream().map(new d4$$ExternalSyntheticLambda0(0)).collect(Collectors.joining())).contains("1");
                                        hashSet222.getClass();
                                        CollectionsKt__MutableCollectionsKt.addAll(hashSet222, this.c);
                                        if (z13) {
                                        }
                                    }
                                }
                            }
                            z11 = false;
                            arrayList3222.add(Boolean.valueOf(z11));
                            if (z11) {
                            }
                            if (d4.d == 0) {
                            }
                            i2 = d4.d + 11;
                            i3 = Integer.MAX_VALUE & i2;
                            d4.d = i3;
                            objArr = new Object[]{Integer.valueOf(i3)};
                            if (NativeInterface.a) {
                            }
                            i4 = 1;
                            if ((1073741824 & i4) == 0) {
                            }
                            if (((Integer) objArr[0]).intValue() != (d4.c[i2 & 5] ^ (~(i3 + i4)))) {
                            }
                            arrayList3222.add(Boolean.valueOf(!z12));
                            if (!z12) {
                            }
                            exists = new File(d4.a(1)).exists();
                            arrayList3222.add(Boolean.valueOf(exists));
                            if (exists) {
                            }
                            boolean contains22222 = ((String) arrayList3222.stream().map(new d4$$ExternalSyntheticLambda0(0)).collect(Collectors.joining())).contains("1");
                            hashSet222.getClass();
                            CollectionsKt__MutableCollectionsKt.addAll(hashSet222, this.c);
                            if (z13) {
                            }
                        }
                    }
                }
            }
            z9 = false;
            if (z9) {
            }
            a = a("magisk");
            if (a) {
            }
            d4 d4Var2222 = this.d;
            d4Var2222.getClass();
            HashSet hashSet2222 = d4Var2222.b;
            ArrayList arrayList32222 = new ArrayList();
            hashSet2222.clear();
            String absolutePath2222 = d4Var2222.a.getFilesDir().getAbsolutePath();
            int a32222 = m4.a(absolutePath2222);
            if (m4.a(d4.a(0)) != 0) {
            }
            arrayList32222.add(Boolean.valueOf(z10));
            if (z10) {
            }
            if (NativeInterface.a) {
            }
            z11 = false;
            arrayList32222.add(Boolean.valueOf(z11));
            if (z11) {
            }
            if (d4.d == 0) {
            }
            i2 = d4.d + 11;
            i3 = Integer.MAX_VALUE & i2;
            d4.d = i3;
            objArr = new Object[]{Integer.valueOf(i3)};
            if (NativeInterface.a) {
            }
            i4 = 1;
            if ((1073741824 & i4) == 0) {
            }
            if (((Integer) objArr[0]).intValue() != (d4.c[i2 & 5] ^ (~(i3 + i4)))) {
            }
            arrayList32222.add(Boolean.valueOf(!z12));
            if (!z12) {
            }
            exists = new File(d4.a(1)).exists();
            arrayList32222.add(Boolean.valueOf(exists));
            if (exists) {
            }
            boolean contains222222 = ((String) arrayList32222.stream().map(new d4$$ExternalSyntheticLambda0(0)).collect(Collectors.joining())).contains("1");
            hashSet2222.getClass();
            CollectionsKt__MutableCollectionsKt.addAll(hashSet2222, this.c);
            if (z13) {
            }
        }
        z8 = false;
        process.destroy();
        if (z8) {
        }
        if (NativeInterface.a) {
        }
        z9 = false;
        if (z9) {
        }
        a = a("magisk");
        if (a) {
        }
        d4 d4Var22222 = this.d;
        d4Var22222.getClass();
        HashSet hashSet22222 = d4Var22222.b;
        ArrayList arrayList322222 = new ArrayList();
        hashSet22222.clear();
        String absolutePath22222 = d4Var22222.a.getFilesDir().getAbsolutePath();
        int a322222 = m4.a(absolutePath22222);
        if (m4.a(d4.a(0)) != 0) {
        }
        arrayList322222.add(Boolean.valueOf(z10));
        if (z10) {
        }
        if (NativeInterface.a) {
        }
        z11 = false;
        arrayList322222.add(Boolean.valueOf(z11));
        if (z11) {
        }
        if (d4.d == 0) {
        }
        i2 = d4.d + 11;
        i3 = Integer.MAX_VALUE & i2;
        d4.d = i3;
        objArr = new Object[]{Integer.valueOf(i3)};
        if (NativeInterface.a) {
        }
        i4 = 1;
        if ((1073741824 & i4) == 0) {
        }
        if (((Integer) objArr[0]).intValue() != (d4.c[i2 & 5] ^ (~(i3 + i4)))) {
        }
        arrayList322222.add(Boolean.valueOf(!z12));
        if (!z12) {
        }
        exists = new File(d4.a(1)).exists();
        arrayList322222.add(Boolean.valueOf(exists));
        if (exists) {
        }
        boolean contains2222222 = ((String) arrayList322222.stream().map(new d4$$ExternalSyntheticLambda0(0)).collect(Collectors.joining())).contains("1");
        hashSet22222.getClass();
        CollectionsKt__MutableCollectionsKt.addAll(hashSet22222, this.c);
        if (z13) {
        }
    }
}
