package com.crrepa.band.my.device.pushmessage.notify;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.model.band.provider.BandMusicPlayerProvider;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class b {
    private static final String FACEBOOK_SERVICE_CATEGORY = "service";
    private static final int FILTER_MESSAGE_PERIOD = 600;
    private static final int FILTER_MESSAGE_PERIOD_WHATSAPP = 5000;
    private static final String HUAWEI_PLAYER_PACKAGE_NAME = "com.huawei.mediacontroller";
    private static final String INSTRUCTION_NUMBER = ":";
    private static final String INSTRUCTION_NUMBER_SPACE = ": ";
    private static final String KUGOU_REGEX = " - ";
    private static final String MISSED = "missed";
    private static final String NON_PRINTABLE_UNICODE_CHARACTERS = "\\p{C}&&[^\\n]";
    private static final String NUMBER_REGEX = "-?[0-9]+(\\.[0-9]+)?";
    private static final String ONE_QUARTER_EM_SPACE = "\u2005";
    private static final String ONE_SIXTH_EM_SPACE = "\u2006";
    private static final String SAMSUNG_INCALLUI_PACKAGE_NAME = "com.samsung.android.incallui";
    private static final String SPACE = " ";
    private static final String TWEET_SENT = "Tweet sent";
    public static final String VIVO_PLAYER_PACKAGE_NAME = "com.android.bbkmusic";
    private static final String WECHAT_RUNNING = "\"微信\"正在运行";
    private static Map<String, String> lastMessageMap = new HashMap();
    private static Map<String, Long> lastPushTimeMap = new HashMap();
    private static c messageTypeConvertor = c.getInstance();
    private static boolean playerEnable = BandMusicPlayerProvider.getMusicPlayerState();

    private b() {
    }

    private static boolean isFilterMessage(String str) {
        Long l8 = lastPushTimeMap.get(str);
        com.orhanobut.logger.f.d("isFilterMessage time: " + l8);
        if (l8 == null) {
            return false;
        }
        return System.currentTimeMillis() - l8.longValue() < ((long) (TextUtils.equals(str, c.WHATSAPP_PACKAGE_NAME) ? 5000 : 600));
    }

    private static boolean isFilterRepeatMessage(String str, String str2, int i8) {
        if (TextUtils.equals(str, NotificationCompat.CATEGORY_MESSAGE) || TextUtils.equals(str, NotificationCompat.CATEGORY_CALL) || str2.contains(MISSED)) {
            return false;
        }
        return i8 == 4 || i8 == 130 || i8 == 6;
    }

    private static boolean isNumeric(String str) {
        return Pattern.compile(NUMBER_REGEX).matcher(str).matches();
    }

    private static boolean isSameMesage(String str, String str2) {
        if (TextUtils.equals(str, c.getInstance().getDialPackageName())) {
            return false;
        }
        return TextUtils.equals(lastMessageMap.get(str), str2);
    }

    private static boolean isSongName(String str, String str2) {
        return c.getInstance().isLyrics() && !TextUtils.isEmpty(str) && str2.contains(str);
    }

    private static boolean isUnnecessaryFacebookMessage(int i8, String str) {
        return i8 == 130 && TextUtils.equals(str, "service");
    }

    private static boolean isUnnecessaryOtherMessage(int i8, String str) {
        return i8 == 128 && isNumeric(str);
    }

    private static boolean isUnnecessaryPhone(String str) {
        return TextUtils.equals(str, SAMSUNG_INCALLUI_PACKAGE_NAME);
    }

    @RequiresApi(api = 21)
    private static boolean isUnnecessarySms(int i8, String str) {
        return i8 == 1 && !TextUtils.equals(str, NotificationCompat.CATEGORY_MESSAGE);
    }

    private static boolean isUnnecessaryTwitterMessage(int i8, String str) {
        return i8 == 131 && TextUtils.equals(str, TWEET_SENT);
    }

    private static boolean isUnnecessaryWechat(int i8, String str) {
        if (i8 == 2 || i8 == 5) {
            return str.startsWith(WECHAT_RUNNING);
        }
        return false;
    }

    private static void sendMessageContent(String str, int i8, String str2, boolean z7) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        com.orhanobut.logger.f.d("sendMessageContent: " + z7);
        String replaceAll = str2.replace(ONE_SIXTH_EM_SPACE, " ").replace(ONE_QUARTER_EM_SPACE, " ").replaceFirst(INSTRUCTION_NUMBER_SPACE, ":").replaceAll(NON_PRINTABLE_UNICODE_CHARACTERS, "");
        com.orhanobut.logger.f.d("sendMessageContent: " + replaceAll);
        if (z7 && isSameMesage(str, replaceAll)) {
            return;
        }
        i4.getInstance().sendMessage(replaceAll, i8);
        lastPushTimeMap.put(str, Long.valueOf(System.currentTimeMillis()));
        lastMessageMap.put(str, replaceAll);
    }

    @SuppressLint({"CheckResult"})
    public static synchronized void sendMessageNotification(Context context, Notification notification, String str, String str2) {
        String str3;
        CharSequence charSequence;
        synchronized (b.class) {
            if (notification == null) {
                return;
            }
            com.orhanobut.logger.f.d("packageName: " + str);
            if (!TextUtils.equals(str, context.getPackageName()) && !f.isBlackList(str)) {
                int messageType = messageTypeConvertor.getMessageType(str);
                com.orhanobut.logger.f.d("messageType: " + messageType);
                if (messageType == 153) {
                    return;
                }
                if (23 <= Build.VERSION.SDK_INT) {
                    str3 = notification.category;
                    com.orhanobut.logger.f.d("category: " + str3);
                    if (isUnnecessarySms(messageType, str3)) {
                        return;
                    }
                    if (isUnnecessaryPhone(str)) {
                        return;
                    }
                    if (isUnnecessaryFacebookMessage(messageType, str3)) {
                        return;
                    }
                } else {
                    str3 = null;
                }
                String appName = com.moyoung.dafit.module.common.utils.f.getAppName(context, str);
                com.orhanobut.logger.f.d("appName: " + appName);
                String notificationMessageContent = e.getNotificationMessageContent(notification, str, appName);
                com.orhanobut.logger.f.d("getNotificationMessageContent: " + notificationMessageContent);
                if (TextUtils.isEmpty(notificationMessageContent) && (charSequence = notification.tickerText) != null) {
                    try {
                        notificationMessageContent = charSequence.toString();
                        com.orhanobut.logger.f.d("tickerText: " + notificationMessageContent);
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                }
                if (TextUtils.isEmpty(notificationMessageContent)) {
                    com.orhanobut.logger.f.e("message connect is null!", new Object[0]);
                    return;
                }
                if (!isSongName(str2, notificationMessageContent) && !TextUtils.equals(str, "com.huawei.mediacontroller")) {
                    if (isUnnecessaryOtherMessage(messageType, notificationMessageContent)) {
                        return;
                    }
                    if (isUnnecessaryTwitterMessage(messageType, notificationMessageContent)) {
                        return;
                    }
                    if (isUnnecessaryWechat(messageType, notificationMessageContent)) {
                        return;
                    }
                    if (messageType == 144) {
                        com.orhanobut.logger.f.d("song msg: " + notificationMessageContent);
                        if (!TextUtils.isEmpty(notificationMessageContent) && playerEnable) {
                            i4.getInstance().sendSongName(notificationMessageContent);
                            i4.getInstance().sendLyrics(" ");
                            if (TextUtils.equals(str, VIVO_PLAYER_PACKAGE_NAME) && com.crrepa.band.my.ble.band.utils.c.getInstance(context).isPlayerStateChange()) {
                                return;
                            } else {
                                i4.getInstance().setPlayerState(com.crrepa.band.my.ble.band.utils.c.getInstance(context).isMusicActive() ? (byte) 1 : (byte) 0);
                            }
                        }
                    } else {
                        sendMessageContent(str, messageType, notificationMessageContent, isFilterMessage(str) || isFilterRepeatMessage(str3, notificationMessageContent, messageType));
                    }
                    return;
                }
                com.orhanobut.logger.f.e("music player message", new Object[0]);
            }
        }
    }

    public static void updatePlayerState() {
        playerEnable = BandMusicPlayerProvider.getMusicPlayerState();
    }
}
