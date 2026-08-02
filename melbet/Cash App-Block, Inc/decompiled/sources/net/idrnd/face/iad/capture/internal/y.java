package net.idrnd.face.iad.capture.internal;

import android.os.Build;
import java.util.LinkedHashSet;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes9.dex */
public abstract class y {
    public static final LinkedHashSet a = new LinkedHashSet();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b() {
        boolean z;
        boolean startsWith;
        boolean startsWith2;
        boolean contains;
        boolean contains2;
        boolean contains3;
        boolean contains4;
        boolean contains5;
        boolean contains6;
        boolean contains7;
        boolean contains8;
        boolean contains9;
        boolean contains10;
        boolean contains11;
        boolean contains12;
        boolean contains13;
        boolean contains14;
        LinkedHashSet linkedHashSet = a;
        linkedHashSet.clear();
        String str = Build.BRAND;
        str.getClass();
        if (StringsKt__StringsJVMKt.startsWith(str, "generic", false)) {
            String str2 = Build.DEVICE;
            str2.getClass();
            if (StringsKt__StringsJVMKt.startsWith(str2, "generic", false)) {
                z = true;
                if (z) {
                    linkedHashSet.add(z.a);
                }
                String str3 = Build.FINGERPRINT;
                str3.getClass();
                startsWith = StringsKt__StringsJVMKt.startsWith(str3, "generic", false);
                if (startsWith) {
                    linkedHashSet.add(z.b);
                }
                startsWith2 = StringsKt__StringsJVMKt.startsWith(str3, "unknown", false);
                if (startsWith2) {
                    linkedHashSet.add(z.c);
                }
                String str4 = Build.HARDWARE;
                str4.getClass();
                contains = StringsKt.contains((CharSequence) str4, (CharSequence) "goldfish", false);
                if (contains) {
                    linkedHashSet.add(z.d);
                }
                contains2 = StringsKt.contains((CharSequence) str4, (CharSequence) "ranchu", false);
                if (contains2) {
                    linkedHashSet.add(z.e);
                }
                String str5 = Build.MODEL;
                str5.getClass();
                contains3 = StringsKt.contains((CharSequence) str5, (CharSequence) "google_sdk", false);
                if (contains3) {
                    linkedHashSet.add(z.f);
                }
                contains4 = StringsKt.contains((CharSequence) str5, (CharSequence) "Emulator", false);
                if (contains4) {
                    linkedHashSet.add(z.g);
                }
                contains5 = StringsKt.contains((CharSequence) str5, (CharSequence) "Android SDK", false);
                if (contains5) {
                    linkedHashSet.add(z.h);
                }
                String str6 = Build.MANUFACTURER;
                str6.getClass();
                contains6 = StringsKt.contains((CharSequence) str6, (CharSequence) "Genymotion", false);
                if (contains6) {
                    linkedHashSet.add(z.i);
                }
                String str7 = Build.PRODUCT;
                str7.getClass();
                contains7 = StringsKt.contains((CharSequence) str7, (CharSequence) "sdk_google", false);
                if (contains7) {
                    linkedHashSet.add(z.j);
                }
                contains8 = StringsKt.contains((CharSequence) str7, (CharSequence) "google_sdk", false);
                if (contains8) {
                    linkedHashSet.add(z.k);
                }
                contains9 = StringsKt.contains((CharSequence) str7, (CharSequence) "sdk", false);
                if (contains9) {
                    linkedHashSet.add(z.l);
                }
                contains10 = StringsKt.contains((CharSequence) str7, (CharSequence) "sdk_x86", false);
                if (contains10) {
                    linkedHashSet.add(z.m);
                }
                boolean z2 = z;
                contains11 = StringsKt.contains((CharSequence) str7, (CharSequence) "sdk_gphone64_arm64", false);
                if (contains11) {
                    linkedHashSet.add(z.n);
                }
                contains12 = StringsKt.contains((CharSequence) str7, (CharSequence) "vbox86p", false);
                if (contains12) {
                    linkedHashSet.add(z.o);
                }
                contains13 = StringsKt.contains((CharSequence) str7, (CharSequence) "emulator", false);
                if (contains13) {
                    linkedHashSet.add(z.p);
                }
                contains14 = StringsKt.contains((CharSequence) str7, (CharSequence) "simulator", false);
                if (contains14) {
                    linkedHashSet.add(z.q);
                }
                return !z2 || startsWith || startsWith2 || contains || contains2 || contains3 || contains4 || contains5 || contains6 || contains7 || contains8 || contains9 || contains10 || contains11 || contains12 || contains13 || contains14;
            }
        }
        z = false;
        if (z) {
        }
        String str32 = Build.FINGERPRINT;
        str32.getClass();
        startsWith = StringsKt__StringsJVMKt.startsWith(str32, "generic", false);
        if (startsWith) {
        }
        startsWith2 = StringsKt__StringsJVMKt.startsWith(str32, "unknown", false);
        if (startsWith2) {
        }
        String str42 = Build.HARDWARE;
        str42.getClass();
        contains = StringsKt.contains((CharSequence) str42, (CharSequence) "goldfish", false);
        if (contains) {
        }
        contains2 = StringsKt.contains((CharSequence) str42, (CharSequence) "ranchu", false);
        if (contains2) {
        }
        String str52 = Build.MODEL;
        str52.getClass();
        contains3 = StringsKt.contains((CharSequence) str52, (CharSequence) "google_sdk", false);
        if (contains3) {
        }
        contains4 = StringsKt.contains((CharSequence) str52, (CharSequence) "Emulator", false);
        if (contains4) {
        }
        contains5 = StringsKt.contains((CharSequence) str52, (CharSequence) "Android SDK", false);
        if (contains5) {
        }
        String str62 = Build.MANUFACTURER;
        str62.getClass();
        contains6 = StringsKt.contains((CharSequence) str62, (CharSequence) "Genymotion", false);
        if (contains6) {
        }
        String str72 = Build.PRODUCT;
        str72.getClass();
        contains7 = StringsKt.contains((CharSequence) str72, (CharSequence) "sdk_google", false);
        if (contains7) {
        }
        contains8 = StringsKt.contains((CharSequence) str72, (CharSequence) "google_sdk", false);
        if (contains8) {
        }
        contains9 = StringsKt.contains((CharSequence) str72, (CharSequence) "sdk", false);
        if (contains9) {
        }
        contains10 = StringsKt.contains((CharSequence) str72, (CharSequence) "sdk_x86", false);
        if (contains10) {
        }
        boolean z22 = z;
        contains11 = StringsKt.contains((CharSequence) str72, (CharSequence) "sdk_gphone64_arm64", false);
        if (contains11) {
        }
        contains12 = StringsKt.contains((CharSequence) str72, (CharSequence) "vbox86p", false);
        if (contains12) {
        }
        contains13 = StringsKt.contains((CharSequence) str72, (CharSequence) "emulator", false);
        if (contains13) {
        }
        contains14 = StringsKt.contains((CharSequence) str72, (CharSequence) "simulator", false);
        if (contains14) {
        }
        if (z22) {
        }
    }
}
