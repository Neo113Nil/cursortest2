package com.google.firebase.messaging.cpp;

import android.content.Context;
import android.net.Uri;
import com.google.firebase.messaging.RemoteMessage;
import com.google.flatbuffers.FlatBufferBuilder;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileLock;
import java.util.Map;

/* loaded from: classes.dex */
public class MessageWriter {
    private static final MessageWriter DEFAULT_INSTANCE = new MessageWriter();
    static final String LOCK_FILE = "FIREBASE_CLOUD_MESSAGING_LOCKFILE";
    static final String STORAGE_FILE = "FIREBASE_CLOUD_MESSAGING_LOCAL_STORAGE";
    private static final String TAG = "FIREBASE_MESSAGE_WRITER";

    public static MessageWriter defaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static String emptyIfNull(String str) {
        return str != null ? str : "";
    }

    private static byte[] generateMessageByteBuffer(String str, String str2, String str3, String str4, String str5, Map<String, String> map, byte[] bArr, RemoteMessage.Notification notification, boolean z4, String str6, String str7, int i4, int i5, long j4, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        FlatBufferBuilder flatBufferBuilder = new FlatBufferBuilder(0);
        int createString = flatBufferBuilder.createString(emptyIfNull(str));
        int createString2 = flatBufferBuilder.createString(emptyIfNull(str2));
        int createString3 = flatBufferBuilder.createString(emptyIfNull(str3));
        int createString4 = flatBufferBuilder.createString(emptyIfNull(str4));
        int createString5 = flatBufferBuilder.createString(emptyIfNull(str5));
        int createString6 = flatBufferBuilder.createString(emptyIfNull(str6));
        int createString7 = flatBufferBuilder.createString(emptyIfNull(str7));
        int createString8 = flatBufferBuilder.createString(priorityToString(i4));
        int createString9 = flatBufferBuilder.createString(priorityToString(i5));
        if (map != null) {
            int[] iArr = new int[map.size()];
            int i22 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                iArr[i22] = DataPair.createDataPair(flatBufferBuilder, flatBufferBuilder.createString(entry.getKey()), flatBufferBuilder.createString(entry.getValue()));
                i22++;
            }
            i7 = SerializedMessage.createDataVector(flatBufferBuilder, iArr);
        } else {
            i7 = 0;
        }
        int createByteVector = bArr != null ? flatBufferBuilder.createByteVector(bArr) : 0;
        if (notification != null) {
            int createString10 = flatBufferBuilder.createString(emptyIfNull(notification.getTitle()));
            int createString11 = flatBufferBuilder.createString(emptyIfNull(notification.getBody()));
            int createString12 = flatBufferBuilder.createString(emptyIfNull(notification.getIcon()));
            int createString13 = flatBufferBuilder.createString(emptyIfNull(notification.getSound()));
            i14 = createString6;
            int createString14 = flatBufferBuilder.createString("");
            i18 = createByteVector;
            int createString15 = flatBufferBuilder.createString(emptyIfNull(notification.getTag()));
            i8 = i7;
            int createString16 = flatBufferBuilder.createString(emptyIfNull(notification.getColor()));
            i15 = createString7;
            int createString17 = flatBufferBuilder.createString(emptyIfNull(notification.getClickAction()));
            i13 = createString5;
            int createString18 = flatBufferBuilder.createString(emptyIfNull(notification.getChannelId()));
            i17 = createString9;
            int createString19 = flatBufferBuilder.createString(emptyIfNull(notification.getBodyLocalizationKey()));
            i16 = createString8;
            String[] bodyLocalizationArgs = notification.getBodyLocalizationArgs();
            if (bodyLocalizationArgs != null) {
                i12 = createString4;
                int[] iArr2 = new int[bodyLocalizationArgs.length];
                i11 = createString3;
                int length = bodyLocalizationArgs.length;
                int i23 = 0;
                int i24 = 0;
                while (i23 < length) {
                    iArr2[i24] = flatBufferBuilder.createString(bodyLocalizationArgs[i23]);
                    i23++;
                    length = length;
                    i24++;
                }
                i20 = SerializedNotification.createBodyLocArgsVector(flatBufferBuilder, iArr2);
            } else {
                i11 = createString3;
                i12 = createString4;
                i20 = 0;
            }
            int createString20 = flatBufferBuilder.createString(emptyIfNull(notification.getTitleLocalizationKey()));
            String[] titleLocalizationArgs = notification.getTitleLocalizationArgs();
            if (titleLocalizationArgs != null) {
                i10 = createString2;
                int[] iArr3 = new int[titleLocalizationArgs.length];
                i9 = createString;
                int length2 = titleLocalizationArgs.length;
                int i25 = 0;
                int i26 = 0;
                while (i25 < length2) {
                    iArr3[i26] = flatBufferBuilder.createString(titleLocalizationArgs[i25]);
                    i25++;
                    length2 = length2;
                    i26++;
                }
                i21 = SerializedNotification.createTitleLocArgsVector(flatBufferBuilder, iArr3);
            } else {
                i9 = createString;
                i10 = createString2;
                i21 = 0;
            }
            SerializedNotification.startSerializedNotification(flatBufferBuilder);
            SerializedNotification.addTitle(flatBufferBuilder, createString10);
            SerializedNotification.addBody(flatBufferBuilder, createString11);
            SerializedNotification.addIcon(flatBufferBuilder, createString12);
            SerializedNotification.addSound(flatBufferBuilder, createString13);
            SerializedNotification.addBadge(flatBufferBuilder, createString14);
            SerializedNotification.addTag(flatBufferBuilder, createString15);
            SerializedNotification.addColor(flatBufferBuilder, createString16);
            SerializedNotification.addClickAction(flatBufferBuilder, createString17);
            SerializedNotification.addAndroidChannelId(flatBufferBuilder, createString18);
            SerializedNotification.addBodyLocKey(flatBufferBuilder, createString19);
            SerializedNotification.addBodyLocArgs(flatBufferBuilder, i20);
            SerializedNotification.addTitleLocKey(flatBufferBuilder, createString20);
            SerializedNotification.addTitleLocArgs(flatBufferBuilder, i21);
            i19 = SerializedNotification.endSerializedNotification(flatBufferBuilder);
        } else {
            i8 = i7;
            i9 = createString;
            i10 = createString2;
            i11 = createString3;
            i12 = createString4;
            i13 = createString5;
            i14 = createString6;
            i15 = createString7;
            i16 = createString8;
            i17 = createString9;
            i18 = createByteVector;
            i19 = 0;
        }
        SerializedMessage.startSerializedMessage(flatBufferBuilder);
        SerializedMessage.addFrom(flatBufferBuilder, i9);
        SerializedMessage.addTo(flatBufferBuilder, i10);
        SerializedMessage.addMessageId(flatBufferBuilder, i11);
        SerializedMessage.addMessageType(flatBufferBuilder, i12);
        SerializedMessage.addPriority(flatBufferBuilder, i16);
        SerializedMessage.addOriginalPriority(flatBufferBuilder, i17);
        SerializedMessage.addSentTime(flatBufferBuilder, j4);
        SerializedMessage.addTimeToLive(flatBufferBuilder, i6);
        SerializedMessage.addError(flatBufferBuilder, i13);
        SerializedMessage.addCollapseKey(flatBufferBuilder, i15);
        if (map != null) {
            SerializedMessage.addData(flatBufferBuilder, i8);
        }
        if (bArr != null) {
            SerializedMessage.addRawData(flatBufferBuilder, i18);
        }
        if (notification != null) {
            SerializedMessage.addNotification(flatBufferBuilder, i19);
        }
        SerializedMessage.addNotificationOpened(flatBufferBuilder, z4);
        SerializedMessage.addLink(flatBufferBuilder, i14);
        int endSerializedMessage = SerializedMessage.endSerializedMessage(flatBufferBuilder);
        SerializedEvent.startSerializedEvent(flatBufferBuilder);
        SerializedEvent.addEventType(flatBufferBuilder, (byte) 1);
        SerializedEvent.addEvent(flatBufferBuilder, endSerializedMessage);
        flatBufferBuilder.finish(SerializedEvent.endSerializedEvent(flatBufferBuilder));
        return flatBufferBuilder.sizedByteArray();
    }

    private static String priorityToString(int i4) {
        return i4 != 1 ? i4 != 2 ? "" : "normal" : "high";
    }

    public void writeMessage(Context context, RemoteMessage remoteMessage, boolean z4, Uri uri) {
        String from = remoteMessage.getFrom();
        String to = remoteMessage.getTo();
        String messageId = remoteMessage.getMessageId();
        String messageType = remoteMessage.getMessageType();
        Map<String, String> data = remoteMessage.getData();
        byte[] rawData = remoteMessage.getRawData();
        RemoteMessage.Notification notification = remoteMessage.getNotification();
        String collapseKey = remoteMessage.getCollapseKey();
        int priority = remoteMessage.getPriority();
        int originalPriority = remoteMessage.getOriginalPriority();
        long sentTime = remoteMessage.getSentTime();
        int ttl = remoteMessage.getTtl();
        Uri link = (uri != null || notification == null) ? uri : notification.getLink();
        String uri2 = link != null ? link.toString() : null;
        DebugLogging.log(TAG, String.format("onMessageReceived from=%s message_id=%s, data=%s, notification=%s", from, messageId, data == null ? "(null)" : data.toString(), notification != null ? notification.toString() : "(null)"));
        writeMessageToInternalStorage(context, from, to, messageId, messageType, null, data, rawData, notification, z4, uri2, collapseKey, priority, originalPriority, sentTime, ttl);
    }

    void writeMessageEventToInternalStorage(Context context, String str, String str2, String str3) {
        writeMessageToInternalStorage(context, null, null, str, str2, null, null, null, null, false, null, null, 0, 0, 0L, 0);
    }

    void writeMessageToInternalStorage(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map, byte[] bArr, RemoteMessage.Notification notification, boolean z4, String str6, String str7, int i4, int i5, long j4, int i6) {
        byte[] generateMessageByteBuffer = generateMessageByteBuffer(str, str2, str3, str4, str5, map, bArr, notification, z4, str6, str7, i4, i5, j4, i6);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(generateMessageByteBuffer.length);
        FileLock fileLock = null;
        try {
            try {
                try {
                    fileLock = context.openFileOutput(LOCK_FILE, 0).getChannel().lock();
                    FileOutputStream openFileOutput = context.openFileOutput(STORAGE_FILE, 32768);
                    openFileOutput.write(allocate.array());
                    openFileOutput.write(generateMessageByteBuffer);
                    openFileOutput.close();
                    if (fileLock != null) {
                        fileLock.release();
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                if (fileLock != null) {
                    fileLock.release();
                }
            }
        } finally {
        }
    }
}
