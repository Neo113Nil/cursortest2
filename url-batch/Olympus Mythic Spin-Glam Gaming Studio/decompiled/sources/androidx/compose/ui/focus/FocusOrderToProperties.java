package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FocusOrderModifier.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/focus/FocusOrderToProperties;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusProperties;", "", "focusProperties", "invoke", "(Landroidx/compose/ui/focus/FocusProperties;)V", "Landroidx/compose/ui/focus/FocusOrder;", "focusOrderReceiver", "Lkotlin/jvm/functions/Function1;", "getFocusOrderReceiver", "()Lkotlin/jvm/functions/Function1;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FocusOrderToProperties implements Function1 {
    private final Function1 focusOrderReceiver;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((FocusProperties) obj);
        return Unit.INSTANCE;
    }

    public void invoke(FocusProperties focusProperties) {
        Intrinsics.checkNotNullParameter(focusProperties, "focusProperties");
        this.focusOrderReceiver.invoke(new FocusOrder(focusProperties));
    }
}
