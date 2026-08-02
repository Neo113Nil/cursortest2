package com.withpersona.sdk2.camera.analyzers;

import android.graphics.Rect;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.tasks.zzw;
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.TextRecognizer;
import com.google.mlkit.vision.text.internal.zzn;
import com.stripe.hcaptcha.encode.EncodeKt$$ExternalSyntheticLambda0;
import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.camera.BarcodeInfo;
import com.withpersona.sdk2.camera.ImageToAnalyzeKt$toImageToAnalyze$1;
import com.withpersona.sdk2.camera.MrzExtraction;
import com.withpersona.sdk2.camera.analyzers.AnalysisData;
import com.withpersona.sdk2.camera.analyzers.AnalysisError;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.MatchResult;
import kotlin.text.MatcherMatchResult;
import kotlin.text.MatcherMatchResult$groupValues$1;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes5.dex */
public final class MrzAnalyzer implements ComposableImageAnalyzer {
    public final Lazy textDetector$delegate = LazyKt.lazy(new ShimmerThemeKt$$ExternalSyntheticLambda0(9));

    @Override // com.withpersona.sdk2.camera.analyzers.ComposableImageAnalyzer
    /* renamed from: analyze-0E7RQCE */
    public final Object mo4089analyze0E7RQCE(ImageToAnalyzeKt$toImageToAnalyze$1 imageToAnalyzeKt$toImageToAnalyze$1, Rect rect, ContinuationImpl continuationImpl) {
        String replace;
        MatcherMatchResult find;
        MatcherMatchResult find2;
        List split$default;
        MrzExtraction mrzExtraction;
        MrzExtraction mrzExtraction2;
        MatcherMatchResult find3;
        zzw processBase = ((zzn) ((TextRecognizer) this.textDetector$delegate.getValue())).processBase(imageToAnalyzeKt$toImageToAnalyze$1.getInputImage());
        processBase.getClass();
        try {
            String str = ((Text) processBase.getResult()).zzb;
            str.getClass();
            boolean equals = str.equals("");
            AnalysisData.Empty empty = AnalysisData.Empty.INSTANCE;
            if (equals) {
                Result.Companion companion = Result.Companion;
                return empty;
            }
            Regex regex = MrzExtraction.TD1_LINE1;
            replace = new Regex("([\r\t ])").replace(str, "");
            Locale locale = Locale.getDefault();
            locale.getClass();
            String upperCase = replace.toUpperCase(locale);
            upperCase.getClass();
            MatcherMatchResult find4 = MrzExtraction.TD1_LINE1.find(upperCase);
            if (find4 == null || (find = MrzExtraction.TD1_LINE2.find(upperCase)) == null || (find2 = MrzExtraction.TD1_LINE3.find(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(upperCase, find4.getValue(), ""), find.getValue(), ""))) == null) {
                mrzExtraction = null;
            } else {
                String obj = StringsKt.trim(find2.getValue()).toString();
                int length = obj.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = obj.charAt(!z ? i : length) == '<';
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length--;
                    } else if (z2) {
                        i++;
                    } else {
                        z = true;
                    }
                }
                split$default = StringsKt__StringsKt.split$default(obj.subSequence(i, length + 1).toString(), new String[]{"<<"}, false, 0, 6, null);
                mrzExtraction = new MrzExtraction(CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new MatchResult[]{find4, find, find2}), "\n", null, null, 0, null, new EncodeKt$$ExternalSyntheticLambda0(21), 30), CameraUpdateFactory.cleanName((String) CollectionsKt.getOrNull(1, split$default)), CameraUpdateFactory.cleanName((String) CollectionsKt.getOrNull(0, split$default)), (String) ((MatcherMatchResult$groupValues$1) find.getGroupValues()).get(3), (String) ((MatcherMatchResult$groupValues$1) find4.getGroupValues()).get(3), CameraUpdateFactory.cleanDate((String) ((MatcherMatchResult$groupValues$1) find.getGroupValues()).get(4)), CameraUpdateFactory.cleanDate((String) ((MatcherMatchResult$groupValues$1) find.getGroupValues()).get(1)), (String) ((MatcherMatchResult$groupValues$1) find4.getGroupValues()).get(2));
            }
            if (mrzExtraction == null) {
                MatcherMatchResult find5 = MrzExtraction.TD3_LINE1.find(upperCase);
                mrzExtraction2 = (find5 == null || (find3 = MrzExtraction.TD3_LINE2.find(upperCase)) == null) ? null : new MrzExtraction(CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new MatchResult[]{find5, find3}), "\n", null, null, 0, null, new EncodeKt$$ExternalSyntheticLambda0(20), 30), CameraUpdateFactory.cleanName((String) ((MatcherMatchResult$groupValues$1) find5.getGroupValues()).get(4)), CameraUpdateFactory.cleanName((String) ((MatcherMatchResult$groupValues$1) find5.getGroupValues()).get(3)), (String) ((MatcherMatchResult$groupValues$1) find3.getGroupValues()).get(6), (String) ((MatcherMatchResult$groupValues$1) find3.getGroupValues()).get(1), CameraUpdateFactory.cleanDate((String) ((MatcherMatchResult$groupValues$1) find3.getGroupValues()).get(7)), CameraUpdateFactory.cleanDate((String) ((MatcherMatchResult$groupValues$1) find3.getGroupValues()).get(4)), (String) ((MatcherMatchResult$groupValues$1) find5.getGroupValues()).get(2));
            } else {
                mrzExtraction2 = mrzExtraction;
            }
            if (mrzExtraction2 == null) {
                Result.Companion companion2 = Result.Companion;
                return empty;
            }
            Result.Companion companion3 = Result.Companion;
            return new AnalysisData.BarcodeAnalysisData(new BarcodeInfo.MrzBarcodeInfo(mrzExtraction2.rawText, mrzExtraction2.identificationNumber, mrzExtraction2.birthdate, mrzExtraction2.expirationDate));
        } catch (ExecutionException unused) {
            Result.Companion companion4 = Result.Companion;
            return new Result.Failure(new AnalysisError.GooglePlayError());
        }
    }
}
