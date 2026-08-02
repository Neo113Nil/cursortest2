package com.withpersona.sdk2.inquiry.device;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Scanner;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes9.dex */
public abstract class RootedDeviceUtilsKt {
    public static Boolean isDeviceRootedCachedValue;
    public static final List knownRootAppsPackages = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.topjohnwu.magisk", "com.kingroot.kinguser", "com.kingo.root", "com.smedialink.oneclickroot", "com.zhiqupk.root.global", "com.alephzain.framaroot"});
    public static final List knownDangerousAppsPackages = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"com.koushikdutta.rommanager", "com.koushikdutta.rommanager.license", "com.dimonvideo.luckypatcher", "com.chelpus.lackypatch", "com.ramdroid.appquarantine", "com.ramdroid.appquarantinepro", "com.android.vending.billing.InAppBillingService.COIN", "com.android.vending.billing.InAppBillingService.LUCK", "com.chelpus.luckypatcher", "com.blackmartalpha", "org.blackmart.market", "com.allinone.free", "com.repodroid.app", "org.creeplays.hack", "com.baseappfull.fwd", "com.zmapp", "com.dv.marketmod.installer", "org.mobilism.android", "com.android.wp.net.log", "com.android.camera.update", "cc.madkite.freedom", "com.solohsu.android.edxp.manager", "org.meowcat.edxposed.manager", "com.xmodgame", "com.cih.game_cih", "com.charles.lpoqasert", "catch_.me_.if_.you_.can_"});
    public static final List knownRootCloakingPackages = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "de.robv.android.xposed.installer", "com.saurik.substrate", "com.zachspong.temprootremovejb", "com.amphoras.hidemyroot", "com.amphoras.hidemyrootadfree", "com.formyhm.hiderootPremium", "com.formyhm.hideroot"});
    public static final List binDirectories = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/cache/", "/data/", "/dev/"});
    public static final List pathsThatShouldNotBeWritable = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"/system", "/system/bin", "/system/sbin", "/system/xbin", "/vendor/bin", "/sbin", "/etc"});

    public static final boolean doesBinaryExists(String str) {
        Iterator it = binDirectories.iterator();
        while (it.hasNext()) {
            if (new File((String) it.next(), str).exists()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean doesSuRuntimeExist() {
        List split$default;
        Process process = null;
        try {
            Runtime runtime = Runtime.getRuntime();
            split$default = StringsKt__StringsKt.split$default("which su", new String[]{" "}, false, 0, 6, null);
            process = runtime.exec((String[]) split$default.toArray(new String[0]));
            boolean z = new BufferedReader(new InputStreamReader(process.getInputStream())).readLine() != null;
            process.destroy();
            return z;
        } catch (Exception unused) {
            if (process != null) {
                process.destroy();
            }
            return false;
        } catch (Throwable th) {
            if (process != null) {
                process.destroy();
            }
            throw th;
        }
    }

    public static final List execCommand(String str) {
        InputStream inputStream;
        String str2;
        List split$default;
        try {
            inputStream = Runtime.getRuntime().exec(str).getInputStream();
        } catch (IOException unused) {
            inputStream = null;
        }
        try {
            str2 = new Scanner(inputStream).useDelimiter("\\A").next();
        } catch (NoSuchElementException unused2) {
            str2 = "";
        }
        str2.getClass();
        split$default = StringsKt__StringsKt.split$default(str2, new String[]{"\n"}, false, 0, 6, null);
        if (!split$default.isEmpty()) {
            ListIterator listIterator = split$default.listIterator(split$default.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    return CollectionsKt.take(split$default, listIterator.nextIndex() + 1);
                }
            }
        }
        return EmptyList.INSTANCE;
    }

    public static final boolean hasSuspiciousWritablePaths() {
        List split$default;
        String str;
        String str2;
        List split$default2;
        Iterator it = execCommand("mount").iterator();
        while (it.hasNext()) {
            split$default = StringsKt__StringsKt.split$default((String) it.next(), new String[]{" "}, false, 0, 6, null);
            if (split$default.size() == 6) {
                str = (String) split$default.get(2);
                str2 = (String) split$default.get(5);
            } else if (split$default.size() == 4) {
                str = (String) split$default.get(1);
                str2 = (String) split$default.get(3);
            } else {
                continue;
            }
            Iterator it2 = pathsThatShouldNotBeWritable.iterator();
            while (it2.hasNext()) {
                if (StringsKt__StringsJVMKt.equals(str, (String) it2.next(), true)) {
                    int length = str2.length() - 1;
                    int i = 0;
                    boolean z = false;
                    while (i <= length) {
                        char charAt = str2.charAt(!z ? i : length);
                        boolean z2 = CharsKt.isWhitespace(charAt) || charAt == '(' || charAt == ')';
                        if (z) {
                            if (!z2) {
                                break;
                            }
                            length--;
                        } else if (z2) {
                            i++;
                        } else {
                            z = true;
                        }
                    }
                    split$default2 = StringsKt__StringsKt.split$default(str2.subSequence(i, length + 1).toString(), new String[]{","}, false, 0, 6, null);
                    Iterator it3 = split$default2.iterator();
                    while (it3.hasNext()) {
                        if (StringsKt__StringsJVMKt.equals((String) it3.next(), "rw", true)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean hasTestKeys() {
        String str = Build.TAGS;
        String str2 = Build.FINGERPRINT;
        String str3 = Build.PRODUCT;
        String str4 = Build.HARDWARE;
        String str5 = Build.DISPLAY;
        if (str != null) {
            if (StringsKt.contains((CharSequence) str, (CharSequence) "test-keys", false)) {
                return true;
            }
            str2.getClass();
            if (StringsKt.contains((CharSequence) str2, (CharSequence) "genric.*test-keys", false)) {
                return true;
            }
            str3.getClass();
            if (StringsKt.contains((CharSequence) str3, (CharSequence) "generic", false) || StringsKt.contains((CharSequence) str3, (CharSequence) "sdk", false)) {
                return true;
            }
            str4.getClass();
            if (StringsKt.contains((CharSequence) str4, (CharSequence) "goldfish", false)) {
                return true;
            }
            str5.getClass();
            if (StringsKt.contains((CharSequence) str5, (CharSequence) ".*test-keys", false)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isAnyPackageFromListInstalled(Context context, List list) {
        PackageManager packageManager = context.getPackageManager();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
                    return true;
                }
                packageManager.getPackageInfo(str, 0);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0085, code lost:
    
        if (doesSuRuntimeExist() != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean isDeviceRooted(Context context) {
        context.getClass();
        Boolean bool = isDeviceRootedCachedValue;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        try {
            if (!isAnyPackageFromListInstalled(context, knownRootAppsPackages) && !isAnyPackageFromListInstalled(context, knownDangerousAppsPackages) && !doesBinaryExists("su") && !doesBinaryExists("magisk")) {
                boolean z2 = false;
                boolean z3 = true;
                for (String str : execCommand("getprop")) {
                    if (StringsKt.contains((CharSequence) str, (CharSequence) "[ro.debuggable]", false) && StringsKt.contains((CharSequence) str, (CharSequence) "[1]", false)) {
                        z2 = true;
                    } else if (StringsKt.contains((CharSequence) str, (CharSequence) "[ro.secure]", false) && StringsKt.contains((CharSequence) str, (CharSequence) "[0]", false)) {
                        z3 = false;
                    }
                }
                if ((!z2 || z3) && !hasSuspiciousWritablePaths() && (!hasTestKeys() || EmulatorDeviceUtilsKt.isDeviceEmulator())) {
                }
            }
            z = true;
        } catch (Exception unused) {
        }
        isDeviceRootedCachedValue = Boolean.valueOf(z);
        return z;
    }
}
