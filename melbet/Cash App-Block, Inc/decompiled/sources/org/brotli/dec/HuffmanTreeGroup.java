package org.brotli.dec;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.PaintDrawable;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import androidx.appcompat.widget.TintInfo;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.internal.muxer.Media3MuxerImpl$$ExternalSyntheticLambda1;
import androidx.camera.video.internal.muxer.Media3MuxerImpl$State;
import androidx.camera.video.internal.muxer.MediaMuxerImpl$State;
import androidx.camera.video.internal.muxer.MuxerException;
import androidx.collection.ArrayMap;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.DefaultLazyKey;
import androidx.compose.foundation.lazy.layout.IntervalList$Interval;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent$Interval;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.Util;
import androidx.media3.container.Mp4OrientationData;
import androidx.media3.extractor.BinarySearchSeeker$TimestampSearchResult;
import androidx.media3.extractor.BinarySearchSeeker$TimestampSeeker;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.Id3Peeker$$ExternalSyntheticBUOutline0;
import androidx.media3.extractor.ts.TsUtil;
import androidx.media3.muxer.Mp4Muxer;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda0;
import androidx.paging.FlattenedPageController$getStateAsEvents$1;
import androidx.paging.FlattenedPageController$record$1;
import androidx.paging.FlattenedPageEventStorage;
import androidx.paging.PageEvent;
import androidx.paging.Pager$pageFetcher$2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.request.ViewTargetDisposable;
import com.android.volley.RequestQueue;
import com.bumptech.glide.util.pool.FactoryPools;
import com.fillr.browsersdk.Fillr;
import com.fillr.e0;
import com.fillr.n;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.zam;
import com.google.android.gms.common.api.internal.zap;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.internal.mlkit_vision_barcode.zzff;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfg;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrf;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxb;
import com.google.android.gms.internal.mlkit_vision_face.zzcv;
import com.google.android.gms.internal.mlkit_vision_face.zzcw;
import com.google.android.gms.internal.mlkit_vision_face.zzkw;
import com.google.android.gms.internal.mlkit_vision_face.zzmv;
import com.google.android.gms.internal.mlkit_vision_face.zzoo;
import com.google.android.gms.internal.mlkit_vision_text_common.zzcy;
import com.google.android.gms.internal.mlkit_vision_text_common.zzcz;
import com.google.android.gms.internal.mlkit_vision_text_common.zzdb;
import com.google.android.gms.internal.mlkit_vision_text_common.zzoy;
import com.google.android.gms.internal.mlkit_vision_text_common.zzst;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuo;
import com.google.android.gms.maps.zzah;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.firebase.encoders.json.JsonValueObjectEncoderContext;
import com.squareup.cash.graphics.swampgl.GLLauncher;
import com.squareup.cash.graphics.swampgl.components.AABB;
import com.squareup.cash.graphics.swampgl.components.Geometry;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda6;
import com.squareup.cash.sheet.BottomSheet;
import com.squareup.cash.sheet.BottomSheetDragHandle;
import com.squareup.cash.ui.BottomSheetHandleConfig;
import com.squareup.workflow1.internal.SubtreeManager;
import com.stripe.android.model.parsers.TokenJsonParser;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.reactivex.rxjava3.internal.util.AppendOnlyLinkedArrayList$NonThrowingPredicate;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.Handlers$$ExternalSyntheticBUOutline0;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class HuffmanTreeGroup implements BinarySearchSeeker$TimestampSeeker, Geometry {
    public final /* synthetic */ int $r8$classId;
    public int alphabetSize;
    public Object codes;
    public Object trees;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ce, code lost:
    
        if (r9 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HuffmanTreeGroup(IntRange intRange, LazyLayoutKt lazyLayoutKt) {
        Object defaultLazyKey;
        this.$r8$classId = 5;
        HuffmanTreeGroup intervals = lazyLayoutKt.getIntervals();
        int i = intRange.first;
        if (i < 0) {
            InlineClassHelperKt.throwIllegalStateException("negative nearestRange.first");
        }
        int min = Math.min(intRange.last, intervals.alphabetSize - 1);
        if (min < i) {
            MutableObjectIntMap mutableObjectIntMap = ObjectIntMapKt.EmptyObjectIntMap;
            mutableObjectIntMap.getClass();
            this.codes = mutableObjectIntMap;
            this.trees = new Object[0];
            this.alphabetSize = 0;
            return;
        }
        int i2 = (min - i) + 1;
        this.trees = new Object[i2];
        this.alphabetSize = i;
        MutableObjectIntMap mutableObjectIntMap2 = new MutableObjectIntMap(i2);
        MutableVector mutableVector = (MutableVector) intervals.codes;
        if (i < 0 || i >= intervals.alphabetSize) {
            StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "Index ", ", size ");
            m2m.append(intervals.alphabetSize);
            InlineClassHelperKt.throwIndexOutOfBoundsException(m2m.toString());
        }
        if (min < 0 || min >= intervals.alphabetSize) {
            StringBuilder m2m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(min, "Index ", ", size ");
            m2m2.append(intervals.alphabetSize);
            InlineClassHelperKt.throwIndexOutOfBoundsException(m2m2.toString());
        }
        if (min < i) {
            InlineClassHelperKt.throwIllegalArgumentException("toIndex (" + min + ") should be not smaller than fromIndex (" + i + ')');
        }
        int access$binarySearch = LazyLayoutKt.access$binarySearch(i, mutableVector);
        int i3 = ((IntervalList$Interval) mutableVector.content[access$binarySearch]).startIndex;
        while (i3 <= min) {
            IntervalList$Interval intervalList$Interval = (IntervalList$Interval) mutableVector.content[access$binarySearch];
            Function1 key = intervalList$Interval.value.getKey();
            int i4 = intervalList$Interval.startIndex;
            int max = Math.max(i, i4);
            int min2 = Math.min(min, (intervalList$Interval.size + i4) - 1);
            if (max <= min2) {
                while (true) {
                    if (key != null) {
                        defaultLazyKey = key.invoke(Integer.valueOf(max - i4));
                    }
                    defaultLazyKey = new DefaultLazyKey(max);
                    mutableObjectIntMap2.set(max, defaultLazyKey);
                    ((Object[]) this.trees)[max - this.alphabetSize] = defaultLazyKey;
                    max = max != min2 ? max + 1 : max;
                }
            }
            i3 += intervalList$Interval.size;
            access$binarySearch++;
        }
        this.codes = mutableObjectIntMap2;
    }

    public static void decode(HuffmanTreeGroup huffmanTreeGroup, BitReader bitReader) {
        int length = ((int[]) huffmanTreeGroup.trees).length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            ((int[]) huffmanTreeGroup.trees)[i2] = i;
            Utils.readHuffmanCode(huffmanTreeGroup.alphabetSize, (int[]) huffmanTreeGroup.codes, i, bitReader);
            i += 1080;
        }
    }

    public static Object wrapMuxerException(Function0 function0) {
        try {
            return function0.invoke();
        } catch (Exception e) {
            throw new MuxerException("MediaMuxer operation failed", e);
        }
    }

    public void add(Object obj) {
        int i = this.alphabetSize;
        if (i == 4) {
            Object[] objArr = new Object[5];
            ((Object[]) this.trees)[4] = objArr;
            this.trees = objArr;
            i = 0;
        }
        ((Object[]) this.trees)[i] = obj;
        this.alphabetSize = i + 1;
    }

    public void addInterval(int i, LazyLayoutIntervalContent$Interval lazyLayoutIntervalContent$Interval) {
        if (i < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        IntervalList$Interval intervalList$Interval = new IntervalList$Interval(this.alphabetSize, i, lazyLayoutIntervalContent$Interval);
        this.alphabetSize += i;
        ((MutableVector) this.codes).add(intervalList$Interval);
    }

    public int addTrack(MediaFormat mediaFormat) {
        int i;
        switch (this.$r8$classId) {
            case 2:
                if (((Media3MuxerImpl$State) this.trees) != Media3MuxerImpl$State.CONFIGURED) {
                    Handlers$$ExternalSyntheticBUOutline0.m((Media3MuxerImpl$State) this.trees, "Muxer is not configured. Current state: ");
                    return 0;
                }
                String string2 = mediaFormat.getString("mime");
                if ((string2 != null ? StringsKt__StringsJVMKt.startsWith(string2, "video/", false) : false) && (i = this.alphabetSize) > 0) {
                    mediaFormat.setInteger("capture-rate", i);
                }
                return ((Number) wrapMuxerException(new DialogHostKt$$ExternalSyntheticLambda0(8, this, mediaFormat))).intValue();
            default:
                if (((MediaMuxerImpl$State) this.trees) != MediaMuxerImpl$State.CONFIGURED) {
                    Handlers$$ExternalSyntheticBUOutline0.m((MediaMuxerImpl$State) this.trees, "Muxer is not configured. Current state: ");
                    return 0;
                }
                String string3 = mediaFormat.getString("mime");
                if ((string3 != null ? StringsKt__StringsJVMKt.startsWith(string3, "video/", false) : false) && this.alphabetSize > 0) {
                    mediaFormat.setInteger("time-lapse-enable", 1);
                    mediaFormat.setInteger("time-lapse-fps", this.alphabetSize);
                }
                try {
                    MediaMuxer mediaMuxer = (MediaMuxer) this.codes;
                    mediaMuxer.getClass();
                    return mediaMuxer.addTrack(mediaFormat);
                } catch (Exception e) {
                    throw new MuxerException("MediaMuxer operation failed", e);
                }
        }
    }

    public void d(String str, Object... objArr) {
        if (this.alphabetSize <= 3) {
            String str2 = (String) this.codes;
            if (objArr.length > 0) {
                str = String.format(Locale.US, str, objArr);
            }
            Log.d(str2, ((String) this.trees).concat(str));
        }
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Geometry
    public void draw() {
        int i;
        if (this.alphabetSize == 0) {
            return;
        }
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(35725, iArr, 0);
        int glGetAttribLocation = GLES20.glGetAttribLocation(iArr[0], "aBackgroundPosition");
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(iArr[0], "aBackgroundUV");
        GLES20.glBindBuffer(34962, this.alphabetSize);
        if (glGetAttribLocation >= 0) {
            GLES20.glEnableVertexAttribArray(glGetAttribLocation);
            GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 16, 0);
        }
        if (glGetAttribLocation2 >= 0) {
            GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
            i = glGetAttribLocation2;
            GLES20.glVertexAttribPointer(i, 2, 5126, false, 16, 8);
        } else {
            i = glGetAttribLocation2;
        }
        GLES20.glDrawArrays(4, 0, 6);
        if (glGetAttribLocation >= 0) {
            GLES20.glDisableVertexAttribArray(glGetAttribLocation);
        }
        if (i >= 0) {
            GLES20.glDisableVertexAttribArray(i);
        }
        GLES20.glBindBuffer(34962, 0);
    }

    public void forEachWhile(AppendOnlyLinkedArrayList$NonThrowingPredicate appendOnlyLinkedArrayList$NonThrowingPredicate) {
        Object obj;
        for (Object[] objArr = (Object[]) this.codes; objArr != null; objArr = objArr[4]) {
            for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                if (appendOnlyLinkedArrayList$NonThrowingPredicate.test(obj)) {
                    return;
                }
            }
        }
    }

    /* renamed from: get, reason: collision with other method in class */
    public Object m4368get(int i) {
        SparseArray sparseArray = (SparseArray) this.codes;
        if (this.alphabetSize == -1) {
            this.alphabetSize = 0;
        }
        while (true) {
            int i2 = this.alphabetSize;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.alphabetSize--;
        }
        while (this.alphabetSize < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.alphabetSize + 1)) {
            this.alphabetSize++;
        }
        return sparseArray.valueAt(this.alphabetSize);
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Geometry
    public AABB getAABB() {
        return new AABB(-1.0f, -1.0f, RecyclerView.DECELERATION_RATE, 1.0f, 1.0f, RecyclerView.DECELERATION_RATE);
    }

    public List getChanges() {
        return (ArrayList) this.codes;
    }

    public int getIndex(Object obj) {
        MutableObjectIntMap mutableObjectIntMap = (MutableObjectIntMap) this.codes;
        int findKeyIndex = mutableObjectIntMap.findKeyIndex(obj);
        if (findKeyIndex >= 0) {
            return mutableObjectIntMap.values[findKeyIndex];
        }
        return -1;
    }

    public Object getKey(int i) {
        Object[] objArr = (Object[]) this.trees;
        int i2 = i - this.alphabetSize;
        if (i2 < 0 || i2 >= objArr.length) {
            return null;
        }
        return objArr[i2];
    }

    /* renamed from: getPrimaryDirectionalMotionAxis-nZO2Niw, reason: not valid java name */
    public int m4367getPrimaryDirectionalMotionAxisnZO2Niw() {
        return this.alphabetSize;
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Geometry
    public StateFlow getReady() {
        return (ReadonlyStateFlow) this.trees;
    }

    public int getRoleFlags() {
        int i = this.alphabetSize;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006b A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:11:0x0043, B:12:0x0065, B:14:0x006b, B:16:0x0073, B:18:0x0082, B:19:0x0085), top: B:10:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable getStateAsEvents(ContinuationImpl continuationImpl) {
        FlattenedPageController$getStateAsEvents$1 flattenedPageController$getStateAsEvents$1;
        int i;
        MutexImpl mutexImpl;
        try {
            if (continuationImpl instanceof FlattenedPageController$getStateAsEvents$1) {
                flattenedPageController$getStateAsEvents$1 = (FlattenedPageController$getStateAsEvents$1) continuationImpl;
                int i2 = flattenedPageController$getStateAsEvents$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    flattenedPageController$getStateAsEvents$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = flattenedPageController$getStateAsEvents$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = flattenedPageController$getStateAsEvents$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        MutexImpl mutexImpl2 = (MutexImpl) this.trees;
                        flattenedPageController$getStateAsEvents$1.L$0 = mutexImpl2;
                        flattenedPageController$getStateAsEvents$1.label = 1;
                        if (mutexImpl2.lock(flattenedPageController$getStateAsEvents$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        mutexImpl = mutexImpl2;
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutexImpl = flattenedPageController$getStateAsEvents$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    List asEvents = ((FlattenedPageEventStorage) this.codes).getAsEvents();
                    int size = (this.alphabetSize - asEvents.size()) + 1;
                    List list = asEvents;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    int i3 = 0;
                    for (Object obj2 : list) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        arrayList.add(new IndexedValue(i3 + size, (PageEvent) obj2));
                        i3 = i4;
                    }
                    mutexImpl.unlock(null);
                    return arrayList;
                }
            }
            List asEvents2 = ((FlattenedPageEventStorage) this.codes).getAsEvents();
            int size2 = (this.alphabetSize - asEvents2.size()) + 1;
            List list2 = asEvents2;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            int i32 = 0;
            while (r8.hasNext()) {
            }
            mutexImpl.unlock(null);
            return arrayList2;
        } catch (Throwable th) {
            mutexImpl.unlock(null);
            throw th;
        }
        flattenedPageController$getStateAsEvents$1 = new FlattenedPageController$getStateAsEvents$1(this, continuationImpl);
        Object obj3 = flattenedPageController$getStateAsEvents$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flattenedPageController$getStateAsEvents$1.label;
        if (i != 0) {
        }
    }

    @Override // androidx.media3.extractor.BinarySearchSeeker$TimestampSeeker
    public void onSeekFinished() {
        ParsableByteArray parsableByteArray = (ParsableByteArray) this.trees;
        byte[] bArr = Util.EMPTY_BYTE_ARRAY;
        parsableByteArray.getClass();
        parsableByteArray.reset(bArr.length, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object record(IndexedValue indexedValue, ContinuationImpl continuationImpl) {
        FlattenedPageController$record$1 flattenedPageController$record$1;
        int i;
        MutexImpl mutexImpl;
        try {
            if (continuationImpl instanceof FlattenedPageController$record$1) {
                flattenedPageController$record$1 = (FlattenedPageController$record$1) continuationImpl;
                int i2 = flattenedPageController$record$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    flattenedPageController$record$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = flattenedPageController$record$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = flattenedPageController$record$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = (MutexImpl) this.trees;
                        flattenedPageController$record$1.L$0 = indexedValue;
                        flattenedPageController$record$1.L$1 = mutexImpl;
                        flattenedPageController$record$1.label = 1;
                        if (mutexImpl.lock(flattenedPageController$record$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        MutexImpl mutexImpl2 = flattenedPageController$record$1.L$1;
                        IndexedValue indexedValue2 = flattenedPageController$record$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = mutexImpl2;
                        indexedValue = indexedValue2;
                    }
                    this.alphabetSize = indexedValue.index;
                    ((FlattenedPageEventStorage) this.codes).add((PageEvent) indexedValue.value);
                    mutexImpl.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            this.alphabetSize = indexedValue.index;
            ((FlattenedPageEventStorage) this.codes).add((PageEvent) indexedValue.value);
            mutexImpl.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutexImpl.unlock(null);
            throw th;
        }
        flattenedPageController$record$1 = new FlattenedPageController$record$1(this, continuationImpl);
        Object obj2 = flattenedPageController$record$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flattenedPageController$record$1.label;
        if (i != 0) {
        }
    }

    public void release() {
        switch (this.$r8$classId) {
            case 2:
                if (((Media3MuxerImpl$State) this.trees) != Media3MuxerImpl$State.RELEASED) {
                    try {
                        Result.Companion companion = Result.Companion;
                        TintInfo tintInfo = (TintInfo) this.codes;
                        if (tintInfo != null && !tintInfo.mHasTintList) {
                            tintInfo.closeMuxer();
                        }
                    } catch (Throwable unused) {
                        Result.Companion companion2 = Result.Companion;
                    }
                    this.codes = null;
                    this.trees = Media3MuxerImpl$State.RELEASED;
                    break;
                }
                break;
            default:
                if (((MediaMuxerImpl$State) this.trees) != MediaMuxerImpl$State.RELEASED) {
                    try {
                        Result.Companion companion3 = Result.Companion;
                        MediaMuxer mediaMuxer = (MediaMuxer) this.codes;
                        if (mediaMuxer != null) {
                            mediaMuxer.release();
                        }
                    } catch (Throwable unused2) {
                        Result.Companion companion4 = Result.Companion;
                    }
                    this.codes = null;
                    this.trees = MediaMuxerImpl$State.RELEASED;
                    break;
                }
                break;
        }
    }

    @Override // androidx.media3.extractor.BinarySearchSeeker$TimestampSeeker
    public BinarySearchSeeker$TimestampSearchResult searchForTimestamp(ExtractorInput extractorInput, long j) {
        long j2;
        long position = extractorInput.getPosition();
        int min = (int) Math.min(112800L, extractorInput.getLength() - position);
        ParsableByteArray parsableByteArray = (ParsableByteArray) this.trees;
        parsableByteArray.reset(min);
        extractorInput.peekFully(0, min, parsableByteArray.data);
        int i = parsableByteArray.limit;
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (true) {
            if (parsableByteArray.bytesLeft() < 188) {
                j2 = -9223372036854775807L;
                break;
            }
            byte[] bArr = parsableByteArray.data;
            int i2 = parsableByteArray.position;
            while (true) {
                if (i2 >= i) {
                    j2 = -9223372036854775807L;
                    break;
                }
                j2 = -9223372036854775807L;
                if (bArr[i2] == 71) {
                    break;
                }
                i2++;
            }
            int i3 = i2 + 188;
            if (i3 > i) {
                break;
            }
            long readPcrFromPacket = TsUtil.readPcrFromPacket(parsableByteArray, i2, this.alphabetSize);
            if (readPcrFromPacket != j2) {
                long adjustTsTimestamp = ((TimestampAdjuster) this.codes).adjustTsTimestamp(readPcrFromPacket);
                if (adjustTsTimestamp > j) {
                    return j5 == j2 ? new BinarySearchSeeker$TimestampSearchResult(-1, adjustTsTimestamp, position) : new BinarySearchSeeker$TimestampSearchResult(0, -9223372036854775807L, position + j4);
                }
                j5 = adjustTsTimestamp;
                if (100000 + j5 > j) {
                    return new BinarySearchSeeker$TimestampSearchResult(0, -9223372036854775807L, position + i2);
                }
                j4 = i2;
            }
            parsableByteArray.setPosition(i3);
            j3 = i3;
        }
        return j5 != j2 ? new BinarySearchSeeker$TimestampSearchResult(-2, j5, position + j3) : BinarySearchSeeker$TimestampSearchResult.NO_TIMESTAMP_IN_RANGE_RESULT;
    }

    public void setCaptureFps(int i) {
        switch (this.$r8$classId) {
            case 2:
                if (((Media3MuxerImpl$State) this.trees) != Media3MuxerImpl$State.CONFIGURED) {
                    Handlers$$ExternalSyntheticBUOutline0.m((Media3MuxerImpl$State) this.trees, "Muxer is not configured. Current state: ");
                    break;
                } else if (i <= 0) {
                    a$$ExternalSyntheticBUOutline0.m$3("captureFps must be positive");
                    break;
                } else {
                    this.alphabetSize = i;
                    break;
                }
            default:
                if (((MediaMuxerImpl$State) this.trees) != MediaMuxerImpl$State.CONFIGURED) {
                    Handlers$$ExternalSyntheticBUOutline0.m((MediaMuxerImpl$State) this.trees, "Muxer is not configured. Current state: ");
                    break;
                } else if (i <= 0) {
                    a$$ExternalSyntheticBUOutline0.m$1("captureFps must be positive");
                    break;
                } else {
                    this.alphabetSize = i;
                    break;
                }
        }
    }

    public void setOrientationDegrees(int i) {
        switch (this.$r8$classId) {
            case 2:
                if (((Media3MuxerImpl$State) this.trees) != Media3MuxerImpl$State.CONFIGURED) {
                    Handlers$$ExternalSyntheticBUOutline0.m((Media3MuxerImpl$State) this.trees, "Muxer is not configured. Current state: ");
                    break;
                } else {
                    TintInfo tintInfo = (TintInfo) this.codes;
                    tintInfo.getClass();
                    Trace.checkState(!tintInfo.mHasTintMode);
                    ((Mp4Muxer) tintInfo.mTintMode).addMetadataEntry(new Mp4OrientationData(i));
                    break;
                }
            default:
                if (((MediaMuxerImpl$State) this.trees) != MediaMuxerImpl$State.CONFIGURED) {
                    Handlers$$ExternalSyntheticBUOutline0.m((MediaMuxerImpl$State) this.trees, "Muxer is not configured. Current state: ");
                    break;
                } else {
                    MediaMuxer mediaMuxer = (MediaMuxer) this.codes;
                    mediaMuxer.getClass();
                    mediaMuxer.setOrientationHint(i);
                    break;
                }
        }
    }

    public void start() {
        switch (this.$r8$classId) {
            case 2:
                Media3MuxerImpl$State media3MuxerImpl$State = (Media3MuxerImpl$State) this.trees;
                Media3MuxerImpl$State media3MuxerImpl$State2 = Media3MuxerImpl$State.STARTED;
                if (media3MuxerImpl$State == media3MuxerImpl$State2) {
                    return;
                }
                if (media3MuxerImpl$State != Media3MuxerImpl$State.CONFIGURED) {
                    Handlers$$ExternalSyntheticBUOutline0.m((Media3MuxerImpl$State) this.trees, "Muxer is not configured. Current state: ");
                    return;
                }
                try {
                    TintInfo tintInfo = (TintInfo) this.codes;
                    tintInfo.getClass();
                    Trace.checkState(!tintInfo.mHasTintMode);
                    Trace.checkState(!tintInfo.mHasTintList);
                    tintInfo.mHasTintMode = true;
                    this.trees = media3MuxerImpl$State2;
                    return;
                } catch (Exception e) {
                    throw new MuxerException("MediaMuxer operation failed", e);
                }
            default:
                MediaMuxerImpl$State mediaMuxerImpl$State = (MediaMuxerImpl$State) this.trees;
                MediaMuxerImpl$State mediaMuxerImpl$State2 = MediaMuxerImpl$State.STARTED;
                if (mediaMuxerImpl$State == mediaMuxerImpl$State2) {
                    return;
                }
                if (mediaMuxerImpl$State != MediaMuxerImpl$State.CONFIGURED) {
                    Handlers$$ExternalSyntheticBUOutline0.m((MediaMuxerImpl$State) this.trees, "Muxer is not configured. Current state: ");
                    return;
                }
                try {
                    MediaMuxer mediaMuxer = (MediaMuxer) this.codes;
                    mediaMuxer.getClass();
                    mediaMuxer.start();
                    this.trees = mediaMuxerImpl$State2;
                    return;
                } catch (Exception e2) {
                    throw new MuxerException("MediaMuxer operation failed", e2);
                }
        }
    }

    public void stop() {
        switch (this.$r8$classId) {
            case 2:
                Media3MuxerImpl$State media3MuxerImpl$State = (Media3MuxerImpl$State) this.trees;
                Media3MuxerImpl$State media3MuxerImpl$State2 = Media3MuxerImpl$State.STOPPED;
                if (media3MuxerImpl$State == media3MuxerImpl$State2) {
                    return;
                }
                if (media3MuxerImpl$State != Media3MuxerImpl$State.STARTED) {
                    Handlers$$ExternalSyntheticBUOutline0.m((Media3MuxerImpl$State) this.trees, "Muxer is not started. Current state: ");
                    return;
                }
                try {
                    try {
                        TintInfo tintInfo = (TintInfo) this.codes;
                        tintInfo.getClass();
                        Trace.checkState(tintInfo.mHasTintMode);
                        tintInfo.closeMuxer();
                        this.trees = media3MuxerImpl$State2;
                        return;
                    } catch (Exception e) {
                        throw new MuxerException("MediaMuxer operation failed", e);
                    }
                } catch (Throwable th) {
                    this.trees = Media3MuxerImpl$State.STOPPED;
                    throw th;
                }
            default:
                MediaMuxerImpl$State mediaMuxerImpl$State = (MediaMuxerImpl$State) this.trees;
                MediaMuxerImpl$State mediaMuxerImpl$State2 = MediaMuxerImpl$State.STOPPED;
                if (mediaMuxerImpl$State == mediaMuxerImpl$State2) {
                    return;
                }
                try {
                    if (mediaMuxerImpl$State != MediaMuxerImpl$State.STARTED) {
                        Handlers$$ExternalSyntheticBUOutline0.m((MediaMuxerImpl$State) this.trees, "Muxer is not started. Current state: ");
                        return;
                    }
                    try {
                        MediaMuxer mediaMuxer = (MediaMuxer) this.codes;
                        mediaMuxer.getClass();
                        mediaMuxer.stop();
                        this.trees = mediaMuxerImpl$State2;
                        return;
                    } catch (Exception e2) {
                        throw new MuxerException("MediaMuxer operation failed", e2);
                    }
                } catch (Throwable th2) {
                    this.trees = MediaMuxerImpl$State.STOPPED;
                    throw th2;
                }
        }
    }

    public void writeSampleData(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i2 = this.$r8$classId;
        byteBuffer.getClass();
        bufferInfo.getClass();
        switch (i2) {
            case 2:
                if (((Media3MuxerImpl$State) this.trees) == Media3MuxerImpl$State.STARTED) {
                    wrapMuxerException(new Media3MuxerImpl$$ExternalSyntheticLambda1(this, i, byteBuffer, bufferInfo));
                    return;
                } else {
                    Handlers$$ExternalSyntheticBUOutline0.m((Media3MuxerImpl$State) this.trees, "Muxer is not started. Current state: ");
                    return;
                }
            default:
                if (((MediaMuxerImpl$State) this.trees) != MediaMuxerImpl$State.STARTED) {
                    Handlers$$ExternalSyntheticBUOutline0.m((MediaMuxerImpl$State) this.trees, "Muxer is not started. Current state: ");
                    return;
                }
                try {
                    MediaMuxer mediaMuxer = (MediaMuxer) this.codes;
                    mediaMuxer.getClass();
                    mediaMuxer.writeSampleData(i, byteBuffer, bufferInfo);
                    return;
                } catch (Exception e) {
                    throw new MuxerException("MediaMuxer operation failed", e);
                }
        }
    }

    public void zza(String str, Feature feature) {
        int i = this.alphabetSize + 1;
        Object[] objArr = (Object[]) this.codes;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            if (i2 < 0) {
                a$$ExternalSyntheticBUOutline0.m$1((Object) "cannot store more than MAX_VALUE elements");
                return;
            }
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int highestOneBit = Integer.highestOneBit(i2 - 1);
                i3 = highestOneBit + highestOneBit;
            }
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            this.codes = Arrays.copyOf(objArr, i3);
        }
        Object[] objArr2 = (Object[]) this.codes;
        int i4 = this.alphabetSize;
        int i5 = i4 + i4;
        objArr2[i5] = str;
        objArr2[i5 + 1] = feature;
        this.alphabetSize = i4 + 1;
    }

    public void zzb(String str, zap zapVar) {
        Map map = (Map) this.codes;
        if (map.containsKey(str)) {
            a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(str.length() + 59), "LifecycleCallback with tag ", str, " already added to this fragment."));
            return;
        }
        map.put(str, zapVar);
        if (this.alphabetSize > 0) {
            new zao(Looper.getMainLooper(), 2).post(new Fillr.AnonymousClass2(this, zapVar, str, 7));
        }
    }

    public byte[] zze() {
        zzcw zzcwVar;
        ObjectEncoder objectEncoder;
        zzcz zzczVar;
        ObjectEncoder objectEncoder2;
        switch (this.$r8$classId) {
            case 19:
                zzoo zzooVar = zzoo.zza$1;
                e0 e0Var = (e0) this.codes;
                ((RequestQueue) this.trees).mCacheDispatcher = false;
                RequestQueue requestQueue = (RequestQueue) this.trees;
                requestQueue.mDelivery = Boolean.FALSE;
                e0Var.a = new zzmv(requestQueue);
                try {
                    zzoo.zza();
                    zzkw zzkwVar = new zzkw(e0Var);
                    zzah zzahVar = new zzah(8);
                    zzooVar.configure(zzahVar);
                    HashMap hashMap = new HashMap((HashMap) zzahVar.f68zza);
                    HashMap hashMap2 = new HashMap((HashMap) zzahVar.zzb);
                    zzcv zzcvVar = (zzcv) zzahVar.zzc;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        zzcwVar = new zzcw(byteArrayOutputStream, hashMap, hashMap2, zzcvVar);
                        objectEncoder = (ObjectEncoder) hashMap.get(zzkw.class);
                    } catch (IOException unused) {
                    }
                    if (objectEncoder == null) {
                        throw new EncodingException("No encoder for ".concat(String.valueOf(zzkw.class)));
                    }
                    objectEncoder.encode(zzkwVar, zzcwVar);
                    return byteArrayOutputStream.toByteArray();
                } catch (UnsupportedEncodingException e) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
                }
            default:
                zzuo zzuoVar = zzuo.zza$1;
                e0 e0Var2 = (e0) this.codes;
                ((RequestQueue) this.trees).mCacheDispatcher = false;
                RequestQueue requestQueue2 = (RequestQueue) this.trees;
                requestQueue2.mDelivery = Boolean.FALSE;
                e0Var2.a = new zzst(requestQueue2);
                try {
                    zzuo.zza();
                    zzoy zzoyVar = new zzoy(e0Var2);
                    zzdb zzdbVar = new zzdb();
                    zzdbVar.zzc = new HashMap();
                    zzdbVar.zzd = new HashMap();
                    zzdbVar.zze = zzdb.zzb;
                    zzuoVar.configure(zzdbVar);
                    HashMap hashMap3 = new HashMap((HashMap) zzdbVar.zzc);
                    HashMap hashMap4 = new HashMap((HashMap) zzdbVar.zzd);
                    zzcy zzcyVar = (zzcy) zzdbVar.zze;
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        zzczVar = new zzcz(byteArrayOutputStream2, hashMap3, hashMap4, zzcyVar);
                        objectEncoder2 = (ObjectEncoder) hashMap3.get(zzoy.class);
                    } catch (IOException unused2) {
                    }
                    if (objectEncoder2 == null) {
                        throw new EncodingException("No encoder for ".concat(String.valueOf(zzoy.class)));
                    }
                    objectEncoder2.encode(zzoyVar, zzczVar);
                    return byteArrayOutputStream2.toByteArray();
                } catch (UnsupportedEncodingException e2) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e2);
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x000c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zzh(int i, int i2, Intent intent) {
        for (zap zapVar : ((Map) this.codes).values()) {
            AtomicReference atomicReference = zapVar.zab;
            AtomicReference atomicReference2 = zapVar.zab;
            zam zamVar = (zam) atomicReference.get();
            if (i != 1) {
                if (i == 2) {
                    int isGooglePlayServicesAvailable = zapVar.zac.isGooglePlayServicesAvailable(zapVar.getActivity());
                    if (isGooglePlayServicesAvailable == 0) {
                        atomicReference2.set(null);
                        zapVar.zae();
                    } else if (zamVar != null) {
                        if (zamVar.zab.zzb == 18 && isGooglePlayServicesAvailable == 18) {
                        }
                    }
                }
                if (zamVar == null) {
                    ConnectionResult connectionResult = zamVar.zab;
                    int i3 = zamVar.zaa;
                    atomicReference2.set(null);
                    zapVar.zad(connectionResult, i3);
                }
            } else if (i2 == -1) {
                atomicReference2.set(null);
                zapVar.zae();
            } else if (i2 == 0) {
                if (zamVar != null) {
                    ConnectionResult connectionResult2 = new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, zamVar.zab.toString());
                    int i4 = zamVar.zaa;
                    atomicReference2.set(null);
                    zapVar.zad(connectionResult2, i4);
                }
            } else if (zamVar == null) {
            }
        }
    }

    public void zzi(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : ((Map) this.codes).entrySet()) {
            Bundle bundle2 = new Bundle();
            zam zamVar = (zam) ((zap) entry.getValue()).zab.get();
            if (zamVar != null) {
                bundle2.putBoolean("resolving_error", true);
                bundle2.putInt("failed_client_id", zamVar.zaa());
                bundle2.putInt("failed_status", zamVar.zab().zzb);
                bundle2.putParcelable("failed_resolution", zamVar.zab().zzc);
            }
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    public IntervalList$Interval get(int i) {
        if (i < 0 || i >= this.alphabetSize) {
            StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "Index ", ", size ");
            m2m.append(this.alphabetSize);
            InlineClassHelperKt.throwIndexOutOfBoundsException(m2m.toString());
        }
        IntervalList$Interval intervalList$Interval = (IntervalList$Interval) this.trees;
        if (intervalList$Interval != null) {
            int i2 = intervalList$Interval.startIndex;
            if (i < intervalList$Interval.size + i2 && i2 <= i) {
                return intervalList$Interval;
            }
        }
        MutableVector mutableVector = (MutableVector) this.codes;
        IntervalList$Interval intervalList$Interval2 = (IntervalList$Interval) mutableVector.content[LazyLayoutKt.access$binarySearch(i, mutableVector)];
        this.trees = intervalList$Interval2;
        return intervalList$Interval2;
    }

    public void zza(Object obj, String str) {
        int i = this.alphabetSize + 1;
        Object[] objArr = (Object[]) this.codes;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.codes = Arrays.copyOf(objArr, TokenJsonParser.zza(length, i2));
        }
        if (obj != null) {
            Object[] objArr2 = (Object[]) this.codes;
            int i3 = this.alphabetSize;
            int i4 = i3 + i3;
            objArr2[i4] = str;
            objArr2[i4 + 1] = obj;
            this.alphabetSize = i3 + 1;
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$2(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("null value in entry: ", str.toString(), "=null"));
    }

    public HuffmanTreeGroup(e0 e0Var, int i) {
        this.$r8$classId = 19;
        this.trees = new RequestQueue();
        this.codes = e0Var;
        zzoo.zza();
        this.alphabetSize = i;
    }

    public HuffmanTreeGroup(e0 e0Var, int i, byte b) {
        this.$r8$classId = 20;
        this.trees = new RequestQueue();
        this.codes = e0Var;
        zzuo.zza();
        this.alphabetSize = i;
    }

    public HuffmanTreeGroup(SubtreeManager subtreeManager, int i) {
        this.$r8$classId = 18;
        this.trees = new RequestQueue();
        this.codes = subtreeManager;
        zzxb.zza();
        this.alphabetSize = i;
    }

    public HuffmanTreeGroup(String str, String[] strArr) {
        String sb;
        this.$r8$classId = 15;
        if (strArr.length == 0) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            sb = sb2.toString();
        }
        this.trees = sb;
        this.codes = str;
        zzae.checkArgument(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        int i = 2;
        while (i <= 7 && !Log.isLoggable((String) this.codes, i)) {
            i++;
        }
        this.alphabetSize = i;
    }

    public HuffmanTreeGroup(BottomSheet bottomSheet, int i, int i2, BottomSheetHandleConfig bottomSheetHandleConfig) {
        this.$r8$classId = 22;
        bottomSheetHandleConfig.getClass();
        PaintDrawable paintDrawable = new PaintDrawable(i);
        this.codes = paintDrawable;
        Context context = bottomSheet.getContext();
        context.getClass();
        this.trees = new BottomSheetDragHandle(context, bottomSheetHandleConfig);
        float f = i2;
        paintDrawable.setCornerRadii(new float[]{f, f, f, f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE});
        bottomSheet.addOnMoveListener(new PoolGoalMetKt$$ExternalSyntheticLambda6(this, i2, bottomSheet, 19));
    }

    public void zze(Bundle bundle) {
        this.alphabetSize = 1;
        this.trees = bundle;
        for (Map.Entry entry : ((Map) this.codes).entrySet()) {
            ((zap) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public HuffmanTreeGroup(ArrayList arrayList, int i, MotionEvent motionEvent) {
        this.$r8$classId = 7;
        this.codes = arrayList;
        this.alphabetSize = i;
        this.trees = motionEvent;
        if (arrayList.isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m$3("changes cannot be empty");
            throw null;
        }
    }

    public byte[] zze(int i) {
        zzfg zzfgVar;
        ObjectEncoder objectEncoder;
        SubtreeManager subtreeManager = (SubtreeManager) this.codes;
        ((RequestQueue) this.trees).mCacheDispatcher = Boolean.valueOf(1 == (i ^ 1));
        RequestQueue requestQueue = (RequestQueue) this.trees;
        requestQueue.mDelivery = Boolean.FALSE;
        subtreeManager.snapshotCache = new zzvd(requestQueue);
        try {
            zzxb.zza();
            zzxb zzxbVar = zzxb.zza$1;
            if (i == 0) {
                zzrf zzrfVar = new zzrf(subtreeManager);
                JsonDataEncoderBuilder jsonDataEncoderBuilder = new JsonDataEncoderBuilder();
                zzxbVar.configure(jsonDataEncoderBuilder);
                jsonDataEncoderBuilder.ignoreNullValues = true;
                StringWriter stringWriter = new StringWriter();
                try {
                    JsonValueObjectEncoderContext jsonValueObjectEncoderContext = new JsonValueObjectEncoderContext(stringWriter, jsonDataEncoderBuilder.objectEncoders, jsonDataEncoderBuilder.valueEncoders, jsonDataEncoderBuilder.fallbackEncoder, jsonDataEncoderBuilder.ignoreNullValues);
                    jsonValueObjectEncoderContext.add(zzrfVar);
                    jsonValueObjectEncoderContext.maybeUnNest();
                    jsonValueObjectEncoderContext.jsonWriter.flush();
                } catch (IOException unused) {
                }
                return stringWriter.toString().getBytes("utf-8");
            }
            zzrf zzrfVar2 = new zzrf(subtreeManager);
            zzfi zzfiVar = new zzfi(0);
            zzxbVar.configure(zzfiVar);
            HashMap hashMap = new HashMap((HashMap) zzfiVar.zzc);
            HashMap hashMap2 = new HashMap((HashMap) zzfiVar.zzd);
            zzff zzffVar = (zzff) zzfiVar.zze;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                zzfgVar = new zzfg(byteArrayOutputStream, hashMap, hashMap2, zzffVar);
                objectEncoder = (ObjectEncoder) hashMap.get(zzrf.class);
            } catch (IOException unused2) {
            }
            if (objectEncoder != null) {
                objectEncoder.encode(zzrfVar2, zzfgVar);
                return byteArrayOutputStream.toByteArray();
            }
            throw new EncodingException("No encoder for ".concat(String.valueOf(zzrf.class)));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    public /* synthetic */ HuffmanTreeGroup(int i, boolean z) {
        this.$r8$classId = i;
    }

    public HuffmanTreeGroup(Id3Peeker$$ExternalSyntheticBUOutline0 id3Peeker$$ExternalSyntheticBUOutline0) {
        this.$r8$classId = 8;
        this.codes = new SparseArray();
        this.trees = id3Peeker$$ExternalSyntheticBUOutline0;
        this.alphabetSize = -1;
    }

    public HuffmanTreeGroup(int i, TimestampAdjuster timestampAdjuster) {
        this.$r8$classId = 9;
        this.alphabetSize = i;
        this.codes = timestampAdjuster;
        this.trees = new ParsableByteArray();
    }

    public HuffmanTreeGroup(int i, Context context, CoroutineContext coroutineContext) {
        this.$r8$classId = 23;
        this.alphabetSize = i;
        this.codes = coroutineContext;
        this.trees = LazyKt.lazy(new CameraX$$ExternalSyntheticLambda0(context, 15));
    }

    public HuffmanTreeGroup(GLLauncher gLLauncher) {
        this.$r8$classId = 21;
        gLLauncher.getClass();
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(Boolean.FALSE);
        this.codes = MutableStateFlow;
        this.trees = FlowKt.asStateFlow(MutableStateFlow);
        gLLauncher.launch(new Pager$pageFetcher$2(this, null, 6));
    }

    public HuffmanTreeGroup(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 11:
                this.codes = new FlattenedPageEventStorage();
                this.trees = new MutexImpl();
                this.alphabetSize = -1;
                break;
            case 14:
                this.codes = Collections.synchronizedMap(new ArrayMap(0));
                this.alphabetSize = 0;
                break;
            case 16:
                this.codes = new Object[8];
                this.alphabetSize = 0;
                break;
            case 24:
                Object[] objArr = new Object[5];
                this.codes = objArr;
                this.trees = objArr;
                break;
            default:
                this.codes = new MutableVector(0, new IntervalList$Interval[16]);
                break;
        }
    }

    public HuffmanTreeGroup(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.$r8$classId = 10;
        this.alphabetSize = i2;
        if (arrayList == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.codes = unmodifiableList;
        this.trees = bArr;
    }

    public HuffmanTreeGroup(ViewConfiguration viewConfiguration) {
        this.$r8$classId = 6;
        this.codes = viewConfiguration;
    }

    public HuffmanTreeGroup(ViewTargetDisposable viewTargetDisposable) {
        this.$r8$classId = 13;
        this.trees = FactoryPools.threadSafe(150, new n.b(this, 6));
        this.codes = viewTargetDisposable;
    }
}
