package com.facebook.appevents;

import android.content.Context;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.internal.AppEventUtility;
import defpackage.ll3;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AppEventDiskStore {
    private static final String PERSISTED_EVENTS_FILENAME = "AppEventsLogger.persistedevents";
    public static final AppEventDiskStore INSTANCE = new AppEventDiskStore();
    private static final String TAG = AppEventDiskStore.class.getName();

    private AppEventDiskStore() {
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0049: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:74), block:B:44:0x0049 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b5 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #13 {, blocks: (B:4:0x0003, B:14:0x002c, B:16:0x00b5, B:22:0x003b, B:24:0x003e, B:61:0x0068, B:64:0x0073, B:54:0x007f, B:57:0x008a, B:39:0x008d, B:40:0x009f, B:43:0x0098, B:46:0x00a0, B:50:0x00ab, B:7:0x000b, B:12:0x0029, B:59:0x0061, B:52:0x0078, B:31:0x0053, B:32:0x0056), top: B:3:0x0003, inners: #1, #2, #3, #5, #8, #12 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final synchronized PersistedEvents readAndClearStore() {
        PersistedEvents persistedEvents;
        ClassNotFoundException e;
        IOException e2;
        String str;
        PersistedEvents persistedEvents2;
        Throwable th;
        synchronized (AppEventDiskStore.class) {
            AppEventUtility.assertIsNotMainThread();
            Context applicationContext = FacebookSdk.getApplicationContext();
            PersistedEvents persistedEvents3 = null;
            try {
                try {
                    try {
                        FileInputStream openFileInput = applicationContext.openFileInput(PERSISTED_EVENTS_FILENAME);
                        openFileInput.getClass();
                        MovedClassObjectInputStream movedClassObjectInputStream = new MovedClassObjectInputStream(new BufferedInputStream(openFileInput));
                        try {
                            Object readObject = movedClassObjectInputStream.readObject();
                            readObject.getClass();
                            persistedEvents = (PersistedEvents) readObject;
                            try {
                                Unit unit = Unit.a;
                                movedClassObjectInputStream.close();
                                try {
                                    applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                                } catch (Exception e3) {
                                    e = e3;
                                    str = TAG;
                                    Log.w(str, "Got unexpected exception when removing events file: ", e);
                                    if (persistedEvents == null) {
                                    }
                                    return persistedEvents;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    ll3.y(movedClassObjectInputStream, th);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } finally {
                        try {
                            applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                        } catch (Exception e4) {
                            Log.w(TAG, "Got unexpected exception when removing events file: ", e4);
                        }
                    }
                } catch (FileNotFoundException unused) {
                    persistedEvents3 = persistedEvents2;
                    persistedEvents = persistedEvents3;
                    if (persistedEvents == null) {
                    }
                    return persistedEvents;
                } catch (IOException e5) {
                    e2 = e5;
                    Log.w(TAG, "Got unexpected exception while reading events: ", e2);
                    try {
                        applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                    } catch (Exception e6) {
                        e = e6;
                        str = TAG;
                        Log.w(str, "Got unexpected exception when removing events file: ", e);
                        if (persistedEvents == null) {
                        }
                        return persistedEvents;
                    }
                    if (persistedEvents == null) {
                    }
                    return persistedEvents;
                } catch (ClassNotFoundException e7) {
                    e = e7;
                    Log.w(TAG, "Got unexpected exception while reading events: ", e);
                    try {
                        applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                    } catch (Exception e8) {
                        e = e8;
                        str = TAG;
                        Log.w(str, "Got unexpected exception when removing events file: ", e);
                        if (persistedEvents == null) {
                        }
                        return persistedEvents;
                    }
                    if (persistedEvents == null) {
                    }
                    return persistedEvents;
                }
            } catch (FileNotFoundException unused2) {
                persistedEvents = persistedEvents3;
                if (persistedEvents == null) {
                }
                return persistedEvents;
            } catch (IOException e9) {
                persistedEvents = null;
                e2 = e9;
                Log.w(TAG, "Got unexpected exception while reading events: ", e2);
                applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                if (persistedEvents == null) {
                }
                return persistedEvents;
            } catch (ClassNotFoundException e10) {
                persistedEvents = null;
                e = e10;
                Log.w(TAG, "Got unexpected exception while reading events: ", e);
                applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                if (persistedEvents == null) {
                }
                return persistedEvents;
            }
            if (persistedEvents == null) {
                persistedEvents = new PersistedEvents();
            }
        }
        return persistedEvents;
    }

    public static final void saveEventsToDisk$facebook_core_release(PersistedEvents persistedEvents) {
        Context applicationContext = FacebookSdk.getApplicationContext();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(applicationContext.openFileOutput(PERSISTED_EVENTS_FILENAME, 0)));
            try {
                objectOutputStream.writeObject(persistedEvents);
                Unit unit = Unit.a;
                objectOutputStream.close();
            } finally {
            }
        } catch (IOException e) {
            Log.w(TAG, "Got unexpected exception while persisting events: ", e);
            try {
                applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class MovedClassObjectInputStream extends ObjectInputStream {
        private static final String ACCESS_TOKEN_APP_ID_PAIR_SERIALIZATION_PROXY_V1_CLASS_NAME = "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1";
        private static final String APP_EVENT_SERIALIZATION_PROXY_V1_CLASS_NAME = "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2";
        public static final Companion Companion = new Companion(null);

        public MovedClassObjectInputStream(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        public ObjectStreamClass readClassDescriptor() {
            ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
            if (Intrinsics.b(readClassDescriptor.getName(), ACCESS_TOKEN_APP_ID_PAIR_SERIALIZATION_PROXY_V1_CLASS_NAME)) {
                readClassDescriptor = ObjectStreamClass.lookup(AccessTokenAppIdPair.SerializationProxyV1.class);
            } else if (Intrinsics.b(readClassDescriptor.getName(), APP_EVENT_SERIALIZATION_PROXY_V1_CLASS_NAME)) {
                readClassDescriptor = ObjectStreamClass.lookup(AppEvent.SerializationProxyV2.class);
            }
            readClassDescriptor.getClass();
            return readClassDescriptor;
        }

        /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }
}
