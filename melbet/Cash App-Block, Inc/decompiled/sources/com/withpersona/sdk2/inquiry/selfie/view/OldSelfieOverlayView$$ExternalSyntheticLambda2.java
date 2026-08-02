package com.withpersona.sdk2.inquiry.selfie.view;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieOnCompositionLoadedListener;
import com.miteksystems.misnap.workflow.a.o;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidReviewBinding;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public final /* synthetic */ class OldSelfieOverlayView$$ExternalSyntheticLambda2 implements LottieOnCompositionLoadedListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ OldSelfieOverlayView$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.airbnb.lottie.LottieOnCompositionLoadedListener
    public final void onCompositionLoaded(LottieComposition lottieComposition) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ArrayList arrayList = ((OldSelfieOverlayView) obj).oneShotOnCompositionLoadedListeners;
                List list = CollectionsKt.toList(arrayList);
                arrayList.clear();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                break;
            case 1:
                ((Pi2GovernmentidReviewBinding) obj).overlayIcon.setProgress(1.0f);
                break;
            case 2:
                ThemeableLottieAnimationView.$r8$lambda$GE0bdkpbO_TbMgGLiBqAl0dRWW8((ThemeableLottieAnimationView) obj);
                break;
            default:
                ((ThemeableLottieAnimationView) ((o) obj).c).playAnimation();
                break;
        }
    }
}
