package com.withpersona.sdk2.camera.analyzers;

import android.graphics.Rect;
import android.media.Image;
import android.util.Size;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.camera.ExtractedTexts;
import com.withpersona.sdk2.camera.ImageLightCondition;
import com.withpersona.sdk2.camera.ImageToAnalyzeKt$toImageToAnalyze$1;
import com.withpersona.sdk2.camera.ParsedIdSideOrNone;
import com.withpersona.sdk2.camera.analyzers.AnalysisData;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.nio.ByteBuffer;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class FrontOrBackAnalyzer implements ComposableImageAnalyzer {
    public final /* synthetic */ int $r8$classId;
    public final Object analyzers;

    public FrontOrBackAnalyzer(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 2:
                try {
                    Class.forName("com.withpersona.sdk2.inquiry.extraction.impl.TextEntityExtractorImpl").newInstance().getClass();
                    throw new ClassCastException();
                } catch (ClassNotFoundException unused) {
                    this.analyzers = new HashMap();
                    return;
                }
            default:
                this.analyzers = new byte[32768];
                new Size(0, 0);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0044  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:123:0x0289 -> B:106:0x0290). Please report as a decompilation issue!!! */
    @Override // com.withpersona.sdk2.camera.analyzers.ComposableImageAnalyzer
    /* renamed from: analyze-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo4089analyze0E7RQCE(ImageToAnalyzeKt$toImageToAnalyze$1 imageToAnalyzeKt$toImageToAnalyze$1, Rect rect, ContinuationImpl continuationImpl) {
        FrontOrBackAnalyzer$analyze$1 frontOrBackAnalyzer$analyze$1;
        int i;
        Iterator it;
        Ref$ObjectRef ref$ObjectRef;
        Rect rect2;
        Image.Plane plane;
        int i2;
        TextExtractionAnalyzer$analyze$1 textExtractionAnalyzer$analyze$1;
        int i3;
        Result result;
        AnalysisData analysisData;
        boolean z;
        Date date;
        Object[] objArr;
        ImageToAnalyzeKt$toImageToAnalyze$1 imageToAnalyzeKt$toImageToAnalyze$12 = imageToAnalyzeKt$toImageToAnalyze$1;
        int i4 = this.$r8$classId;
        Object obj = this.analyzers;
        AnalysisData.Empty empty = AnalysisData.Empty.INSTANCE;
        ImageLightCondition imageLightCondition = null;
        Date date2 = null;
        imageLightCondition = null;
        imageLightCondition = null;
        switch (i4) {
            case 0:
                if (continuationImpl instanceof FrontOrBackAnalyzer$analyze$1) {
                    frontOrBackAnalyzer$analyze$1 = (FrontOrBackAnalyzer$analyze$1) continuationImpl;
                    int i5 = frontOrBackAnalyzer$analyze$1.label;
                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                        frontOrBackAnalyzer$analyze$1.label = i5 - PKIFailureInfo.systemUnavail;
                        Object obj2 = frontOrBackAnalyzer$analyze$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = frontOrBackAnalyzer$analyze$1.label;
                        if (i != 0) {
                            Ref$ObjectRef m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(obj2);
                            it = ((Map) obj).entrySet().iterator();
                            ref$ObjectRef = m;
                            rect2 = rect;
                            if (it.hasNext()) {
                            }
                        } else if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            ParsedIdSideOrNone.Side side = frontOrBackAnalyzer$analyze$1.L$4;
                            it = frontOrBackAnalyzer$analyze$1.L$3;
                            ref$ObjectRef = frontOrBackAnalyzer$analyze$1.L$2;
                            Rect rect3 = frontOrBackAnalyzer$analyze$1.L$1;
                            ImageToAnalyzeKt$toImageToAnalyze$1 imageToAnalyzeKt$toImageToAnalyze$13 = frontOrBackAnalyzer$analyze$1.L$0;
                            SafeTrace.throwOnFailure(obj2);
                            Object obj3 = ((Result) obj2).value;
                            Result.Companion companion = Result.Companion;
                            if (!(obj3 instanceof Result.Failure)) {
                                AnalysisData analysisData2 = (AnalysisData) obj3;
                                if (!Intrinsics.areEqual(analysisData2, empty)) {
                                    break;
                                }
                            }
                            Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj3);
                            if (m4120exceptionOrNullimpl != null && ref$ObjectRef.element == null) {
                                ref$ObjectRef.element = m4120exceptionOrNullimpl;
                            }
                            rect2 = rect3;
                            imageToAnalyzeKt$toImageToAnalyze$12 = imageToAnalyzeKt$toImageToAnalyze$13;
                            if (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                ComposableImageAnalyzer composableImageAnalyzer = (ComposableImageAnalyzer) entry.getKey();
                                ParsedIdSideOrNone.Side side2 = (ParsedIdSideOrNone.Side) entry.getValue();
                                frontOrBackAnalyzer$analyze$1.L$0 = imageToAnalyzeKt$toImageToAnalyze$12;
                                frontOrBackAnalyzer$analyze$1.L$1 = rect2;
                                frontOrBackAnalyzer$analyze$1.L$2 = ref$ObjectRef;
                                frontOrBackAnalyzer$analyze$1.L$3 = it;
                                frontOrBackAnalyzer$analyze$1.L$4 = side2;
                                frontOrBackAnalyzer$analyze$1.label = 1;
                                Object mo4089analyze0E7RQCE = composableImageAnalyzer.mo4089analyze0E7RQCE(imageToAnalyzeKt$toImageToAnalyze$12, rect2, frontOrBackAnalyzer$analyze$1);
                                if (mo4089analyze0E7RQCE == coroutineSingletons) {
                                    break;
                                } else {
                                    rect3 = rect2;
                                    obj3 = mo4089analyze0E7RQCE;
                                    imageToAnalyzeKt$toImageToAnalyze$13 = imageToAnalyzeKt$toImageToAnalyze$12;
                                    side = side2;
                                    Result.Companion companion2 = Result.Companion;
                                    if (!(obj3 instanceof Result.Failure)) {
                                    }
                                    Throwable m4120exceptionOrNullimpl2 = Result.m4120exceptionOrNullimpl(obj3);
                                    if (m4120exceptionOrNullimpl2 != null) {
                                        ref$ObjectRef.element = m4120exceptionOrNullimpl2;
                                    }
                                    rect2 = rect3;
                                    imageToAnalyzeKt$toImageToAnalyze$12 = imageToAnalyzeKt$toImageToAnalyze$13;
                                    if (it.hasNext()) {
                                        Throwable th = (Throwable) ref$ObjectRef.element;
                                        if (th == null) {
                                            Result.Companion companion3 = Result.Companion;
                                            break;
                                        } else {
                                            Result.Companion companion4 = Result.Companion;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                frontOrBackAnalyzer$analyze$1 = new FrontOrBackAnalyzer$analyze$1(this, continuationImpl);
                Object obj22 = frontOrBackAnalyzer$analyze$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = frontOrBackAnalyzer$analyze$1.label;
                if (i != 0) {
                }
            case 1:
                int width = imageToAnalyzeKt$toImageToAnalyze$12.image.getWidth();
                Image image = imageToAnalyzeKt$toImageToAnalyze$12.image;
                int height = image.getHeight();
                Image.Plane[] planes = image.getPlanes();
                if (planes != null && (plane = planes[0]) != null) {
                    Rect rect4 = rect == null ? new Rect(0, 0, width, height) : rect;
                    ByteBuffer buffer = plane.getBuffer();
                    buffer.getClass();
                    byte[] bArr = (byte[]) obj;
                    if (width != 0 && height != 0) {
                        long[] jArr = new long[256];
                        buffer.rewind();
                        int height2 = rect4.height() * rect4.width();
                        int width2 = rect4.width();
                        if (width2 <= 32768) {
                            int i6 = rect4.top;
                            int i7 = rect4.bottom;
                            long j = 0;
                            while (i6 < i7) {
                                buffer.position((i6 * width) + rect4.left);
                                buffer.get(bArr, r5, width2);
                                int i8 = r5;
                                while (i8 < width2) {
                                    int i9 = bArr[i8] & 255;
                                    j += i9;
                                    jArr[i9] = jArr[i9] + 1;
                                    i8++;
                                    width2 = width2;
                                }
                                i6++;
                                r5 = 0;
                            }
                            double d = height2;
                            double d2 = j / d;
                            int i10 = (int) d2;
                            int height3 = rect4.height() * rect4.width();
                            int width3 = rect4.width();
                            int i11 = rect4.top;
                            int i12 = rect4.bottom;
                            long j2 = 0;
                            while (i11 < i12) {
                                int i13 = width;
                                buffer.position((i11 * width) + rect4.left);
                                buffer.get(bArr, 0, width3);
                                int i14 = 0;
                                while (i14 < width3) {
                                    int i15 = (bArr[i14] & 255) - i10;
                                    j2 += i15 * i15;
                                    i14++;
                                    i10 = i10;
                                    buffer = buffer;
                                }
                                i11++;
                                width = i13;
                            }
                            double sqrt = Math.sqrt(j2 / height3) / 128.0d;
                            double floor = Math.floor(0.01d * d);
                            double floor2 = Math.floor(0.99d * d);
                            int i16 = 0;
                            long j3 = 0;
                            while (true) {
                                if (i16 < 256) {
                                    j3 += jArr[i16];
                                    if (j3 <= floor) {
                                        i16++;
                                    }
                                } else {
                                    i16 = 0;
                                }
                            }
                            double d3 = d - floor2;
                            long j4 = 0;
                            int i17 = 255;
                            while (true) {
                                int i18 = i17 - 1;
                                j4 += jArr[i17];
                                if (j4 > d3) {
                                    i2 = i17;
                                } else if (i18 < 0) {
                                    i2 = 0;
                                } else {
                                    i17 = i18;
                                }
                            }
                            imageLightCondition = new ImageLightCondition(d2 / 255.0d, sqrt, (i2 - i16) / 255.0d, height2);
                        }
                    }
                    if (imageLightCondition != null) {
                        Result.Companion companion5 = Result.Companion;
                        break;
                    } else {
                        Result.Companion companion6 = Result.Companion;
                        break;
                    }
                } else {
                    Result.Companion companion7 = Result.Companion;
                    break;
                }
            default:
                HashMap hashMap = (HashMap) obj;
                if (continuationImpl instanceof TextExtractionAnalyzer$analyze$1) {
                    textExtractionAnalyzer$analyze$1 = (TextExtractionAnalyzer$analyze$1) continuationImpl;
                    int i19 = textExtractionAnalyzer$analyze$1.label;
                    if ((i19 & PKIFailureInfo.systemUnavail) != 0) {
                        textExtractionAnalyzer$analyze$1.label = i19 - PKIFailureInfo.systemUnavail;
                        Object obj4 = textExtractionAnalyzer$analyze$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = textExtractionAnalyzer$analyze$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj4);
                            result = null;
                        } else if (i3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj4);
                            result = (Result) obj4;
                        }
                        if (result == null) {
                            Object obj5 = result.value;
                            if (obj5 instanceof Result.Failure) {
                                obj5 = null;
                            }
                            analysisData = (AnalysisData) obj5;
                        } else {
                            analysisData = null;
                        }
                        z = analysisData instanceof AnalysisData.TextExtractionData;
                        if (z) {
                            date = null;
                        } else {
                            ExtractedTexts extractedTexts = ((AnalysisData.TextExtractionData) analysisData).extractedTexts;
                            date2 = extractedTexts.dateOfBirth;
                            date = extractedTexts.expirationDate;
                        }
                        if (date2 != null && date != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(date2);
                            sb.append(date);
                            String sb2 = sb.toString();
                            Integer num = (Integer) hashMap.get(sb2);
                            hashMap.put(sb2, new Integer((num == null ? num.intValue() : 0) + 1));
                        }
                        objArr = date2 == null && date != null;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(date2);
                        sb3.append(date);
                        Integer num2 = (Integer) hashMap.get(sb3.toString());
                        r5 = (num2 == null ? num2.intValue() : -1) >= 3 ? 1 : 0;
                        if (objArr != true && r5 != 0) {
                            Result.Companion companion8 = Result.Companion;
                            date2.getClass();
                            date.getClass();
                            break;
                        } else if (!z) {
                            Result.Companion companion9 = Result.Companion;
                            break;
                        } else if (result == null) {
                            Result.Companion companion10 = Result.Companion;
                            break;
                        } else {
                            break;
                        }
                    }
                }
                textExtractionAnalyzer$analyze$1 = new TextExtractionAnalyzer$analyze$1(this, continuationImpl);
                Object obj42 = textExtractionAnalyzer$analyze$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = textExtractionAnalyzer$analyze$1.label;
                if (i3 != 0) {
                }
                if (result == null) {
                }
                z = analysisData instanceof AnalysisData.TextExtractionData;
                if (z) {
                }
                if (date2 != null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(date2);
                    sb4.append(date);
                    String sb22 = sb4.toString();
                    Integer num3 = (Integer) hashMap.get(sb22);
                    hashMap.put(sb22, new Integer((num3 == null ? num3.intValue() : 0) + 1));
                }
                if (date2 == null) {
                }
                StringBuilder sb32 = new StringBuilder();
                sb32.append(date2);
                sb32.append(date);
                Integer num22 = (Integer) hashMap.get(sb32.toString());
                if ((num22 == null ? num22.intValue() : -1) >= 3) {
                }
                if (objArr != true) {
                }
                if (!z) {
                }
        }
        return empty;
    }

    public FrontOrBackAnalyzer(IdFrontAnalyzer idFrontAnalyzer, BarcodePdf417Analyzer barcodePdf417Analyzer) {
        this.$r8$classId = 0;
        this.analyzers = MapsKt__MapsKt.mapOf(new Pair(barcodePdf417Analyzer, ParsedIdSideOrNone.Side.Back), new Pair(idFrontAnalyzer, ParsedIdSideOrNone.Side.Front));
    }
}
