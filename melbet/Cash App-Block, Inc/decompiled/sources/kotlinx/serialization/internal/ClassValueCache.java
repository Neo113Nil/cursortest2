package kotlinx.serialization.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.Range;
import androidx.camera.camera2.compat.ZoomCompat;
import androidx.camera.camera2.impl.CameraPipeCameraProperties;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.compat.Api34Compat;
import androidx.camera.camera2.pipe.compat.Camera2CameraMetadata;
import androidx.media3.ui.PlayerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.coroutines.Deferred;
import kotlinx.serialization.KSerializer;
import papa.PapaEvent;

/* loaded from: classes9.dex */
public final class ClassValueCache implements ZoomCompat, SerializerCache, ParametrizedSerializerCache {
    public final Object classValue;
    public final Object compute;

    public ClassValueCache(Function1 function1) {
        this.compute = function1;
        this.classValue = new ClassValueReferences();
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public Deferred applyAsync(float f, UseCaseCameraRequestControl useCaseCameraRequestControl) {
        CaptureRequest.Key key;
        useCaseCameraRequestControl.getClass();
        float minZoomRatio = getMinZoomRatio();
        if (f > getMaxZoomRatio() || minZoomRatio > f) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return null;
        }
        key = CaptureRequest.CONTROL_ZOOM_RATIO;
        LinkedHashMap mutableMapOf = MapsKt__MapsKt.mutableMapOf(new Pair(key, Float.valueOf(f)));
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            CameraMetadata.Companion companion = CameraMetadata.Companion;
            CameraMetadata cameraMetadata = ((CameraPipeCameraProperties) this.compute).metadata;
            companion.getClass();
            cameraMetadata.getClass();
            if (i >= 34 && Api34Compat.isZoomOverrideSupported(cameraMetadata)) {
                PlayerView.Api34.setSettingsOverrideZoom(mutableMapOf);
            }
        }
        return UseCaseCameraRequestControl.setParametersAsync$default(useCaseCameraRequestControl, mutableMapOf);
    }

    @Override // kotlinx.serialization.internal.SerializerCache
    public KSerializer get(KClass kClass) {
        Object obj = ((ClassValueReferences) this.classValue).get(PapaEvent.getJavaClass(kClass));
        obj.getClass();
        MutableSoftReference mutableSoftReference = (MutableSoftReference) obj;
        Object obj2 = mutableSoftReference.reference.get();
        if (obj2 == null) {
            synchronized (mutableSoftReference) {
                obj2 = mutableSoftReference.reference.get();
                if (obj2 == null) {
                    obj2 = new CacheEntry((KSerializer) ((Function1) this.compute).invoke(kClass));
                    mutableSoftReference.reference = new SoftReference(obj2);
                }
            }
        }
        return ((CacheEntry) obj2).serializer;
    }

    @Override // kotlinx.serialization.internal.ParametrizedSerializerCache
    /* renamed from: get-gIAlu-s, reason: not valid java name */
    public Object mo4205getgIAlus(KClass kClass, ArrayList arrayList) {
        Object failure;
        Object obj = ((ClassValueReferences) this.classValue).get(PapaEvent.getJavaClass(kClass));
        obj.getClass();
        MutableSoftReference mutableSoftReference = (MutableSoftReference) obj;
        Object obj2 = mutableSoftReference.reference.get();
        if (obj2 == null) {
            synchronized (mutableSoftReference) {
                obj2 = mutableSoftReference.reference.get();
                if (obj2 == null) {
                    obj2 = new ParametrizedCacheEntry();
                    mutableSoftReference.reference = new SoftReference(obj2);
                }
            }
        }
        ParametrizedCacheEntry parametrizedCacheEntry = (ParametrizedCacheEntry) obj2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new KTypeWrapper((KType) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = parametrizedCacheEntry.serializers;
        Object obj3 = concurrentHashMap.get(arrayList2);
        if (obj3 == null) {
            try {
                Result.Companion companion = Result.Companion;
                failure = (KSerializer) ((Function2) this.compute).invoke(kClass, arrayList);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                failure = new Result.Failure(th);
            }
            Result result = new Result(failure);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(arrayList2, result);
            obj3 = putIfAbsent == null ? result : putIfAbsent;
        }
        return ((Result) obj3).value;
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public Rect getCropSensorRegion() {
        CameraMetadata cameraMetadata = ((CameraPipeCameraProperties) this.compute).metadata;
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        key.getClass();
        Object obj = ((Camera2CameraMetadata) cameraMetadata).get(key);
        obj.getClass();
        return (Rect) obj;
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public float getMaxZoomRatio() {
        Object upper = ((Range) this.classValue).getUpper();
        upper.getClass();
        return ((Number) upper).floatValue();
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public float getMinZoomRatio() {
        Object lower = ((Range) this.classValue).getLower();
        lower.getClass();
        return ((Number) lower).floatValue();
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public Deferred resetAsync(UseCaseCameraRequestControl useCaseCameraRequestControl) {
        CaptureRequest.Key key;
        useCaseCameraRequestControl.getClass();
        key = CaptureRequest.CONTROL_ZOOM_RATIO;
        key.getClass();
        ArrayList mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(key);
        if (Build.VERSION.SDK_INT >= 34) {
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_SETTINGS_OVERRIDE;
            key2.getClass();
            mutableListOf.add(key2);
        }
        UseCaseCameraRequestControl.Type type2 = UseCaseCameraRequestControl.Type.SESSION_CONFIG;
        return useCaseCameraRequestControl.removeParametersAsync(mutableListOf);
    }

    public ClassValueCache(Function2 function2) {
        this.compute = function2;
        this.classValue = new ClassValueReferences();
    }

    public ClassValueCache(CameraPipeCameraProperties cameraPipeCameraProperties, Range range) {
        this.compute = cameraPipeCameraProperties;
        this.classValue = range;
    }
}
