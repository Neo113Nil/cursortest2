package com.withpersona.sdk2.inquiry.document;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.PickVisualMediaRequestKt;
import com.fillr.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public final /* synthetic */ class DocumentsSelectWorker$Factory$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ n f$0;

    public /* synthetic */ DocumentsSelectWorker$Factory$$ExternalSyntheticLambda0(n nVar, int i) {
        this.$r8$classId = i;
        this.f$0 = nVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        n nVar = this.f$0;
        switch (i) {
            case 0:
                ((ActivityResultLauncher) nVar.a).launch(new String[]{"image/*", "application/pdf"});
                break;
            default:
                ((ActivityResultLauncher) nVar.b).launch(PickVisualMediaRequestKt.PickVisualMediaRequest$default());
                break;
        }
        return Unit.INSTANCE;
    }
}
