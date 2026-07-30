package u3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.annotation.NonNull;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.utils.r0;

/* loaded from: classes2.dex */
public class c {
    public static void goHuaweiAutoStart(Context context) {
        try {
            try {
                try {
                    try {
                        showActivity("com.huawei.systemmanager", "com.huawei.systemmanager.startupmgr.ui.StartupNormalAppListActivity", context);
                    } catch (Exception unused) {
                        showActivity("com.hihonor.devicemanager", "com.hihonor.devicemanager.mainscreen.MainScreenActivity", context);
                    }
                } catch (Exception unused2) {
                    r0.showShort(context, R.string.bg_not_support_jump_hint);
                }
            } catch (Exception unused3) {
                showActivity("com.huawei.systemmanager", "com.huawei.systemmanager.optimize.bootstart.BootStartActivity", context);
            }
        } catch (Exception unused4) {
            b.startSystemSettingsAction(context);
        }
    }

    public static void goHuaweiBatterySetting(Context context) {
        try {
            try {
                try {
                    try {
                        showActivity("com.huawei.systemmanager", "com.huawei.systemmanager.startupmgr.ui.StartupNormalAppListActivity", context);
                    } catch (Exception unused) {
                        showActivity("com.hihonor.devicemanager", "com.hihonor.devicemanager.mainscreen.MainScreenActivity", context);
                    }
                } catch (Exception unused2) {
                    r0.showShort(context, R.string.bg_not_support_jump_hint);
                }
            } catch (Exception unused3) {
                showActivity("com.huawei.systemmanager", "com.huawei.systemmanager.optimize.bootstart.BootStartActivity", context);
            }
        } catch (Exception unused4) {
            b.startSystemSettingsAction(context);
        }
    }

    public static void goLeTvSetting(Context context) {
        try {
            try {
                try {
                    showActivity("com.letv.android.letvsafe", "com.letv.android.letvsafe.AutobootManageActivity", context);
                } catch (Exception unused) {
                    r0.showShort(context, R.string.bg_not_support_jump_hint);
                }
            } catch (Exception unused2) {
                b.startSystemSettingsAction(context);
            }
        } catch (Exception unused3) {
            b.startApplicationDetailsSettingsAction(context);
        }
    }

    public static void goMeiZuSetting(Context context) {
        try {
            try {
                showActivity("com.meizu.safe", context);
            } catch (Exception unused) {
                r0.showShort(context, R.string.bg_not_support_jump_hint);
            }
        } catch (Exception unused2) {
            b.startApplicationDetailsSettingsAction(context);
        }
    }

    public static void goOPPOSetting(Context context) {
        try {
            try {
                try {
                    try {
                        try {
                            showActivity("com.coloros.phonemanager", "com.coloros.phonemanager.FakeActivity", context);
                        } catch (Exception unused) {
                            r0.showShort(context, R.string.bg_not_support_jump_hint);
                        }
                    } catch (Exception unused2) {
                        showActivity("com.coloros.oppoguardelf", context);
                    }
                } catch (Exception unused3) {
                    b.startApplicationDetailsSettingsAction(context);
                }
            } catch (Exception unused4) {
                showActivity("com.oppo.safe", context);
            }
        } catch (Exception unused5) {
            showActivity("com.coloros.safecenter", context);
        }
    }

    public static void goOnePlusSetting(Context context) {
        try {
            try {
                showActivity("com.oneplus.security", context);
            } catch (Exception unused) {
                r0.showShort(context, R.string.bg_not_support_jump_hint);
            }
        } catch (Exception unused2) {
            b.startApplicationDetailsSettingsAction(context);
        }
    }

    public static void goSamsungSetting(Context context) {
        try {
            try {
                try {
                    showActivity("com.samsung.android.sm_cn", context);
                } catch (Exception unused) {
                    r0.showShort(context, R.string.bg_not_support_jump_hint);
                }
            } catch (Exception unused2) {
                b.startSystemSettingsAction(context);
            }
        } catch (Exception unused3) {
            showActivity("com.samsung.android.sm", context);
        }
    }

    public static void goSmartisanSetting(Context context) {
        try {
            try {
                try {
                    showActivity("com.smartisanos.security", context);
                } catch (Exception unused) {
                    r0.showShort(context, R.string.bg_not_support_jump_hint);
                }
            } catch (Exception unused2) {
                b.startSystemSettingsAction(context);
            }
        } catch (Exception unused3) {
            b.startApplicationDetailsSettingsAction(context);
        }
    }

    public static void goVIVOSetting(Context context) {
        try {
            try {
                showActivity("com.iqoo.secure", context);
            } catch (Exception unused) {
                r0.showShort(context, R.string.bg_not_support_jump_hint);
            }
        } catch (Exception unused2) {
            b.startApplicationDetailsSettingsAction(context);
        }
    }

    public static void goXiaomiAutoStart(Context context) {
        try {
            try {
                showActivity("com.miui.securitycenter", "com.miui.permcenter.autostart.AutoStartManagementActivity", context);
            } catch (Exception unused) {
                r0.showShort(context, R.string.bg_not_support_jump_hint);
            }
        } catch (Exception unused2) {
            b.startApplicationDetailsSettingsAction(context);
        }
    }

    public static void goXiaomiBatterySetting(Context context) {
        try {
            try {
                showActivity("com.miui.powerkeeper", "com.miui.powerkeeper.ui.HiddenAppsConfigActivity", context.getPackageName(), context.getResources().getString(R.string.app_name), context);
            } catch (Exception unused) {
                r0.showShort(context, R.string.bg_not_support_jump_hint);
            }
        } catch (Exception unused2) {
            b.startApplicationDetailsSettingsAction(context);
        }
    }

    public static boolean isHuawei() {
        String str = Build.BRAND;
        if (str == null) {
            return false;
        }
        if (str.equalsIgnoreCase("huawei") || str.equalsIgnoreCase("honor")) {
            return true;
        }
        return str.equalsIgnoreCase("hihonor");
    }

    public static boolean isIQOO() {
        String str = Build.BRAND;
        return str != null && str.equalsIgnoreCase("iqoo");
    }

    public static boolean isLeTV() {
        String str = Build.BRAND;
        return str != null && str.equalsIgnoreCase("letv");
    }

    public static boolean isLenovo() {
        String str = Build.BRAND;
        return str != null && str.equalsIgnoreCase("lenovo");
    }

    public static boolean isMeiZu() {
        String str = Build.BRAND;
        return str != null && str.equalsIgnoreCase("meizu");
    }

    public static boolean isOPPO() {
        String str = Build.BRAND;
        if (str == null) {
            return false;
        }
        if (str.equalsIgnoreCase("coloros") || str.equalsIgnoreCase("oppo")) {
            return true;
        }
        return str.equals("realme");
    }

    public static boolean isOnePlus() {
        String str = Build.BRAND;
        return str != null && str.equalsIgnoreCase("oneplus");
    }

    public static boolean isSamsung() {
        String str = Build.BRAND;
        if (str != null) {
            return str.equalsIgnoreCase("samsung") || str.equalsIgnoreCase("galaxy");
        }
        return false;
    }

    public static boolean isSmartisan() {
        String str = Build.BRAND;
        return str != null && str.equalsIgnoreCase("smartisan");
    }

    public static boolean isVIVO() {
        String str = Build.BRAND;
        return str != null && str.equalsIgnoreCase("vivo");
    }

    public static boolean isXiaomi() {
        String str = Build.BRAND;
        if (str == null) {
            return false;
        }
        return str.equalsIgnoreCase("xiaomi") || str.equalsIgnoreCase("redmi");
    }

    public static void showActivity(@NonNull String str, Context context) {
        context.startActivity(context.getPackageManager().getLaunchIntentForPackage(str));
    }

    public static void showActivity(@NonNull String str, @NonNull String str2, Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(str, str2));
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    public static void showActivity(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(str, str2));
        intent.putExtra("package_name", str3);
        intent.putExtra("package_label", str4);
        context.startActivity(intent);
    }
}
