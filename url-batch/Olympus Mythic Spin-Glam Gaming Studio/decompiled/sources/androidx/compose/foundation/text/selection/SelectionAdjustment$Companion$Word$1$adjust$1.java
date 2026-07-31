package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: SelectionAdjustment.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
/* synthetic */ class SelectionAdjustment$Companion$Word$1$adjust$1 extends FunctionReferenceImpl implements Function1 {
    SelectionAdjustment$Companion$Word$1$adjust$1(Object obj) {
        super(1, obj, TextLayoutResult.class, "getWordBoundary", "getWordBoundary--jx7JFs(I)J", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return TextRange.m2237boximpl(m625invokejx7JFs(((Number) obj).intValue()));
    }

    /* renamed from: invoke--jx7JFs, reason: not valid java name */
    public final long m625invokejx7JFs(int i) {
        return ((TextLayoutResult) this.receiver).m2236getWordBoundaryjx7JFs(i);
    }
}
