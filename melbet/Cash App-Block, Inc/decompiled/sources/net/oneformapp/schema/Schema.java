package net.oneformapp.schema;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.video.AutoValue_Recorder_RecordingRecord;
import androidx.camera.video.FileOutputOptions;
import androidx.camera.video.MediaSpec;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.Recording;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.core.content.PermissionChecker;
import androidx.core.util.Consumer;
import androidx.room.TransactorKt;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.Response;
import com.fillr.e0;
import com.fillr.t;
import com.google.android.libraries.places.internal.zzbhz;
import com.google.android.libraries.places.internal.zzbip;
import com.google.android.libraries.places.internal.zzbiq;
import com.google.android.libraries.places.internal.zzbjm;
import com.google.android.libraries.places.internal.zzbjr;
import com.google.android.libraries.places.internal.zzbke;
import com.google.android.libraries.places.internal.zzbrg;
import com.google.android.libraries.places.internal.zzbso;
import com.google.android.libraries.places.internal.zzbsq;
import com.google.android.libraries.places.internal.zzbtx;
import com.google.android.libraries.places.internal.zzbua;
import com.google.android.libraries.places.internal.zzcjz;
import com.google.android.libraries.places.internal.zzcka;
import com.google.android.libraries.places.internal.zzckb;
import com.google.common.base.Ascii;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReferenceArray;
import javax.xml.namespace.QName;
import javax.xml.transform.stream.StreamSource;
import utils.StringUtilsKt;

/* loaded from: classes4.dex */
public class Schema {
    public final /* synthetic */ int $r8$classId;
    public final Object elementTypes;
    public final Object fieldSortOrder;
    public boolean mLoaded;
    public Object mVersion;
    public final Object mappedElements;
    public Object rootElements;

    public Schema(zzbsq zzbsqVar, String str, zzcka zzckaVar, zzcka zzckaVar2, boolean z) {
        this.$r8$classId = 3;
        new AtomicReferenceArray(2);
        Trace.checkNotNull(zzbsqVar, "type");
        this.mappedElements = zzbsqVar;
        Trace.checkNotNull(str, "fullMethodName");
        this.mVersion = str;
        int lastIndexOf = str.lastIndexOf(47);
        this.elementTypes = lastIndexOf == -1 ? null : str.substring(0, lastIndexOf);
        Trace.checkNotNull(zzckaVar, "requestMarshaller");
        this.fieldSortOrder = zzckaVar;
        Trace.checkNotNull(zzckaVar2, "responseMarshaller");
        this.rootElements = zzckaVar2;
        this.mLoaded = z;
    }

    public static String zzh(String str, String str2) {
        Trace.checkNotNull(str, "fullServiceName");
        Trace.checkNotNull(str2, "methodName");
        return Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(str.length() + 1 + str2.length()), str, "/", str2);
    }

    public static zzbso zzi() {
        zzbso zzbsoVar = new zzbso();
        zzbsoVar.zza = null;
        zzbsoVar.zzb = null;
        return zzbsoVar;
    }

    public void addRootElements(ArrayList arrayList) {
        ArrayList arrayList2 = (ArrayList) this.rootElements;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.mappedElements;
        linkedHashMap.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Element) it.next()).filloutPathKey(null, null, (HashMap) this.fieldSortOrder, linkedHashMap);
        }
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ac, code lost:
    
        if (r12 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:
    
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0095, code lost:
    
        if (r12 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void forceLoadSchema(Context context) {
        Schema readLocalSchema;
        InputStream open;
        HashMap hashMap = (HashMap) this.elementTypes;
        Schema schema = new Schema();
        try {
            try {
                open = new File("fillr-schema.xsd").exists() ? context.openFileInput("fillr-schema.xsd") : context.openFileInput("fillr-schema.xsd");
            } catch (Exception e) {
                Log.e("net.oneformapp.schema.SchemaFactory", "loadSchema " + e);
                open = context.getAssets().open("fillr-schema.xsd");
            }
            t a = new e0().a(new StreamSource(open));
            HashMap logSchemaTypes = SchemaFactory.logSchemaTypes(a);
            HashMap hashMap2 = (HashMap) schema.elementTypes;
            hashMap2.clear();
            hashMap2.putAll(logSchemaTypes);
            ArrayList extractElements = SchemaFactory.extractElements(null, a, a.a(new QName(a.t, "Profile"), false, null), schema, false, false);
            SchemaFactory.filloutChildren(a, extractElements, schema);
            schema.addRootElements(extractElements);
            schema.mVersion = a.v;
        } catch (IOException e2) {
            Log.e("net.oneformapp.schema.SchemaFactory", "loadSchema " + e2);
            readLocalSchema = SchemaFactory.readLocalSchema(context);
        } catch (Exception e3) {
            Log.e("net.oneformapp.schema.SchemaFactory", "loadSchema " + e3);
            context.deleteFile("fillr-schema.xsd");
            readLocalSchema = SchemaFactory.readLocalSchema(context);
        }
        ((HashMap) this.fieldSortOrder).clear();
        ((ArrayList) this.rootElements).clear();
        hashMap.clear();
        addRootElements((ArrayList) schema.rootElements);
        HashMap hashMap3 = (HashMap) schema.elementTypes;
        hashMap.clear();
        hashMap.putAll(hashMap3);
        this.mVersion = (String) schema.mVersion;
    }

    public Element getElement(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\|");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            Element element = (Element) ((LinkedHashMap) this.mappedElements).get(Toolbar.AnonymousClass1.getFormattedPathKey(str2));
            if (element != null) {
                arrayList.add(new Element(element));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        Element element2 = (Element) arrayList.remove(0);
        if (arrayList.isEmpty()) {
            return element2;
        }
        arrayList.add(0, element2);
        Element element3 = getElement(element2.actingElement().parentPathKey);
        if (element3 != null) {
            element3.actingElement().pathKey = TextUtils.join("|", split);
            element3.actingElement().children.clear();
            element3.isSingleSelection = true;
            element3.children = arrayList;
        }
        return element3;
    }

    public ElementType getElementType(Element element) {
        HashMap hashMap = (HashMap) this.elementTypes;
        Element actingElement = element.actingElement();
        if (element.actingElement().inlineType != null) {
            return actingElement.inlineType;
        }
        ElementType elementType = (ElementType) hashMap.get(actingElement.elementTypeName);
        if (elementType == null) {
            String str = actingElement.elementTypeName;
            elementType = new ElementType();
            elementType.f1544type = 1;
            elementType.listValues = new ArrayList();
            elementType.elements = new ArrayList();
            if (InquiryField.StringField.TYPE.equals(str)) {
                elementType.f1544type = 1;
                return elementType;
            }
            if ("DateType".equals(str)) {
                elementType.f1544type = 3;
                return elementType;
            }
            if ("MonthYearType".equals(str)) {
                elementType.f1544type = 4;
                return elementType;
            }
            if (!"EmailType".equals(str) && !"email".equals(str)) {
                if ("positiveInteger".equals(str) || InquiryField.IntegerField.TYPE.equals(str) || "numeric".equals(str)) {
                    elementType.f1544type = 6;
                    return elementType;
                }
                if ("time".equals(str)) {
                    elementType.f1544type = 5;
                    return elementType;
                }
                if ("base64Binary".equals(str)) {
                    elementType.f1544type = 7;
                    return elementType;
                }
                elementType.f1544type = 1;
                return elementType;
            }
            elementType.f1544type = 8;
        }
        return elementType;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Recording start(Executor executor, Consumer consumer) {
        long j;
        int i;
        IOException iOException;
        AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord;
        executor.getClass();
        consumer.getClass();
        this.rootElements = executor;
        this.mVersion = consumer;
        final Recorder recorder = (Recorder) this.mappedElements;
        synchronized (recorder.mLock) {
            try {
                long j2 = recorder.mLastGeneratedRecordingId + 1;
                recorder.mLastGeneratedRecordingId = j2;
                final int i2 = 0;
                switch (recorder.mState.ordinal()) {
                    case 0:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        Recorder.State state = recorder.mState;
                        Recorder.State state2 = Recorder.State.IDLING;
                        final int i3 = 1;
                        if (state == state2) {
                            TransactorKt.checkState("Expected recorder to be idle but a recording is either pending or in progress.", recorder.mActiveRecordingRecord == null && recorder.mPendingRecordingRecord == null);
                        }
                        try {
                            j = j2;
                        } catch (IOException e) {
                            e = e;
                            j = j2;
                        }
                        try {
                            AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord2 = new AutoValue_Recorder_RecordingRecord((FileOutputOptions) this.elementTypes, (Executor) this.rootElements, (Consumer) this.mVersion, this.mLoaded, j);
                            autoValue_Recorder_RecordingRecord2.mMuted.set(false);
                            autoValue_Recorder_RecordingRecord2.initializeRecording((Context) this.fieldSortOrder, recorder.mMuxerFactory);
                            recorder.mPendingRecordingRecord = autoValue_Recorder_RecordingRecord2;
                            Recorder.State state3 = recorder.mState;
                            if (state3 == state2) {
                                recorder.setState(Recorder.State.PENDING_RECORDING);
                                recorder.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda6
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord3;
                                        int i4;
                                        RuntimeException runtimeException;
                                        AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord4;
                                        int i5 = i2;
                                        boolean z = false;
                                        Recorder recorder2 = recorder;
                                        switch (i5) {
                                            case 0:
                                                synchronized (recorder2.mLock) {
                                                    try {
                                                        StringUtilsKt.d("Recorder", "tryServicePendingRecording on state: " + recorder2.mState);
                                                        int ordinal = recorder2.mState.ordinal();
                                                        boolean z2 = true;
                                                        autoValue_Recorder_RecordingRecord3 = null;
                                                        if (ordinal == 1) {
                                                            z2 = false;
                                                        } else if (ordinal != 2) {
                                                            i4 = 0;
                                                            autoValue_Recorder_RecordingRecord4 = null;
                                                            runtimeException = null;
                                                        }
                                                        if (recorder2.mSourceState == 3) {
                                                            autoValue_Recorder_RecordingRecord4 = recorder2.mPendingRecordingRecord;
                                                            recorder2.mPendingRecordingRecord = null;
                                                            recorder2.restoreNonPendingState();
                                                            i4 = 4;
                                                            boolean z3 = z2;
                                                            runtimeException = Recorder.PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE;
                                                            z = z3;
                                                        } else {
                                                            if (recorder2.mActiveRecordingRecord == null && !recorder2.mNeedsResetBeforeNextStart) {
                                                                if (recorder2.mVideoEncoder != null) {
                                                                    i4 = 0;
                                                                    z = z2;
                                                                    runtimeException = null;
                                                                    autoValue_Recorder_RecordingRecord3 = recorder2.makePendingRecordingActiveLocked(recorder2.mState);
                                                                    autoValue_Recorder_RecordingRecord4 = null;
                                                                }
                                                                i4 = 0;
                                                                z = z2;
                                                                autoValue_Recorder_RecordingRecord4 = null;
                                                                runtimeException = null;
                                                            }
                                                            StringUtilsKt.w("Recorder", "PendingRecording is not handled, active recording = " + recorder2.mActiveRecordingRecord + ", need reset flag = " + recorder2.mNeedsResetBeforeNextStart);
                                                            i4 = 0;
                                                            z = z2;
                                                            autoValue_Recorder_RecordingRecord4 = null;
                                                            runtimeException = null;
                                                        }
                                                    } catch (Throwable th) {
                                                        throw th;
                                                    }
                                                }
                                                if (autoValue_Recorder_RecordingRecord3 != null) {
                                                    recorder2.startRecording(autoValue_Recorder_RecordingRecord3, z);
                                                    return;
                                                } else {
                                                    if (autoValue_Recorder_RecordingRecord4 != null) {
                                                        recorder2.finalizePendingRecording(autoValue_Recorder_RecordingRecord4, i4, runtimeException);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            default:
                                                SurfaceRequest surfaceRequest = recorder2.mLatestSurfaceRequest;
                                                if (surfaceRequest != null) {
                                                    recorder2.configureInternal(surfaceRequest, recorder2.mVideoSourceTimebase, false);
                                                    return;
                                                } else {
                                                    a$$ExternalSyntheticBUOutline0.m$1((Object) "surface request is required to retry initialization.");
                                                    return;
                                                }
                                        }
                                    }
                                });
                            } else if (state3 == Recorder.State.ERROR) {
                                recorder.setState(Recorder.State.PENDING_RECORDING);
                                recorder.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda6
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord3;
                                        int i4;
                                        RuntimeException runtimeException;
                                        AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord4;
                                        int i5 = i3;
                                        boolean z = false;
                                        Recorder recorder2 = recorder;
                                        switch (i5) {
                                            case 0:
                                                synchronized (recorder2.mLock) {
                                                    try {
                                                        StringUtilsKt.d("Recorder", "tryServicePendingRecording on state: " + recorder2.mState);
                                                        int ordinal = recorder2.mState.ordinal();
                                                        boolean z2 = true;
                                                        autoValue_Recorder_RecordingRecord3 = null;
                                                        if (ordinal == 1) {
                                                            z2 = false;
                                                        } else if (ordinal != 2) {
                                                            i4 = 0;
                                                            autoValue_Recorder_RecordingRecord4 = null;
                                                            runtimeException = null;
                                                        }
                                                        if (recorder2.mSourceState == 3) {
                                                            autoValue_Recorder_RecordingRecord4 = recorder2.mPendingRecordingRecord;
                                                            recorder2.mPendingRecordingRecord = null;
                                                            recorder2.restoreNonPendingState();
                                                            i4 = 4;
                                                            boolean z3 = z2;
                                                            runtimeException = Recorder.PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE;
                                                            z = z3;
                                                        } else {
                                                            if (recorder2.mActiveRecordingRecord == null && !recorder2.mNeedsResetBeforeNextStart) {
                                                                if (recorder2.mVideoEncoder != null) {
                                                                    i4 = 0;
                                                                    z = z2;
                                                                    runtimeException = null;
                                                                    autoValue_Recorder_RecordingRecord3 = recorder2.makePendingRecordingActiveLocked(recorder2.mState);
                                                                    autoValue_Recorder_RecordingRecord4 = null;
                                                                }
                                                                i4 = 0;
                                                                z = z2;
                                                                autoValue_Recorder_RecordingRecord4 = null;
                                                                runtimeException = null;
                                                            }
                                                            StringUtilsKt.w("Recorder", "PendingRecording is not handled, active recording = " + recorder2.mActiveRecordingRecord + ", need reset flag = " + recorder2.mNeedsResetBeforeNextStart);
                                                            i4 = 0;
                                                            z = z2;
                                                            autoValue_Recorder_RecordingRecord4 = null;
                                                            runtimeException = null;
                                                        }
                                                    } catch (Throwable th) {
                                                        throw th;
                                                    }
                                                }
                                                if (autoValue_Recorder_RecordingRecord3 != null) {
                                                    recorder2.startRecording(autoValue_Recorder_RecordingRecord3, z);
                                                    return;
                                                } else {
                                                    if (autoValue_Recorder_RecordingRecord4 != null) {
                                                        recorder2.finalizePendingRecording(autoValue_Recorder_RecordingRecord4, i4, runtimeException);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            default:
                                                SurfaceRequest surfaceRequest = recorder2.mLatestSurfaceRequest;
                                                if (surfaceRequest != null) {
                                                    recorder2.configureInternal(surfaceRequest, recorder2.mVideoSourceTimebase, false);
                                                    return;
                                                } else {
                                                    a$$ExternalSyntheticBUOutline0.m$1((Object) "surface request is required to retry initialization.");
                                                    return;
                                                }
                                        }
                                    }
                                });
                            } else {
                                recorder.setState(Recorder.State.PENDING_RECORDING);
                            }
                            autoValue_Recorder_RecordingRecord = null;
                            iOException = null;
                            i = 0;
                        } catch (IOException e2) {
                            e = e2;
                            i = 5;
                            iOException = e;
                            autoValue_Recorder_RecordingRecord = null;
                            if (autoValue_Recorder_RecordingRecord == null) {
                            }
                        }
                        break;
                    case 1:
                    case 2:
                        autoValue_Recorder_RecordingRecord = recorder.mPendingRecordingRecord;
                        autoValue_Recorder_RecordingRecord.getClass();
                        iOException = null;
                        i = 0;
                        j = j2;
                        break;
                    case 4:
                    case 5:
                        autoValue_Recorder_RecordingRecord = recorder.mActiveRecordingRecord;
                        iOException = null;
                        i = 0;
                        j = j2;
                        break;
                    default:
                        j = j2;
                        autoValue_Recorder_RecordingRecord = null;
                        iOException = null;
                        i = 0;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (autoValue_Recorder_RecordingRecord == null) {
            a$$ExternalSyntheticBUOutline0.m$1("A recording is already in progress. Previous recordings must be stopped before a new recording can be started.");
            return null;
        }
        if (i == 0) {
            return new Recording((Recorder) this.mappedElements, j, (FileOutputOptions) this.elementTypes, false);
        }
        StringUtilsKt.e("Recorder", "Recording was started when the Recorder had encountered error " + iOException);
        AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord3 = new AutoValue_Recorder_RecordingRecord((FileOutputOptions) this.elementTypes, (Executor) this.rootElements, (Consumer) this.mVersion, this.mLoaded, j);
        autoValue_Recorder_RecordingRecord3.mMuted.set(false);
        recorder.finalizePendingRecording(autoValue_Recorder_RecordingRecord3, i, iOException);
        return new Recording((Recorder) this.mappedElements, j, (FileOutputOptions) this.elementTypes, true);
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 0:
                StringBuilder sb = new StringBuilder();
                Iterator it = ((ArrayList) this.rootElements).iterator();
                while (it.hasNext()) {
                    sb.append(((Element) it.next()).toString("\t"));
                }
                return sb.toString();
            case 3:
                Response stringHelper = Ascii.toStringHelper(this);
                stringHelper.add((String) this.mVersion, "fullMethodName");
                stringHelper.add((zzbsq) this.mappedElements, "type");
                stringHelper.add("idempotent", false);
                stringHelper.add("safe", false);
                stringHelper.add("sampledToLocalTracing", this.mLoaded);
                stringHelper.add((zzcka) this.fieldSortOrder, "requestMarshaller");
                stringHelper.add((zzcka) this.rootElements, "responseMarshaller");
                stringHelper.add((Object) null, "schemaDescriptor");
                stringHelper.intermediate = true;
                return stringHelper.toString();
            default:
                return super.toString();
        }
    }

    public void withAudioEnabled() {
        if (PermissionChecker.checkSelfPermission((Context) this.fieldSortOrder, "android.permission.RECORD_AUDIO") == -1) {
            throw new SecurityException("Attempted to enable audio for recording but application does not have RECORD_AUDIO permission granted.");
        }
        ((MediaSpec) Recorder.getObservableData(((Recorder) this.mappedElements).mMediaSpec)).audioSpec.getClass();
        this.mLoaded = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[Catch: IOException -> 0x004b, TryCatch #3 {IOException -> 0x004b, blocks: (B:7:0x0027, B:9:0x002b, B:13:0x0035, B:15:0x003f, B:17:0x0047, B:22:0x005b, B:24:0x0065, B:28:0x0069, B:29:0x006e, B:30:0x009d, B:33:0x004e, B:35:0x00a0), top: B:6:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069 A[Catch: IOException -> 0x004b, TryCatch #3 {IOException -> 0x004b, blocks: (B:7:0x0027, B:9:0x002b, B:13:0x0035, B:15:0x003f, B:17:0x0047, B:22:0x005b, B:24:0x0065, B:28:0x0069, B:29:0x006e, B:30:0x009d, B:33:0x004e, B:35:0x00a0), top: B:6:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e A[Catch: IOException -> 0x004b, TryCatch #3 {IOException -> 0x004b, blocks: (B:7:0x0027, B:9:0x002b, B:13:0x0035, B:15:0x003f, B:17:0x0047, B:22:0x005b, B:24:0x0065, B:28:0x0069, B:29:0x006e, B:30:0x009d, B:33:0x004e, B:35:0x00a0), top: B:6:0x0027 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzbhz zzd(InputStream inputStream) {
        byte[] bArr;
        int i;
        zzcka zzckaVar = (zzcka) this.rootElements;
        if (inputStream instanceof zzcjz) {
            zzcjz zzcjzVar = (zzcjz) inputStream;
            if (zzcjzVar.zzb == zzckaVar.zzb) {
                try {
                    zzbhz zzbhzVar = zzcjzVar.zza;
                    if (zzbhzVar != null) {
                        return zzbhzVar;
                    }
                    throw new IllegalStateException("message not available");
                } catch (IllegalStateException unused) {
                }
            }
        } else {
            zzckaVar.getClass();
        }
        zzbiq zzbiqVar = null;
        try {
            if (inputStream instanceof zzbrg) {
                int available = inputStream.available();
                if (available > 0 && available <= 4194304) {
                    ThreadLocal threadLocal = zzcka.zza;
                    Reference reference = (Reference) threadLocal.get();
                    if (reference != null) {
                        bArr = (byte[]) reference.get();
                        if (bArr != null) {
                            if (bArr.length < available) {
                            }
                            i = available;
                            while (i > 0) {
                                int read = inputStream.read(bArr, available - i, i);
                                if (read == -1) {
                                    break;
                                }
                                i -= read;
                            }
                            if (i == 0) {
                                int i2 = available - i;
                                StringBuilder sb = new StringBuilder(String.valueOf(available).length() + 21 + String.valueOf(i2).length());
                                sb.append("size inaccurate: ");
                                sb.append(available);
                                sb.append(" != ");
                                sb.append(i2);
                                throw new RuntimeException(sb.toString());
                            }
                            zzbiqVar = zzbiq.zzJ(available, bArr);
                        }
                    }
                    bArr = new byte[available];
                    threadLocal.set(new WeakReference(bArr));
                    i = available;
                    while (i > 0) {
                    }
                    if (i == 0) {
                    }
                } else if (available == 0) {
                    return zzckaVar.zzc;
                }
            }
            if (zzbiqVar == null) {
                zzbiqVar = new zzbip(inputStream);
            }
            try {
                zzbjr zza = ((zzbjm) zzckaVar.zzb).zza(zzbiqVar, zzckb.zza);
                try {
                    zzbiqVar.zzb(0);
                    return zza;
                } catch (zzbke e) {
                    throw e;
                }
            } catch (zzbke e2) {
                throw new zzbua(zzbtx.zzh.zze("Invalid protobuf byte sequence").zzd(e2));
            }
        } catch (IOException e3) {
            a$$ExternalSyntheticBUOutline0.m((Throwable) e3);
            return null;
        }
    }

    public zzcjz zze(Object obj) {
        zzcka zzckaVar = (zzcka) this.fieldSortOrder;
        zzckaVar.getClass();
        return new zzcjz((zzbhz) obj, zzckaVar.zzb);
    }

    public Schema() {
        this.$r8$classId = 0;
        this.mappedElements = new LinkedHashMap();
        this.elementTypes = new HashMap();
        this.fieldSortOrder = new HashMap();
        this.mVersion = null;
        this.rootElements = new ArrayList();
    }

    public Schema(int i, float f, PagerState pagerState) {
        this.$r8$classId = 2;
        this.mappedElements = pagerState;
        this.elementTypes = new ParcelableSnapshotMutableIntState(i);
        this.fieldSortOrder = new ParcelableSnapshotMutableFloatState(f);
        this.rootElements = new LazyLayoutNearestRangeState(i, 30, 100);
    }

    public Schema(Context context, Recorder recorder, FileOutputOptions fileOutputOptions) {
        this.$r8$classId = 1;
        context.getClass();
        this.mappedElements = recorder;
        this.elementTypes = fileOutputOptions;
        Context persistentApplicationContext = ContextUtil.getPersistentApplicationContext(context);
        persistentApplicationContext.getClass();
        this.fieldSortOrder = persistentApplicationContext;
    }
}
