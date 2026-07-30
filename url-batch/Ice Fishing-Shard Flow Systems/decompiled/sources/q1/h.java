package q1;

import B6.q;
import D6.x;
import I.InterfaceC0129z;
import P.C0137b;
import P.InterfaceC0138c;
import U.u;
import a.AbstractC0169a;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.Log;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import c1.InterfaceC0289b;
import com.google.android.gms.tasks.Task;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.C0318h;
import com.google.firebase.messaging.z;
import com.icefishing.icefish.ice.fishing.s294s.R;
import d0.InterfaceC0352a;
import i.InterfaceC0515b;
import j1.InterfaceC0568a;
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
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.collections.s;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import m.y;
import p1.C0818a;
import r.InterfaceC0839b;
import s4.p;
import u.C0934e;
import u.C0936g;

/* loaded from: classes.dex */
public class h implements InterfaceC0129z, InterfaceC0138c, InterfaceC0289b, InterfaceC0352a, e0.d, InterfaceC0515b, InterfaceC0568a, y, K1.a, InterfaceC0839b, s4.o {

    /* renamed from: e, reason: collision with root package name */
    public static h f7330e;

    /* renamed from: i, reason: collision with root package name */
    public static h f7331i;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ h f7332l = new h(26);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ h f7333m = new h(27);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7334d;

    public /* synthetic */ h(int i2) {
        this.f7334d = i2;
    }

    public static ArrayList c(List protocols) {
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((x) obj) != x.f624i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(s.g(arrayList, 10));
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            arrayList2.add(((x) obj2).f632d);
        }
        return arrayList2;
    }

    public static void g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] j(List protocols) {
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        T6.f fVar = new T6.f();
        ArrayList c7 = c(protocols);
        int size = c7.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = c7.get(i2);
            i2++;
            String str = (String) obj;
            fVar.H(str.length());
            fVar.N(str);
        }
        return fVar.j(fVar.f2617e);
    }

    public static T6.i k(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i5 = i2 * 2;
            bArr[i2] = (byte) (U6.b.a(str.charAt(i5 + 1)) + (U6.b.a(str.charAt(i5)) << 4));
        }
        return new T6.i(bArr);
    }

    public static T6.i n(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        T6.i iVar = new T6.i(bytes);
        iVar.f2621i = str;
        return iVar;
    }

    public static P0.e o(Context context, String[] strArr, String str, z zVar) {
        String[] u7 = u(context);
        int length = u7.length;
        int i2 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i2 >= length) {
                return null;
            }
            String str2 = u7[i2];
            int i5 = 0;
            while (true) {
                int i7 = i5 + 1;
                if (i5 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i5 = i7;
                }
            }
            if (zipFile != null) {
                int i8 = 0;
                while (true) {
                    int i9 = i8 + 1;
                    if (i8 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb = new StringBuilder("lib");
                            char c7 = File.separatorChar;
                            sb.append(c7);
                            sb.append(str3);
                            sb.append(c7);
                            sb.append(str);
                            String sb2 = sb.toString();
                            zVar.e("Looking for %s in APK %s...", sb2, str2);
                            ZipEntry entry = zipFile.getEntry(sb2);
                            if (entry != null) {
                                P0.e eVar = new P0.e(3, false);
                                eVar.f2194e = zipFile;
                                eVar.f2195i = entry;
                                return eVar;
                            }
                        }
                        i8 = i9;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i2++;
        }
    }

    public static String[] p(Context context, String str) {
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
        for (String str2 : u(context)) {
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

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean q(W.b bVar, Editable editable, int i2, int i5, boolean z7) {
        int min;
        if (editable != null && i2 >= 0 && i5 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z7) {
                    int max = Math.max(i2, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                        loop0: while (true) {
                            boolean z8 = false;
                            while (true) {
                                if (max == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char charAt = editable.charAt(selectionStart);
                                    if (z8) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt)) {
                                        max--;
                                    } else {
                                        if (Character.isHighSurrogate(charAt)) {
                                            break loop0;
                                        }
                                        z8 = true;
                                    }
                                } else if (!z8) {
                                    selectionStart = 0;
                                }
                            }
                            max--;
                        }
                    }
                    selectionStart = -1;
                    int max2 = Math.max(i5, 0);
                    min = editable.length();
                    if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                        loop2: while (true) {
                            boolean z9 = false;
                            while (true) {
                                if (max2 == 0) {
                                    min = selectionEnd;
                                    break loop2;
                                }
                                if (selectionEnd < min) {
                                    char charAt2 = editable.charAt(selectionEnd);
                                    if (z9) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt2)) {
                                        max2--;
                                        selectionEnd++;
                                    } else {
                                        if (Character.isLowSurrogate(charAt2)) {
                                            break loop2;
                                        }
                                        selectionEnd++;
                                        z9 = true;
                                    }
                                }
                            }
                            max2--;
                            selectionEnd++;
                        }
                    }
                    min = -1;
                    if (selectionStart != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i2, 0);
                    min = Math.min(selectionEnd + i5, editable.length());
                }
                u[] uVarArr = (u[]) editable.getSpans(selectionStart, min, u.class);
                if (uVarArr != null && uVarArr.length > 0) {
                    for (u uVar : uVarArr) {
                        int spanStart = editable.getSpanStart(uVar);
                        int spanEnd = editable.getSpanEnd(uVar);
                        selectionStart = Math.min(spanStart, selectionStart);
                        min = Math.max(spanEnd, min);
                    }
                    int max3 = Math.max(selectionStart, 0);
                    int min2 = Math.min(min, editable.length());
                    bVar.beginBatchEdit();
                    editable.delete(max3, min2);
                    bVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public static T6.i s(byte[] bArr, int i2, int i5) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i5 == -1234567890) {
            i5 = bArr.length;
        }
        T6.b.d(bArr.length, i2, i5);
        return new T6.i(kotlin.collections.o.g(bArr, i2, i5 + i2));
    }

    public static String[] u(Context context) {
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

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f7, code lost:
    
        r6 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean v(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo;
        E1.f fVar;
        SigningInfo signingInfo;
        E1.f fVar2;
        boolean hasMultipleSigners;
        Signature[] signingCertificateHistory;
        Signature[] signingCertificateHistory2;
        int i2;
        if (packageInfo != null) {
            boolean z7 = (("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) && ((applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 129) == 0)) ? false : true;
            try {
                fVar = z7 ? n.f7347c : n.f7346b;
                int i5 = Build.VERSION.SDK_INT;
                if (i5 < 28) {
                    Signature[] signatureArr = packageInfo.signatures;
                    byte[] bArr = null;
                    if (signatureArr != null && signatureArr.length == 1) {
                        bArr = signatureArr[0].toByteArray();
                    }
                    if (bArr != null) {
                        E1.b bVar = E1.e.f666e;
                        Object[] objArr = {bArr};
                        AbstractC0169a.H(objArr, 1);
                        fVar2 = new E1.f(objArr, 1);
                    } else {
                        E1.b bVar2 = E1.e.f666e;
                        fVar2 = E1.f.f667m;
                    }
                } else {
                    if (i5 < 28) {
                        throw new IllegalStateException();
                    }
                    signingInfo = packageInfo.signingInfo;
                    if (signingInfo != null) {
                        hasMultipleSigners = signingInfo.hasMultipleSigners();
                        if (!hasMultipleSigners) {
                            signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                            if (signingCertificateHistory != null) {
                                E1.b bVar3 = E1.e.f666e;
                                Object[] objArr2 = new Object[4];
                                signingCertificateHistory2 = signingInfo.getSigningCertificateHistory();
                                int length = signingCertificateHistory2.length;
                                int i7 = 0;
                                int i8 = 0;
                                while (i7 < length) {
                                    byte[] byteArray = signingCertificateHistory2[i7].toByteArray();
                                    byteArray.getClass();
                                    int length2 = objArr2.length;
                                    int i9 = i8 + 1;
                                    if (i9 < 0) {
                                        throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                                    }
                                    if (i9 <= length2) {
                                        i2 = length2;
                                    } else {
                                        i2 = (length2 >> 1) + length2 + 1;
                                        if (i2 < i9) {
                                            int highestOneBit = Integer.highestOneBit(i8);
                                            i2 = highestOneBit + highestOneBit;
                                        }
                                        if (i2 < 0) {
                                            i2 = Integer.MAX_VALUE;
                                        }
                                    }
                                    if (i2 > length2) {
                                        objArr2 = Arrays.copyOf(objArr2, i2);
                                    }
                                    objArr2[i8] = byteArray;
                                    i7++;
                                    i8 = i9;
                                }
                                fVar2 = i8 == 0 ? E1.f.f667m : new E1.f(objArr2, i8);
                            }
                        }
                    }
                    E1.b bVar4 = E1.e.f666e;
                    fVar2 = E1.f.f667m;
                }
            } catch (IllegalArgumentException unused) {
                Log.i("GoogleSignatureVerifier", "package info is not set correctly");
                if ((z7 ? w(packageInfo, n.f7345a) : w(packageInfo, n.f7345a[0])) != null) {
                }
            }
            if (fVar2.isEmpty()) {
                throw new IllegalArgumentException("Unable to obtain package certificate history.");
            }
            E1.e e7 = fVar2.e();
            int size = e7.size();
            int i10 = 0;
            while (i10 < size) {
                byte[] bArr2 = (byte[]) e7.get(i10);
                E1.b listIterator = fVar.listIterator(0);
                do {
                    int i11 = i10 + 1;
                    if (listIterator.hasNext()) {
                    }
                } while (!Arrays.equals(bArr2, (byte[]) listIterator.next()));
                return true;
            }
        }
        return false;
    }

    public static l w(PackageInfo packageInfo, l... lVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            m mVar = new m(packageInfo.signatures[0].toByteArray());
            for (int i2 = 0; i2 < lVarArr.length; i2++) {
                if (lVarArr[i2].equals(mVar)) {
                    return lVarArr[i2];
                }
            }
        }
        return null;
    }

    @Override // r.InterfaceC0839b
    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt("androidx.browser.trusted.displaymode.KEY_ID", 0);
        return bundle;
    }

    @Override // j1.InterfaceC0568a
    public long d() {
        return System.currentTimeMillis();
    }

    @Override // d0.InterfaceC0352a
    public CharSequence e(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        if (TextUtils.isEmpty(null)) {
            return editTextPreference.f3932d.getString(R.string.not_set);
        }
        return null;
    }

    @Override // Q5.a
    public Object get() {
        switch (this.f7334d) {
            case 12:
                return new K1.o(2, Executors.newSingleThreadExecutor());
            default:
                h hVar = new h(22);
                HashMap hashMap = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(X0.d.f2851d, new g1.b(30000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(X0.d.f2853i, new g1.b(1000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(g1.d.f4982e)));
                if (unmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(X0.d.f2852e, new g1.b(86400000L, 86400000L, unmodifiableSet));
                if (hashMap.keySet().size() < X0.d.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new g1.a(hVar, hashMap);
        }
    }

    @Override // K1.a
    public /* synthetic */ Object h(Task task) {
        switch (this.f7334d) {
            case com.onesignal.debug.internal.crash.f.MIN_SDK_VERSION /* 26 */:
                Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
                if (intent != null) {
                    return new C0818a(intent);
                }
                return null;
            default:
                if (task.isSuccessful()) {
                    return (Bundle) task.getResult();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.getException())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
        }
    }

    @Override // m.y
    public boolean i(m.m mVar) {
        return false;
    }

    public boolean r(CharSequence charSequence) {
        return false;
    }

    public List t(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (S1.b bVar : componentRegistrar.getComponents()) {
            String str = bVar.f2465a;
            if (str != null) {
                bVar = new S1.b(str, bVar.f2466b, bVar.f2467c, bVar.f2468d, bVar.f2469e, new C0318h(str, 8, bVar), bVar.f2471g);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    public /* synthetic */ h(int i2, Object obj) {
        this.f7334d = i2;
    }

    public h() {
        this.f7334d = 19;
        new C0934e(0);
        new C0936g();
    }

    public h(q block) {
        this.f7334d = 6;
        Intrinsics.checkNotNullParameter(block, "block");
    }

    @Override // e0.d
    public void l() {
    }

    @Override // P.InterfaceC0138c
    public Object f(C0137b c0137b) {
        throw c0137b;
    }

    @Override // m.y
    public void a(m.m mVar, boolean z7) {
    }

    @Override // e0.d
    public void m(int i2, Object obj) {
    }

    @Override // s4.o
    public void onMethodCall(s4.n nVar, p pVar) {
    }

    @Override // I.InterfaceC0129z
    public void onScrollLimit(int i2, int i5, int i7, boolean z7) {
    }

    @Override // I.InterfaceC0129z
    public void onScrollProgress(int i2, int i5, int i7, int i8) {
    }
}
