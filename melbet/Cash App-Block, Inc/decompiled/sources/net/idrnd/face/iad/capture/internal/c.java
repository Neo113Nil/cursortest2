package net.idrnd.face.iad.capture.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.SystemClock;
import android.util.Size;
import androidx.core.view.DisplayCompat;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.kotlin.ByteStringsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Reflection;
import net.idrnd.misnap.iad.IadFrame;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class c {
    public final List a;
    public final String b;
    public final n0 c;
    public final z3 d;

    static {
        Reflection.factory.getOrCreateKotlinClass(c.class).getSimpleName();
    }

    public c(Context context) {
        Object failure;
        String str;
        Object failure2;
        this.c = new n0(context);
        try {
            Result.Companion companion = Result.Companion;
            failure = b(context);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        boolean z = failure instanceof Result.Failure;
        if (z) {
            this.a = EmptyList.INSTANCE;
        } else {
            failure = z ? null : failure;
            failure.getClass();
            this.a = (List) failure;
        }
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = null;
        }
        this.b = str;
        try {
            Result.Companion companion3 = Result.Companion;
            failure2 = new z3(context);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.Companion;
            failure2 = new Result.Failure(th2);
        }
        boolean z2 = failure2 instanceof Result.Failure;
        if (z2) {
            throw new n4();
        }
        Object obj = z2 ? null : failure2;
        obj.getClass();
        this.d = (z3) obj;
    }

    public static ArrayList b(Context context) {
        Object failure;
        Object failure2;
        StreamConfigurationMap streamConfigurationMap;
        Size[] outputSizes;
        Object systemService = context.getSystemService("camera");
        systemService.getClass();
        CameraManager cameraManager = (CameraManager) systemService;
        ArrayList arrayList = new ArrayList();
        try {
            Result.Companion companion = Result.Companion;
            failure = cameraManager.getCameraCharacteristics("1");
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        boolean z = failure instanceof Result.Failure;
        if (z) {
            throw new h0();
        }
        if (z) {
            failure = null;
        }
        failure.getClass();
        CameraCharacteristics cameraCharacteristics = (CameraCharacteristics) failure;
        try {
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == 0 && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (outputSizes = streamConfigurationMap.getOutputSizes(35)) != null) {
                ArrayList arrayList2 = new ArrayList(outputSizes.length);
                for (Size size : outputSizes) {
                    m2 a = n2.a();
                    a.b$2(size.getWidth());
                    a.a$2(size.getHeight());
                    arrayList2.add((n2) a.build());
                }
                arrayList.addAll(arrayList2);
            }
            failure2 = Unit.INSTANCE;
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.Companion;
            failure2 = new Result.Failure(th2);
        }
        if (failure2 instanceof Result.Failure) {
            throw new d("Camera characteristics unavailable");
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] a(q qVar, q qVar2, ArrayList arrayList, ArrayList arrayList2, a3 a3Var, long j) {
        int i;
        boolean z;
        boolean z2;
        Object failure;
        ?? r23;
        boolean z3;
        ArrayList arrayList3;
        Iterator it;
        byte[] bArr;
        int i2;
        Object failure2;
        Object failure3;
        Object failure4;
        Object failure5;
        Object failure6;
        u0 u0Var;
        w0 w0Var;
        v0 v0Var;
        boolean d;
        boolean b;
        boolean z4;
        z3 z3Var = this.d;
        a3Var.getClass();
        l3 l3Var = a3Var.e;
        int i3 = c3.$r8$clinit;
        e1 c = h1.c();
        if (arrayList != null) {
            c.a$1(arrayList);
        }
        q0 q0Var = (q0) l3Var.a.get(l3Var.a());
        x2 x2Var = q0Var.a;
        w1 a = x1.a();
        int ordinal = x2Var.ordinal();
        byte[] bArr2 = null;
        if (ordinal == 0) {
            i = 2;
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            i = 1;
        }
        a.a$4(i);
        if (x2Var == x2.a) {
            Integer num = q0Var.b;
            num.getClass();
            a.a(num.intValue());
        }
        LinkedHashSet linkedHashSet = f4.a;
        linkedHashSet.clear();
        try {
            f4.a();
            z = false;
        } catch (Exception unused) {
            linkedHashSet.add(g4.a);
            z = true;
        }
        LinkedHashSet<a4> linkedHashSet2 = new LinkedHashSet();
        LinkedHashSet mutableSet = CollectionsKt.toMutableSet(f4.a);
        LinkedHashSet<z> linkedHashSet3 = new LinkedHashSet();
        try {
            Result.Companion companion = Result.Companion;
            d = z3Var.d();
            z2 = false;
            r23 = 0;
        } catch (Throwable th) {
            th = th;
            z2 = false;
        }
        try {
            CollectionsKt__MutableCollectionsKt.addAll(z3Var.c, mutableSet);
            CollectionsKt__MutableCollectionsKt.addAll(z3Var.b, linkedHashSet2);
            b = y.b();
            CollectionsKt__MutableCollectionsKt.addAll(y.a, linkedHashSet3);
        } catch (Throwable th2) {
            th = th2;
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
            r23 = z2;
            if (!(failure instanceof Result.Failure)) {
            }
            z3 = true;
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(linkedHashSet2, 10));
            while (r9.hasNext()) {
            }
            arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(mutableSet, 10));
            it = mutableSet.iterator();
            while (true) {
                bArr = bArr2;
                if (it.hasNext()) {
                }
                arrayList3.add(w0Var);
                bArr2 = bArr;
            }
        }
        if (!d && !b && !z) {
            z4 = false;
            failure = Boolean.valueOf(z4);
            if (!(failure instanceof Result.Failure)) {
                SafeTrace.throwOnFailure(failure);
                if (!((Boolean) failure).booleanValue()) {
                    z3 = r23;
                    ArrayList arrayList42 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(linkedHashSet2, 10));
                    for (a4 a4Var : linkedHashSet2) {
                        a4Var.getClass();
                        switch (a4Var.ordinal()) {
                            case 0:
                                v0Var = v0.root_management_apps_found;
                                break;
                            case 1:
                                v0Var = v0.potentially_dangerous_apps_found;
                                break;
                            case 2:
                                v0Var = v0.binary_su_found;
                                break;
                            case 3:
                                v0Var = v0.executable_su_found;
                                break;
                            case 4:
                                v0Var = v0.executable_su_found_by_native_call;
                                break;
                            case 5:
                                v0Var = v0.paths_that_should_not_be_writable_found;
                                break;
                            case 6:
                                v0Var = v0.test_keys_found;
                                break;
                            case 7:
                                v0Var = v0.magisk_binary_found;
                                break;
                            default:
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                        }
                        arrayList42.add(v0Var);
                    }
                    arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(mutableSet, 10));
                    it = mutableSet.iterator();
                    while (true) {
                        bArr = bArr2;
                        if (it.hasNext()) {
                            ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(linkedHashSet3, 10));
                            for (z zVar : linkedHashSet3) {
                                zVar.getClass();
                                switch (zVar.ordinal()) {
                                    case 0:
                                        u0Var = u0.brand_starts_with_generic;
                                        break;
                                    case 1:
                                        u0Var = u0.fingerprint_starts_with_generic;
                                        break;
                                    case 2:
                                        u0Var = u0.fingerprint_starts_with_unknown;
                                        break;
                                    case 3:
                                        u0Var = u0.hardware_contains_goldfish;
                                        break;
                                    case 4:
                                        u0Var = u0.hardware_contains_ranchu;
                                        break;
                                    case 5:
                                        u0Var = u0.hardware_contains_google_sdk;
                                        break;
                                    case 6:
                                        u0Var = u0.model_contains_emulator;
                                        break;
                                    case 7:
                                        u0Var = u0.model_contains_android_sdk;
                                        break;
                                    case 8:
                                        u0Var = u0.manufacturer_contains_genymotion;
                                        break;
                                    case 9:
                                        u0Var = u0.product_contains_sdk_google;
                                        break;
                                    case 10:
                                        u0Var = u0.product_contains_google_sdk;
                                        break;
                                    case 11:
                                        u0Var = u0.product_contains_sdk;
                                        break;
                                    case 12:
                                        u0Var = u0.product_contains_sdk_x86;
                                        break;
                                    case 13:
                                        u0Var = u0.product_contains_sdk_gphone64_arm64;
                                        break;
                                    case 14:
                                        u0Var = u0.product_contains_vbox_86p;
                                        break;
                                    case 15:
                                        u0Var = u0.product_contains_emulator;
                                        break;
                                    case 16:
                                        u0Var = u0.product_contains_simulator;
                                        break;
                                    default:
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return bArr;
                                }
                                arrayList5.add(u0Var);
                            }
                            a1 d2 = b1.d();
                            d2.b(arrayList42);
                            d2.c(arrayList3);
                            d2.a(arrayList5);
                            b1 b1Var = (b1) d2.build();
                            c.a((x1) a.build());
                            c.a(System.currentTimeMillis() / 1000);
                            byte[] bArr3 = qVar.b;
                            Size size = qVar.c;
                            c.a(ByteStringsKt.toByteString(bArr3));
                            c.b(ByteStringsKt.toByteString(qVar2.b));
                            s1 a2 = t1.a();
                            a2.a(z3);
                            a2.a(b1Var);
                            c.a((t1) a2.build());
                            c.a();
                            if (!arrayList2.isEmpty()) {
                                ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    arrayList6.add(ByteStringsKt.toByteString(((q) it2.next()).b));
                                }
                                c.b$1(arrayList6);
                            }
                            long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                            int ordinal2 = a3Var.b.ordinal();
                            if (ordinal2 == 0) {
                                i2 = 2;
                            } else {
                                if (ordinal2 != 1) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return bArr;
                                }
                                i2 = 3;
                            }
                            z1 a3 = a2.a();
                            a3.a$3(size.getHeight());
                            a3.b$3(size.getWidth());
                            e2 a4 = f2.a();
                            a4.a$1();
                            a4.a$1("API " + Build.VERSION.SDK_INT);
                            a3.a((f2) a4.build());
                            g2 a5 = h2.a();
                            String str = Build.MANUFACTURER;
                            a5.b$1();
                            a5.a$2();
                            String str2 = Build.MODEL;
                            a5.a$3();
                            a3.a((h2) a5.build());
                            o2 a6 = p2.a();
                            a6.c((((IadFrame) qVar.d.match).b / 1000000) + currentTimeMillis);
                            a6.d((((IadFrame) qVar2.d.match).b / 1000000) + currentTimeMillis);
                            a6.b(j);
                            a6.a$1(System.currentTimeMillis());
                            a3.a((p2) a6.build());
                            i1 b2 = j1.b();
                            b2.a$1(this.a);
                            a3.a((j1) b2.build());
                            a3.a$5(i2);
                            k1 a7 = l1.a();
                            a7.b$2();
                            a7.a$4();
                            a3.a(a7);
                            a3.a(DisplayCompat.a());
                            c.a((a2) a3.build());
                            c.b();
                            String str3 = this.b;
                            if (str3 != null) {
                                c.a(str3);
                            }
                            int i4 = c3.$r8$clinit;
                            byte[] byteArray = ((h1) c.build()).toByteArray();
                            byteArray.getClass();
                            n0 n0Var = this.c;
                            n0Var.getClass();
                            if (byteArray.length == 0) {
                                a$$ExternalSyntheticBUOutline0.m$3("Input data must not be empty.");
                                return bArr;
                            }
                            byte[] bArr4 = s2.a;
                            if (bArr4 == null && (bArr4 = n0Var.a) == null) {
                                throw new w();
                            }
                            c0 c0Var = new c0(bArr4);
                            SecureRandom secureRandom = (SecureRandom) c0Var.b;
                            Cipher cipher = Cipher.getInstance((String) c0Var.i);
                            Cipher cipher2 = Cipher.getInstance((String) c0Var.e);
                            try {
                                Result.Companion companion3 = Result.Companion;
                                cipher.init(1, (PublicKey) c0Var.a, (OAEPParameterSpec) c0Var.c);
                                failure2 = Unit.INSTANCE;
                            } catch (Throwable th3) {
                                Result.Companion companion4 = Result.Companion;
                                failure2 = new Result.Failure(th3);
                            }
                            if (failure2 instanceof Result.Failure) {
                                throw new w();
                            }
                            byte[] bArr5 = new byte[c0Var.f >> 3];
                            secureRandom.nextBytes(bArr5);
                            byte[] bArr6 = new byte[c0Var.g >> 3];
                            secureRandom.nextBytes(bArr6);
                            long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                            bArr6[r23] = (byte) ((currentTimeMillis2 >> 24) & 255);
                            bArr6[1] = (byte) ((currentTimeMillis2 >> 16) & 255);
                            bArr6[2] = (byte) ((currentTimeMillis2 >> 8) & 255);
                            bArr6[3] = (byte) (currentTimeMillis2 & 255);
                            try {
                                failure3 = new GCMParameterSpec(c0Var.h, bArr6);
                            } catch (Throwable th4) {
                                Result.Companion companion5 = Result.Companion;
                                failure3 = new Result.Failure(th4);
                            }
                            boolean z5 = failure3 instanceof Result.Failure;
                            if (z5) {
                                throw new w();
                            }
                            if (z5) {
                                failure3 = bArr;
                            }
                            failure3.getClass();
                            try {
                                cipher2.init(1, new SecretKeySpec(bArr5, "AES"), (GCMParameterSpec) failure3);
                                failure4 = Unit.INSTANCE;
                            } catch (Throwable th5) {
                                Result.Companion companion6 = Result.Companion;
                                failure4 = new Result.Failure(th5);
                            }
                            if (failure4 instanceof Result.Failure) {
                                throw new w();
                            }
                            try {
                                failure5 = cipher.doFinal(bArr5);
                                failure5.getClass();
                            } catch (Throwable th6) {
                                Result.Companion companion7 = Result.Companion;
                                failure5 = new Result.Failure(th6);
                            }
                            boolean z6 = failure5 instanceof Result.Failure;
                            if (z6) {
                                throw new w();
                            }
                            if (z6) {
                                failure5 = bArr;
                            }
                            failure5.getClass();
                            l0 a8 = m0.a();
                            a8.a();
                            a8.a(ByteStringsKt.toByteString((byte[]) failure5));
                            try {
                                failure6 = cipher2.doFinal(byteArray);
                            } catch (Throwable th7) {
                                Result.Companion companion8 = Result.Companion;
                                failure6 = new Result.Failure(th7);
                            }
                            boolean z7 = failure6 instanceof Result.Failure;
                            if (!z7) {
                                if ((z7 ? bArr : failure6) != null) {
                                    Object obj = z7 ? bArr : failure6;
                                    obj.getClass();
                                    a8.b(ByteStringsKt.toByteString(ArraysKt___ArraysJvmKt.plus(bArr6, (byte[]) obj)));
                                    byte[] byteArray2 = ((m0) a8.build()).toByteArray();
                                    byteArray2.getClass();
                                    return byteArray2;
                                }
                            }
                            throw new d0();
                        }
                        g4 g4Var = (g4) it.next();
                        g4Var.getClass();
                        int ordinal3 = g4Var.ordinal();
                        if (ordinal3 == 0) {
                            w0Var = w0.hack_environment_variables_or_preloads_found;
                        } else if (ordinal3 != 1) {
                            w0Var = w0.sandbox_paths_found;
                            if (ordinal3 != 2 && ordinal3 != 3) {
                                if (ordinal3 == 4) {
                                    w0Var = w0.library_integrity_broken;
                                } else {
                                    if (ordinal3 != 5) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return bArr;
                                    }
                                    w0Var = w0.frida_found;
                                }
                            }
                        } else {
                            w0Var = w0.image_timestamp_is_not_from_current_capture_session;
                        }
                        arrayList3.add(w0Var);
                        bArr2 = bArr;
                    }
                }
            }
            z3 = true;
            ArrayList arrayList422 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(linkedHashSet2, 10));
            while (r9.hasNext()) {
            }
            arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(mutableSet, 10));
            it = mutableSet.iterator();
            while (true) {
                bArr = bArr2;
                if (it.hasNext()) {
                }
                arrayList3.add(w0Var);
                bArr2 = bArr;
            }
        }
        z4 = true;
        failure = Boolean.valueOf(z4);
        if (!(failure instanceof Result.Failure)) {
        }
        z3 = true;
        ArrayList arrayList4222 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(linkedHashSet2, 10));
        while (r9.hasNext()) {
        }
        arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(mutableSet, 10));
        it = mutableSet.iterator();
        while (true) {
            bArr = bArr2;
            if (it.hasNext()) {
            }
            arrayList3.add(w0Var);
            bArr2 = bArr;
        }
    }
}
