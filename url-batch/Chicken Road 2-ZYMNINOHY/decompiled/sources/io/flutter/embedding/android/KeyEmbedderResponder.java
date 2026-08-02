package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.Log;
import io.flutter.embedding.android.KeyData;
import io.flutter.embedding.android.KeyboardManager;
import io.flutter.embedding.android.KeyboardMap;
import io.flutter.plugin.common.BinaryMessenger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class KeyEmbedderResponder implements KeyboardManager.Responder {
    private static final String TAG = "KeyEmbedderResponder";
    private final BinaryMessenger messenger;
    private final HashMap<Long, Long> pressingRecords = new HashMap<>();
    private final HashMap<Long, KeyboardMap.TogglingGoal> togglingGoals = new HashMap<>();
    private final KeyboardManager.CharacterCombiner characterCombiner = new KeyboardManager.CharacterCombiner();

    /* renamed from: io.flutter.embedding.android.KeyEmbedderResponder$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$embedding$android$KeyData$Type;

        static {
            int[] iArr = new int[KeyData.Type.values().length];
            $SwitchMap$io$flutter$embedding$android$KeyData$Type = iArr;
            try {
                iArr[KeyData.Type.kDown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$embedding$android$KeyData$Type[KeyData.Type.kUp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$embedding$android$KeyData$Type[KeyData.Type.kRepeat.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public KeyEmbedderResponder(BinaryMessenger binaryMessenger) {
        this.messenger = binaryMessenger;
        for (KeyboardMap.TogglingGoal togglingGoal : KeyboardMap.getTogglingGoals()) {
            this.togglingGoals.put(Long.valueOf(togglingGoal.logicalKey), togglingGoal);
        }
    }

    private static KeyData.Type getEventType(KeyEvent keyEvent) {
        boolean z = keyEvent.getRepeatCount() > 0;
        int action = keyEvent.getAction();
        if (action == 0) {
            return z ? KeyData.Type.kRepeat : KeyData.Type.kDown;
        }
        if (action == 1) {
            return KeyData.Type.kUp;
        }
        throw new AssertionError("Unexpected event type");
    }

    private Long getLogicalKey(KeyEvent keyEvent) {
        Long l4 = KeyboardMap.keyCodeToLogical.get(Long.valueOf(keyEvent.getKeyCode()));
        return l4 != null ? l4 : Long.valueOf(keyOfPlane(keyEvent.getKeyCode(), KeyboardMap.kAndroidPlane));
    }

    private Long getPhysicalKey(KeyEvent keyEvent) {
        long scanCode = keyEvent.getScanCode();
        if (scanCode == 0) {
            return Long.valueOf(keyOfPlane(keyEvent.getKeyCode(), KeyboardMap.kAndroidPlane));
        }
        Long l4 = KeyboardMap.scanCodeToPhysical.get(Long.valueOf(scanCode));
        return l4 != null ? l4 : Long.valueOf(keyOfPlane(keyEvent.getScanCode(), KeyboardMap.kAndroidPlane));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013a A[LOOP:2: B:62:0x0138->B:63:0x013a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean handleEventImpl(KeyEvent keyEvent, KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback) {
        boolean z;
        Long l4;
        KeyData.Type type;
        String str;
        int source;
        int size;
        KeyboardMap.TogglingGoal togglingGoal;
        char charValue;
        int i4 = 0;
        if (keyEvent.getScanCode() == 0 && keyEvent.getKeyCode() == 0) {
            return false;
        }
        Long physicalKey = getPhysicalKey(keyEvent);
        Long logicalKey = getLogicalKey(keyEvent);
        ArrayList<Runnable> arrayList = new ArrayList<>();
        for (KeyboardMap.PressingGoal pressingGoal : KeyboardMap.pressingGoals) {
            synchronizePressingKey(pressingGoal, (keyEvent.getMetaState() & pressingGoal.mask) != 0, logicalKey.longValue(), physicalKey.longValue(), keyEvent, arrayList);
        }
        for (KeyboardMap.TogglingGoal togglingGoal2 : this.togglingGoals.values()) {
            synchronizeTogglingKey(togglingGoal2, (keyEvent.getMetaState() & togglingGoal2.mask) != 0, logicalKey.longValue(), keyEvent);
        }
        int action = keyEvent.getAction();
        if (action == 0) {
            z = true;
        } else {
            if (action != 1) {
                return false;
            }
            z = false;
        }
        Long l5 = this.pressingRecords.get(physicalKey);
        if (z) {
            if (l5 == null) {
                type = KeyData.Type.kDown;
            } else if (keyEvent.getRepeatCount() > 0) {
                type = KeyData.Type.kRepeat;
            } else {
                l4 = physicalKey;
                synthesizeEvent(false, l5, l4, keyEvent.getEventTime());
                type = KeyData.Type.kDown;
                charValue = this.characterCombiner.applyCombiningCharacterToBaseCharacter(keyEvent.getUnicodeChar()).charValue();
                if (charValue != 0) {
                    str = "" + charValue;
                    if (type != KeyData.Type.kRepeat) {
                        updatePressingState(l4, z ? logicalKey : null);
                    }
                    if (type == KeyData.Type.kDown && (togglingGoal = this.togglingGoals.get(logicalKey)) != null) {
                        togglingGoal.enabled = !togglingGoal.enabled;
                    }
                    KeyData keyData = new KeyData();
                    source = keyEvent.getSource();
                    if (source != 513) {
                        keyData.deviceType = KeyData.DeviceType.kDirectionalPad;
                    } else if (source == 1025) {
                        keyData.deviceType = KeyData.DeviceType.kGamepad;
                    } else if (source == 16777232) {
                        keyData.deviceType = KeyData.DeviceType.kJoystick;
                    } else if (source != 33554433) {
                        keyData.deviceType = KeyData.DeviceType.kKeyboard;
                    } else {
                        keyData.deviceType = KeyData.DeviceType.kHdmi;
                    }
                    keyData.timestamp = keyEvent.getEventTime();
                    keyData.type = type;
                    keyData.logicalKey = logicalKey.longValue();
                    keyData.physicalKey = l4.longValue();
                    keyData.character = str;
                    keyData.synthesized = false;
                    sendKeyEvent(keyData, onKeyEventHandledCallback);
                    size = arrayList.size();
                    while (i4 < size) {
                        Runnable runnable = arrayList.get(i4);
                        i4++;
                        runnable.run();
                    }
                    return true;
                }
            }
            l4 = physicalKey;
            charValue = this.characterCombiner.applyCombiningCharacterToBaseCharacter(keyEvent.getUnicodeChar()).charValue();
            if (charValue != 0) {
            }
        } else {
            l4 = physicalKey;
            if (l5 == null) {
                return false;
            }
            type = KeyData.Type.kUp;
        }
        str = null;
        if (type != KeyData.Type.kRepeat) {
        }
        if (type == KeyData.Type.kDown) {
            togglingGoal.enabled = !togglingGoal.enabled;
        }
        KeyData keyData2 = new KeyData();
        source = keyEvent.getSource();
        if (source != 513) {
        }
        keyData2.timestamp = keyEvent.getEventTime();
        keyData2.type = type;
        keyData2.logicalKey = logicalKey.longValue();
        keyData2.physicalKey = l4.longValue();
        keyData2.character = str;
        keyData2.synthesized = false;
        sendKeyEvent(keyData2, onKeyEventHandledCallback);
        size = arrayList.size();
        while (i4 < size) {
        }
        return true;
    }

    private static long keyOfPlane(long j4, long j5) {
        return (j4 & KeyboardMap.kValueMask) | j5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendKeyEvent$2(KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback, ByteBuffer byteBuffer) {
        Boolean bool = Boolean.FALSE;
        if (byteBuffer != null) {
            byteBuffer.rewind();
            if (byteBuffer.capacity() != 0) {
                bool = Boolean.valueOf(byteBuffer.get() != 0);
            }
        } else {
            Log.w(TAG, "A null reply was received when sending a key event to the framework.");
        }
        onKeyEventHandledCallback.onKeyEventHandled(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$synchronizePressingKey$0(KeyboardMap.KeyPair keyPair, long j4, KeyEvent keyEvent) {
        synthesizeEvent(false, Long.valueOf(keyPair.logicalKey), Long.valueOf(j4), keyEvent.getEventTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$synchronizePressingKey$1(KeyboardMap.KeyPair keyPair, long j4, KeyEvent keyEvent) {
        synthesizeEvent(false, Long.valueOf(keyPair.logicalKey), Long.valueOf(j4), keyEvent.getEventTime());
    }

    private void sendKeyEvent(KeyData keyData, final KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback) {
        this.messenger.send(KeyData.CHANNEL, keyData.toBytes(), onKeyEventHandledCallback == null ? null : new BinaryMessenger.BinaryReply() { // from class: io.flutter.embedding.android.e
            @Override // io.flutter.plugin.common.BinaryMessenger.BinaryReply
            public final void reply(ByteBuffer byteBuffer) {
                KeyEmbedderResponder.lambda$sendKeyEvent$2(KeyboardManager.Responder.OnKeyEventHandledCallback.this, byteBuffer);
            }
        });
    }

    private void synthesizeEvent(boolean z, Long l4, Long l5, long j4) {
        KeyData keyData = new KeyData();
        keyData.timestamp = j4;
        keyData.type = z ? KeyData.Type.kDown : KeyData.Type.kUp;
        keyData.logicalKey = l4.longValue();
        keyData.physicalKey = l5.longValue();
        keyData.character = null;
        keyData.synthesized = true;
        keyData.deviceType = KeyData.DeviceType.kKeyboard;
        if (l5.longValue() != 0 && l4.longValue() != 0) {
            if (!z) {
                l4 = null;
            }
            updatePressingState(l5, l4);
        }
        sendKeyEvent(keyData, null);
    }

    public Map<Long, Long> getPressedState() {
        return Collections.unmodifiableMap(this.pressingRecords);
    }

    @Override // io.flutter.embedding.android.KeyboardManager.Responder
    public void handleEvent(KeyEvent keyEvent, KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback) {
        if (handleEventImpl(keyEvent, onKeyEventHandledCallback)) {
            return;
        }
        synthesizeEvent(true, 0L, 0L, 0L);
        onKeyEventHandledCallback.onKeyEventHandled(true);
    }

    public void synchronizePressingKey(KeyboardMap.PressingGoal pressingGoal, boolean z, long j4, final long j5, final KeyEvent keyEvent, ArrayList<Runnable> arrayList) {
        KeyboardMap.KeyPair[] keyPairArr = pressingGoal.keys;
        boolean[] zArr = new boolean[keyPairArr.length];
        Boolean[] boolArr = new Boolean[keyPairArr.length];
        int i4 = 0;
        boolean z4 = false;
        while (true) {
            KeyboardMap.KeyPair[] keyPairArr2 = pressingGoal.keys;
            boolean z5 = true;
            if (i4 >= keyPairArr2.length) {
                break;
            }
            final KeyboardMap.KeyPair keyPair = keyPairArr2[i4];
            boolean containsKey = this.pressingRecords.containsKey(Long.valueOf(keyPair.physicalKey));
            zArr[i4] = containsKey;
            if (keyPair.logicalKey == j4) {
                int i5 = AnonymousClass1.$SwitchMap$io$flutter$embedding$android$KeyData$Type[getEventType(keyEvent).ordinal()];
                if (i5 != 1) {
                    if (i5 == 2) {
                        boolArr[i4] = Boolean.valueOf(zArr[i4]);
                    } else if (i5 == 3) {
                        if (!z) {
                            final int i6 = 1;
                            arrayList.add(new Runnable(this) { // from class: io.flutter.embedding.android.f

                                /* renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ KeyEmbedderResponder f13536b;

                                {
                                    this.f13536b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i6) {
                                        case 0:
                                            this.f13536b.lambda$synchronizePressingKey$0(keyPair, j5, keyEvent);
                                            break;
                                        default:
                                            this.f13536b.lambda$synchronizePressingKey$1(keyPair, j5, keyEvent);
                                            break;
                                    }
                                }
                            });
                        }
                        boolArr[i4] = Boolean.valueOf(zArr[i4]);
                    }
                    i4++;
                } else {
                    boolArr[i4] = Boolean.FALSE;
                    if (!z) {
                        final int i7 = 0;
                        arrayList.add(new Runnable(this) { // from class: io.flutter.embedding.android.f

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ KeyEmbedderResponder f13536b;

                            {
                                this.f13536b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i7) {
                                    case 0:
                                        this.f13536b.lambda$synchronizePressingKey$0(keyPair, j5, keyEvent);
                                        break;
                                    default:
                                        this.f13536b.lambda$synchronizePressingKey$1(keyPair, j5, keyEvent);
                                        break;
                                }
                            }
                        });
                    }
                }
            } else if (!z4 && !containsKey) {
                z5 = false;
            }
            z4 = z5;
            i4++;
        }
        boolean z6 = keyEvent.getDeviceId() == -1;
        if (z) {
            for (int i8 = 0; i8 < pressingGoal.keys.length; i8++) {
                if (boolArr[i8] == null) {
                    if (z4 || z6) {
                        boolArr[i8] = Boolean.valueOf(zArr[i8]);
                    } else {
                        boolArr[i8] = Boolean.TRUE;
                        z4 = true;
                    }
                }
            }
            if (!z4 && !z6) {
                boolArr[0] = Boolean.TRUE;
            }
        } else {
            for (int i9 = 0; i9 < pressingGoal.keys.length; i9++) {
                if (boolArr[i9] == null) {
                    boolArr[i9] = Boolean.FALSE;
                }
            }
        }
        for (int i10 = 0; i10 < pressingGoal.keys.length; i10++) {
            if (zArr[i10] != boolArr[i10].booleanValue()) {
                KeyboardMap.KeyPair keyPair2 = pressingGoal.keys[i10];
                synthesizeEvent(boolArr[i10].booleanValue(), Long.valueOf(keyPair2.logicalKey), Long.valueOf(keyPair2.physicalKey), keyEvent.getEventTime());
            }
        }
    }

    public void synchronizeTogglingKey(KeyboardMap.TogglingGoal togglingGoal, boolean z, long j4, KeyEvent keyEvent) {
        if (togglingGoal.logicalKey == j4 || togglingGoal.enabled == z) {
            return;
        }
        boolean containsKey = this.pressingRecords.containsKey(Long.valueOf(togglingGoal.physicalKey));
        boolean z4 = !containsKey;
        if (!containsKey) {
            togglingGoal.enabled = !togglingGoal.enabled;
        }
        synthesizeEvent(z4, Long.valueOf(togglingGoal.logicalKey), Long.valueOf(togglingGoal.physicalKey), keyEvent.getEventTime());
        if (containsKey) {
            togglingGoal.enabled = !togglingGoal.enabled;
        }
        synthesizeEvent(containsKey, Long.valueOf(togglingGoal.logicalKey), Long.valueOf(togglingGoal.physicalKey), keyEvent.getEventTime());
    }

    public void updatePressingState(Long l4, Long l5) {
        if (l5 != null) {
            if (this.pressingRecords.put(l4, l5) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (this.pressingRecords.remove(l4) == null) {
            throw new AssertionError("The key was empty");
        }
    }
}
