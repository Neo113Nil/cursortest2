package com.stripe.android.uicore.elements;

import android.view.KeyEvent;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.key.KeyEventType;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletHomeViewEvent;
import com.stripe.android.uicore.FocusManagerKtKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes8.dex */
public final class TextFieldUIKt$onPreviewKeyEvent$1 implements Function1 {

    /* renamed from: $$v$c$androidx-compose-ui-focus-FocusDirection$-direction$0, reason: not valid java name */
    public final /* synthetic */ int f827$$v$c$androidxcomposeuifocusFocusDirection$direction$0;
    public final /* synthetic */ Object $focusManager;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $value;

    public /* synthetic */ TextFieldUIKt$onPreviewKeyEvent$1(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.$value = obj;
        this.$focusManager = obj2;
        this.f827$$v$c$androidxcomposeuifocusFocusDirection$direction$0 = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.$r8$classId;
        int i2 = this.f827$$v$c$androidxcomposeuifocusFocusDirection$direction$0;
        Object obj2 = this.$focusManager;
        Object obj3 = this.$value;
        switch (i) {
            case 0:
                KeyEvent keyEvent = ((androidx.compose.ui.input.key.KeyEvent) obj).nativeKeyEvent;
                keyEvent.getClass();
                if (KeyEventType.m790getTypeZmokQxo(keyEvent) == 2 && keyEvent.getKeyCode() == 67 && ((String) obj3).length() == 0) {
                    FocusManagerKtKt.m4065moveFocusSafelyMxy_nc0((FocusOwnerImpl) obj2, i2);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                long j = ((Offset) obj).packedValue;
                ((Function1) obj3).invoke(new AfterpayAppletHomeViewEvent.CardClicked(((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection) ((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent) obj2)).content, i2));
                return Unit.INSTANCE;
        }
    }
}
