package com.withpersona.sdk2.inquiry.shared.image;

import androidx.exifinterface.media.ExifInterface;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.yf$$ExternalSyntheticLambda3;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.InterruptibleKt;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class RealImageHelper {
    public static Map extractExifData(File file) {
        try {
            List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "Make", "Model", "Orientation", "SubSecTime", "WhiteBalance"});
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                ExifInterface exifInterface = new ExifInterface(fileInputStream);
                List list = listOf;
                int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                if (mapCapacity < 16) {
                    mapCapacity = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                for (Object obj : list) {
                    linkedHashMap.put(obj, exifInterface.getAttribute((String) obj));
                }
                fileInputStream.close();
                return linkedHashMap;
            } finally {
            }
        } catch (IOException unused) {
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            return emptyMap;
        }
    }

    public static void writeExifData(File file, Map map) {
        try {
            ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    exifInterface.setAttribute(str, str2);
                }
            }
            exifInterface.saveAttributes();
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: resizeAndCompressImageInPlace-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4103resizeAndCompressImageInPlacegIAlus(File file, ContinuationImpl continuationImpl) {
        RealImageHelper$resizeAndCompressImageInPlace$1 realImageHelper$resizeAndCompressImageInPlace$1;
        int i;
        if (continuationImpl instanceof RealImageHelper$resizeAndCompressImageInPlace$1) {
            realImageHelper$resizeAndCompressImageInPlace$1 = (RealImageHelper$resizeAndCompressImageInPlace$1) continuationImpl;
            int i2 = realImageHelper$resizeAndCompressImageInPlace$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realImageHelper$resizeAndCompressImageInPlace$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realImageHelper$resizeAndCompressImageInPlace$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realImageHelper$resizeAndCompressImageInPlace$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    yf$$ExternalSyntheticLambda3 yf__externalsyntheticlambda3 = new yf$$ExternalSyntheticLambda3(this, file);
                    realImageHelper$resizeAndCompressImageInPlace$1.label = 1;
                    obj = InterruptibleKt.runInterruptible(defaultScheduler, yf__externalsyntheticlambda3, realImageHelper$resizeAndCompressImageInPlace$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return ((Result) obj).value;
            }
        }
        realImageHelper$resizeAndCompressImageInPlace$1 = new RealImageHelper$resizeAndCompressImageInPlace$1(this, continuationImpl);
        Object obj2 = realImageHelper$resizeAndCompressImageInPlace$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realImageHelper$resizeAndCompressImageInPlace$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).value;
    }
}
