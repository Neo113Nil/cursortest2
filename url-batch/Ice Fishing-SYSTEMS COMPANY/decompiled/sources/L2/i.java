package L2;

import B1.G;
import N2.A;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.content.res.AssetFileDescriptor;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.Log;
import androidx.emoji2.text.v;
import b2.InterfaceC0525b;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C3151ea;
import com.google.android.gms.internal.ads.C3165eo;
import com.google.android.gms.internal.ads.C3668o5;
import com.google.android.gms.internal.ads.InterfaceC2524Dl;
import f2.C4498a;
import f2.C4499b;
import f2.EnumC4501d;
import i3.AbstractC4576a;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import m.Q0;
import m1.C4774a;
import m1.C4776c;
import q2.InterfaceC4877a;
import q2.r;
import r0.InterfaceC4954c;
import r7.AbstractC4978i;
import s1.InterfaceC4992e;
import s2.C4997e;
import s2.InterfaceC4993a;
import s2.InterfaceC4995c;
import t2.C;
import w1.InterfaceC5148a;

/* loaded from: classes.dex */
public class i implements G, O1.c, W6.e, InterfaceC0525b, com.bumptech.glide.manager.g, com.bumptech.glide.manager.l, i2.a, InterfaceC4954c, InterfaceC5148a {

    /* renamed from: u, reason: collision with root package name */
    public static i f1730u;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1731n;

    public /* synthetic */ i(int i) {
        this.f1731n = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f6, code lost:
    
        r6 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean A(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo;
        b3.f fVar;
        SigningInfo signingInfo;
        b3.f fVar2;
        boolean hasMultipleSigners;
        Signature[] signingCertificateHistory;
        Signature[] signingCertificateHistory2;
        int i;
        if (packageInfo != null) {
            boolean z8 = (("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) && ((applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & com.anythink.expressad.video.module.a.a.f21888T) == 0)) ? false : true;
            try {
                fVar = z8 ? o.f1744c : o.f1743b;
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 28) {
                    Signature[] signatureArr = packageInfo.signatures;
                    byte[] bArr = null;
                    if (signatureArr != null && signatureArr.length == 1) {
                        bArr = signatureArr[0].toByteArray();
                    }
                    if (bArr != null) {
                        b3.b bVar = b3.e.f5534u;
                        Object[] objArr = {bArr};
                        com.bumptech.glide.f.t(objArr, 1);
                        fVar2 = new b3.f(objArr, 1);
                    } else {
                        b3.b bVar2 = b3.e.f5534u;
                        fVar2 = b3.f.f5535x;
                    }
                } else {
                    if (i4 < 28) {
                        throw new IllegalStateException();
                    }
                    signingInfo = packageInfo.signingInfo;
                    if (signingInfo != null) {
                        hasMultipleSigners = signingInfo.hasMultipleSigners();
                        if (!hasMultipleSigners) {
                            signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                            if (signingCertificateHistory != null) {
                                b3.b bVar3 = b3.e.f5534u;
                                Object[] objArr2 = new Object[4];
                                signingCertificateHistory2 = signingInfo.getSigningCertificateHistory();
                                int length = signingCertificateHistory2.length;
                                int i9 = 0;
                                int i10 = 0;
                                while (i9 < length) {
                                    byte[] byteArray = signingCertificateHistory2[i9].toByteArray();
                                    byteArray.getClass();
                                    int length2 = objArr2.length;
                                    int i11 = i10 + 1;
                                    if (i11 < 0) {
                                        throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                                    }
                                    if (i11 <= length2) {
                                        i = length2;
                                    } else {
                                        i = (length2 >> 1) + length2 + 1;
                                        if (i < i11) {
                                            int highestOneBit = Integer.highestOneBit(i10);
                                            i = highestOneBit + highestOneBit;
                                        }
                                        if (i < 0) {
                                            i = Integer.MAX_VALUE;
                                        }
                                    }
                                    if (i > length2) {
                                        objArr2 = Arrays.copyOf(objArr2, i);
                                    }
                                    objArr2[i10] = byteArray;
                                    i9++;
                                    i10 = i11;
                                }
                                fVar2 = i10 == 0 ? b3.f.f5535x : new b3.f(objArr2, i10);
                            }
                        }
                    }
                    b3.b bVar4 = b3.e.f5534u;
                    fVar2 = b3.f.f5535x;
                }
            } catch (IllegalArgumentException unused) {
                Log.i("GoogleSignatureVerifier", "package info is not set correctly");
                if ((z8 ? C(packageInfo, o.f1742a) : C(packageInfo, o.f1742a[0])) != null) {
                }
            }
            if (fVar2.isEmpty()) {
                throw new IllegalArgumentException("Unable to obtain package certificate history.");
            }
            b3.e f6 = fVar2.f();
            int size = f6.size();
            int i12 = 0;
            while (i12 < size) {
                byte[] bArr2 = (byte[]) f6.get(i12);
                b3.b listIterator = fVar.listIterator(0);
                do {
                    int i13 = i12 + 1;
                    if (listIterator.hasNext()) {
                    }
                } while (!Arrays.equals(bArr2, (byte[]) listIterator.next()));
                return true;
            }
        }
        return false;
    }

    public static final boolean B(Context context, C4997e c4997e, InterfaceC4995c interfaceC4995c, InterfaceC4993a interfaceC4993a, C3165eo c3165eo, String str) {
        int i = 0;
        if (c4997e == null) {
            int i4 = C.f40822b;
            u2.i.f("No intent data for launcher overlay.");
            return false;
        }
        AbstractC3368ia.a(context);
        Intent intent = c4997e.f40461A;
        if (intent != null) {
            return z(context, intent, interfaceC4995c, interfaceC4993a, c4997e.f40463C, c3165eo, str, c4997e.f40464D);
        }
        Intent intent2 = new Intent();
        String str2 = c4997e.f40466u;
        if (TextUtils.isEmpty(str2)) {
            int i9 = C.f40822b;
            u2.i.f("Open GMSG did not contain a URL.");
            return false;
        }
        String str3 = c4997e.f40467v;
        if (TextUtils.isEmpty(str3)) {
            intent2.setData(Uri.parse(str2));
        } else {
            intent2.setDataAndType(Uri.parse(str2), str3);
        }
        intent2.setAction("android.intent.action.VIEW");
        String str4 = c4997e.f40468w;
        if (!TextUtils.isEmpty(str4)) {
            intent2.setPackage(str4);
        }
        String str5 = c4997e.f40469x;
        if (!TextUtils.isEmpty(str5)) {
            String[] split = str5.split("/", 2);
            if (split.length < 2) {
                int i10 = C.f40822b;
                u2.i.f("Could not parse component name from open GMSG: ".concat(str5));
                return false;
            }
            intent2.setClassName(split[0], split[1]);
        }
        String str6 = c4997e.f40470y;
        if (!TextUtils.isEmpty(str6)) {
            try {
                i = Integer.parseInt(str6);
            } catch (NumberFormatException unused) {
                int i11 = C.f40822b;
                u2.i.f("Could not parse intent flags.");
            }
            intent2.addFlags(i);
        }
        C3151ea c3151ea = AbstractC3368ia.f31821w5;
        r rVar = r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31812v5)).booleanValue()) {
                t2.G g9 = p2.j.f39798C.f39803c;
                t2.G.L(context, intent2);
            }
        }
        return z(context, intent2, interfaceC4995c, interfaceC4993a, c4997e.f40463C, c3165eo, str, c4997e.f40464D);
    }

    public static m C(PackageInfo packageInfo, m... mVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            n nVar = new n(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < mVarArr.length; i++) {
                if (mVarArr[i].equals(nVar)) {
                    return mVarArr[i];
                }
            }
        }
        return null;
    }

    public static void i(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static ArrayList k(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new l1.d((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    public static i l(Context context, int i) {
        S0.f.d("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC4576a.f38303m);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        com.bumptech.glide.d.o(context, obtainStyledAttributes, 4);
        com.bumptech.glide.d.o(context, obtainStyledAttributes, 9);
        com.bumptech.glide.d.o(context, obtainStyledAttributes, 7);
        obtainStyledAttributes.getDimensionPixelSize(8, 0);
        C3.k.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new C3.a(0)).a();
        obtainStyledAttributes.recycle();
        i iVar = new i(17);
        S0.f.e(rect.left);
        S0.f.e(rect.top);
        S0.f.e(rect.right);
        S0.f.e(rect.bottom);
        return iVar;
    }

    public static u8.h m(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i4 = i * 2;
            bArr[i] = (byte) (v8.b.a(str.charAt(i4 + 1)) + (v8.b.a(str.charAt(i4)) << 4));
        }
        return new u8.h(bArr);
    }

    public static u8.h n(String str) {
        kotlin.jvm.internal.h.e(str, "<this>");
        byte[] bytes = str.getBytes(M7.a.f1916a);
        kotlin.jvm.internal.h.d(bytes, "getBytes(...)");
        u8.h hVar = new u8.h(bytes);
        hVar.f41281v = str;
        return hVar;
    }

    public static S0.l q(Context context, String[] strArr, String str, Y2.e eVar) {
        String[] x3 = x(context);
        int length = x3.length;
        int i = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i >= length) {
                return null;
            }
            String str2 = x3[i];
            int i4 = 0;
            while (true) {
                int i9 = i4 + 1;
                if (i4 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i4 = i9;
                }
            }
            if (zipFile != null) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (i10 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb = new StringBuilder("lib");
                            char c4 = File.separatorChar;
                            sb.append(c4);
                            sb.append(str3);
                            sb.append(c4);
                            sb.append(str);
                            String sb2 = sb.toString();
                            eVar.getClass();
                            Y2.e.D("Looking for %s in APK %s...", sb2, str2);
                            ZipEntry entry = zipFile.getEntry(sb2);
                            if (entry != null) {
                                S0.l lVar = new S0.l(6, false);
                                lVar.f2910u = zipFile;
                                lVar.f2911v = entry;
                                return lVar;
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
            i++;
        }
    }

    public static String[] t(Context context, String str) {
        StringBuilder sb = new StringBuilder("lib");
        char c4 = File.separatorChar;
        sb.append(c4);
        sb.append("([^\\");
        sb.append(c4);
        sb.append("]*)");
        sb.append(c4);
        sb.append(str);
        Pattern compile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : x(context)) {
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
    public static boolean u(c0.b bVar, Editable editable, int i, int i4, boolean z8) {
        int min;
        if (editable != null && i >= 0 && i4 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z8) {
                    int max = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                        loop0: while (true) {
                            boolean z9 = false;
                            while (true) {
                                if (max == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char charAt = editable.charAt(selectionStart);
                                    if (z9) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt)) {
                                        max--;
                                    } else {
                                        if (Character.isHighSurrogate(charAt)) {
                                            break loop0;
                                        }
                                        z9 = true;
                                    }
                                } else if (!z9) {
                                    selectionStart = 0;
                                }
                            }
                            max--;
                        }
                    }
                    selectionStart = -1;
                    int max2 = Math.max(i4, 0);
                    min = editable.length();
                    if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                        loop2: while (true) {
                            boolean z10 = false;
                            while (true) {
                                if (max2 == 0) {
                                    min = selectionEnd;
                                    break loop2;
                                }
                                if (selectionEnd < min) {
                                    char charAt2 = editable.charAt(selectionEnd);
                                    if (z10) {
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
                                        z10 = true;
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
                    selectionStart = Math.max(selectionStart - i, 0);
                    min = Math.min(selectionEnd + i4, editable.length());
                }
                v[] vVarArr = (v[]) editable.getSpans(selectionStart, min, v.class);
                if (vVarArr != null && vVarArr.length > 0) {
                    for (v vVar : vVarArr) {
                        int spanStart = editable.getSpanStart(vVar);
                        int spanEnd = editable.getSpanEnd(vVar);
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

    public static u8.h w(byte[] bArr, int i, int i4) {
        if (i4 == -1234567890) {
            i4 = bArr.length;
        }
        u8.b.d(bArr.length, i, i4);
        return new u8.h(AbstractC4978i.K(bArr, i, i4 + i));
    }

    public static String[] x(Context context) {
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

    public static final void y(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z8, C3165eo c3165eo) {
        if (adOverlayInfoParcel.f23718D == 4 && adOverlayInfoParcel.f23733v == null) {
            InterfaceC4877a interfaceC4877a = adOverlayInfoParcel.f23732u;
            if (interfaceC4877a != null) {
                interfaceC4877a.onAdClicked();
            }
            InterfaceC2524Dl interfaceC2524Dl = adOverlayInfoParcel.f23727N;
            if (interfaceC2524Dl != null) {
                interfaceC2524Dl.C();
            }
            Activity h9 = adOverlayInfoParcel.f23734w.h();
            C4997e c4997e = adOverlayInfoParcel.f23731n;
            Context context2 = (c4997e == null || !c4997e.f40463C || h9 == null) ? context : h9;
            i iVar = p2.j.f39798C.f39801a;
            B(context2, c4997e, adOverlayInfoParcel.f23716B, c4997e != null ? c4997e.f40462B : null, c3165eo, adOverlayInfoParcel.J);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f23720F.f41220w);
        intent.putExtra("shouldCallOnOverlayOpened", z8);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.Ce)).booleanValue()) {
            t2.G g9 = p2.j.f39798C.f39803c;
            t2.G.v(context, intent, c3165eo, adOverlayInfoParcel.J);
        } else {
            t2.G g10 = p2.j.f39798C.f39803c;
            t2.G.s(context, intent);
        }
    }

    public static final boolean z(Context context, Intent intent, InterfaceC4995c interfaceC4995c, InterfaceC4993a interfaceC4993a, boolean z8, C3165eo c3165eo, String str, Bundle bundle) {
        int i;
        if (z8) {
            try {
                i = p2.j.f39798C.f39803c.J(context, intent.getData(), bundle);
                if (interfaceC4995c != null) {
                    interfaceC4995c.k();
                }
            } catch (ActivityNotFoundException e6) {
                String message = e6.getMessage();
                int i4 = C.f40822b;
                u2.i.f(message);
                i = 6;
            }
            if (interfaceC4993a != null) {
                interfaceC4993a.t(i);
            }
            return i == 5;
        }
        try {
            String uri = intent.toURI();
            StringBuilder sb = new StringBuilder(String.valueOf(uri).length() + 21);
            sb.append("Launching an intent: ");
            sb.append(uri);
            C.k(sb.toString());
            if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.Ce)).booleanValue()) {
                t2.G g9 = p2.j.f39798C.f39803c;
                t2.G.v(context, intent, c3165eo, str);
            } else {
                t2.G g10 = p2.j.f39798C.f39803c;
                t2.G.s(context, intent);
            }
            if (interfaceC4995c != null) {
                interfaceC4995c.k();
            }
            if (interfaceC4993a != null) {
                interfaceC4993a.i0(true);
            }
            return true;
        } catch (ActivityNotFoundException e9) {
            String message2 = e9.getMessage();
            int i9 = C.f40822b;
            u2.i.f(message2);
            if (interfaceC4993a != null) {
                interfaceC4993a.i0(false);
            }
            return false;
        }
    }

    @Override // i2.a
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // com.bumptech.glide.manager.g
    public void b(com.bumptech.glide.manager.h hVar) {
        hVar.onStart();
    }

    @Override // w1.InterfaceC5148a
    public File d(InterfaceC4992e interfaceC4992e) {
        return null;
    }

    @Override // p7.InterfaceC4864a
    public Object get() {
        switch (this.f1731n) {
            case 10:
                return new A(2, Executors.newSingleThreadExecutor());
            default:
                i iVar = new i(19);
                HashMap hashMap = new HashMap();
                W1.d dVar = W1.d.f3419n;
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(dVar, new C4499b(30000L, 86400000L, set));
                W1.d dVar2 = W1.d.f3421v;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(dVar2, new C4499b(1000L, 86400000L, set));
                W1.d dVar3 = W1.d.f3420u;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(EnumC4501d.f37670u)));
                if (unmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(dVar3, new C4499b(86400000L, 86400000L, unmodifiableSet));
                if (hashMap.keySet().size() < W1.d.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new C4498a(iVar, hashMap);
        }
    }

    @Override // B1.G
    public void j(MediaExtractor mediaExtractor, Object obj) {
        switch (this.f1731n) {
            case 1:
                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                break;
            default:
                mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    public C4774a p(C4776c c4776c, Map map) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(Collections.EMPTY_MAP);
        URL url = new URL(c4776c.f39563u);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int i = c4776c.f39557C.f2319a;
        httpURLConnection.setConnectTimeout(i);
        httpURLConnection.setReadTimeout(i);
        boolean z8 = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        "https".equals(url.getProtocol());
        try {
            for (String str : hashMap.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) hashMap.get(str));
            }
            httpURLConnection.setRequestMethod("GET");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if ((100 <= responseCode && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                C4774a c4774a = new C4774a(responseCode, k(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return c4774a;
            }
            try {
                try {
                    return new C4774a(responseCode, k(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new C3668o5(httpURLConnection, 1));
                } catch (Throwable th) {
                    th = th;
                    z8 = true;
                    if (!z8) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // B1.G
    public void r(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        switch (this.f1731n) {
            case 1:
                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                break;
            default:
                mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    public Signature[] s(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public boolean v(CharSequence charSequence) {
        return charSequence instanceof M.f;
    }

    @Override // r0.InterfaceC4954c
    public void o() {
    }

    @Override // com.bumptech.glide.manager.g
    public void c(com.bumptech.glide.manager.h hVar) {
    }

    @Override // O1.c
    public void f(Object obj) {
    }

    @Override // r0.InterfaceC4954c
    public void e(int i, Serializable serializable) {
    }

    @Override // w1.InterfaceC5148a
    public void g(InterfaceC4992e interfaceC4992e, Q0 q02) {
    }
}
