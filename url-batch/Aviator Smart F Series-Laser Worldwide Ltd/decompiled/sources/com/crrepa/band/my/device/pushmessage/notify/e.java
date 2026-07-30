package com.crrepa.band.my.device.pushmessage.notify;

import android.app.Notification;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class e {
    private static final String DESCRIPTION_NUMBER = ":";
    private static final String NOTICATION_ACTION = "mActions";
    private static final String NOTICATION_ACTION_TYPE = "type";
    private static final String NOTICATION_ACTION_VALUE = "value";
    private static final String WHATSAPP = "WhatsApp";

    private static void addTitle(String str, StringBuilder sb) {
        String trim = str.trim();
        if (!trim.endsWith(":")) {
            trim = trim + ":";
        }
        sb.append(trim);
    }

    private static String buildMessageContent(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str) && !str2.startsWith(str) && !TextUtils.equals(str, str3) && !TextUtils.equals(WHATSAPP, str)) {
            addTitle(str, sb);
        }
        if (TextUtils.equals(str4, c.WECHAT_PACKAGE_NAME) && TextUtils.equals(str, str3)) {
            addTitle(str, sb);
        }
        sb.append(str2.trim());
        return sb.toString();
    }

    private static boolean containsBtName(String str, String str2) {
        if (TextUtils.isEmpty(str) || !TextUtils.equals(str2, f.HUAWEI_MEDIA_CONTROLLER)) {
            return false;
        }
        return str.contains("→");
    }

    private static String getNoticationContent(Notification notification, String str) {
        ArrayList arrayList;
        RemoteViews remoteViews = notification.bigContentView;
        if (remoteViews == null) {
            remoteViews = notification.contentView;
        }
        if (remoteViews == null) {
            return null;
        }
        try {
            Field declaredField = remoteViews.getClass().getDeclaredField(NOTICATION_ACTION);
            declaredField.setAccessible(true);
            arrayList = (ArrayList) declaredField.get(remoteViews);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Parcelable parcelable = (Parcelable) it.next();
            for (Field field : parcelable.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                String name = field.getName();
                if (name.hashCode() == 111972721 && name.equals("value")) {
                    Object obj = field.get(parcelable);
                    com.orhanobut.logger.f.d("field value: " + obj);
                    if (obj != null && !isNumeric(obj.toString()) && !isBoolean(obj.toString()) && !containsBtName(obj.toString(), str)) {
                        return obj.toString();
                    }
                }
            }
        }
        return null;
    }

    private static String getNotificationContent(Bundle bundle, String str) {
        CharSequence charSequence = bundle.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public static String getNotificationMessageContent(Notification notification, String str, String str2) {
        String str3;
        String str4;
        Bundle bundle = notification.extras;
        if (bundle != null) {
            str3 = getNotificationContent(bundle, NotificationCompat.EXTRA_TITLE);
            com.orhanobut.logger.f.d("title: " + str3);
            CharSequence[] charSequenceArray = bundle.getCharSequenceArray(NotificationCompat.EXTRA_TEXT_LINES);
            if (charSequenceArray != null && charSequenceArray.length > 0) {
                if (!TextUtils.equals(str, c.GMAIL_PACKAGE_NAME)) {
                    int length = charSequenceArray.length - 1;
                    while (true) {
                        if (length < 0) {
                            str4 = null;
                            break;
                        }
                        String removeSpaces = removeSpaces(charSequenceArray[length]);
                        com.orhanobut.logger.f.d("msg: " + ((Object) removeSpaces));
                        if (!TextUtils.isEmpty(removeSpaces)) {
                            str4 = removeSpaces.toString();
                            break;
                        }
                        length--;
                    }
                } else {
                    str4 = removeSpaces(charSequenceArray[0]);
                }
            } else {
                str4 = getNotificationContent(bundle, NotificationCompat.EXTRA_TEXT);
                if (TextUtils.isEmpty(str4) || TextUtils.equals(str, c.GMAIL_PACKAGE_NAME)) {
                    com.orhanobut.logger.f.d("get EXTRA_BIG_TEXT");
                    str4 = getNotificationContent(bundle, NotificationCompat.EXTRA_BIG_TEXT);
                }
            }
        } else {
            str3 = null;
            str4 = null;
        }
        com.orhanobut.logger.f.d("content: " + str4);
        if (TextUtils.isEmpty(str4) && !TextUtils.equals(str, c.WHATSAPP_PACKAGE_NAME)) {
            str4 = getNoticationContent(notification, str);
        }
        if (!TextUtils.equals(str, c.WHATSAPP_PACKAGE_NAME) || TextUtils.isEmpty(getNotificationContent(bundle, NotificationCompat.EXTRA_CONVERSATION_TITLE))) {
            return buildMessageContent(str3, str4, str2, str);
        }
        return null;
    }

    private static boolean isBoolean(String str) {
        return "true".equalsIgnoreCase(str) || "false".equalsIgnoreCase(str);
    }

    private static boolean isNumeric(String str) {
        return Pattern.compile("-?[0-9]+\\.?[0-9]*").matcher(str).matches();
    }

    private static String removeSpaces(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return (charSequence instanceof String ? (String) charSequence : charSequence.toString()).replaceAll("(\\s+$|^\\s+)", "").replaceAll("\n+", "\n");
    }
}
