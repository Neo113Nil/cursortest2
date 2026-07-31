package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: SelectionAdjustment.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
/* synthetic */ class SelectionAdjustment$Companion$Paragraph$1$adjust$boundaryFun$1 extends FunctionReferenceImpl implements Function1 {
    SelectionAdjustment$Companion$Paragraph$1$adjust$boundaryFun$1(Object obj) {
        super(1, obj, StringHelpersKt.class, "getParagraphBoundary", "getParagraphBoundary(Ljava/lang/CharSequence;I)J", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return TextRange.m2237boximpl(m624invokejx7JFs(((Number) obj).intValue()));
    }

    /* renamed from: invoke--jx7JFs, reason: not valid java name */
    public final long m624invokejx7JFs(int i) {
        return StringHelpersKt.getParagraphBoundary((CharSequence) this.receiver, i);
    }
}
