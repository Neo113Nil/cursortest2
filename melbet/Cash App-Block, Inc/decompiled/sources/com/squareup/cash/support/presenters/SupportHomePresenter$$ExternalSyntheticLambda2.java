package com.squareup.cash.support.presenters;

import androidx.media3.extractor.heif.HeifSniffer;
import com.squareup.cash.activity.backend.loader.RealActivityTokenFactory;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final /* synthetic */ class SupportHomePresenter$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealActivityTokenFactory f$0;

    public /* synthetic */ SupportHomePresenter$$ExternalSyntheticLambda2(RealActivityTokenFactory realActivityTokenFactory, int i) {
        this.$r8$classId = i;
        this.f$0 = realActivityTokenFactory;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        RealActivityTokenFactory realActivityTokenFactory = this.f$0;
        switch (i) {
        }
        return HeifSniffer.supportActivityContext(realActivityTokenFactory);
    }
}
