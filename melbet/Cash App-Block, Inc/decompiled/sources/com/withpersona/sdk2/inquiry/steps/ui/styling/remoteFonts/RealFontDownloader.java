package com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts;

import android.app.Application;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import dev.chrisbanes.haze.BlurEffectKt$$ExternalSyntheticLambda1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.io.ByteStreamsKt;
import kotlin.text.Regex$$ExternalSyntheticLambda1;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.InterruptibleKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Utf8;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class RealFontDownloader implements FontDownloader {
    public final Application context;
    public final ContextScope coroutineScope;
    public final LinkedHashMap fontCache;
    public Map fontDownloaderMapping;
    public final OkHttpClient okHttpClient;
    public final ArrayList onFontDownloadedCallbacks;

    /* loaded from: classes7.dex */
    public final class FontDownloadedCallback {
        public final BlurEffectKt$$ExternalSyntheticLambda1 onFontDownloaded;
        public final String url;

        public FontDownloadedCallback(String str, BlurEffectKt$$ExternalSyntheticLambda1 blurEffectKt$$ExternalSyntheticLambda1) {
            this.url = str;
            this.onFontDownloaded = blurEffectKt$$ExternalSyntheticLambda1;
        }
    }

    public final class FontDownloaderState implements Parcelable {
        public static final Parcelable.Creator<FontDownloaderState> CREATOR = new Creator();
        public final Map fontDownloaderMapping;

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i = 0; i != readInt; i++) {
                    String readString = parcel.readString();
                    int readInt2 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
                    for (int i2 = 0; i2 != readInt2; i2++) {
                        linkedHashMap2.put(StyleElements.FontWeight.valueOf(parcel.readString()), parcel.readString());
                    }
                    linkedHashMap.put(readString, linkedHashMap2);
                }
                return new FontDownloaderState(linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FontDownloaderState[i];
            }
        }

        public FontDownloaderState(Map map) {
            map.getClass();
            this.fontDownloaderMapping = map;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.fontDownloaderMapping, parcel);
            while (m.hasNext()) {
                Map.Entry entry = (Map.Entry) m.next();
                parcel.writeString((String) entry.getKey());
                Iterator m2 = NavAction$$ExternalSyntheticOutline0.m((Map) entry.getValue(), parcel);
                while (m2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) m2.next();
                    parcel.writeString(((StyleElements.FontWeight) entry2.getKey()).name());
                    parcel.writeString((String) entry2.getValue());
                }
            }
        }
    }

    public interface FontState {

        public final class Cached implements FontState {
            public final Typeface typeface;

            public Cached(Typeface typeface) {
                this.typeface = typeface;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Cached) && this.typeface.equals(((Cached) obj).typeface);
            }

            public final int hashCode() {
                return this.typeface.hashCode();
            }

            public final String toString() {
                return "Cached(typeface=" + this.typeface + ")";
            }
        }

        public final class Downloading implements FontState {
            public static final Downloading INSTANCE = new Downloading();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Downloading);
            }

            public final int hashCode() {
                return 1662305117;
            }

            public final String toString() {
                return "Downloading";
            }
        }
    }

    public RealFontDownloader(OkHttpClient okHttpClient, Application application) {
        okHttpClient.getClass();
        application.getClass();
        this.okHttpClient = okHttpClient;
        this.context = application;
        this.fontDownloaderMapping = new LinkedHashMap();
        this.fontCache = new LinkedHashMap();
        this.onFontDownloadedCallbacks = new ArrayList();
        this.coroutineScope = JobKt.CoroutineScope(Dispatchers.Default.plus(JobKt.SupervisorJob$default()));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005f A[Catch: all -> 0x008f, TRY_LEAVE, TryCatch #5 {all -> 0x008f, blocks: (B:12:0x005b, B:14:0x005f, B:19:0x0086, B:39:0x0093, B:40:0x0096, B:16:0x0069, B:18:0x0083, B:31:0x007d, B:32:0x0080, B:24:0x0070, B:28:0x007b, B:36:0x0091), top: B:11:0x005b, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$downloadFontFile(RealFontDownloader realFontDownloader, String str, File file, ContinuationImpl continuationImpl) {
        RealFontDownloader$downloadFontFile$1 realFontDownloader$downloadFontFile$1;
        int i;
        InputStream inputStream;
        realFontDownloader.getClass();
        try {
            try {
                if (continuationImpl instanceof RealFontDownloader$downloadFontFile$1) {
                    realFontDownloader$downloadFontFile$1 = (RealFontDownloader$downloadFontFile$1) continuationImpl;
                    int i2 = realFontDownloader$downloadFontFile$1.label;
                    if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                        realFontDownloader$downloadFontFile$1.label = i2 - PKIFailureInfo.systemUnavail;
                        Object obj = realFontDownloader$downloadFontFile$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = realFontDownloader$downloadFontFile$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj);
                            Request.Builder builder = new Request.Builder();
                            builder.url(str);
                            Request request = new Request(builder);
                            DefaultScheduler defaultScheduler = Dispatchers.Default;
                            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                            Regex$$ExternalSyntheticLambda1 regex$$ExternalSyntheticLambda1 = new Regex$$ExternalSyntheticLambda1(20, realFontDownloader, request);
                            realFontDownloader$downloadFontFile$1.L$0 = file;
                            realFontDownloader$downloadFontFile$1.label = 1;
                            obj = InterruptibleKt.runInterruptible(defaultIoScheduler, regex$$ExternalSyntheticLambda1, realFontDownloader$downloadFontFile$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            file = realFontDownloader$downloadFontFile$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                        }
                        Response response = (Response) obj;
                        ResponseBody responseBody = response.body;
                        inputStream = responseBody == null ? responseBody.source().inputStream() : null;
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        if (inputStream != null) {
                            try {
                                new Long(ByteStreamsKt.copyTo$default(inputStream, fileOutputStream));
                            } finally {
                            }
                        }
                        fileOutputStream.close();
                        Utf8.closeFinally(inputStream, null);
                        response.close();
                        return Unit.INSTANCE;
                    }
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                if (inputStream != null) {
                }
                fileOutputStream2.close();
                Utf8.closeFinally(inputStream, null);
                response.close();
                return Unit.INSTANCE;
            } finally {
            }
            ResponseBody responseBody2 = response.body;
            if (responseBody2 == null) {
            }
        } finally {
        }
        realFontDownloader$downloadFontFile$1 = new RealFontDownloader$downloadFontFile$1(realFontDownloader, continuationImpl);
        Object obj2 = realFontDownloader$downloadFontFile$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realFontDownloader$downloadFontFile$1.label;
        if (i != 0) {
        }
        Response response2 = (Response) obj2;
    }

    public static final File access$getFontFile(RealFontDownloader realFontDownloader) {
        realFontDownloader.getClass();
        File file = new File(new File(realFontDownloader.context.getCacheDir(), ".com.withpersona.sdk2.inquiry"), "fonts");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, UUID.randomUUID().toString());
    }
}
