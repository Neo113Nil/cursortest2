package com.unity.androidnotifications;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.b9;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* loaded from: classes2.dex */
class UnityNotificationUtilities {
    private static final int INTENT_SERIALIZATION_VERSION = 0;
    private static final int NOTIFICATION_SERIALIZATION_VERSION = 3;
    static final String SAVED_NOTIFICATION_FALLBACK_KEY = "fallback.data";
    static final String SAVED_NOTIFICATION_PRIMARY_KEY = "data";
    static final byte[] UNITY_MAGIC_NUMBER = {85, 77, 78, 78};
    private static final byte[] UNITY_MAGIC_NUMBER_PARCELLED = {85, 77, 78, 80};

    UnityNotificationUtilities() {
    }

    protected static Object deserializeNotification(Context context, SharedPreferences sharedPreferences) {
        String string = sharedPreferences.getString("data", "");
        if (string != null && string.length() > 0) {
            Object deserializeNotification = deserializeNotification(context, Base64.decode(string, 0));
            if (deserializeNotification != null) {
                return deserializeNotification;
            }
            String string2 = sharedPreferences.getString(SAVED_NOTIFICATION_FALLBACK_KEY, "");
            if (string2 != null && string2.length() > 0) {
                return deserializeNotification(context, Base64.decode(string2, 0));
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x020e A[Catch: OutOfMemoryError -> 0x015b, Exception -> 0x0162, TryCatch #6 {Exception -> 0x0162, OutOfMemoryError -> 0x015b, blocks: (B:31:0x014a, B:33:0x0154, B:35:0x016c, B:37:0x0190, B:39:0x019c, B:41:0x01a6, B:43:0x01eb, B:45:0x01f0, B:47:0x01f5, B:50:0x020e, B:52:0x0215, B:53:0x021a, B:55:0x0226, B:57:0x022c, B:58:0x0231, B:60:0x023d, B:62:0x0243, B:64:0x024a, B:68:0x0205, B:69:0x01ac, B:71:0x01c3, B:74:0x01d0, B:76:0x01d9, B:77:0x01e0), top: B:30:0x014a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0215 A[Catch: OutOfMemoryError -> 0x015b, Exception -> 0x0162, TryCatch #6 {Exception -> 0x0162, OutOfMemoryError -> 0x015b, blocks: (B:31:0x014a, B:33:0x0154, B:35:0x016c, B:37:0x0190, B:39:0x019c, B:41:0x01a6, B:43:0x01eb, B:45:0x01f0, B:47:0x01f5, B:50:0x020e, B:52:0x0215, B:53:0x021a, B:55:0x0226, B:57:0x022c, B:58:0x0231, B:60:0x023d, B:62:0x0243, B:64:0x024a, B:68:0x0205, B:69:0x01ac, B:71:0x01c3, B:74:0x01d0, B:76:0x01d9, B:77:0x01e0), top: B:30:0x014a }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x024a A[Catch: OutOfMemoryError -> 0x015b, Exception -> 0x0162, TRY_LEAVE, TryCatch #6 {Exception -> 0x0162, OutOfMemoryError -> 0x015b, blocks: (B:31:0x014a, B:33:0x0154, B:35:0x016c, B:37:0x0190, B:39:0x019c, B:41:0x01a6, B:43:0x01eb, B:45:0x01f0, B:47:0x01f5, B:50:0x020e, B:52:0x0215, B:53:0x021a, B:55:0x0226, B:57:0x022c, B:58:0x0231, B:60:0x023d, B:62:0x0243, B:64:0x024a, B:68:0x0205, B:69:0x01ac, B:71:0x01c3, B:74:0x01d0, B:76:0x01d9, B:77:0x01e0), top: B:30:0x014a }] */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r29v3, types: [com.unity.androidnotifications.UnityNotificationManager] */
    /* JADX WARN: Type inference failed for: r29v4 */
    /* JADX WARN: Type inference failed for: r34v0 */
    /* JADX WARN: Type inference failed for: r34v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r34v2 */
    /* JADX WARN: Type inference failed for: r34v3 */
    /* JADX WARN: Type inference failed for: r34v4 */
    /* JADX WARN: Type inference failed for: r35v0 */
    /* JADX WARN: Type inference failed for: r35v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r35v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Notification.Builder deserializeNotificationCustom(Context context, DataInputStream dataInputStream) {
        Notification.Builder builder;
        Bundle bundle;
        boolean z4;
        String str;
        String str2;
        String str3;
        ?? r34;
        ?? r35;
        int i4;
        boolean z5;
        String str4;
        String str5;
        long j4;
        long j5;
        String str6;
        boolean z6;
        String string;
        String str7;
        String str8;
        long j6;
        String str9;
        String str10;
        boolean z7;
        ?? r29;
        Notification.Builder builder2;
        Object obj;
        String str11 = "Failed to deserialize notification";
        String str12 = "UnityNotifications";
        try {
            try {
            } catch (OutOfMemoryError e4) {
                e = e4;
            }
        } catch (Exception e5) {
            e = e5;
        }
        try {
            if (!readAndCheckMagicNumber(dataInputStream, UNITY_MAGIC_NUMBER)) {
                return null;
            }
            int readInt = dataInputStream.readInt();
            if (readInt < 0 || readInt > 3) {
                return null;
            }
            if (readInt < 2) {
                try {
                    bundle = (Bundle) deserializeParcelable(dataInputStream);
                } catch (OutOfMemoryError e6) {
                    e = e6;
                    builder = null;
                    Log.e(str12, str11, e);
                    return builder;
                }
            } else {
                bundle = null;
            }
            if (bundle == null) {
                int readInt2 = dataInputStream.readInt();
                String deserializeString = deserializeString(dataInputStream);
                String deserializeString2 = deserializeString(dataInputStream);
                String deserializeString3 = deserializeString(dataInputStream);
                String deserializeString4 = deserializeString(dataInputStream);
                long readLong = dataInputStream.readLong();
                long readLong2 = dataInputStream.readLong();
                String deserializeString5 = deserializeString(dataInputStream);
                boolean readBoolean = dataInputStream.readBoolean();
                z4 = dataInputStream.readBoolean();
                String deserializeString6 = deserializeString(dataInputStream);
                boolean readBoolean2 = readInt > 0 ? dataInputStream.readBoolean() : true;
                if (readInt >= 3) {
                    String deserializeString7 = deserializeString(dataInputStream);
                    if (deserializeString7 == null || deserializeString7.length() <= 0) {
                        str2 = deserializeString7;
                        str = null;
                        str3 = null;
                    } else {
                        String deserializeString8 = deserializeString(dataInputStream);
                        String deserializeString9 = deserializeString(dataInputStream);
                        j4 = readLong;
                        j5 = readLong2;
                        str6 = deserializeString5;
                        z6 = readBoolean;
                        string = deserializeString6;
                        r34 = deserializeString(dataInputStream);
                        obj = deserializeString(dataInputStream);
                        z5 = dataInputStream.readBoolean();
                        str2 = deserializeString7;
                        str7 = "Failed to deserialize notification";
                        str8 = "UnityNotifications";
                        str = deserializeString8;
                        i4 = readInt2;
                        str4 = deserializeString;
                        z7 = readBoolean2;
                        str3 = deserializeString9;
                        builder = null;
                        str5 = deserializeString2;
                        j6 = -1;
                        str9 = deserializeString3;
                        str10 = deserializeString4;
                        r35 = obj;
                    }
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                r34 = str3;
                Notification.Builder builder3 = r34;
                z5 = false;
                i4 = readInt2;
                str4 = deserializeString;
                j4 = readLong;
                j5 = readLong2;
                str6 = deserializeString5;
                z6 = readBoolean;
                string = deserializeString6;
                str7 = "Failed to deserialize notification";
                str8 = "UnityNotifications";
                builder = builder3;
                str5 = deserializeString2;
                z7 = readBoolean2;
                obj = builder3;
                j6 = -1;
                str9 = deserializeString3;
                str10 = deserializeString4;
                r35 = obj;
            } else {
                String string2 = bundle.getString("android.title");
                String string3 = bundle.getString("android.text");
                String string4 = bundle.getString(UnityNotificationManager.KEY_SMALL_ICON);
                String string5 = bundle.getString(UnityNotificationManager.KEY_LARGE_ICON);
                long j7 = bundle.getLong(UnityNotificationManager.KEY_FIRE_TIME, -1L);
                long j8 = bundle.getLong(UnityNotificationManager.KEY_REPEAT_INTERVAL, -1L);
                String string6 = bundle.getString("android.bigText");
                boolean z8 = bundle.getBoolean("android.showChronometer", false);
                z4 = bundle.getBoolean("android.showWhen", false);
                builder = null;
                str = null;
                str2 = null;
                str3 = null;
                r34 = null;
                r35 = 0;
                i4 = 0;
                z5 = false;
                str4 = string2;
                str5 = string3;
                j4 = j7;
                j5 = j8;
                str6 = string6;
                z6 = z8;
                string = bundle.getString("data");
                str7 = "Failed to deserialize notification";
                str8 = "UnityNotifications";
                j6 = -1;
                str9 = string4;
                str10 = string5;
                z7 = true;
            }
            try {
                String deserializeString10 = deserializeString(dataInputStream);
                boolean readBoolean3 = dataInputStream.readBoolean();
                int readInt3 = readBoolean3 ? dataInputStream.readInt() : 0;
                boolean z9 = z6;
                int readInt4 = dataInputStream.readInt();
                boolean readBoolean4 = dataInputStream.readBoolean();
                String deserializeString11 = deserializeString(dataInputStream);
                boolean readBoolean5 = dataInputStream.readBoolean();
                int readInt5 = dataInputStream.readInt();
                String deserializeString12 = deserializeString(dataInputStream);
                long readLong3 = z4 ? dataInputStream.readLong() : 0L;
                UnityNotificationManager notificationManagerImpl = UnityNotificationManager.getNotificationManagerImpl(context);
                Notification.Builder createNotificationBuilder = notificationManagerImpl.createNotificationBuilder(deserializeString10);
                if (bundle != null) {
                    createNotificationBuilder.setExtras(bundle);
                    r29 = notificationManagerImpl;
                } else {
                    r29 = notificationManagerImpl;
                    createNotificationBuilder.getExtras().putInt("id", i4);
                    UnityNotificationManager.setNotificationIcon(createNotificationBuilder, UnityNotificationManager.KEY_SMALL_ICON, str9);
                    UnityNotificationManager.setNotificationIcon(createNotificationBuilder, UnityNotificationManager.KEY_LARGE_ICON, str10);
                    long j9 = j4;
                    if (j9 != j6) {
                        createNotificationBuilder.getExtras().putLong(UnityNotificationManager.KEY_FIRE_TIME, j9);
                    }
                    long j10 = j5;
                    if (j10 != j6) {
                        createNotificationBuilder.getExtras().putLong(UnityNotificationManager.KEY_REPEAT_INTERVAL, j10);
                    }
                    if (string != null) {
                        createNotificationBuilder.getExtras().putString("data", string);
                    }
                    createNotificationBuilder.getExtras().putBoolean(UnityNotificationManager.KEY_SHOW_IN_FOREGROUND, z7);
                }
                if (str4 != null) {
                    createNotificationBuilder.setContentTitle(str4);
                }
                if (str5 != null) {
                    createNotificationBuilder.setContentText(str5);
                }
                if (str6 != null) {
                    createNotificationBuilder.setStyle(new Notification.BigTextStyle().bigText(str6));
                } else if (str2 != null) {
                    r29.setupBigPictureStyle(createNotificationBuilder, str, str2, str3, r34, r35, z5);
                    builder2 = createNotificationBuilder;
                    if (readBoolean3) {
                        UnityNotificationManager.setNotificationColor(builder2, readInt3);
                    }
                    if (readInt4 >= 0) {
                        builder2.setNumber(readInt4);
                    }
                    builder2.setAutoCancel(readBoolean4);
                    UnityNotificationManager.setNotificationUsesChronometer(builder2, z9);
                    if (deserializeString11 != null && deserializeString11.length() > 0) {
                        builder2.setGroup(deserializeString11);
                    }
                    builder2.setGroupSummary(readBoolean5);
                    UnityNotificationManager.setNotificationGroupAlertBehavior(builder2, readInt5);
                    if (deserializeString12 != null && deserializeString12.length() > 0) {
                        builder2.setSortKey(deserializeString12);
                    }
                    if (z4) {
                        builder2.setShowWhen(true);
                        builder2.setWhen(readLong3);
                    }
                    return builder2;
                }
                builder2 = createNotificationBuilder;
                if (readBoolean3) {
                }
                if (readInt4 >= 0) {
                }
                builder2.setAutoCancel(readBoolean4);
                UnityNotificationManager.setNotificationUsesChronometer(builder2, z9);
                if (deserializeString11 != null) {
                    builder2.setGroup(deserializeString11);
                }
                builder2.setGroupSummary(readBoolean5);
                UnityNotificationManager.setNotificationGroupAlertBehavior(builder2, readInt5);
                if (deserializeString12 != null) {
                    builder2.setSortKey(deserializeString12);
                }
                if (z4) {
                }
                return builder2;
            } catch (Exception e7) {
                e = e7;
                str11 = str7;
                str12 = str8;
                Log.e(str12, str11, e);
                return builder;
            } catch (OutOfMemoryError e8) {
                e = e8;
                str11 = str7;
                str12 = str8;
                Log.e(str12, str11, e);
                return builder;
            }
        } catch (Exception e9) {
            e = e9;
            builder = null;
            Log.e(str12, str11, e);
            return builder;
        }
    }

    private static Notification deserializeNotificationParcelable(DataInputStream dataInputStream) {
        int readInt;
        try {
            if (readAndCheckMagicNumber(dataInputStream, UNITY_MAGIC_NUMBER_PARCELLED) && (readInt = dataInputStream.readInt()) >= 0 && readInt <= 0) {
                return (Notification) ((Intent) deserializeParcelable(dataInputStream)).getParcelableExtra(UnityNotificationManager.KEY_NOTIFICATION);
            }
            return null;
        } catch (Exception e4) {
            Log.e("UnityNotifications", "Failed to deserialize notification intent", e4);
            return null;
        } catch (OutOfMemoryError e5) {
            Log.e("UnityNotifications", "Failed to deserialize notification intent", e5);
            return null;
        }
    }

    private static <T extends Parcelable> T deserializeParcelable(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        if (readInt <= 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        if (dataInputStream.read(bArr) != readInt) {
            throw new IOException("Insufficient amount of bytes read");
        }
        try {
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(bArr, 0, readInt);
            obtain.setDataPosition(0);
            Bundle bundle = (Bundle) obtain.readParcelable(UnityNotificationUtilities.class.getClassLoader());
            obtain.recycle();
            if (bundle != null) {
                return (T) bundle.getParcelable("obj");
            }
        } catch (Exception e4) {
            Log.e("UnityNotifications", "Failed to deserialize parcelable", e4);
        } catch (OutOfMemoryError e5) {
            Log.e("UnityNotifications", "Failed to deserialize parcelable", e5);
        }
        return null;
    }

    private static String deserializeString(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        if (readInt <= 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        if (dataInputStream.read(bArr) == readInt) {
            return new String(bArr, StandardCharsets.UTF_8);
        }
        throw new IOException("Insufficient amount of bytes read");
    }

    private static Notification.Builder deserializedFromOldIntent(Context context, byte[] bArr) {
        String str = "Failed to deserialize old style notification";
        String str2 = "UnityNotifications";
        try {
            try {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.unmarshall(bArr, 0, bArr.length);
                    obtain.setDataPosition(0);
                    Bundle bundle = new Bundle();
                    bundle.readFromParcel(obtain);
                    int i4 = bundle.getInt("id", -1);
                    String string = bundle.getString("channelID");
                    String string2 = bundle.getString("textTitle");
                    String string3 = bundle.getString("textContent");
                    String string4 = bundle.getString("smallIconStr");
                    boolean z4 = bundle.getBoolean("autoCancel", false);
                    boolean z5 = bundle.getBoolean("usesChronometer", false);
                    long j4 = bundle.getLong(UnityNotificationManager.KEY_FIRE_TIME, -1L);
                    long j5 = bundle.getLong(UnityNotificationManager.KEY_REPEAT_INTERVAL, -1L);
                    try {
                        String string5 = bundle.getString("largeIconStr");
                        try {
                            int i5 = bundle.getInt("style", -1);
                            int i6 = bundle.getInt(b9.h.f15459S, 0);
                            int i7 = bundle.getInt("number", 0);
                            String string6 = bundle.getString("data");
                            String string7 = bundle.getString("group");
                            boolean z6 = bundle.getBoolean("groupSummary", false);
                            String string8 = bundle.getString("sortKey");
                            int i8 = bundle.getInt("groupAlertBehaviour", -1);
                            boolean z7 = bundle.getBoolean("showTimestamp", false);
                            Notification.Builder createNotificationBuilder = UnityNotificationManager.getNotificationManagerImpl(context).createNotificationBuilder(string);
                            createNotificationBuilder.getExtras().putInt("id", i4);
                            createNotificationBuilder.setContentTitle(string2);
                            createNotificationBuilder.setContentText(string3);
                            UnityNotificationManager.setNotificationIcon(createNotificationBuilder, UnityNotificationManager.KEY_SMALL_ICON, string4);
                            createNotificationBuilder.setAutoCancel(z4);
                            createNotificationBuilder.setUsesChronometer(z5);
                            createNotificationBuilder.getExtras().putLong(UnityNotificationManager.KEY_FIRE_TIME, j4);
                            createNotificationBuilder.getExtras().putLong(UnityNotificationManager.KEY_REPEAT_INTERVAL, j5);
                            UnityNotificationManager.setNotificationIcon(createNotificationBuilder, UnityNotificationManager.KEY_LARGE_ICON, string5);
                            if (i5 == 2) {
                                createNotificationBuilder.setStyle(new Notification.BigTextStyle().bigText(string3));
                            }
                            if (i6 != 0) {
                                UnityNotificationManager.setNotificationColor(createNotificationBuilder, i6);
                            }
                            if (i7 >= 0) {
                                createNotificationBuilder.setNumber(i7);
                            }
                            if (string6 != null) {
                                createNotificationBuilder.getExtras().putString("data", string6);
                            }
                            if (string7 != null && string7.length() > 0) {
                                createNotificationBuilder.setGroup(string7);
                            }
                            createNotificationBuilder.setGroupSummary(z6);
                            if (string8 != null && string8.length() > 0) {
                                createNotificationBuilder.setSortKey(string8);
                            }
                            UnityNotificationManager.setNotificationGroupAlertBehavior(createNotificationBuilder, i8);
                            createNotificationBuilder.setShowWhen(z7);
                            return createNotificationBuilder;
                        } catch (Exception e4) {
                            e = e4;
                            str = "Failed to deserialize old style notification";
                            str2 = "UnityNotifications";
                            Log.e(str2, str, e);
                            return null;
                        } catch (OutOfMemoryError e5) {
                            e = e5;
                            str = "Failed to deserialize old style notification";
                            str2 = "UnityNotifications";
                            Log.e(str2, str, e);
                            return null;
                        }
                    } catch (Exception e6) {
                        e = e6;
                        str = "Failed to deserialize old style notification";
                    } catch (OutOfMemoryError e7) {
                        e = e7;
                        str = "Failed to deserialize old style notification";
                    }
                } catch (Exception e8) {
                    e = e8;
                }
            } catch (OutOfMemoryError e9) {
                e = e9;
            }
        } catch (Exception e10) {
            e = e10;
        }
    }

    protected static int findResourceIdInContextByName(Context context, String str) {
        if (str == null) {
            return 0;
        }
        try {
            Resources resources = context.getResources();
            if (resources != null) {
                int identifier = resources.getIdentifier(str, "mipmap", context.getPackageName());
                return identifier == 0 ? resources.getIdentifier(str, "drawable", context.getPackageName()) : identifier;
            }
        } catch (Resources.NotFoundException unused) {
        }
        return 0;
    }

    protected static Class<?> getOpenAppActivity(Context context) {
        try {
            try {
                PackageManager packageManager = context.getPackageManager();
                Bundle bundle = packageManager.getApplicationInfo(context.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN).metaData;
                if (bundle.containsKey("custom_notification_android_activity")) {
                    try {
                        return Class.forName(bundle.getString("custom_notification_android_activity"));
                    } catch (ClassNotFoundException e4) {
                        Log.e("UnityNotifications", "Specified activity class for notifications not found: " + e4.getMessage());
                    }
                }
                Log.w("UnityNotifications", "No custom_notification_android_activity found, attempting to find app activity class");
                boolean z4 = true;
                ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(context.getPackageName(), 1).activities;
                if (activityInfoArr == null) {
                    Log.e("UnityNotifications", "Could not get package activities");
                    return null;
                }
                int length = activityInfoArr.length;
                String str = null;
                int i4 = 0;
                boolean z5 = false;
                boolean z6 = false;
                while (true) {
                    if (i4 >= length) {
                        z4 = z6;
                        break;
                    }
                    ActivityInfo activityInfo = activityInfoArr[i4];
                    if (activityInfo.enabled && activityInfo.targetActivity == null) {
                        boolean isUnityActivity = isUnityActivity(activityInfo.name);
                        if (str == null) {
                            str = activityInfo.name;
                        } else if (z5 == isUnityActivity) {
                            if (z5 && isUnityActivity) {
                                break;
                            }
                            z6 = true;
                        } else if (isUnityActivity) {
                            str = activityInfo.name;
                            z6 = false;
                        }
                        z5 = isUnityActivity;
                    }
                    i4++;
                }
                if (z4) {
                    Log.e("UnityNotifications", "Multiple choices for activity for notifications, set activity explicitly in Notification Settings");
                    return null;
                }
                if (str != null) {
                    return Class.forName(str);
                }
                Log.e("UnityNotifications", "Activity class for notifications not found");
                return null;
            } catch (PackageManager.NameNotFoundException e5) {
                e5.printStackTrace();
                return null;
            }
        } catch (ClassNotFoundException e6) {
            Log.e("UnityNotifications", "Failed to find activity class: " + e6.getMessage());
            return null;
        }
    }

    private static boolean isUnityActivity(String str) {
        return str.endsWith(".UnityPlayerActivity") || str.endsWith(".UnityPlayerGameActivity");
    }

    private static boolean readAndCheckMagicNumber(DataInputStream dataInputStream, byte[] bArr) {
        for (byte b4 : bArr) {
            try {
                if (dataInputStream.readByte() != b4) {
                    return false;
                }
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }

    protected static Notification.Builder recoverBuilder(Context context, Notification notification) {
        try {
            Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(context, notification);
            recoverBuilder.setExtras(notification.extras);
            return recoverBuilder;
        } catch (Exception e4) {
            Log.e("UnityNotifications", "Failed to recover builder for notification!", e4);
            return recoverBuilderCustom(context, notification);
        } catch (OutOfMemoryError e5) {
            Log.e("UnityNotifications", "Failed to recover builder for notification!", e5);
            return recoverBuilderCustom(context, notification);
        }
    }

    private static Notification.Builder recoverBuilderCustom(Context context, Notification notification) {
        Notification.Builder createNotificationBuilder = UnityNotificationManager.getNotificationManagerImpl(context).createNotificationBuilder(notification.extras.getString("channelID"));
        UnityNotificationManager.setNotificationIcon(createNotificationBuilder, UnityNotificationManager.KEY_SMALL_ICON, notification.extras.getString(UnityNotificationManager.KEY_SMALL_ICON));
        String string = notification.extras.getString(UnityNotificationManager.KEY_LARGE_ICON);
        if (string != null && !string.isEmpty()) {
            UnityNotificationManager.setNotificationIcon(createNotificationBuilder, UnityNotificationManager.KEY_LARGE_ICON, string);
        }
        createNotificationBuilder.setContentTitle(notification.extras.getString("android.title"));
        createNotificationBuilder.setContentText(notification.extras.getString("android.text"));
        createNotificationBuilder.setAutoCancel((notification.flags & 16) != 0);
        int i4 = notification.number;
        if (i4 >= 0) {
            createNotificationBuilder.setNumber(i4);
        }
        String string2 = notification.extras.getString("android.bigText");
        if (string2 != null) {
            createNotificationBuilder.setStyle(new Notification.BigTextStyle().bigText(string2));
        }
        createNotificationBuilder.setWhen(notification.when);
        String group = notification.getGroup();
        if (group != null && !group.isEmpty()) {
            createNotificationBuilder.setGroup(group);
        }
        createNotificationBuilder.setGroupSummary((notification.flags & UserVerificationMethods.USER_VERIFY_NONE) != 0);
        String sortKey = notification.getSortKey();
        if (sortKey != null && !sortKey.isEmpty()) {
            createNotificationBuilder.setSortKey(sortKey);
        }
        createNotificationBuilder.setShowWhen(notification.extras.getBoolean("android.showWhen", false));
        Integer notificationColor = UnityNotificationManager.getNotificationColor(notification);
        if (notificationColor != null) {
            UnityNotificationManager.setNotificationColor(createNotificationBuilder, notificationColor.intValue());
        }
        UnityNotificationManager.setNotificationUsesChronometer(createNotificationBuilder, notification.extras.getBoolean("android.showChronometer", false));
        UnityNotificationManager.setNotificationGroupAlertBehavior(createNotificationBuilder, UnityNotificationManager.getNotificationGroupAlertBehavior(notification));
        createNotificationBuilder.getExtras().putInt("id", notification.extras.getInt("id", 0));
        createNotificationBuilder.getExtras().putLong(UnityNotificationManager.KEY_REPEAT_INTERVAL, notification.extras.getLong(UnityNotificationManager.KEY_REPEAT_INTERVAL, 0L));
        createNotificationBuilder.getExtras().putLong(UnityNotificationManager.KEY_FIRE_TIME, notification.extras.getLong(UnityNotificationManager.KEY_FIRE_TIME, 0L));
        String string3 = notification.extras.getString("data");
        if (string3 != null && !string3.isEmpty()) {
            createNotificationBuilder.getExtras().putString("data", string3);
        }
        return createNotificationBuilder;
    }

    protected static void serializeNotification(SharedPreferences sharedPreferences, Notification notification, boolean z4) {
        String encodeToString;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            if (z4) {
                Intent intent = new Intent();
                intent.putExtra(UnityNotificationManager.KEY_NOTIFICATION, notification);
                if (!serializeNotificationParcel(intent, dataOutputStream)) {
                    return;
                }
                dataOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                encodeToString = Base64.encodeToString(byteArray, 0, byteArray.length, 0);
            } else {
                if (!serializeNotificationCustom(notification, dataOutputStream)) {
                    return;
                }
                dataOutputStream.flush();
                byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                encodeToString = Base64.encodeToString(byteArray2, 0, byteArray2.length, 0);
            }
            SharedPreferences.Editor clear = sharedPreferences.edit().clear();
            clear.putString("data", encodeToString);
            clear.apply();
        } catch (Exception e4) {
            Log.e("UnityNotifications", "Failed to serialize notification", e4);
        }
    }

    private static boolean serializeNotificationCustom(Notification notification, DataOutputStream dataOutputStream) {
        try {
            dataOutputStream.write(UNITY_MAGIC_NUMBER);
            dataOutputStream.writeInt(3);
            boolean z4 = notification.extras.getBoolean("android.showWhen", false);
            dataOutputStream.writeInt(notification.extras.getInt("id"));
            serializeString(dataOutputStream, notification.extras.getString("android.title"));
            serializeString(dataOutputStream, notification.extras.getString("android.text"));
            serializeString(dataOutputStream, notification.extras.getString(UnityNotificationManager.KEY_SMALL_ICON));
            serializeString(dataOutputStream, notification.extras.getString(UnityNotificationManager.KEY_LARGE_ICON));
            dataOutputStream.writeLong(notification.extras.getLong(UnityNotificationManager.KEY_FIRE_TIME, -1L));
            dataOutputStream.writeLong(notification.extras.getLong(UnityNotificationManager.KEY_REPEAT_INTERVAL, -1L));
            serializeString(dataOutputStream, notification.extras.getString("android.bigText"));
            dataOutputStream.writeBoolean(notification.extras.getBoolean("android.showChronometer", false));
            dataOutputStream.writeBoolean(z4);
            serializeString(dataOutputStream, notification.extras.getString("data"));
            dataOutputStream.writeBoolean(notification.extras.getBoolean(UnityNotificationManager.KEY_SHOW_IN_FOREGROUND, true));
            String string = notification.extras.getString(UnityNotificationManager.KEY_BIG_PICTURE);
            serializeString(dataOutputStream, string);
            if (string != null && string.length() > 0) {
                serializeString(dataOutputStream, notification.extras.getString(UnityNotificationManager.KEY_BIG_LARGE_ICON));
                serializeString(dataOutputStream, notification.extras.getString(UnityNotificationManager.KEY_BIG_CONTENT_TITLE));
                serializeString(dataOutputStream, notification.extras.getString(UnityNotificationManager.KEY_BIG_CONTENT_DESCRIPTION));
                serializeString(dataOutputStream, notification.extras.getString(UnityNotificationManager.KEY_BIG_SUMMARY_TEXT));
                dataOutputStream.writeBoolean(notification.extras.getBoolean(UnityNotificationManager.KEY_BIG_SHOW_WHEN_COLLAPSED, false));
            }
            serializeString(dataOutputStream, Build.VERSION.SDK_INT < 26 ? null : notification.getChannelId());
            Integer notificationColor = UnityNotificationManager.getNotificationColor(notification);
            dataOutputStream.writeBoolean(notificationColor != null);
            if (notificationColor != null) {
                dataOutputStream.writeInt(notificationColor.intValue());
            }
            dataOutputStream.writeInt(notification.number);
            dataOutputStream.writeBoolean((notification.flags & 16) != 0);
            serializeString(dataOutputStream, notification.getGroup());
            dataOutputStream.writeBoolean((notification.flags & UserVerificationMethods.USER_VERIFY_NONE) != 0);
            dataOutputStream.writeInt(UnityNotificationManager.getNotificationGroupAlertBehavior(notification));
            serializeString(dataOutputStream, notification.getSortKey());
            if (z4) {
                dataOutputStream.writeLong(notification.when);
            }
            return true;
        } catch (Exception e4) {
            Log.e("UnityNotifications", "Failed to serialize notification", e4);
            return false;
        }
    }

    static boolean serializeNotificationParcel(Intent intent, DataOutputStream dataOutputStream) {
        try {
            byte[] serializeParcelable = serializeParcelable(intent);
            if (serializeParcelable != null && serializeParcelable.length != 0) {
                dataOutputStream.write(UNITY_MAGIC_NUMBER_PARCELLED);
                dataOutputStream.writeInt(0);
                dataOutputStream.writeInt(serializeParcelable.length);
                dataOutputStream.write(serializeParcelable);
                return true;
            }
            return false;
        } catch (Exception e4) {
            Log.e("UnityNotifications", "Failed to serialize notification as Parcel", e4);
            return false;
        } catch (OutOfMemoryError e5) {
            Log.e("UnityNotifications", "Failed to serialize notification as Parcel", e5);
            return false;
        }
    }

    static byte[] serializeParcelable(Parcelable parcelable) {
        try {
            Parcel obtain = Parcel.obtain();
            Bundle bundle = new Bundle();
            bundle.putParcelable("obj", parcelable);
            obtain.writeParcelable(bundle, 0);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            return marshall;
        } catch (Exception e4) {
            Log.e("UnityNotifications", "Failed to serialize Parcelable", e4);
            return null;
        } catch (OutOfMemoryError e5) {
            Log.e("UnityNotifications", "Failed to serialize Parcelable", e5);
            return null;
        }
    }

    static void serializeString(DataOutputStream dataOutputStream, String str) {
        if (str == null || str.length() == 0) {
            dataOutputStream.writeInt(0);
            return;
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        dataOutputStream.writeInt(bytes.length);
        dataOutputStream.write(bytes);
    }

    private static Object deserializeNotification(Context context, byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        Notification deserializeNotificationParcelable = deserializeNotificationParcelable(dataInputStream);
        if (deserializeNotificationParcelable != null) {
            return deserializeNotificationParcelable;
        }
        byteArrayInputStream.reset();
        Notification.Builder deserializeNotificationCustom = deserializeNotificationCustom(context, dataInputStream);
        return deserializeNotificationCustom == null ? deserializedFromOldIntent(context, bArr) : deserializeNotificationCustom;
    }
}
